package com.fourthline.orca.internal;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import com.fourthline.orca.internal.wb1;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public abstract class jc1 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(yb1 yb1Var, Function1 function1, int i, Composer composer, int i2) {
        a(yb1Var, function1, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit b(Function1 function1) {
        function1.invoke(wb1.c.f34587a);
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c(Function1 function1) {
        function1.invoke(wb1.a.f34585a);
        return Unit.f186387a;
    }

    public static final void a(yb1 state, Function1 onEventSent, Composer composer, int i) {
        int i2;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(onEventSent, "onEventSent");
        Composer composerStartRestartGroup = composer.startRestartGroup(1081510759);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composerStartRestartGroup.changed(state) : composerStartRestartGroup.changedInstance(state) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onEventSent) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1081510759, i2, -1, "com.fourthline.orca.core.internal.capabilities.upload.screens.upload.UploadDataScreen (UploadDataScreen.kt:15)");
            }
            c81 title = state.getTitle();
            c81 c81VarA = state.a();
            c81 c81VarN = state.n();
            p70 p70VarO = state.o();
            int iP = state.p();
            boolean z = true;
            boolean zQ = state.q();
            int i3 = i2 & 112;
            boolean z3 = i3 == 32;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z3 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new lj1(15, onEventSent);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            Function0 function0 = (Function0) objRememberedValue;
            boolean z4 = i3 == 32;
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (z4 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new lj1(16, onEventSent);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            Function0 function02 = (Function0) objRememberedValue2;
            if (i3 != 32) {
                z = false;
            }
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (z || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = new lj1(17, onEventSent);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            er0.a("upload", title, iP, zQ, c81VarA, c81VarN, p70VarO, function0, function02, (Function0) objRememberedValue3, composerStartRestartGroup, 6, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new bo1(state, onEventSent, i, 0));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(Function1 function1) {
        function1.invoke(wb1.b.f34586a);
        return Unit.f186387a;
    }
}
