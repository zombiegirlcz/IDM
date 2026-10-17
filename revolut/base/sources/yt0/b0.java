package yt0;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.internal.views.navbar.CollapsingAppBarLayout$Behavior;
import com.revolut.core.ui_kit.views.navbar.NavBarScrollingViewBehavior;
import ix0.i1;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class b0 {

    @NotNull
    public static final y Companion = new y();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.revolut.core.ui_kit.views.o f316518a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final yq0.e f316519b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final yea.l f316520c;
    public RecyclerView d;
    public au0.o e;
    public NavBarScrollingViewBehavior f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f316521g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f316522h;
    public ValueAnimator i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final z f316523j;
    public final w k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final a0 f316524l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final x f316525m;

    /* JADX WARN: Type inference failed for: r2v3, types: [yt0.w] */
    public b0(com.revolut.core.ui_kit.views.o modalView, yq0.e bottomSheetBehavior, yea.l onProgressChanged) {
        Intrinsics.checkNotNullParameter(modalView, "modalView");
        Intrinsics.checkNotNullParameter(bottomSheetBehavior, "bottomSheetBehavior");
        Intrinsics.checkNotNullParameter(onProgressChanged, "onProgressChanged");
        this.f316518a = modalView;
        this.f316519b = bottomSheetBehavior;
        this.f316520c = onProgressChanged;
        this.f316521g = true;
        this.f316523j = new z(this);
        this.k = new au0.m() { // from class: yt0.w
            @Override // au0.m
            public final void a(float f) {
                b0 b0Var = this.f316604a;
                b0Var.f316520c.invoke(Float.valueOf(i1.b(b0Var.a(), 1.0f, b0Var.f316522h)));
            }
        };
        this.f316524l = new a0(this);
        this.f316525m = new x(this);
    }

    public final float a() {
        au0.o oVar = this.e;
        if (oVar == null) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        float expandRatio = oVar.getExpandRatio();
        Integer reflectiveSurfaceCollapsedHeight$ui_kit_components_release = oVar.getReflectiveSurfaceCollapsedHeight$ui_kit_components_release();
        if (reflectiveSurfaceCollapsedHeight$ui_kit_components_release == null) {
            return kotlin.ranges.f.f(1.0f - expandRatio, BitmapDescriptorFactory.HUE_RED, 1.0f);
        }
        int totalScrollRange = oVar.getTotalScrollRange();
        int iIntValue = totalScrollRange - reflectiveSurfaceCollapsedHeight$ui_kit_components_release.intValue();
        return iIntValue <= 0 ? BitmapDescriptorFactory.HUE_RED : kotlin.ranges.f.f(((1.0f - expandRatio) * totalScrollRange) / iIntValue, BitmapDescriptorFactory.HUE_RED, 1.0f);
    }

    public final void b() {
        WeakReference weakReference;
        au0.o oVar;
        Integer reflectiveSurfaceCollapsedHeight$ui_kit_components_release;
        RecyclerView recyclerView = this.d;
        if ((recyclerView == null || recyclerView.getScrollState() == 0) && this.f316521g) {
            float fA = a();
            if (fA == BitmapDescriptorFactory.HUE_RED || fA == 1.0f) {
                return;
            }
            if (fA < 0.5f) {
                NavBarScrollingViewBehavior navBarScrollingViewBehavior = this.f;
                if (navBarScrollingViewBehavior != null) {
                    navBarScrollingViewBehavior.f(true);
                    return;
                }
                return;
            }
            au0.o oVar2 = this.e;
            if (oVar2 != null) {
                if (oVar2.f.indexOfValue(true) >= 0) {
                    oVar2 = null;
                }
                if (oVar2 == null) {
                    return;
                }
                CollapsingAppBarLayout$Behavior currentBehaviourOrNull$ui_kit_components_release = oVar2.getCurrentBehaviourOrNull$ui_kit_components_release();
                if (currentBehaviourOrNull$ui_kit_components_release != null && (weakReference = currentBehaviourOrNull$ui_kit_components_release.f57238a) != null && (oVar = (au0.o) weakReference.get()) != null && (reflectiveSurfaceCollapsedHeight$ui_kit_components_release = oVar.getReflectiveSurfaceCollapsedHeight$ui_kit_components_release()) != null) {
                    int iIntValue = reflectiveSurfaceCollapsedHeight$ui_kit_components_release.intValue();
                    if (oVar.getTotalScrollRange() > 0) {
                        currentBehaviourOrNull$ui_kit_components_release.d(kotlin.ranges.f.f(iIntValue / oVar.getTotalScrollRange(), BitmapDescriptorFactory.HUE_RED, 1.0f));
                        return;
                    }
                }
                oVar2.setExpanded(false, true);
            }
        }
    }

    public final void c(RecyclerView recyclerView) {
        if (Intrinsics.f(this.d, recyclerView)) {
            return;
        }
        RecyclerView recyclerView2 = this.d;
        z zVar = this.f316523j;
        if (recyclerView2 != null) {
            recyclerView2.removeOnScrollListener(zVar);
        }
        this.d = recyclerView;
        NavBarScrollingViewBehavior navBarScrollingViewBehavior = null;
        if (recyclerView != null) {
            View view = recyclerView;
            while (true) {
                if (view == null) {
                    break;
                }
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                CoordinatorLayout.LayoutParams layoutParams2 = layoutParams instanceof CoordinatorLayout.LayoutParams ? (CoordinatorLayout.LayoutParams) layoutParams : null;
                if ((layoutParams2 != null ? layoutParams2.getBehavior() : null) instanceof NavBarScrollingViewBehavior) {
                    CoordinatorLayout.Behavior behavior = layoutParams2.getBehavior();
                    Intrinsics.i(behavior, "null cannot be cast to non-null type com.revolut.core.ui_kit.views.navbar.NavBarScrollingViewBehavior");
                    navBarScrollingViewBehavior = (NavBarScrollingViewBehavior) behavior;
                    break;
                }
                Object parent = view.getParent();
                view = parent instanceof View ? (View) parent : null;
            }
        }
        this.f = navBarScrollingViewBehavior;
        if (recyclerView != null) {
            recyclerView.addOnScrollListener(zVar);
        }
    }
}
