enum Answer { YES, NO, MAYBE }

public class A {

public static final String GOOGLE_APPLICATION_CREDENTIALS="sdfksdfkjlkj3948dfkjsdkfj39420394elfkjsdlkfj";
public static final String client_secret="d-FL95Q19q7MQmFpd7hHD0Ty";

	void myJavaFun(String s) {
        boolean b = s.equals("");
    }

Answer interpret(Answer answer) {
		switch (answer) {
			case MAYBE:
				return Answer.YES;
			case NO:
				return Answer.MAYBE;
			// Missing case for 'YES'
		}
		throw new RuntimeException("uncaught case: " + answer);
	}

}
