package androidx.compose.ui.node;

import androidx.compose.ui.Modifier;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u000e\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\u0002¨\u0006\u0003"}, d2 = {"nextDrawNode", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/node/DelegatableNode;", "ui"}, k = 2, mv = {2, 0, 0}, xi = 48)
public abstract class LayoutNodeDrawScopeKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Modifier.Node nextDrawNode(DelegatableNode delegatableNode) {
        int iM2722constructorimpl = NodeKind.m2722constructorimpl(4);
        int iM2722constructorimpl2 = NodeKind.m2722constructorimpl(2);
        Modifier.Node child = delegatableNode.getNode().getChild();
        if (child == null || (child.getAggregateChildKindSet() & iM2722constructorimpl) == 0) {
            return null;
        }
        while (child != null && (child.getKindSet() & iM2722constructorimpl2) == 0) {
            if ((child.getKindSet() & iM2722constructorimpl) != 0) {
                return child;
            }
            child = child.getChild();
        }
        return null;
    }
}
