package bul;

import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.HtmlLocalisedClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature_market_data_api.navigation.FeeBreakdownFeatureConfig;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.shared.feature.market_data.models.domain.models.ChargeBreakdown;
import com.revolut.shared.feature.market_data.models.domain.models.OrderQuoteParams;
import com.revolut.trading.orders.R$string;
import com.youTransactor.uCube.rpc.Constants;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class j {
    public static FeatureCommand a(OrderQuoteParams orderQuoteParams, ChargeBreakdown chargeBreakdown) {
        Intrinsics.checkNotNullParameter(orderQuoteParams, "orderQuoteParams");
        TextLocalisedClause textLocalisedClause = c8g.a.v(orderQuoteParams) ? new TextLocalisedClause(R$string.trading_orders_fees_breakdown_crypto_title, null, null, 14) : new TextLocalisedClause(R$string.trading_orders_exchange_fees_breakdown_title, null, null, 14);
        Intrinsics.checkNotNullParameter(orderQuoteParams, "<this>");
        return gc0.c.f(new FeeBreakdownFeatureConfig(orderQuoteParams, chargeBreakdown, c4i.a.EXCHANGE, (AnalyticsProduct.Retail) null, (xi0.b) null, false, (Clause) textLocalisedClause, (cp5.d.A(orderQuoteParams.f104783a) && cp5.d.A(orderQuoteParams.f104784b)) ? new HtmlLocalisedClause(R$string.trading_orders_exchange_breakdown_disclosure, (List) null, (Integer) null, (Object) null, 30) : null, Constants.TAG_FULL_SVPP_IDENTIFICATION));
    }
}
