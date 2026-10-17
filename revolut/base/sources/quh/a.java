package quh;

import com.revolut.feature.workflow.engine.rfi.api.models.Answer;
import com.revolut.shared.feature.workflow.engine.api.models.workflow.Question;
import iuh.o;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class a implements iuh.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f249452a;

    public a(o validator) {
        Intrinsics.checkNotNullParameter(validator, "validator");
        this.f249452a = validator;
    }

    @Override // iuh.b
    public final boolean a(Question question, Answer answer) {
        Question.Text question2 = (Question.Text) question;
        Answer.Text answer2 = (Answer.Text) answer;
        Intrinsics.checkNotNullParameter(question2, "question");
        Intrinsics.checkNotNullParameter(answer2, "answer");
        String str = answer2.f96531b;
        Integer num = question2.f105627g;
        this.f249452a.getClass();
        return o.a(num, str);
    }
}
