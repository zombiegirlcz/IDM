package com.google.protobuf;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public enum l4 {
    INT(0),
    LONG(0L),
    FLOAT(Float.valueOf(BitmapDescriptorFactory.HUE_RED)),
    DOUBLE(Double.valueOf(0.0d)),
    BOOLEAN(Boolean.FALSE),
    STRING(""),
    BYTE_STRING(p.f49757b),
    ENUM(null),
    MESSAGE(null);

    private final Object defaultDefault;

    l4(Serializable serializable) {
        this.defaultDefault = serializable;
    }
}
