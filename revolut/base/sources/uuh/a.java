package uuh;

import com.revolut.feature.workflow.engine.rfi.api.models.Answer;
import com.revolut.shared.feature.workflow.engine.api.models.workflow.Question;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class a implements iuh.b {
    @Override // iuh.b
    public final boolean a(Question question, Answer answer) {
        Question.YesNo question2 = (Question.YesNo) question;
        Answer.YesNo answer2 = (Answer.YesNo) answer;
        Intrinsics.checkNotNullParameter(question2, "question");
        Intrinsics.checkNotNullParameter(answer2, "answer");
        return true;
    }
}
