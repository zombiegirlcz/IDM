package androidx.compose.ui.draw;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.ScaleFactorKt;
import androidx.compose.ui.node.DrawModifierNode;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b%\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003BA\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u0015J\u0013\u0010\u001d\u001a\u00020\u0006*\u00020\u0012H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0013\u0010\u001f\u001a\u00020\u0006*\u00020\u0012H\u0002¢\u0006\u0004\b\u001e\u0010\u001cJ#\u0010&\u001a\u00020#*\u00020 2\u0006\u0010\"\u001a\u00020!2\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b$\u0010%J#\u0010+\u001a\u00020)*\u00020'2\u0006\u0010\"\u001a\u00020(2\u0006\u0010*\u001a\u00020)H\u0016¢\u0006\u0004\b+\u0010,J#\u0010-\u001a\u00020)*\u00020'2\u0006\u0010\"\u001a\u00020(2\u0006\u0010*\u001a\u00020)H\u0016¢\u0006\u0004\b-\u0010,J#\u0010/\u001a\u00020)*\u00020'2\u0006\u0010\"\u001a\u00020(2\u0006\u0010.\u001a\u00020)H\u0016¢\u0006\u0004\b/\u0010,J#\u00100\u001a\u00020)*\u00020'2\u0006\u0010\"\u001a\u00020(2\u0006\u0010.\u001a\u00020)H\u0016¢\u0006\u0004\b0\u0010,J\u0013\u00103\u001a\u000202*\u000201H\u0016¢\u0006\u0004\b3\u00104J\u000f\u00106\u001a\u000205H\u0016¢\u0006\u0004\b6\u00107R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\"\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR\"\u0010\t\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010B\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR\"\u0010\u000b\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010G\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR\"\u0010\r\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010L\u001a\u0004\bM\u0010N\"\u0004\bO\u0010PR$\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010Q\u001a\u0004\bR\u0010S\"\u0004\bT\u0010UR\u0014\u0010W\u001a\u00020\u00068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bV\u0010?R\u0014\u0010Y\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bX\u0010?¨\u0006Z"}, d2 = {"Landroidx/compose/ui/draw/PainterNode;", "Landroidx/compose/ui/node/LayoutModifierNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/node/DrawModifierNode;", "Landroidx/compose/ui/graphics/painter/Painter;", "painter", "", "sizeToIntrinsics", "Landroidx/compose/ui/Alignment;", "alignment", "Landroidx/compose/ui/layout/ContentScale;", "contentScale", "", "alpha", "Landroidx/compose/ui/graphics/ColorFilter;", "colorFilter", "<init>", "(Landroidx/compose/ui/graphics/painter/Painter;ZLandroidx/compose/ui/Alignment;Landroidx/compose/ui/layout/ContentScale;FLandroidx/compose/ui/graphics/ColorFilter;)V", "Landroidx/compose/ui/geometry/Size;", "dstSize", "calculateScaledSize-E7KxVPU", "(J)J", "calculateScaledSize", "Landroidx/compose/ui/unit/Constraints;", "constraints", "modifyConstraints-ZezNO4M", "modifyConstraints", "hasSpecifiedAndFiniteWidth-uvyYCjk", "(J)Z", "hasSpecifiedAndFiniteWidth", "hasSpecifiedAndFiniteHeight-uvyYCjk", "hasSpecifiedAndFiniteHeight", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "measurable", "Landroidx/compose/ui/layout/MeasureResult;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "measure", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "", "height", "minIntrinsicWidth", "(Landroidx/compose/ui/layout/IntrinsicMeasureScope;Landroidx/compose/ui/layout/IntrinsicMeasurable;I)I", "maxIntrinsicWidth", "width", "minIntrinsicHeight", "maxIntrinsicHeight", "Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "", "draw", "(Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;)V", "", "toString", "()Ljava/lang/String;", "Landroidx/compose/ui/graphics/painter/Painter;", "getPainter", "()Landroidx/compose/ui/graphics/painter/Painter;", "setPainter", "(Landroidx/compose/ui/graphics/painter/Painter;)V", "Z", "getSizeToIntrinsics", "()Z", "setSizeToIntrinsics", "(Z)V", "Landroidx/compose/ui/Alignment;", "getAlignment", "()Landroidx/compose/ui/Alignment;", "setAlignment", "(Landroidx/compose/ui/Alignment;)V", "Landroidx/compose/ui/layout/ContentScale;", "getContentScale", "()Landroidx/compose/ui/layout/ContentScale;", "setContentScale", "(Landroidx/compose/ui/layout/ContentScale;)V", "F", "getAlpha", "()F", "setAlpha", "(F)V", "Landroidx/compose/ui/graphics/ColorFilter;", "getColorFilter", "()Landroidx/compose/ui/graphics/ColorFilter;", "setColorFilter", "(Landroidx/compose/ui/graphics/ColorFilter;)V", "getUseIntrinsicSize", "useIntrinsicSize", "getShouldAutoInvalidate", "shouldAutoInvalidate", "ui"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class PainterNode extends Modifier.Node implements LayoutModifierNode, DrawModifierNode {

    @NotNull
    private Alignment alignment;
    private float alpha;
    private ColorFilter colorFilter;

    @NotNull
    private ContentScale contentScale;

    @NotNull
    private Painter painter;
    private boolean sizeToIntrinsics;

    public PainterNode(@NotNull Painter painter, boolean z, @NotNull Alignment alignment, @NotNull ContentScale contentScale, float f, ColorFilter colorFilter) {
        this.painter = painter;
        this.sizeToIntrinsics = z;
        this.alignment = alignment;
        this.contentScale = contentScale;
        this.alpha = f;
        this.colorFilter = colorFilter;
    }

    /* JADX INFO: renamed from: calculateScaledSize-E7KxVPU, reason: not valid java name */
    private final long m1740calculateScaledSizeE7KxVPU(long dstSize) {
        if (!getUseIntrinsicSize()) {
            return dstSize;
        }
        long jM1862constructorimpl = Size.m1862constructorimpl((((long) Float.floatToRawIntBits(!m1742hasSpecifiedAndFiniteWidthuvyYCjk(this.painter.mo2255getIntrinsicSizeNHjbRc()) ? Float.intBitsToFloat((int) (dstSize >> 32)) : Float.intBitsToFloat((int) (this.painter.mo2255getIntrinsicSizeNHjbRc() >> 32)))) << 32) | (((long) Float.floatToRawIntBits(!m1741hasSpecifiedAndFiniteHeightuvyYCjk(this.painter.mo2255getIntrinsicSizeNHjbRc()) ? Float.intBitsToFloat((int) (dstSize & BodyPartID.bodyIdMax)) : Float.intBitsToFloat((int) (this.painter.mo2255getIntrinsicSizeNHjbRc() & BodyPartID.bodyIdMax)))) & BodyPartID.bodyIdMax));
        return (Float.intBitsToFloat((int) (dstSize >> 32)) == BitmapDescriptorFactory.HUE_RED || Float.intBitsToFloat((int) (dstSize & BodyPartID.bodyIdMax)) == BitmapDescriptorFactory.HUE_RED) ? Size.INSTANCE.m1875getZeroNHjbRc() : ScaleFactorKt.m2591timesUQTWf7w(jM1862constructorimpl, this.contentScale.mo2525computeScaleFactorH7hwNQA(jM1862constructorimpl, dstSize));
    }

    private final boolean getUseIntrinsicSize() {
        return this.sizeToIntrinsics && this.painter.mo2255getIntrinsicSizeNHjbRc() != 9205357640488583168L;
    }

    /* JADX INFO: renamed from: hasSpecifiedAndFiniteHeight-uvyYCjk, reason: not valid java name */
    private final boolean m1741hasSpecifiedAndFiniteHeightuvyYCjk(long j2) {
        return !Size.m1866equalsimpl0(j2, Size.INSTANCE.m1874getUnspecifiedNHjbRc()) && (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j2 & BodyPartID.bodyIdMax))) & Integer.MAX_VALUE) < 2139095040;
    }

    /* JADX INFO: renamed from: hasSpecifiedAndFiniteWidth-uvyYCjk, reason: not valid java name */
    private final boolean m1742hasSpecifiedAndFiniteWidthuvyYCjk(long j2) {
        return !Size.m1866equalsimpl0(j2, Size.INSTANCE.m1874getUnspecifiedNHjbRc()) && (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j2 >> 32))) & Integer.MAX_VALUE) < 2139095040;
    }

    /* JADX INFO: renamed from: modifyConstraints-ZezNO4M, reason: not valid java name */
    private final long m1743modifyConstraintsZezNO4M(long constraints) {
        boolean z = false;
        boolean z3 = Constraints.m3275getHasBoundedWidthimpl(constraints) && Constraints.m3274getHasBoundedHeightimpl(constraints);
        if (Constraints.m3277getHasFixedWidthimpl(constraints) && Constraints.m3276getHasFixedHeightimpl(constraints)) {
            z = true;
        }
        if ((!getUseIntrinsicSize() && z3) || z) {
            return Constraints.m3271copyZbe2FdA$default(constraints, Constraints.m3279getMaxWidthimpl(constraints), 0, Constraints.m3278getMaxHeightimpl(constraints), 0, 10, null);
        }
        long jMo2255getIntrinsicSizeNHjbRc = this.painter.mo2255getIntrinsicSizeNHjbRc();
        int iRound = m1742hasSpecifiedAndFiniteWidthuvyYCjk(jMo2255getIntrinsicSizeNHjbRc) ? Math.round(Float.intBitsToFloat((int) (jMo2255getIntrinsicSizeNHjbRc >> 32))) : Constraints.m3281getMinWidthimpl(constraints);
        int iRound2 = m1741hasSpecifiedAndFiniteHeightuvyYCjk(jMo2255getIntrinsicSizeNHjbRc) ? Math.round(Float.intBitsToFloat((int) (jMo2255getIntrinsicSizeNHjbRc & BodyPartID.bodyIdMax))) : Constraints.m3280getMinHeightimpl(constraints);
        long jM1740calculateScaledSizeE7KxVPU = m1740calculateScaledSizeE7KxVPU(Size.m1862constructorimpl((((long) Float.floatToRawIntBits(ConstraintsKt.m3291constrainHeightK40F9xA(constraints, iRound2))) & BodyPartID.bodyIdMax) | (((long) Float.floatToRawIntBits(ConstraintsKt.m3292constrainWidthK40F9xA(constraints, iRound))) << 32)));
        return Constraints.m3271copyZbe2FdA$default(constraints, ConstraintsKt.m3292constrainWidthK40F9xA(constraints, Math.round(Float.intBitsToFloat((int) (jM1740calculateScaledSizeE7KxVPU >> 32)))), 0, ConstraintsKt.m3291constrainHeightK40F9xA(constraints, Math.round(Float.intBitsToFloat((int) (jM1740calculateScaledSizeE7KxVPU & BodyPartID.bodyIdMax)))), 0, 10, null);
    }

    @Override // androidx.compose.ui.node.DrawModifierNode
    public void draw(@NotNull ContentDrawScope contentDrawScope) {
        long jMo2255getIntrinsicSizeNHjbRc = this.painter.mo2255getIntrinsicSizeNHjbRc();
        float fIntBitsToFloat = m1742hasSpecifiedAndFiniteWidthuvyYCjk(jMo2255getIntrinsicSizeNHjbRc) ? Float.intBitsToFloat((int) (jMo2255getIntrinsicSizeNHjbRc >> 32)) : Float.intBitsToFloat((int) (contentDrawScope.mo2212getSizeNHjbRc() >> 32));
        long jM1862constructorimpl = Size.m1862constructorimpl((((long) Float.floatToRawIntBits(m1741hasSpecifiedAndFiniteHeightuvyYCjk(jMo2255getIntrinsicSizeNHjbRc) ? Float.intBitsToFloat((int) (jMo2255getIntrinsicSizeNHjbRc & BodyPartID.bodyIdMax)) : Float.intBitsToFloat((int) (contentDrawScope.mo2212getSizeNHjbRc() & BodyPartID.bodyIdMax)))) & BodyPartID.bodyIdMax) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32));
        long jM1875getZeroNHjbRc = (Float.intBitsToFloat((int) (contentDrawScope.mo2212getSizeNHjbRc() >> 32)) == BitmapDescriptorFactory.HUE_RED || Float.intBitsToFloat((int) (contentDrawScope.mo2212getSizeNHjbRc() & BodyPartID.bodyIdMax)) == BitmapDescriptorFactory.HUE_RED) ? Size.INSTANCE.m1875getZeroNHjbRc() : ScaleFactorKt.m2591timesUQTWf7w(jM1862constructorimpl, this.contentScale.mo2525computeScaleFactorH7hwNQA(jM1862constructorimpl, contentDrawScope.mo2212getSizeNHjbRc()));
        long jMo1721alignKFBX0sM = this.alignment.mo1721alignKFBX0sM(IntSize.m3351constructorimpl((((long) Math.round(Float.intBitsToFloat((int) (jM1875getZeroNHjbRc & BodyPartID.bodyIdMax)))) & BodyPartID.bodyIdMax) | (((long) Math.round(Float.intBitsToFloat((int) (jM1875getZeroNHjbRc >> 32)))) << 32)), IntSize.m3351constructorimpl((((long) Math.round(Float.intBitsToFloat((int) (contentDrawScope.mo2212getSizeNHjbRc() >> 32)))) << 32) | (((long) Math.round(Float.intBitsToFloat((int) (contentDrawScope.mo2212getSizeNHjbRc() & BodyPartID.bodyIdMax)))) & BodyPartID.bodyIdMax)), contentDrawScope.getLayoutDirection());
        float fM3334getXimpl = IntOffset.m3334getXimpl(jMo1721alignKFBX0sM);
        float fM3335getYimpl = IntOffset.m3335getYimpl(jMo1721alignKFBX0sM);
        contentDrawScope.getDrawContext().getTransform().translate(fM3334getXimpl, fM3335getYimpl);
        try {
            this.painter.m2260drawx_KDEd0(contentDrawScope, jM1875getZeroNHjbRc, this.alpha, this.colorFilter);
            contentDrawScope.getDrawContext().getTransform().translate(-fM3334getXimpl, -fM3335getYimpl);
            contentDrawScope.drawContent();
        } catch (Throwable th10) {
            contentDrawScope.getDrawContext().getTransform().translate(-fM3334getXimpl, -fM3335getYimpl);
            throw th10;
        }
    }

    @NotNull
    public final Painter getPainter() {
        return this.painter;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public boolean getShouldAutoInvalidate() {
        return false;
    }

    public final boolean getSizeToIntrinsics() {
        return this.sizeToIntrinsics;
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int maxIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull IntrinsicMeasurable intrinsicMeasurable, int i) {
        if (!getUseIntrinsicSize()) {
            return intrinsicMeasurable.maxIntrinsicHeight(i);
        }
        long jM1743modifyConstraintsZezNO4M = m1743modifyConstraintsZezNO4M(ConstraintsKt.Constraints$default(0, i, 0, 0, 13, null));
        return Math.max(Constraints.m3280getMinHeightimpl(jM1743modifyConstraintsZezNO4M), intrinsicMeasurable.maxIntrinsicHeight(i));
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int maxIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull IntrinsicMeasurable intrinsicMeasurable, int i) {
        if (!getUseIntrinsicSize()) {
            return intrinsicMeasurable.maxIntrinsicWidth(i);
        }
        long jM1743modifyConstraintsZezNO4M = m1743modifyConstraintsZezNO4M(ConstraintsKt.Constraints$default(0, 0, 0, i, 7, null));
        return Math.max(Constraints.m3281getMinWidthimpl(jM1743modifyConstraintsZezNO4M), intrinsicMeasurable.maxIntrinsicWidth(i));
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    @NotNull
    /* JADX INFO: renamed from: measure-3p2s80s */
    public MeasureResult mo543measure3p2s80s(@NotNull MeasureScope measureScope, @NotNull Measurable measurable, long j2) {
        Placeable placeableMo2530measureBRTryo0 = measurable.mo2530measureBRTryo0(m1743modifyConstraintsZezNO4M(j2));
        return MeasureScope.layout$default(measureScope, placeableMo2530measureBRTryo0.getWidth(), placeableMo2530measureBRTryo0.getHeight(), null, new PainterNode$measure$1(placeableMo2530measureBRTryo0), 4, null);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int minIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull IntrinsicMeasurable intrinsicMeasurable, int i) {
        if (!getUseIntrinsicSize()) {
            return intrinsicMeasurable.minIntrinsicHeight(i);
        }
        long jM1743modifyConstraintsZezNO4M = m1743modifyConstraintsZezNO4M(ConstraintsKt.Constraints$default(0, i, 0, 0, 13, null));
        return Math.max(Constraints.m3280getMinHeightimpl(jM1743modifyConstraintsZezNO4M), intrinsicMeasurable.minIntrinsicHeight(i));
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int minIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull IntrinsicMeasurable intrinsicMeasurable, int i) {
        if (!getUseIntrinsicSize()) {
            return intrinsicMeasurable.minIntrinsicWidth(i);
        }
        long jM1743modifyConstraintsZezNO4M = m1743modifyConstraintsZezNO4M(ConstraintsKt.Constraints$default(0, 0, 0, i, 7, null));
        return Math.max(Constraints.m3281getMinWidthimpl(jM1743modifyConstraintsZezNO4M), intrinsicMeasurable.minIntrinsicWidth(i));
    }

    public final void setAlignment(@NotNull Alignment alignment) {
        this.alignment = alignment;
    }

    public final void setAlpha(float f) {
        this.alpha = f;
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.colorFilter = colorFilter;
    }

    public final void setContentScale(@NotNull ContentScale contentScale) {
        this.contentScale = contentScale;
    }

    public final void setPainter(@NotNull Painter painter) {
        this.painter = painter;
    }

    public final void setSizeToIntrinsics(boolean z) {
        this.sizeToIntrinsics = z;
    }

    @NotNull
    public String toString() {
        return "PainterModifier(painter=" + this.painter + ", sizeToIntrinsics=" + this.sizeToIntrinsics + ", alignment=" + this.alignment + ", alpha=" + this.alpha + ", colorFilter=" + this.colorFilter + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
