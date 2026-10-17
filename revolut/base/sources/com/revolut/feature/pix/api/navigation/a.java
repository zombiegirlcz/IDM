package com.revolut.feature.pix.api.navigation;

import com.revolut.feature.pix.api.navigation.PixTransferNavigation$InputData;
import h8a.d;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class a extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PixTransferNavigation$InputData f80531a;

    public a(PixTransferNavigation$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f80531a = inputData;
    }

    @Override // h8a.d
    public final PixNavigation$InputData b() {
        return this.f80531a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f80531a, ((a) obj2).f80531a);
    }

    public final int hashCode() {
        return this.f80531a.hashCode();
    }

    public a() {
        this(PixTransferNavigation$InputData.Send.f80530a);
    }
}
