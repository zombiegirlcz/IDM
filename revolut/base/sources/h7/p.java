package h7;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class p extends Modifier.Node implements LayoutModifierNode {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f149819a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f149820b;

    @Override // androidx.compose.ui.node.LayoutModifierNode
    /* JADX INFO: renamed from: measure-3p2s80s */
    public final MeasureResult mo543measure3p2s80s(MeasureScope measure, Measurable measurable, long j2) {
        Intrinsics.checkNotNullParameter(measure, "$this$measure");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        long jM3289constrain4WqzIAM = ConstraintsKt.m3289constrain4WqzIAM(j2, IntSizeKt.IntSize(this.f149819a, this.f149820b));
        Placeable placeableMo2530measureBRTryo0 = measurable.mo2530measureBRTryo0((Constraints.m3278getMaxHeightimpl(j2) != Integer.MAX_VALUE || Constraints.m3279getMaxWidthimpl(j2) == Integer.MAX_VALUE) ? (Constraints.m3279getMaxWidthimpl(j2) != Integer.MAX_VALUE || Constraints.m3278getMaxHeightimpl(j2) == Integer.MAX_VALUE) ? ConstraintsKt.Constraints(IntSize.m3355getWidthimpl(jM3289constrain4WqzIAM), IntSize.m3355getWidthimpl(jM3289constrain4WqzIAM), IntSize.m3354getHeightimpl(jM3289constrain4WqzIAM), IntSize.m3354getHeightimpl(jM3289constrain4WqzIAM)) : ConstraintsKt.Constraints((IntSize.m3354getHeightimpl(jM3289constrain4WqzIAM) * this.f149819a) / this.f149820b, (IntSize.m3354getHeightimpl(jM3289constrain4WqzIAM) * this.f149819a) / this.f149820b, IntSize.m3354getHeightimpl(jM3289constrain4WqzIAM), IntSize.m3354getHeightimpl(jM3289constrain4WqzIAM)) : ConstraintsKt.Constraints(IntSize.m3355getWidthimpl(jM3289constrain4WqzIAM), IntSize.m3355getWidthimpl(jM3289constrain4WqzIAM), (IntSize.m3355getWidthimpl(jM3289constrain4WqzIAM) * this.f149820b) / this.f149819a, (IntSize.m3355getWidthimpl(jM3289constrain4WqzIAM) * this.f149820b) / this.f149819a));
        return MeasureScope.layout$default(measure, placeableMo2530measureBRTryo0.getWidth(), placeableMo2530measureBRTryo0.getHeight(), null, new o(placeableMo2530measureBRTryo0), 4, null);
    }
}
