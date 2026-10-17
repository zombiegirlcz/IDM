package com.fourthline.orca.internal;

import com.fourthline.core.DeviceMetadata;
import com.fourthline.core.location.Coordinate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class r60 implements c70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private DeviceMetadata f32636a;

    public r60(DeviceMetadata metadata) {
        Intrinsics.checkNotNullParameter(metadata, "metadata");
        this.f32636a = metadata;
    }

    @Override // com.fourthline.orca.internal.c70
    public void a(Coordinate coordinate) {
        this.f32636a.setLocation(coordinate);
    }

    @Override // com.fourthline.orca.internal.c70
    public Coordinate getLocation() {
        return this.f32636a.getLocation();
    }
}
