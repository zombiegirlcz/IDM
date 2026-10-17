package com.fourthline.orca.internal;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.unit.Dp;
import com.fourthline.orca.core.flavor.OrcaLayouts;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public abstract class vh0 {
    public static final uh0 a(OrcaLayouts orcaLayouts, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(orcaLayouts, "<this>");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(993131494, i, -1, "com.fourthline.orca.core.internal.styling.layout.toComposeLayouts (OrcaLayouts.kt:22)");
        }
        uh0 uh0Var = new uh0(Dp.m3297constructorimpl(32), Dp.m3297constructorimpl(4), Dp.m3297constructorimpl(20), Dp.m3297constructorimpl(orcaLayouts.getPrimaryButtonCornerRadius()), Dp.m3297constructorimpl(2), null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return uh0Var;
    }
}
