package zhh;

import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount;
import java.util.Set;
import kotlinx.coroutines.flow.Flow;
import zhm.h0;

/* JADX INFO: loaded from: classes10.dex */
public interface a {
    Flow a(TradingAccount tradingAccount);

    default Set b() {
        return h0.f322473a;
    }
}
