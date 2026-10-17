package orb;

import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount;
import java.math.BigDecimal;
import kotlinx.coroutines.flow.Flow;
import nel.s0;

/* JADX INFO: loaded from: classes6.dex */
public interface j {
    BigDecimal a(qrb.e eVar);

    Flow b(bfl.g gVar, s0 s0Var);

    Flow c(TradingAccount tradingAccount, nel.n nVar);

    akg.n d(bfl.g gVar, qrb.k kVar, BigDecimal bigDecimal, qrb.b bVar);

    Object e(bfl.g gVar, qrb.k kVar, qrb.e eVar, String str, gim.c cVar);
}
