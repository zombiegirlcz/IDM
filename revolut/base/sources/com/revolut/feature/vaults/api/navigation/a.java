package com.revolut.feature.vaults.api.navigation;

import aii.e;
import com.revolut.feature.vaults.api.navigation.VaultsKompotFeatureConfig;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class a implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final VaultsKompotFeatureConfig.AddMoney.Destination f94737a;

    public a(VaultsKompotFeatureConfig.AddMoney.Destination destination) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        this.f94737a = destination;
    }

    public final VaultsKompotFeatureConfig.AddMoney.Destination b() {
        return this.f94737a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f94737a, ((a) obj2).f94737a);
    }

    public final int hashCode() {
        return this.f94737a.f94716a.hashCode();
    }
}
