package mul;

import kel.n;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class f extends g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yzg.d f209053a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f209054b;

    public f(yzg.d freeStocksCampaign, n stockHolding) {
        Intrinsics.checkNotNullParameter(freeStocksCampaign, "freeStocksCampaign");
        Intrinsics.checkNotNullParameter(stockHolding, "stockHolding");
        this.f209053a = freeStocksCampaign;
        this.f209054b = stockHolding;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f209053a, fVar.f209053a) && Intrinsics.f(this.f209054b, fVar.f209054b);
    }

    public final int hashCode() {
        return this.f209054b.hashCode() + (this.f209053a.hashCode() * 31);
    }
}
