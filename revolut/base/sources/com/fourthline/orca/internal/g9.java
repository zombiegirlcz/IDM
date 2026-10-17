package com.fourthline.orca.internal;

import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.material.IconKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;

/* JADX INFO: loaded from: classes23.dex */
public abstract class g9 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(Modifier modifier, String str, r20 r20Var, l20 l20Var, String str2, String str3, String str4, String str5, z10 z10Var, z10 z10Var2, Function1 function1, Function1 function12, KeyboardOptions keyboardOptions, KeyboardActions keyboardActions, String str6, String str7, Float f, int i, int i2, int i3, Composer composer, int i5) {
        a(modifier, str, r20Var, l20Var, str2, str3, str4, str5, z10Var, z10Var2, function1, function12, keyboardOptions, keyboardActions, str6, str7, f, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(boolean z) {
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(String it8) {
        Intrinsics.checkNotNullParameter(it8, "it");
        return Unit.f186387a;
    }

    /* JADX WARN: Removed duplicated region for block: B:125:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0439  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0456  */
    /* JADX WARN: Removed duplicated region for block: B:244:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(androidx.compose.ui.Modifier r46, java.lang.String r47, final com.fourthline.orca.internal.r20 r48, final com.fourthline.orca.internal.l20 r49, final java.lang.String r50, final java.lang.String r51, final java.lang.String r52, java.lang.String r53, com.fourthline.orca.internal.z10 r54, final com.fourthline.orca.internal.z10 r55, kotlin.jvm.functions.Function1 r56, kotlin.jvm.functions.Function1 r57, androidx.compose.foundation.text.KeyboardOptions r58, androidx.compose.foundation.text.KeyboardActions r59, java.lang.String r60, java.lang.String r61, java.lang.Float r62, androidx.compose.runtime.Composer r63, final int r64, final int r65, final int r66) {
        /*
            Method dump skipped, instruction units count: 1142
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fourthline.orca.internal.g9.a(androidx.compose.ui.Modifier, java.lang.String, com.fourthline.orca.internal.r20, com.fourthline.orca.internal.l20, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.fourthline.orca.internal.z10, com.fourthline.orca.internal.z10, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, androidx.compose.foundation.text.KeyboardOptions, androidx.compose.foundation.text.KeyboardActions, java.lang.String, java.lang.String, java.lang.Float, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(z10 z10Var, Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-567295308, i, -1, "com.fourthline.orca.core.internal.composable.CalendarInputView.<anonymous> (CalendarInputView.kt:61)");
            }
            IconKt.m1223Iconww6aTOc(a20.a(z10Var, composer, 0), (String) null, (Modifier) null, 0L, composer, 48, 12);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(Function1 function1, String it8) {
        Intrinsics.checkNotNullParameter(it8, "it");
        if (new Regex("^\\d{0,8}$").f(it8)) {
            function1.invoke(it8);
        }
        return Unit.f186387a;
    }
}
