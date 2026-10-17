package com.revolut.core.ui_kit.gesture_control;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import androidx.core.view.NestedScrollingChild;
import androidx.core.view.NestedScrollingChildHelper;
import androidx.core.view.NestedScrollingParent3;
import androidx.core.view.NestedScrollingParentHelper;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit_core.displayers.haptic.Haptic;
import com.revolut.core.ui_kit_core.displayers.haptic.b;
import com.revolut.core.ui_kit_core.displayers.haptic.c;
import jh.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.f;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0012\b\u0007\u0018\u0000  2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0017B'\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\b2\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\"\u0010\u001c\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u0016R\"\u0010\u001e\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u0018\u001a\u0004\b\u001e\u0010\u001a\"\u0004\b\u001f\u0010\u0016¨\u0006!"}, d2 = {"Lcom/revolut/core/ui_kit/gesture_control/VerticalSnapLayout;", "Landroid/widget/FrameLayout;", "Landroidx/core/view/NestedScrollingParent3;", "", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "index", "", "animate", "", "setCurrent", "(IZ)V", "getNestedScrollAxes", "()I", "enabled", "setNestedScrollingEnabled", "(Z)V", "a", "Z", "getChildScrollOnlyHappened", "()Z", "setChildScrollOnlyHappened", "childScrollOnlyHappened", "p", "isScrollingEnabled", "setScrollingEnabled", "Companion", "ui_kit_gesture_control_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class VerticalSnapLayout extends FrameLayout implements NestedScrollingParent3, NestedScrollingChild {

    @NotNull
    private static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public boolean childScrollOnlyHappened;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final NestedScrollingParentHelper f55818b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final NestedScrollingChildHelper f55819c;
    public final OverScroller d;
    public int e;
    public int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f55820g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f55821h;
    public boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f55822j;
    public int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f55823l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f55824m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f55825n;
    public final int o;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    public boolean isScrollingEnabled;

    public static final class a {
        private a() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public VerticalSnapLayout(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static /* synthetic */ void setCurrent$default(VerticalSnapLayout verticalSnapLayout, int i, boolean z, int i2, Object obj2) {
        if ((i2 & 2) != 0) {
            z = true;
        }
        verticalSnapLayout.setCurrent(i, z);
    }

    public final void a() {
        int i;
        int iG;
        if (!this.f55823l || (i = this.f55822j) < 0) {
            return;
        }
        int i2 = this.k;
        this.f55822j = -1;
        this.k = -1;
        this.f55823l = false;
        if (i < getChildCount() && getScrollY() != (iG = f.g(getChildAt(i).getTop(), 0, this.e))) {
            if (i2 > 0) {
                e(iG, i2);
                return;
            }
            this.d.forceFinished(true);
            this.f55821h = false;
            scrollTo(0, iG);
            invalidate();
        }
    }

    public final int b(int i) {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() != 8 && childAt.getTop() > i) {
                return childAt.getTop();
            }
        }
        return this.e;
    }

    public final int c(int i) {
        int childCount = getChildCount();
        while (true) {
            childCount--;
            if (-1 >= childCount) {
                return 0;
            }
            View childAt = getChildAt(childCount);
            if (childAt.getVisibility() != 8 && childAt.getTop() < i) {
                return childAt.getTop();
            }
        }
    }

    @Override // android.view.View
    public final boolean canScrollVertically(int i) {
        View childAt;
        int childCount = getChildCount();
        int i2 = 0;
        while (true) {
            if (i2 >= childCount) {
                childAt = null;
                break;
            }
            childAt = getChildAt(i2);
            if (childAt.getVisibility() != 8 && childAt.getTop() == getScrollY()) {
                break;
            }
            i2++;
        }
        if (childAt == null || !childAt.canScrollVertically(i)) {
            return i < 0 ? getScrollY() > 0 : getScrollY() < this.e;
        }
        return true;
    }

    @Override // android.view.View
    public final void computeScroll() {
        OverScroller overScroller = this.d;
        if (overScroller.computeScrollOffset()) {
            scrollTo(0, overScroller.getCurrY());
            postInvalidateOnAnimation();
            return;
        }
        if (this.f55821h) {
            this.f55821h = false;
        }
        if (this.f55822j >= 0) {
            this.f55822j = -1;
            this.k = -1;
            this.f55823l = false;
        }
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        return this.f55820g;
    }

    public final boolean d(int i) {
        if (i == this.e) {
            return true;
        }
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() != 8 && childAt.getTop() == i) {
                return true;
            }
        }
        return false;
    }

    public final void e(int i, int i2) {
        if (getScrollY() == i) {
            return;
        }
        int scrollY = i - getScrollY();
        OverScroller overScroller = this.d;
        overScroller.forceFinished(true);
        this.f55821h = true;
        overScroller.startScroll(0, getScrollY(), 0, scrollY, i2);
        postInvalidateOnAnimation();
    }

    public final boolean getChildScrollOnlyHappened() {
        return this.childScrollOnlyHappened;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.f55818b.getNestedScrollAxes();
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.f55819c.isNestedScrollingEnabled();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i5) {
        int childCount = getChildCount();
        int i6 = 0;
        for (int i21 = 0; i21 < childCount; i21++) {
            View childAt = getChildAt(i21);
            if (childAt.getVisibility() != 8) {
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight() + i6;
                childAt.layout(0, i6, measuredWidth, measuredHeight);
                i6 = measuredHeight;
            }
        }
        this.e = Math.max(0, i6 - getMeasuredHeight());
        int scrollY = getScrollY();
        int i22 = this.e;
        if (scrollY > i22) {
            scrollTo(0, i22);
        }
        int i32 = i5 - i2;
        if (i6 < i32) {
            i6 = i32;
        }
        this.f55820g = i6;
        if (this.f55823l) {
            a();
            return;
        }
        if (!z || this.f <= 0 || this.i || this.e <= 0 || d(getScrollY())) {
            return;
        }
        this.d.forceFinished(true);
        this.f55821h = false;
        int scrollY2 = getScrollY();
        int i33 = this.f;
        View childAt2 = getChildAt(f.g(((i33 / 2) + scrollY2) / i33, 0, getChildCount() - 1));
        scrollTo(0, childAt2 != null ? f.g(childAt2.getTop(), 0, this.e) : 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View target, float f, float f4) {
        Intrinsics.checkNotNullParameter(target, "target");
        if (dispatchNestedPreFling(f, f4)) {
            return true;
        }
        if (!this.isScrollingEnabled || d(getScrollY())) {
            return false;
        }
        e(f4 > BitmapDescriptorFactory.HUE_RED ? b(getScrollY()) : c(getScrollY()), 450);
        return true;
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public final void onNestedPreScroll(View target, int i, int i2, int[] consumed, int i3) {
        int iC;
        int scrollY;
        Intrinsics.checkNotNullParameter(target, "target");
        Intrinsics.checkNotNullParameter(consumed, "consumed");
        this.f55819c.dispatchNestedPreScroll(i, i2, consumed, null, i3);
        int i5 = i2 - consumed[1];
        if (i5 == 0) {
            return;
        }
        if ((i3 == 1 && this.childScrollOnlyHappened) || !this.isScrollingEnabled || d(getScrollY())) {
            return;
        }
        if (i5 > 0) {
            iC = b(getScrollY());
            scrollY = getScrollY();
        } else {
            iC = c(getScrollY());
            scrollY = getScrollY();
        }
        int i6 = iC - scrollY;
        int iMin = i5 > 0 ? Math.min(i5, i6) : Math.max(i5, i6);
        scrollBy(0, iMin);
        consumed[1] = consumed[1] + iMin;
    }

    @Override // androidx.core.view.NestedScrollingParent3
    public final void onNestedScroll(View target, int i, int i2, int i3, int i5, int i6, int[] consumed) {
        Intrinsics.checkNotNullParameter(target, "target");
        Intrinsics.checkNotNullParameter(consumed, "consumed");
        int i21 = 0;
        if (i6 == 0) {
            this.childScrollOnlyHappened = i5 == 0;
        }
        if (!this.isScrollingEnabled) {
            Intrinsics.checkNotNullParameter(consumed, "consumed");
            this.f55819c.dispatchNestedScroll(i, i2, i3, i5, null, i6, consumed);
            return;
        }
        if ((i6 != 1 || !this.childScrollOnlyHappened) && i5 != 0) {
            int iMax = (i5 <= 0 || getScrollY() >= this.e) ? (i5 >= 0 || getScrollY() <= 0) ? 0 : Math.max(i5, c(getScrollY()) - getScrollY()) : Math.min(i5, b(getScrollY()) - getScrollY());
            if (iMax != 0) {
                scrollBy(0, iMax);
                consumed[1] = consumed[1] + iMax;
            }
            i21 = iMax;
        }
        Intrinsics.checkNotNullParameter(consumed, "consumed");
        this.f55819c.dispatchNestedScroll(i, i2 + i21, i3, i5 - i21, null, i6, consumed);
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public final void onNestedScrollAccepted(View child, View target, int i, int i2) {
        Intrinsics.checkNotNullParameter(child, "child");
        Intrinsics.checkNotNullParameter(target, "target");
        this.f55818b.onNestedScrollAccepted(child, target, i, i2);
    }

    @Override // android.view.View
    public final void onScrollChanged(int i, int i2, int i3, int i5) {
        super.onScrollChanged(i, i2, i3, i5);
        if (!this.i || !this.f55824m || this.f55825n || i2 < this.o) {
            return;
        }
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        ((b) d.f(context).Y()).a(new Haptic.Effect(c.SHORT, true));
        this.f55825n = true;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i5) {
        super.onSizeChanged(i, i2, i3, i5);
        this.f = i5;
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public final boolean onStartNestedScroll(View child, View target, int i, int i2) {
        Intrinsics.checkNotNullParameter(child, "child");
        Intrinsics.checkNotNullParameter(target, "target");
        if (i2 == 0) {
            this.childScrollOnlyHappened = false;
            this.i = true;
            this.f55824m = getScrollY() == 0;
            this.f55825n = false;
            this.f55822j = -1;
            this.k = -1;
            this.f55823l = false;
        }
        OverScroller overScroller = this.d;
        if (!overScroller.isFinished()) {
            overScroller.abortAnimation();
        }
        this.f55821h = false;
        boolean z = (i & 2) != 0;
        this.f55819c.startNestedScroll(i, i2);
        return z;
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public final void onStopNestedScroll(View target, int i) {
        int iAbs;
        Intrinsics.checkNotNullParameter(target, "target");
        if (i == 0) {
            this.i = false;
        }
        this.f55818b.onStopNestedScroll(target, i);
        this.f55819c.stopNestedScroll(i);
        if (d(getScrollY()) || this.f55821h || getChildCount() == 0 || this.e <= 0) {
            return;
        }
        int iAbs2 = Math.abs(getScrollY());
        int childCount = getChildCount();
        int top = 0;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() != 8 && (iAbs = Math.abs(childAt.getTop() - getScrollY())) < iAbs2) {
                top = childAt.getTop();
                iAbs2 = iAbs;
            }
        }
        if (Math.abs(this.e - getScrollY()) < iAbs2) {
            top = this.e;
        }
        e(top, 450);
    }

    public final void setChildScrollOnlyHappened(boolean z) {
        this.childScrollOnlyHappened = z;
    }

    public final void setCurrent(int index, boolean animate) {
        if (this.i || this.f55822j == index) {
            return;
        }
        this.f55822j = index;
        this.k = animate ? 450 : 0;
        this.f55823l = true;
        if (!isLaidOut() || isLayoutRequested()) {
            return;
        }
        a();
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean enabled) {
        this.f55819c.setNestedScrollingEnabled(enabled);
    }

    public final void setScrollingEnabled(boolean z) {
        this.isScrollingEnabled = z;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public VerticalSnapLayout(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VerticalSnapLayout(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f55818b = new NestedScrollingParentHelper(this);
        this.f55819c = new NestedScrollingChildHelper(this);
        this.d = new OverScroller(context, new OvershootInterpolator(0.7f));
        this.f55822j = -1;
        this.o = kli.a.k(context, 24.0f);
        setNestedScrollingEnabled(true);
        this.isScrollingEnabled = true;
    }

    public /* synthetic */ VerticalSnapLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public final void onNestedScroll(View target, int i, int i2, int i3, int i5, int i6) {
        Intrinsics.checkNotNullParameter(target, "target");
        onNestedScroll(target, i, i2, i3, i5, i6, new int[2]);
    }
}
