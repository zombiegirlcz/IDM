package zkh;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kel.n f322990a;

    public e(kel.n stockHolding) {
        Intrinsics.checkNotNullParameter(stockHolding, "stockHolding");
        this.f322990a = stockHolding;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f322990a, ((e) obj2).f322990a);
    }

    public final int hashCode() {
        return this.f322990a.hashCode();
    }
}
