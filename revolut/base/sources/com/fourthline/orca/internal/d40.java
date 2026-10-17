package com.fourthline.orca.internal;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public interface d40 extends j20 {
    default Function1 a(boolean z) {
        return new rk1(z, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    static s30 a(boolean z, s30 s30Var) {
        Intrinsics.checkNotNullParameter(s30Var, "<this>");
        boolean z3 = !z;
        return s30.a(s30Var, null, null, null, null, s30Var.p().a(z3, z), s30Var.q().a(z3), 15, null);
    }
}
