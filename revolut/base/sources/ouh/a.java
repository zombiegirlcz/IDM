package ouh;

import com.revolut.feature.workflow.engine.rfi.api.models.Answer;
import com.revolut.shared.feature.workflow.engine.api.models.workflow.Question;
import iuh.o;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class a implements iuh.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f229879a;

    public a(o validator) {
        Intrinsics.checkNotNullParameter(validator, "validator");
        this.f229879a = validator;
    }

    @Override // iuh.b
    public final boolean a(Question question, Answer answer) {
        Object next;
        Question.MultiText question2 = (Question.MultiText) question;
        Answer.MultiText answer2 = (Answer.MultiText) answer;
        Intrinsics.checkNotNullParameter(question2, "question");
        Intrinsics.checkNotNullParameter(answer2, "answer");
        ArrayList<Question.MultiText.Item> arrayList = question2.e;
        if (arrayList.isEmpty()) {
            return true;
        }
        for (Question.MultiText.Item item : arrayList) {
            Iterator it8 = answer2.f96523b.iterator();
            while (true) {
                if (!it8.hasNext()) {
                    next = null;
                    break;
                }
                next = it8.next();
                if (Intrinsics.f(((Answer.MultiText.Item) next).f96524a, item.f105621a)) {
                    break;
                }
            }
            Answer.MultiText.Item item2 = (Answer.MultiText.Item) next;
            if (item2 == null) {
                return false;
            }
            String str = item2.f96525b;
            Integer num = item.d;
            this.f229879a.getClass();
            if (!o.a(num, str)) {
                return false;
            }
        }
        return true;
    }
}
