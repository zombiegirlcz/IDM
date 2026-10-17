package androidx.compose.ui.spatial;

import a0.d;
import androidx.compose.ui.graphics.Matrix;
import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.unit.IntOffset;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001BC\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0016R\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0016R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0016R\u0014\u0010\u0007\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0016R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0016R\u0016\u0010\n\u001a\u0004\u0018\u00010\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0017R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0018¨\u0006\u0019"}, d2 = {"Landroidx/compose/ui/spatial/RelativeLayoutBounds;", "", "", "topLeft", "bottomRight", "Landroidx/compose/ui/unit/IntOffset;", "windowOffset", "screenOffset", "windowSize", "Landroidx/compose/ui/graphics/Matrix;", "viewToWindowMatrix", "Landroidx/compose/ui/node/DelegatableNode;", "node", "<init>", "(JJJJJ[FLandroidx/compose/ui/node/DelegatableNode;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "J", "[F", "Landroidx/compose/ui/node/DelegatableNode;", "ui"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RelativeLayoutBounds {
    private final long bottomRight;

    @NotNull
    private final DelegatableNode node;
    private final long screenOffset;
    private final long topLeft;
    private final float[] viewToWindowMatrix;
    private final long windowOffset;
    private final long windowSize;

    public /* synthetic */ RelativeLayoutBounds(long j2, long j3, long j5, long j16, long j22, float[] fArr, DelegatableNode delegatableNode, DefaultConstructorMarker defaultConstructorMarker) {
        this(j2, j3, j5, j16, j22, fArr, delegatableNode);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            r0 = 1
            if (r6 != r7) goto L4
            return r0
        L4:
            r1 = 0
            if (r7 == 0) goto L65
            java.lang.Class<androidx.compose.ui.spatial.RelativeLayoutBounds> r2 = androidx.compose.ui.spatial.RelativeLayoutBounds.class
            java.lang.Class r3 = r7.getClass()
            if (r2 == r3) goto L10
            goto L65
        L10:
            androidx.compose.ui.spatial.RelativeLayoutBounds r7 = (androidx.compose.ui.spatial.RelativeLayoutBounds) r7
            long r2 = r6.topLeft
            long r4 = r7.topLeft
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 == 0) goto L1b
            return r1
        L1b:
            long r2 = r6.bottomRight
            long r4 = r7.bottomRight
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 == 0) goto L24
            return r1
        L24:
            long r2 = r6.windowSize
            long r4 = r7.windowSize
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 == 0) goto L2d
            return r1
        L2d:
            long r2 = r6.windowOffset
            long r4 = r7.windowOffset
            boolean r2 = androidx.compose.ui.unit.IntOffset.m3333equalsimpl0(r2, r4)
            if (r2 != 0) goto L38
            return r1
        L38:
            long r2 = r6.screenOffset
            long r4 = r7.screenOffset
            boolean r2 = androidx.compose.ui.unit.IntOffset.m3333equalsimpl0(r2, r4)
            if (r2 != 0) goto L43
            return r1
        L43:
            float[] r2 = r6.viewToWindowMatrix
            float[] r3 = r7.viewToWindowMatrix
            if (r2 != 0) goto L4f
            if (r3 != 0) goto L4d
            r2 = r0
            goto L56
        L4d:
            r2 = r1
            goto L56
        L4f:
            if (r3 != 0) goto L52
            goto L4d
        L52:
            boolean r2 = androidx.compose.ui.graphics.Matrix.m2052equalsimpl0(r2, r3)
        L56:
            if (r2 != 0) goto L59
            return r1
        L59:
            androidx.compose.ui.node.DelegatableNode r2 = r6.node
            androidx.compose.ui.node.DelegatableNode r7 = r7.node
            boolean r7 = kotlin.jvm.internal.Intrinsics.f(r2, r7)
            if (r7 != 0) goto L64
            return r1
        L64:
            return r0
        L65:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.spatial.RelativeLayoutBounds.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int iM3336hashCodeimpl = (IntOffset.m3336hashCodeimpl(this.screenOffset) + ((IntOffset.m3336hashCodeimpl(this.windowOffset) + d.c(d.c(Long.hashCode(this.topLeft) * 31, 31, this.bottomRight), 31, this.windowSize)) * 31)) * 31;
        float[] fArr = this.viewToWindowMatrix;
        return this.node.hashCode() + ((iM3336hashCodeimpl + (fArr != null ? Matrix.m2053hashCodeimpl(fArr) : 0)) * 31);
    }

    private RelativeLayoutBounds(long j2, long j3, long j5, long j16, long j22, float[] fArr, DelegatableNode delegatableNode) {
        this.topLeft = j2;
        this.bottomRight = j3;
        this.windowOffset = j5;
        this.screenOffset = j16;
        this.windowSize = j22;
        this.viewToWindowMatrix = fArr;
        this.node = delegatableNode;
    }
}
