package com.fourthline.orca.internal;

import com.fourthline.core.DeviceMetadata;

/* JADX INFO: loaded from: classes23.dex */
public final class la implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ja f30552a;

    private la(ja jaVar) {
        this.f30552a = jaVar;
    }

    public static DeviceMetadata b(ja jaVar) {
        DeviceMetadata deviceMetadataA = jaVar.a();
        vc.s.k(deviceMetadataA);
        return deviceMetadataA;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DeviceMetadata get() {
        return b(this.f30552a);
    }

    public static la a(ja jaVar) {
        return new la(jaVar);
    }
}
