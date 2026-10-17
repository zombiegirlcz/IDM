package androidx.compose.animation;

import androidx.compose.animation.AnimatedContentTransitionScopeImpl;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.runtime.State;
import androidx.compose.ui.unit.IntSize;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.u;

/* JADX INFO: Add missing generic type declarations: [S] */
/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001\"\u0004\b\u0000\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00030\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "Landroidx/compose/ui/unit/IntSize;", "S", "Landroidx/compose/animation/core/Transition$Segment;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
public final class AnimatedContentTransitionScopeImpl$SizeModifierNode$measure$size$1<S> extends u implements Function1<Transition.Segment<S>, FiniteAnimationSpec<IntSize>> {
    final /* synthetic */ long $currentSize;
    final /* synthetic */ AnimatedContentTransitionScopeImpl.SizeModifierNode<S> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnimatedContentTransitionScopeImpl$SizeModifierNode$measure$size$1(AnimatedContentTransitionScopeImpl.SizeModifierNode<S> sizeModifierNode, long j2) {
        super(1);
        this.this$0 = sizeModifierNode;
        this.$currentSize = j2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final FiniteAnimationSpec<IntSize> invoke(Transition.Segment<S> segment) {
        long packedValue;
        FiniteAnimationSpec<IntSize> finiteAnimationSpecMo572createAnimationSpecTemP2vQ;
        if (Intrinsics.f(segment.getInitialState(), this.this$0.getScope().getInitialState())) {
            packedValue = this.this$0.m542lastContinuousSizeOrDefaultmzRDjE0(this.$currentSize);
        } else {
            State<IntSize> state = this.this$0.getScope().getTargetSizeMap$animation().get(segment.getInitialState());
            packedValue = state != null ? state.getValue().getPackedValue() : IntSize.INSTANCE.m3359getZeroYbymL2g();
        }
        State<IntSize> state2 = this.this$0.getScope().getTargetSizeMap$animation().get(segment.getTargetState());
        long packedValue2 = state2 != null ? state2.getValue().getPackedValue() : IntSize.INSTANCE.m3359getZeroYbymL2g();
        SizeTransform value = this.this$0.getSizeTransform().getValue();
        return (value == null || (finiteAnimationSpecMo572createAnimationSpecTemP2vQ = value.mo572createAnimationSpecTemP2vQ(packedValue, packedValue2)) == null) ? AnimationSpecKt.spring$default(BitmapDescriptorFactory.HUE_RED, 400.0f, null, 5, null) : finiteAnimationSpecMo572createAnimationSpecTemP2vQ;
    }
}
