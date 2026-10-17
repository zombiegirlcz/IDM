package com.fourthline.orca.internal;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public abstract class vw {
    public static final String a(Throwable th10) {
        String strB;
        Intrinsics.checkNotNullParameter(th10, "<this>");
        if (!(th10 instanceof t2)) {
            return rg0.b(th10);
        }
        Throwable cause = th10.getCause();
        return (cause == null || (strB = rg0.b(cause)) == null) ? rg0.b(th10) : strB;
    }
}
