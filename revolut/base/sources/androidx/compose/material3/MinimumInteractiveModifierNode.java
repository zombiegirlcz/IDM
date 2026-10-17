package androidx.compose.material3;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.HorizontalAlignmentLine;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.VerticalAlignmentLine;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.unit.Dp;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import e1.k;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import zhm.r0;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\n\u001a\u00020\u000b*\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\u0014\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007H\u0002R\u001c\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Landroidx/compose/material3/MinimumInteractiveModifierNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/node/CompositionLocalConsumerModifierNode;", "Landroidx/compose/ui/node/LayoutModifierNode;", "<init>", "()V", "alignmentLinesCache", "", "Landroidx/compose/ui/layout/AlignmentLine;", "", "measure", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "measurable", "Landroidx/compose/ui/layout/Measurable;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "updateAlignmentLines", "", "sizePx", "placeable", "Landroidx/compose/ui/layout/Placeable;", "getAlignmentLinesCache", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class MinimumInteractiveModifierNode extends Modifier.Node implements CompositionLocalConsumerModifierNode, LayoutModifierNode {
    private Map<AlignmentLine, Integer> alignmentLinesCache;

    private final Map<AlignmentLine, Integer> getAlignmentLinesCache() {
        Map<AlignmentLine, Integer> map = this.alignmentLinesCache;
        if (map != null) {
            return map;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(2);
        this.alignmentLinesCache = linkedHashMap;
        return linkedHashMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit measure_3p2s80s$lambda$0(int i, Placeable placeable, int i2, Placeable.PlacementScope placementScope) {
        Placeable.PlacementScope.place$default(placementScope, placeable, rim.d.c((i - placeable.getWidth()) / 2.0f), rim.d.c((i2 - placeable.getHeight()) / 2.0f), BitmapDescriptorFactory.HUE_RED, 4, null);
        return Unit.f186387a;
    }

    private final void updateAlignmentLines(int sizePx, Placeable placeable) {
        Map<AlignmentLine, Integer> alignmentLinesCache = getAlignmentLinesCache();
        VerticalAlignmentLine minimumInteractiveLeftAlignmentLine = InteractiveComponentSizeKt.getMinimumInteractiveLeftAlignmentLine();
        int iRound = Math.round((sizePx - placeable.getWidth()) / 2.0f);
        if (iRound < 0) {
            iRound = 0;
        }
        alignmentLinesCache.put(minimumInteractiveLeftAlignmentLine, Integer.valueOf(iRound));
        HorizontalAlignmentLine minimumInteractiveTopAlignmentLine = InteractiveComponentSizeKt.getMinimumInteractiveTopAlignmentLine();
        int iRound2 = Math.round((sizePx - placeable.getHeight()) / 2.0f);
        alignmentLinesCache.put(minimumInteractiveTopAlignmentLine, Integer.valueOf(iRound2 >= 0 ? iRound2 : 0));
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    @NotNull
    /* JADX INFO: renamed from: measure-3p2s80s */
    public MeasureResult mo543measure3p2s80s(@NotNull MeasureScope measureScope, @NotNull Measurable measurable, long j2) {
        float value = ((Dp) CompositionLocalConsumerModifierNodeKt.currentValueOf(this, InteractiveComponentSizeKt.getLocalMinimumInteractiveComponentSize())).getValue();
        float f = 0;
        float fM3297constructorimpl = Dp.m3297constructorimpl(f);
        if (value < fM3297constructorimpl) {
            value = fM3297constructorimpl;
        }
        float fM3297constructorimpl2 = Dp.m3297constructorimpl(value);
        Placeable placeableMo2530measureBRTryo0 = measurable.mo2530measureBRTryo0(j2);
        boolean z = getIsAttached() && !Float.isNaN(fM3297constructorimpl2) && Dp.m3296compareTo0680j_4(fM3297constructorimpl2, Dp.m3297constructorimpl(f)) > 0;
        int iMo762roundToPx0680j_4 = Float.isNaN(fM3297constructorimpl2) ? 0 : measureScope.mo762roundToPx0680j_4(fM3297constructorimpl2);
        int iMax = z ? Math.max(placeableMo2530measureBRTryo0.getWidth(), iMo762roundToPx0680j_4) : placeableMo2530measureBRTryo0.getWidth();
        int iMax2 = z ? Math.max(placeableMo2530measureBRTryo0.getHeight(), iMo762roundToPx0680j_4) : placeableMo2530measureBRTryo0.getHeight();
        if (z) {
            updateAlignmentLines(iMo762roundToPx0680j_4, placeableMo2530measureBRTryo0);
        }
        Map<AlignmentLine, Integer> mapG = this.alignmentLinesCache;
        if (mapG == null) {
            mapG = r0.g();
        }
        return measureScope.layout(iMax, iMax2, mapG, new k(iMax, placeableMo2530measureBRTryo0, iMax2, 3));
    }
}
