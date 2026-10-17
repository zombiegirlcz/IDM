package androidx.compose.foundation.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.IntSize;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.Unit;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0012\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\r\u001a\u00020\n*\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u0011\u001a\u00020\n*\u00020\t2\u0006\u0010\u000e\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\u0013\u001a\u00020\n*\u00020\t2\u0006\u0010\u000e\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0012\u0010\u0010J\u001b\u0010\u0015\u001a\u00020\n*\u00020\t2\u0006\u0010\u000e\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0014\u0010\u0010J\u001b\u0010\u0017\u001a\u00020\n*\u00020\t2\u0006\u0010\u000e\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0016\u0010\u0010J#\u0010\u001f\u001a\u00020\u001c*\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ#\u0010$\u001a\u00020\"*\u00020 2\u0006\u0010\u001a\u001a\u00020!2\u0006\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b$\u0010%J#\u0010&\u001a\u00020\"*\u00020 2\u0006\u0010\u001a\u001a\u00020!2\u0006\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b&\u0010%J#\u0010(\u001a\u00020\"*\u00020 2\u0006\u0010\u001a\u001a\u00020!2\u0006\u0010'\u001a\u00020\"H\u0016¢\u0006\u0004\b(\u0010%J#\u0010)\u001a\u00020\"*\u00020 2\u0006\u0010\u001a\u001a\u00020!2\u0006\u0010'\u001a\u00020\"H\u0016¢\u0006\u0004\b)\u0010%R\"\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\"\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103¨\u00064"}, d2 = {"Landroidx/compose/foundation/layout/AspectRatioNode;", "Landroidx/compose/ui/node/LayoutModifierNode;", "Landroidx/compose/ui/Modifier$Node;", "", "aspectRatio", "", "matchHeightConstraintsFirst", "<init>", "(FZ)V", "Landroidx/compose/ui/unit/Constraints;", "Landroidx/compose/ui/unit/IntSize;", "findSize-ToXhtMw", "(J)J", "findSize", "enforceConstraints", "tryMaxWidth-JN-0ABg", "(JZ)J", "tryMaxWidth", "tryMaxHeight-JN-0ABg", "tryMaxHeight", "tryMinWidth-JN-0ABg", "tryMinWidth", "tryMinHeight-JN-0ABg", "tryMinHeight", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "measurable", "constraints", "Landroidx/compose/ui/layout/MeasureResult;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "measure", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "", "height", "minIntrinsicWidth", "(Landroidx/compose/ui/layout/IntrinsicMeasureScope;Landroidx/compose/ui/layout/IntrinsicMeasurable;I)I", "maxIntrinsicWidth", "width", "minIntrinsicHeight", "maxIntrinsicHeight", "F", "getAspectRatio", "()F", "setAspectRatio", "(F)V", "Z", "getMatchHeightConstraintsFirst", "()Z", "setMatchHeightConstraintsFirst", "(Z)V", "foundation-layout"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class AspectRatioNode extends Modifier.Node implements LayoutModifierNode {
    private float aspectRatio;
    private boolean matchHeightConstraintsFirst;

    public AspectRatioNode(float f, boolean z) {
        this.aspectRatio = f;
        this.matchHeightConstraintsFirst = z;
    }

    /* JADX INFO: renamed from: findSize-ToXhtMw, reason: not valid java name */
    private final long m840findSizeToXhtMw(long j2) {
        if (this.matchHeightConstraintsFirst) {
            long jM841tryMaxHeightJN0ABg = m841tryMaxHeightJN0ABg(j2, true);
            IntSize.Companion companion = IntSize.INSTANCE;
            if (!IntSize.m3353equalsimpl0(jM841tryMaxHeightJN0ABg, companion.m3359getZeroYbymL2g())) {
                return jM841tryMaxHeightJN0ABg;
            }
            long jM842tryMaxWidthJN0ABg = m842tryMaxWidthJN0ABg(j2, true);
            if (!IntSize.m3353equalsimpl0(jM842tryMaxWidthJN0ABg, companion.m3359getZeroYbymL2g())) {
                return jM842tryMaxWidthJN0ABg;
            }
            long jM843tryMinHeightJN0ABg = m843tryMinHeightJN0ABg(j2, true);
            if (!IntSize.m3353equalsimpl0(jM843tryMinHeightJN0ABg, companion.m3359getZeroYbymL2g())) {
                return jM843tryMinHeightJN0ABg;
            }
            long jM844tryMinWidthJN0ABg = m844tryMinWidthJN0ABg(j2, true);
            if (!IntSize.m3353equalsimpl0(jM844tryMinWidthJN0ABg, companion.m3359getZeroYbymL2g())) {
                return jM844tryMinWidthJN0ABg;
            }
            long jM841tryMaxHeightJN0ABg2 = m841tryMaxHeightJN0ABg(j2, false);
            if (!IntSize.m3353equalsimpl0(jM841tryMaxHeightJN0ABg2, companion.m3359getZeroYbymL2g())) {
                return jM841tryMaxHeightJN0ABg2;
            }
            long jM842tryMaxWidthJN0ABg2 = m842tryMaxWidthJN0ABg(j2, false);
            if (!IntSize.m3353equalsimpl0(jM842tryMaxWidthJN0ABg2, companion.m3359getZeroYbymL2g())) {
                return jM842tryMaxWidthJN0ABg2;
            }
            long jM843tryMinHeightJN0ABg2 = m843tryMinHeightJN0ABg(j2, false);
            if (!IntSize.m3353equalsimpl0(jM843tryMinHeightJN0ABg2, companion.m3359getZeroYbymL2g())) {
                return jM843tryMinHeightJN0ABg2;
            }
            long jM844tryMinWidthJN0ABg2 = m844tryMinWidthJN0ABg(j2, false);
            if (!IntSize.m3353equalsimpl0(jM844tryMinWidthJN0ABg2, companion.m3359getZeroYbymL2g())) {
                return jM844tryMinWidthJN0ABg2;
            }
        } else {
            long jM842tryMaxWidthJN0ABg3 = m842tryMaxWidthJN0ABg(j2, true);
            IntSize.Companion companion2 = IntSize.INSTANCE;
            if (!IntSize.m3353equalsimpl0(jM842tryMaxWidthJN0ABg3, companion2.m3359getZeroYbymL2g())) {
                return jM842tryMaxWidthJN0ABg3;
            }
            long jM841tryMaxHeightJN0ABg3 = m841tryMaxHeightJN0ABg(j2, true);
            if (!IntSize.m3353equalsimpl0(jM841tryMaxHeightJN0ABg3, companion2.m3359getZeroYbymL2g())) {
                return jM841tryMaxHeightJN0ABg3;
            }
            long jM844tryMinWidthJN0ABg3 = m844tryMinWidthJN0ABg(j2, true);
            if (!IntSize.m3353equalsimpl0(jM844tryMinWidthJN0ABg3, companion2.m3359getZeroYbymL2g())) {
                return jM844tryMinWidthJN0ABg3;
            }
            long jM843tryMinHeightJN0ABg3 = m843tryMinHeightJN0ABg(j2, true);
            if (!IntSize.m3353equalsimpl0(jM843tryMinHeightJN0ABg3, companion2.m3359getZeroYbymL2g())) {
                return jM843tryMinHeightJN0ABg3;
            }
            long jM842tryMaxWidthJN0ABg4 = m842tryMaxWidthJN0ABg(j2, false);
            if (!IntSize.m3353equalsimpl0(jM842tryMaxWidthJN0ABg4, companion2.m3359getZeroYbymL2g())) {
                return jM842tryMaxWidthJN0ABg4;
            }
            long jM841tryMaxHeightJN0ABg4 = m841tryMaxHeightJN0ABg(j2, false);
            if (!IntSize.m3353equalsimpl0(jM841tryMaxHeightJN0ABg4, companion2.m3359getZeroYbymL2g())) {
                return jM841tryMaxHeightJN0ABg4;
            }
            long jM844tryMinWidthJN0ABg4 = m844tryMinWidthJN0ABg(j2, false);
            if (!IntSize.m3353equalsimpl0(jM844tryMinWidthJN0ABg4, companion2.m3359getZeroYbymL2g())) {
                return jM844tryMinWidthJN0ABg4;
            }
            long jM843tryMinHeightJN0ABg4 = m843tryMinHeightJN0ABg(j2, false);
            if (!IntSize.m3353equalsimpl0(jM843tryMinHeightJN0ABg4, companion2.m3359getZeroYbymL2g())) {
                return jM843tryMinHeightJN0ABg4;
            }
        }
        return IntSize.INSTANCE.m3359getZeroYbymL2g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit measure_3p2s80s$lambda$0(Placeable placeable, Placeable.PlacementScope placementScope) {
        Placeable.PlacementScope.placeRelative$default(placementScope, placeable, 0, 0, BitmapDescriptorFactory.HUE_RED, 4, null);
        return Unit.f186387a;
    }

    /* JADX INFO: renamed from: tryMaxHeight-JN-0ABg, reason: not valid java name */
    private final long m841tryMaxHeightJN0ABg(long j2, boolean z) {
        int iRound;
        int iM3278getMaxHeightimpl = Constraints.m3278getMaxHeightimpl(j2);
        return (iM3278getMaxHeightimpl == Integer.MAX_VALUE || (iRound = Math.round(((float) iM3278getMaxHeightimpl) * this.aspectRatio)) <= 0 || (z && !AspectRatioKt.m839isSatisfiedByNN6EwU(j2, iRound, iM3278getMaxHeightimpl))) ? IntSize.INSTANCE.m3359getZeroYbymL2g() : IntSize.m3351constructorimpl((((long) iRound) << 32) | (((long) iM3278getMaxHeightimpl) & BodyPartID.bodyIdMax));
    }

    /* JADX INFO: renamed from: tryMaxWidth-JN-0ABg, reason: not valid java name */
    private final long m842tryMaxWidthJN0ABg(long j2, boolean z) {
        int iRound;
        int iM3279getMaxWidthimpl = Constraints.m3279getMaxWidthimpl(j2);
        return (iM3279getMaxWidthimpl == Integer.MAX_VALUE || (iRound = Math.round(((float) iM3279getMaxWidthimpl) / this.aspectRatio)) <= 0 || (z && !AspectRatioKt.m839isSatisfiedByNN6EwU(j2, iM3279getMaxWidthimpl, iRound))) ? IntSize.INSTANCE.m3359getZeroYbymL2g() : IntSize.m3351constructorimpl((((long) iM3279getMaxWidthimpl) << 32) | (((long) iRound) & BodyPartID.bodyIdMax));
    }

    /* JADX INFO: renamed from: tryMinHeight-JN-0ABg, reason: not valid java name */
    private final long m843tryMinHeightJN0ABg(long j2, boolean z) {
        int iM3280getMinHeightimpl = Constraints.m3280getMinHeightimpl(j2);
        int iRound = Math.round(iM3280getMinHeightimpl * this.aspectRatio);
        return (iRound <= 0 || (z && !AspectRatioKt.m839isSatisfiedByNN6EwU(j2, iRound, iM3280getMinHeightimpl))) ? IntSize.INSTANCE.m3359getZeroYbymL2g() : IntSize.m3351constructorimpl((((long) iRound) << 32) | (((long) iM3280getMinHeightimpl) & BodyPartID.bodyIdMax));
    }

    /* JADX INFO: renamed from: tryMinWidth-JN-0ABg, reason: not valid java name */
    private final long m844tryMinWidthJN0ABg(long j2, boolean z) {
        int iM3281getMinWidthimpl = Constraints.m3281getMinWidthimpl(j2);
        int iRound = Math.round(iM3281getMinWidthimpl / this.aspectRatio);
        return (iRound <= 0 || (z && !AspectRatioKt.m839isSatisfiedByNN6EwU(j2, iM3281getMinWidthimpl, iRound))) ? IntSize.INSTANCE.m3359getZeroYbymL2g() : IntSize.m3351constructorimpl((((long) iM3281getMinWidthimpl) << 32) | (((long) iRound) & BodyPartID.bodyIdMax));
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int maxIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull IntrinsicMeasurable intrinsicMeasurable, int i) {
        return i != Integer.MAX_VALUE ? Math.round(i / this.aspectRatio) : intrinsicMeasurable.maxIntrinsicHeight(i);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int maxIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull IntrinsicMeasurable intrinsicMeasurable, int i) {
        return i != Integer.MAX_VALUE ? Math.round(i * this.aspectRatio) : intrinsicMeasurable.maxIntrinsicWidth(i);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    @NotNull
    /* JADX INFO: renamed from: measure-3p2s80s */
    public MeasureResult mo543measure3p2s80s(@NotNull MeasureScope measureScope, @NotNull Measurable measurable, long j2) {
        long jM840findSizeToXhtMw = m840findSizeToXhtMw(j2);
        if (!IntSize.m3353equalsimpl0(jM840findSizeToXhtMw, IntSize.INSTANCE.m3359getZeroYbymL2g())) {
            j2 = Constraints.INSTANCE.m3287fixedJhjzzOo((int) (jM840findSizeToXhtMw >> 32), (int) (jM840findSizeToXhtMw & BodyPartID.bodyIdMax));
        }
        Placeable placeableMo2530measureBRTryo0 = measurable.mo2530measureBRTryo0(j2);
        return MeasureScope.layout$default(measureScope, placeableMo2530measureBRTryo0.getWidth(), placeableMo2530measureBRTryo0.getHeight(), null, new a(0, placeableMo2530measureBRTryo0), 4, null);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int minIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull IntrinsicMeasurable intrinsicMeasurable, int i) {
        return i != Integer.MAX_VALUE ? Math.round(i / this.aspectRatio) : intrinsicMeasurable.minIntrinsicHeight(i);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int minIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull IntrinsicMeasurable intrinsicMeasurable, int i) {
        return i != Integer.MAX_VALUE ? Math.round(i * this.aspectRatio) : intrinsicMeasurable.minIntrinsicWidth(i);
    }

    public final void setAspectRatio(float f) {
        this.aspectRatio = f;
    }

    public final void setMatchHeightConstraintsFirst(boolean z) {
        this.matchHeightConstraintsFirst = z;
    }
}
