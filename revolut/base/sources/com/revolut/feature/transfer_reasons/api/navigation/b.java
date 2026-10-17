package com.revolut.feature.transfer_reasons.api.navigation;

import aii.e;
import com.revolut.feature.transfer_reasons.api.navigation.TransferReasonsFlowInputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class b implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TransferReasonsFlowInputData.EditFromTransaction f92330a;

    public b(TransferReasonsFlowInputData.EditFromTransaction inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f92330a = inputData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f92330a, ((b) obj2).f92330a);
    }

    public final int hashCode() {
        return this.f92330a.hashCode();
    }
}
