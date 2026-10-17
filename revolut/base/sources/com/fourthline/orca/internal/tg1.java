package com.fourthline.orca.internal;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class tg1 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final String b(r70 r70Var) {
        lg1 lg1VarB = r70Var.b();
        String strC = lg1VarB != null ? lg1VarB.c() : null;
        if (strC != null) {
            return strC;
        }
        throw new IllegalArgumentException("FL Developer error. The workflow session config must be present at this moment!".toString());
    }

    public final Function0 a(r70 mainRepository) {
        Intrinsics.checkNotNullParameter(mainRepository, "mainRepository");
        return new wm1(mainRepository, 2);
    }

    public final mb.d c(r70 mainRepository) {
        mb.d dVarB;
        Intrinsics.checkNotNullParameter(mainRepository, "mainRepository");
        lg1 lg1VarB = mainRepository.b();
        if (lg1VarB == null || (dVarB = lg1VarB.b()) == null) {
            throw new IllegalStateException("FL Developer Error. This configuration does not support NetworkEnvironment.");
        }
        return dVarB;
    }
}
