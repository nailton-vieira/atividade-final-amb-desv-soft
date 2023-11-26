public class Funcionario{
    
    private String cargo;
    private Ferramenta ferramenta;
  

    public Funcionario(String cargo) {
        this.cargo = cargo;
    }

    public String getCargo() {
        return this.cargo;
    }
    
    public Ferramenta getFerramenta() {
        return this.ferramenta;
    }
    
    public void escolherFerramenta(Ferramenta ferramenta) {
        this.ferramenta = ferramenta;
    }
}