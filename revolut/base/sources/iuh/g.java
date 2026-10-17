package iuh;

import com.revolut.feature.workflow.engine.rfi.api.models.Answer;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class g extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Answer f168610a;

    public g(Answer answer) {
        Intrinsics.checkNotNullParameter(answer, "answer");
        this.f168610a = answer;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f168610a, ((g) obj2).f168610a);
    }

    public final int hashCode() {
        return this.f168610a.hashCode();
    }
}
