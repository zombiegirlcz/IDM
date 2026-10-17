package js0;

import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.revolut.core.ui_kit.views.navbar.NavBarScrollingViewBehavior;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class f {

    @NotNull
    public static final e Companion = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ViewGroup f178091a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f178092b;

    public f(View view, ViewGroup screenRoot) {
        Intrinsics.checkNotNullParameter(screenRoot, "screenRoot");
        Intrinsics.checkNotNullParameter(view, "view");
        this.f178091a = screenRoot;
        this.f178092b = view;
    }

    public final AppBarLayout a() {
        View childAt;
        ViewGroup viewGroup = this.f178091a;
        int childCount = viewGroup.getChildCount();
        int i = 0;
        while (true) {
            if (i >= childCount) {
                childAt = null;
                break;
            }
            childAt = viewGroup.getChildAt(i);
            Intrinsics.h(childAt);
            if (childAt instanceof AppBarLayout) {
                break;
            }
            i++;
        }
        if (childAt instanceof AppBarLayout) {
            return (AppBarLayout) childAt;
        }
        return null;
    }

    public final View b() {
        ViewGroup viewGroup = this.f178091a;
        int childCount = viewGroup.getChildCount();
        int i = 0;
        while (true) {
            if (i >= childCount) {
                return null;
            }
            View childAt = viewGroup.getChildAt(i);
            Intrinsics.h(childAt);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            CoordinatorLayout.LayoutParams layoutParams2 = layoutParams instanceof CoordinatorLayout.LayoutParams ? (CoordinatorLayout.LayoutParams) layoutParams : null;
            if ((layoutParams2 != null ? layoutParams2.getBehavior() : null) instanceof NavBarScrollingViewBehavior) {
                return childAt;
            }
            i++;
        }
    }
}
