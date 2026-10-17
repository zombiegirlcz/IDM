package androidx.compose.foundation.layout;

import androidx.compose.foundation.layout.internal.InlineClassHelperKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Dp;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J#\u0010\u000f\u001a\u00020\f*\u00020\u00072\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eR\"\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0006¨\u0006\u0014"}, d2 = {"Landroidx/compose/foundation/layout/PaddingValuesModifier;", "Landroidx/compose/ui/node/LayoutModifierNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/foundation/layout/PaddingValues;", "paddingValues", "<init>", "(Landroidx/compose/foundation/layout/PaddingValues;)V", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "measurable", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/compose/ui/layout/MeasureResult;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "measure", "Landroidx/compose/foundation/layout/PaddingValues;", "getPaddingValues", "()Landroidx/compose/foundation/layout/PaddingValues;", "setPaddingValues", "foundation-layout"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class PaddingValuesModifier extends Modifier.Node implements LayoutModifierNode {

    @NotNull
    private PaddingValues paddingValues;

    public PaddingValuesModifier(@NotNull PaddingValues paddingValues) {
        this.paddingValues = paddingValues;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit measure_3p2s80s$lambda$1(Placeable placeable, int i, int i2, Placeable.PlacementScope placementScope) {
        Placeable.PlacementScope.place$default(placementScope, placeable, i, i2, BitmapDescriptorFactory.HUE_RED, 4, null);
        return Unit.f186387a;
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    @NotNull
    /* JADX INFO: renamed from: measure-3p2s80s */
    public MeasureResult mo543measure3p2s80s(@NotNull MeasureScope measureScope, @NotNull Measurable measurable, long j2) {
        float fMo850calculateLeftPaddingu2uoSUM = this.paddingValues.mo850calculateLeftPaddingu2uoSUM(measureScope.getLayoutDirection());
        float top = this.paddingValues.getTop();
        float fMo851calculateRightPaddingu2uoSUM = this.paddingValues.mo851calculateRightPaddingu2uoSUM(measureScope.getLayoutDirection());
        float bottom = this.paddingValues.getBottom();
        float f = 0;
        if (!((Dp.m3296compareTo0680j_4(bottom, Dp.m3297constructorimpl(f)) >= 0) & (Dp.m3296compareTo0680j_4(fMo850calculateLeftPaddingu2uoSUM, Dp.m3297constructorimpl(f)) >= 0) & (Dp.m3296compareTo0680j_4(top, Dp.m3297constructorimpl(f)) >= 0) & (Dp.m3296compareTo0680j_4(fMo851calculateRightPaddingu2uoSUM, Dp.m3297constructorimpl(f)) >= 0))) {
            InlineClassHelperKt.throwIllegalArgumentException("Padding must be non-negative");
        }
        final int iMo762roundToPx0680j_4 = measureScope.mo762roundToPx0680j_4(fMo850calculateLeftPaddingu2uoSUM);
        int iMo762roundToPx0680j_42 = measureScope.mo762roundToPx0680j_4(fMo851calculateRightPaddingu2uoSUM) + iMo762roundToPx0680j_4;
        final int iMo762roundToPx0680j_43 = measureScope.mo762roundToPx0680j_4(top);
        int iMo762roundToPx0680j_44 = measureScope.mo762roundToPx0680j_4(bottom) + iMo762roundToPx0680j_43;
        final Placeable placeableMo2530measureBRTryo0 = measurable.mo2530measureBRTryo0(ConstraintsKt.m3293offsetNN6EwU(j2, -iMo762roundToPx0680j_42, -iMo762roundToPx0680j_44));
        return MeasureScope.layout$default(measureScope, ConstraintsKt.m3292constrainWidthK40F9xA(j2, placeableMo2530measureBRTryo0.getWidth() + iMo762roundToPx0680j_42), ConstraintsKt.m3291constrainHeightK40F9xA(j2, placeableMo2530measureBRTryo0.getHeight() + iMo762roundToPx0680j_44), null, new Function1() { // from class: androidx.compose.foundation.layout.g
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                int i = iMo762roundToPx0680j_4;
                return PaddingValuesModifier.measure_3p2s80s$lambda$1(placeableMo2530measureBRTryo0, i, iMo762roundToPx0680j_43, (Placeable.PlacementScope) obj2);
            }
        }, 4, null);
    }

    public final void setPaddingValues(@NotNull PaddingValues paddingValues) {
        this.paddingValues = paddingValues;
    }
}
