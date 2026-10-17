package com.fourthline.orca.internal;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes23.dex */
public interface aq0 {
    static /* synthetic */ void a(aq0 aq0Var, hq0 hq0Var, Function0 function0, Function0 function02, int i, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: handle");
        }
        if ((i & 2) != 0) {
            function0 = null;
        }
        if ((i & 4) != 0) {
            function02 = null;
        }
        aq0Var.a(hq0Var, function0, function02);
    }

    void a(hq0 hq0Var);

    void a(hq0 hq0Var, Function0 function0, Function0 function02);

    void a(hq0 hq0Var, Function0 function0, Function0 function02, Function1 function1);

    static /* synthetic */ void a(aq0 aq0Var, hq0 hq0Var, Function0 function0, Function0 function02, Function1 function1, int i, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: handle");
        }
        if ((i & 2) != 0) {
            function0 = null;
        }
        if ((i & 4) != 0) {
            function02 = null;
        }
        if ((i & 8) != 0) {
            function1 = null;
        }
        aq0Var.a(hq0Var, function0, function02, function1);
    }
}
