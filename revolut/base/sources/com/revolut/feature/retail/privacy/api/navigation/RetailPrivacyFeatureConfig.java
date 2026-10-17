package com.revolut.feature.retail.privacy.api.navigation;

import com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig;
import com.revolut.kompot.common.ParcelableDestination;
import com.revolut.retail.core.navigation.ActivityAnimation;
import jcb.a;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/revolut/feature/retail/privacy/api/navigation/RetailPrivacyFeatureConfig;", "Lcom/revolut/kompot/bridge/navigation/KompotBridgeFeatureConfig;", "feature_retail_privacy_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class RetailPrivacyFeatureConfig extends KompotBridgeFeatureConfig {
    public RetailPrivacyFeatureConfig() {
        this((a) null);
    }

    public /* synthetic */ RetailPrivacyFeatureConfig(int i) {
        this((a) null);
    }

    public RetailPrivacyFeatureConfig(a aVar) {
        super((ActivityAnimation) null, (ParcelableDestination) new RetailPrivacyDestination(aVar), false, (Integer) null, 0, 61);
    }
}
