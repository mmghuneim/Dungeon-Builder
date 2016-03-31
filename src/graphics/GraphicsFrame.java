package graphics;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class GraphicsFrame extends JFrame{
	
	// member variables
	JPanel graphicsPanel;
	private int width, height;
	
	// constructor
	public GraphicsFrame(){
		// get screen dimensions and set screen size
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		width = (int)screenSize.getWidth();
		height = (int)screenSize.getHeight();
		
		// setup dimensions
		setSize(width,height);
		setResizable(true);
		
		// remove border
		setUndecorated(true);
		
		// exit on close and visible
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	// accessors
	public int getWidth(){return width;}
	public int getHeight(){return height;}
	
	// mutators
	public void setWidth(int w){width = w;}
	public void setHeight(int h){height = h;}
	
} // end class
