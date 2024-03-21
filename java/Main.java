import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String questao = "qual o objeto mais importante de um computador?";
        System.out.println(questao);
        System.out.println("[A] cpu");
        System.out.println("[B] gpu");
        System.out.println("[C] ram");
        System.out.println("[D] ssd");
        System.out.println("[E] teclado");

        System.out.println("Digite sua Resposta: ");

        String resposta = scanner.nextLine();

        if (resposta.equalsIgnoreCase("A")) {
            System.out.println("Resposta Correta!");
        } else {
            System.out.println("Resposta Errada! Tente Novamente");
        }

        scanner.close();
    }
}