package k71;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class n implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f181792a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f181793b;

    public n(dj0.d amountAfterRefunds, dj0.d refundedAmount) {
        Intrinsics.checkNotNullParameter(amountAfterRefunds, "amountAfterRefunds");
        Intrinsics.checkNotNullParameter(refundedAmount, "refundedAmount");
        this.f181792a = amountAfterRefunds;
        this.f181793b = refundedAmount;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return Intrinsics.f(this.f181792a, nVar.f181792a) && Intrinsics.f(this.f181793b, nVar.f181793b);
    }

    public final int hashCode() {
        return this.f181793b.hashCode() + (this.f181792a.hashCode() * 31);
    }
}
