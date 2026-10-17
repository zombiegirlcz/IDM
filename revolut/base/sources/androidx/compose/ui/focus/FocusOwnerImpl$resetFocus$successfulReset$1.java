package androidx.compose.ui.focus;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.u;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "Landroidx/compose/ui/focus/FocusTargetNode;", "invoke", "(Landroidx/compose/ui/focus/FocusTargetNode;)Ljava/lang/Boolean;"}, k = 3, mv = {2, 0, 0}, xi = 48)
public final class FocusOwnerImpl$resetFocus$successfulReset$1 extends u implements Function1<FocusTargetNode, Boolean> {

    /* JADX INFO: renamed from: $$v$c$androidx-compose-ui-focus-FocusDirection$-focusDirection$0, reason: not valid java name */
    final /* synthetic */ int f55$$v$c$androidxcomposeuifocusFocusDirection$focusDirection$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FocusOwnerImpl$resetFocus$successfulReset$1(int i) {
        super(1);
        this.f55$$v$c$androidxcomposeuifocusFocusDirection$focusDirection$0 = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(FocusTargetNode focusTargetNode) {
        return Boolean.valueOf(focusTargetNode.mo1784requestFocus3ESFkO8(this.f55$$v$c$androidxcomposeuifocusFocusDirection$focusDirection$0));
    }
}
