public class CuentaBancaria {
    //Definición de variables
    private double saldo;

    //Método constructor de la clase
    public CuentaBancaria(double saldoInicial){
        if (saldoInicial >= 0) {
            this.saldo = saldoInicial;
        }
        else {
            this.saldo = 0;
            System.out.println("Saldo inicial no válido. Se estableció 0.");
        }
    }

    public boolean retirar(double cantidad) {
        if (cantidad <= saldo) {
            saldo -= cantidad;
            System.out.println("Retiro completo. Saldo actual: " + saldo);
            return true;
        }
        else {
            System.out.println("Fondos insuficientes para retirar.");
            return false;
        }
    }
}
