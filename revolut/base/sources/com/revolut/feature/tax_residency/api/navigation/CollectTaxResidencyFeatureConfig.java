package com.revolut.feature.tax_residency.api.navigation;

import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.feature.tax_residency.api.TaxResidencyDestination$CollectTaxResidencies;
import com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig;
import com.revolut.kompot.common.ParcelableDestination;
import com.revolut.retail.core.navigation.ActivityAnimation;
import com.revolut.retail.core.navigation.NaviCommand;
import j6.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/tax_residency/api/navigation/CollectTaxResidencyFeatureConfig;", "Lcom/revolut/kompot/bridge/navigation/KompotBridgeFeatureConfig;", "", "toString", "()Ljava/lang/String;", "feature_tax_residency_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CollectTaxResidencyFeatureConfig extends KompotBridgeFeatureConfig {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AnalyticsProduct f89977g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final NaviCommand f89978h;
    public final boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f89979j;

    /* JADX WARN: Illegal instructions before constructor call */
    public CollectTaxResidencyFeatureConfig(AnalyticsProduct analyticsProduct, NaviCommand naviCommand, boolean z, int i) {
        boolean z3 = (i & 64) != 0 ? false : z;
        super((ActivityAnimation) null, (ParcelableDestination) new TaxResidencyDestination$CollectTaxResidencies(null, false, false, analyticsProduct, naviCommand, true, z3), false, (Integer) null, 0, 61);
        this.f89977g = analyticsProduct;
        this.f89978h = naviCommand;
        this.i = true;
        this.f89979j = z3;
    }

    @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CollectTaxResidencyFeatureConfig)) {
            return false;
        }
        CollectTaxResidencyFeatureConfig collectTaxResidencyFeatureConfig = (CollectTaxResidencyFeatureConfig) obj2;
        return Intrinsics.f(this.f89977g, collectTaxResidencyFeatureConfig.f89977g) && Intrinsics.f(this.f89978h, collectTaxResidencyFeatureConfig.f89978h) && this.i == collectTaxResidencyFeatureConfig.i && this.f89979j == collectTaxResidencyFeatureConfig.f89979j;
    }

    @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
    public final int hashCode() {
        int iC = a.c(Boolean.hashCode(false) * 31, 31, false);
        AnalyticsProduct analyticsProduct = this.f89977g;
        int iHashCode = (iC + (analyticsProduct == null ? 0 : analyticsProduct.hashCode())) * 31;
        NaviCommand naviCommand = this.f89978h;
        return Boolean.hashCode(this.f89979j) + a.c((iHashCode + (naviCommand != null ? naviCommand.hashCode() : 0)) * 31, 31, this.i);
    }
}
