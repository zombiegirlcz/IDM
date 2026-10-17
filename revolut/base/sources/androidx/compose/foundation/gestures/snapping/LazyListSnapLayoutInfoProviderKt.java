package androidx.compose.foundation.gestures.snapping;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.lazy.LazyListLayoutInfo;
import androidx.compose.ui.unit.Density;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\"\u0018\u0010\n\u001a\u00020\u0007*\u00020\u00068@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Landroidx/compose/ui/unit/Density;", "", "velocity", "Landroidx/compose/foundation/gestures/snapping/FinalSnappingItem;", "calculateFinalSnappingItem", "(Landroidx/compose/ui/unit/Density;F)I", "Landroidx/compose/foundation/lazy/LazyListLayoutInfo;", "", "getSingleAxisViewportSize", "(Landroidx/compose/foundation/lazy/LazyListLayoutInfo;)I", "singleAxisViewportSize", "foundation"}, k = 2, mv = {2, 0, 0}, xi = 48)
public abstract class LazyListSnapLayoutInfoProviderKt {
    public static final int calculateFinalSnappingItem(@NotNull Density density, float f) {
        return Math.abs(f) < density.mo768toPx0680j_4(SnapFlingBehaviorKt.getMinFlingVelocityDp()) ? FinalSnappingItem.INSTANCE.m806getClosestItembbeMdSM() : f > BitmapDescriptorFactory.HUE_RED ? FinalSnappingItem.INSTANCE.m807getNextItembbeMdSM() : FinalSnappingItem.INSTANCE.m808getPreviousItembbeMdSM();
    }

    public static final int getSingleAxisViewportSize(@NotNull LazyListLayoutInfo lazyListLayoutInfo) {
        return (int) (lazyListLayoutInfo.getOrientation() == Orientation.Vertical ? lazyListLayoutInfo.mo901getViewportSizeYbymL2g() & BodyPartID.bodyIdMax : lazyListLayoutInfo.mo901getViewportSizeYbymL2g() >> 32);
    }
}
