package com.revolut.kompot.common.view;

import android.content.Context;
import android.graphics.PointF;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowInsets;
import androidx.core.view.ViewCompat;
import androidx.lifecycle.Lifecycle;
import au0.c4;
import com.revolut.core.ui_kit.views.slider_layout.SliderLayout;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.navigable.TransitionAnimation;
import com.revolut.kompot.navigable.c;
import dy0.o;
import dy0.r;
import hli.e;
import hli.h;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lki.z;
import org.jetbrains.annotations.NotNull;
import rd0.d;
import zhm.h0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B'\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0014\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00118VX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0013R\u001c\u0010\u001a\u001a\u00020\u00118\u0016@\u0016X\u0096\u000f¢\u0006\f\u001a\u0004\b\u0017\u0010\u0013\"\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001d\u001a\u00020\u00118\u0016@\u0016X\u0096\u000f¢\u0006\f\u001a\u0004\b\u001b\u0010\u0013\"\u0004\b\u001c\u0010\u0019R\u001c\u0010#\u001a\u00020\u001e8\u0016@\u0016X\u0096\u000f¢\u0006\f\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u0014\u0010%\u001a\u00020\u00118\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b$\u0010\u0013R\u0016\u0010)\u001a\u0004\u0018\u00010&8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b'\u0010(R\u0016\u0010-\u001a\u0004\u0018\u00010*8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b+\u0010,¨\u0006."}, d2 = {"Lcom/revolut/kompot/common/view/ControllerContainerSliderLayout;", "Lcom/revolut/core/ui_kit/views/slider_layout/SliderLayout;", "Lhli/e;", "Lcom/revolut/kompot/navigable/c;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Llki/z;", "transitionListener", "", "setTransitionListener", "(Llki/z;)V", "", "getSwipeStarted", "()Z", "swipeStarted", "getFitsReadableArea", "fitsReadableArea", "getFitStatusBar", "setFitStatusBar", "(Z)V", "fitStatusBar", "getFitNavigationBar", "setFitNavigationBar", "fitNavigationBar", "", "getContainerId", "()Ljava/lang/String;", "setContainerId", "(Ljava/lang/String;)V", "containerId", "getControllersTransitionActive", "controllersTransitionActive", "Landroid/view/WindowInsets;", "getLatestAppliedInsets", "()Landroid/view/WindowInsets;", "latestAppliedInsets", "Landroid/graphics/PointF;", "getLatestDispatchedDownEvent", "()Landroid/graphics/PointF;", "latestDispatchedDownEvent", "kompot_common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ControllerContainerSliderLayout extends SliderLayout implements e, c {
    public final /* synthetic */ h F;
    public boolean G;
    public z H;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ControllerContainerSliderLayout(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // hli.e
    public final void J(SparseArray outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        this.F.i = true;
        dispatchSaveInstanceState(outState);
    }

    @Override // hli.e
    public final void J0() {
        this.F.e = null;
    }

    @Override // hli.e
    public final void N0() {
        this.F.e = null;
    }

    public final void T(boolean z) {
        this.G = false;
        if (z) {
            z zVar = this.H;
            if (zVar != null) {
                zVar.n();
            }
        } else {
            z zVar2 = this.H;
            if (zVar2 != null) {
                zVar2.r();
            }
            z zVar3 = this.H;
            if (zVar3 != null) {
                zVar3.q();
            }
        }
        this.H = null;
    }

    @Override // hli.e
    public final hli.c W(Lifecycle controllerLifecycle) {
        Intrinsics.checkNotNullParameter(controllerLifecycle, "controllerLifecycle");
        return this.F.W(controllerLifecycle);
    }

    /* JADX WARN: Type inference failed for: r13v12, types: [ix0.a2, java.lang.Object] */
    @Override // com.revolut.kompot.navigable.c
    public final void Y(boolean z, TransitionAnimation.ViewDelegated animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        if (getSlideByTouchStarted()) {
            return;
        }
        if (z) {
            O();
            return;
        }
        if (!(animation instanceof SlidingAnimation)) {
            throw new IllegalStateException("TransitionAnimation must be SlidingAnimation");
        }
        if (!getSlidingEnabled()) {
            throw new IllegalStateException("Can't start transition when sliding disabled. Sliding transitions factory not provided");
        }
        SlidingAnimation slidingAnimation = (SlidingAnimation) animation;
        o direction = slidingAnimation.f98374b;
        boolean z3 = slidingAnimation.f98375c;
        Intrinsics.checkNotNullParameter(direction, "direction");
        c4 c4Var = null;
        if (this.f59657b != r.HIDDEN) {
            String name = ControllerContainerSliderLayout.class.getName();
            Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = d.f253311a;
            d.a(rd0.c.ERROR, name, "Can't open slider when view is in " + getCurrentState() + " ongoingSlideState=" + this.f59658c + " slidingEnabled=" + getSlidingEnabled() + " sliderSpec=" + SliderLayout.P(this.f59659g), null, h0Var);
            return;
        }
        if (!getSlidingEnabled()) {
            String name2 = ControllerContainerSliderLayout.class.getName();
            Intrinsics.checkNotNullExpressionValue(name2, "getName(...)");
            CopyOnWriteArrayList copyOnWriteArrayList2 = d.f253311a;
            d.b(rd0.c.WARNING, name2, "Can't open slider when sliding is disabled. Sliding transitions factory not provided", null, null, 16);
            return;
        }
        o oVarC = C(direction);
        SliderLayout.SlidingSpec slidingSpec = new SliderLayout.SlidingSpec(oVarC, z3);
        if (!y(slidingSpec)) {
            throw new IllegalStateException(("Can't open slider when transition is not initialised. Please ensure your slider factory returns a proper transition for direction " + direction).toString());
        }
        this.f59659g = slidingSpec;
        F(slidingSpec, false);
        if (this.f59661j == null) {
            B("Update sliding view when it is null");
        }
        View viewI = I();
        ?? r132 = this.v;
        if (r132 != 0) {
            r132.cancel();
        }
        if (!ViewCompat.isLaidOut(viewI) || viewI.isLayoutRequested()) {
            c4 c4Var2 = new c4(viewI, this, this, oVarC, 1);
            viewI.addOnLayoutChangeListener(c4Var2);
            c4Var = c4Var2;
        } else {
            this.v = null;
            SliderLayout.g(this, oVarC);
        }
        this.v = c4Var;
    }

    @Override // hli.e
    public final void c0(boolean z) {
        this.F.c0(z);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray container) {
        Intrinsics.checkNotNullParameter(container, "container");
        if (this.F.c()) {
            super.dispatchRestoreInstanceState(container);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchSaveInstanceState(SparseArray container) {
        Intrinsics.checkNotNullParameter(container, "container");
        if (this.F.c()) {
            super.dispatchSaveInstanceState(container);
        }
    }

    @Override // com.revolut.core.ui_kit.views.slider_layout.SliderLayout, android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent ev10) {
        Intrinsics.checkNotNullParameter(ev10, "ev");
        if (this.G) {
            return true;
        }
        Intrinsics.checkNotNullParameter(this, "containerView");
        Intrinsics.checkNotNullParameter(ev10, "ev");
        if (this.F.b(ev10, this)) {
            return true;
        }
        return super.dispatchTouchEvent(ev10);
    }

    @Override // hli.e
    public final void e(SparseArray state) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.F.i = true;
        dispatchRestoreInstanceState(state);
    }

    @Override // hli.e
    @NotNull
    public String getContainerId() {
        return this.F.d;
    }

    @Override // hli.e
    public boolean getControllersTransitionActive() {
        return this.F.getControllersTransitionActive();
    }

    @Override // hli.e
    public boolean getFitNavigationBar() {
        return this.F.f153473c;
    }

    @Override // hli.e
    public boolean getFitStatusBar() {
        return this.F.f153472b;
    }

    @Override // hli.e, ny0.h
    /* JADX INFO: renamed from: getFitsReadableArea */
    public boolean getF57232a() {
        this.F.getClass();
        return false;
    }

    @Override // hli.e
    public WindowInsets getLatestAppliedInsets() {
        return this.F.f153474g;
    }

    @Override // hli.e
    public PointF getLatestDispatchedDownEvent() {
        return this.F.f153475h;
    }

    public final boolean getSwipeStarted() {
        return getSlideByTouchStarted();
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets insets) {
        Intrinsics.checkNotNullParameter(insets, "insets");
        Intrinsics.checkNotNullParameter(this, "controllerContainer");
        Intrinsics.checkNotNullParameter(insets, "insets");
        return this.F.a(this, insets);
    }

    @Override // com.revolut.core.ui_kit.views.slider_layout.SliderLayout, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        Intrinsics.checkNotNullParameter(this, "containerView");
        this.F.getClass();
        Intrinsics.checkNotNullParameter(this, "containerView");
        ViewCompat.requestApplyInsets(this);
        super.onAttachedToWindow();
    }

    @Override // com.revolut.core.ui_kit.views.slider_layout.SliderLayout, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.H = null;
        super.onDetachedFromWindow();
    }

    @Override // com.revolut.core.ui_kit.views.slider_layout.SliderLayout
    public final void q(boolean z) {
        Intrinsics.checkNotNullParameter(this, "view");
        getRootView().setTag(R$id.internal_navigationBarAnimationControlAcquired, Boolean.FALSE);
        super.q(z);
        T(z);
    }

    @Override // com.revolut.core.ui_kit.views.slider_layout.SliderLayout
    public final void r(SliderLayout.SlidingSpec slidingSpec, boolean z) {
        Intrinsics.checkNotNullParameter(slidingSpec, "slidingSpec");
        Intrinsics.checkNotNullParameter(this, "view");
        getRootView().setTag(R$id.internal_navigationBarAnimationControlAcquired, Boolean.TRUE);
        this.G = !z;
        super.r(slidingSpec, z);
        z zVar = this.H;
        if (zVar != null) {
            zVar.o();
        }
        z zVar2 = this.H;
        if (zVar2 != null) {
            zVar2.p();
        }
    }

    @Override // com.revolut.core.ui_kit.views.slider_layout.SliderLayout
    public final void s(boolean z) {
        Intrinsics.checkNotNullParameter(this, "view");
        getRootView().setTag(R$id.internal_navigationBarAnimationControlAcquired, Boolean.FALSE);
        super.s(z);
        T(z);
    }

    @Override // hli.e
    public void setContainerId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.F.setContainerId(str);
    }

    @Override // hli.e
    public void setFitNavigationBar(boolean z) {
        this.F.f153473c = z;
    }

    @Override // hli.e
    public void setFitStatusBar(boolean z) {
        this.F.f153472b = z;
    }

    @Override // com.revolut.kompot.navigable.c
    public void setTransitionListener(z transitionListener) {
        this.H = transitionListener;
    }

    @Override // com.revolut.core.ui_kit.views.slider_layout.SliderLayout
    public final void t(boolean z) {
        Intrinsics.checkNotNullParameter(this, "view");
        getRootView().setTag(R$id.internal_navigationBarAnimationControlAcquired, Boolean.TRUE);
        this.G = !z;
        super.t(z);
        z zVar = this.H;
        if (zVar != null) {
            zVar.o();
        }
        z zVar2 = this.H;
        if (zVar2 != null) {
            zVar2.p();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ControllerContainerSliderLayout(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ControllerContainerSliderLayout(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.F = new h(context, attributeSet);
    }

    public /* synthetic */ ControllerContainerSliderLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
