package androidx.compose.foundation.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\u0011\u001a\u00020\u000e*\u00020\t2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\"\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\"\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Landroidx/compose/foundation/layout/FillNode;", "Landroidx/compose/ui/node/LayoutModifierNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/foundation/layout/Direction;", "direction", "", "fraction", "<init>", "(Landroidx/compose/foundation/layout/Direction;F)V", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "measurable", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/compose/ui/layout/MeasureResult;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "measure", "Landroidx/compose/foundation/layout/Direction;", "getDirection", "()Landroidx/compose/foundation/layout/Direction;", "setDirection", "(Landroidx/compose/foundation/layout/Direction;)V", "F", "getFraction", "()F", "setFraction", "(F)V", "foundation-layout"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class FillNode extends Modifier.Node implements LayoutModifierNode {

    @NotNull
    private Direction direction;
    private float fraction;

    public FillNode(@NotNull Direction direction, float f) {
        this.direction = direction;
        this.fraction = f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit measure_3p2s80s$lambda$0(Placeable placeable, Placeable.PlacementScope placementScope) {
        Placeable.PlacementScope.placeRelative$default(placementScope, placeable, 0, 0, BitmapDescriptorFactory.HUE_RED, 4, null);
        return Unit.f186387a;
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    @NotNull
    /* JADX INFO: renamed from: measure-3p2s80s */
    public MeasureResult mo543measure3p2s80s(@NotNull MeasureScope measureScope, @NotNull Measurable measurable, long j2) {
        int iM3281getMinWidthimpl;
        int iM3279getMaxWidthimpl;
        int iM3278getMaxHeightimpl;
        int iM3278getMaxHeightimpl2;
        if (!Constraints.m3275getHasBoundedWidthimpl(j2) || this.direction == Direction.Vertical) {
            iM3281getMinWidthimpl = Constraints.m3281getMinWidthimpl(j2);
            iM3279getMaxWidthimpl = Constraints.m3279getMaxWidthimpl(j2);
        } else {
            int iRound = Math.round(Constraints.m3279getMaxWidthimpl(j2) * this.fraction);
            int iM3281getMinWidthimpl2 = Constraints.m3281getMinWidthimpl(j2);
            iM3281getMinWidthimpl = Constraints.m3279getMaxWidthimpl(j2);
            if (iRound < iM3281getMinWidthimpl2) {
                iRound = iM3281getMinWidthimpl2;
            }
            if (iRound <= iM3281getMinWidthimpl) {
                iM3281getMinWidthimpl = iRound;
            }
            iM3279getMaxWidthimpl = iM3281getMinWidthimpl;
        }
        if (!Constraints.m3274getHasBoundedHeightimpl(j2) || this.direction == Direction.Horizontal) {
            int iM3280getMinHeightimpl = Constraints.m3280getMinHeightimpl(j2);
            iM3278getMaxHeightimpl = Constraints.m3278getMaxHeightimpl(j2);
            iM3278getMaxHeightimpl2 = iM3280getMinHeightimpl;
        } else {
            int iRound2 = Math.round(Constraints.m3278getMaxHeightimpl(j2) * this.fraction);
            int iM3280getMinHeightimpl2 = Constraints.m3280getMinHeightimpl(j2);
            iM3278getMaxHeightimpl2 = Constraints.m3278getMaxHeightimpl(j2);
            if (iRound2 < iM3280getMinHeightimpl2) {
                iRound2 = iM3280getMinHeightimpl2;
            }
            if (iRound2 <= iM3278getMaxHeightimpl2) {
                iM3278getMaxHeightimpl2 = iRound2;
            }
            iM3278getMaxHeightimpl = iM3278getMaxHeightimpl2;
        }
        Placeable placeableMo2530measureBRTryo0 = measurable.mo2530measureBRTryo0(ConstraintsKt.Constraints(iM3281getMinWidthimpl, iM3279getMaxWidthimpl, iM3278getMaxHeightimpl2, iM3278getMaxHeightimpl));
        return MeasureScope.layout$default(measureScope, placeableMo2530measureBRTryo0.getWidth(), placeableMo2530measureBRTryo0.getHeight(), null, new a(1, placeableMo2530measureBRTryo0), 4, null);
    }

    public final void setDirection(@NotNull Direction direction) {
        this.direction = direction;
    }

    public final void setFraction(float f) {
        this.fraction = f;
    }
}
