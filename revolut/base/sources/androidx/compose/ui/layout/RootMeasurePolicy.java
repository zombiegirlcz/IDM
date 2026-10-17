package androidx.compose.ui.layout;

import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\u0004\u001a\u00020\u0005*\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Landroidx/compose/ui/layout/RootMeasurePolicy;", "Landroidx/compose/ui/node/LayoutNode$NoIntrinsicsMeasurePolicy;", "<init>", "()V", "measure", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "measurables", "", "Landroidx/compose/ui/layout/Measurable;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Ljava/util/List;J)Landroidx/compose/ui/layout/MeasureResult;", "ui"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RootMeasurePolicy extends LayoutNode.NoIntrinsicsMeasurePolicy {

    @NotNull
    public static final RootMeasurePolicy INSTANCE = new RootMeasurePolicy();

    private RootMeasurePolicy() {
        super("Undefined intrinsics block and it is required");
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    @NotNull
    /* JADX INFO: renamed from: measure-3p2s80s */
    public MeasureResult mo520measure3p2s80s(@NotNull MeasureScope measureScope, @NotNull List<? extends Measurable> list, long j2) {
        int size = list.size();
        if (size == 0) {
            return MeasureScope.layout$default(measureScope, Constraints.m3281getMinWidthimpl(j2), Constraints.m3280getMinHeightimpl(j2), null, RootMeasurePolicy$measure$1.INSTANCE, 4, null);
        }
        if (size == 1) {
            Placeable placeableMo2530measureBRTryo0 = list.get(0).mo2530measureBRTryo0(j2);
            return MeasureScope.layout$default(measureScope, ConstraintsKt.m3292constrainWidthK40F9xA(j2, placeableMo2530measureBRTryo0.getWidth()), ConstraintsKt.m3291constrainHeightK40F9xA(j2, placeableMo2530measureBRTryo0.getHeight()), null, new RootMeasurePolicy$measure$2(placeableMo2530measureBRTryo0), 4, null);
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size2 = list.size();
        int iMax = 0;
        int iMax2 = 0;
        for (int i = 0; i < size2; i++) {
            Placeable placeableMo2530measureBRTryo02 = list.get(i).mo2530measureBRTryo0(j2);
            iMax = Math.max(placeableMo2530measureBRTryo02.getWidth(), iMax);
            iMax2 = Math.max(placeableMo2530measureBRTryo02.getHeight(), iMax2);
            arrayList.add(placeableMo2530measureBRTryo02);
        }
        return MeasureScope.layout$default(measureScope, ConstraintsKt.m3292constrainWidthK40F9xA(j2, iMax), ConstraintsKt.m3291constrainHeightK40F9xA(j2, iMax2), null, new RootMeasurePolicy$measure$3(arrayList), 4, null);
    }
}
