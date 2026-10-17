package l2b;

import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount;
import java.util.Comparator;

/* JADX INFO: loaded from: classes6.dex */
public final class c implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj2, Object obj3) {
        return cim.b.b(((TradingAccount.Portfolio) obj3).f105212c, ((TradingAccount.Portfolio) obj2).f105212c);
    }
}
