package com.revolut.feature.transfer_reasons.api.navigation;

import aii.e;
import com.revolut.feature.transfer_reasons.api.navigation.TransferReasonsFlowInputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class a implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TransferReasonsFlowInputData.EditForResult f92329a;

    public a(TransferReasonsFlowInputData.EditForResult inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f92329a = inputData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f92329a, ((a) obj2).f92329a);
    }

    public final int hashCode() {
        return this.f92329a.hashCode();
    }
}
