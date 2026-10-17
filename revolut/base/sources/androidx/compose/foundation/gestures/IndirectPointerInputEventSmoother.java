package androidx.compose.foundation.gestures;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.indirect.IndirectPointerInputChange;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.jetbrains.annotations.NotNull;
import zhm.d0;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\f\u0010\rR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Landroidx/compose/foundation/gestures/IndirectPointerInputEventSmoother;", "", "<init>", "()V", "eventRotatingIndex", "", "eventRotatingArray", "", "Landroidx/compose/ui/input/indirect/IndirectPointerInputChange;", "smoothEventPosition", "Landroidx/compose/ui/geometry/Offset;", "change", "smoothEventPosition-tuRUvjQ", "(Landroidx/compose/ui/input/indirect/IndirectPointerInputChange;)J", "Companion", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class IndirectPointerInputEventSmoother {

    @NotNull
    private List<IndirectPointerInputChange> eventRotatingArray = new ArrayList();
    private int eventRotatingIndex;
    public static final int $stable = 8;

    /* JADX INFO: renamed from: smoothEventPosition-tuRUvjQ, reason: not valid java name */
    public final long m749smoothEventPositiontuRUvjQ(@NotNull IndirectPointerInputChange change) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (change.getPosition() >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (change.getPosition() & BodyPartID.bodyIdMax));
        if (IndirectPointerInputDragCycleDetectorKt.changedToDownIgnoreConsumed(change)) {
            this.eventRotatingIndex = 0;
            this.eventRotatingArray.clear();
        }
        if (!IndirectPointerInputDragCycleDetectorKt.changedToUpIgnoreConsumed(change) && !IndirectPointerInputDragCycleDetectorKt.changedToDownIgnoreConsumed(change)) {
            if (this.eventRotatingArray.size() == 3) {
                List<IndirectPointerInputChange> list = this.eventRotatingArray;
                int i = this.eventRotatingIndex;
                this.eventRotatingIndex = i + 1;
                list.set(i, change);
            } else {
                this.eventRotatingArray.add(change);
            }
            if (this.eventRotatingIndex == 3) {
                this.eventRotatingIndex = 0;
            }
            List<IndirectPointerInputChange> list2 = this.eventRotatingArray;
            ArrayList arrayList = new ArrayList(list2.size());
            int size = list2.size();
            for (int i2 = 0; i2 < size; i2++) {
                arrayList.add(Float.valueOf(Float.intBitsToFloat((int) (list2.get(i2).getPosition() >> 32))));
            }
            fIntBitsToFloat = (float) d0.R(arrayList);
            List<IndirectPointerInputChange> list3 = this.eventRotatingArray;
            ArrayList arrayList2 = new ArrayList(list3.size());
            int size2 = list3.size();
            for (int i3 = 0; i3 < size2; i3++) {
                arrayList2.add(Float.valueOf(Float.intBitsToFloat((int) (list3.get(i3).getPosition() & BodyPartID.bodyIdMax))));
            }
            fIntBitsToFloat2 = (float) d0.R(arrayList2);
        }
        return Offset.m1827constructorimpl((((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32));
    }
}
