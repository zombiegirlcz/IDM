package del;

import ip0.v7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f113711a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f113712b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dj0.d f113713c;
    public final dj0.d d;

    public c(dj0.d totalOwned, dj0.d reservedForUnsettledBuys, dj0.d availableToWithdraw, dj0.d totalStocksCost) {
        Intrinsics.checkNotNullParameter(totalOwned, "totalOwned");
        Intrinsics.checkNotNullParameter(reservedForUnsettledBuys, "reservedForUnsettledBuys");
        Intrinsics.checkNotNullParameter(availableToWithdraw, "availableToWithdraw");
        Intrinsics.checkNotNullParameter(totalStocksCost, "totalStocksCost");
        this.f113711a = totalOwned;
        this.f113712b = reservedForUnsettledBuys;
        this.f113713c = availableToWithdraw;
        this.d = totalStocksCost;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f113711a, cVar.f113711a) && Intrinsics.f(this.f113712b, cVar.f113712b) && Intrinsics.f(this.f113713c, cVar.f113713c) && Intrinsics.f(this.d, cVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + v7.c(v7.c(this.f113711a.hashCode() * 31, 31, this.f113712b), 31, this.f113713c);
    }
}
