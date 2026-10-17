package androidx.compose.ui.layout;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.layout.LayoutNodeSubcompositionsState;
import com.youTransactor.uCube.rpc.Constants;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.u;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "(Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
public final class LayoutNodeSubcompositionsState$subcompose$4$1$composable$1 extends u implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ Function2<Composer, Integer, Unit> $content;
    final /* synthetic */ LayoutNodeSubcompositionsState.NodeState $nodeState;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public LayoutNodeSubcompositionsState$subcompose$4$1$composable$1(LayoutNodeSubcompositionsState.NodeState nodeState, Function2<? super Composer, ? super Integer, Unit> function2) {
        super(2);
        this.$nodeState = nodeState;
        this.$content = function2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
        invoke((Composer) obj2, ((Number) obj3).intValue());
        return Unit.f186387a;
    }

    public final void invoke(Composer composer, int i) {
        if (!composer.shouldExecute((i & 3) != 2, i & 1)) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1524156494, i, -1, "androidx.compose.ui.layout.LayoutNodeSubcompositionsState.subcompose.<anonymous>.<anonymous>.<anonymous> (SubcomposeLayout.kt:706)");
        }
        boolean active = this.$nodeState.getActive();
        Function2<Composer, Integer, Unit> function2 = this.$content;
        composer.startReusableGroup(Constants.TAG_CF_ENHANCED_SRED_CONFIGURATION, Boolean.valueOf(active));
        boolean zChanged = composer.changed(active);
        if (active) {
            function2.invoke(composer, 0);
        } else {
            composer.deactivateToEndGroup(zChanged);
        }
        composer.endReusableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
