package com.fourthline.orca.internal;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public abstract class i81 {
    public static final Function0 a(long j2, Function0 onClick, Composer composer, int i, int i2) {
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        boolean z = true;
        if ((i2 & 1) != 0) {
            j2 = 300;
        }
        long j3 = j2;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(269863087, i, -1, "com.fourthline.orca.core.internal.helper.handleSingleClicks (ThrottleInteractionHandler.kt:27)");
        }
        Object objRememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.INSTANCE;
        if (objRememberedValue == companion.getEmpty()) {
            h81 h81Var = new h81(j3, null, 2, null);
            composer.updateRememberedValue(h81Var);
            objRememberedValue = h81Var;
        }
        h81 h81Var2 = (h81) objRememberedValue;
        boolean zChangedInstance = composer.changedInstance(h81Var2);
        if ((((i & 112) ^ 48) <= 32 || !composer.changed(onClick)) && (i & 48) != 32) {
            z = false;
        }
        boolean z3 = zChangedInstance | z;
        Object objRememberedValue2 = composer.rememberedValue();
        if (z3 || objRememberedValue2 == companion.getEmpty()) {
            objRememberedValue2 = new rj1(h81Var2, onClick, 25);
            composer.updateRememberedValue(objRememberedValue2);
        }
        Function0 function0 = (Function0) objRememberedValue2;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return function0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(h81 h81Var, Function0 function0) {
        h81Var.a(function0);
        return Unit.f186387a;
    }
}
