package com.fourthline.orca.internal;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes23.dex */
public final class ta {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ta f33260a = new ta();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Function2 f33261b = ComposableLambdaKt.composableLambdaInstance(1406248865, false, new hp1(2));

    public final Function2 a() {
        return f33261b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1406248865, i, -1, "com.fourthline.orca.core.internal.composable.ComposableSingletons$InputViewsKt.lambda$1406248865.<anonymous> (InputViews.kt:101)");
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
