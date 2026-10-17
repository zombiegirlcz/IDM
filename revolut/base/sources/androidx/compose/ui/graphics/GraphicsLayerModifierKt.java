package androidx.compose.ui.graphics;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectableValueKt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import yhm.d;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a¿\u0001\u0010\u001b\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u00012\b\b\u0002\u0010\u0006\u001a\u00020\u00012\b\b\u0002\u0010\u0007\u001a\u00020\u00012\b\b\u0002\u0010\b\u001a\u00020\u00012\b\b\u0002\u0010\t\u001a\u00020\u00012\b\b\u0002\u0010\n\u001a\u00020\u00012\b\b\u0002\u0010\u000b\u001a\u00020\u00012\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0016\u001a\u00020\u00142\b\b\u0002\u0010\u0018\u001a\u00020\u0017H\u0007¢\u0006\u0004\b\u0019\u0010\u001a\u001aÕ\u0001\u0010\u001b\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u00012\b\b\u0002\u0010\u0006\u001a\u00020\u00012\b\b\u0002\u0010\u0007\u001a\u00020\u00012\b\b\u0002\u0010\b\u001a\u00020\u00012\b\b\u0002\u0010\t\u001a\u00020\u00012\b\b\u0002\u0010\n\u001a\u00020\u00012\b\b\u0002\u0010\u000b\u001a\u00020\u00012\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0016\u001a\u00020\u00142\b\b\u0002\u0010\u0018\u001a\u00020\u00172\b\b\u0002\u0010\u001d\u001a\u00020\u001c2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0007¢\u0006\u0004\b \u0010!\u001a'\u0010\u001b\u001a\u00020\u0000*\u00020\u00002\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020$0\"H\u0007¢\u0006\u0004\b\u001b\u0010&\u001a\u0013\u0010'\u001a\u00020\u0000*\u00020\u0000H\u0007¢\u0006\u0004\b'\u0010(\"\u0018\u0010*\u001a\u0004\u0018\u00010)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+¨\u0006,"}, d2 = {"Landroidx/compose/ui/Modifier;", "", "scaleX", "scaleY", "alpha", "translationX", "translationY", "shadowElevation", "rotationX", "rotationY", "rotationZ", "cameraDistance", "Landroidx/compose/ui/graphics/TransformOrigin;", "transformOrigin", "Landroidx/compose/ui/graphics/Shape;", "shape", "", "clip", "Landroidx/compose/ui/graphics/RenderEffect;", "renderEffect", "Landroidx/compose/ui/graphics/Color;", "ambientShadowColor", "spotShadowColor", "Landroidx/compose/ui/graphics/CompositingStrategy;", "compositingStrategy", "graphicsLayer-Ap8cVGQ", "(Landroidx/compose/ui/Modifier;FFFFFFFFFFJLandroidx/compose/ui/graphics/Shape;ZLandroidx/compose/ui/graphics/RenderEffect;JJI)Landroidx/compose/ui/Modifier;", "graphicsLayer", "Landroidx/compose/ui/graphics/BlendMode;", "blendMode", "Landroidx/compose/ui/graphics/ColorFilter;", "colorFilter", "graphicsLayer-_6ThJ44", "(Landroidx/compose/ui/Modifier;FFFFFFFFFFJLandroidx/compose/ui/graphics/Shape;ZLandroidx/compose/ui/graphics/RenderEffect;JJIILandroidx/compose/ui/graphics/ColorFilter;)Landroidx/compose/ui/Modifier;", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/GraphicsLayerScope;", "", "block", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;", "toolingGraphicsLayer", "(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/graphics/ReusableGraphicsLayerScope;", "reusableGraphicsLayerScope", "Landroidx/compose/ui/graphics/ReusableGraphicsLayerScope;", "ui"}, k = 2, mv = {2, 0, 0}, xi = 48)
public abstract class GraphicsLayerModifierKt {
    private static ReusableGraphicsLayerScope reusableGraphicsLayerScope;

    @NotNull
    public static final Modifier graphicsLayer(@NotNull Modifier modifier, @NotNull Function1<? super GraphicsLayerScope, Unit> function1) {
        return modifier.then(new BlockGraphicsLayerElement(function1));
    }

    @d
    /* JADX INFO: renamed from: graphicsLayer-Ap8cVGQ, reason: not valid java name */
    public static final /* synthetic */ Modifier m2024graphicsLayerAp8cVGQ(Modifier modifier, float f, float f4, float f5, float f6, float f32, float f35, float f36, float f37, float f41, float f42, long j2, Shape shape, boolean z, RenderEffect renderEffect, long j3, long j5, int i) {
        return m2026graphicsLayer_6ThJ44(modifier, f, f4, f5, f6, f32, f35, f36, f37, f41, f42, j2, shape, z, renderEffect, j3, j5, i, BlendMode.INSTANCE.m1954getSrcOver0nO6VwU(), null);
    }

    /* JADX INFO: renamed from: graphicsLayer-Ap8cVGQ$default, reason: not valid java name */
    public static /* synthetic */ Modifier m2025graphicsLayerAp8cVGQ$default(Modifier modifier, float f, float f4, float f5, float f6, float f32, float f35, float f36, float f37, float f41, float f42, long j2, Shape shape, boolean z, RenderEffect renderEffect, long j3, long j5, int i, int i2, Object obj2) {
        float f57 = (i2 & 1) != 0 ? 1.0f : f;
        float f69 = (i2 & 2) != 0 ? 1.0f : f4;
        float f75 = (i2 & 4) == 0 ? f5 : 1.0f;
        int i3 = i2 & 8;
        float f77 = BitmapDescriptorFactory.HUE_RED;
        float f81 = i3 != 0 ? 0.0f : f6;
        float f82 = (i2 & 16) != 0 ? 0.0f : f32;
        float f93 = (i2 & 32) != 0 ? 0.0f : f35;
        float f94 = (i2 & 64) != 0 ? 0.0f : f36;
        float f99 = (i2 & 128) != 0 ? 0.0f : f37;
        if ((i2 & 256) == 0) {
            f77 = f41;
        }
        return m2024graphicsLayerAp8cVGQ(modifier, f57, f69, f75, f81, f82, f93, f94, f99, f77, (i2 & 512) != 0 ? 8.0f : f42, (i2 & 1024) != 0 ? TransformOrigin.INSTANCE.m2141getCenterSzJe1aQ() : j2, (i2 & 2048) != 0 ? RectangleShapeKt.getRectangleShape() : shape, (i2 & 4096) != 0 ? false : z, (i2 & 8192) != 0 ? null : renderEffect, (i2 & 16384) != 0 ? GraphicsLayerScopeKt.getDefaultShadowColor() : j3, (32768 & i2) != 0 ? GraphicsLayerScopeKt.getDefaultShadowColor() : j5, (i2 & 65536) != 0 ? CompositingStrategy.INSTANCE.m2015getAutoNrFUSI() : i);
    }

    @NotNull
    /* JADX INFO: renamed from: graphicsLayer-_6ThJ44, reason: not valid java name */
    public static final Modifier m2026graphicsLayer_6ThJ44(@NotNull Modifier modifier, float f, float f4, float f5, float f6, float f32, float f35, float f36, float f37, float f41, float f42, long j2, @NotNull Shape shape, boolean z, RenderEffect renderEffect, long j3, long j5, int i, int i2, ColorFilter colorFilter) {
        return modifier.then(new GraphicsLayerElement(f, f4, f5, f6, f32, f35, f36, f37, f41, f42, j2, shape, z, renderEffect, j3, j5, i, i2, colorFilter, null));
    }

    /* JADX INFO: renamed from: graphicsLayer-_6ThJ44$default, reason: not valid java name */
    public static /* synthetic */ Modifier m2027graphicsLayer_6ThJ44$default(Modifier modifier, float f, float f4, float f5, float f6, float f32, float f35, float f36, float f37, float f41, float f42, long j2, Shape shape, boolean z, RenderEffect renderEffect, long j3, long j5, int i, int i2, ColorFilter colorFilter, int i3, Object obj2) {
        float f57 = (i3 & 1) != 0 ? 1.0f : f;
        float f69 = (i3 & 2) != 0 ? 1.0f : f4;
        float f75 = (i3 & 4) == 0 ? f5 : 1.0f;
        int i5 = i3 & 8;
        float f77 = BitmapDescriptorFactory.HUE_RED;
        float f81 = i5 != 0 ? 0.0f : f6;
        float f82 = (i3 & 16) != 0 ? 0.0f : f32;
        float f93 = (i3 & 32) != 0 ? 0.0f : f35;
        float f94 = (i3 & 64) != 0 ? 0.0f : f36;
        float f99 = (i3 & 128) != 0 ? 0.0f : f37;
        if ((i3 & 256) == 0) {
            f77 = f41;
        }
        return m2026graphicsLayer_6ThJ44(modifier, f57, f69, f75, f81, f82, f93, f94, f99, f77, (i3 & 512) != 0 ? 8.0f : f42, (i3 & 1024) != 0 ? TransformOrigin.INSTANCE.m2141getCenterSzJe1aQ() : j2, (i3 & 2048) != 0 ? RectangleShapeKt.getRectangleShape() : shape, (i3 & 4096) != 0 ? false : z, (i3 & 8192) != 0 ? null : renderEffect, (i3 & 16384) != 0 ? GraphicsLayerScopeKt.getDefaultShadowColor() : j3, (32768 & i3) != 0 ? GraphicsLayerScopeKt.getDefaultShadowColor() : j5, (65536 & i3) != 0 ? CompositingStrategy.INSTANCE.m2015getAutoNrFUSI() : i, (i3 & 131072) != 0 ? BlendMode.INSTANCE.m1954getSrcOver0nO6VwU() : i2, (i3 & 262144) != 0 ? null : colorFilter);
    }

    @NotNull
    public static final Modifier toolingGraphicsLayer(@NotNull Modifier modifier) {
        return InspectableValueKt.isDebugInspectorInfoEnabled() ? modifier.then(m2027graphicsLayer_6ThJ44$default(Modifier.INSTANCE, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 0L, null, false, null, 0L, 0L, 0, 0, null, 524287, null)) : modifier;
    }
}
