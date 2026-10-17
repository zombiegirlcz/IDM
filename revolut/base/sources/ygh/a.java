package ygh;

import aii.e;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class a implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TradingAccount.TaxAdvantage f313666a;

    public a(TradingAccount.TaxAdvantage taxAdvantageAccount) {
        Intrinsics.checkNotNullParameter(taxAdvantageAccount, "taxAdvantageAccount");
        this.f313666a = taxAdvantageAccount;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f313666a, ((a) obj2).f313666a);
    }

    public final int hashCode() {
        return this.f313666a.hashCode();
    }
}
