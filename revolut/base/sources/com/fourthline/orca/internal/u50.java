package com.fourthline.orca.internal;

import androidx.compose.foundation.layout.RowScope;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.style.TextAlign;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public abstract class u50 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(Modifier modifier, String str, String str2, String str3, boolean z, boolean z3, Function0 function0, int i, int i2, Composer composer, int i3) {
        a(modifier, str, str2, str3, z, z3, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.f186387a;
    }

    /* JADX WARN: Removed duplicated region for block: B:167:0x040e  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x041b  */
    /* JADX WARN: Removed duplicated region for block: B:179:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00d9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(androidx.compose.ui.Modifier r65, final java.lang.String r66, final java.lang.String r67, java.lang.String r68, boolean r69, boolean r70, final kotlin.jvm.functions.Function0 r71, androidx.compose.runtime.Composer r72, final int r73, final int r74) {
        /*
            Method dump skipped, instruction units count: 1070
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fourthline.orca.internal.u50.a(androidx.compose.ui.Modifier, java.lang.String, java.lang.String, java.lang.String, boolean, boolean, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x000f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit a(androidx.compose.runtime.MutableState r1, boolean r2, androidx.compose.ui.text.TextLayoutResult r3) {
        /*
            java.lang.String r0 = "it"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            if (r2 == 0) goto Lf
            int r2 = r3.getLineCount()
            r3 = 1
            if (r2 != r3) goto Lf
            goto L10
        Lf:
            r3 = 0
        L10:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r3)
            r1.setValue(r2)
            kotlin.Unit r1 = kotlin.Unit.f186387a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fourthline.orca.internal.u50.a(androidx.compose.runtime.MutableState, boolean, androidx.compose.ui.text.TextLayoutResult):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(Function0 function0) {
        function0.invoke();
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(Modifier modifier, AnnotatedString annotatedString, TextStyle textStyle, RowScope TextButton, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(TextButton, "$this$TextButton");
        if (composer.shouldExecute((i & 17) != 16, i & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1808851666, i, -1, "com.fourthline.orca.core.internal.composable.LinkButton.<anonymous>.<anonymous>.<anonymous> (LinkButton.kt:100)");
            }
            TextKt.m1281TextIbK3jfQ(annotatedString, a80.a(modifier, "linkButton", (String) null, 2, (Object) null), 0L, 0L, null, null, null, 0L, null, TextAlign.m3216boximpl(TextAlign.INSTANCE.m3223getCentere0LSkKk()), 0L, 0, false, 0, 0, null, null, textStyle, composer, 0, 0, 130556);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.f186387a;
    }
}
