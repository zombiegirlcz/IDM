package androidx.compose.foundation.layout;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import ch.qos.logback.core.CoreConstants;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$IntRef;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0082\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J)\u0010\u0011\u001a\u00020\u000e*\u00020\b2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00042\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001cR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001d¨\u0006\u001e"}, d2 = {"Landroidx/compose/foundation/layout/BoxMeasurePolicy;", "Landroidx/compose/ui/layout/MeasurePolicy;", "Landroidx/compose/ui/Alignment;", "alignment", "", "propagateMinConstraints", "<init>", "(Landroidx/compose/ui/Alignment;Z)V", "Landroidx/compose/ui/layout/MeasureScope;", "", "Landroidx/compose/ui/layout/Measurable;", "measurables", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/compose/ui/layout/MeasureResult;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Ljava/util/List;J)Landroidx/compose/ui/layout/MeasureResult;", "measure", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Landroidx/compose/ui/Alignment;", "Z", "foundation-layout"}, k = 1, mv = {2, 0, 0}, xi = 48)
final /* data */ class BoxMeasurePolicy implements MeasurePolicy {

    @NotNull
    private final Alignment alignment;
    private final boolean propagateMinConstraints;

    public BoxMeasurePolicy(@NotNull Alignment alignment, boolean z) {
        this.alignment = alignment;
        this.propagateMinConstraints = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit measure_3p2s80s$lambda$0(Placeable.PlacementScope placementScope) {
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit measure_3p2s80s$lambda$1(Placeable placeable, Measurable measurable, MeasureScope measureScope, int i, int i2, BoxMeasurePolicy boxMeasurePolicy, Placeable.PlacementScope placementScope) {
        BoxKt.placeInBox(placementScope, placeable, measurable, measureScope.getLayoutDirection(), i, i2, boxMeasurePolicy.alignment);
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit measure_3p2s80s$lambda$4(Placeable[] placeableArr, List list, MeasureScope measureScope, Ref$IntRef ref$IntRef, Ref$IntRef ref$IntRef2, BoxMeasurePolicy boxMeasurePolicy, Placeable.PlacementScope placementScope) {
        int length = placeableArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            Placeable placeable = placeableArr[i];
            Intrinsics.i(placeable, "null cannot be cast to non-null type androidx.compose.ui.layout.Placeable");
            BoxKt.placeInBox(placementScope, placeable, (Measurable) list.get(i2), measureScope.getLayoutDirection(), ref$IntRef.f186408a, ref$IntRef2.f186408a, boxMeasurePolicy.alignment);
            i++;
            i2++;
        }
        return Unit.f186387a;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BoxMeasurePolicy)) {
            return false;
        }
        BoxMeasurePolicy boxMeasurePolicy = (BoxMeasurePolicy) other;
        return Intrinsics.f(this.alignment, boxMeasurePolicy.alignment) && this.propagateMinConstraints == boxMeasurePolicy.propagateMinConstraints;
    }

    public int hashCode() {
        return Boolean.hashCode(this.propagateMinConstraints) + (this.alignment.hashCode() * 31);
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    @NotNull
    /* JADX INFO: renamed from: measure-3p2s80s */
    public MeasureResult mo520measure3p2s80s(@NotNull final MeasureScope measureScope, @NotNull final List<? extends Measurable> list, long j2) {
        int iM3281getMinWidthimpl;
        int iM3280getMinHeightimpl;
        Placeable placeableMo2530measureBRTryo0;
        if (list.isEmpty()) {
            return MeasureScope.layout$default(measureScope, Constraints.m3281getMinWidthimpl(j2), Constraints.m3280getMinHeightimpl(j2), null, new b(1), 4, null);
        }
        long jM3269constructorimpl = this.propagateMinConstraints ? j2 : Constraints.m3269constructorimpl(j2 & (-8589934589L));
        if (list.size() == 1) {
            final Measurable measurable = list.get(0);
            if (BoxKt.getMatchesParentSize(measurable)) {
                iM3281getMinWidthimpl = Constraints.m3281getMinWidthimpl(j2);
                iM3280getMinHeightimpl = Constraints.m3280getMinHeightimpl(j2);
                placeableMo2530measureBRTryo0 = measurable.mo2530measureBRTryo0(Constraints.INSTANCE.m3287fixedJhjzzOo(Constraints.m3281getMinWidthimpl(j2), Constraints.m3280getMinHeightimpl(j2)));
            } else {
                placeableMo2530measureBRTryo0 = measurable.mo2530measureBRTryo0(jM3269constructorimpl);
                iM3281getMinWidthimpl = Math.max(Constraints.m3281getMinWidthimpl(j2), placeableMo2530measureBRTryo0.getWidth());
                iM3280getMinHeightimpl = Math.max(Constraints.m3280getMinHeightimpl(j2), placeableMo2530measureBRTryo0.getHeight());
            }
            final int i = iM3281getMinWidthimpl;
            final int i2 = iM3280getMinHeightimpl;
            final Placeable placeable = placeableMo2530measureBRTryo0;
            return MeasureScope.layout$default(measureScope, i, i2, null, new Function1() { // from class: androidx.compose.foundation.layout.c
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return BoxMeasurePolicy.measure_3p2s80s$lambda$1(placeable, measurable, measureScope, i, i2, this, (Placeable.PlacementScope) obj2);
                }
            }, 4, null);
        }
        final Placeable[] placeableArr = new Placeable[list.size()];
        final Ref$IntRef ref$IntRef = new Ref$IntRef();
        ref$IntRef.f186408a = Constraints.m3281getMinWidthimpl(j2);
        final Ref$IntRef ref$IntRef2 = new Ref$IntRef();
        ref$IntRef2.f186408a = Constraints.m3280getMinHeightimpl(j2);
        List<? extends Measurable> list2 = list;
        int size = list2.size();
        boolean z = false;
        for (int i3 = 0; i3 < size; i3++) {
            Measurable measurable2 = list.get(i3);
            if (BoxKt.getMatchesParentSize(measurable2)) {
                z = true;
            } else {
                Placeable placeableMo2530measureBRTryo02 = measurable2.mo2530measureBRTryo0(jM3269constructorimpl);
                placeableArr[i3] = placeableMo2530measureBRTryo02;
                ref$IntRef.f186408a = Math.max(ref$IntRef.f186408a, placeableMo2530measureBRTryo02.getWidth());
                ref$IntRef2.f186408a = Math.max(ref$IntRef2.f186408a, placeableMo2530measureBRTryo02.getHeight());
            }
        }
        if (z) {
            int i5 = ref$IntRef.f186408a;
            int i6 = i5 != Integer.MAX_VALUE ? i5 : 0;
            int i21 = ref$IntRef2.f186408a;
            long jConstraints = ConstraintsKt.Constraints(i6, i5, i21 != Integer.MAX_VALUE ? i21 : 0, i21);
            int size2 = list2.size();
            for (int i22 = 0; i22 < size2; i22++) {
                Measurable measurable3 = list.get(i22);
                if (BoxKt.getMatchesParentSize(measurable3)) {
                    placeableArr[i22] = measurable3.mo2530measureBRTryo0(jConstraints);
                }
            }
        }
        return MeasureScope.layout$default(measureScope, ref$IntRef.f186408a, ref$IntRef2.f186408a, null, new Function1() { // from class: androidx.compose.foundation.layout.d
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return BoxMeasurePolicy.measure_3p2s80s$lambda$4(placeableArr, list, measureScope, ref$IntRef, ref$IntRef2, this, (Placeable.PlacementScope) obj2);
            }
        }, 4, null);
    }

    @NotNull
    public String toString() {
        StringBuilder sb6 = new StringBuilder("BoxMeasurePolicy(alignment=");
        sb6.append(this.alignment);
        sb6.append(", propagateMinConstraints=");
        return j6.a.x(sb6, this.propagateMinConstraints, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }
}
