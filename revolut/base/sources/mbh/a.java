package mbh;

import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.feature_market_data_api.navigation.ExchangeBreakdownFeatureConfig;
import com.revolut.shared.feature.market_data.models.domain.models.OrderQuoteParams;
import kotlin.jvm.internal.Intrinsics;
import zh9.u0;

/* JADX INFO: loaded from: classes9.dex */
public final class a extends n1h.b {
    @Override // n1h.b
    public final void Z2(OrderQuoteParams orderQuoteParams, c4i.a transactionType, AnalyticsProduct analyticsProduct) {
        Intrinsics.checkNotNullParameter(orderQuoteParams, "orderQuoteParams");
        Intrinsics.checkNotNullParameter(transactionType, "transactionType");
        Intrinsics.checkNotNullParameter(analyticsProduct, "analyticsProduct");
        A2(u0.c(new ExchangeBreakdownFeatureConfig(orderQuoteParams, null, transactionType, analyticsProduct, null, null, null, null, null, null, 4066)));
    }
}
