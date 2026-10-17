package h3b;

import ip0.v7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f149081a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f149082b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dj0.d f149083c;
    public final dj0.d d;

    public i(dj0.d accountValue, dj0.d pnl2, dj0.d marginReserved, dj0.d availableToInvest) {
        Intrinsics.checkNotNullParameter(accountValue, "accountValue");
        Intrinsics.checkNotNullParameter(pnl2, "pnl");
        Intrinsics.checkNotNullParameter(marginReserved, "marginReserved");
        Intrinsics.checkNotNullParameter(availableToInvest, "availableToInvest");
        this.f149081a = accountValue;
        this.f149082b = pnl2;
        this.f149083c = marginReserved;
        this.d = availableToInvest;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f149081a, iVar.f149081a) && Intrinsics.f(this.f149082b, iVar.f149082b) && Intrinsics.f(this.f149083c, iVar.f149083c) && Intrinsics.f(this.d, iVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + v7.c(v7.c(this.f149081a.hashCode() * 31, 31, this.f149082b), 31, this.f149083c);
    }
}
