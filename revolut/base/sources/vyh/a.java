package vyh;

import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.feature.staking.api.model.StakingPocket;
import ip0.v7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f293322a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final StakingPocket f293323b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dj0.d f293324c;
    public final AnalyticsProduct.Retail d;

    public a(dj0.d pocketBalance, StakingPocket stakingPocket, dj0.d blockedByOpenRevXOrder, AnalyticsProduct.Retail analyticsProduct) {
        Intrinsics.checkNotNullParameter(pocketBalance, "pocketBalance");
        Intrinsics.checkNotNullParameter(blockedByOpenRevXOrder, "blockedByOpenRevXOrder");
        Intrinsics.checkNotNullParameter(analyticsProduct, "analyticsProduct");
        this.f293322a = pocketBalance;
        this.f293323b = stakingPocket;
        this.f293324c = blockedByOpenRevXOrder;
        this.d = analyticsProduct;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f293322a, aVar.f293322a) && Intrinsics.f(this.f293323b, aVar.f293323b) && Intrinsics.f(this.f293324c, aVar.f293324c) && this.d.equals(aVar.d);
    }

    public final int hashCode() {
        int iHashCode = this.f293322a.hashCode() * 31;
        StakingPocket stakingPocket = this.f293323b;
        return (this.d.f50300a.hashCode() + v7.c((iHashCode + (stakingPocket == null ? 0 : stakingPocket.hashCode())) * 31, 31, this.f293324c)) * 31;
    }
}
