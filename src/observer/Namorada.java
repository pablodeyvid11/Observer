package observer;

public class Namorada implements ChegadaAniversarianteObserver{

	@Override
	public void chegou(ChegadaAniversarianteEvent event) {
		System.out.println("Apaguem as luzes...");
		System.out.println("Fa�am sil�ncio...");
		System.out.println("Surpresa!!!");
	}

}
