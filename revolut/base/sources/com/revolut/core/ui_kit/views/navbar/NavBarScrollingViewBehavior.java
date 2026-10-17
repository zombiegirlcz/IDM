package com.revolut.core.ui_kit.views.navbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.appbar.AppBarLayout;
import com.revolut.core.ui_kit.internal.views.navbar.CollapsingAppBarLayout$Behavior;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import tx0.f2;
import tx0.g2;
import tx0.h2;
import tx0.i2;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0017\u0018\u00002\u00020\u0001:\u0002\t\nB\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003B\u0019\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0002\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/revolut/core/ui_kit/views/navbar/NavBarScrollingViewBehavior;", "Lcom/google/android/material/appbar/AppBarLayout$ScrollingViewBehavior;", "<init>", "()V", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "a", "tx0/g2", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public class NavBarScrollingViewBehavior extends AppBarLayout.ScrollingViewBehavior {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public f2 f59319a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public g2 f59320b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f59321c;
    public WeakReference d;
    public WeakReference e;
    public final a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public h2 f59322g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final tw0.l f59323h;
    public Object i;

    public static final class a extends RecyclerView.OnScrollListener implements RecyclerView.OnChildAttachStateChangeListener, au0.m {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f59324a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public au0.o f59325b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public RecyclerView f59326c;
        public WeakReference d;

        public static void b(View view) {
            RecyclerView recyclerView;
            RecyclerView.LayoutManager layoutManager;
            if ((view instanceof RecyclerView) && (layoutManager = (recyclerView = (RecyclerView) view).getLayoutManager()) != null && layoutManager.canScrollVertically()) {
                RecyclerView.LayoutManager layoutManager2 = recyclerView.getLayoutManager();
                LinearLayoutManager linearLayoutManager = layoutManager2 instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager2 : null;
                if (linearLayoutManager == null || linearLayoutManager.findFirstCompletelyVisibleItemPosition() == 0) {
                    return;
                }
                linearLayoutManager.scrollToPositionWithOffset(0, 0);
                return;
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = viewGroup.getChildAt(i);
                    Intrinsics.checkNotNullExpressionValue(childAt, "getChildAt(...)");
                    b(childAt);
                }
            }
        }

        @Override // au0.m
        public final void a(float f) {
            boolean z = this.f59324a;
            boolean z3 = f > BitmapDescriptorFactory.HUE_RED;
            this.f59324a = z3;
            if (!z3 || z) {
                return;
            }
            au0.o oVar = this.f59325b;
            RecyclerView recyclerView = this.f59326c;
            if (oVar == null || recyclerView == null || !oVar.o(1)) {
                return;
            }
            b(recyclerView);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnChildAttachStateChangeListener
        public final void onChildViewAttachedToWindow(View view) {
            Intrinsics.checkNotNullParameter(view, "view");
            au0.o oVar = this.f59325b;
            RecyclerView recyclerView = this.f59326c;
            if (oVar == null || recyclerView == null || !oVar.o(1)) {
                return;
            }
            b(recyclerView);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnChildAttachStateChangeListener
        public final void onChildViewDetachedFromWindow(View view) {
            Intrinsics.checkNotNullParameter(view, "view");
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
            View viewF;
            View target;
            Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
            if (i != 0 || (viewF = kotlin.jvm.internal.s.f(recyclerView)) == null || (target = i2.a(viewF)) == null) {
                return;
            }
            au0.o oVar = this.f59325b;
            if (oVar != null) {
                Intrinsics.checkNotNullParameter(target, "target");
                oVar.p(target);
                CollapsingAppBarLayout$Behavior currentBehaviourOrNull$ui_kit_components_release = oVar.getCurrentBehaviourOrNull$ui_kit_components_release();
                if (currentBehaviourOrNull$ui_kit_components_release != null) {
                    Intrinsics.checkNotNullParameter(target, "target");
                    currentBehaviourOrNull$ui_kit_components_release.b(target);
                }
            }
            WeakReference weakReference = this.d;
            if (target.equals(weakReference != null ? (View) weakReference.get() : null)) {
                return;
            }
            this.d = new WeakReference(target);
            au0.o oVar2 = this.f59325b;
            if (oVar2 != null) {
                oVar2.requestLayout();
            }
        }
    }

    public NavBarScrollingViewBehavior() {
        this.f = new a();
        this.f59323h = new tw0.l(0);
    }

    public static int b(View view, ViewGroup container) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(container, "container");
        return view.getPaddingBottom() + view.getPaddingTop() + container.getPaddingBottom() + container.getPaddingTop() + (view instanceof RecyclerView ? ((RecyclerView) view).computeVerticalScrollRange() : view instanceof NestedScrollView ? c((NestedScrollView) view) : 0);
    }

    public static int c(NestedScrollView nestedScrollView) {
        int childCount = nestedScrollView.getChildCount();
        int height = (nestedScrollView.getHeight() - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop();
        if (childCount == 0) {
            return height;
        }
        View childAt = nestedScrollView.getChildAt(0);
        Intrinsics.checkNotNullExpressionValue(childAt, "getChildAt(...)");
        ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
        Intrinsics.i(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) layoutParams).bottomMargin;
        int scrollY = nestedScrollView.getScrollY();
        int iMax = Math.max(0, bottom - height);
        return scrollY < 0 ? bottom - scrollY : scrollY > iMax ? (scrollY - iMax) + bottom : bottom;
    }

    public int a(View parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return (parent.getHeight() - parent.getPaddingBottom()) - parent.getPaddingTop();
    }

    public final boolean d() {
        WeakReference weakReference = this.e;
        View view = weakReference != null ? (View) weakReference.get() : null;
        RecyclerView recyclerView = view instanceof RecyclerView ? (RecyclerView) view : null;
        WeakReference weakReference2 = this.d;
        au0.o oVar = weakReference2 != null ? (au0.o) weakReference2.get() : null;
        if (oVar == null) {
            return true;
        }
        this.f59323h.getClass();
        return tw0.l.a(recyclerView, oVar);
    }

    public final void e(RecyclerView recyclerView, au0.o appBarLayout, boolean z) {
        tw0.l lVar = this.f59323h;
        if (z) {
            lVar.getClass();
            Intrinsics.checkNotNullParameter(appBarLayout, "appBarLayout");
            if (tw0.l.a(recyclerView, appBarLayout)) {
                return;
            }
            appBarLayout.setExpanded(true, true);
            if (recyclerView != null) {
                tw0.v vVar = lVar.f274831a;
                vVar.getClass();
                Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
                vVar.a(recyclerView, 0);
                return;
            }
            return;
        }
        lVar.getClass();
        Intrinsics.checkNotNullParameter(appBarLayout, "appBarLayout");
        if (tw0.l.a(recyclerView, appBarLayout)) {
            return;
        }
        appBarLayout.setExpanded(true, false);
        if (recyclerView != null) {
            lVar.f274831a.getClass();
            Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
            recyclerView.stopScroll();
            RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
            if (layoutManager instanceof LinearLayoutManager) {
                ((LinearLayoutManager) layoutManager).scrollToPositionWithOffset(0, 0);
            } else {
                recyclerView.scrollToPosition(0);
            }
        }
    }

    public final void f(boolean z) {
        au0.o oVar;
        au0.o oVar2;
        CollapsingAppBarLayout$Behavior currentBehaviourOrNull$ui_kit_components_release;
        RecyclerView.LayoutManager layoutManager;
        WeakReference weakReference = this.d;
        if (weakReference == null || (oVar = (au0.o) weakReference.get()) == null) {
            return;
        }
        WeakReference weakReference2 = this.e;
        RecyclerView recyclerView = null;
        View view = weakReference2 != null ? (View) weakReference2.get() : null;
        RecyclerView recyclerView2 = view instanceof RecyclerView ? (RecyclerView) view : null;
        if ((recyclerView2 == null || (layoutManager = recyclerView2.getLayoutManager()) == null) ? false : layoutManager.canScrollVertically()) {
            e(recyclerView2, oVar, z);
            return;
        }
        WeakReference weakReference3 = this.d;
        if (weakReference3 != null && (oVar2 = (au0.o) weakReference3.get()) != null && (currentBehaviourOrNull$ui_kit_components_release = oVar2.getCurrentBehaviourOrNull$ui_kit_components_release()) != null) {
            WeakReference weakReference4 = currentBehaviourOrNull$ui_kit_components_release.f57240c;
            View view2 = weakReference4 != null ? (View) weakReference4.get() : null;
            if (view2 instanceof RecyclerView) {
                recyclerView = (RecyclerView) view2;
            }
        }
        e(recyclerView, oVar, z);
    }

    public final void g(RecyclerView horizontalRecycler, au0.o appBarLayout) {
        RecyclerView.LayoutManager layoutManager = horizontalRecycler.getLayoutManager();
        if (layoutManager == null || !layoutManager.getF53278a()) {
            return;
        }
        a listener = this.f;
        listener.getClass();
        Intrinsics.checkNotNullParameter(appBarLayout, "appBarLayout");
        Intrinsics.checkNotNullParameter(horizontalRecycler, "horizontalRecycler");
        listener.f59325b = appBarLayout;
        listener.f59326c = horizontalRecycler;
        Intrinsics.checkNotNullParameter(listener, "listener");
        appBarLayout.f9295g.add(listener);
        horizontalRecycler.addOnChildAttachStateChangeListener(listener);
        horizontalRecycler.addOnScrollListener(listener);
    }

    /* JADX WARN: Code restructure failed: missing block: B:69:0x014f, code lost:
    
        if (r5 != 0) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0162, code lost:
    
        if (r4.getChildCount() != 0) goto L77;
     */
    /* JADX WARN: Removed duplicated region for block: B:136:0x025a  */
    /* JADX WARN: Type inference failed for: r0v4, types: [ix0.a2, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [tx0.f2] */
    @Override // com.google.android.material.appbar.AppBarLayout.ScrollingViewBehavior, com.google.android.material.appbar.ViewOffsetBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onLayoutChild(final androidx.coordinatorlayout.widget.CoordinatorLayout r8, final android.view.View r9, int r10) {
        /*
            Method dump skipped, instruction units count: 680
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.core.ui_kit.views.navbar.NavBarScrollingViewBehavior.onLayoutChild(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, int):boolean");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavBarScrollingViewBehavior(@NotNull Context context, @NotNull AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        this.f = new a();
        this.f59323h = new tw0.l(0);
    }
}
