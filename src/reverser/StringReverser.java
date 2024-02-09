package reverser;

import java.util.Scanner;

public class StringReverser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;
        
        while (continuar) {
            System.out.print("Digite uma string para inverter: ");
            String originalString = scanner.nextLine();
            String reversedString = reverseString(originalString);
            System.out.println("String invertida: " + reversedString);

            System.out.println("Pressione Enter para fazer outra consulta ou digite 'sair' para fechar o programa:");
            String entrada = scanner.nextLine();
            if (entrada.equalsIgnoreCase("sair")) {
                continuar = false;
            }
        }
        
        System.out.println("Programa encerrado.");
        scanner.close();
    }

    public static String reverseString(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }
}
