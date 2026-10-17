package com.revolut.kompot.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PointF;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowInsets;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.ViewCompat;
import androidx.lifecycle.Lifecycle;
import hli.c;
import hli.e;
import hli.h;
import jo0.g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import ny0.k;
import org.jetbrains.annotations.NotNull;
import pp0.a;
import pp0.b;
import ro0.q;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B'\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0000H\u0016¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0011\u0010\u0013\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0017\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\u00188VX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\u001f\u001a\u00020\u00188\u0016@\u0016X\u0096\u000f¢\u0006\f\u001a\u0004\b\u001c\u0010\u001a\"\u0004\b\u001d\u0010\u001eR\u001c\u0010\"\u001a\u00020\u00188\u0016@\u0016X\u0096\u000f¢\u0006\f\u001a\u0004\b \u0010\u001a\"\u0004\b!\u0010\u001eR\u001c\u0010(\u001a\u00020#8\u0016@\u0016X\u0096\u000f¢\u0006\f\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\u0014\u0010*\u001a\u00020\u00188\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b)\u0010\u001aR\u0016\u0010.\u001a\u0004\u0018\u00010+8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b,\u0010-R\u0016\u00102\u001a\u0004\u0018\u00010/8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b0\u00101¨\u00063"}, d2 = {"Lcom/revolut/kompot/view/ControllerContainerConstraintLayout;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lhli/e;", "Lpp0/a;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "getSelf", "()Lcom/revolut/kompot/view/ControllerContainerConstraintLayout;", "Lpp0/b;", "delegate", "", "setDrawingDelegate", "(Lpp0/b;)V", "getDrawingDelegate", "()Lpp0/b;", "getViewWidth", "()I", "getViewHeight", "", "getFitsReadableArea", "()Z", "fitsReadableArea", "getFitStatusBar", "setFitStatusBar", "(Z)V", "fitStatusBar", "getFitNavigationBar", "setFitNavigationBar", "fitNavigationBar", "", "getContainerId", "()Ljava/lang/String;", "setContainerId", "(Ljava/lang/String;)V", "containerId", "getControllersTransitionActive", "controllersTransitionActive", "Landroid/view/WindowInsets;", "getLatestAppliedInsets", "()Landroid/view/WindowInsets;", "latestAppliedInsets", "Landroid/graphics/PointF;", "getLatestDispatchedDownEvent", "()Landroid/graphics/PointF;", "latestDispatchedDownEvent", "kompot_ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public class ControllerContainerConstraintLayout extends ConstraintLayout implements e, a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f98446b;
    public final k f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public b f98447g;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ControllerContainerConstraintLayout(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // hli.e
    public final void J(SparseArray outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        this.f98446b.i = true;
        dispatchSaveInstanceState(outState);
    }

    @Override // hli.e
    public final void J0() {
        this.f98446b.e = null;
    }

    @Override // hli.e
    public final void N0() {
        this.f98446b.e = null;
    }

    @Override // pp0.a
    public final void U(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.dispatchDraw(canvas);
    }

    @Override // hli.e
    public final c W(Lifecycle controllerLifecycle) {
        Intrinsics.checkNotNullParameter(controllerLifecycle, "controllerLifecycle");
        return this.f98446b.W(controllerLifecycle);
    }

    @Override // pp0.a
    public final boolean Z(Canvas canvas, View child, long j2) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(child, "child");
        return super.drawChild(canvas, child, j2);
    }

    @Override // hli.e
    public final void c0(boolean z) {
        this.f98446b.c0(z);
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        b bVar = this.f98447g;
        if (bVar != null) {
            ((q) bVar).a(canvas);
        } else {
            super.dispatchDraw(canvas);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray container) {
        Intrinsics.checkNotNullParameter(container, "container");
        if (this.f98446b.c()) {
            super.dispatchRestoreInstanceState(container);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchSaveInstanceState(SparseArray container) {
        Intrinsics.checkNotNullParameter(container, "container");
        if (this.f98446b.c()) {
            super.dispatchSaveInstanceState(container);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent ev10) {
        Intrinsics.checkNotNullParameter(ev10, "ev");
        Intrinsics.checkNotNullParameter(this, "containerView");
        Intrinsics.checkNotNullParameter(ev10, "ev");
        return this.f98446b.b(ev10, this) || super.dispatchTouchEvent(ev10);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View child, long j2) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(child, "child");
        b bVar = this.f98447g;
        return bVar != null ? ((q) bVar).b(canvas, child, j2) : super.drawChild(canvas, child, j2);
    }

    @Override // hli.e
    public final void e(SparseArray state) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.f98446b.i = true;
        dispatchRestoreInstanceState(state);
    }

    @Override // hli.e
    @NotNull
    public String getContainerId() {
        return this.f98446b.d;
    }

    @Override // hli.e
    public boolean getControllersTransitionActive() {
        return this.f98446b.getControllersTransitionActive();
    }

    @Override // pp0.a
    /* JADX INFO: renamed from: getDrawingDelegate, reason: from getter */
    public b getF98447g() {
        return this.f98447g;
    }

    @Override // hli.e
    public boolean getFitNavigationBar() {
        return this.f98446b.f153473c;
    }

    @Override // hli.e
    public boolean getFitStatusBar() {
        return this.f98446b.f153472b;
    }

    @Override // hli.e, ny0.h
    public boolean getFitsReadableArea() {
        this.f98446b.getClass();
        return false;
    }

    @Override // hli.e
    public WindowInsets getLatestAppliedInsets() {
        return this.f98446b.f153474g;
    }

    @Override // hli.e
    public PointF getLatestDispatchedDownEvent() {
        return this.f98446b.f153475h;
    }

    @Override // pp0.a
    @NotNull
    public ControllerContainerConstraintLayout getSelf() {
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
        return this.f98446b.a(this, insets);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        Intrinsics.checkNotNullParameter(this, "containerView");
        this.f98446b.getClass();
        Intrinsics.checkNotNullParameter(this, "containerView");
        ViewCompat.requestApplyInsets(this);
        super.onAttachedToWindow();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        this.f.b(i);
        super.onMeasure(i, i2);
    }

    @Override // hli.e
    public void setContainerId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.f98446b.setContainerId(str);
    }

    @Override // pp0.a
    public void setDrawingDelegate(b delegate) {
        b bVar = this.f98447g;
        if (bVar != null) {
            ((q) bVar).d(this);
        }
        this.f98447g = delegate;
        if (delegate != null) {
            ((q) delegate).c(this);
        }
    }

    @Override // hli.e
    public void setFitNavigationBar(boolean z) {
        this.f98446b.f153473c = z;
    }

    @Override // hli.e
    public void setFitStatusBar(boolean z) {
        this.f98446b.f153472b = z;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ControllerContainerConstraintLayout(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ControllerContainerConstraintLayout(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f98446b = new h(context, attributeSet);
        k kVar = new k(this);
        this.f = kVar;
        kVar.d(!((Boolean) g.d().getValue()).booleanValue());
    }

    public /* synthetic */ ControllerContainerConstraintLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
