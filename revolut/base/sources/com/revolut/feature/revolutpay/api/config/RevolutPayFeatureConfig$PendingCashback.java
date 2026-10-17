package com.revolut.feature.revolutpay.api.config;

import com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig;
import com.revolut.kompot.common.ParcelableDestination;
import com.revolut.retail.core.navigation.ActivityAnimation;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/revolutpay/api/config/RevolutPayFeatureConfig$PendingCashback", "Lcom/revolut/kompot/bridge/navigation/KompotBridgeFeatureConfig;", "", "toString", "()Ljava/lang/String;", "feature_revolut_pay_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class RevolutPayFeatureConfig$PendingCashback extends KompotBridgeFeatureConfig {
    public RevolutPayFeatureConfig$PendingCashback() {
        this(0);
    }

    @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
    /* JADX INFO: renamed from: a */
    public final ActivityAnimation getF76625j() {
        return null;
    }

    @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
    public final boolean equals(Object obj2) {
        return this == obj2 || (obj2 instanceof RevolutPayFeatureConfig$PendingCashback);
    }

    @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
    public final int hashCode() {
        return 0;
    }

    public RevolutPayFeatureConfig$PendingCashback(int i) {
        super((ActivityAnimation) null, (ParcelableDestination) RevolutPayFeatureConfig$RevolutPayPendingCashbackDestination.f84293a, false, (Integer) null, 0, 60);
    }
}
