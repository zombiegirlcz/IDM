package com.fourthline.orca.internal;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes23.dex */
public final class xa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final xa f34928a = new xa();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Function2 f34929b = ComposableLambdaKt.composableLambdaInstance(-662768744, false, new hp1(5));

    public final Function2 a() {
        return f34929b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-662768744, i, -1, "com.fourthline.orca.core.internal.composable.vision_scanners.ComposableSingletons$StepsProgressWidgetKt.lambda$-662768744.<anonymous> (StepsProgressWidget.kt:66)");
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
