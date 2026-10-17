package y4f;

import ip0.v7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f310899a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f310900b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dj0.d f310901c;
    public final dj0.d d;
    public final dj0.d e;
    public final boolean f;

    public a(dj0.d totalCash, dj0.d reservedForUnsettledBuys, dj0.d availableToWithdraw, dj0.d netCreditsDebits, dj0.d securities, boolean z) {
        Intrinsics.checkNotNullParameter(totalCash, "totalCash");
        Intrinsics.checkNotNullParameter(reservedForUnsettledBuys, "reservedForUnsettledBuys");
        Intrinsics.checkNotNullParameter(availableToWithdraw, "availableToWithdraw");
        Intrinsics.checkNotNullParameter(netCreditsDebits, "netCreditsDebits");
        Intrinsics.checkNotNullParameter(securities, "securities");
        this.f310899a = totalCash;
        this.f310900b = reservedForUnsettledBuys;
        this.f310901c = availableToWithdraw;
        this.d = netCreditsDebits;
        this.e = securities;
        this.f = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f310899a, aVar.f310899a) && Intrinsics.f(this.f310900b, aVar.f310900b) && Intrinsics.f(this.f310901c, aVar.f310901c) && Intrinsics.f(this.d, aVar.d) && Intrinsics.f(this.e, aVar.e) && this.f == aVar.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + v7.c(v7.c(v7.c(v7.c(this.f310899a.hashCode() * 31, 31, this.f310900b), 31, this.f310901c), 31, this.d), 31, this.e);
    }
}
