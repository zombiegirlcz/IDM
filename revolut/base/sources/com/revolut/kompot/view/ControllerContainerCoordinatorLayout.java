package com.revolut.kompot.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PointF;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.ViewCompat;
import androidx.lifecycle.Lifecycle;
import androidx.recyclerview.widget.RecyclerView;
import hli.c;
import hli.e;
import java.util.List;
import jo0.g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import ny0.h;
import ny0.k;
import org.jetbrains.annotations.NotNull;
import pp0.a;
import pp0.b;
import ro0.q;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B'\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0000H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0011\u0010\u0014\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0018\u0010\u0017R\u0014\u0010\u001c\u001a\u00020\u00198VX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u001c\u0010 \u001a\u00020\u00198\u0016@\u0016X\u0096\u000f¢\u0006\f\u001a\u0004\b\u001d\u0010\u001b\"\u0004\b\u001e\u0010\u001fR\u001c\u0010#\u001a\u00020\u00198\u0016@\u0016X\u0096\u000f¢\u0006\f\u001a\u0004\b!\u0010\u001b\"\u0004\b\"\u0010\u001fR\u001c\u0010)\u001a\u00020$8\u0016@\u0016X\u0096\u000f¢\u0006\f\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u0014\u0010+\u001a\u00020\u00198\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b*\u0010\u001bR\u0016\u0010/\u001a\u0004\u0018\u00010,8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b-\u0010.R\u0016\u00103\u001a\u0004\u0018\u0001008\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b1\u00102¨\u00064"}, d2 = {"Lcom/revolut/kompot/view/ControllerContainerCoordinatorLayout;", "Landroidx/coordinatorlayout/widget/CoordinatorLayout;", "Lhli/e;", "Lpp0/a;", "Lny0/h;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "getSelf", "()Lcom/revolut/kompot/view/ControllerContainerCoordinatorLayout;", "Lpp0/b;", "delegate", "", "setDrawingDelegate", "(Lpp0/b;)V", "getDrawingDelegate", "()Lpp0/b;", "getViewWidth", "()I", "getViewHeight", "", "getFitsReadableArea", "()Z", "fitsReadableArea", "getFitStatusBar", "setFitStatusBar", "(Z)V", "fitStatusBar", "getFitNavigationBar", "setFitNavigationBar", "fitNavigationBar", "", "getContainerId", "()Ljava/lang/String;", "setContainerId", "(Ljava/lang/String;)V", "containerId", "getControllersTransitionActive", "controllersTransitionActive", "Landroid/view/WindowInsets;", "getLatestAppliedInsets", "()Landroid/view/WindowInsets;", "latestAppliedInsets", "Landroid/graphics/PointF;", "getLatestDispatchedDownEvent", "()Landroid/graphics/PointF;", "latestDispatchedDownEvent", "kompot_ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public class ControllerContainerCoordinatorLayout extends CoordinatorLayout implements e, a, h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ hli.h f98448a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f98449b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public b f98450c;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ControllerContainerCoordinatorLayout(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // hli.e
    public final void J(SparseArray outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        this.f98448a.i = true;
        dispatchSaveInstanceState(outState);
    }

    @Override // hli.e
    public final void J0() {
        this.f98448a.e = null;
    }

    @Override // hli.e
    public final void N0() {
        this.f98448a.e = null;
    }

    @Override // pp0.a
    public final void U(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.dispatchDraw(canvas);
    }

    @Override // hli.e
    public final c W(Lifecycle controllerLifecycle) {
        Intrinsics.checkNotNullParameter(controllerLifecycle, "controllerLifecycle");
        return this.f98448a.W(controllerLifecycle);
    }

    @Override // pp0.a
    public final boolean Z(Canvas canvas, View child, long j2) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(child, "child");
        return super.drawChild(canvas, child, j2);
    }

    @Override // hli.e
    public final void c0(boolean z) {
        this.f98448a.c0(z);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        b bVar = this.f98450c;
        if (bVar != null) {
            ((q) bVar).a(canvas);
        } else {
            super.dispatchDraw(canvas);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray container) {
        Intrinsics.checkNotNullParameter(container, "container");
        if (this.f98448a.c()) {
            super.dispatchRestoreInstanceState(container);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchSaveInstanceState(SparseArray container) {
        Intrinsics.checkNotNullParameter(container, "container");
        if (this.f98448a.c()) {
            super.dispatchSaveInstanceState(container);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent ev10) {
        Intrinsics.checkNotNullParameter(ev10, "ev");
        Intrinsics.checkNotNullParameter(this, "containerView");
        Intrinsics.checkNotNullParameter(ev10, "ev");
        return this.f98448a.b(ev10, this) || super.dispatchTouchEvent(ev10);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View child, long j2) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(child, "child");
        b bVar = this.f98450c;
        return bVar != null ? ((q) bVar).b(canvas, child, j2) : super.drawChild(canvas, child, j2);
    }

    @Override // hli.e
    public final void e(SparseArray state) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.f98448a.i = true;
        dispatchRestoreInstanceState(state);
    }

    @Override // hli.e
    @NotNull
    public String getContainerId() {
        return this.f98448a.d;
    }

    @Override // hli.e
    public boolean getControllersTransitionActive() {
        return this.f98448a.getControllersTransitionActive();
    }

    @Override // pp0.a
    /* JADX INFO: renamed from: getDrawingDelegate, reason: from getter */
    public b getF98447g() {
        return this.f98450c;
    }

    @Override // hli.e
    public boolean getFitNavigationBar() {
        return this.f98448a.f153473c;
    }

    @Override // hli.e
    public boolean getFitStatusBar() {
        return this.f98448a.f153472b;
    }

    @Override // hli.e, ny0.h
    public boolean getFitsReadableArea() {
        this.f98448a.getClass();
        return false;
    }

    @Override // hli.e
    public WindowInsets getLatestAppliedInsets() {
        return this.f98448a.f153474g;
    }

    @Override // hli.e
    public PointF getLatestDispatchedDownEvent() {
        return this.f98448a.f153475h;
    }

    @Override // pp0.a
    @NotNull
    public ControllerContainerCoordinatorLayout getSelf() {
        return this;
    }

    @Override // pp0.a
    public int getViewHeight() {
        return getHeight();
    }

    @Override // pp0.a
    public int getViewWidth() {
        return getWidth();
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets insets) {
        Intrinsics.checkNotNullParameter(insets, "insets");
        Intrinsics.checkNotNullParameter(this, "controllerContainer");
        Intrinsics.checkNotNullParameter(insets, "insets");
        return this.f98448a.a(this, insets);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        Intrinsics.checkNotNullParameter(this, "containerView");
        this.f98448a.getClass();
        Intrinsics.checkNotNullParameter(this, "containerView");
        ViewCompat.requestApplyInsets(this);
        super.onAttachedToWindow();
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        RecyclerView recyclerView;
        int measuredHeight;
        this.f98449b.b(i);
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (mode != Integer.MIN_VALUE) {
            super.onMeasure(i, i2);
            return;
        }
        int childCount = getChildCount();
        int i3 = 0;
        int i5 = 0;
        while (true) {
            if (i5 >= childCount) {
                recyclerView = null;
                break;
            }
            View childAt = getChildAt(i5);
            if (childAt instanceof RecyclerView) {
                recyclerView = (RecyclerView) childAt;
                break;
            }
            i5++;
        }
        if (recyclerView == null || recyclerView.getLayoutParams().height == -1) {
            measureChildren(i, i2);
            int childCount2 = getChildCount();
            int measuredHeight2 = 0;
            while (i3 < childCount2) {
                measuredHeight2 += getChildAt(i3).getMeasuredHeight();
                i3++;
            }
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(Math.min(getPaddingBottom() + getPaddingTop() + measuredHeight2, size), 1073741824));
            return;
        }
        super.onMeasure(i, i2);
        List<View> dependencies = getDependencies(recyclerView);
        if (dependencies.size() != 1) {
            dependencies = null;
        }
        View view = dependencies != null ? dependencies.get(0) : null;
        List<View> dependents = getDependents(recyclerView);
        if (dependents.size() != 1) {
            dependents = null;
        }
        View view2 = dependents != null ? dependents.get(0) : null;
        if (view == null || view2 == null || indexOfChild(recyclerView) <= indexOfChild(view)) {
            measuredHeight = 0;
        } else {
            int childCount3 = getChildCount();
            int iMax = 0;
            for (int i6 = 0; i6 < childCount3; i6++) {
                View childAt2 = getChildAt(i6);
                if (!Intrinsics.f(childAt2, view)) {
                    ViewGroup.LayoutParams layoutParams = childAt2.getLayoutParams();
                    Intrinsics.i(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    iMax = Math.max(iMax, childAt2.getMeasuredHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin);
                }
            }
            ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
            Intrinsics.i(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
            measuredHeight = view.getMeasuredHeight() + marginLayoutParams2.topMargin + marginLayoutParams2.bottomMargin + iMax;
        }
        if (measuredHeight == 0) {
            int childCount4 = getChildCount();
            int measuredHeight3 = 0;
            while (i3 < childCount4) {
                measuredHeight3 += getChildAt(i3).getMeasuredHeight();
                i3++;
            }
            measuredHeight = measuredHeight3;
        }
        setMeasuredDimension(getMeasuredWidth(), Math.min(size, getPaddingBottom() + getPaddingTop() + measuredHeight));
    }

    @Override // hli.e
    public void setContainerId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.f98448a.setContainerId(str);
    }

    @Override // pp0.a
    public void setDrawingDelegate(b delegate) {
        b bVar = this.f98450c;
        if (bVar != null) {
            ((q) bVar).d(this);
        }
        this.f98450c = delegate;
        if (delegate != null) {
            ((q) delegate).c(this);
        }
    }

    @Override // hli.e
    public void setFitNavigationBar(boolean z) {
        this.f98448a.f153473c = z;
    }

    @Override // hli.e
    public void setFitStatusBar(boolean z) {
        this.f98448a.f153472b = z;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ControllerContainerCoordinatorLayout(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
    public ControllerContainerCoordinatorLayout(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f98448a = new hli.h(context, attributeSet);
        k kVar = new k(this);
        this.f98449b = kVar;
        kVar.d(!((Boolean) g.I.getValue()).booleanValue());
    }

    public /* synthetic */ ControllerContainerCoordinatorLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
