package rhh;

import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class b implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TradingAccount.TaxAdvantage f254472a;

    public b(TradingAccount.TaxAdvantage account) {
        Intrinsics.checkNotNullParameter(account, "account");
        this.f254472a = account;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f254472a, ((b) obj2).f254472a);
    }

    public final int hashCode() {
        return this.f254472a.hashCode();
    }
}
