package cxd;

import ip0.v7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class g implements axd.d, zwd.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f109913a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f109914b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dj0.d f109915c;
    public final dj0.d d;
    public final dj0.d e;
    public final dj0.d f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final dj0.d f109916g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final bxd.a f109917h;

    public g(dj0.d minTopUpAmount, dj0.d minStakingAmount, dj0.d maxStakingBalance, dj0.d stakingPocketBalance, dj0.d rawAmount, dj0.d amount, dj0.d sourcePocketBalance) {
        Intrinsics.checkNotNullParameter(minTopUpAmount, "minTopUpAmount");
        Intrinsics.checkNotNullParameter(minStakingAmount, "minStakingAmount");
        Intrinsics.checkNotNullParameter(maxStakingBalance, "maxStakingBalance");
        Intrinsics.checkNotNullParameter(stakingPocketBalance, "stakingPocketBalance");
        Intrinsics.checkNotNullParameter(rawAmount, "rawAmount");
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(sourcePocketBalance, "sourcePocketBalance");
        this.f109913a = minTopUpAmount;
        this.f109914b = minStakingAmount;
        this.f109915c = maxStakingBalance;
        this.d = stakingPocketBalance;
        this.e = rawAmount;
        this.f = amount;
        this.f109916g = sourcePocketBalance;
        this.f109917h = bxd.a.STAKE;
    }

    @Override // axd.d
    public final bxd.a Q0() {
        return this.f109917h;
    }

    @Override // axd.d
    public final dj0.d R0() {
        return this.f109916g;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f109913a, gVar.f109913a) && Intrinsics.f(this.f109914b, gVar.f109914b) && Intrinsics.f(this.f109915c, gVar.f109915c) && Intrinsics.f(this.d, gVar.d) && Intrinsics.f(this.e, gVar.e) && Intrinsics.f(this.f, gVar.f) && Intrinsics.f(this.f109916g, gVar.f109916g);
    }

    @Override // axd.d
    public final dj0.d f() {
        return this.f;
    }

    public final int hashCode() {
        return this.f109916g.hashCode() + v7.c(v7.c(v7.c(v7.c(v7.c(this.f109913a.hashCode() * 31, 31, this.f109914b), 31, this.f109915c), 31, this.d), 31, this.e), 31, this.f);
    }
}
