package view;

import model.Funcionario;
import model.Programador;
import model.Coodenador;
import model.FuncionarioAdministrativo;

public class Main {

	public static void main(String[] args) {
		
		Funcionario muniz = new Programador("Sucupira", "11503395430", 10.000, "04020508", 10, "Java", "Java", "Soft"); 
		
		muniz.setNome("Sucupira");
		
		System.out.println("Nome do Funcionario: "+muniz.getNome());
		

	}

}
