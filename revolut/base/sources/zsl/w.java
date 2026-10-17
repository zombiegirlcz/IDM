package zsl;

import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class w extends x {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f324988b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TradingAccount.TaxAdvantage f324989c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(TradingAccount.TaxAdvantage tradingAccount, dj0.d remainingLimit) {
        super(false);
        Intrinsics.checkNotNullParameter(remainingLimit, "remainingLimit");
        Intrinsics.checkNotNullParameter(tradingAccount, "tradingAccount");
        this.f324988b = remainingLimit;
        this.f324989c = tradingAccount;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof w)) {
            return false;
        }
        w wVar = (w) obj2;
        return Intrinsics.f(this.f324988b, wVar.f324988b) && Intrinsics.f(this.f324989c, wVar.f324989c);
    }

    public final int hashCode() {
        return this.f324989c.hashCode() + (this.f324988b.hashCode() * 31);
    }
}
