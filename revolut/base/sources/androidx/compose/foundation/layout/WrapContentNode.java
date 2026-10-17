package androidx.compose.foundation.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B1\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0018\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u0007¢\u0006\u0004\b\f\u0010\rJ#\u0010\u0016\u001a\u00020\u0013*\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\"\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\"\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R4\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%¨\u0006&"}, d2 = {"Landroidx/compose/foundation/layout/WrapContentNode;", "Landroidx/compose/ui/node/LayoutModifierNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/foundation/layout/Direction;", "direction", "", "unbounded", "Lkotlin/Function2;", "Landroidx/compose/ui/unit/IntSize;", "Landroidx/compose/ui/unit/LayoutDirection;", "Landroidx/compose/ui/unit/IntOffset;", "alignmentCallback", "<init>", "(Landroidx/compose/foundation/layout/Direction;ZLkotlin/jvm/functions/Function2;)V", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "measurable", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/compose/ui/layout/MeasureResult;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "measure", "Landroidx/compose/foundation/layout/Direction;", "getDirection", "()Landroidx/compose/foundation/layout/Direction;", "setDirection", "(Landroidx/compose/foundation/layout/Direction;)V", "Z", "getUnbounded", "()Z", "setUnbounded", "(Z)V", "Lkotlin/jvm/functions/Function2;", "getAlignmentCallback", "()Lkotlin/jvm/functions/Function2;", "setAlignmentCallback", "(Lkotlin/jvm/functions/Function2;)V", "foundation-layout"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class WrapContentNode extends Modifier.Node implements LayoutModifierNode {

    @NotNull
    private Function2<? super IntSize, ? super LayoutDirection, IntOffset> alignmentCallback;

    @NotNull
    private Direction direction;
    private boolean unbounded;

    public WrapContentNode(@NotNull Direction direction, boolean z, @NotNull Function2<? super IntSize, ? super LayoutDirection, IntOffset> function2) {
        this.direction = direction;
        this.unbounded = z;
        this.alignmentCallback = function2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit measure_3p2s80s$lambda$0(WrapContentNode wrapContentNode, int i, Placeable placeable, int i2, MeasureScope measureScope, Placeable.PlacementScope placementScope) {
        Placeable.PlacementScope.m2556place70tqf50$default(placementScope, placeable, ((IntOffset) wrapContentNode.alignmentCallback.invoke(IntSize.m3350boximpl(IntSize.m3351constructorimpl((((long) (i - placeable.getWidth())) << 32) | (((long) (i2 - placeable.getHeight())) & BodyPartID.bodyIdMax))), measureScope.getLayoutDirection())).getPackedValue(), BitmapDescriptorFactory.HUE_RED, 2, null);
        return Unit.f186387a;
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    @NotNull
    /* JADX INFO: renamed from: measure-3p2s80s */
    public MeasureResult mo543measure3p2s80s(@NotNull final MeasureScope measureScope, @NotNull Measurable measurable, long j2) {
        Direction direction = this.direction;
        Direction direction2 = Direction.Vertical;
        int iM3281getMinWidthimpl = direction != direction2 ? 0 : Constraints.m3281getMinWidthimpl(j2);
        Direction direction3 = this.direction;
        Direction direction4 = Direction.Horizontal;
        final Placeable placeableMo2530measureBRTryo0 = measurable.mo2530measureBRTryo0(ConstraintsKt.Constraints(iM3281getMinWidthimpl, (this.direction == direction2 || !this.unbounded) ? Constraints.m3279getMaxWidthimpl(j2) : Integer.MAX_VALUE, direction3 == direction4 ? Constraints.m3280getMinHeightimpl(j2) : 0, (this.direction == direction4 || !this.unbounded) ? Constraints.m3278getMaxHeightimpl(j2) : Integer.MAX_VALUE));
        final int iG = kotlin.ranges.f.g(placeableMo2530measureBRTryo0.getWidth(), Constraints.m3281getMinWidthimpl(j2), Constraints.m3279getMaxWidthimpl(j2));
        final int iG2 = kotlin.ranges.f.g(placeableMo2530measureBRTryo0.getHeight(), Constraints.m3280getMinHeightimpl(j2), Constraints.m3278getMaxHeightimpl(j2));
        return MeasureScope.layout$default(measureScope, iG, iG2, null, new Function1() { // from class: androidx.compose.foundation.layout.h
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return WrapContentNode.measure_3p2s80s$lambda$0(this.f7050a, iG, placeableMo2530measureBRTryo0, iG2, measureScope, (Placeable.PlacementScope) obj2);
            }
        }, 4, null);
    }

    public final void setAlignmentCallback(@NotNull Function2<? super IntSize, ? super LayoutDirection, IntOffset> function2) {
        this.alignmentCallback = function2;
    }

    public final void setDirection(@NotNull Direction direction) {
        this.direction = direction;
    }

    public final void setUnbounded(boolean z) {
        this.unbounded = z;
    }
}
