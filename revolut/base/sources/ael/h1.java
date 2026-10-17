package ael;

import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount;
import java.util.Comparator;

/* JADX INFO: loaded from: classes12.dex */
public final class h1 implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj2, Object obj3) {
        return cim.b.b(Boolean.valueOf(!com.revolut.shared.feature.wealth.models.trading_accounts.b.d(((TradingAccount) obj3).c0())), Boolean.valueOf(!com.revolut.shared.feature.wealth.models.trading_accounts.b.d(((TradingAccount) obj2).c0())));
    }
}
