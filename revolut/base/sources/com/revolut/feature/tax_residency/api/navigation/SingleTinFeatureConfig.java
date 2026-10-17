package com.revolut.feature.tax_residency.api.navigation;

import com.revolut.feature.tax_residency.api.TaxResidencyDestination$SingleTinSelection;
import com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig;
import com.revolut.kompot.common.ParcelableDestination;
import com.revolut.retail.core.navigation.ActivityAnimation;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import wi0.b;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/tax_residency/api/navigation/SingleTinFeatureConfig;", "Lcom/revolut/kompot/bridge/navigation/KompotBridgeFeatureConfig;", "", "toString", "()Ljava/lang/String;", "feature_tax_residency_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SingleTinFeatureConfig extends KompotBridgeFeatureConfig {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final b f89981g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Integer f89982h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SingleTinFeatureConfig(b countryCode) {
        super((ActivityAnimation) null, (ParcelableDestination) new TaxResidencyDestination$SingleTinSelection(countryCode, 222789), false, (Integer) 222789, 0, 53);
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        this.f89981g = countryCode;
        this.f89982h = 222789;
    }

    @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
    /* JADX INFO: renamed from: c, reason: from getter */
    public final Integer getF89982h() {
        return this.f89982h;
    }

    @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof SingleTinFeatureConfig)) {
            return false;
        }
        SingleTinFeatureConfig singleTinFeatureConfig = (SingleTinFeatureConfig) obj2;
        return Intrinsics.f(this.f89981g, singleTinFeatureConfig.f89981g) && Intrinsics.f(this.f89982h, singleTinFeatureConfig.f89982h);
    }

    @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
    public final int hashCode() {
        int iHashCode = this.f89981g.f297794a.hashCode() * 31;
        Integer num = this.f89982h;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }
}
