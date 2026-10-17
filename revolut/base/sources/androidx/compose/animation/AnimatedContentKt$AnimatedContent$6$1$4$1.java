package androidx.compose.animation;

import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.u;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "currentState", "Landroidx/compose/animation/EnterExitState;", "targetState", "invoke", "(Landroidx/compose/animation/EnterExitState;Landroidx/compose/animation/EnterExitState;)Ljava/lang/Boolean;"}, k = 3, mv = {2, 0, 0}, xi = 48)
public final class AnimatedContentKt$AnimatedContent$6$1$4$1 extends u implements Function2<EnterExitState, EnterExitState, Boolean> {
    final /* synthetic */ ExitTransition $exit;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnimatedContentKt$AnimatedContent$6$1$4$1(ExitTransition exitTransition) {
        super(2);
        this.$exit = exitTransition;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Boolean invoke(EnterExitState enterExitState, EnterExitState enterExitState2) {
        EnterExitState enterExitState3 = EnterExitState.PostExit;
        return Boolean.valueOf(enterExitState == enterExitState3 && enterExitState2 == enterExitState3 && !this.$exit.getData().getHold());
    }
}
