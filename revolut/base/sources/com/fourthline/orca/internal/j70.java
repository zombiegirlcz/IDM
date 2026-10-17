package com.fourthline.orca.internal;

import androidx.compose.foundation.layout.AspectRatioKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Unit;

/* JADX INFO: loaded from: classes23.dex */
public abstract class j70 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(Modifier modifier, long j2, p70 p70Var, int i, boolean z, int i2, int i3, Composer composer, int i5) {
        a(modifier, j2, p70Var, i, z, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return Unit.f186387a;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:95:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(androidx.compose.ui.Modifier r20, long r21, final com.fourthline.orca.internal.p70 r23, int r24, boolean r25, androidx.compose.runtime.Composer r26, final int r27, final int r28) {
        /*
            Method dump skipped, instruction units count: 372
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fourthline.orca.internal.j70.a(androidx.compose.ui.Modifier, long, com.fourthline.orca.internal.p70, int, boolean, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(boolean z, int i, p70 p70Var, Composer composer, int i2) {
        if (composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(595359593, i2, -1, "com.fourthline.orca.core.internal.composable.LottieBox.<anonymous> (LottieBox.kt:32)");
            }
            g81.a(AspectRatioKt.aspectRatio(Modifier.INSTANCE, 1.0f, true), z, false, 0L, 0L, 0L, 0L, i, BitmapDescriptorFactory.HUE_RED, null, p70Var, null, null, null, composer, 6, 0, 15228);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.f186387a;
    }
}
