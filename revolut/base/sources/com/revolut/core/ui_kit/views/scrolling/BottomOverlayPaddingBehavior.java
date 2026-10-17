package com.revolut.core.ui_kit.views.scrolling;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import knm.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import mx0.tb;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u000bB!\b\u0007\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lcom/revolut/core/ui_kit/views/scrolling/BottomOverlayPaddingBehavior;", "Landroidx/coordinatorlayout/widget/CoordinatorLayout$Behavior;", "Landroid/view/View;", "Landroid/view/View$OnLayoutChangeListener;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Companion", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class BottomOverlayPaddingBehavior extends CoordinatorLayout.Behavior<View> implements View.OnLayoutChangeListener {

    @NotNull
    private static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public View f59640a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public View f59641b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public CoordinatorLayout f59642c;
    public final tb d;

    public static final class a {
        private a() {
        }
    }

    public BottomOverlayPaddingBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.d = new tb("BOTTOM_OVERLAY_PADDING_REQUEST_TOKEN");
    }

    public static View a(CoordinatorLayout coordinatorLayout) {
        View viewB;
        View childAt;
        View viewI;
        CoordinatorLayout coordinatorLayout2 = coordinatorLayout != null ? coordinatorLayout : null;
        if (coordinatorLayout2 != null && (viewI = s.i(coordinatorLayout2, new Class[]{NestedScrollView.class, RecyclerView.class}, "MAIN_SCROLLABLE_TAG")) != null) {
            return viewI;
        }
        int childCount = coordinatorLayout.getChildCount();
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i2 >= childCount) {
                viewB = null;
                break;
            }
            View childAt2 = coordinatorLayout.getChildAt(i2);
            ViewGroup.LayoutParams layoutParams = childAt2.getLayoutParams();
            CoordinatorLayout.LayoutParams layoutParams2 = layoutParams instanceof CoordinatorLayout.LayoutParams ? (CoordinatorLayout.LayoutParams) layoutParams : null;
            if (layoutParams2 != null && (layoutParams2.getBehavior() instanceof AppBarLayout.ScrollingViewBehavior) && (viewB = b(childAt2)) != null) {
                break;
            }
            i2++;
        }
        if (viewB != null) {
            return viewB;
        }
        int childCount2 = coordinatorLayout.getChildCount();
        while (true) {
            if (i >= childCount2) {
                childAt = null;
                break;
            }
            childAt = coordinatorLayout.getChildAt(i);
            if ((childAt instanceof RecyclerView) || (childAt instanceof NestedScrollView)) {
                break;
            }
            i++;
        }
        return childAt == null ? s.i(coordinatorLayout, new Class[]{NestedScrollView.class, RecyclerView.class}, null) : childAt;
    }

    public static View b(View view) {
        RecyclerView recyclerView = view instanceof RecyclerView ? (RecyclerView) view : null;
        if (recyclerView != null) {
            return recyclerView;
        }
        NestedScrollView nestedScrollView = view instanceof NestedScrollView ? (NestedScrollView) view : null;
        if (nestedScrollView != null) {
            return nestedScrollView;
        }
        ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
        if (viewGroup != null) {
            return s.i(viewGroup, new Class[]{NestedScrollView.class, RecyclerView.class}, null);
        }
        return null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean layoutDependsOn(CoordinatorLayout parent, View child, View dependency) {
        View viewB;
        View viewA;
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(child, "child");
        Intrinsics.checkNotNullParameter(dependency, "dependency");
        return ((dependency instanceof AppBarLayout) || (viewB = b(dependency)) == null || ((viewA = this.f59640a) == null && (viewA = a(parent)) == null) || viewB != viewA) ? false : true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final void onDetachedFromLayoutParams() {
        super.onDetachedFromLayoutParams();
        tb tbVar = this.d;
        View view = tbVar.f210022b;
        if (view != null) {
            view.removeOnLayoutChangeListener(this);
        }
        View view2 = this.f59641b;
        if (view2 != null) {
            view2.removeOnLayoutChangeListener(this);
        }
        CoordinatorLayout coordinatorLayout = this.f59642c;
        if (coordinatorLayout != null) {
            coordinatorLayout.removeOnLayoutChangeListener(this);
        }
        tbVar.c();
        tbVar.f210022b = null;
        tbVar.f210023c = 0;
        tbVar.d = 0;
        tbVar.e = true;
        this.f59640a = null;
        this.f59641b = null;
        this.f59642c = null;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View v, int i, int i2, int i3, int i5, int i6, int i21, int i22, int i32) {
        View child;
        tb tbVar;
        View view;
        int height;
        Intrinsics.checkNotNullParameter(v, "v");
        CoordinatorLayout coordinatorLayout = this.f59642c;
        if (coordinatorLayout == null || (child = this.f59641b) == null || (view = (tbVar = this.d).f210022b) == null) {
            return;
        }
        int iB = tbVar.b();
        Intrinsics.checkNotNullParameter(coordinatorLayout, "<this>");
        Intrinsics.checkNotNullParameter(child, "child");
        View view2 = child;
        do {
            height = 0;
            if (view2.getVisibility() != 0) {
                break;
            }
            Object parent = view2.getParent();
            view2 = parent instanceof View ? (View) parent : null;
            if (view2 == null) {
                break;
            }
        } while (view2 != coordinatorLayout);
        int iG = b.g(coordinatorLayout, child, false);
        if (((view.getHeight() + b.g(coordinatorLayout, view, false)) - iB) - iG > 0) {
            height = ((coordinatorLayout.getHeight() - coordinatorLayout.getPaddingBottom()) - iG) - iB;
        }
        tbVar.d(height);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean onLayoutChild(CoordinatorLayout parent, View child, int i) {
        tb tbVar;
        View view;
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(child, "child");
        this.f59640a = a(parent);
        if (this.f59642c != parent || this.f59641b != child) {
            View view2 = this.f59641b;
            if (view2 != null) {
                view2.removeOnLayoutChangeListener(this);
            }
            CoordinatorLayout coordinatorLayout = this.f59642c;
            if (coordinatorLayout != null) {
                coordinatorLayout.removeOnLayoutChangeListener(this);
            }
            this.f59642c = parent;
            this.f59641b = child;
            parent.addOnLayoutChangeListener(this);
            child.addOnLayoutChangeListener(this);
        }
        View view3 = this.f59640a;
        if (view3 != null && (view = (tbVar = this.d).f210022b) != view3) {
            if (view != null) {
                view.removeOnLayoutChangeListener(this);
            }
            tbVar.a(view3);
            view3.addOnLayoutChangeListener(this);
        }
        return super.onLayoutChild(parent, child, i);
    }

    public BottomOverlayPaddingBehavior() {
        this(null, null);
    }
}
