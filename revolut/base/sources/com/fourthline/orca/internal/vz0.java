package com.fourthline.orca.internal;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes23.dex */
public final class vz0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f34481a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f34482b;

    public vz0(float f) {
        this.f34481a = f;
        this.f34482b = f;
    }

    public final float a() {
        return this.f34482b;
    }

    public final float b() {
        return this.f34481a;
    }

    public /* synthetic */ vz0(float f, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? BitmapDescriptorFactory.HUE_RED : f);
    }
}
