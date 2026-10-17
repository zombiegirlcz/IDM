package m1c;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class q1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f201445a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f201446b;

    public q1(List revPointsTransactions, boolean z) {
        Intrinsics.checkNotNullParameter(revPointsTransactions, "revPointsTransactions");
        this.f201445a = revPointsTransactions;
        this.f201446b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q1)) {
            return false;
        }
        q1 q1Var = (q1) obj2;
        return Intrinsics.f(this.f201445a, q1Var.f201445a) && this.f201446b == q1Var.f201446b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f201446b) + (this.f201445a.hashCode() * 31);
    }
}
