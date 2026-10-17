package rhh;

import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class d implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TradingAccount.TaxAdvantage f254474a;

    public d(TradingAccount.TaxAdvantage account) {
        Intrinsics.checkNotNullParameter(account, "account");
        this.f254474a = account;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f254474a, ((d) obj2).f254474a);
    }

    public final int hashCode() {
        return this.f254474a.hashCode();
    }
}
