package npc;

import ip0.v7;
import kotlin.jvm.internal.Intrinsics;
import t1h.p;

/* JADX INFO: loaded from: classes6.dex */
public final class i implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f218190a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f218191b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dj0.d f218192c;

    public i(dj0.d portfolioBalanceAmount, dj0.d pendingWithdrawalsAmount, dj0.d availableToWithdraw) {
        Intrinsics.checkNotNullParameter(portfolioBalanceAmount, "portfolioBalanceAmount");
        Intrinsics.checkNotNullParameter(pendingWithdrawalsAmount, "pendingWithdrawalsAmount");
        Intrinsics.checkNotNullParameter(availableToWithdraw, "availableToWithdraw");
        this.f218190a = portfolioBalanceAmount;
        this.f218191b = pendingWithdrawalsAmount;
        this.f218192c = availableToWithdraw;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f218190a, iVar.f218190a) && Intrinsics.f(this.f218191b, iVar.f218191b) && Intrinsics.f(this.f218192c, iVar.f218192c);
    }

    public final int hashCode() {
        return this.f218192c.hashCode() + v7.c(this.f218190a.hashCode() * 31, 31, this.f218191b);
    }
}
