package x2g;

import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class j implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final myf.a f302555a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f302556b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set f302557c;
    public final List d;
    public final Map e;

    public j(myf.a experience, List questions, Set focusedInputIds, List userAnswersList, Map answeredQuestions) {
        Intrinsics.checkNotNullParameter(experience, "experience");
        Intrinsics.checkNotNullParameter(questions, "questions");
        Intrinsics.checkNotNullParameter(focusedInputIds, "focusedInputIds");
        Intrinsics.checkNotNullParameter(userAnswersList, "userAnswersList");
        Intrinsics.checkNotNullParameter(answeredQuestions, "answeredQuestions");
        this.f302555a = experience;
        this.f302556b = questions;
        this.f302557c = focusedInputIds;
        this.d = userAnswersList;
        this.e = answeredQuestions;
    }

    public static j a(j jVar, Set set, List list, Map map, int i) {
        myf.a experience = jVar.f302555a;
        List questions = jVar.f302556b;
        if ((i & 4) != 0) {
            set = jVar.f302557c;
        }
        Set focusedInputIds = set;
        if ((i & 8) != 0) {
            list = jVar.d;
        }
        List userAnswersList = list;
        if ((i & 16) != 0) {
            map = jVar.e;
        }
        Map answeredQuestions = map;
        jVar.getClass();
        Intrinsics.checkNotNullParameter(experience, "experience");
        Intrinsics.checkNotNullParameter(questions, "questions");
        Intrinsics.checkNotNullParameter(focusedInputIds, "focusedInputIds");
        Intrinsics.checkNotNullParameter(userAnswersList, "userAnswersList");
        Intrinsics.checkNotNullParameter(answeredQuestions, "answeredQuestions");
        return new j(experience, questions, focusedInputIds, userAnswersList, answeredQuestions);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f302555a, jVar.f302555a) && Intrinsics.f(this.f302556b, jVar.f302556b) && Intrinsics.f(this.f302557c, jVar.f302557c) && Intrinsics.f(this.d, jVar.d) && Intrinsics.f(this.e, jVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + p.a.d(p.a.f(p.a.d(this.f302555a.hashCode() * 31, 31, this.f302556b), 31, this.f302557c), 31, this.d);
    }
}
