package a2f;

import com.revolut.feature.trade_rev_points.models.TradeRevPointsAccount;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class g implements aii.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TradeRevPointsAccount f812a;

    public g(TradeRevPointsAccount account) {
        Intrinsics.checkNotNullParameter(account, "account");
        this.f812a = account;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f812a, ((g) obj2).f812a);
    }

    public final int hashCode() {
        return this.f812a.hashCode();
    }
}
