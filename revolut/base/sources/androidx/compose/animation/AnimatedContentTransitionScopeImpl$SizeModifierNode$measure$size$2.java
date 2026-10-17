package androidx.compose.animation;

import androidx.compose.animation.AnimatedContentTransitionScopeImpl;
import androidx.compose.runtime.State;
import androidx.compose.ui.unit.IntSize;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.u;

/* JADX INFO: Add missing generic type declarations: [S] */
/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "Landroidx/compose/ui/unit/IntSize;", "S", "it", "invoke-YEO4UFw", "(Ljava/lang/Object;)J"}, k = 3, mv = {2, 0, 0}, xi = 48)
public final class AnimatedContentTransitionScopeImpl$SizeModifierNode$measure$size$2<S> extends u implements Function1<S, IntSize> {
    final /* synthetic */ long $currentSize;
    final /* synthetic */ AnimatedContentTransitionScopeImpl.SizeModifierNode<S> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnimatedContentTransitionScopeImpl$SizeModifierNode$measure$size$2(AnimatedContentTransitionScopeImpl.SizeModifierNode<S> sizeModifierNode, long j2) {
        super(1);
        this.this$0 = sizeModifierNode;
        this.$currentSize = j2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
        return IntSize.m3350boximpl(m544invokeYEO4UFw(obj2));
    }

    /* JADX INFO: renamed from: invoke-YEO4UFw, reason: not valid java name */
    public final long m544invokeYEO4UFw(S s2) {
        if (Intrinsics.f(s2, this.this$0.getScope().getInitialState())) {
            return this.this$0.m542lastContinuousSizeOrDefaultmzRDjE0(this.$currentSize);
        }
        State<IntSize> state = this.this$0.getScope().getTargetSizeMap$animation().get(s2);
        return state != null ? state.getValue().getPackedValue() : IntSize.INSTANCE.m3359getZeroYbymL2g();
    }
}
