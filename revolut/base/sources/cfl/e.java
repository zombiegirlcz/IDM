package cfl;

import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount;
import java.util.Comparator;

/* JADX INFO: loaded from: classes12.dex */
public final class e implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj2, Object obj3) {
        return cim.b.b(((TradingAccount.Portfolio) obj3).f105212c, ((TradingAccount.Portfolio) obj2).f105212c);
    }
}
