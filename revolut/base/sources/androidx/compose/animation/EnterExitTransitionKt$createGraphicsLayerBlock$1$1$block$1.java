package androidx.compose.animation;

import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.TransformOrigin;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.u;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/graphics/GraphicsLayerScope;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
public final class EnterExitTransitionKt$createGraphicsLayerBlock$1$1$block$1 extends u implements Function1<GraphicsLayerScope, Unit> {
    final /* synthetic */ State<Float> $alpha;
    final /* synthetic */ State<Float> $scale;
    final /* synthetic */ State<TransformOrigin> $transformOrigin;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EnterExitTransitionKt$createGraphicsLayerBlock$1$1$block$1(State<Float> state, State<Float> state2, State<TransformOrigin> state3) {
        super(1);
        this.$alpha = state;
        this.$scale = state2;
        this.$transformOrigin = state3;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
        invoke((GraphicsLayerScope) obj2);
        return Unit.f186387a;
    }

    public final void invoke(GraphicsLayerScope graphicsLayerScope) {
        State<Float> state = this.$alpha;
        graphicsLayerScope.setAlpha(state != null ? state.getValue().floatValue() : 1.0f);
        State<Float> state2 = this.$scale;
        graphicsLayerScope.setScaleX(state2 != null ? state2.getValue().floatValue() : 1.0f);
        State<Float> state3 = this.$scale;
        graphicsLayerScope.setScaleY(state3 != null ? state3.getValue().floatValue() : 1.0f);
        State<TransformOrigin> state4 = this.$transformOrigin;
        graphicsLayerScope.mo2033setTransformOrigin__ExYCQ(state4 != null ? state4.getValue().getPackedValue() : TransformOrigin.INSTANCE.m2141getCenterSzJe1aQ());
    }
}
