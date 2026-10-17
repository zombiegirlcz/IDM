package androidx.compose.ui.node;

import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.u;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "canvas", "Landroidx/compose/ui/graphics/Canvas;", "parentLayer", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
public final class NodeCoordinator$drawBlock$1 extends u implements Function2<Canvas, GraphicsLayer, Unit> {
    final /* synthetic */ Function0<Unit> $drawBlockCallToDrawModifiers;
    final /* synthetic */ NodeCoordinator this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NodeCoordinator$drawBlock$1(NodeCoordinator nodeCoordinator, Function0<Unit> function0) {
        super(2);
        this.this$0 = nodeCoordinator;
        this.$drawBlockCallToDrawModifiers = function0;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
        invoke((Canvas) obj2, (GraphicsLayer) obj3);
        return Unit.f186387a;
    }

    public final void invoke(Canvas canvas, GraphicsLayer graphicsLayer) {
        if (!this.this$0.getLayoutNode().isPlaced()) {
            this.this$0.lastLayerDrawingWasSkipped = true;
            return;
        }
        this.this$0.drawBlockCanvas = canvas;
        this.this$0.drawBlockParentLayer = graphicsLayer;
        OwnerSnapshotObserver snapshotObserver = this.this$0.getSnapshotObserver();
        snapshotObserver.observer.observeReads(this.this$0, NodeCoordinator.onCommitAffectingLayer, this.$drawBlockCallToDrawModifiers);
        this.this$0.lastLayerDrawingWasSkipped = false;
    }
}
