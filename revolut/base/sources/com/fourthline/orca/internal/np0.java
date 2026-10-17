package com.fourthline.orca.internal;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public abstract class np0 {
    public static final gp0 a(mp0 mp0Var) {
        Intrinsics.checkNotNullParameter(mp0Var, "<this>");
        gp0 gp0VarA = mp0Var.a();
        if (gp0VarA != null) {
            return gp0VarA;
        }
        throw new IllegalStateException("FL developer error. Poa File is requested when it's not available.");
    }
}
