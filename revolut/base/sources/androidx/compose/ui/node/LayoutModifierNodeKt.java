package androidx.compose.ui.node;

import androidx.compose.ui.graphics.GraphicsLayerScope;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0004\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0004\u0010\u0003\u001a\u0011\u0010\u0005\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0005\u0010\u0003\u001a\u0011\u0010\u0006\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0006\u0010\u0003\u001a'\u0010\n\u001a\u00020\u0001*\u00020\u00002\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Landroidx/compose/ui/node/LayoutModifierNode;", "", "remeasureSync", "(Landroidx/compose/ui/node/LayoutModifierNode;)V", "invalidateLayer", "invalidatePlacement", "invalidateMeasurement", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/GraphicsLayerScope;", "layerBlock", "updateLayerBlock", "(Landroidx/compose/ui/node/LayoutModifierNode;Lkotlin/jvm/functions/Function1;)V", "ui"}, k = 2, mv = {2, 0, 0}, xi = 48)
public abstract class LayoutModifierNodeKt {
    public static final void invalidateLayer(@NotNull LayoutModifierNode layoutModifierNode) {
        DelegatableNodeKt.m2612requireCoordinator64DMado(layoutModifierNode, NodeKind.m2722constructorimpl(2)).invalidateLayer();
    }

    public static final void invalidateMeasurement(@NotNull LayoutModifierNode layoutModifierNode) {
        DelegatableNodeKt.requireLayoutNode(layoutModifierNode).invalidateMeasurements$ui();
    }

    public static final void invalidatePlacement(@NotNull LayoutModifierNode layoutModifierNode) {
        LayoutNode.requestRelayout$ui$default(DelegatableNodeKt.requireLayoutNode(layoutModifierNode), false, 1, null);
    }

    public static final void remeasureSync(@NotNull LayoutModifierNode layoutModifierNode) {
        DelegatableNodeKt.requireLayoutNode(layoutModifierNode).forceRemeasure();
    }

    public static final void updateLayerBlock(@NotNull LayoutModifierNode layoutModifierNode, Function1<? super GraphicsLayerScope, Unit> function1) {
        NodeCoordinator wrapped;
        if (layoutModifierNode.getNode().getIsAttached() && (wrapped = DelegatableNodeKt.m2612requireCoordinator64DMado(layoutModifierNode, NodeKind.m2722constructorimpl(2)).getWrapped()) != null) {
            wrapped.updateLayerBlock(function1, true);
        }
    }
}
