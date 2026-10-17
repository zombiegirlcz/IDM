package com.revolut.feature_crypto_picker.api;

import aii.e;
import com.revolut.feature_crypto_picker.api.CryptoPickerDestination;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class a implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CryptoPickerDestination.CryptoPickerInputData f96808a;

    public a(CryptoPickerDestination.CryptoPickerInputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f96808a = inputData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f96808a, ((a) obj2).f96808a);
    }

    public final int hashCode() {
        return this.f96808a.hashCode();
    }

    public a() {
        this(new CryptoPickerDestination.CryptoPickerInputData((List) null, (List) null, (CryptoPickerDestination.CryptoPickerConfig) null, 15));
    }
}
