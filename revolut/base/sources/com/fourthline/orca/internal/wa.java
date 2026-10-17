package com.fourthline.orca.internal;

import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class wa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final wa f34558a = new wa();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Function3 f34559b = ComposableLambdaKt.composableLambdaInstance(-1201960509, false, new dn1(5));

    public final Function3 a() {
        return f34559b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(AnimatedVisibilityScope AnimatedVisibility, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1201960509, i, -1, "com.fourthline.orca.core.internal.composable.vision_scanners.ComposableSingletons$ShutterAnimationEffectKt.lambda$-1201960509.<anonymous> (ShutterAnimationEffect.kt:26)");
        }
        BoxKt.Box(BackgroundKt.m613backgroundbw27NRU$default(SizeKt.fillMaxSize$default(Modifier.INSTANCE, BitmapDescriptorFactory.HUE_RED, 1, null), Color.INSTANCE.m1987getBlack0d7_KjU(), null, 2, null), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.f186387a;
    }
}
