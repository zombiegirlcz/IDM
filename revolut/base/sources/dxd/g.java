package dxd;

import ip0.v7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class g implements axd.d, zwd.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f120939a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f120940b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dj0.d f120941c;
    public final dj0.d d;
    public final bxd.a e;

    public g(dj0.d minWithdrawAmount, dj0.d minStakingAmount, dj0.d amount, dj0.d sourcePocketBalance) {
        Intrinsics.checkNotNullParameter(minWithdrawAmount, "minWithdrawAmount");
        Intrinsics.checkNotNullParameter(minStakingAmount, "minStakingAmount");
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(sourcePocketBalance, "sourcePocketBalance");
        this.f120939a = minWithdrawAmount;
        this.f120940b = minStakingAmount;
        this.f120941c = amount;
        this.d = sourcePocketBalance;
        this.e = bxd.a.UNSTAKE;
    }

    @Override // axd.d
    public final bxd.a Q0() {
        return this.e;
    }

    @Override // axd.d
    public final dj0.d R0() {
        return this.d;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f120939a, gVar.f120939a) && Intrinsics.f(this.f120940b, gVar.f120940b) && Intrinsics.f(this.f120941c, gVar.f120941c) && Intrinsics.f(this.d, gVar.d);
    }

    @Override // axd.d
    public final dj0.d f() {
        return this.f120941c;
    }

    public final int hashCode() {
        return this.d.hashCode() + v7.c(v7.c(this.f120939a.hashCode() * 31, 31, this.f120940b), 31, this.f120941c);
    }
}
