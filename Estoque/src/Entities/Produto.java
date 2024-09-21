package Entities;

public class Produto {
	//Atributos da classe:
	private int id;
	private String nome;
	private double preco;
	private int quantidade;
	
	//Construtores:
	public Produto() {}
	
	public Produto(int id, String nome, double preco, int quantidade) {
		this.id = id;
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}
	
	//Getters e setters:
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	@Override
	public String toString() {
		return String.format("Produto = [id=%d, nome=%s, preco=%.2f, quantidade=%d]", 
				id, nome, preco, quantidade);
	}
	
	@Override
	//Compara dois objetos
	public boolean equals(Object obj) {
		//Verifica se os dois são iguais e caso sim retorna true
		if (this == obj) {
			return true;
		}
		//Verifica se o objeto é nulo ou de classe diferente
		if (obj == null || getClass() != obj.getClass()) {
			return false;
		}
		Produto produto = (Produto) obj;
		return id == produto.id;
	}
	
	@Override
    public int hashCode() {
        return Integer.hashCode(id);
    }
}
