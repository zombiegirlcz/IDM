package com.revolut.core.ui_kit.internal.views.navbar;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.widget.OverScroller;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import au0.p3;
import au0.r3;
import au0.s3;
import au0.t3;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.appbar.AppBarLayout;
import com.revolut.core.ui_kit.models.navbar.NavBarMessage;
import com.revolut.core.ui_kit.views.navbar.NavBarWithContainer;
import com.revolut.core.ui_kit.views.navbar.NavBarWithContainerHeaderView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 \u00042\u00020\u0001:\u0003\u0005\u0006\u0007B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\b"}, d2 = {"Lcom/revolut/core/ui_kit/internal/views/navbar/NavBarWithContainerBehaviour;", "Lcom/revolut/core/ui_kit/internal/views/navbar/CollapsingAppBarLayout$Behavior;", "<init>", "()V", "Companion", "au0/r3", "au0/s3", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class NavBarWithContainerBehaviour extends CollapsingAppBarLayout$Behavior {

    @NotNull
    private static final a Companion = new a();
    public ValueAnimator i;
    public VelocityTracker k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public OverScroller f57322l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public float f57323m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f57324n;
    public float o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f57325p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public float f57326q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public float f57327r;
    public r3 u;
    public int v;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public s3 f57321j = s3.UNKNOWN;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f57328s = -1;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f57329t = -1;

    public static final class a {
        private a() {
        }
    }

    public static final void e(NavBarWithContainerBehaviour navBarWithContainerBehaviour, CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, MotionEvent motionEvent) {
        super.onTouchEvent(coordinatorLayout, appBarLayout, motionEvent);
    }

    public static boolean f(NavBarWithContainer navBarWithContainer) {
        NavBarWithContainerHeaderView headerView = navBarWithContainer.getHeaderView();
        TextView messageView$ui_kit_components_release = headerView.getMessageView$ui_kit_components_release();
        return messageView$ui_kit_components_release != null && !headerView.messageAnimRunning && messageView$ui_kit_components_release.getVisibility() == 0 && navBarWithContainer.getExpandRatio() >= 1.0f;
    }

    public static void h(NavBarWithContainer navBarWithContainer, int i, int i2) {
        NavBarWithContainerHeaderView headerView = navBarWithContainer.getHeaderView();
        TextView messageView$ui_kit_components_release = headerView.getMessageView$ui_kit_components_release();
        if (messageView$ui_kit_components_release == null) {
            return;
        }
        headerView.setMessageCurrentInset$ui_kit_components_release(i);
        messageView$ui_kit_components_release.setAlpha(i2 > 0 ? i / i2 : 1.0f);
        messageView$ui_kit_components_release.setTranslationY(i - i2);
    }

    public final void g() {
        VelocityTracker velocityTracker = this.k;
        if (velocityTracker != null) {
            velocityTracker.recycle();
        }
        this.k = null;
        r3 r3Var = this.u;
        if (r3Var != null) {
            r3Var.a();
        }
        this.u = null;
        ValueAnimator valueAnimator = this.i;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.i = null;
    }

    public final void i(CoordinatorLayout coordinatorLayout, NavBarWithContainer navBarWithContainer, MotionEvent motionEvent) {
        float yVelocity;
        NavBarWithContainerHeaderView headerView = navBarWithContainer.getHeaderView();
        int action = motionEvent.getAction();
        if (action != 1) {
            if (action != 2) {
                if (action != 3) {
                    return;
                }
                super.onTouchEvent(coordinatorLayout, navBarWithContainer, motionEvent);
                return;
            }
            k(navBarWithContainer, -((int) (motionEvent.getY() - this.f57325p)));
            if (headerView.getW() == 0) {
                this.f57321j = s3.HEADER_SCROLLING;
                this.f57326q = this.f57323m - this.o;
                this.f57327r = this.f57324n - this.f57325p;
                MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent.getEventTime(), motionEvent.getEventTime(), 0, this.f57323m, this.f57324n, motionEvent.getMetaState());
                try {
                    super.onInterceptTouchEvent(coordinatorLayout, navBarWithContainer, motionEventObtain);
                    return;
                } finally {
                    motionEventObtain.recycle();
                }
            }
            return;
        }
        MotionEvent motionEventObtain2 = MotionEvent.obtain(motionEvent);
        motionEventObtain2.setAction(3);
        try {
            super.onTouchEvent(coordinatorLayout, navBarWithContainer, motionEventObtain2);
            motionEventObtain2.recycle();
            VelocityTracker velocityTracker = this.k;
            if (velocityTracker != null) {
                velocityTracker.computeCurrentVelocity(1000);
                yVelocity = velocityTracker.getYVelocity();
                if (this.f57329t < 0) {
                    Context context = coordinatorLayout.getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                    this.f57329t = kli.a.k(context, 50.0f);
                }
            } else {
                yVelocity = Float.MIN_VALUE;
            }
            if (yVelocity == Float.MIN_VALUE || Math.abs(yVelocity) <= this.f57329t) {
                l(navBarWithContainer);
                return;
            }
            OverScroller overScroller = this.f57322l;
            if (overScroller == null) {
                overScroller = new OverScroller(coordinatorLayout.getContext());
                this.f57322l = overScroller;
            }
            OverScroller overScroller2 = overScroller;
            NavBarWithContainerHeaderView headerView2 = navBarWithContainer.getHeaderView();
            int w3 = headerView2.getW();
            overScroller2.fling(0, w3, 0, (int) yVelocity, 0, 0, -navBarWithContainer.getTotalScrollRange(), headerView2.getDefaultMessageInset$ui_kit_components_release());
            r3 r3Var = new r3(this, coordinatorLayout, navBarWithContainer, w3);
            this.u = r3Var;
            navBarWithContainer.postOnAnimation(r3Var);
        } catch (Throwable th10) {
            motionEventObtain2.recycle();
            throw th10;
        }
    }

    public final boolean j(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, MotionEvent motionEvent) {
        if (this.f57326q == BitmapDescriptorFactory.HUE_RED && this.f57327r == BitmapDescriptorFactory.HUE_RED) {
            return super.onTouchEvent(coordinatorLayout, appBarLayout, motionEvent);
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        try {
            motionEventObtain.offsetLocation(this.f57326q, this.f57327r);
            return super.onTouchEvent(coordinatorLayout, appBarLayout, motionEventObtain);
        } finally {
            motionEventObtain.recycle();
        }
    }

    public final int k(NavBarWithContainer navBarWithContainer, int i) {
        if (i == 0 || !f(navBarWithContainer)) {
            return 0;
        }
        int i2 = this.v + i;
        int i3 = i2 / 2;
        if (i3 == 0) {
            this.v = i2;
            return i;
        }
        this.v = i2 % 2;
        NavBarWithContainerHeaderView headerView = navBarWithContainer.getHeaderView();
        int defaultMessageInset$ui_kit_components_release = headerView.getDefaultMessageInset$ui_kit_components_release();
        int w3 = headerView.getW();
        int iG = kotlin.ranges.f.g(w3 - i3, 0, defaultMessageInset$ui_kit_components_release);
        int i5 = w3 - iG;
        if (i5 != 0) {
            h(navBarWithContainer, iG, defaultMessageInset$ui_kit_components_release);
            if (i3 > 0 && iG == 0) {
                NavBarWithContainerHeaderView headerView2 = navBarWithContainer.getHeaderView();
                NavBarMessage message = headerView2.getF59382h0();
                if (message != null) {
                    Intrinsics.checkNotNullParameter(message, "message");
                    headerView2.V.onNext(message);
                }
                navBarWithContainer.setMessage(null);
            }
        }
        return i5;
    }

    public final void l(NavBarWithContainer navBarWithContainer) {
        if (f(navBarWithContainer)) {
            NavBarWithContainerHeaderView headerView = navBarWithContainer.getHeaderView();
            int defaultMessageInset$ui_kit_components_release = headerView.getDefaultMessageInset$ui_kit_components_release();
            int w3 = headerView.getW();
            if (defaultMessageInset$ui_kit_components_release <= 0 || w3 <= 0 || w3 >= defaultMessageInset$ui_kit_components_release) {
                return;
            }
            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(w3, defaultMessageInset$ui_kit_components_release);
            valueAnimatorOfInt.setDuration(200L);
            valueAnimatorOfInt.addUpdateListener(new p3(navBarWithContainer, this, defaultMessageInset$ui_kit_components_release));
            valueAnimatorOfInt.start();
            ValueAnimator valueAnimator = this.i;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.i = valueAnimatorOfInt;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0088  */
    @Override // com.google.android.material.appbar.AppBarLayout.Behavior, com.google.android.material.appbar.HeaderBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onInterceptTouchEvent(androidx.coordinatorlayout.widget.CoordinatorLayout r7, android.view.View r8, android.view.MotionEvent r9) {
        /*
            Method dump skipped, instruction units count: 235
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.core.ui_kit.internal.views.navbar.NavBarWithContainerBehaviour.onInterceptTouchEvent(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    @Override // com.google.android.material.appbar.AppBarLayout.Behavior, com.google.android.material.appbar.HeaderBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean onTouchEvent(CoordinatorLayout parent, View view, MotionEvent ev10) {
        boolean zOnTouchEvent;
        AppBarLayout child = (AppBarLayout) view;
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(child, "child");
        Intrinsics.checkNotNullParameter(ev10, "ev");
        if (!(child instanceof NavBarWithContainer)) {
            return super.onTouchEvent(parent, child, ev10);
        }
        VelocityTracker velocityTracker = this.k;
        if (velocityTracker != null) {
            velocityTracker.addMovement(ev10);
        }
        int i = t3.f9371a[this.f57321j.ordinal()];
        if (i != 1) {
            zOnTouchEvent = i != 2 ? super.onTouchEvent(parent, child, ev10) : j(parent, child, ev10);
        } else {
            i(parent, (NavBarWithContainer) child, ev10);
            zOnTouchEvent = true;
        }
        int action = ev10.getAction();
        if (action != 1) {
            if (action == 2) {
                this.f57325p = ev10.getY();
                this.o = ev10.getX();
                return zOnTouchEvent;
            }
            if (action != 3) {
                return zOnTouchEvent;
            }
        }
        VelocityTracker velocityTracker2 = this.k;
        if (velocityTracker2 != null) {
            velocityTracker2.recycle();
        }
        this.k = null;
        return zOnTouchEvent;
    }

    @Override // com.revolut.core.ui_kit.internal.views.navbar.CollapsingAppBarLayout$Behavior, com.google.android.material.appbar.AppBarLayout.BaseBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final void onNestedPreScroll(CoordinatorLayout coordinatorLayout, AppBarLayout child, View target, int i, int i2, int[] consumed, int i3) {
        Intrinsics.checkNotNullParameter(coordinatorLayout, "coordinatorLayout");
        Intrinsics.checkNotNullParameter(child, "child");
        Intrinsics.checkNotNullParameter(target, "target");
        Intrinsics.checkNotNullParameter(consumed, "consumed");
        if (!(child instanceof NavBarWithContainer)) {
            super.onNestedPreScroll(coordinatorLayout, child, target, i, i2, consumed, i3);
            return;
        }
        g();
        NavBarWithContainer navBarWithContainer = (NavBarWithContainer) child;
        if (i2 == 0) {
            return;
        }
        if (k(navBarWithContainer, i2) != 0) {
            consumed[1] = i2;
        } else {
            super.onNestedPreScroll(coordinatorLayout, child, target, i, i2, consumed, i3);
        }
    }

    @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final void onNestedScroll(CoordinatorLayout coordinatorLayout, AppBarLayout child, View target, int i, int i2, int i3, int i5, int i6, int[] consumed) {
        Intrinsics.checkNotNullParameter(coordinatorLayout, "coordinatorLayout");
        Intrinsics.checkNotNullParameter(child, "child");
        Intrinsics.checkNotNullParameter(target, "target");
        Intrinsics.checkNotNullParameter(consumed, "consumed");
        if (!(child instanceof NavBarWithContainer)) {
            super.onNestedScroll(coordinatorLayout, child, target, i, i2, i3, i5, i6, consumed);
            return;
        }
        g();
        NavBarWithContainer navBarWithContainer = (NavBarWithContainer) child;
        if (i5 == 0) {
            return;
        }
        if (k(navBarWithContainer, i5) != 0) {
            consumed[1] = i5;
        } else {
            super.onNestedScroll(coordinatorLayout, child, target, i, i2, i3, i5, i6, consumed);
        }
    }

    @Override // com.revolut.core.ui_kit.internal.views.navbar.CollapsingAppBarLayout$Behavior, com.google.android.material.appbar.AppBarLayout.BaseBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final void onStopNestedScroll(CoordinatorLayout coordinatorLayout, AppBarLayout child, View target, int i) {
        Intrinsics.checkNotNullParameter(coordinatorLayout, "coordinatorLayout");
        Intrinsics.checkNotNullParameter(child, "child");
        Intrinsics.checkNotNullParameter(target, "target");
        if (!(child instanceof NavBarWithContainer)) {
            super.onStopNestedScroll(coordinatorLayout, child, target, i);
            return;
        }
        this.v = 0;
        l((NavBarWithContainer) child);
        super.onStopNestedScroll(coordinatorLayout, child, target, i);
    }
}
