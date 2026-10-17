package com.fourthline.orca.internal;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes23.dex */
public final class ya {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ya f35230a = new ya();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Function2 f35231b = ComposableLambdaKt.composableLambdaInstance(1187526506, false, new hp1(6));

    public final Function2 a() {
        return f35231b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1187526506, i, -1, "com.fourthline.orca.core.internal.composable.vision_scanners.ComposableSingletons$VisionScannerUploadScreenKt.lambda$1187526506.<anonymous> (VisionScannerUploadScreen.kt:64)");
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
