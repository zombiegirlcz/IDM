package com.fourthline.orca.internal;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes23.dex */
public final class ua {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ua f33984a = new ua();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Function2 f33985b = ComposableLambdaKt.composableLambdaInstance(1447071425, false, new hp1(3));

    public final Function2 a() {
        return f33985b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1447071425, i, -1, "com.fourthline.orca.core.internal.capabilities.nfc.scanner.ComposableSingletons$NfcScannerScreenKt.lambda$1447071425.<anonymous> (NfcScannerScreen.kt:383)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.f186387a;
    }
}
