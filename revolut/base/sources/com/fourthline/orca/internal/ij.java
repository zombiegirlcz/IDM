package com.fourthline.orca.internal;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public abstract class ij {
    public static final fd a(gj gjVar) {
        Intrinsics.checkNotNullParameter(gjVar, "<this>");
        fd fdVarG = gjVar.g();
        if (fdVarG != null) {
            return fdVarG;
        }
        throw new IllegalArgumentException("FL Developer error. The issuing country must be present by this moment.".toString());
    }

    public static final di b(gj gjVar) {
        Intrinsics.checkNotNullParameter(gjVar, "<this>");
        di diVarO = gjVar.o();
        if (diVarO != null) {
            return diVarO;
        }
        throw new IllegalArgumentException("FL Developer error. The selected document must be present by this moment.".toString());
    }
}
