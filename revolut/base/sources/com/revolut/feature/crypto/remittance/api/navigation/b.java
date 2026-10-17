package com.revolut.feature.crypto.remittance.api.navigation;

import aii.e;
import com.revolut.feature.crypto.remittance.api.navigation.CryptoRemittanceKompotFeatureConfig;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CryptoRemittanceKompotFeatureConfig.CurrencyPickerDestination.InputData f70952a;

    public b(CryptoRemittanceKompotFeatureConfig.CurrencyPickerDestination.InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f70952a = inputData;
    }

    public final CryptoRemittanceKompotFeatureConfig.CurrencyPickerDestination.InputData b() {
        return this.f70952a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f70952a, ((b) obj2).f70952a);
    }

    public final int hashCode() {
        return this.f70952a.hashCode();
    }
}
