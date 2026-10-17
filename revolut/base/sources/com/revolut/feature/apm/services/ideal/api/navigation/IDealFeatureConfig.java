package com.revolut.feature.apm.services.ideal.api.navigation;

import com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig;
import com.revolut.kompot.common.ParcelableDestination;
import com.revolut.retail.core.navigation.ActivityAnimation;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/services/ideal/api/navigation/IDealFeatureConfig;", "Lcom/revolut/kompot/bridge/navigation/KompotBridgeFeatureConfig;", "", "toString", "()Ljava/lang/String;", "feature_apm_services_ideal_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class IDealFeatureConfig extends KompotBridgeFeatureConfig {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final IDealFlowDestination f62828g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDealFeatureConfig(IDealFlowDestination iDealDestination) {
        super((ActivityAnimation) null, (ParcelableDestination) iDealDestination, false, (Integer) null, 0, 61);
        Intrinsics.checkNotNullParameter(iDealDestination, "iDealDestination");
        this.f62828g = iDealDestination;
    }

    @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof IDealFeatureConfig) && Intrinsics.f(this.f62828g, ((IDealFeatureConfig) obj2).f62828g);
    }

    @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
    public final int hashCode() {
        return this.f62828g.f62829b.hashCode();
    }
}
