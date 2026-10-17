package androidx.compose.ui.graphics.vector;

import androidx.compose.ui.graphics.vector.PathNode;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0004\u001a\u00020\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\t\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\nJ\u001d\u0010\u000e\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0006¢\u0006\u0004\b\u000e\u0010\nJ\u0015\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0011\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u0006¢\u0006\u0004\b\u0011\u0010\u0010J=\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0006¢\u0006\u0004\b\u0018\u0010\u0019J=\u0010 \u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u0006¢\u0006\u0004\b \u0010\u0019J-\u0010!\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0006¢\u0006\u0004\b!\u0010\"J-\u0010#\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u0006¢\u0006\u0004\b#\u0010\"R$\u0010'\u001a\u0012\u0012\u0004\u0012\u00020%0$j\b\u0012\u0004\u0012\u00020%`&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0017\u0010,\u001a\b\u0012\u0004\u0012\u00020%0)8F¢\u0006\u0006\u001a\u0004\b*\u0010+¨\u0006-"}, d2 = {"Landroidx/compose/ui/graphics/vector/PathBuilder;", "", "<init>", "()V", "close", "()Landroidx/compose/ui/graphics/vector/PathBuilder;", "", "x", "y", "moveTo", "(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;", "lineTo", "dx", "dy", "lineToRelative", "horizontalLineTo", "(F)Landroidx/compose/ui/graphics/vector/PathBuilder;", "verticalLineToRelative", "x1", "y1", "x2", "y2", "x3", "y3", "curveTo", "(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;", "dx1", "dy1", "dx2", "dy2", "dx3", "dy3", "curveToRelative", "reflectiveCurveTo", "(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;", "reflectiveCurveToRelative", "Ljava/util/ArrayList;", "Landroidx/compose/ui/graphics/vector/PathNode;", "Lkotlin/collections/ArrayList;", "_nodes", "Ljava/util/ArrayList;", "", "getNodes", "()Ljava/util/List;", "nodes", "ui-graphics"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PathBuilder {

    @NotNull
    private final ArrayList<PathNode> _nodes = new ArrayList<>(32);

    @NotNull
    public final PathBuilder close() {
        this._nodes.add(PathNode.Close.INSTANCE);
        return this;
    }

    @NotNull
    public final PathBuilder curveTo(float x110, float y110, float x210, float y2, float x3, float y34) {
        this._nodes.add(new PathNode.CurveTo(x110, y110, x210, y2, x3, y34));
        return this;
    }

    @NotNull
    public final PathBuilder curveToRelative(float dx12, float dy12, float dx22, float dy22, float dx32, float dy32) {
        this._nodes.add(new PathNode.RelativeCurveTo(dx12, dy12, dx22, dy22, dx32, dy32));
        return this;
    }

    @NotNull
    public final List<PathNode> getNodes() {
        return this._nodes;
    }

    @NotNull
    public final PathBuilder horizontalLineTo(float x3) {
        this._nodes.add(new PathNode.HorizontalTo(x3));
        return this;
    }

    @NotNull
    public final PathBuilder lineTo(float x3, float y2) {
        this._nodes.add(new PathNode.LineTo(x3, y2));
        return this;
    }

    @NotNull
    public final PathBuilder lineToRelative(float dx9, float dy10) {
        this._nodes.add(new PathNode.RelativeLineTo(dx9, dy10));
        return this;
    }

    @NotNull
    public final PathBuilder moveTo(float x3, float y2) {
        this._nodes.add(new PathNode.MoveTo(x3, y2));
        return this;
    }

    @NotNull
    public final PathBuilder reflectiveCurveTo(float x110, float y110, float x210, float y2) {
        this._nodes.add(new PathNode.ReflectiveCurveTo(x110, y110, x210, y2));
        return this;
    }

    @NotNull
    public final PathBuilder reflectiveCurveToRelative(float dx12, float dy12, float dx22, float dy22) {
        this._nodes.add(new PathNode.RelativeReflectiveCurveTo(dx12, dy12, dx22, dy22));
        return this;
    }

    @NotNull
    public final PathBuilder verticalLineToRelative(float dy10) {
        this._nodes.add(new PathNode.RelativeVerticalTo(dy10));
        return this;
    }
}
