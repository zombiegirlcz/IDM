package androidx.content.compose;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.content.NavBackStackEntry;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
public final class ComposableSingletons$DialogNavigatorKt {

    @NotNull
    public static final ComposableSingletons$DialogNavigatorKt INSTANCE = new ComposableSingletons$DialogNavigatorKt();

    /* JADX INFO: renamed from: lambda$-1092249270, reason: not valid java name */
    @NotNull
    private static Function3 f72lambda$1092249270 = ComposableLambdaKt.composableLambdaInstance(-1092249270, false, new Function3() { // from class: androidx.navigation.compose.ComposableSingletons$DialogNavigatorKt$lambda$-1092249270$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3, Object obj4) {
            invoke((NavBackStackEntry) obj2, (Composer) obj3, ((Number) obj4).intValue());
            return Unit.f186387a;
        }

        public final void invoke(NavBackStackEntry navBackStackEntry, Composer composer, int i) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1092249270, i, -1, "androidx.navigation.compose.ComposableSingletons$DialogNavigatorKt.lambda$-1092249270.<anonymous> (DialogNavigator.kt:58)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    @NotNull
    /* JADX INFO: renamed from: getLambda$-1092249270$navigation_compose_release, reason: not valid java name */
    public final Function3 m3587getLambda$1092249270$navigation_compose_release() {
        return f72lambda$1092249270;
    }
}
