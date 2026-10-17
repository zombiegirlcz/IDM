package androidx.compose.ui.draw;

import androidx.compose.ui.graphics.BlockGraphicsLayerModifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.Dp;
import ch.qos.logback.core.CoreConstants;
import com.revolut.data.database.models.openbanking.d;
import j6.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.u;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0011\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B/\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0013\u0010\u0019\u001a\u00020\u0010*\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\u00072\b\u0010\"\u001a\u0004\u0018\u00010!HÖ\u0003¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010(\u001a\u0004\b)\u0010*R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010+\u001a\u0004\b,\u0010-R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010.\u001a\u0004\b/\u00100R\u0017\u0010\u000b\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010.\u001a\u0004\b1\u00100¨\u00062"}, d2 = {"Landroidx/compose/ui/draw/ShadowGraphicsLayerElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/ui/graphics/BlockGraphicsLayerModifier;", "Landroidx/compose/ui/unit/Dp;", "elevation", "Landroidx/compose/ui/graphics/Shape;", "shape", "", "clip", "Landroidx/compose/ui/graphics/Color;", "ambientColor", "spotColor", "<init>", "(FLandroidx/compose/ui/graphics/Shape;ZJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/GraphicsLayerScope;", "", "createBlock", "()Lkotlin/jvm/functions/Function1;", "create", "()Landroidx/compose/ui/graphics/BlockGraphicsLayerModifier;", "node", "update", "(Landroidx/compose/ui/graphics/BlockGraphicsLayerModifier;)V", "Landroidx/compose/ui/platform/InspectorInfo;", "inspectableProperties", "(Landroidx/compose/ui/platform/InspectorInfo;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "F", "getElevation-D9Ej5fM", "()F", "Landroidx/compose/ui/graphics/Shape;", "getShape", "()Landroidx/compose/ui/graphics/Shape;", "Z", "getClip", "()Z", "J", "getAmbientColor-0d7_KjU", "()J", "getSpotColor-0d7_KjU", "ui"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ShadowGraphicsLayerElement extends ModifierNodeElement<BlockGraphicsLayerModifier> {
    private final long ambientColor;
    private final boolean clip;
    private final float elevation;

    @NotNull
    private final Shape shape;
    private final long spotColor;

    /* JADX INFO: renamed from: androidx.compose.ui.draw.ShadowGraphicsLayerElement$createBlock$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/graphics/GraphicsLayerScope;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class AnonymousClass1 extends u implements Function1<GraphicsLayerScope, Unit> {
        public AnonymousClass1() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
            invoke((GraphicsLayerScope) obj2);
            return Unit.f186387a;
        }

        public final void invoke(GraphicsLayerScope graphicsLayerScope) {
            graphicsLayerScope.setShadowElevation(graphicsLayerScope.mo768toPx0680j_4(ShadowGraphicsLayerElement.this.getElevation()));
            graphicsLayerScope.setShape(ShadowGraphicsLayerElement.this.getShape());
            graphicsLayerScope.setClip(ShadowGraphicsLayerElement.this.getClip());
            graphicsLayerScope.mo2029setAmbientShadowColor8_81llA(ShadowGraphicsLayerElement.this.getAmbientColor());
            graphicsLayerScope.mo2032setSpotShadowColor8_81llA(ShadowGraphicsLayerElement.this.getSpotColor());
        }
    }

    public /* synthetic */ ShadowGraphicsLayerElement(float f, Shape shape, boolean z, long j2, long j3, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, shape, z, j2, j3);
    }

    private final Function1<GraphicsLayerScope, Unit> createBlock() {
        return new AnonymousClass1();
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ShadowGraphicsLayerElement)) {
            return false;
        }
        ShadowGraphicsLayerElement shadowGraphicsLayerElement = (ShadowGraphicsLayerElement) other;
        return Dp.m3299equalsimpl0(this.elevation, shadowGraphicsLayerElement.elevation) && Intrinsics.f(this.shape, shadowGraphicsLayerElement.shape) && this.clip == shadowGraphicsLayerElement.clip && Color.m1978equalsimpl0(this.ambientColor, shadowGraphicsLayerElement.ambientColor) && Color.m1978equalsimpl0(this.spotColor, shadowGraphicsLayerElement.spotColor);
    }

    /* JADX INFO: renamed from: getAmbientColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getAmbientColor() {
        return this.ambientColor;
    }

    public final boolean getClip() {
        return this.clip;
    }

    /* JADX INFO: renamed from: getElevation-D9Ej5fM, reason: not valid java name and from getter */
    public final float getElevation() {
        return this.elevation;
    }

    @NotNull
    public final Shape getShape() {
        return this.shape;
    }

    /* JADX INFO: renamed from: getSpotColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getSpotColor() {
        return this.spotColor;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return Color.m1984hashCodeimpl(this.spotColor) + d.b(a.c((this.shape.hashCode() + (Dp.m3300hashCodeimpl(this.elevation) * 31)) * 31, 31, this.clip), 31, this.ambientColor);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(@NotNull InspectorInfo inspectorInfo) {
        inspectorInfo.setName("shadow");
        d.h(this.elevation, inspectorInfo.getProperties(), "elevation", inspectorInfo).set("shape", this.shape);
        inspectorInfo.getProperties().set("clip", Boolean.valueOf(this.clip));
        inspectorInfo.getProperties().set("ambientColor", Color.m1972boximpl(this.ambientColor));
        inspectorInfo.getProperties().set("spotColor", Color.m1972boximpl(this.spotColor));
    }

    @NotNull
    public String toString() {
        StringBuilder sb6 = new StringBuilder("ShadowGraphicsLayerElement(elevation=");
        d.z(this.elevation, ", shape=", sb6);
        sb6.append(this.shape);
        sb6.append(", clip=");
        sb6.append(this.clip);
        sb6.append(", ambientColor=");
        d.A(this.ambientColor, ", spotColor=", sb6);
        sb6.append((Object) Color.m1985toStringimpl(this.spotColor));
        sb6.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        return sb6.toString();
    }

    private ShadowGraphicsLayerElement(float f, Shape shape, boolean z, long j2, long j3) {
        this.elevation = f;
        this.shape = shape;
        this.clip = z;
        this.ambientColor = j2;
        this.spotColor = j3;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    @NotNull
    public BlockGraphicsLayerModifier create() {
        return new BlockGraphicsLayerModifier(createBlock());
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(@NotNull BlockGraphicsLayerModifier node) {
        node.setLayerBlock(createBlock());
        node.invalidateLayerBlock();
    }
}
