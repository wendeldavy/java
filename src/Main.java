import java.lang.String;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String nome = "Wendel Davy Pereira da Silva";
        String tipoConta = "Corrente";
        double saldo = 2500.00;
        int opcao = 0;


        System.out.println("**********************************");
        System.out.println("\nNome do cliente: " + nome);
        System.out.println("Tipo de Conta: " + tipoConta);
        System.out.println("Saldo Inicial: " + "R$ " + saldo);
        System.out.println("\n*********************************");
        System.out.println("\nOPERAÇÕES ");


        String menu = """
                \n*** Digite uma opção***
                1 - Consultar Saldo
                2 - Trasferir Valor
                3 - Receber Valor
                4 - Sair
             
                """;
        Scanner leitura = new Scanner(System.in);


        while (opcao != 4) {
            System.out.println(menu);
            opcao = leitura.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("\nSeu saldo atual é R$" + saldo);
                    break;

                case 2:
                    System.out.println("Qual o valor da transferencia ");
                    double valorTransferir = leitura.nextDouble();

                    if (valorTransferir > saldo) {
                        System.out.println("Saldo Insuficiente ");

                    } else {
                        saldo -= valorTransferir;
                        System.out.println("\nTransferencia realizada ");
                        System.out.println("\nSaldo atualizado R$ " + saldo);

                    }

                    break;

                case 3:
                    System.out.println("Qual valor você vai receber? ");
                    double valorReceber = leitura.nextDouble();

                    saldo = saldo + valorReceber;

                    System.out.println("Deposito realizado ");
                    System.out.println("Saldo atualizado R$ " + saldo);
                    break;


                case 4:
                    System.out.println("Saindo ");
                    break;


                default:
                    System.out.println("Digite entre 1 e 4: ");


            }




        }

        leitura.close();

    }
}