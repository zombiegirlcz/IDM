package androidx.compose.animation;

import androidx.compose.ui.graphics.TransformOrigin;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.u;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "Landroidx/compose/ui/graphics/TransformOrigin;", "it", "Landroidx/compose/animation/EnterExitState;", "invoke-LIALnN8", "(Landroidx/compose/animation/EnterExitState;)J"}, k = 3, mv = {2, 0, 0}, xi = 48)
public final class EnterExitTransitionKt$createGraphicsLayerBlock$1$1$transformOrigin$2 extends u implements Function1<EnterExitState, TransformOrigin> {
    final /* synthetic */ EnterTransition $enter;
    final /* synthetic */ ExitTransition $exit;
    final /* synthetic */ TransformOrigin $transformOriginWhenVisible;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EnterExitState.values().length];
            try {
                iArr[EnterExitState.Visible.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnterExitState.PreEnter.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnterExitState.PostExit.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EnterExitTransitionKt$createGraphicsLayerBlock$1$1$transformOrigin$2(TransformOrigin transformOrigin, EnterTransition enterTransition, ExitTransition exitTransition) {
        super(1);
        this.$transformOriginWhenVisible = transformOrigin;
        this.$enter = enterTransition;
        this.$exit = exitTransition;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
        return TransformOrigin.m2132boximpl(m554invokeLIALnN8((EnterExitState) obj2));
    }

    /* JADX INFO: renamed from: invoke-LIALnN8, reason: not valid java name */
    public final long m554invokeLIALnN8(EnterExitState enterExitState) {
        TransformOrigin transformOriginM2132boximpl;
        int i = WhenMappings.$EnumSwitchMapping$0[enterExitState.ordinal()];
        if (i != 1) {
            transformOriginM2132boximpl = null;
            if (i == 2) {
                Scale scale = this.$enter.getData().getScale();
                if (scale != null || (scale = this.$exit.getData().getScale()) != null) {
                    transformOriginM2132boximpl = TransformOrigin.m2132boximpl(scale.getTransformOrigin());
                }
            } else {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                Scale scale2 = this.$exit.getData().getScale();
                if (scale2 != null || (scale2 = this.$enter.getData().getScale()) != null) {
                    transformOriginM2132boximpl = TransformOrigin.m2132boximpl(scale2.getTransformOrigin());
                }
            }
        } else {
            transformOriginM2132boximpl = this.$transformOriginWhenVisible;
        }
        return transformOriginM2132boximpl != null ? transformOriginM2132boximpl.getPackedValue() : TransformOrigin.INSTANCE.m2141getCenterSzJe1aQ();
    }
}
