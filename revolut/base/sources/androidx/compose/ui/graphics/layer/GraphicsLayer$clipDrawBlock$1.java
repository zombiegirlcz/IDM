package androidx.compose.ui.graphics.layer;

import androidx.compose.ui.graphics.ClipOp;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import com.revolut.data.database.models.openbanking.d;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.u;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
public final class GraphicsLayer$clipDrawBlock$1 extends u implements Function1<DrawScope, Unit> {
    final /* synthetic */ GraphicsLayer this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GraphicsLayer$clipDrawBlock$1(GraphicsLayer graphicsLayer) {
        super(1);
        this.this$0 = graphicsLayer;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
        invoke((DrawScope) obj2);
        return Unit.f186387a;
    }

    public final void invoke(DrawScope drawScope) {
        Path path = this.this$0.outlinePath;
        if (!this.this$0.usePathForClip || !this.this$0.getClip() || path == null) {
            this.this$0.drawWithChildTracking(drawScope);
            return;
        }
        GraphicsLayer graphicsLayer = this.this$0;
        int iM1971getIntersectrtfAjoo = ClipOp.INSTANCE.m1971getIntersectrtfAjoo();
        DrawContext drawContext = drawScope.getDrawContext();
        long jMo2190getSizeNHjbRc = drawContext.mo2190getSizeNHjbRc();
        drawContext.getCanvas().save();
        try {
            drawContext.getTransform().mo2192clipPathmtrdDE(path, iM1971getIntersectrtfAjoo);
            graphicsLayer.drawWithChildTracking(drawScope);
        } finally {
            d.B(drawContext, jMo2190getSizeNHjbRc);
        }
    }
}
