package androidx.compose.ui.spatial;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.node.NodeKind;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import kotlin.Metadata;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aK\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u00052\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0000¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"rectInfoFor", "Landroidx/compose/ui/spatial/RelativeLayoutBounds;", "node", "Landroidx/compose/ui/node/DelegatableNode;", "topLeft", "", "bottomRight", "windowOffset", "Landroidx/compose/ui/unit/IntOffset;", "screenOffset", "windowSize", "viewToWindowMatrix", "Landroidx/compose/ui/graphics/Matrix;", "rectInfoFor-Dg36KO4", "(Landroidx/compose/ui/node/DelegatableNode;JJJJJ[F)Landroidx/compose/ui/spatial/RelativeLayoutBounds;", "ui"}, k = 2, mv = {2, 0, 0}, xi = 48)
public abstract class ThrottledCallbacksKt {
    /* JADX INFO: renamed from: rectInfoFor-Dg36KO4, reason: not valid java name */
    public static final RelativeLayoutBounds m2852rectInfoForDg36KO4(@NotNull DelegatableNode delegatableNode, long j2, long j3, long j5, long j16, long j22, float[] fArr) {
        NodeCoordinator nodeCoordinatorM2612requireCoordinator64DMado = DelegatableNodeKt.m2612requireCoordinator64DMado(delegatableNode, NodeKind.m2722constructorimpl(2));
        LayoutNode layoutNodeRequireLayoutNode = DelegatableNodeKt.requireLayoutNode(delegatableNode);
        if (!layoutNodeRequireLayoutNode.isPlaced()) {
            return null;
        }
        if (layoutNodeRequireLayoutNode.getOuterCoordinator$ui() == nodeCoordinatorM2612requireCoordinator64DMado) {
            return new RelativeLayoutBounds(j2, j3, j5, j16, j22, fArr, delegatableNode, null);
        }
        long jM3329constructorimpl = IntOffset.m3329constructorimpl(j2);
        long jM1827constructorimpl = Offset.m1827constructorimpl((((long) Float.floatToRawIntBits(IntOffset.m3334getXimpl(jM3329constructorimpl))) << 32) | (((long) Float.floatToRawIntBits(IntOffset.m3335getYimpl(jM3329constructorimpl))) & BodyPartID.bodyIdMax));
        long jMo2533getSizeYbymL2g = nodeCoordinatorM2612requireCoordinator64DMado.getCoordinates().mo2533getSizeYbymL2g();
        long jM3346roundk4lQ0M = IntOffsetKt.m3346roundk4lQ0M(layoutNodeRequireLayoutNode.getOuterCoordinator$ui().getCoordinates().mo2534localPositionOfR5De75A(nodeCoordinatorM2612requireCoordinator64DMado, jM1827constructorimpl));
        return new RelativeLayoutBounds(jM3346roundk4lQ0M, IntOffset.m3329constructorimpl((((long) (IntOffset.m3334getXimpl(jM3346roundk4lQ0M) + ((int) (jMo2533getSizeYbymL2g >> 32)))) << 32) | (((long) (IntOffset.m3335getYimpl(jM3346roundk4lQ0M) + ((int) (jMo2533getSizeYbymL2g & BodyPartID.bodyIdMax)))) & BodyPartID.bodyIdMax)), j5, j16, j22, fArr, delegatableNode, null);
    }
}
