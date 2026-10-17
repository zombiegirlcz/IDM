package com.fourthline.orca.internal;

import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Dp;
import com.fourthline.orca.internal.c81;
import com.revolut.revolut.feature_fourthline_impl.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class sa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final sa f32957a = new sa();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Function3 f32958b = ComposableLambdaKt.composableLambdaInstance(250024255, false, new dn1(1));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static Function2 f32959c = ComposableLambdaKt.composableLambdaInstance(1516308335, false, new hp1(1));

    public final Function3 a() {
        return f32958b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(ColumnScope OrcaScreen, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(OrcaScreen, "$this$OrcaScreen");
        if (composer.shouldExecute((i & 17) != 16, i & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(250024255, i, -1, "com.fourthline.orca.kyc.internal.flow.document_selection.screens.version.ComposableSingletons$DocumentVersionScreenKt.lambda$250024255.<anonymous> (DocumentVersionScreen.kt:63)");
            }
            SpacerKt.Spacer(SizeKt.m874height3ABfNKs(Modifier.INSTANCE, Dp.m3297constructorimpl(8)), composer, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1516308335, i, -1, "com.fourthline.orca.kyc.internal.flow.document_selection.screens.version.ComposableSingletons$DocumentVersionScreenKt.lambda$1516308335.<anonymous> (DocumentVersionScreen.kt:90)");
            }
            c81.a aVar = c81.f27404a;
            kr krVar = new kr(c81.a.a(aVar, R.string.step_document_version_header, 0, 2, null), c81.a.a(aVar, R.string.step_document_version_label_version, 0, 2, null), c81.a.a(aVar, R.string.shared_button_continue, 0, 2, null), new c81.d(R.string.shared_button_back, R.string.shared_button_back_accessibility), zhm.f0.f322471a, false, 32, null);
            Object objRememberedValue = composer.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new nq1(9);
                composer.updateRememberedValue(objRememberedValue);
            }
            qr.a(krVar, (Function1) objRememberedValue, composer, 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(ir it8) {
        Intrinsics.checkNotNullParameter(it8, "it");
        return Unit.f186387a;
    }
}
