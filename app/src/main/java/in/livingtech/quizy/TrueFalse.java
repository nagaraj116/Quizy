package in.livingtech.quizy;

/**
 * Created by Excel on 01/12/2019.
 */

public class TrueFalse {

    private int mQuestionID;
    private  boolean mAnswer;

    public TrueFalse(int questionResourseID, boolean trueOrFalse){
        mQuestionID = questionResourseID;
        mAnswer = trueOrFalse;
    }

    public int getQuestionID() {
        return mQuestionID;
    }

    public void setQuestionID(int questionID) {
        mQuestionID = questionID;
    }

    public boolean isAnswer() {
        return mAnswer;
    }

    public void setAnswer(boolean answer) {
        mAnswer = answer;
    }
}
