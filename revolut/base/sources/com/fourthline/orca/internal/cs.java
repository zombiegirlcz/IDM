package com.fourthline.orca.internal;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public abstract class cs {
    public static final String a(bs bsVar) {
        Intrinsics.checkNotNullParameter(bsVar, "<this>");
        String strC = bsVar.c();
        if (strC != null) {
            return strC;
        }
        throw new IllegalArgumentException("FL Developer error. The CAN number must be present by this moment.".toString());
    }

    public static final String b(bs bsVar) {
        Intrinsics.checkNotNullParameter(bsVar, "<this>");
        String strF = bsVar.f();
        if (strF != null) {
            return strF;
        }
        throw new IllegalArgumentException("FL Developer error. The PIN must be present by this moment.".toString());
    }
}
