package kel;

import ip0.v7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class b implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f183148a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f183149b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f183150c;
    public final dj0.d d;
    public final dj0.d e;
    public final dj0.d f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final dj0.d f183151g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final dj0.d f183152h;
    public final dj0.d i;

    public b(a baseHolding, dj0.d total, String pocketId, dj0.d availableToInvest, dj0.d availableToWithdraw, dj0.d unsettled, dj0.d committed, dj0.d unsettledBuys, dj0.d totalOwned) {
        Intrinsics.checkNotNullParameter(baseHolding, "baseHolding");
        Intrinsics.checkNotNullParameter(total, "total");
        Intrinsics.checkNotNullParameter(pocketId, "pocketId");
        Intrinsics.checkNotNullParameter(availableToInvest, "availableToInvest");
        Intrinsics.checkNotNullParameter(availableToWithdraw, "availableToWithdraw");
        Intrinsics.checkNotNullParameter(unsettled, "unsettled");
        Intrinsics.checkNotNullParameter(committed, "committed");
        Intrinsics.checkNotNullParameter(unsettledBuys, "unsettledBuys");
        Intrinsics.checkNotNullParameter(totalOwned, "totalOwned");
        this.f183148a = baseHolding;
        this.f183149b = total;
        this.f183150c = pocketId;
        this.d = availableToInvest;
        this.e = availableToWithdraw;
        this.f = unsettled;
        this.f183151g = committed;
        this.f183152h = unsettledBuys;
        this.i = totalOwned;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f183148a, bVar.f183148a) && Intrinsics.f(this.f183149b, bVar.f183149b) && Intrinsics.f(this.f183150c, bVar.f183150c) && Intrinsics.f(this.d, bVar.d) && Intrinsics.f(this.e, bVar.e) && Intrinsics.f(this.f, bVar.f) && Intrinsics.f(this.f183151g, bVar.f183151g) && Intrinsics.f(this.f183152h, bVar.f183152h) && Intrinsics.f(this.i, bVar.i);
    }

    @Override // kel.g
    public final String g() {
        return this.f183148a.f183146b;
    }

    @Override // kel.g
    public final String getCurrency() {
        return this.f183148a.e;
    }

    @Override // kel.g
    public final String getId() {
        return this.f183148a.f183145a;
    }

    public final int hashCode() {
        return this.i.hashCode() + v7.c(v7.c(v7.c(v7.c(v7.c(p.a.c(v7.c(this.f183148a.hashCode() * 31, 31, this.f183149b), 31, this.f183150c), 31, this.d), 31, this.e), 31, this.f), 31, this.f183151g), 31, this.f183152h);
    }
}
