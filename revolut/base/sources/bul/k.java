package bul;

import com.revolut.feature.trading_asset_quotes.api.domain.models.FiatExchangeOrderQuoteParams;
import com.revolut.feature.trading_orders.common.models.SourcePocketWrapper;
import com.revolut.shared.feature.market_data.models.domain.models.Amount;
import com.revolut.shared.feature.market_data.models.domain.models.OrderQuote;
import com.revolut.shared.feature.market_data.models.domain.models.OrderQuoteParams;
import d9.e1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class k {
    public static FiatExchangeOrderQuoteParams a(OrderQuote orderQuote, SourcePocketWrapper sourcePocketWrapper) {
        Intrinsics.checkNotNullParameter(orderQuote, "orderQuote");
        Intrinsics.checkNotNullParameter(sourcePocketWrapper, "sourcePocketWrapper");
        Amount amountV = e1.v(orderQuote);
        OrderQuoteParams orderQuoteParams = new OrderQuoteParams(sourcePocketWrapper.f91795b.f104718b.f104721c, amountV.f104718b.f104721c, f8l.e.MARKET, amountV.f104717a, f8l.b.TO, f8l.b.FROM, null, false, null, oc.c.J(sourcePocketWrapper), null, null, null, null, 15616);
        rcf.a aVarK = oc.c.K(sourcePocketWrapper);
        Intrinsics.checkNotNullParameter(orderQuote, "<this>");
        f8l.c cVar = e1.k(orderQuote).f104719a;
        f8l.c cVar2 = f8l.c.SECURITY;
        return new FiatExchangeOrderQuoteParams(orderQuoteParams, aVarK, (cVar == cVar2 || e1.t(orderQuote).f104719a == cVar2) ? e1.l(orderQuote).f104718b.f104721c.f306286a : null);
    }
}
