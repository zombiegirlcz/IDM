package androidx.compose.ui.viewinterop;

import android.view.View;
import androidx.compose.ui.focus.FocusEnterExitScope;
import androidx.compose.ui.focus.FocusInteropUtils_androidKt;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DelegatableNode_androidKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.u;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/focus/FocusEnterExitScope;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
public final class FocusGroupPropertiesNode$onEnter$1 extends u implements Function1<FocusEnterExitScope, Unit> {
    final /* synthetic */ FocusGroupPropertiesNode this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FocusGroupPropertiesNode$onEnter$1(FocusGroupPropertiesNode focusGroupPropertiesNode) {
        super(1);
        this.this$0 = focusGroupPropertiesNode;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
        invoke((FocusEnterExitScope) obj2);
        return Unit.f186387a;
    }

    public final void invoke(FocusEnterExitScope focusEnterExitScope) {
        View embeddedView = FocusGroupNode_androidKt.getEmbeddedView(this.this$0);
        if (embeddedView.isFocused() || embeddedView.hasFocus()) {
            return;
        }
        if (FocusInteropUtils_androidKt.requestInteropFocus(embeddedView, FocusInteropUtils_androidKt.m1766toAndroidFocusDirection3ESFkO8(focusEnterExitScope.getRequestedFocusDirection()), FocusGroupNode_androidKt.getCurrentlyFocusedRect(DelegatableNodeKt.requireOwner(this.this$0).getFocusOwner(), DelegatableNode_androidKt.requireView(this.this$0), embeddedView))) {
            return;
        }
        focusEnterExitScope.cancelFocusChange();
    }
}
