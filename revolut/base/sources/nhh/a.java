package nhh;

import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount;
import dj0.d;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public abstract class a {
    public static final bhh.a a(TradingAccount.TaxAdvantage.Limit.TopUpLimit topUpLimit, TradingAccount.TaxAdvantage account) {
        double d;
        Intrinsics.checkNotNullParameter(topUpLimit, "<this>");
        Intrinsics.checkNotNullParameter(account, "account");
        d dVar = topUpLimit.f105247a;
        d dVar2 = topUpLimit.f105248b;
        if ((account instanceof TradingAccount.TaxAdvantage.JIsa) || (account instanceof TradingAccount.TaxAdvantage.Isa)) {
            d = 0.75d;
        } else {
            if (!(account instanceof TradingAccount.TaxAdvantage.Pea) && !(account instanceof TradingAccount.TaxAdvantage.Unknown)) {
                throw new NoWhenBranchMatchedException();
            }
            d = 0.85d;
        }
        return new bhh.a(account, dVar, dVar2, dVar2.f115082a / dVar.f115082a, Double.valueOf(d), topUpLimit.d);
    }
}
