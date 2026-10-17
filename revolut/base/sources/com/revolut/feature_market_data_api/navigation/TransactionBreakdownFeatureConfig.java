package com.revolut.feature_market_data_api.navigation;

import c4i.a;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.feature_market_data_api.models.OrderQuoteParamsVariant;
import com.revolut.retail.core.navigation.feature.FeatureConfig;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0007\u0004\u0005\u0006\u0007\b\t\n¨\u0006\u000b"}, d2 = {"Lcom/revolut/feature_market_data_api/navigation/TransactionBreakdownFeatureConfig;", "Lcom/revolut/retail/core/navigation/feature/FeatureConfig;", "<init>", "()V", "Lcom/revolut/feature_market_data_api/navigation/ChargeDescriptionFeatureConfig;", "Lcom/revolut/feature_market_data_api/navigation/ExchangeBreakdownFeatureConfig;", "Lcom/revolut/feature_market_data_api/navigation/ExchangePriceDescriptionFeatureConfig;", "Lcom/revolut/feature_market_data_api/navigation/FeeBreakdownFeatureConfig;", "Lcom/revolut/feature_market_data_api/navigation/FeeBreakdownTransferFeatureConfig;", "Lcom/revolut/feature_market_data_api/navigation/HistoricFeeBreakdownFeatureConfig;", "Lcom/revolut/feature_market_data_api/navigation/InterestDescriptionFeatureConfig;", "feature_market_data_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class TransactionBreakdownFeatureConfig implements FeatureConfig {
    private TransactionBreakdownFeatureConfig() {
    }

    public abstract AnalyticsProduct P();

    public abstract OrderQuoteParamsVariant a();

    public abstract a b();
}
