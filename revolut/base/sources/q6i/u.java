package q6i;

import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class u implements v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TradingAccount.TaxAdvantage f242637a;

    public u(TradingAccount.TaxAdvantage tradingAccount) {
        Intrinsics.checkNotNullParameter(tradingAccount, "tradingAccount");
        this.f242637a = tradingAccount;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof u) && Intrinsics.f(this.f242637a, ((u) obj2).f242637a);
    }

    public final int hashCode() {
        return this.f242637a.hashCode();
    }
}
