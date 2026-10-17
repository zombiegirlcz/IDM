package e2f;

import com.revolut.feature.trade_rev_points.models.TradeRevPointsAccount;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class u implements v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TradeRevPointsAccount f122085a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f122086b;

    public u(TradeRevPointsAccount account, String agentId) {
        Intrinsics.checkNotNullParameter(account, "account");
        Intrinsics.checkNotNullParameter(agentId, "agentId");
        this.f122085a = account;
        this.f122086b = agentId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof u)) {
            return false;
        }
        u uVar = (u) obj2;
        return Intrinsics.f(this.f122085a, uVar.f122085a) && Intrinsics.f(this.f122086b, uVar.f122086b);
    }

    public final int hashCode() {
        return this.f122086b.hashCode() + (this.f122085a.hashCode() * 31);
    }
}
