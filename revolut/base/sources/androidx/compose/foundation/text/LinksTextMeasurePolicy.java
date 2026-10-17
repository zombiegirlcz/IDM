package androidx.compose.foundation.text;

import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.IntOffset;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J)\u0010\u0007\u001a\u00020\b*\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\r\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Landroidx/compose/foundation/text/LinksTextMeasurePolicy;", "Landroidx/compose/ui/layout/MeasurePolicy;", "shouldMeasureLinks", "Lkotlin/Function0;", "", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "measure", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "measurables", "", "Landroidx/compose/ui/layout/Measurable;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Ljava/util/List;J)Landroidx/compose/ui/layout/MeasureResult;", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class LinksTextMeasurePolicy implements MeasurePolicy {

    @NotNull
    private final Function0<Boolean> shouldMeasureLinks;

    public LinksTextMeasurePolicy(@NotNull Function0<Boolean> function0) {
        this.shouldMeasureLinks = function0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit measure_3p2s80s$lambda$0(List list, LinksTextMeasurePolicy linksTextMeasurePolicy, Placeable.PlacementScope placementScope) {
        List listMeasureWithTextRangeMeasureConstraints = BasicTextKt.measureWithTextRangeMeasureConstraints(list, linksTextMeasurePolicy.shouldMeasureLinks);
        if (listMeasureWithTextRangeMeasureConstraints != null) {
            int size = listMeasureWithTextRangeMeasureConstraints.size();
            for (int i = 0; i < size; i++) {
                Pair pair = (Pair) listMeasureWithTextRangeMeasureConstraints.get(i);
                Placeable placeable = (Placeable) pair.f186385a;
                Function0 function0 = (Function0) pair.f186386b;
                Placeable.PlacementScope.m2556place70tqf50$default(placementScope, placeable, function0 != null ? ((IntOffset) function0.invoke()).getPackedValue() : IntOffset.INSTANCE.m3343getZeronOccac(), BitmapDescriptorFactory.HUE_RED, 2, null);
            }
        }
        return Unit.f186387a;
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    @NotNull
    /* JADX INFO: renamed from: measure-3p2s80s */
    public MeasureResult mo520measure3p2s80s(@NotNull MeasureScope measureScope, @NotNull List<? extends Measurable> list, long j2) {
        return MeasureScope.layout$default(measureScope, Constraints.m3279getMaxWidthimpl(j2), Constraints.m3278getMaxHeightimpl(j2), null, new b(list, this, 1), 4, null);
    }
}
