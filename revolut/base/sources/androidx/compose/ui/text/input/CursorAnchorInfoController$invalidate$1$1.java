package androidx.compose.ui.text.input;

import androidx.compose.ui.graphics.Matrix;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.u;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "Landroidx/compose/ui/graphics/Matrix;", "invoke-58bKbWc", "([F)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
public final class CursorAnchorInfoController$invalidate$1$1 extends u implements Function1<Matrix, Unit> {
    public static final CursorAnchorInfoController$invalidate$1$1 INSTANCE = new CursorAnchorInfoController$invalidate$1$1();

    public CursorAnchorInfoController$invalidate$1$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
        m3046invoke58bKbWc(((Matrix) obj2).getValues());
        return Unit.f186387a;
    }

    /* JADX INFO: renamed from: invoke-58bKbWc, reason: not valid java name */
    public final void m3046invoke58bKbWc(float[] fArr) {
    }
}
