package com.fourthline.orca.internal;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public abstract class cq0 {
    public static final void a(aq0 aq0Var, gq0... popupProvider) {
        Intrinsics.checkNotNullParameter(aq0Var, "<this>");
        Intrinsics.checkNotNullParameter(popupProvider, "popupProvider");
        if (aq0Var instanceof da) {
            for (gq0 gq0Var : popupProvider) {
                ((da) aq0Var).a(gq0Var);
            }
        }
    }
}
