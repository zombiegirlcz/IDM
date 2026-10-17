package yr0;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class q {
    private q() {
    }

    public static ViewGroup a(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        while (!(view instanceof CoordinatorLayout) && (!(view instanceof FrameLayout) || ((FrameLayout) view).getId() != 16908290)) {
            ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
            Object parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
            if (view == null) {
                if (viewGroup != null) {
                    return viewGroup;
                }
                throw new IllegalArgumentException("No suitable parent found from the view. It must be either CoordinatorLayout or FrameLayout.");
            }
        }
        return (ViewGroup) view;
    }
}
