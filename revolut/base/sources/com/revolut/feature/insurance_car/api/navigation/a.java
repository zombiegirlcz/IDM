package com.revolut.feature.insurance_car.api.navigation;

import com.revolut.feature.insurance_car.api.navigation.InsuranceCarFeatureConfig;
import com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig;
import com.revolut.kompot.common.ParcelableDestination;
import com.revolut.retail.core.navigation.ActivityAnimation;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.v;

/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InsuranceCarFeatureConfig.PolicyDestination f75159a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f75160b;

    public a(InsuranceCarFeatureConfig.PolicyDestination inner) {
        Intrinsics.checkNotNullParameter(inner, "inner");
        this.f75159a = inner;
        this.f75160b = v.k(new InsuranceCarFeatureConfig.Home(null), new KompotBridgeFeatureConfig((ActivityAnimation) null, (ParcelableDestination) inner, false, (Integer) null, 0, 61));
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && this.f75159a.equals(((a) obj2).f75159a);
    }

    public final int hashCode() {
        return this.f75159a.hashCode();
    }
}
