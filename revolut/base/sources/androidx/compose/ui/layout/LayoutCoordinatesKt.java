package androidx.compose.ui.layout;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.node.NodeCoordinator;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a\u000f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¢\u0006\u0002\u0010\u0003\u001a\u000f\u0010\u0004\u001a\u00020\u0001*\u00020\u0002¢\u0006\u0002\u0010\u0003\u001a\u000f\u0010\u0005\u001a\u00020\u0001*\u00020\u0002¢\u0006\u0002\u0010\u0003\u001a\n\u0010\u0006\u001a\u00020\u0007*\u00020\u0002\u001a\f\u0010\b\u001a\u00020\u0007*\u00020\u0002H\u0007\u001a\u0014\u0010\b\u001a\u00020\u0007*\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\n\u001a\u000f\u0010\u000b\u001a\u00020\u0001*\u00020\u0002¢\u0006\u0002\u0010\u0003\u001a\n\u0010\f\u001a\u00020\u0007*\u00020\u0002\u001a\n\u0010\r\u001a\u00020\u0002*\u00020\u0002¨\u0006\u000e"}, d2 = {"positionInRoot", "Landroidx/compose/ui/geometry/Offset;", "Landroidx/compose/ui/layout/LayoutCoordinates;", "(Landroidx/compose/ui/layout/LayoutCoordinates;)J", "positionInWindow", "positionOnScreen", "boundsInRoot", "Landroidx/compose/ui/geometry/Rect;", "boundsInWindow", "clipBounds", "", "positionInParent", "boundsInParent", "findRootCoordinates", "ui"}, k = 2, mv = {2, 0, 0}, xi = 48)
public abstract class LayoutCoordinatesKt {
    @NotNull
    public static final Rect boundsInParent(@NotNull LayoutCoordinates layoutCoordinates) {
        Rect rectLocalBoundingBoxOf$default;
        LayoutCoordinates parentLayoutCoordinates = layoutCoordinates.getParentLayoutCoordinates();
        return (parentLayoutCoordinates == null || (rectLocalBoundingBoxOf$default = LayoutCoordinates.localBoundingBoxOf$default(parentLayoutCoordinates, layoutCoordinates, false, 2, null)) == null) ? new Rect(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (int) (layoutCoordinates.mo2533getSizeYbymL2g() >> 32), (int) (layoutCoordinates.mo2533getSizeYbymL2g() & BodyPartID.bodyIdMax)) : rectLocalBoundingBoxOf$default;
    }

    @NotNull
    public static final Rect boundsInRoot(@NotNull LayoutCoordinates layoutCoordinates) {
        return LayoutCoordinates.localBoundingBoxOf$default(findRootCoordinates(layoutCoordinates), layoutCoordinates, false, 2, null);
    }

    public static /* synthetic */ Rect boundsInWindow$default(LayoutCoordinates layoutCoordinates, boolean z, int i, Object obj2) {
        if ((i & 1) != 0) {
            z = true;
        }
        return boundsInWindow(layoutCoordinates, z);
    }

    @NotNull
    public static final LayoutCoordinates findRootCoordinates(@NotNull LayoutCoordinates layoutCoordinates) {
        LayoutCoordinates layoutCoordinates2;
        LayoutCoordinates parentLayoutCoordinates = layoutCoordinates.getParentLayoutCoordinates();
        while (true) {
            LayoutCoordinates layoutCoordinates3 = parentLayoutCoordinates;
            layoutCoordinates2 = layoutCoordinates;
            layoutCoordinates = layoutCoordinates3;
            if (layoutCoordinates == null) {
                break;
            }
            parentLayoutCoordinates = layoutCoordinates.getParentLayoutCoordinates();
        }
        NodeCoordinator nodeCoordinator = layoutCoordinates2 instanceof NodeCoordinator ? (NodeCoordinator) layoutCoordinates2 : null;
        if (nodeCoordinator == null) {
            return layoutCoordinates2;
        }
        NodeCoordinator wrappedBy = nodeCoordinator.getWrappedBy();
        while (true) {
            NodeCoordinator nodeCoordinator2 = wrappedBy;
            NodeCoordinator nodeCoordinator3 = nodeCoordinator;
            nodeCoordinator = nodeCoordinator2;
            if (nodeCoordinator == null) {
                return nodeCoordinator3;
            }
            wrappedBy = nodeCoordinator.getWrappedBy();
        }
    }

    public static final long positionInParent(@NotNull LayoutCoordinates layoutCoordinates) {
        LayoutCoordinates parentLayoutCoordinates = layoutCoordinates.getParentLayoutCoordinates();
        return parentLayoutCoordinates != null ? parentLayoutCoordinates.mo2534localPositionOfR5De75A(layoutCoordinates, Offset.INSTANCE.m1845getZeroF1C5BW0()) : Offset.INSTANCE.m1845getZeroF1C5BW0();
    }

    public static final long positionInRoot(@NotNull LayoutCoordinates layoutCoordinates) {
        return layoutCoordinates.mo2536localToRootMKHz9U(Offset.INSTANCE.m1845getZeroF1C5BW0());
    }

    public static final long positionInWindow(@NotNull LayoutCoordinates layoutCoordinates) {
        return layoutCoordinates.mo2538localToWindowMKHz9U(Offset.INSTANCE.m1845getZeroF1C5BW0());
    }

    public static final long positionOnScreen(@NotNull LayoutCoordinates layoutCoordinates) {
        return layoutCoordinates.mo2537localToScreenMKHz9U(Offset.INSTANCE.m1845getZeroF1C5BW0());
    }

    @NotNull
    public static final Rect boundsInWindow(@NotNull LayoutCoordinates layoutCoordinates, boolean z) {
        LayoutCoordinates layoutCoordinatesFindRootCoordinates = findRootCoordinates(layoutCoordinates);
        float fMo2533getSizeYbymL2g = (int) (layoutCoordinatesFindRootCoordinates.mo2533getSizeYbymL2g() >> 32);
        float fMo2533getSizeYbymL2g2 = (int) (layoutCoordinatesFindRootCoordinates.mo2533getSizeYbymL2g() & BodyPartID.bodyIdMax);
        Rect rectLocalBoundingBoxOf = layoutCoordinatesFindRootCoordinates.localBoundingBoxOf(layoutCoordinates, z);
        float f = BitmapDescriptorFactory.HUE_RED;
        float left = rectLocalBoundingBoxOf.getLeft();
        if (z) {
            if (left < BitmapDescriptorFactory.HUE_RED) {
                left = 0.0f;
            }
            if (left > fMo2533getSizeYbymL2g) {
                left = fMo2533getSizeYbymL2g;
            }
        }
        float top = rectLocalBoundingBoxOf.getTop();
        if (z) {
            if (top < BitmapDescriptorFactory.HUE_RED) {
                top = 0.0f;
            }
            if (top > fMo2533getSizeYbymL2g2) {
                top = fMo2533getSizeYbymL2g2;
            }
        }
        if (z) {
            float right = rectLocalBoundingBoxOf.getRight();
            if (right < BitmapDescriptorFactory.HUE_RED) {
                right = 0.0f;
            }
            if (right <= fMo2533getSizeYbymL2g) {
                fMo2533getSizeYbymL2g = right;
            }
        } else {
            fMo2533getSizeYbymL2g = rectLocalBoundingBoxOf.getRight();
        }
        if (z) {
            float bottom = rectLocalBoundingBoxOf.getBottom();
            if (bottom >= BitmapDescriptorFactory.HUE_RED) {
                f = bottom;
            }
            if (f <= fMo2533getSizeYbymL2g2) {
                fMo2533getSizeYbymL2g2 = f;
            }
        } else {
            fMo2533getSizeYbymL2g2 = rectLocalBoundingBoxOf.getBottom();
        }
        if (left == fMo2533getSizeYbymL2g || top == fMo2533getSizeYbymL2g2) {
            return Rect.INSTANCE.getZero();
        }
        long jMo2538localToWindowMKHz9U = layoutCoordinatesFindRootCoordinates.mo2538localToWindowMKHz9U(Offset.m1827constructorimpl((((long) Float.floatToRawIntBits(left)) << 32) | (((long) Float.floatToRawIntBits(top)) & BodyPartID.bodyIdMax)));
        long jMo2538localToWindowMKHz9U2 = layoutCoordinatesFindRootCoordinates.mo2538localToWindowMKHz9U(Offset.m1827constructorimpl((((long) Float.floatToRawIntBits(fMo2533getSizeYbymL2g)) << 32) | (((long) Float.floatToRawIntBits(top)) & BodyPartID.bodyIdMax)));
        long jMo2538localToWindowMKHz9U3 = layoutCoordinatesFindRootCoordinates.mo2538localToWindowMKHz9U(Offset.m1827constructorimpl((((long) Float.floatToRawIntBits(fMo2533getSizeYbymL2g)) << 32) | (((long) Float.floatToRawIntBits(fMo2533getSizeYbymL2g2)) & BodyPartID.bodyIdMax)));
        long jMo2538localToWindowMKHz9U4 = layoutCoordinatesFindRootCoordinates.mo2538localToWindowMKHz9U(Offset.m1827constructorimpl((((long) Float.floatToRawIntBits(fMo2533getSizeYbymL2g2)) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(left) << 32)));
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jMo2538localToWindowMKHz9U >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jMo2538localToWindowMKHz9U2 >> 32));
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (jMo2538localToWindowMKHz9U4 >> 32));
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (jMo2538localToWindowMKHz9U3 >> 32));
        float fMin = Math.min(fIntBitsToFloat, Math.min(fIntBitsToFloat2, Math.min(fIntBitsToFloat3, fIntBitsToFloat4)));
        float fMax = Math.max(fIntBitsToFloat, Math.max(fIntBitsToFloat2, Math.max(fIntBitsToFloat3, fIntBitsToFloat4)));
        float fIntBitsToFloat5 = Float.intBitsToFloat((int) (jMo2538localToWindowMKHz9U & BodyPartID.bodyIdMax));
        float fIntBitsToFloat6 = Float.intBitsToFloat((int) (jMo2538localToWindowMKHz9U2 & BodyPartID.bodyIdMax));
        float fIntBitsToFloat7 = Float.intBitsToFloat((int) (jMo2538localToWindowMKHz9U4 & BodyPartID.bodyIdMax));
        float fIntBitsToFloat8 = Float.intBitsToFloat((int) (jMo2538localToWindowMKHz9U3 & BodyPartID.bodyIdMax));
        return new Rect(fMin, Math.min(fIntBitsToFloat5, Math.min(fIntBitsToFloat6, Math.min(fIntBitsToFloat7, fIntBitsToFloat8))), fMax, Math.max(fIntBitsToFloat5, Math.max(fIntBitsToFloat6, Math.max(fIntBitsToFloat7, fIntBitsToFloat8))));
    }
}
