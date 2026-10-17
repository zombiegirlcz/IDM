package androidx.compose.material;

import androidx.compose.ui.layout.AlignmentLineKt;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.util.ListUtilsKt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
public final class SnackbarKt$OneRowSnackbar$2$1 implements MeasurePolicy {
    final /* synthetic */ String $actionTag;
    final /* synthetic */ String $textTag;

    public SnackbarKt$OneRowSnackbar$2$1(String str, String str2) {
        this.$actionTag = str;
        this.$textTag = str2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit measure_3p2s80s$lambda$3(Placeable placeable, int i, Placeable placeable2, int i2, int i3, Placeable.PlacementScope placementScope) {
        Placeable.PlacementScope.placeRelative$default(placementScope, placeable, 0, i, BitmapDescriptorFactory.HUE_RED, 4, null);
        Placeable.PlacementScope.placeRelative$default(placementScope, placeable2, i2, i3, BitmapDescriptorFactory.HUE_RED, 4, null);
        return Unit.f186387a;
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    /* JADX INFO: renamed from: measure-3p2s80s */
    public final MeasureResult mo520measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j2) {
        int iMo762roundToPx0680j_4;
        int iMax;
        MeasureScope measureScope2 = measureScope;
        String str = this.$actionTag;
        int size = list.size();
        int height = 0;
        int i = 0;
        while (i < size) {
            Measurable measurable = list.get(i);
            if (Intrinsics.f(LayoutIdKt.getLayoutId(measurable), str)) {
                long j3 = j2;
                final Placeable placeableMo2530measureBRTryo0 = measurable.mo2530measureBRTryo0(j3);
                int iM3279getMaxWidthimpl = (Constraints.m3279getMaxWidthimpl(j3) - placeableMo2530measureBRTryo0.getWidth()) - measureScope2.mo762roundToPx0680j_4(SnackbarKt.TextEndExtraSpacing);
                int iM3281getMinWidthimpl = Constraints.m3281getMinWidthimpl(j3);
                int i2 = iM3279getMaxWidthimpl < iM3281getMinWidthimpl ? iM3281getMinWidthimpl : iM3279getMaxWidthimpl;
                String str2 = this.$textTag;
                int size2 = list.size();
                int i3 = 0;
                while (i3 < size2) {
                    Measurable measurable2 = list.get(i3);
                    if (Intrinsics.f(LayoutIdKt.getLayoutId(measurable2), str2)) {
                        final Placeable placeableMo2530measureBRTryo02 = measurable2.mo2530measureBRTryo0(Constraints.m3271copyZbe2FdA$default(j3, 0, i2, 0, 0, 9, null));
                        int i5 = placeableMo2530measureBRTryo02.get(AlignmentLineKt.getFirstBaseline());
                        int i6 = placeableMo2530measureBRTryo02.get(AlignmentLineKt.getLastBaseline());
                        boolean z = true;
                        boolean z3 = (i5 == Integer.MIN_VALUE || i6 == Integer.MIN_VALUE) ? false : true;
                        if (i5 != i6 && z3) {
                            z = false;
                        }
                        final int iM3279getMaxWidthimpl2 = Constraints.m3279getMaxWidthimpl(j2) - placeableMo2530measureBRTryo0.getWidth();
                        if (z) {
                            iMax = Math.max(measureScope2.mo762roundToPx0680j_4(SnackbarKt.SnackbarMinHeightOneLine), placeableMo2530measureBRTryo0.getHeight());
                            iMo762roundToPx0680j_4 = (iMax - placeableMo2530measureBRTryo02.getHeight()) / 2;
                            int i21 = placeableMo2530measureBRTryo0.get(AlignmentLineKt.getFirstBaseline());
                            if (i21 != Integer.MIN_VALUE) {
                                height = (i5 + iMo762roundToPx0680j_4) - i21;
                            }
                        } else {
                            iMo762roundToPx0680j_4 = measureScope2.mo762roundToPx0680j_4(SnackbarKt.HeightToFirstLine) - i5;
                            iMax = Math.max(measureScope2.mo762roundToPx0680j_4(SnackbarKt.SnackbarMinHeightTwoLines), placeableMo2530measureBRTryo02.getHeight() + iMo762roundToPx0680j_4);
                            height = (iMax - placeableMo2530measureBRTryo0.getHeight()) / 2;
                        }
                        final int i22 = height;
                        final int i32 = iMo762roundToPx0680j_4;
                        return MeasureScope.layout$default(measureScope2, Constraints.m3279getMaxWidthimpl(j2), iMax, null, new Function1() { // from class: androidx.compose.material.j
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                return SnackbarKt$OneRowSnackbar$2$1.measure_3p2s80s$lambda$3(placeableMo2530measureBRTryo02, i32, placeableMo2530measureBRTryo0, iM3279getMaxWidthimpl2, i22, (Placeable.PlacementScope) obj2);
                            }
                        }, 4, null);
                    }
                    i3++;
                    measureScope2 = measureScope;
                    j3 = j2;
                }
                ListUtilsKt.throwNoSuchElementException("Collection contains no element matching the predicate.");
                throw new KotlinNothingValueException();
            }
            i++;
            measureScope2 = measureScope;
        }
        ListUtilsKt.throwNoSuchElementException("Collection contains no element matching the predicate.");
        throw new KotlinNothingValueException();
    }
}
