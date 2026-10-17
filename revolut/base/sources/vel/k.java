package vel;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f288362a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f288363b;

    public k(dj0.d contributions, dj0.d withdrawals) {
        Intrinsics.checkNotNullParameter(contributions, "contributions");
        Intrinsics.checkNotNullParameter(withdrawals, "withdrawals");
        this.f288362a = contributions;
        this.f288363b = withdrawals;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f288362a, kVar.f288362a) && Intrinsics.f(this.f288363b, kVar.f288363b);
    }

    public final int hashCode() {
        return this.f288363b.hashCode() + (this.f288362a.hashCode() * 31);
    }
}
