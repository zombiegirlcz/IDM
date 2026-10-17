package androidx.compose.ui.layout;

import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.LookaheadDelegate;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00018@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"rootLookaheadDelegate", "Landroidx/compose/ui/node/LookaheadDelegate;", "getRootLookaheadDelegate", "(Landroidx/compose/ui/node/LookaheadDelegate;)Landroidx/compose/ui/node/LookaheadDelegate;", "ui"}, k = 2, mv = {2, 0, 0}, xi = 48)
public abstract class LookaheadLayoutCoordinatesKt {
    @NotNull
    public static final LookaheadDelegate getRootLookaheadDelegate(@NotNull LookaheadDelegate lookaheadDelegate) {
        LayoutNode layoutNode = lookaheadDelegate.getLayoutNode();
        while (true) {
            LayoutNode parent$ui = layoutNode.getParent$ui();
            if ((parent$ui != null ? parent$ui.getLookaheadRoot() : null) == null) {
                LookaheadDelegate lookaheadDelegate2 = layoutNode.getOuterCoordinator$ui().getLookaheadDelegate();
                Intrinsics.h(lookaheadDelegate2);
                return lookaheadDelegate2;
            }
            LayoutNode parent$ui2 = layoutNode.getParent$ui();
            LayoutNode lookaheadRoot = parent$ui2 != null ? parent$ui2.getLookaheadRoot() : null;
            Intrinsics.h(lookaheadRoot);
            if (lookaheadRoot.getIsVirtualLookaheadRoot()) {
                layoutNode = layoutNode.getParent$ui();
                Intrinsics.h(layoutNode);
            } else {
                LayoutNode parent$ui3 = layoutNode.getParent$ui();
                Intrinsics.h(parent$ui3);
                layoutNode = parent$ui3.getLookaheadRoot();
                Intrinsics.h(layoutNode);
            }
        }
    }
}
