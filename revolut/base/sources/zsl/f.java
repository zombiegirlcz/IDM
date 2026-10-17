package zsl;

import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class f implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TradingAccount.TaxAdvantage f324966a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f324967b;

    public f(TradingAccount.TaxAdvantage tradingAccount, dj0.d remainingTopUpLimit) {
        Intrinsics.checkNotNullParameter(tradingAccount, "tradingAccount");
        Intrinsics.checkNotNullParameter(remainingTopUpLimit, "remainingTopUpLimit");
        this.f324966a = tradingAccount;
        this.f324967b = remainingTopUpLimit;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f324966a, fVar.f324966a) && Intrinsics.f(this.f324967b, fVar.f324967b);
    }

    public final int hashCode() {
        return this.f324967b.hashCode() + (this.f324966a.hashCode() * 31);
    }
}
