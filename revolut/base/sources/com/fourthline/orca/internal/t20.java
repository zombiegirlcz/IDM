package com.fourthline.orca.internal;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.fourthline.orca.internal.c81;
import com.fourthline.orca.internal.sl0;
import com.revolut.revolut.feature_fourthline_impl.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public abstract class t20 {
    public static final String a(u20 u20Var, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(u20Var, "<this>");
        composer.startReplaceGroup(-161435748);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-161435748, i, -1, "com.fourthline.orca.core.internal.inputview.accessibilityDescription (InputViewStateAccessibility.kt:18)");
        }
        String strC = d81.c(u20Var.getTitle(), composer, 0);
        if (u20Var.getFormat() != r20.f32618c) {
            composer.startReplaceGroup(1031314001);
            composer.endReplaceGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceGroup();
            return strC;
        }
        composer.startReplaceGroup(1031150755);
        String str = strC + ". " + d81.c(c81.a.a(c81.f27404a, R.string.shared_input_date_format_accessibility, 0, 2, null), composer, 0) + ".";
        composer.endReplaceGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return str;
    }

    public static final String b(u20 u20Var, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(u20Var, "<this>");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1753103352, i, -1, "com.fourthline.orca.core.internal.inputview.accessibilityErrorDescription (InputViewStateAccessibility.kt:13)");
        }
        String strA = d81.a(u20Var.b(), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return strA;
    }

    public static final String b(sl0.a aVar, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2009959251, i, -1, "com.fourthline.orca.core.internal.inputview.accessibilityErrorDescription (InputViewStateAccessibility.kt:34)");
        }
        if (!ComposerKt.isTraceInProgress()) {
            return null;
        }
        ComposerKt.traceEventEnd();
        return null;
    }

    public static final String a(sl0.a aVar, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1878133919, i, -1, "com.fourthline.orca.core.internal.inputview.accessibilityDescription (InputViewStateAccessibility.kt:29)");
        }
        String strC = d81.c(aVar.g(), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return strC;
    }
}
