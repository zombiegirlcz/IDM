package com.revolut.feature.junior_settings.api.navigation;

import aii.e;
import com.revolut.feature.junior_settings.api.navigation.JuniorSettingsKompotFeatureConfig;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class a implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f77266a;

    public a(String juniorId) {
        Intrinsics.checkNotNullParameter(juniorId, "juniorId");
        JuniorSettingsKompotFeatureConfig.InitialStep.AppAccess initialStep = JuniorSettingsKompotFeatureConfig.InitialStep.AppAccess.f77260a;
        Intrinsics.checkNotNullParameter(initialStep, "initialStep");
        this.f77266a = juniorId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a) || !Intrinsics.f(this.f77266a, ((a) obj2).f77266a)) {
            return false;
        }
        Object obj3 = JuniorSettingsKompotFeatureConfig.InitialStep.AppAccess.f77260a;
        return obj3.equals(obj3);
    }

    public final int hashCode() {
        return JuniorSettingsKompotFeatureConfig.InitialStep.AppAccess.f77260a.hashCode() + (this.f77266a.hashCode() * 31);
    }
}
