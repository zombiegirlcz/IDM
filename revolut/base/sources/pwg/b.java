package pwg;

import kotlin.jvm.internal.Intrinsics;
import nel.a0;

/* JADX INFO: loaded from: classes9.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kel.n f240450a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a0 f240451b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g f240452c;

    public b(kel.n stockHolding, a0 instrumentWithTicker, g gVar) {
        Intrinsics.checkNotNullParameter(stockHolding, "stockHolding");
        Intrinsics.checkNotNullParameter(instrumentWithTicker, "instrumentWithTicker");
        this.f240450a = stockHolding;
        this.f240451b = instrumentWithTicker;
        this.f240452c = gVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f240450a, bVar.f240450a) && Intrinsics.f(this.f240451b, bVar.f240451b) && Intrinsics.f(this.f240452c, bVar.f240452c);
    }

    public final int hashCode() {
        int iHashCode = (this.f240451b.hashCode() + (this.f240450a.hashCode() * 31)) * 31;
        g gVar = this.f240452c;
        return iHashCode + (gVar == null ? 0 : gVar.hashCode());
    }
}
