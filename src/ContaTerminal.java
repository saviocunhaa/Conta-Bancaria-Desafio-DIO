import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o número da Agência!");
        int numero = scanner.nextInt();
        System.out.println("Por favor, digite o sua Agência!");
        String agencia = scanner.next();
        System.out.println("Por favor, digite o nome completo!");
        String nomeCliente = scanner.next();
        double saldo = 588.95;


        System.out.println("Olá, " + nomeCliente + " obrigado por criar uma conta em nosso banco, " +
                "sua agência é "+ agencia +" conta "+ numero + " e seu " +
                "saldo " + saldo + " já está disponível para saque");

    }
}