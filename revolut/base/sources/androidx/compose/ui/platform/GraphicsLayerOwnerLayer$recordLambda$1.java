package androidx.compose.ui.platform;

import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.u;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
public final class GraphicsLayerOwnerLayer$recordLambda$1 extends u implements Function1<DrawScope, Unit> {
    final /* synthetic */ GraphicsLayerOwnerLayer this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GraphicsLayerOwnerLayer$recordLambda$1(GraphicsLayerOwnerLayer graphicsLayerOwnerLayer) {
        super(1);
        this.this$0 = graphicsLayerOwnerLayer;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
        invoke((DrawScope) obj2);
        return Unit.f186387a;
    }

    public final void invoke(DrawScope drawScope) {
        GraphicsLayerOwnerLayer graphicsLayerOwnerLayer = this.this$0;
        Canvas canvas = drawScope.getDrawContext().getCanvas();
        Function2 function2 = graphicsLayerOwnerLayer.drawBlock;
        if (function2 != null) {
            function2.invoke(canvas, drawScope.getDrawContext().getGraphicsLayer());
        }
    }
}
