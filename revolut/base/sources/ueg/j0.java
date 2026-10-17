package ueg;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class j0 extends l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f279394a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f279395b;

    public j0(Clause inputPrimaryText, CompositeClause compositeClause) {
        Intrinsics.checkNotNullParameter(inputPrimaryText, "inputPrimaryText");
        this.f279394a = inputPrimaryText;
        this.f279395b = compositeClause;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j0)) {
            return false;
        }
        j0 j0Var = (j0) obj2;
        return this.f279394a.equals(j0Var.f279394a) && Intrinsics.f(this.f279395b, j0Var.f279395b);
    }

    public final int hashCode() {
        int iHashCode = this.f279394a.hashCode() * 31;
        Clause clause = this.f279395b;
        return iHashCode + (clause == null ? 0 : clause.hashCode());
    }
}
