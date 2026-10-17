package com.revolut.feature.transfer_reasons.api.navigation;

import aii.e;
import com.revolut.feature.transfer_reasons.api.navigation.TransferReasonsFlowInputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class c implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TransferReasonsFlowInputData.OpenForResult f92331a;

    public c(TransferReasonsFlowInputData.OpenForResult inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f92331a = inputData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f92331a, ((c) obj2).f92331a);
    }

    public final int hashCode() {
        return this.f92331a.hashCode();
    }
}
