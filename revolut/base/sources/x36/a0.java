package x36;

import com.revolut.core.model.account.AccountId;
import com.revolut.feature.defi.exchange.impl.ui.exchange_amount.model.DeFiMoneyDetails;
import com.revolut.feature_crypto_order_flow.api.exchange.CryptoExchangeContract$MoneyDetails;
import com.revolut.shared.feature.market_data.models.domain.models.Amount;
import com.revolut.shared.feature.market_data.models.domain.models.Asset;
import java.math.BigDecimal;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a0 {
    public static final Amount a(ej0.b bVar) {
        BigDecimal bigDecimal = bVar.f126703a;
        xi0.b bVar2 = bVar.f126704b;
        return new Amount(bigDecimal, new Asset(cp5.d.A(bVar2) ? f8l.c.FIAT : f8l.c.CRYPTO, cp5.d.J(bVar2), bVar2));
    }

    public static final com.revolut.feature_crypto_order_flow.api.exchange.a b(DeFiMoneyDetails deFiMoneyDetails) {
        xi0.b bVar = deFiMoneyDetails.f71768a;
        BigInteger bigInteger = deFiMoneyDetails.f71769b;
        return new com.revolut.feature_crypto_order_flow.api.exchange.a(bVar, bigInteger != null ? new q0i.a(bigInteger) : null, deFiMoneyDetails.f71770c, deFiMoneyDetails.d, new CryptoExchangeContract$MoneyDetails.BalanceIdentifier.Pocket(AccountId.Personal.f51414a, null));
    }
}
