package com.revolut.feature.blocked_merchants.api.navigation;

import com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig;
import com.revolut.kompot.common.ParcelableDestination;
import com.revolut.retail.core.navigation.ActivityAnimation;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/revolut/feature/blocked_merchants/api/navigation/BlockedMerchantsListFeatureConfig;", "Lcom/revolut/kompot/bridge/navigation/KompotBridgeFeatureConfig;", "feature_blocked_merchants_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class BlockedMerchantsListFeatureConfig extends KompotBridgeFeatureConfig {
    public BlockedMerchantsListFeatureConfig() {
        this(0);
    }

    public BlockedMerchantsListFeatureConfig(int i) {
        super((ActivityAnimation) null, (ParcelableDestination) new BlockedMerchantsListFlowDestination(0), false, (Integer) null, 0, 52);
    }
}
