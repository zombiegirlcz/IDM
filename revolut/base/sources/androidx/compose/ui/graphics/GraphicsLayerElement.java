package androidx.compose.ui.graphics;

import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import ch.qos.logback.core.CoreConstants;
import com.revolut.data.database.models.openbanking.d;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import m72.b;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b!\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B£\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0018\u001a\u00020\u0016\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0002H\u0016¢\u0006\u0004\b!\u0010\"J\u0017\u0010%\u001a\u00020$2\u0006\u0010#\u001a\u00020\u0002H\u0016¢\u0006\u0004\b%\u0010&J\u0013\u0010(\u001a\u00020$*\u00020'H\u0016¢\u0006\u0004\b(\u0010)J\u0010\u0010+\u001a\u00020*HÖ\u0001¢\u0006\u0004\b+\u0010,J\u0010\u0010.\u001a\u00020-HÖ\u0001¢\u0006\u0004\b.\u0010/J\u001a\u00102\u001a\u00020\u00122\b\u00101\u001a\u0004\u0018\u000100HÖ\u0003¢\u0006\u0004\b2\u00103R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u00104\u001a\u0004\b5\u00106R\u0017\u0010\u0005\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0005\u00104\u001a\u0004\b7\u00106R\u0017\u0010\u0006\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0006\u00104\u001a\u0004\b8\u00106R\u0017\u0010\u0007\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0007\u00104\u001a\u0004\b9\u00106R\u0017\u0010\b\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\b\u00104\u001a\u0004\b:\u00106R\u0017\u0010\t\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\t\u00104\u001a\u0004\b;\u00106R\u0017\u0010\n\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\n\u00104\u001a\u0004\b<\u00106R\u0017\u0010\u000b\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u000b\u00104\u001a\u0004\b=\u00106R\u0017\u0010\f\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\f\u00104\u001a\u0004\b>\u00106R\u0017\u0010\r\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\r\u00104\u001a\u0004\b?\u00106R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010@\u001a\u0004\bA\u0010BR\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010C\u001a\u0004\bD\u0010ER\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010F\u001a\u0004\bG\u0010HR\u0017\u0010\u0017\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u0010@\u001a\u0004\bI\u0010BR\u0017\u0010\u0018\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b\u0018\u0010@\u001a\u0004\bJ\u0010BR\u0017\u0010\u001a\u001a\u00020\u00198\u0006¢\u0006\f\n\u0004\b\u001a\u0010K\u001a\u0004\bL\u0010/R\u0017\u0010\u001c\u001a\u00020\u001b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010K\u001a\u0004\bM\u0010/R\u0019\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0006¢\u0006\f\n\u0004\b\u001e\u0010N\u001a\u0004\bO\u0010P¨\u0006Q"}, d2 = {"Landroidx/compose/ui/graphics/GraphicsLayerElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/ui/graphics/SimpleGraphicsLayerModifier;", "", "scaleX", "scaleY", "alpha", "translationX", "translationY", "shadowElevation", "rotationX", "rotationY", "rotationZ", "cameraDistance", "Landroidx/compose/ui/graphics/TransformOrigin;", "transformOrigin", "Landroidx/compose/ui/graphics/Shape;", "shape", "", "clip", "Landroidx/compose/ui/graphics/RenderEffect;", "renderEffect", "Landroidx/compose/ui/graphics/Color;", "ambientShadowColor", "spotShadowColor", "Landroidx/compose/ui/graphics/CompositingStrategy;", "compositingStrategy", "Landroidx/compose/ui/graphics/BlendMode;", "blendMode", "Landroidx/compose/ui/graphics/ColorFilter;", "colorFilter", "<init>", "(FFFFFFFFFFJLandroidx/compose/ui/graphics/Shape;ZLandroidx/compose/ui/graphics/RenderEffect;JJIILandroidx/compose/ui/graphics/ColorFilter;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "create", "()Landroidx/compose/ui/graphics/SimpleGraphicsLayerModifier;", "node", "", "update", "(Landroidx/compose/ui/graphics/SimpleGraphicsLayerModifier;)V", "Landroidx/compose/ui/platform/InspectorInfo;", "inspectableProperties", "(Landroidx/compose/ui/platform/InspectorInfo;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "F", "getScaleX", "()F", "getScaleY", "getAlpha", "getTranslationX", "getTranslationY", "getShadowElevation", "getRotationX", "getRotationY", "getRotationZ", "getCameraDistance", "J", "getTransformOrigin-SzJe1aQ", "()J", "Landroidx/compose/ui/graphics/Shape;", "getShape", "()Landroidx/compose/ui/graphics/Shape;", "Z", "getClip", "()Z", "getAmbientShadowColor-0d7_KjU", "getSpotShadowColor-0d7_KjU", "I", "getCompositingStrategy--NrFUSI", "getBlendMode-0nO6VwU", "Landroidx/compose/ui/graphics/ColorFilter;", "getColorFilter", "()Landroidx/compose/ui/graphics/ColorFilter;", "ui"}, k = 1, mv = {2, 0, 0}, xi = 48)
final /* data */ class GraphicsLayerElement extends ModifierNodeElement<SimpleGraphicsLayerModifier> {
    private final float alpha;
    private final long ambientShadowColor;
    private final int blendMode;
    private final float cameraDistance;
    private final boolean clip;
    private final ColorFilter colorFilter;
    private final int compositingStrategy;
    private final float rotationX;
    private final float rotationY;
    private final float rotationZ;
    private final float scaleX;
    private final float scaleY;
    private final float shadowElevation;

    @NotNull
    private final Shape shape;
    private final long spotShadowColor;
    private final long transformOrigin;
    private final float translationX;
    private final float translationY;

    public /* synthetic */ GraphicsLayerElement(float f, float f4, float f5, float f6, float f32, float f35, float f36, float f37, float f41, float f42, long j2, Shape shape, boolean z, RenderEffect renderEffect, long j3, long j5, int i, int i2, ColorFilter colorFilter, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, f4, f5, f6, f32, f35, f36, f37, f41, f42, j2, shape, z, renderEffect, j3, j5, i, i2, colorFilter);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GraphicsLayerElement)) {
            return false;
        }
        GraphicsLayerElement graphicsLayerElement = (GraphicsLayerElement) other;
        return Float.compare(this.scaleX, graphicsLayerElement.scaleX) == 0 && Float.compare(this.scaleY, graphicsLayerElement.scaleY) == 0 && Float.compare(this.alpha, graphicsLayerElement.alpha) == 0 && Float.compare(this.translationX, graphicsLayerElement.translationX) == 0 && Float.compare(this.translationY, graphicsLayerElement.translationY) == 0 && Float.compare(this.shadowElevation, graphicsLayerElement.shadowElevation) == 0 && Float.compare(this.rotationX, graphicsLayerElement.rotationX) == 0 && Float.compare(this.rotationY, graphicsLayerElement.rotationY) == 0 && Float.compare(this.rotationZ, graphicsLayerElement.rotationZ) == 0 && Float.compare(this.cameraDistance, graphicsLayerElement.cameraDistance) == 0 && TransformOrigin.m2135equalsimpl0(this.transformOrigin, graphicsLayerElement.transformOrigin) && Intrinsics.f(this.shape, graphicsLayerElement.shape) && this.clip == graphicsLayerElement.clip && Color.m1978equalsimpl0(this.ambientShadowColor, graphicsLayerElement.ambientShadowColor) && Color.m1978equalsimpl0(this.spotShadowColor, graphicsLayerElement.spotShadowColor) && CompositingStrategy.m2011equalsimpl0(this.compositingStrategy, graphicsLayerElement.compositingStrategy) && BlendMode.m1923equalsimpl0(this.blendMode, graphicsLayerElement.blendMode) && Intrinsics.f(this.colorFilter, graphicsLayerElement.colorFilter);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        int iM1924hashCodeimpl = (BlendMode.m1924hashCodeimpl(this.blendMode) + ((CompositingStrategy.m2012hashCodeimpl(this.compositingStrategy) + d.b(d.b(j6.a.c((this.shape.hashCode() + ((TransformOrigin.m2138hashCodeimpl(this.transformOrigin) + b.b(this.cameraDistance, b.b(this.rotationZ, b.b(this.rotationY, b.b(this.rotationX, b.b(this.shadowElevation, b.b(this.translationY, b.b(this.translationX, b.b(this.alpha, b.b(this.scaleY, Float.hashCode(this.scaleX) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31)) * 31)) * 31, 961, this.clip), 31, this.ambientShadowColor), 31, this.spotShadowColor)) * 31)) * 31;
        ColorFilter colorFilter = this.colorFilter;
        return iM1924hashCodeimpl + (colorFilter == null ? 0 : colorFilter.hashCode());
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(@NotNull InspectorInfo inspectorInfo) {
        inspectorInfo.setName("graphicsLayer");
        inspectorInfo.getProperties().set("scaleX", Float.valueOf(this.scaleX));
        inspectorInfo.getProperties().set("scaleY", Float.valueOf(this.scaleY));
        inspectorInfo.getProperties().set("alpha", Float.valueOf(this.alpha));
        inspectorInfo.getProperties().set("translationX", Float.valueOf(this.translationX));
        inspectorInfo.getProperties().set("translationY", Float.valueOf(this.translationY));
        inspectorInfo.getProperties().set("shadowElevation", Float.valueOf(this.shadowElevation));
        inspectorInfo.getProperties().set("rotationX", Float.valueOf(this.rotationX));
        inspectorInfo.getProperties().set("rotationY", Float.valueOf(this.rotationY));
        inspectorInfo.getProperties().set("rotationZ", Float.valueOf(this.rotationZ));
        inspectorInfo.getProperties().set("cameraDistance", Float.valueOf(this.cameraDistance));
        inspectorInfo.getProperties().set("transformOrigin", TransformOrigin.m2132boximpl(this.transformOrigin));
        inspectorInfo.getProperties().set("shape", this.shape);
        inspectorInfo.getProperties().set("clip", Boolean.valueOf(this.clip));
        inspectorInfo.getProperties().set("renderEffect", null);
        inspectorInfo.getProperties().set("ambientShadowColor", Color.m1972boximpl(this.ambientShadowColor));
        inspectorInfo.getProperties().set("spotShadowColor", Color.m1972boximpl(this.spotShadowColor));
        inspectorInfo.getProperties().set("compositingStrategy", CompositingStrategy.m2008boximpl(this.compositingStrategy));
        inspectorInfo.getProperties().set("blendMode", BlendMode.m1920boximpl(this.blendMode));
        inspectorInfo.getProperties().set("colorFilter", this.colorFilter);
    }

    @NotNull
    public String toString() {
        StringBuilder sb6 = new StringBuilder("GraphicsLayerElement(scaleX=");
        sb6.append(this.scaleX);
        sb6.append(", scaleY=");
        sb6.append(this.scaleY);
        sb6.append(", alpha=");
        sb6.append(this.alpha);
        sb6.append(", translationX=");
        sb6.append(this.translationX);
        sb6.append(", translationY=");
        sb6.append(this.translationY);
        sb6.append(", shadowElevation=");
        sb6.append(this.shadowElevation);
        sb6.append(", rotationX=");
        sb6.append(this.rotationX);
        sb6.append(", rotationY=");
        sb6.append(this.rotationY);
        sb6.append(", rotationZ=");
        sb6.append(this.rotationZ);
        sb6.append(", cameraDistance=");
        sb6.append(this.cameraDistance);
        sb6.append(", transformOrigin=");
        sb6.append((Object) TransformOrigin.m2139toStringimpl(this.transformOrigin));
        sb6.append(", shape=");
        sb6.append(this.shape);
        sb6.append(", clip=");
        sb6.append(this.clip);
        sb6.append(", renderEffect=null, ambientShadowColor=");
        d.A(this.ambientShadowColor, ", spotShadowColor=", sb6);
        d.A(this.spotShadowColor, ", compositingStrategy=", sb6);
        sb6.append((Object) CompositingStrategy.m2013toStringimpl(this.compositingStrategy));
        sb6.append(", blendMode=");
        sb6.append((Object) BlendMode.m1925toStringimpl(this.blendMode));
        sb6.append(", colorFilter=");
        sb6.append(this.colorFilter);
        sb6.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        return sb6.toString();
    }

    private GraphicsLayerElement(float f, float f4, float f5, float f6, float f32, float f35, float f36, float f37, float f41, float f42, long j2, Shape shape, boolean z, RenderEffect renderEffect, long j3, long j5, int i, int i2, ColorFilter colorFilter) {
        this.scaleX = f;
        this.scaleY = f4;
        this.alpha = f5;
        this.translationX = f6;
        this.translationY = f32;
        this.shadowElevation = f35;
        this.rotationX = f36;
        this.rotationY = f37;
        this.rotationZ = f41;
        this.cameraDistance = f42;
        this.transformOrigin = j2;
        this.shape = shape;
        this.clip = z;
        this.ambientShadowColor = j3;
        this.spotShadowColor = j5;
        this.compositingStrategy = i;
        this.blendMode = i2;
        this.colorFilter = colorFilter;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    @NotNull
    public SimpleGraphicsLayerModifier create() {
        return new SimpleGraphicsLayerModifier(this.scaleX, this.scaleY, this.alpha, this.translationX, this.translationY, this.shadowElevation, this.rotationX, this.rotationY, this.rotationZ, this.cameraDistance, this.transformOrigin, this.shape, this.clip, null, this.ambientShadowColor, this.spotShadowColor, this.compositingStrategy, this.blendMode, this.colorFilter, null);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(@NotNull SimpleGraphicsLayerModifier node) {
        node.setScaleX(this.scaleX);
        node.setScaleY(this.scaleY);
        node.setAlpha(this.alpha);
        node.setTranslationX(this.translationX);
        node.setTranslationY(this.translationY);
        node.setShadowElevation(this.shadowElevation);
        node.setRotationX(this.rotationX);
        node.setRotationY(this.rotationY);
        node.setRotationZ(this.rotationZ);
        node.setCameraDistance(this.cameraDistance);
        node.m2108setTransformOrigin__ExYCQ(this.transformOrigin);
        node.setShape(this.shape);
        node.setClip(this.clip);
        node.setRenderEffect(null);
        node.m2104setAmbientShadowColor8_81llA(this.ambientShadowColor);
        node.m2107setSpotShadowColor8_81llA(this.spotShadowColor);
        node.m2106setCompositingStrategyaDBOjCE(this.compositingStrategy);
        node.m2105setBlendModes9anfk8(this.blendMode);
        node.setColorFilter(this.colorFilter);
        node.invalidateLayerBlock();
    }
}
