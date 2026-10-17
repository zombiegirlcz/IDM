package nel;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class y0 implements z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kel.n f214639a;

    public y0(kel.n stockHolding) {
        Intrinsics.checkNotNullParameter(stockHolding, "stockHolding");
        this.f214639a = stockHolding;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof y0) && Intrinsics.f(this.f214639a, ((y0) obj2).f214639a);
    }

    public final int hashCode() {
        return this.f214639a.hashCode();
    }
}
