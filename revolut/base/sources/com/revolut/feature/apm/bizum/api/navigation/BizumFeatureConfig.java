package com.revolut.feature.apm.bizum.api.navigation;

import com.revolut.feature.apm.bizum.api.navigation.BizumFlowInputData;
import com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig;
import com.revolut.kompot.common.ParcelableDestination;
import com.revolut.retail.core.navigation.ActivityAnimation;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/bizum/api/navigation/BizumFeatureConfig;", "Lcom/revolut/kompot/bridge/navigation/KompotBridgeFeatureConfig;", "", "toString", "()Ljava/lang/String;", "feature_apm_bizum_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BizumFeatureConfig extends KompotBridgeFeatureConfig {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final BizumFlowInputData.StartType f61554g;

    public BizumFeatureConfig() {
        this(0);
    }

    @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof BizumFeatureConfig) && Intrinsics.f(this.f61554g, ((BizumFeatureConfig) obj2).f61554g);
    }

    @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
    public final int hashCode() {
        return this.f61554g.hashCode();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public BizumFeatureConfig(int i) {
        BizumFlowInputData.StartType.Area startType = BizumFlowInputData.StartType.Area.f61557a;
        Intrinsics.checkNotNullParameter(startType, "startType");
        super((ActivityAnimation) null, (ParcelableDestination) new BizumFlowDestination(startType), false, (Integer) null, 0, 61);
        this.f61554g = startType;
    }
}
