package androidx.compose.ui.draganddrop;

import androidx.compose.ui.geometry.Offset;
import kotlin.Metadata;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0018\u0010\u0004\u001a\u00020\u0001*\u00020\u00008@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Landroidx/compose/ui/draganddrop/DragAndDropEvent;", "Landroidx/compose/ui/geometry/Offset;", "getPositionInRoot", "(Landroidx/compose/ui/draganddrop/DragAndDropEvent;)J", "positionInRoot", "ui"}, k = 2, mv = {2, 0, 0}, xi = 48)
public abstract class DragAndDrop_androidKt {
    public static final long getPositionInRoot(@NotNull DragAndDropEvent dragAndDropEvent) {
        float x3 = dragAndDropEvent.getDragEvent().getX();
        float y2 = dragAndDropEvent.getDragEvent().getY();
        return Offset.m1827constructorimpl((((long) Float.floatToRawIntBits(x3)) << 32) | (((long) Float.floatToRawIntBits(y2)) & BodyPartID.bodyIdMax));
    }
}
