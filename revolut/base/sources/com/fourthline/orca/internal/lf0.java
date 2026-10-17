package com.fourthline.orca.internal;

import com.fourthline.orca.internal.df0;
import com.fourthline.orca.internal.ff0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public interface lf0 extends j20 {
    /* JADX INFO: Access modifiers changed from: private */
    static ff0 a(int i, ff0 ff0Var) {
        Intrinsics.checkNotNullParameter(ff0Var, "<this>");
        ff0.d dVarA = ff0.d.a((ff0.d) ff0Var, null, null, null, null, new df0.a(0, kotlin.ranges.f.g(i, 0, 10), 1, null), 15, null);
        return dVarA != null ? dVarA : ff0Var;
    }

    ff0.d b();

    default Function1 b(int i) {
        return new ij1(i, 1);
    }

    ff0 m();

    ff0.c q();
}
