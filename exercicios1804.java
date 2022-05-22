package JavaProjectAvaliacao;

import java.util.Scanner;

public class exercicios1804 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		// Variavel de inteiros 
		int n, n1, n2;
		// Dados de informacao e alternativas de escolha para o usuario
		System.out.printf("Voce foi aprovado no exame psicotecnico? Digite 1 para sim e 0 para nao!\n");
		// Receber e guardar numero na variavel
		n = ler.nextInt();
		// Comando de decisao para determinar um valor
		if (n == 0) {
			// Exibir ao usuario a frase 
			System.out.printf("Voce nao esta apto a ter habilitacao!");
		// Comando de decisao caso o valor for false	
		} else if (n == 1) {
			// Dados de informacao e alternativas de escolha para o usuario
			System.out.printf("Voce foi aprovado no exame de legislacao? Digite 1 para sim e 0 para nao!\n");
			// Guardar numero na variavel
			n1 = ler.nextInt();
			
            // Comando de decisao determinar um valor true
			if (n1 == 0) {
				// Exibir frase caso o valor for true
				System.out.printf("Voce nao esta apto a ter habilitacao!");
				
			// Comando de contra decisao caso o valor for false
			} else {
				// Dados de informacao e alternativas de escolha para o usuario 
				System.out.printf("Voce foi aprovado no exame de direcao? Digite 1 para sim e 0 para nao!\n");
				// Guardar um numero na variavel
				n2 = ler.nextInt();
				
				// Comando de decisao determinar valor true
				if (n2 == 0) {
					// Exibir frase caso valor for true
					System.out.printf("Voce nas esta apto a ter habilitacao!");
					
				// Comando de contra decisao caso valor for false
				} else {
					// Exibir frase caso valor for false
					System.out.println("Parabens! Voce pode tirar sua habilitacao!");
				}
			}
		}

	}
}
