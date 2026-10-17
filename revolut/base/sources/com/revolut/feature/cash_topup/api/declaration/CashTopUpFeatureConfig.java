package com.revolut.feature.cash_topup.api.declaration;

import cb3.a;
import com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig;
import com.revolut.kompot.common.ParcelableDestination;
import com.revolut.retail.core.navigation.ActivityAnimation;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/cash_topup/api/declaration/CashTopUpFeatureConfig;", "Lcom/revolut/kompot/bridge/navigation/KompotBridgeFeatureConfig;", "", "toString", "()Ljava/lang/String;", "feature_cash_topup_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CashTopUpFeatureConfig extends KompotBridgeFeatureConfig {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final a f65579g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CashTopUpFeatureConfig(a flowType) {
        super((ActivityAnimation) null, (ParcelableDestination) new CashTopUpFlowDestination(flowType, false), false, (Integer) null, 0, 60);
        Intrinsics.checkNotNullParameter(flowType, "flowType");
        this.f65579g = flowType;
    }

    @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
    /* JADX INFO: renamed from: a */
    public final ActivityAnimation getF78199g() {
        return null;
    }

    @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof CashTopUpFeatureConfig) && this.f65579g == ((CashTopUpFeatureConfig) obj2).f65579g;
    }

    @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
    public final int hashCode() {
        return this.f65579g.hashCode();
    }
}
