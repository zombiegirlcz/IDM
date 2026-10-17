package androidx.compose.foundation.gestures;

import android.view.ViewConfiguration;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.unit.Density;
import java.util.List;
import kotlin.Metadata;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\n\u001a\u00020\u0007*\u00020\u0006H\u0001¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\f\u001a\u00020\u0007*\u00020\u0006H\u0001¢\u0006\u0004\b\u000b\u0010\tJ#\u0010\u0014\u001a\u00020\u0011*\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Landroidx/compose/foundation/gestures/AndroidConfig;", "Landroidx/compose/foundation/gestures/ScrollConfig;", "Landroid/view/ViewConfiguration;", "viewConfiguration", "<init>", "(Landroid/view/ViewConfiguration;)V", "Landroidx/compose/ui/unit/Density;", "", "getVerticalScrollFactor$foundation", "(Landroidx/compose/ui/unit/Density;)F", "getVerticalScrollFactor", "getHorizontalScrollFactor$foundation", "getHorizontalScrollFactor", "Landroidx/compose/ui/input/pointer/PointerEvent;", "event", "Landroidx/compose/ui/unit/IntSize;", "bounds", "Landroidx/compose/ui/geometry/Offset;", "calculateMouseWheelScroll-8xgXZGE", "(Landroidx/compose/ui/unit/Density;Landroidx/compose/ui/input/pointer/PointerEvent;J)J", "calculateMouseWheelScroll", "Landroid/view/ViewConfiguration;", "getViewConfiguration", "()Landroid/view/ViewConfiguration;", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AndroidConfig implements ScrollConfig {

    @NotNull
    private final ViewConfiguration viewConfiguration;

    public AndroidConfig(@NotNull ViewConfiguration viewConfiguration) {
        this.viewConfiguration = viewConfiguration;
    }

    @Override // androidx.compose.foundation.gestures.ScrollConfig
    /* JADX INFO: renamed from: calculateMouseWheelScroll-8xgXZGE, reason: not valid java name */
    public long mo679calculateMouseWheelScroll8xgXZGE(@NotNull Density density, @NotNull PointerEvent pointerEvent, long j2) {
        float f = -getVerticalScrollFactor$foundation(density);
        float f4 = -getHorizontalScrollFactor$foundation(density);
        List<PointerInputChange> changes = pointerEvent.getChanges();
        Offset offsetM1826boximpl = Offset.m1826boximpl(Offset.INSTANCE.m1845getZeroF1C5BW0());
        int size = changes.size();
        for (int i = 0; i < size; i++) {
            offsetM1826boximpl = Offset.m1826boximpl(Offset.m1839plusMKHz9U(offsetM1826boximpl.getPackedValue(), changes.get(i).getScrollDelta()));
        }
        long packedValue = offsetM1826boximpl.getPackedValue();
        float fIntBitsToFloat = Float.intBitsToFloat((int) (packedValue >> 32)) * f4;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (packedValue & BodyPartID.bodyIdMax)) * f;
        return Offset.m1827constructorimpl((((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & BodyPartID.bodyIdMax));
    }

    public final float getHorizontalScrollFactor$foundation(@NotNull Density density) {
        return ViewConfigurationApi26Impl.INSTANCE.getHorizontalScrollFactor(this.viewConfiguration);
    }

    public final float getVerticalScrollFactor$foundation(@NotNull Density density) {
        return ViewConfigurationApi26Impl.INSTANCE.getVerticalScrollFactor(this.viewConfiguration);
    }
}
