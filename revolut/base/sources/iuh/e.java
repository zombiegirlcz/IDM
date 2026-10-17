package iuh;

import com.revolut.feature.workflow.engine.rfi.api.models.Answer;
import com.revolut.shared.feature.workflow.engine.api.models.workflow.Question;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class e implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Question f168606a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Answer f168607b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f168608c;
    public final boolean d;

    public e(Question currentQuestion, Answer answer, boolean z, boolean z3) {
        Intrinsics.checkNotNullParameter(currentQuestion, "currentQuestion");
        this.f168606a = currentQuestion;
        this.f168607b = answer;
        this.f168608c = z;
        this.d = z3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f168606a, eVar.f168606a) && Intrinsics.f(this.f168607b, eVar.f168607b) && this.f168608c == eVar.f168608c && this.d == eVar.d;
    }

    public final int hashCode() {
        int iHashCode = this.f168606a.hashCode() * 31;
        Answer answer = this.f168607b;
        return Boolean.hashCode(this.d) + j6.a.c((iHashCode + (answer == null ? 0 : answer.hashCode())) * 31, 31, this.f168608c);
    }
}
