package com.revolut.core.ui_kit.delegates;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.delegates.RateDelegate;
import ip0.x70;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class yd implements x70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RateDelegate.b f55648a;

    public yd() {
        RateDelegate.b config = new RateDelegate.b(BitmapDescriptorFactory.HUE_RED, 63);
        Intrinsics.checkNotNullParameter(config, "config");
        this.f55648a = config;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof yd) && this.f55648a.equals(((yd) obj2).f55648a);
    }

    public final int hashCode() {
        return this.f55648a.hashCode();
    }
}
