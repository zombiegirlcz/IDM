package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
public final class ComposableSingletons$SnackbarHostKt {

    @NotNull
    public static final ComposableSingletons$SnackbarHostKt INSTANCE = new ComposableSingletons$SnackbarHostKt();

    /* JADX INFO: renamed from: lambda$-1548712596, reason: not valid java name */
    @NotNull
    private static Function3 f52lambda$1548712596 = ComposableLambdaKt.composableLambdaInstance(-1548712596, false, new Function3() { // from class: androidx.compose.material3.ComposableSingletons$SnackbarHostKt$lambda$-1548712596$1
        @Override // kotlin.jvm.functions.Function3
        public /* synthetic */ Object invoke(Object obj2, Object obj3, Object obj4) {
            if (obj2 != null) {
                throw new ClassCastException();
            }
            invoke((SnackbarData) null, (Composer) obj3, ((Number) obj4).intValue());
            return Unit.f186387a;
        }

        public final void invoke(SnackbarData snackbarData, Composer composer, int i) {
            SnackbarData snackbarData2;
            int i2;
            if ((i & 6) == 0) {
                snackbarData2 = snackbarData;
                i2 = i | (composer.changed(snackbarData2) ? 4 : 2);
            } else {
                snackbarData2 = snackbarData;
                i2 = i;
            }
            if (!composer.shouldExecute((i2 & 19) != 18, i2 & 1)) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1548712596, i2, -1, "androidx.compose.material3.ComposableSingletons$SnackbarHostKt.lambda$-1548712596.<anonymous> (SnackbarHost.kt:219)");
            }
            SnackbarKt.m1395SnackbarsDKtq54(snackbarData2, null, false, null, 0L, 0L, 0L, 0L, 0L, composer, i2 & 14, 510);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    @NotNull
    /* JADX INFO: renamed from: getLambda$-1548712596$material3, reason: not valid java name */
    public final Function3 m1364getLambda$1548712596$material3() {
        return f52lambda$1548712596;
    }
}
