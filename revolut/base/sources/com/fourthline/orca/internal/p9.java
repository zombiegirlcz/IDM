package com.fourthline.orca.internal;

import androidx.compose.foundation.layout.RowScope;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.TextUnit;
import com.fourthline.orca.internal.fj0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public abstract class p9 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(Modifier modifier, a9 a9Var, k41 k41Var, Function1 function1, int i, int i2, Composer composer, int i3) {
        a(modifier, a9Var, k41Var, function1, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(Modifier modifier, String str, String str2, String str3, boolean z, k41 k41Var, Function1 function1, int i, int i2, Composer composer, int i3) {
        a(modifier, str, str2, str3, z, k41Var, function1, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(Modifier modifier, String str, kd1 kd1Var, boolean z, k41 k41Var, Function1 function1, int i, int i2, Composer composer, int i3) {
        a(modifier, str, kd1Var, z, k41Var, function1, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.f186387a;
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00e8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(androidx.compose.ui.Modifier r11, com.fourthline.orca.internal.a9 r12, com.fourthline.orca.internal.k41 r13, kotlin.jvm.functions.Function1 r14, androidx.compose.runtime.Composer r15, int r16, int r17) {
        /*
            Method dump skipped, instruction units count: 264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fourthline.orca.internal.p9.a(androidx.compose.ui.Modifier, com.fourthline.orca.internal.a9, com.fourthline.orca.internal.k41, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:115:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00dc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(androidx.compose.ui.Modifier r17, java.lang.String r18, final java.lang.String r19, java.lang.String r20, boolean r21, com.fourthline.orca.internal.k41 r22, final kotlin.jvm.functions.Function1 r23, androidx.compose.runtime.Composer r24, final int r25, final int r26) {
        /*
            Method dump skipped, instruction units count: 396
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fourthline.orca.internal.p9.a(androidx.compose.ui.Modifier, java.lang.String, java.lang.String, java.lang.String, boolean, com.fourthline.orca.internal.k41, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:119:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:124:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00cb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(androidx.compose.ui.Modifier r21, java.lang.String r22, com.fourthline.orca.internal.kd1 r23, boolean r24, com.fourthline.orca.internal.k41 r25, kotlin.jvm.functions.Function1 r26, androidx.compose.runtime.Composer r27, int r28, int r29) {
        /*
            Method dump skipped, instruction units count: 478
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fourthline.orca.internal.p9.a(androidx.compose.ui.Modifier, java.lang.String, com.fourthline.orca.internal.kd1, boolean, com.fourthline.orca.internal.k41, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(Function1 function1, kd1 kd1Var) {
        function1.invoke(kd1Var);
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(boolean z, k41 k41Var, kd1 kd1Var, String str, RowScope TextButton, Composer composer, int i) {
        TextStyle textStyleA;
        Intrinsics.checkNotNullParameter(TextButton, "$this$TextButton");
        if (composer.shouldExecute((i & 17) != 16, i & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1737322578, i, -1, "com.fourthline.orca.core.internal.composable.CancelButton.<anonymous>.<anonymous> (CancelButton.kt:88)");
            }
            if (!z) {
                composer.startReplaceGroup(1175283495);
                textStyleA = k41Var.getDisabled().getText().a(TextUnit.m3364boximpl(fj0.a.f28536a.a()), composer, 6, 0);
                composer.endReplaceGroup();
            } else if (z) {
                composer.startReplaceGroup(1175286535);
                textStyleA = k41Var.getDefault().getText().a(TextUnit.m3364boximpl(fj0.a.f28536a.a()), composer, 6, 0);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(1175281868);
                composer.endReplaceGroup();
                throw new NoWhenBranchMatchedException();
            }
            pq0.a(false, ComposableLambdaKt.rememberComposableLambda(-840112916, true, new uj1(kd1Var, 8, str, textStyleA), composer, 54), composer, 48, 1);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(kd1 kd1Var, String str, TextStyle textStyle, Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-840112916, i, -1, "com.fourthline.orca.core.internal.composable.CancelButton.<anonymous>.<anonymous>.<anonymous> (CancelButton.kt:94)");
            }
            Modifier modifierA = a80.a(a80.a((Modifier) Modifier.INSTANCE, kd1Var.a(composer, 0), false, 2, (Object) null), str, (String) null, 2, (Object) null);
            TextKt.m1280Text4IGK_g(kd1Var.b(composer, 0), modifierA, 0L, 0L, null, null, null, 0L, null, TextAlign.m3216boximpl(TextAlign.INSTANCE.m3223getCentere0LSkKk()), 0L, TextOverflow.INSTANCE.m3263getEllipsisgIe3tQ8(), false, 1, 0, null, textStyle, composer, 0, 3120, 54780);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.f186387a;
    }
}
