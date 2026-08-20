import java.util.Scanner;

public class CadastroAlunos {

public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos alunos serão cadastrados? ");
        int totalAlunos = scanner.nextInt();

        String[] nomes = new String[totalAlunos];
        double[] medias = new double[totalAlunos];

        for (int i = 0; i < totalAlunos; i++) {
            System.out.println("\n--- Aluno " + (i + 1) + " ---");

            scanner.nextLine();
            System.out.print("Nome do aluno: ");
            nomes[i] = scanner.nextLine();

            double nota1, nota2, nota3;

            System.out.print("Nota 1: ");
            nota1 = scanner.nextDouble();

            System.out.print("Nota 2: ");
            nota2 = scanner.nextDouble();

            System.out.print("Nota 3: ");
            nota3 = scanner.nextDouble();

            medias[i] = (nota1 + nota2 + nota3) / 3;
        }

        System.out.println("\n===== LISTA DE ALUNOS =====");
        for (int i = 0; i < totalAlunos; i++) {
            System.out.printf("%s - Média: %.2f%n", nomes[i], medias[i]);
        }

        scanner.close();
    }
}
