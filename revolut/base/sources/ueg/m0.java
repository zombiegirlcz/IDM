package ueg;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class m0 extends l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f279405a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f279406b;

    public m0(Clause inputPrimaryText, CompositeClause compositeClause) {
        Intrinsics.checkNotNullParameter(inputPrimaryText, "inputPrimaryText");
        this.f279405a = inputPrimaryText;
        this.f279406b = compositeClause;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m0)) {
            return false;
        }
        m0 m0Var = (m0) obj2;
        return this.f279405a.equals(m0Var.f279405a) && Intrinsics.f(this.f279406b, m0Var.f279406b);
    }

    public final int hashCode() {
        int iHashCode = this.f279405a.hashCode() * 31;
        Clause clause = this.f279406b;
        return iHashCode + (clause == null ? 0 : clause.hashCode());
    }
}
