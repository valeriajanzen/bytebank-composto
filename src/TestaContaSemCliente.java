public class TestaContaSemCliente {
    public static void main(String[] args) {
        Conta contaDaMarcela = new Conta();
        contaDaMarcela.titular = new Cliente();
        contaDaMarcela.titular.nome = "Marcela";
        contaDaMarcela.titular.cpf = "333.333.333-33";
        contaDaMarcela.deposita(100);
        System.out.println(contaDaMarcela.saldo);
        System.out.println(contaDaMarcela.titular.nome);
    }

}
