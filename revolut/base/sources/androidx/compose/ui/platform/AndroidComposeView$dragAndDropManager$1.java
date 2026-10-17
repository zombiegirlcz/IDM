package androidx.compose.ui.platform;

import androidx.compose.ui.draganddrop.DragAndDropTransferData;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.q;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
public final /* synthetic */ class AndroidComposeView$dragAndDropManager$1 extends q implements Function3 {
    public AndroidComposeView$dragAndDropManager$1(Object obj2) {
        super(3, 0, AndroidComposeView.class, obj2, "startDrag", "startDrag-12SF9DM(Landroidx/compose/ui/draganddrop/DragAndDropTransferData;JLkotlin/jvm/functions/Function1;)Z");
    }

    @Override // kotlin.jvm.functions.Function3
    public /* synthetic */ Object invoke(Object obj2, Object obj3, Object obj4) {
        if (obj2 == null) {
            return m2766invoke12SF9DM(null, ((Size) obj3).getPackedValue(), (Function1) obj4);
        }
        throw new ClassCastException();
    }

    /* JADX INFO: renamed from: invoke-12SF9DM, reason: not valid java name */
    public final Boolean m2766invoke12SF9DM(DragAndDropTransferData dragAndDropTransferData, long j2, Function1<? super DrawScope, Unit> function1) {
        return Boolean.valueOf(((AndroidComposeView) this.receiver).m2761startDrag12SF9DM(dragAndDropTransferData, j2, function1));
    }
}
