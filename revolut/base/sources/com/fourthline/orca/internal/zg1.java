package com.fourthline.orca.internal;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class zg1 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final String b(gf1 gf1Var) {
        lg1 lg1VarA = gf1Var.a();
        if (lg1VarA != null) {
            return lg1VarA.c();
        }
        throw new IllegalArgumentException("FL Developer error. The workflow session config must be present at this moment!".toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String d(gf1 gf1Var) {
        lg1 lg1VarA = gf1Var.a();
        if (lg1VarA != null) {
            return lg1VarA.e();
        }
        throw new IllegalArgumentException("FL Developer error. The workflow session config must be present at this moment!".toString());
    }

    public final Function0 a(gf1 bundle) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        return new uq1(bundle, 2);
    }

    public final Function0 c(gf1 bundle) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        return new uq1(bundle, 1);
    }
}
