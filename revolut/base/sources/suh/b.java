package suh;

import com.revolut.feature.workflow.engine.rfi.api.models.Answer;
import com.revolut.shared.feature.workflow.engine.api.models.workflow.Question;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;

/* JADX INFO: loaded from: classes10.dex */
public final class b implements iuh.b {
    @Override // iuh.b
    public final boolean a(Question question, Answer answer) {
        Question.Timeline question2 = (Question.Timeline) question;
        Answer.Timeline answer2 = (Answer.Timeline) answer;
        Intrinsics.checkNotNullParameter(question2, "question");
        Intrinsics.checkNotNullParameter(answer2, "answer");
        List<Answer.Timeline.Item> list = answer2.f96533b;
        if ((list instanceof Collection) && list.isEmpty()) {
            return true;
        }
        for (Answer.Timeline.Item item : list) {
            if (d0.W(item.f96534a) || item.f96535b == null || item.f96536c == null) {
                return false;
            }
        }
        return true;
    }
}
