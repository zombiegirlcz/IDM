package com.revolut.feature.tax_residency.api.navigation;

import com.revolut.feature.tax_residency.api.TaxResidencyDestination$EditTaxResidencies;
import com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig;
import com.revolut.kompot.common.ParcelableDestination;
import com.revolut.retail.core.navigation.ActivityAnimation;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/tax_residency/api/navigation/EditTaxResidencyFeatureConfig;", "Lcom/revolut/kompot/bridge/navigation/KompotBridgeFeatureConfig;", "", "toString", "()Ljava/lang/String;", "feature_tax_residency_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class EditTaxResidencyFeatureConfig extends KompotBridgeFeatureConfig {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Integer f89980g;

    public EditTaxResidencyFeatureConfig() {
        this(3, null);
    }

    @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
    /* JADX INFO: renamed from: c, reason: from getter */
    public final Integer getF89980g() {
        return this.f89980g;
    }

    @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof EditTaxResidencyFeatureConfig) && Intrinsics.f(this.f89980g, ((EditTaxResidencyFeatureConfig) obj2).f89980g);
    }

    @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
    public final int hashCode() {
        Integer num = this.f89980g;
        if (num == null) {
            return 0;
        }
        return num.hashCode();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public EditTaxResidencyFeatureConfig(int i, Integer num) {
        Integer num2 = (i & 2) != 0 ? null : num;
        super((ActivityAnimation) null, (ParcelableDestination) new TaxResidencyDestination$EditTaxResidencies(null, num2), false, num2, 0, 53);
        this.f89980g = num2;
    }
}
