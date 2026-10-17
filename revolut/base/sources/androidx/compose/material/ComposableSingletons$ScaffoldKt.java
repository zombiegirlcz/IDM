package androidx.compose.material;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import org.jetbrains.annotations.NotNull;
import uyh.s;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
public final class ComposableSingletons$ScaffoldKt {

    @NotNull
    public static final ComposableSingletons$ScaffoldKt INSTANCE = new ComposableSingletons$ScaffoldKt();

    @NotNull
    private static Function2<Composer, Integer, Unit> lambda$866784315 = ComposableLambdaKt.composableLambdaInstance(866784315, false, new s(13));

    @NotNull
    private static Function2<Composer, Integer, Unit> lambda$1714259275 = ComposableLambdaKt.composableLambdaInstance(1714259275, false, new s(14));

    /* JADX INFO: renamed from: lambda$-1836397928, reason: not valid java name */
    @NotNull
    private static Function3 f47lambda$1836397928 = ComposableLambdaKt.composableLambdaInstance(-1836397928, false, new uw2.n(5));

    /* JADX INFO: renamed from: lambda$-1406416085, reason: not valid java name */
    @NotNull
    private static Function2<Composer, Integer, Unit> f45lambda$1406416085 = ComposableLambdaKt.composableLambdaInstance(-1406416085, false, new s(15));

    @NotNull
    private static Function2<Composer, Integer, Unit> lambda$566090785 = ComposableLambdaKt.composableLambdaInstance(566090785, false, new s(16));

    /* JADX INFO: renamed from: lambda$-1624772335, reason: not valid java name */
    @NotNull
    private static Function2<Composer, Integer, Unit> f46lambda$1624772335 = ComposableLambdaKt.composableLambdaInstance(-1624772335, false, new s(17));

    @NotNull
    private static Function3 lambda$939725476 = ComposableLambdaKt.composableLambdaInstance(939725476, false, new uw2.n(6));

    /* JADX INFO: renamed from: lambda$-1341284559, reason: not valid java name */
    @NotNull
    private static Function2<Composer, Integer, Unit> f44lambda$1341284559 = ComposableLambdaKt.composableLambdaInstance(-1341284559, false, new s(18));

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit lambda_1714259275$lambda$0(Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1714259275, i, -1, "androidx.compose.material.ComposableSingletons$ScaffoldKt.lambda$1714259275.<anonymous> (Scaffold.kt:181)");
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
    public static final Unit lambda_566090785$lambda$0(Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(566090785, i, -1, "androidx.compose.material.ComposableSingletons$ScaffoldKt.lambda$566090785.<anonymous> (Scaffold.kt:305)");
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
    public static final Unit lambda_866784315$lambda$0(Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(866784315, i, -1, "androidx.compose.material.ComposableSingletons$ScaffoldKt.lambda$866784315.<anonymous> (Scaffold.kt:180)");
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
    public static final Unit lambda_939725476$lambda$0(SnackbarHostState snackbarHostState, Composer composer, int i) {
        if ((i & 6) == 0) {
            i |= composer.changed(snackbarHostState) ? 4 : 2;
        }
        if (composer.shouldExecute((i & 19) != 18, i & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(939725476, i, -1, "androidx.compose.material.ComposableSingletons$ScaffoldKt.lambda$939725476.<anonymous> (Scaffold.kt:307)");
            }
            SnackbarHostKt.SnackbarHost(snackbarHostState, null, null, composer, i & 14, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit lambda__1341284559$lambda$0(Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1341284559, i, -1, "androidx.compose.material.ComposableSingletons$ScaffoldKt.lambda$-1341284559.<anonymous> (Scaffold.kt:308)");
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
    public static final Unit lambda__1406416085$lambda$0(Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1406416085, i, -1, "androidx.compose.material.ComposableSingletons$ScaffoldKt.lambda$-1406416085.<anonymous> (Scaffold.kt:183)");
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
    public static final Unit lambda__1624772335$lambda$0(Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1624772335, i, -1, "androidx.compose.material.ComposableSingletons$ScaffoldKt.lambda$-1624772335.<anonymous> (Scaffold.kt:306)");
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
    public static final Unit lambda__1836397928$lambda$0(SnackbarHostState snackbarHostState, Composer composer, int i) {
        if ((i & 6) == 0) {
            i |= composer.changed(snackbarHostState) ? 4 : 2;
        }
        if (composer.shouldExecute((i & 19) != 18, i & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1836397928, i, -1, "androidx.compose.material.ComposableSingletons$ScaffoldKt.lambda$-1836397928.<anonymous> (Scaffold.kt:182)");
            }
            SnackbarHostKt.SnackbarHost(snackbarHostState, null, null, composer, i & 14, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.f186387a;
    }

    @NotNull
    /* JADX INFO: renamed from: getLambda$-1341284559$material, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m1200getLambda$1341284559$material() {
        return f44lambda$1341284559;
    }

    @NotNull
    /* JADX INFO: renamed from: getLambda$-1406416085$material, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m1201getLambda$1406416085$material() {
        return f45lambda$1406416085;
    }

    @NotNull
    /* JADX INFO: renamed from: getLambda$-1624772335$material, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m1202getLambda$1624772335$material() {
        return f46lambda$1624772335;
    }

    @NotNull
    /* JADX INFO: renamed from: getLambda$-1836397928$material, reason: not valid java name */
    public final Function3 m1203getLambda$1836397928$material() {
        return f47lambda$1836397928;
    }

    @NotNull
    public final Function2<Composer, Integer, Unit> getLambda$1714259275$material() {
        return lambda$1714259275;
    }

    @NotNull
    public final Function2<Composer, Integer, Unit> getLambda$566090785$material() {
        return lambda$566090785;
    }

    @NotNull
    public final Function2<Composer, Integer, Unit> getLambda$866784315$material() {
        return lambda$866784315;
    }

    @NotNull
    public final Function3 getLambda$939725476$material() {
        return lambda$939725476;
    }
}
