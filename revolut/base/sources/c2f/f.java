package c2f;

import com.revolut.feature.trade_rev_points.models.TradeRevPointsAccount;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class f extends g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TradeRevPointsAccount f20771a;

    public f(TradeRevPointsAccount account) {
        Intrinsics.checkNotNullParameter(account, "account");
        this.f20771a = account;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f20771a, ((f) obj2).f20771a);
    }

    public final int hashCode() {
        return this.f20771a.hashCode();
    }
}
