package com.revolut.feature.subaccount.api;

import com.revolut.feature.subaccount.api.models.SubaccountType;
import com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig;
import com.revolut.kompot.common.ParcelableDestination;
import com.revolut.retail.core.navigation.ActivityAnimation;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/subaccount/api/SubaccountDetailsFeatureConfig;", "Lcom/revolut/kompot/bridge/navigation/KompotBridgeFeatureConfig;", "", "toString", "()Ljava/lang/String;", "feature_subaccount_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SubaccountDetailsFeatureConfig extends KompotBridgeFeatureConfig {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f88946g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final SubaccountType f88947h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubaccountDetailsFeatureConfig(String id10, SubaccountType subaccountType) {
        super((ActivityAnimation) null, (ParcelableDestination) new SubaccountDetailsScreenDestination(id10, subaccountType), false, (Integer) null, 0, 61);
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(subaccountType, "subaccountType");
        this.f88946g = id10;
        this.f88947h = subaccountType;
    }

    @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof SubaccountDetailsFeatureConfig)) {
            return false;
        }
        SubaccountDetailsFeatureConfig subaccountDetailsFeatureConfig = (SubaccountDetailsFeatureConfig) obj2;
        return Intrinsics.f(this.f88946g, subaccountDetailsFeatureConfig.f88946g) && Intrinsics.f(this.f88947h, subaccountDetailsFeatureConfig.f88947h);
    }

    @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
    public final int hashCode() {
        return this.f88947h.hashCode() + (this.f88946g.hashCode() * 31);
    }
}
