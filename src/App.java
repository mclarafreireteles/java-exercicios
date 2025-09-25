import java.util.Arrays;
import java.util.Scanner;
public class App {

    public static void q01() {
        System.out.println("Hello world");
    }

    public static void q02() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Por favor, insira um número: ");
        int numero = scanner.nextInt();
        System.out.println("O número inserido foi " + numero);

        scanner.close();
    }

    public static void q03() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Por favor, insira um número: ");
        int numero1 = scanner.nextInt();

        System.out.print("Por favor, insira outro número: ");
        int numero2 = scanner.nextInt();

        System.out.print("Por favor, insira outro número: ");
        int numero3 = scanner.nextInt();

        int media = (numero1 + numero2 + numero3) / 3;

        System.out.println("A média dos numeros é " + media);

        scanner.close();
    }

    public static void q04(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Por favor, insira um número: ");
        int numero = scanner.nextInt();
        int metros = numero * 100;

        System.out.println("Esse número em centímetros é " + metros);
        scanner.close();

    }

    public static void q05(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Por favor, insira o raio do círculo: ");
        double numero = scanner.nextDouble();
        double area = Math.pow((numero * Math.PI), 2);

        System.out.println("Esse número em centímetros é " + area);
        scanner.close();

    }

    public static void q06(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Valor do primeiro produto: ");
        double numero1 = scanner.nextDouble();

        System.out.print("Valor do segundo produto: ");
        double numero2 = scanner.nextDouble();

        System.out.print("Valor do terceiro produto: ");
        double numero3 = scanner.nextDouble();

        double menorNumero = Math.min(numero3, Math.min(numero2, numero1));

        System.out.println("O produto mais barato é " + menorNumero);
        scanner.close();

    }

    public static void q07(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Quantas notas você quer inserir? ");
        int numeroDeNotas = scanner.nextInt();

        double somaDasNotas = 0;

        for (int i = 0; i < numeroDeNotas; i++){
            System.out.print("Qual foi a nota" + i + "?: ");
            double nota = scanner.nextDouble();
            somaDasNotas += nota;
        }

        double media = somaDasNotas / numeroDeNotas;

        if (media >= 7.0){
            System.out.println("Parabéns, você passou!");
        } else {
            System.out.println("Infelizmente, você foi reprovado");
        }

        scanner.close();
    }

    public static void q08(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Qual a primeira nota? ");
        double nota1 = scanner.nextDouble();
        System.out.print("Qual a segunda nota? ");
        double nota2 = scanner.nextDouble();

        double mediaFinal =  (nota1 +  nota2) / 2;

        if (mediaFinal >= 7.00){
            System.out.println("Parabéns, você foi aprovado!");
        } else if (mediaFinal < 7.00 && mediaFinal >= 4.00){
            System.out.println("Você ficou de AF!");
            System.out.print("Nota da AF: ");
            double notaAf = scanner.nextDouble();

            double mediaComAf = (notaAf + mediaFinal) / 2;
            if (notaAf >= 4.00 && mediaComAf >= 5){

                System.out.println("Nota final com AF: " + mediaComAf);
                System.out.println("Nota final sem AF: " + mediaFinal);
                System.out.println("Parabéns, você foi aprovado!");
            } else {
                System.out.println("Infelizmente, você foi reprovado!");
            }
        } else {
            System.out.println("Infelizmente, você foi reprovado!");

        }

        scanner.close();

    }

    public static void q09(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número:");
        double num1 = scanner.nextDouble();

        System.out.println("Digite o segundo número:");
        double num2 = scanner.nextDouble();

        System.out.println("Digite o terceiro número:");
        double num3 = scanner.nextDouble();

        double maior;

        if (num1 >= num2 && num1 >= num3) {
            maior = num1;
        } else if (num2 >= num1 && num2 >= num3) {
            maior = num2;
        } else {
            maior = num3;
        }
        System.out.println("O maior número é " + maior);
        scanner.close();
    }

    public static void q10(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Escolha um número inteiro: ");
        int numero = scanner.nextInt();

        if (numero % 2 == 0) {
            System.out.println("Número é PAR");
        } else {
            System.out.println("Número é ÍMPAR!");
        }

        scanner.close();
    }

    public static void q11(){
        Scanner scanner = new Scanner(System.in);
        int numero;

        do {
            System.out.print("Digite um número inteiro entre 0 e 10 para ver a tabuada: ");
            numero = scanner.nextInt();

            if (numero < 0 || numero > 10) {
                System.out.println("Número inválido! Por favor, digite um número entre 0 e 10.");
            }
        } while (numero < 0 || numero > 10);

        System.out.println("\n--- Tabuada de " + numero + " ---");

        for (int i = 0; i <= 10; i++) {
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
        }

        scanner.close();
    }

    public static void q12(){
        Scanner scanner = new Scanner(System.in);
        int numero;

        do {
            System.out.print("Digite um número entre 0 e 10: ");
            numero =  scanner.nextInt();

            if (numero < 0 || numero > 10) {
                System.out.println("Número inválido! Digite um número entre 0 e 10");
            }
        } while (numero < 0 || numero > 10);

        System.out.println("Valor válido. Número: " +  numero);
        scanner.close();
    }

    public static void q13(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o número total de eleitores: ");
        int totalEleitores = scanner.nextInt();

        int votosCandidato1 = 0;
        int votosCandidato2 = 0;
        int votosCandidato3 = 0;
        
        for (int i = 1; i <= totalEleitores; i++) {
            System.out.println("Eleitor " + i + ", digite seu voto (1 para Candidato 1, 2 para Candidato 2, 3 para Candidato 3): ");
            int voto = scanner.nextInt();
            
            switch (voto) {
                case 1:
                    votosCandidato1++;
                    break;
                case 2:
                    votosCandidato2++;
                    break;
                case 3:
                    votosCandidato3++;
                    break;
                default:
                    System.out.println("Voto inválido. O voto será ignorado.");
                    break;
            }
        }

        System.out.println("\nResultado da eleição:");
        System.out.println("Candidato 1: " + votosCandidato1 + " votos");
        System.out.println("Candidato 2: " + votosCandidato2 + " votos");
        System.out.println("Candidato 3: " + votosCandidato3 + " votos");
        
        scanner.close();
    }

    public static void q14(){
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o " + i + " número inteiro maior que 1");
            int numero = scanner.nextInt();

            if (numero <= 1) {
                System.out.print("Por favor, digite um número maior que 1.");
                i--; // Decrementa para repetir a entrada
                continue;
            }

            if (isPrimo(numero)) {
                System.out.print(numero + " é numero primo");
            } else {
                System.out.print(numero + " não é numero primo");
            }
        }

        scanner.close();
    }

    public static boolean isPrimo(int numero){
        if (numero == 2){
            return true;
        }

        if (numero % 2 == 0){
            return false;
        }

        for (int i = 3; i <= Math.sqrt(numero); i+=2){
            if (numero % i == 0){
                return false;
            }
        }

        return true;
    }

    public static void q15(){
        int primeiroNumero = 0;
        int segundoNumero = 1;
        int resultado;

        for (int i = 0; i < 10; i++) {
            resultado = primeiroNumero + segundoNumero;
            System.out.println(primeiroNumero + " + " + segundoNumero + " = "  + resultado);
            primeiroNumero = segundoNumero;
            segundoNumero = resultado;
            
        }

    }

    public static void q16(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o numero: ");
        int numero = scanner.nextInt();
        int acc = numero;
        int fatorial;

        if (numero == 0 || numero == 1){
            fatorial = 1;
            System.out.print("Fatorial = "+ fatorial);
        } else {
            for (int i = 1; i < numero; i++) {
                int menor = numero - i;
                fatorial = acc * menor;
                acc = fatorial;
                System.out.println(fatorial);
            }
            
        }

        scanner.close();
    }

    public static void q17(){
        Scanner scanner = new Scanner(System.in);
        
        int[] numeros = new int[5];
        
        System.out.println("Por favor, digite 5 números inteiros.");
        
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            numeros[i] = scanner.nextInt();
        }
        
        System.out.println("\n----------------------------------------\n");
        
        System.out.println("Os números digitados foram:");
        
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }
        
        System.out.println();
        
        scanner.close();
    }

    public static void q18(){
        Scanner scanner = new Scanner(System.in);
        
        double[] numeros = new double[10];

        //prenchimentos
        System.out.println("Digite 10 números reais");
        for (int i = 0; i < numeros.length; i++){
            System.out.print("Digite o número: ");
            numeros[i] = scanner.nextDouble();
        }

        //exibiçao ordem inveersa
        System.out.println("Os números digitados na ordem inversa são:");
        for (int i = numeros.length - 1; i >= 0; i--){
            System.out.println(numeros[i]);
        }

        scanner.close();
        
    }

    public static void q19(){
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[5];
        int soma = 0;
        int multiplicador = 1;

        //prenchimento do vetor
        System.out.println(" ==== Digite 5 números inteiros ==== ");
        for (int i = 0; i < numeros.length; i++){
            System.out.print("Digite um número:");
            numeros[i] = scanner.nextInt();
        }

        System.out.println(" ==== 5 números ==== ");
        System.out.print("Números: ");
        for (int i = 0; i < numeros.length; i++){
            System.out.println(numeros[i] + ", ");
        }

        System.out.println(" ==== Soma ==== ");
        for (int i = 0; i < numeros.length; i++){
            soma = numeros[i] + soma;
        }
        System.out.println("Soma: " + soma);

        System.out.println(" ==== Multiplicação ==== ");
        for (int i = 0; i < numeros.length; i++){
            multiplicador = multiplicador * numeros[i];
        }
        System.out.println("Multiplicação: " + multiplicador);

        scanner.close();
    }

    public static void q20(){
        Scanner scanner = new Scanner(System.in);
        final int TAMANHO_VETOR = 20;

        int[] todosOsNumeros = new int[TAMANHO_VETOR];
        int[] par = new int[TAMANHO_VETOR];
        int[] impar = new int[TAMANHO_VETOR];

        int contadorPar = 0;
        int contadorImpar = 0;

        System.out.println("Por favor, digite 20 números inteiros:");

        for (int i = 0; i < TAMANHO_VETOR; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            int numeroAtual = scanner.nextInt();

            todosOsNumeros[i] = numeroAtual;

            if (numeroAtual % 2 == 0) {
                par[contadorPar] = numeroAtual;
                contadorPar++;
            } else {
                impar[contadorImpar] = numeroAtual;
                contadorImpar++;
            }
        }

        System.out.println("\n=============================================");
        System.out.println("--- VETOR COMPLETO ---");
        System.out.println(Arrays.toString(todosOsNumeros));

        System.out.println("\n--- VETOR DE PARES ---");
        int[] paresReais = Arrays.copyOf(par, contadorPar);
        System.out.println(Arrays.toString(paresReais));
        
        System.out.println("\n--- VETOR DE ÍMPARES ---");
        int[] imparesReais = Arrays.copyOf(impar, contadorImpar);
        System.out.println(Arrays.toString(imparesReais));
        System.out.println("=============================================");

        scanner.close();
    }

    public static void q21(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a primeira String: ");
        String str1 = scanner.nextLine();

        System.out.print("Digite a segunda String: ");
        String str2 = scanner.nextLine();

        System.out.println("\n--- Análise das Strings ---");
        System.out.println("Conteúdo da primeira String: \"" + str1 + "\"");
        System.out.println("Comprimento: " + str1.length() + " caracteres.");
        
        System.out.println("\nConteúdo da segunda String: \"" + str2 + "\"");
        System.out.println("Comprimento: " + str2.length() + " caracteres.");
        
        System.out.println("\n--- Comparações ---");

        if (str1.length() == str2.length()) {
            System.out.println("As duas Strings possuem o mesmo comprimento.");
        } else {
            System.out.println("As duas Strings possuem comprimentos diferentes.");
        }

        if (str1.equals(str2)) {
            System.out.println("O conteúdo das duas Strings é igual.");
        } else {
            System.out.println("O conteúdo das duas Strings é diferente.");
        }

        scanner.close();
    }

    public static void q22(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro para ser invertido: ");
        int numeroOriginal = scanner.nextInt();

        int numeroRevertido = 0;
        int numeroParaReverter = numeroOriginal;

        while (numeroParaReverter != 0) {
            int digito = numeroParaReverter % 10;
            numeroRevertido = numeroRevertido * 10 + digito;
            numeroParaReverter = numeroParaReverter / 10;
        }

        System.out.println("O reverso de " + numeroOriginal + " é: " + numeroRevertido);

        scanner.close();
    }

    public static void q23(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro valor: ");
        double valor1 = scanner.nextDouble();

        System.out.print("Digite o segundo valor: ");
        double valor2 = scanner.nextDouble();

        System.out.print("Digite a operação (soma, subtracao, multiplicacao, divisao): ");
        String operacao = scanner.next();

        double resultado = 0;
        boolean operacaoValida = true;

        switch (operacao.toLowerCase()) {
            case "soma":
                resultado = valor1 + valor2;
                break;
            case "subtracao":
                resultado = valor1 - valor2;
                break;
            case "multiplicacao":
                resultado = valor1 * valor2;
                break;
            case "divisao":
                if (valor2 != 0) {
                    resultado = valor1 / valor2;
                } else {
                    System.out.println("Erro: Divisão por zero não é permitida.");
                    operacaoValida = false;
                }
                break;
            default:
                System.out.println("Erro: Operação inválida.");
                operacaoValida = false;
                break;
        }

        if (operacaoValida) {
            System.out.println("O resultado da " + operacao + " é: " + resultado);
        }

        scanner.close();
    }

    public static void main(String[] args) {
        //coloque a funcao da questao aqui
    }
}