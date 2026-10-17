package androidx.compose.ui.node;

import androidx.compose.ui.geometry.MutableRect;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.ReusableGraphicsLayerScope;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b`\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\f\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u0010\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\rH&¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0011H&¢\u0006\u0004\b\u0013\u0010\u000fJ!\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00152\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H&¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0004H&¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0004H&¢\u0006\u0004\b\u001d\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u0004H&¢\u0006\u0004\b\u001e\u0010\u001cJ\u001f\u0010#\u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u00072\u0006\u0010 \u001a\u00020\tH&¢\u0006\u0004\b!\u0010\"J\u001f\u0010&\u001a\u00020\u00042\u0006\u0010%\u001a\u00020$2\u0006\u0010 \u001a\u00020\tH&¢\u0006\u0004\b&\u0010'J9\u0010,\u001a\u00020\u00042\u001a\u0010)\u001a\u0016\u0012\u0004\u0012\u00020\u0015\u0012\u0006\u0012\u0004\u0018\u00010\u0017\u0012\u0004\u0012\u00020\u00040(2\f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00040*H&¢\u0006\u0004\b,\u0010-J\u0017\u00102\u001a\u00020\u00042\u0006\u0010/\u001a\u00020.H&¢\u0006\u0004\b0\u00101J\u0017\u00104\u001a\u00020\u00042\u0006\u0010/\u001a\u00020.H&¢\u0006\u0004\b3\u00101R\u0014\u00107\u001a\u00020.8&X¦\u0004¢\u0006\u0006\u001a\u0004\b5\u00106ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u00068À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/node/OwnedLayer;", "", "Landroidx/compose/ui/graphics/ReusableGraphicsLayerScope;", "scope", "", "updateLayerProperties", "(Landroidx/compose/ui/graphics/ReusableGraphicsLayerScope;)V", "Landroidx/compose/ui/geometry/Offset;", "position", "", "isInLayer-k-4lQ0M", "(J)Z", "isInLayer", "Landroidx/compose/ui/unit/IntOffset;", "move--gyyYBs", "(J)V", "move", "Landroidx/compose/ui/unit/IntSize;", "size", "resize-ozmzZPI", "resize", "Landroidx/compose/ui/graphics/Canvas;", "canvas", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "parentLayer", "drawLayer", "(Landroidx/compose/ui/graphics/Canvas;Landroidx/compose/ui/graphics/layer/GraphicsLayer;)V", "updateDisplayList", "()V", "invalidate", "destroy", "point", "inverse", "mapOffset-8S9VItk", "(JZ)J", "mapOffset", "Landroidx/compose/ui/geometry/MutableRect;", "rect", "mapBounds", "(Landroidx/compose/ui/geometry/MutableRect;Z)V", "Lkotlin/Function2;", "drawBlock", "Lkotlin/Function0;", "invalidateParentLayer", "reuseLayer", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;)V", "Landroidx/compose/ui/graphics/Matrix;", "matrix", "transform-58bKbWc", "([F)V", "transform", "inverseTransform-58bKbWc", "inverseTransform", "getUnderlyingMatrix-sQKQjiQ", "()[F", "underlyingMatrix", "ui"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface OwnedLayer {
    void destroy();

    void drawLayer(@NotNull Canvas canvas, GraphicsLayer parentLayer);

    @NotNull
    /* JADX INFO: renamed from: getUnderlyingMatrix-sQKQjiQ, reason: not valid java name */
    float[] mo2724getUnderlyingMatrixsQKQjiQ();

    void invalidate();

    /* JADX INFO: renamed from: inverseTransform-58bKbWc, reason: not valid java name */
    void mo2725inverseTransform58bKbWc(@NotNull float[] matrix);

    /* JADX INFO: renamed from: isInLayer-k-4lQ0M, reason: not valid java name */
    boolean mo2726isInLayerk4lQ0M(long position);

    void mapBounds(@NotNull MutableRect rect, boolean inverse);

    /* JADX INFO: renamed from: mapOffset-8S9VItk, reason: not valid java name */
    long mo2727mapOffset8S9VItk(long point, boolean inverse);

    /* JADX INFO: renamed from: move--gyyYBs, reason: not valid java name */
    void mo2728movegyyYBs(long position);

    /* JADX INFO: renamed from: resize-ozmzZPI, reason: not valid java name */
    void mo2729resizeozmzZPI(long size);

    void reuseLayer(@NotNull Function2<? super Canvas, ? super GraphicsLayer, Unit> drawBlock, @NotNull Function0<Unit> invalidateParentLayer);

    /* JADX INFO: renamed from: transform-58bKbWc, reason: not valid java name */
    void mo2730transform58bKbWc(@NotNull float[] matrix);

    void updateDisplayList();

    void updateLayerProperties(@NotNull ReusableGraphicsLayerScope scope);
}
