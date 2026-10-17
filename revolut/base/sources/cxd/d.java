package cxd;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class d implements yqi.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f109911a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f109912b;

    public d(dj0.d maxStakableAmount, dj0.d maxStakingBalance) {
        Intrinsics.checkNotNullParameter(maxStakableAmount, "maxStakableAmount");
        Intrinsics.checkNotNullParameter(maxStakingBalance, "maxStakingBalance");
        this.f109911a = maxStakableAmount;
        this.f109912b = maxStakingBalance;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f109911a, dVar.f109911a) && Intrinsics.f(this.f109912b, dVar.f109912b);
    }

    public final int hashCode() {
        return this.f109912b.hashCode() + (this.f109911a.hashCode() * 31);
    }
}
