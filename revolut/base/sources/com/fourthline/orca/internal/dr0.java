package com.fourthline.orca.internal;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public abstract class dr0 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(p70 p70Var, int i, Composer composer, int i2) {
        a(p70Var, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.f186387a;
    }

    public static final void a(p70 lottieSource, Composer composer, int i) {
        int i2;
        Composer composer2;
        Intrinsics.checkNotNullParameter(lottieSource, "lottieSource");
        Composer composerStartRestartGroup = composer.startRestartGroup(210826447);
        if ((i & 6) == 0) {
            i2 = i | ((i & 8) == 0 ? composerStartRestartGroup.changed(lottieSource) : composerStartRestartGroup.changedInstance(lottieSource) ? 4 : 2);
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(210826447, i2, -1, "com.fourthline.orca.core.internal.composable.vision_scanners.ProgressIndicator (ProgressIndicator.kt:21)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            th0 th0Var = th0.f33777a;
            composer2 = composerStartRestartGroup;
            g81.a(SizeKt.m887width3ABfNKs(SizeKt.m874height3ABfNKs(companion, th0Var.a()), th0Var.a()), false, false, fj0.f28535a.b(composerStartRestartGroup, 6).getGraphic().getSpinner().getHighlight().a(composerStartRestartGroup, 0), 0L, 0L, 0L, Integer.MAX_VALUE, BitmapDescriptorFactory.HUE_RED, null, lottieSource, null, null, null, composer2, 12582918, i2 & 14, 15222);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new xk1(lottieSource, i, 0));
        }
    }
}
