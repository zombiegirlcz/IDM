package androidx.compose.foundation.layout;

import androidx.compose.foundation.layout.internal.InlineClassHelperKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0003\u001a\u0085\u0001\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u000e\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000f2\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00042\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u0004H\u0000¢\u0006\u0002\u0010\u0016¨\u0006\u0017"}, d2 = {"measure", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/foundation/layout/RowColumnMeasurePolicy;", "mainAxisMin", "", "crossAxisMin", "mainAxisMax", "crossAxisMax", "arrangementSpacingInt", "measureScope", "Landroidx/compose/ui/layout/MeasureScope;", "measurables", "", "Landroidx/compose/ui/layout/Measurable;", "placeables", "", "Landroidx/compose/ui/layout/Placeable;", "startIndex", "endIndex", "crossAxisOffset", "", "currentLineIndex", "(Landroidx/compose/foundation/layout/RowColumnMeasurePolicy;IIIIILandroidx/compose/ui/layout/MeasureScope;Ljava/util/List;[Landroidx/compose/ui/layout/Placeable;II[II)Landroidx/compose/ui/layout/MeasureResult;", "foundation-layout"}, k = 2, mv = {2, 0, 0}, xi = 48)
public abstract class RowColumnMeasurePolicyKt {
    @NotNull
    public static final MeasureResult measure(@NotNull RowColumnMeasurePolicy rowColumnMeasurePolicy, int i, int i2, int i3, int i5, int i6, @NotNull MeasureScope measureScope, @NotNull List<? extends Measurable> list, @NotNull Placeable[] placeableArr, int i21, int i22, int[] iArr, int i32) {
        int i33;
        char c2;
        char c3;
        int i43;
        int iMax;
        int iMax2;
        RowColumnMeasurePolicy rowColumnMeasurePolicy2;
        int i59;
        long j2;
        int i66;
        int i74 = i5;
        long j3 = i6;
        int i92 = i22 - i21;
        int[] iArr2 = new int[i92];
        int i96 = 0;
        int i99 = i21;
        int i100 = 0;
        int iMax3 = 0;
        int i101 = 0;
        int i102 = 0;
        int i103 = 0;
        float f = 0.0f;
        while (true) {
            int i104 = 1;
            if (i99 >= i22) {
                break;
            }
            Measurable measurable = list.get(i99);
            RowColumnParentData rowColumnParentData = RowColumnImplKt.getRowColumnParentData(measurable);
            float weight = RowColumnImplKt.getWeight(rowColumnParentData);
            if (i101 == 0 && !RowColumnImplKt.isRelative(rowColumnParentData)) {
                i104 = i96;
            }
            if (weight > BitmapDescriptorFactory.HUE_RED) {
                f += weight;
                i102++;
                i59 = i99;
                j2 = j3;
            } else {
                if (i74 != Integer.MAX_VALUE && rowColumnParentData != null) {
                    rowColumnParentData.getFlowLayoutData();
                }
                int i105 = i3 - i103;
                Placeable placeableMo2530measureBRTryo0 = placeableArr[i99];
                if (placeableMo2530measureBRTryo0 == null) {
                    int i106 = i3 != Integer.MAX_VALUE ? i105 < 0 ? i96 : i105 : Integer.MAX_VALUE;
                    i59 = i99;
                    rowColumnMeasurePolicy2 = rowColumnMeasurePolicy;
                    j2 = j3;
                    i66 = iMax3;
                    placeableMo2530measureBRTryo0 = measurable.mo2530measureBRTryo0(RowColumnMeasurePolicy.m871createConstraintsxF2OJ5Q$default(rowColumnMeasurePolicy2, 0, 0, i106, i74, false, 16, null));
                } else {
                    rowColumnMeasurePolicy2 = rowColumnMeasurePolicy;
                    i59 = i99;
                    j2 = j3;
                    i66 = iMax3;
                }
                int iMainAxisSize = rowColumnMeasurePolicy2.mainAxisSize(placeableMo2530measureBRTryo0);
                int iCrossAxisSize = rowColumnMeasurePolicy2.crossAxisSize(placeableMo2530measureBRTryo0);
                iArr2[i59 - i21] = iMainAxisSize;
                int i107 = i105 - iMainAxisSize;
                if (i107 < 0) {
                    i107 = 0;
                }
                int iMin = Math.min(i6, i107);
                iMax3 = Math.max(i66, iCrossAxisSize);
                placeableArr[i59] = placeableMo2530measureBRTryo0;
                i103 = iMainAxisSize + iMin + i103;
                i100 = iMin;
            }
            i99 = i59 + 1;
            i101 = i104;
            j3 = j2;
            i96 = 0;
        }
        RowColumnMeasurePolicy rowColumnMeasurePolicy3 = rowColumnMeasurePolicy;
        long j5 = j3;
        int i108 = iMax3;
        if (i102 == 0) {
            i103 -= i100;
            i33 = 0;
        } else {
            long j16 = j5 * ((long) (i102 - 1));
            long jRound = ((long) ((i3 != Integer.MAX_VALUE ? i3 : i) - i103)) - j16;
            if (jRound < 0) {
                jRound = 0;
            }
            float f4 = jRound / f;
            for (int i109 = i21; i109 < i22; i109++) {
                jRound -= (long) Math.round(RowColumnImplKt.getWeight(RowColumnImplKt.getRowColumnParentData(list.get(i109))) * f4);
            }
            int i110 = i21;
            int i111 = 0;
            while (i110 < i22) {
                if (placeableArr[i110] == null) {
                    Measurable measurable2 = list.get(i110);
                    RowColumnParentData rowColumnParentData2 = RowColumnImplKt.getRowColumnParentData(measurable2);
                    float weight2 = RowColumnImplKt.getWeight(rowColumnParentData2);
                    if (i74 != Integer.MAX_VALUE && rowColumnParentData2 != null) {
                        rowColumnParentData2.getFlowLayoutData();
                    }
                    if (!(weight2 > BitmapDescriptorFactory.HUE_RED)) {
                        InlineClassHelperKt.throwIllegalStateException("All weights <= 0 should have placeables");
                    }
                    int iSignum = Long.signum(jRound);
                    long j22 = jRound - ((long) iSignum);
                    int iMax4 = Math.max(0, Math.round(weight2 * f4) + iSignum);
                    if (RowColumnImplKt.getFill(rowColumnParentData2)) {
                        c2 = 65535;
                        if (iMax4 != Integer.MAX_VALUE) {
                            c3 = 65535;
                            i43 = iMax4;
                        }
                        rowColumnMeasurePolicy3 = rowColumnMeasurePolicy;
                        Placeable placeableMo2530measureBRTryo02 = measurable2.mo2530measureBRTryo0(rowColumnMeasurePolicy3.mo848createConstraintsxF2OJ5Q(i43, 0, iMax4, i74, true));
                        int iMainAxisSize2 = rowColumnMeasurePolicy3.mainAxisSize(placeableMo2530measureBRTryo02);
                        int iCrossAxisSize2 = rowColumnMeasurePolicy3.crossAxisSize(placeableMo2530measureBRTryo02);
                        iArr2[i110 - i21] = iMainAxisSize2;
                        i111 += iMainAxisSize2;
                        int iMax5 = Math.max(i108, iCrossAxisSize2);
                        placeableArr[i110] = placeableMo2530measureBRTryo02;
                        i108 = iMax5;
                        jRound = j22;
                    } else {
                        c2 = 65535;
                    }
                    c3 = c2;
                    i43 = 0;
                    rowColumnMeasurePolicy3 = rowColumnMeasurePolicy;
                    Placeable placeableMo2530measureBRTryo022 = measurable2.mo2530measureBRTryo0(rowColumnMeasurePolicy3.mo848createConstraintsxF2OJ5Q(i43, 0, iMax4, i74, true));
                    int iMainAxisSize22 = rowColumnMeasurePolicy3.mainAxisSize(placeableMo2530measureBRTryo022);
                    int iCrossAxisSize22 = rowColumnMeasurePolicy3.crossAxisSize(placeableMo2530measureBRTryo022);
                    iArr2[i110 - i21] = iMainAxisSize22;
                    i111 += iMainAxisSize22;
                    int iMax52 = Math.max(i108, iCrossAxisSize22);
                    placeableArr[i110] = placeableMo2530measureBRTryo022;
                    i108 = iMax52;
                    jRound = j22;
                }
                i110++;
                i74 = i5;
            }
            i33 = (int) (((long) i111) + j16);
            int i112 = i3 - i103;
            if (i33 < 0) {
                i33 = 0;
            }
            if (i33 > i112) {
                i33 = i112;
            }
        }
        int i113 = i108;
        if (i101 != 0) {
            iMax = 0;
            iMax2 = 0;
            for (int i114 = i21; i114 < i22; i114++) {
                Placeable placeable = placeableArr[i114];
                Intrinsics.h(placeable);
                CrossAxisAlignment crossAxisAlignment = RowColumnImplKt.getCrossAxisAlignment(RowColumnImplKt.getRowColumnParentData(placeable));
                Integer numCalculateAlignmentLinePosition$foundation_layout = crossAxisAlignment != null ? crossAxisAlignment.calculateAlignmentLinePosition$foundation_layout(placeable) : null;
                if (numCalculateAlignmentLinePosition$foundation_layout != null) {
                    int iIntValue = numCalculateAlignmentLinePosition$foundation_layout.intValue();
                    int iCrossAxisSize3 = rowColumnMeasurePolicy3.crossAxisSize(placeable);
                    iMax = Math.max(iMax, iIntValue != Integer.MIN_VALUE ? numCalculateAlignmentLinePosition$foundation_layout.intValue() : 0);
                    if (iIntValue == Integer.MIN_VALUE) {
                        iIntValue = iCrossAxisSize3;
                    }
                    iMax2 = Math.max(iMax2, iCrossAxisSize3 - iIntValue);
                }
            }
        } else {
            iMax = 0;
            iMax2 = 0;
        }
        int i115 = i103 + i33;
        if (i115 < 0) {
            i115 = 0;
        }
        int iMax6 = Math.max(i115, i);
        int iMax7 = Math.max(i113, Math.max(i2, iMax2 + iMax));
        int[] iArr3 = new int[i92];
        rowColumnMeasurePolicy3.populateMainAxisPositions(iMax6, iArr2, iArr3, measureScope);
        return rowColumnMeasurePolicy3.placeHelper(placeableArr, measureScope, iMax, iArr3, iMax6, iMax7, iArr, i32, i21, i22);
    }
}
