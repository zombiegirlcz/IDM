package com.revolut.core.ui_kit.delegates;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.delegates.RateDelegate;
import ip0.x70;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class xd implements x70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RateDelegate.b f55601a;

    public xd(RateDelegate.b config) {
        Intrinsics.checkNotNullParameter(config, "config");
        this.f55601a = config;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof xd) && Intrinsics.f(this.f55601a, ((xd) obj2).f55601a);
    }

    public final int hashCode() {
        return this.f55601a.hashCode();
    }

    public xd() {
        this(new RateDelegate.b(BitmapDescriptorFactory.HUE_RED, 63));
    }
}
