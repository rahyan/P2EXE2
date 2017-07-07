import static org.junit.Assert.*;

import java.util.Scanner;

import org.junit.Test;
import org.mockito.Mockito;

import P2EXE2.NextLineAsker;
import P2EXE2.VulnerableClass;

public class testesP2EXE2 {

	@Test
	public void testes() {
		VulnerableClass vulnerableClass = new VulnerableClass();
		
		String correctFileName1 = "rahyan.txt";
		String correctFileName2 = "rahyan2017.txt";
		String correctFileName3 = "pedro_marques.txt";
		String correctFileName4 = "pedro_marques_1995.txt";
		String incorrectFileName1 = "rahyan";
		String incorrectFileName2 = "rahyan.azin.txt";
		String incorrectFileName3 = "rahyan*azin.txt";
		String incorrectFileName4 = "rahyan azin.txt";
		
		//Mockand o NextLineAsker
		NextLineAsker asker = Mockito.mock(NextLineAsker.class);
		//Quando a funcao pedir por um input do usuario, ele clica "E" para sair;
		Mockito.when(asker.ask(Mockito.any(Scanner.class))).thenReturn("E");
		
		assertEquals(true, vulnerableClass.vulnerableMethod(correctFileName1, asker));
		assertEquals(true, vulnerableClass.vulnerableMethod(correctFileName2, asker));
		assertEquals(true, vulnerableClass.vulnerableMethod(correctFileName3, asker));
		assertEquals(true, vulnerableClass.vulnerableMethod(correctFileName4, asker));
		assertEquals(false, vulnerableClass.vulnerableMethod(incorrectFileName1, asker));
		assertEquals(false, vulnerableClass.vulnerableMethod(incorrectFileName2, asker));
		assertEquals(false, vulnerableClass.vulnerableMethod(incorrectFileName3, asker));
		assertEquals(false, vulnerableClass.vulnerableMethod(incorrectFileName4, asker));
		
	}

}
