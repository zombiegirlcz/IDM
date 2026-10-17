package com.fourthline.orca.internal;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class wz0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i20 f34820a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final mj0 f34821b;

    public wz0(i20 indicatorSettings, mj0 overlaySettings) {
        Intrinsics.checkNotNullParameter(indicatorSettings, "indicatorSettings");
        Intrinsics.checkNotNullParameter(overlaySettings, "overlaySettings");
        this.f34820a = indicatorSettings;
        this.f34821b = overlaySettings;
    }

    public final i20 a() {
        return this.f34820a;
    }

    public final mj0 b() {
        return this.f34821b;
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof wz0)) {
            return false;
        }
        wz0 wz0Var = (wz0) obj2;
        return Intrinsics.f(this.f34820a, wz0Var.f34820a) && Intrinsics.f(this.f34821b, wz0Var.f34821b);
    }

    public int hashCode() {
        return (this.f34820a.hashCode() * 31) + this.f34821b.hashCode();
    }

    public String toString() {
        return "ScrollSettings(indicatorSettings=" + this.f34820a + ", overlaySettings=" + this.f34821b + ")";
    }

    public /* synthetic */ wz0(i20 i20Var, mj0 mj0Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new i20(false, 0L, BitmapDescriptorFactory.HUE_RED, 7, null) : i20Var, (i & 2) != 0 ? new mj0(false, false, BitmapDescriptorFactory.HUE_RED, null, null, null, 63, null) : mj0Var);
    }
}
