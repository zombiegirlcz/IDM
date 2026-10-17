package androidx.compose.foundation.layout;

import androidx.compose.foundation.layout.AlignmentLineKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.HorizontalAlignmentLine;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Dp;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a/\u0010\b\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u0006\u0010\u0007\u001a'\u0010\r\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u000b\u0010\f\u001a;\u0010\u0016\u001a\u00020\u0013*\u00020\u000e2\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015\"\u0018\u0010\u001a\u001a\u00020\u0017*\u00020\u00018BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/layout/AlignmentLine;", "alignmentLine", "Landroidx/compose/ui/unit/Dp;", "before", "after", "paddingFrom-4j6BHR0", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/layout/AlignmentLine;FF)Landroidx/compose/ui/Modifier;", "paddingFrom", "top", "bottom", "paddingFromBaseline-VpY3zN4", "(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;", "paddingFromBaseline", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "measurable", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/compose/ui/layout/MeasureResult;", "alignmentLineOffsetMeasure-tjqqzMA", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/AlignmentLine;FFLandroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "alignmentLineOffsetMeasure", "", "getHorizontal", "(Landroidx/compose/ui/layout/AlignmentLine;)Z", "horizontal", "foundation-layout"}, k = 2, mv = {2, 0, 0}, xi = 48)
public abstract class AlignmentLineKt {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: alignmentLineOffsetMeasure-tjqqzMA, reason: not valid java name */
    public static final MeasureResult m829alignmentLineOffsetMeasuretjqqzMA(MeasureScope measureScope, final AlignmentLine alignmentLine, final float f, float f4, Measurable measurable, long j2) {
        final Placeable placeableMo2530measureBRTryo0 = measurable.mo2530measureBRTryo0(getHorizontal(alignmentLine) ? Constraints.m3271copyZbe2FdA$default(j2, 0, 0, 0, 0, 11, null) : Constraints.m3271copyZbe2FdA$default(j2, 0, 0, 0, 0, 14, null));
        int i = placeableMo2530measureBRTryo0.get(alignmentLine);
        if (i == Integer.MIN_VALUE) {
            i = 0;
        }
        int height = getHorizontal(alignmentLine) ? placeableMo2530measureBRTryo0.getHeight() : placeableMo2530measureBRTryo0.getWidth();
        int iM3278getMaxHeightimpl = (getHorizontal(alignmentLine) ? Constraints.m3278getMaxHeightimpl(j2) : Constraints.m3279getMaxWidthimpl(j2)) - height;
        final int iG = kotlin.ranges.f.g((!Float.isNaN(f) ? measureScope.mo762roundToPx0680j_4(f) : 0) - i, 0, iM3278getMaxHeightimpl);
        final int iG2 = kotlin.ranges.f.g(((!Float.isNaN(f4) ? measureScope.mo762roundToPx0680j_4(f4) : 0) - height) + i, 0, iM3278getMaxHeightimpl - iG);
        final int width = getHorizontal(alignmentLine) ? placeableMo2530measureBRTryo0.getWidth() : Math.max(placeableMo2530measureBRTryo0.getWidth() + iG + iG2, Constraints.m3281getMinWidthimpl(j2));
        final int iMax = getHorizontal(alignmentLine) ? Math.max(placeableMo2530measureBRTryo0.getHeight() + iG + iG2, Constraints.m3280getMinHeightimpl(j2)) : placeableMo2530measureBRTryo0.getHeight();
        return MeasureScope.layout$default(measureScope, width, iMax, null, new Function1() { // from class: i1.a
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return AlignmentLineKt.alignmentLineOffsetMeasure_tjqqzMA$lambda$1(alignmentLine, f, iG, width, iG2, placeableMo2530measureBRTryo0, iMax, (Placeable.PlacementScope) obj2);
            }
        }, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit alignmentLineOffsetMeasure_tjqqzMA$lambda$1(AlignmentLine alignmentLine, float f, int i, int i2, int i3, Placeable placeable, int i5, Placeable.PlacementScope placementScope) {
        int i6;
        int width = getHorizontal(alignmentLine) ? 0 : !Dp.m3299equalsimpl0(f, Dp.INSTANCE.m3306getUnspecifiedD9Ej5fM()) ? i : (i2 - i3) - placeable.getWidth();
        if (getHorizontal(alignmentLine)) {
            if (Dp.m3299equalsimpl0(f, Dp.INSTANCE.m3306getUnspecifiedD9Ej5fM())) {
                i = (i5 - i3) - placeable.getHeight();
            }
            i6 = i;
        } else {
            i6 = 0;
        }
        Placeable.PlacementScope.placeRelative$default(placementScope, placeable, width, i6, BitmapDescriptorFactory.HUE_RED, 4, null);
        return Unit.f186387a;
    }

    private static final boolean getHorizontal(AlignmentLine alignmentLine) {
        return alignmentLine instanceof HorizontalAlignmentLine;
    }

    @NotNull
    /* JADX INFO: renamed from: paddingFrom-4j6BHR0, reason: not valid java name */
    public static final Modifier m830paddingFrom4j6BHR0(@NotNull Modifier modifier, @NotNull AlignmentLine alignmentLine, float f, float f4) {
        return modifier.then(new AlignmentLineOffsetDpElement(alignmentLine, f, f4, InspectableValueKt.isDebugInspectorInfoEnabled() ? new AlignmentLineKt$paddingFrom4j6BHR0$$inlined$debugInspectorInfo$1(alignmentLine, f, f4) : InspectableValueKt.getNoInspectorInfo(), null));
    }

    /* JADX INFO: renamed from: paddingFrom-4j6BHR0$default, reason: not valid java name */
    public static /* synthetic */ Modifier m831paddingFrom4j6BHR0$default(Modifier modifier, AlignmentLine alignmentLine, float f, float f4, int i, Object obj2) {
        if ((i & 2) != 0) {
            f = Dp.INSTANCE.m3306getUnspecifiedD9Ej5fM();
        }
        if ((i & 4) != 0) {
            f4 = Dp.INSTANCE.m3306getUnspecifiedD9Ej5fM();
        }
        return m830paddingFrom4j6BHR0(modifier, alignmentLine, f, f4);
    }

    @NotNull
    /* JADX INFO: renamed from: paddingFromBaseline-VpY3zN4, reason: not valid java name */
    public static final Modifier m832paddingFromBaselineVpY3zN4(@NotNull Modifier modifier, float f, float f4) {
        return modifier.then(!Float.isNaN(f) ? m831paddingFrom4j6BHR0$default(Modifier.INSTANCE, androidx.compose.ui.layout.AlignmentLineKt.getFirstBaseline(), f, BitmapDescriptorFactory.HUE_RED, 4, null) : Modifier.INSTANCE).then(!Float.isNaN(f4) ? m831paddingFrom4j6BHR0$default(Modifier.INSTANCE, androidx.compose.ui.layout.AlignmentLineKt.getLastBaseline(), BitmapDescriptorFactory.HUE_RED, f4, 2, null) : Modifier.INSTANCE);
    }
}
