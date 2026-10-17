package luh;

import com.revolut.feature.workflow.engine.rfi.api.models.Answer;
import com.revolut.shared.feature.workflow.engine.api.models.workflow.Question;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class l implements iuh.b {
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, java.util.Map] */
    @Override // iuh.b
    public final boolean a(Question question, Answer answer) {
        Question.Documents question2 = (Question.Documents) question;
        Answer.Documents answer2 = (Answer.Documents) answer;
        Intrinsics.checkNotNullParameter(question2, "question");
        Intrinsics.checkNotNullParameter(answer2, "answer");
        return answer2.f96518b.size() >= question2.e;
    }
}
