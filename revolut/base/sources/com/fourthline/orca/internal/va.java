package com.fourthline.orca.internal;

import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class va {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final va f34278a = new va();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Function3 f34279b = ComposableLambdaKt.composableLambdaInstance(-1715518791, false, new dn1(2));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static Function3 f34280c = ComposableLambdaKt.composableLambdaInstance(-1885864390, false, new dn1(3));
    private static Function3 d = ComposableLambdaKt.composableLambdaInstance(-1713450309, false, new dn1(4));
    private static Function2 e = ComposableLambdaKt.composableLambdaInstance(-1229727741, false, new hp1(4));

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit b(ColumnScope columnScope, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(columnScope, "<this>");
        if (composer.shouldExecute((i & 17) != 16, i & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1715518791, i, -1, "com.fourthline.orca.core.internal.composable.ComposableSingletons$OrcaScaffoldKt.lambda$-1715518791.<anonymous> (OrcaScaffold.kt:29)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c(ColumnScope OrcaScaffold, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(OrcaScaffold, "$this$OrcaScaffold");
        if (composer.shouldExecute((i & 17) != 16, i & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1885864390, i, -1, "com.fourthline.orca.core.internal.composable.ComposableSingletons$OrcaScaffoldKt.lambda$-1885864390.<anonymous> (OrcaScaffold.kt:65)");
            }
            b10.a(null, "Lorem ipsum", null, 0L, null, null, composer, 48, 61);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.f186387a;
    }

    public final Function3 a() {
        return f34279b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1229727741, i, -1, "com.fourthline.orca.core.internal.composable.ComposableSingletons$OrcaScaffoldKt.lambda$-1229727741.<anonymous> (OrcaScaffold.kt:64)");
            }
            ii0.a(null, false, null, f34280c, d, composer, 27648, 7);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(ColumnScope OrcaScaffold, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(OrcaScaffold, "$this$OrcaScaffold");
        if (composer.shouldExecute((i & 17) != 16, i & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1713450309, i, -1, "com.fourthline.orca.core.internal.composable.ComposableSingletons$OrcaScaffoldKt.lambda$-1713450309.<anonymous> (OrcaScaffold.kt:67)");
            }
            TextKt.m1420TextNvy7gAk("Lorem ipsum", null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 6, 0, 262142);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.f186387a;
    }
}
