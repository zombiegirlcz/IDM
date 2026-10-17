package androidx.compose.ui.node;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/node/DrawModifierNode;", "", "invalidateDraw", "(Landroidx/compose/ui/node/DrawModifierNode;)V", "ui"}, k = 2, mv = {2, 0, 0}, xi = 48)
public abstract class DrawModifierNodeKt {
    public static final void invalidateDraw(@NotNull DrawModifierNode drawModifierNode) {
        if (drawModifierNode.getNode().getIsAttached()) {
            DelegatableNodeKt.m2612requireCoordinator64DMado(drawModifierNode, NodeKind.m2722constructorimpl(1)).invalidateLayer();
        }
    }
}
