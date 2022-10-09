import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       //Faça um Programa que peça um número
       Scanner sc = new Scanner(System.in);
       System.out.println("Digite um número: ");
       double num = sc.nextDouble();
       sc.close();
       //mostre a mensagem O número informado foi [número].
       System.out.println("O número informado foi: " +num);
    }
}
