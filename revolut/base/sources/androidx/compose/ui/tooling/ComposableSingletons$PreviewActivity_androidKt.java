package androidx.compose.ui.tooling;

import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import f3.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
public final class ComposableSingletons$PreviewActivity_androidKt {

    @NotNull
    public static final ComposableSingletons$PreviewActivity_androidKt INSTANCE = new ComposableSingletons$PreviewActivity_androidKt();

    /* JADX INFO: renamed from: lambda$-426398407, reason: not valid java name */
    @NotNull
    private static Function2<Composer, Integer, Unit> f68lambda$426398407 = ComposableLambdaKt.composableLambdaInstance(-426398407, false, new a(0));

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit lambda__426398407$lambda$0(Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-426398407, i, -1, "androidx.compose.ui.tooling.ComposableSingletons$PreviewActivity_androidKt.lambda$-426398407.<anonymous> (PreviewActivity.android.kt:118)");
            }
            TextKt.m1282TextfLXpl1I("Next", null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, null, composer, 6, 0, 65534);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.f186387a;
    }

    @NotNull
    /* JADX INFO: renamed from: getLambda$-426398407$ui_tooling, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m3267getLambda$426398407$ui_tooling() {
        return f68lambda$426398407;
    }
}
