package androidx.compose.material;

import androidx.compose.ui.layout.AlignmentLineKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
public final class SnackbarKt$TextOnlySnackbar$2$1 implements MeasurePolicy {
    public static final SnackbarKt$TextOnlySnackbar$2$1 INSTANCE = new SnackbarKt$TextOnlySnackbar$2$1();

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit measure_3p2s80s$lambda$1(ArrayList arrayList, int i, Placeable.PlacementScope placementScope) {
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            Placeable placeable = (Placeable) arrayList.get(i2);
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable, 0, (i - placeable.getHeight()) / 2, BitmapDescriptorFactory.HUE_RED, 4, null);
        }
        return Unit.f186387a;
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    /* JADX INFO: renamed from: measure-3p2s80s */
    public final MeasureResult mo520measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j2) {
        final ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        boolean z = false;
        int i = Integer.MIN_VALUE;
        int i2 = Integer.MIN_VALUE;
        int iMax = 0;
        for (int i3 = 0; i3 < size; i3++) {
            Placeable placeableMo2530measureBRTryo0 = list.get(i3).mo2530measureBRTryo0(j2);
            arrayList.add(placeableMo2530measureBRTryo0);
            if (placeableMo2530measureBRTryo0.get(AlignmentLineKt.getFirstBaseline()) != Integer.MIN_VALUE && (i == Integer.MIN_VALUE || placeableMo2530measureBRTryo0.get(AlignmentLineKt.getFirstBaseline()) < i)) {
                i = placeableMo2530measureBRTryo0.get(AlignmentLineKt.getFirstBaseline());
            }
            if (placeableMo2530measureBRTryo0.get(AlignmentLineKt.getLastBaseline()) != Integer.MIN_VALUE && (i2 == Integer.MIN_VALUE || placeableMo2530measureBRTryo0.get(AlignmentLineKt.getLastBaseline()) > i2)) {
                i2 = placeableMo2530measureBRTryo0.get(AlignmentLineKt.getLastBaseline());
            }
            iMax = Math.max(iMax, placeableMo2530measureBRTryo0.getHeight());
        }
        if (i != Integer.MIN_VALUE && i2 != Integer.MIN_VALUE) {
            z = true;
        }
        final int iMax2 = Math.max(measureScope.mo762roundToPx0680j_4((i == i2 || !z) ? SnackbarKt.SnackbarMinHeightOneLine : SnackbarKt.SnackbarMinHeightTwoLines), iMax);
        return MeasureScope.layout$default(measureScope, Constraints.m3279getMaxWidthimpl(j2), iMax2, null, new Function1() { // from class: androidx.compose.material.k
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return SnackbarKt$TextOnlySnackbar$2$1.measure_3p2s80s$lambda$1(arrayList, iMax2, (Placeable.PlacementScope) obj2);
            }
        }, 4, null);
    }
}
