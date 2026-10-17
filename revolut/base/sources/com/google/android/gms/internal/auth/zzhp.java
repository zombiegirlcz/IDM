package com.google.android.gms.internal.auth;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* JADX INFO: loaded from: classes16.dex */
public enum zzhp {
    INT(0),
    LONG(0L),
    FLOAT(Float.valueOf(BitmapDescriptorFactory.HUE_RED)),
    DOUBLE(Double.valueOf(0.0d)),
    BOOLEAN(Boolean.FALSE),
    STRING(""),
    BYTE_STRING(zzef.f39010zzb),
    ENUM(null),
    MESSAGE(null);


    /* JADX INFO: renamed from: zzk, reason: collision with root package name */
    private final Object f39160zzk;

    zzhp(Object obj2) {
        this.f39160zzk = obj2;
    }
}
