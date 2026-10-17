package androidx.transition;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import iv0.m;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0005H\u0007J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0007J\u0018\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0007J0\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u0005H\u0007J \u0010\u0016\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u0005H\u0007J\u0018\u0010\u0017\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u0005H\u0007J\u0018\u0010\u0019\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0007J\u0016\u0010\u001e\u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\u00072\u0006\u0010 \u001a\u00020\u001dJ\u0016\u0010!\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\"\u001a\u00020#J\u000e\u0010$\u001a\u00020#2\u0006\u0010\u000b\u001a\u00020\f¨\u0006%"}, d2 = {"Landroidx/transition/RevTransitionUtils;", "", "<init>", "()V", "getChildDrawingOrder", "", "viewGroup", "Landroid/view/ViewGroup;", "i", "transformMatrixToGlobal", "", "view", "Landroid/view/View;", "matrix", "Landroid/graphics/Matrix;", "transformMatrixToLocal", "setLeftTopRightBottom", "v", "left", "top", "right", "bottom", "setTopBottom", "setTransitionVisibility", "visibility", "enableZ", "canvas", "Landroid/graphics/Canvas;", "enable", "", "suppressLayout", "group", "suppress", "setTransitionAlpha", "alpha", "", "getTransitionAlpha", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class RevTransitionUtils {

    @NotNull
    public static final RevTransitionUtils INSTANCE = new RevTransitionUtils();

    private RevTransitionUtils() {
    }

    public static final void enableZ(@NotNull Canvas canvas, boolean enable) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        int i = Build.VERSION.SDK_INT;
        if (i != 28) {
            if (i < 29) {
                try {
                    CanvasUtils.enableZ(canvas, enable);
                } catch (Exception unused) {
                }
            } else if (enable) {
                canvas.enableZ();
            } else {
                canvas.disableZ();
            }
        }
    }

    public static final int getChildDrawingOrder(@NotNull ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "viewGroup");
        return ViewGroupUtils.getChildDrawingOrder(viewGroup, i);
    }

    public static final void setLeftTopRightBottom(@NotNull View v, int left, int top, int right, int bottom) {
        Intrinsics.checkNotNullParameter(v, "v");
        ViewUtils.setLeftTopRightBottom(v, left, top, right, bottom);
        boolean z = v instanceof m;
        Object obj2 = v;
        if (!z) {
            obj2 = null;
        }
        m mVar = (m) obj2;
        if (mVar != null) {
            mVar.a();
        }
    }

    public static final void setTopBottom(@NotNull View v, int top, int bottom) {
        Intrinsics.checkNotNullParameter(v, "v");
        setLeftTopRightBottom(v, v.getLeft(), top, v.getRight(), bottom);
    }

    public static final void setTransitionVisibility(@NotNull View view, int visibility) {
        Intrinsics.checkNotNullParameter(view, "view");
        ViewUtils.setTransitionVisibility(view, visibility);
    }

    public static final void transformMatrixToGlobal(@NotNull View view, @NotNull Matrix matrix) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(matrix, "matrix");
        ViewUtils.transformMatrixToGlobal(view, matrix);
    }

    public static final void transformMatrixToLocal(@NotNull View view, @NotNull Matrix matrix) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(matrix, "matrix");
        ViewUtils.transformMatrixToLocal(view, matrix);
    }

    public final float getTransitionAlpha(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        return ViewUtils.getTransitionAlpha(view);
    }

    public final void setTransitionAlpha(@NotNull View view, float alpha) {
        Intrinsics.checkNotNullParameter(view, "view");
        ViewUtils.setTransitionAlpha(view, alpha);
    }

    public final void suppressLayout(@NotNull ViewGroup group, boolean suppress) {
        Intrinsics.checkNotNullParameter(group, "group");
        ViewGroupUtils.suppressLayout(group, suppress);
    }
}
