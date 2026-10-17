package com.revolut.retail.feature.beneficiary.api.navigation;

import aii.e;
import com.revolut.retail.feature.beneficiary.api.navigation.BeneficiaryCreationKompotInputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class a implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BeneficiaryCreationKompotInputData.CreationConfiguration f99651a;

    public a(BeneficiaryCreationKompotInputData.CreationConfiguration creationConfig) {
        Intrinsics.checkNotNullParameter(creationConfig, "creationConfig");
        this.f99651a = creationConfig;
    }

    public final BeneficiaryCreationKompotInputData.CreationConfiguration b() {
        return this.f99651a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f99651a, ((a) obj2).f99651a);
    }

    public final int hashCode() {
        return this.f99651a.hashCode();
    }
}
