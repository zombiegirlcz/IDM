package bul;

import com.revolut.core.ui_kit.models.HtmlLocalisedClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature_market_data_api.navigation.ExchangeBreakdownFeatureConfig;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.shared.feature.market_data.models.domain.models.OrderQuote;
import com.revolut.shared.feature.market_data.models.domain.models.OrderQuoteParams;
import com.revolut.shared.feature.wealth.models.config.TradingLegalEntityInformation;
import com.revolut.trading.orders.R$string;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zh9.u0;

/* JADX INFO: loaded from: classes12.dex */
public final class e {
    public e(lul.c cbpDisclosureProvider) {
        Intrinsics.checkNotNullParameter(cbpDisclosureProvider, "cbpDisclosureProvider");
    }

    public final BridgeDestination a(OrderQuoteParams orderQuoteParams, OrderQuote orderQuote, rcf.a aVar, TradingLegalEntityInformation tradingLegalEntityInformation) {
        HtmlLocalisedClause htmlLocalisedClause;
        Intrinsics.checkNotNullParameter(orderQuoteParams, "orderQuoteParams");
        Intrinsics.checkNotNullParameter(tradingLegalEntityInformation, "tradingLegalEntityInformation");
        HtmlLocalisedClause htmlLocalisedClauseA = null;
        TextLocalisedClause textLocalisedClause = c8g.a.v(orderQuoteParams) ? new TextLocalisedClause(R$string.trading_orders_exchange_breakdown_crypto_title, null, null, 14) : null;
        TextLocalisedClause textLocalisedClause2 = c8g.a.v(orderQuoteParams) ? new TextLocalisedClause(R$string.trading_orders_fees_breakdown_crypto_title, null, null, 14) : null;
        if (aVar != rcf.a.TRADING_GIA_CBP) {
            Intrinsics.checkNotNullParameter(orderQuoteParams, "<this>");
            if (cp5.d.A(orderQuoteParams.f104783a) && cp5.d.A(orderQuoteParams.f104784b)) {
                htmlLocalisedClause = new HtmlLocalisedClause(R$string.trading_orders_exchange_breakdown_disclosure, (List) null, (Integer) null, (Object) null, 30);
            }
            return u0.c(new ExchangeBreakdownFeatureConfig(orderQuoteParams, orderQuote, c4i.a.EXCHANGE, null, null, null, null, textLocalisedClause, textLocalisedClause2, htmlLocalisedClause, 2296));
        }
        htmlLocalisedClauseA = lul.c.a(tradingLegalEntityInformation);
        htmlLocalisedClause = htmlLocalisedClauseA;
        return u0.c(new ExchangeBreakdownFeatureConfig(orderQuoteParams, orderQuote, c4i.a.EXCHANGE, null, null, null, null, textLocalisedClause, textLocalisedClause2, htmlLocalisedClause, 2296));
    }
}
