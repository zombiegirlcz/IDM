package androidx.compose.ui.graphics.vector;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.u;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "node", "Landroidx/compose/ui/graphics/vector/VNode;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
public final class GroupComponent$wrappedListener$1 extends u implements Function1<VNode, Unit> {
    final /* synthetic */ GroupComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GroupComponent$wrappedListener$1(GroupComponent groupComponent) {
        super(1);
        this.this$0 = groupComponent;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
        invoke((VNode) obj2);
        return Unit.f186387a;
    }

    public final void invoke(VNode vNode) {
        this.this$0.markTintForVNode(vNode);
        Function1<VNode, Unit> invalidateListener$ui = this.this$0.getInvalidateListener$ui();
        if (invalidateListener$ui != null) {
            invalidateListener$ui.invoke(vNode);
        }
    }
}
