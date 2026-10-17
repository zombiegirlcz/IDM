package androidx.compose.ui.graphics.vector;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import com.revolut.data.database.models.openbanking.d;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.u;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
public final class VectorComponent$drawVectorBlock$1 extends u implements Function1<DrawScope, Unit> {
    final /* synthetic */ VectorComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VectorComponent$drawVectorBlock$1(VectorComponent vectorComponent) {
        super(1);
        this.this$0 = vectorComponent;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
        invoke((DrawScope) obj2);
        return Unit.f186387a;
    }

    public final void invoke(DrawScope drawScope) {
        GroupComponent root = this.this$0.getRoot();
        VectorComponent vectorComponent = this.this$0;
        float f = vectorComponent.rootScaleX;
        float f4 = vectorComponent.rootScaleY;
        long jM1845getZeroF1C5BW0 = Offset.INSTANCE.m1845getZeroF1C5BW0();
        DrawContext drawContext = drawScope.getDrawContext();
        long jMo2190getSizeNHjbRc = drawContext.mo2190getSizeNHjbRc();
        drawContext.getCanvas().save();
        try {
            drawContext.getTransform().mo2196scale0AR0LA0(f, f4, jM1845getZeroF1C5BW0);
            root.draw(drawScope);
        } finally {
            d.B(drawContext, jMo2190getSizeNHjbRc);
        }
    }
}
