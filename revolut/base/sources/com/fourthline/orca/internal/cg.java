package com.fourthline.orca.internal;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public abstract class cg {
    public static final String a(bg bgVar) {
        Intrinsics.checkNotNullParameter(bgVar, "<this>");
        String strB = bgVar.b();
        if (strB != null) {
            return strB;
        }
        throw new IllegalArgumentException("FL Developer error. The documentAnalysisId must be present by this moment.".toString());
    }

    public static final boolean b(bg bgVar) {
        Intrinsics.checkNotNullParameter(bgVar, "<this>");
        return bgVar instanceof gj;
    }
}
