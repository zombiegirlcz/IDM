package com.revolut.core.ui_kit.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.NestedScrollingChild;
import androidx.core.view.NestedScrollingChildHelper;
import androidx.core.view.ViewGroupKt;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import mx0.a7;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u001b\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0005\u0010\tB#\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0005\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/revolut/core/ui_kit/views/NestedScrollCoordinatorView;", "Landroidx/coordinatorlayout/widget/CoordinatorLayout;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "enabled", "", "setNestedScrollingEnabled", "(Z)V", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@yhm.d
public final class NestedScrollCoordinatorView extends CoordinatorLayout implements NestedScrollingChild {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f58791b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final NestedScrollingChildHelper f58792a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NestedScrollCoordinatorView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f58792a = new NestedScrollingChildHelper(this);
        setNestedScrollingEnabled(true);
    }

    public static View a(ViewGroup viewGroup, List list, Function1 function1) {
        View viewA;
        Iterator it8 = ViewGroupKt.getChildren(viewGroup).iterator();
        do {
            viewA = null;
            if (!it8.hasNext()) {
                break;
            }
            View view = (View) it8.next();
            List list2 = list;
            if ((list2 instanceof Collection) && list2.isEmpty()) {
                ViewGroup viewGroup2 = view instanceof ViewGroup ? (ViewGroup) view : null;
                if (viewGroup2 != null) {
                    viewA = a(viewGroup2, list, function1);
                }
            } else {
                Iterator it9 = list2.iterator();
                while (true) {
                    if (!it9.hasNext()) {
                        break;
                    }
                    if (((Class) it9.next()).isAssignableFrom(view.getClass())) {
                        if (function1 == null || ((Boolean) function1.invoke(view)).booleanValue()) {
                            viewA = view;
                        }
                    }
                }
            }
        } while (viewA == null);
        return viewA;
    }

    @Override // android.view.View
    public final boolean canScrollVertically(int i) {
        View viewA = a(this, zhm.u.c(au0.o.class), null);
        au0.o oVar = viewA instanceof au0.o ? (au0.o) viewA : null;
        View viewA2 = a(this, zhm.v.k(RecyclerView.class, NestedScrollView.class), new a7(this, 5));
        return (oVar == null || viewA2 == null) ? super.canScrollVertically(i) : oVar.o(i) || viewA2.canScrollVertically(i);
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f, float f4, boolean z) {
        return this.f58792a.dispatchNestedFling(f, f4, z);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f, float f4) {
        return this.f58792a.dispatchNestedPreFling(f, f4);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return this.f58792a.dispatchNestedPreScroll(i, i2, iArr, iArr2, 0);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i, int i2, int i3, int i5, int[] iArr) {
        return this.f58792a.dispatchNestedScroll(i, i2, i3, i5, iArr);
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return this.f58792a.hasNestedScrollingParent();
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.f58792a.isNestedScrollingEnabled();
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View target, float f, float f4, boolean z) {
        Intrinsics.checkNotNullParameter(target, "target");
        return this.f58792a.dispatchNestedFling(f, f4, z) || super.onNestedFling(target, f, f4, z);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View target, float f, float f4) {
        Intrinsics.checkNotNullParameter(target, "target");
        return this.f58792a.dispatchNestedPreFling(f, f4) || super.onNestedPreFling(target, f, f4);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View target, int i, int i2, int[] consumed) {
        Intrinsics.checkNotNullParameter(target, "target");
        Intrinsics.checkNotNullParameter(consumed, "consumed");
        dispatchNestedPreScroll(i, i2, consumed, null);
        if (consumed[1] == 0) {
            super.onNestedPreScroll(target, i, i2, consumed, 0);
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout, androidx.core.view.NestedScrollingParent2
    public final void onNestedScroll(View target, int i, int i2, int i3, int i5, int i6) {
        Intrinsics.checkNotNullParameter(target, "target");
        super.onNestedScroll(target, i, i2, i3, i5, i6);
        this.f58792a.dispatchNestedScroll(i, i2, i3, i5, null, i6);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout, androidx.core.view.NestedScrollingParent2
    public final boolean onStartNestedScroll(View child, View target, int i, int i2) {
        Intrinsics.checkNotNullParameter(child, "child");
        Intrinsics.checkNotNullParameter(target, "target");
        return this.f58792a.startNestedScroll(i, i2) || super.onStartNestedScroll(child, target, i, i2);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout, androidx.core.view.NestedScrollingParent2
    public final void onStopNestedScroll(View target, int i) {
        Intrinsics.checkNotNullParameter(target, "target");
        super.onStopNestedScroll(target, i);
        this.f58792a.stopNestedScroll(i);
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean enabled) {
        this.f58792a.setNestedScrollingEnabled(enabled);
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i) {
        return this.f58792a.startNestedScroll(i);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        this.f58792a.stopNestedScroll();
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View target, int i, int i2, int i3, int i5) {
        Intrinsics.checkNotNullParameter(target, "target");
        super.onNestedScroll(target, i, i2, i3, i5);
        dispatchNestedScroll(i, i2, i3, i5, null);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View child, View target, int i) {
        Intrinsics.checkNotNullParameter(child, "child");
        Intrinsics.checkNotNullParameter(target, "target");
        return this.f58792a.startNestedScroll(i) || super.onStartNestedScroll(child, target, i);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View target) {
        Intrinsics.checkNotNullParameter(target, "target");
        super.onStopNestedScroll(target);
        stopNestedScroll();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NestedScrollCoordinatorView(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f58792a = new NestedScrollingChildHelper(this);
        setNestedScrollingEnabled(true);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout, androidx.core.view.NestedScrollingParent2
    public final void onNestedPreScroll(View target, int i, int i2, int[] consumed, int i3) {
        Intrinsics.checkNotNullParameter(target, "target");
        Intrinsics.checkNotNullParameter(consumed, "consumed");
        this.f58792a.dispatchNestedPreScroll(i, i2, consumed, null, i3);
        if (consumed[1] == 0) {
            super.onNestedPreScroll(target, i, i2, consumed, i3);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NestedScrollCoordinatorView(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f58792a = new NestedScrollingChildHelper(this);
        setNestedScrollingEnabled(true);
    }
}
