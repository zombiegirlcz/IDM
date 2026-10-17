package com.revolut.feature.apm.breb.api.navigation;

import aii.e;
import com.revolut.feature.apm.breb.api.navigation.BrebTransferNavigation$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class a implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BrebTransferNavigation$InputData f61708a;

    public a(BrebTransferNavigation$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f61708a = inputData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f61708a, ((a) obj2).f61708a);
    }

    public final int hashCode() {
        return this.f61708a.hashCode();
    }

    public a() {
        this(BrebTransferNavigation$InputData.Send.f61707a);
    }
}
