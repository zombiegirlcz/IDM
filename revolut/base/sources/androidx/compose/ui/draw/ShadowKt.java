package androidx.compose.ui.draw;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.GraphicsLayerScopeKt;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001aC\u0010\f\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/unit/Dp;", "elevation", "Landroidx/compose/ui/graphics/Shape;", "shape", "", "clip", "Landroidx/compose/ui/graphics/Color;", "ambientColor", "spotColor", "shadow-s4CzXII", "(Landroidx/compose/ui/Modifier;FLandroidx/compose/ui/graphics/Shape;ZJJ)Landroidx/compose/ui/Modifier;", "shadow", "ui"}, k = 2, mv = {2, 0, 0}, xi = 48)
public abstract class ShadowKt {
    @NotNull
    /* JADX INFO: renamed from: shadow-s4CzXII, reason: not valid java name */
    public static final Modifier m1747shadows4CzXII(@NotNull Modifier modifier, float f, @NotNull Shape shape, boolean z, long j2, long j3) {
        return (Dp.m3296compareTo0680j_4(f, Dp.m3297constructorimpl((float) 0)) > 0 || z) ? modifier.then(new ShadowGraphicsLayerElement(f, shape, z, j2, j3, null)) : modifier;
    }

    /* JADX INFO: renamed from: shadow-s4CzXII$default, reason: not valid java name */
    public static /* synthetic */ Modifier m1748shadows4CzXII$default(Modifier modifier, float f, Shape shape, boolean z, long j2, long j3, int i, Object obj2) {
        boolean z3;
        Shape rectangleShape = (i & 2) != 0 ? RectangleShapeKt.getRectangleShape() : shape;
        if ((i & 4) != 0) {
            z3 = false;
            if (Dp.m3296compareTo0680j_4(f, Dp.m3297constructorimpl(0)) > 0) {
                z3 = true;
            }
        } else {
            z3 = z;
        }
        return m1747shadows4CzXII(modifier, f, rectangleShape, z3, (i & 8) != 0 ? GraphicsLayerScopeKt.getDefaultShadowColor() : j2, (i & 16) != 0 ? GraphicsLayerScopeKt.getDefaultShadowColor() : j3);
    }
}
