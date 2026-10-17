package m6i;

import com.revolut.feature_move_money.api.model.AccountSource;
import com.revolut.feature_move_money.api.model.AccountWrapper;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount;

/* JADX INFO: loaded from: classes10.dex */
public abstract class a {
    public static final boolean a(AccountWrapper accountWrapper) {
        AccountSource accountSource = accountWrapper != null ? accountWrapper.d : null;
        AccountSource.InvestCashHolding investCashHolding = accountSource instanceof AccountSource.InvestCashHolding ? (AccountSource.InvestCashHolding) accountSource : null;
        return (investCashHolding != null ? investCashHolding.f97198a : null) instanceof TradingAccount.Margin;
    }
}
