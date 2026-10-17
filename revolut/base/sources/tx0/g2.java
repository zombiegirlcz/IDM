package tx0;

import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.ViewGroupKt;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.views.navbar.NavBarScrollingViewBehavior;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class g2 implements ix0.a2, Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CoordinatorLayout f275138a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final au0.o f275139b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final RecyclerView f275140c;
    public final View d;
    public final int e;
    public final int[] f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f275141g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ NavBarScrollingViewBehavior f275142h;

    public g2(NavBarScrollingViewBehavior navBarScrollingViewBehavior, CoordinatorLayout parent, au0.o appBarLayout, RecyclerView recyclerView, View focusedView, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(appBarLayout, "appBarLayout");
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        Intrinsics.checkNotNullParameter(focusedView, "focusedView");
        this.f275142h = navBarScrollingViewBehavior;
        this.f275138a = parent;
        this.f275139b = appBarLayout;
        this.f275140c = recyclerView;
        this.d = focusedView;
        this.e = i;
        this.f = new int[2];
    }

    @Override // ix0.a2
    public final void cancel() {
        if (this.f275141g) {
            ix0.h1.e(this);
        }
        NavBarScrollingViewBehavior navBarScrollingViewBehavior = this.f275142h;
        if (Intrinsics.f(navBarScrollingViewBehavior.f59320b, this)) {
            navBarScrollingViewBehavior.f59320b = null;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object next;
        this.f275141g = false;
        View view = this.d;
        if (view.isAttachedToWindow() && view.isFocused()) {
            au0.o oVar = this.f275139b;
            if (oVar.f9292a >= 1.0f) {
                int[] iArr = this.f;
                int i = iArr[0];
                int i2 = iArr[1];
                view.getLocationInWindow(iArr);
                if (iArr[0] != i || i2 != iArr[1]) {
                    this.f275141g = true;
                    ix0.h1.d(100L, this);
                    return;
                }
                int[] iArr2 = new int[2];
                view.getLocationInWindow(iArr2);
                int height = view.getHeight() + iArr2[1];
                zhm.p.q(0, iArr2);
                CoordinatorLayout coordinatorLayout = this.f275138a;
                Iterator it8 = ViewGroupKt.getChildren(coordinatorLayout).iterator();
                while (true) {
                    if (!it8.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it8.next();
                    ViewGroup.LayoutParams layoutParams = ((View) next).getLayoutParams();
                    CoordinatorLayout.LayoutParams layoutParams2 = layoutParams instanceof CoordinatorLayout.LayoutParams ? (CoordinatorLayout.LayoutParams) layoutParams : null;
                    if (layoutParams2 != null && layoutParams2.gravity == 80) {
                        break;
                    }
                }
                View view2 = (View) next;
                int iIndexOfChild = coordinatorLayout.indexOfChild(view2);
                RecyclerView recyclerView = this.f275140c;
                View view3 = iIndexOfChild > coordinatorLayout.indexOfChild(recyclerView) ? view2 : null;
                if (view3 != null) {
                    view3.getLocationInWindow(iArr2);
                }
                int height2 = view.getRootView().getHeight() - this.e;
                if (view3 != null) {
                    height2 = iArr2[1];
                }
                int i3 = height - height2;
                if (i3 > 0) {
                    oVar.setExpanded(false, true);
                    recyclerView.smoothScrollBy(0, i3);
                    return;
                }
                return;
            }
        }
        cancel();
    }
}
