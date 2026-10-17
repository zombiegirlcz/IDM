package androidx.compose.ui.node;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.u;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/node/ComposeUiNode;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
public final class ComposeUiNode$Companion$ApplyOnDeactivatedNodeAssertion$1 extends u implements Function1<ComposeUiNode, Unit> {
    public static final ComposeUiNode$Companion$ApplyOnDeactivatedNodeAssertion$1 INSTANCE = new ComposeUiNode$Companion$ApplyOnDeactivatedNodeAssertion$1();

    public ComposeUiNode$Companion$ApplyOnDeactivatedNodeAssertion$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
        invoke((ComposeUiNode) obj2);
        return Unit.f186387a;
    }

    public final void invoke(ComposeUiNode composeUiNode) {
        LayoutNode layoutNode = composeUiNode instanceof LayoutNode ? (LayoutNode) composeUiNode : null;
        if (layoutNode == null || !layoutNode.getIsDeactivated()) {
            return;
        }
        throw new IllegalStateException("Apply is called on deactivated node " + composeUiNode);
    }
}
