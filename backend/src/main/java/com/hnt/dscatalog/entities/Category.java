package com.hnt.dscatalog.entities;

import java.io.Serializable;

public class Category implements Serializable{
	private static final long serialVersionUID = 1L; // Padrão para q o objeto java seja convertido em bytes (en sequencia de bytes),para o objeto seja gravado em arquivos, passar nas redes.  
	
	
	private Long id;
	private String name;
	
	public Category() {
		
	}

	public Category(Long id, String name) {
		this.id = id;
		this.name = name;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() { // É um metodo padrão para comparar se um objeto é igual a outro(muito rapida) mais usado para varrer uma coleção enorme
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) { //metodo de comparação q qualquer objeto java pode ter(lenta)  mais usado depois que o hashCode encontra dois q são iguais usa-se para confirmar devido o metodo de comparação de igualdade ser 100%
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Category other = (Category) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
}
