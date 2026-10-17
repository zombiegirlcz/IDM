package androidx.compose.ui.focus;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.BeyondBoundsLayout;
import androidx.compose.ui.node.DelegatableNodeKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.u;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/layout/BeyondBoundsLayout$BeyondBoundsScope;", "invoke", "(Landroidx/compose/ui/layout/BeyondBoundsLayout$BeyondBoundsScope;)Ljava/lang/Boolean;"}, k = 3, mv = {2, 0, 0}, xi = 48)
public final class TwoDimensionalFocusSearchKt$generateAndSearchChildren$1 extends u implements Function1<BeyondBoundsLayout.BeyondBoundsScope, Boolean> {

    /* JADX INFO: renamed from: $$v$c$androidx-compose-ui-focus-FocusDirection$-direction$0, reason: not valid java name */
    final /* synthetic */ int f60$$v$c$androidxcomposeuifocusFocusDirection$direction$0;
    final /* synthetic */ FocusTargetNode $activeNodeBeforeSearch;
    final /* synthetic */ Rect $focusedItem;
    final /* synthetic */ Function1<FocusTargetNode, Boolean> $onFound;
    final /* synthetic */ FocusTargetNode $this_generateAndSearchChildren;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TwoDimensionalFocusSearchKt$generateAndSearchChildren$1(FocusTargetNode focusTargetNode, FocusTargetNode focusTargetNode2, Rect rect, int i, Function1<? super FocusTargetNode, Boolean> function1) {
        super(1);
        this.$activeNodeBeforeSearch = focusTargetNode;
        this.$this_generateAndSearchChildren = focusTargetNode2;
        this.$focusedItem = rect;
        this.f60$$v$c$androidxcomposeuifocusFocusDirection$direction$0 = i;
        this.$onFound = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(BeyondBoundsLayout.BeyondBoundsScope beyondBoundsScope) {
        if (this.$activeNodeBeforeSearch != DelegatableNodeKt.requireOwner(this.$this_generateAndSearchChildren).getFocusOwner().getActiveFocusTargetNode()) {
            return Boolean.TRUE;
        }
        boolean zM1818searchChildren4C6V_qg = TwoDimensionalFocusSearchKt.m1818searchChildren4C6V_qg(this.$this_generateAndSearchChildren, this.$focusedItem, this.f60$$v$c$androidxcomposeuifocusFocusDirection$direction$0, this.$onFound);
        Boolean boolValueOf = Boolean.valueOf(zM1818searchChildren4C6V_qg);
        if (zM1818searchChildren4C6V_qg || !beyondBoundsScope.getHasMoreContent()) {
            return boolValueOf;
        }
        return null;
    }
}
