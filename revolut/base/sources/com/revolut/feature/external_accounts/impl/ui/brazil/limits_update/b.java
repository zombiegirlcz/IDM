package com.revolut.feature.external_accounts.impl.ui.brazil.limits_update;

import grl.y3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f72636a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y3 f72637b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f72638c;

    public b(int i, y3 trackingName, int i2) {
        Intrinsics.checkNotNullParameter(trackingName, "trackingName");
        this.f72636a = i;
        this.f72637b = trackingName;
        this.f72638c = i2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return this.f72636a == bVar.f72636a && this.f72637b == bVar.f72637b && this.f72638c == bVar.f72638c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f72638c) + ((this.f72637b.hashCode() + (Integer.hashCode(this.f72636a) * 31)) * 31);
    }
}
