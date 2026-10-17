package dxd;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class d implements yqi.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f120937a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f120938b;

    public d(dj0.d minUnstakingBalance, dj0.d stakingBalance) {
        Intrinsics.checkNotNullParameter(minUnstakingBalance, "minUnstakingBalance");
        Intrinsics.checkNotNullParameter(stakingBalance, "stakingBalance");
        this.f120937a = minUnstakingBalance;
        this.f120938b = stakingBalance;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f120937a, dVar.f120937a) && Intrinsics.f(this.f120938b, dVar.f120938b);
    }

    public final int hashCode() {
        return this.f120938b.hashCode() + (this.f120937a.hashCode() * 31);
    }
}
