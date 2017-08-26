package level1;

import java.awt.Component;
import java.awt.Frame;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class PhotoQuiz {

	public static void main(String[] args) throws Exception {
		Frame quizWindow = new Frame();
		quizWindow.setVisible(true);

		// 1. find an image on the internet, and put its URL in a String variable (from
		// your browser, right click on the image, and select “Copy Image URL”)
		String image = "docksunset.jpeg";
		// 2. create a variable of type "Component" that will hold your image
		Component image1;
		// 3. use the "createImage()" method below to initialize your Component
		image1 = createImage(image);
		// 4. add the image to the quiz window
		quizWindow.add(image1);
		// 5. call the pack() method on the quiz window
		quizWindow.pack();

		// 6. ask a question that relates to the image

		String answer = JOptionPane.showInputDialog("Does this image have a boat in it?");

		// 7. print "CORRECT" if the user gave the right answer
		if (answer.equals("yes")) {
			System.out.println("CORRECT");

		}
		// 8. print "INCORRECT" if the answer is wrong
		else {
			System.out.println("INCORRECT");

		}
		// 9. remove the component from the quiz window (you may not see the effect of
		// this until step 12)
		quizWindow.remove(image1);
		// 10. find another image and create it (might take more than one line of code)
		String photo = ("https://i.pinimg.com/originals/20/10/33/201033f843414123b95b830961311063.jpg");
		Component photo1;
		photo1 = createImage(photo);

		// 11. add the second image to the quiz window
		quizWindow.add(photo1);

		// 12. pack the quiz window
		quizWindow.pack();
		// 13. ask another question
		String answer1 = JOptionPane.showInputDialog("Does this image nod his head up and down?");
		// 14+ check answer, say if correct or incorrect, etc.
		if (answer.equals("yes")) {
			System.out.println("CORRECT");

		}

		else {
			System.out.println("INCORRECT");

		}

	}

	private static Component createImage(String imageUrl) throws MalformedURLException {
		URL url = new URL(imageUrl);
		Icon icon = new ImageIcon(url);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	/* OPTIONAL */
	// *14. add scoring to your quiz
	// *15. make something happen when mouse enters image
	// (imageComponent.addMouseMotionListener())
}
