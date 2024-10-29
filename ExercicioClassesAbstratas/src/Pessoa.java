/**
 * @author MauricioCampos
 */

// Classe abstrata Pessoa
abstract class Pessoa {
    private String nome;
    private String endereco;

    // Construtor
    public Pessoa(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    // Método abstrato (opcional) - pode ser implementado pelas subclasses
    public abstract void exibirDetalhes();
}

// Classe concreta PessoaFisica
class PessoaFisica extends Pessoa {
    private String cpf;
    private String dataNascimento;

    // Construtor
    public PessoaFisica(String nome, String endereco, String cpf, String dataNascimento) {
        super(nome, endereco);
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
    }

    // Getters e Setters específicos
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    // Implementação do método abstrato
    @Override
    public void exibirDetalhes() {
        System.out.println("Pessoa Física: " + getNome() + ", CPF: " + cpf + ", Nascimento: " + dataNascimento);
    }
}

// Classe concreta PessoaJuridica
class PessoaJuridica extends Pessoa {
    private String cnpj;
    private String razaoSocial;

    // Construtor
    public PessoaJuridica(String nome, String endereco, String cnpj, String razaoSocial) {
        super(nome, endereco);
        this.cnpj = cnpj;
        this.razaoSocial = razaoSocial;
    }

    // Getters e Setters específicos
    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    // Implementação do método abstrato
    @Override
    public void exibirDetalhes() {
        System.out.println("Pessoa Jurídica: " + getNome() + ", CNPJ: " + cnpj + ", Razão Social: " + razaoSocial);
    }
}

// Classe principal para testar
class Main {
    public static void main(String[] args) {
        PessoaFisica pessoaFisica = new PessoaFisica("João Silva", "Rua A, 123", "123.456.789-00", "01/01/1990");
        PessoaJuridica pessoaJuridica = new PessoaJuridica("Empresa XYZ", "Av. B, 456", "12.345.678/0001-00", "Empresa XYZ Ltda");

        pessoaFisica.exibirDetalhes();
        pessoaJuridica.exibirDetalhes();
    }
}






