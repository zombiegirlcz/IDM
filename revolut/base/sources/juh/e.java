package juh;

import com.revolut.feature.workflow.engine.rfi.api.models.Answer;
import com.revolut.shared.feature.workflow.engine.api.models.workflow.Question;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class e implements iuh.b {
    @Override // iuh.b
    public final boolean a(Question question, Answer answer) {
        Question.Choice question2 = (Question.Choice) question;
        Answer.Selection answer2 = (Answer.Selection) answer;
        Intrinsics.checkNotNullParameter(question2, "question");
        Intrinsics.checkNotNullParameter(answer2, "answer");
        if (answer2 instanceof Answer.Selection.MultiChoice) {
            return !((Answer.Selection.MultiChoice) answer2).f96527b.isEmpty();
        }
        if (answer2 instanceof Answer.Selection.SingleChoice) {
            return true;
        }
        throw new NoWhenBranchMatchedException();
    }
}
