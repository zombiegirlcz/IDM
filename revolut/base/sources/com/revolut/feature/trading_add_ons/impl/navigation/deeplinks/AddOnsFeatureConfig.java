package com.revolut.feature.trading_add_ons.impl.navigation.deeplinks;

import com.revolut.feature.trading_add_ons.navigation.TradingAddOnsDestination$AddOnsMainDestination;
import com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig;
import com.revolut.kompot.common.ParcelableDestination;
import com.revolut.retail.core.navigation.ActivityAnimation;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/revolut/feature/trading_add_ons/impl/navigation/deeplinks/AddOnsFeatureConfig;", "Lcom/revolut/kompot/bridge/navigation/KompotBridgeFeatureConfig;", "feature_trading_add_ons_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AddOnsFeatureConfig extends KompotBridgeFeatureConfig {
    public AddOnsFeatureConfig() {
        this(0);
    }

    public AddOnsFeatureConfig(int i) {
        super((ActivityAnimation) null, (ParcelableDestination) new TradingAddOnsDestination$AddOnsMainDestination(0), false, (Integer) null, 0, 60);
    }
}
