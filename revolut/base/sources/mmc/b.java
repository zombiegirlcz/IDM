package mmc;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f207188a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final yvh.b f207189b;

    public b(String portfolioId, yvh.b activeAutoInvest) {
        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
        Intrinsics.checkNotNullParameter(activeAutoInvest, "activeAutoInvest");
        this.f207188a = portfolioId;
        this.f207189b = activeAutoInvest;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f207188a, bVar.f207188a) && Intrinsics.f(this.f207189b, bVar.f207189b);
    }

    public final int hashCode() {
        return this.f207189b.hashCode() + (this.f207188a.hashCode() * 31);
    }
}
