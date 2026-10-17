package com.revolut.kompot.view;

import android.content.Context;
import android.graphics.PointF;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.WindowInsets;
import android.widget.FrameLayout;
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

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u000e\u001a\u00020\u000b8VX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0012\u001a\u00020\u000b8\u0016@\u0016X\u0096\u000f¢\u0006\f\u001a\u0004\b\u000f\u0010\r\"\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0015\u001a\u00020\u000b8\u0016@\u0016X\u0096\u000f¢\u0006\f\u001a\u0004\b\u0013\u0010\r\"\u0004\b\u0014\u0010\u0011R\u001c\u0010\u001b\u001a\u00020\u00168\u0016@\u0016X\u0096\u000f¢\u0006\f\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001d\u001a\u00020\u000b8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u001c\u0010\rR\u0016\u0010!\u001a\u0004\u0018\u00010\u001e8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0016\u0010%\u001a\u0004\u0018\u00010\"8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b#\u0010$¨\u0006&"}, d2 = {"Lcom/revolut/kompot/view/ControllerContainerFrameLayout;", "Landroid/widget/FrameLayout;", "Lhli/e;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "getFitsReadableArea", "()Z", "fitsReadableArea", "getFitStatusBar", "setFitStatusBar", "(Z)V", "fitStatusBar", "getFitNavigationBar", "setFitNavigationBar", "fitNavigationBar", "", "getContainerId", "()Ljava/lang/String;", "setContainerId", "(Ljava/lang/String;)V", "containerId", "getControllersTransitionActive", "controllersTransitionActive", "Landroid/view/WindowInsets;", "getLatestAppliedInsets", "()Landroid/view/WindowInsets;", "latestAppliedInsets", "Landroid/graphics/PointF;", "getLatestDispatchedDownEvent", "()Landroid/graphics/PointF;", "latestDispatchedDownEvent", "kompot_ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public class ControllerContainerFrameLayout extends FrameLayout implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h f98451a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f98452b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ControllerContainerFrameLayout(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // hli.e
    public final void J(SparseArray outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        this.f98451a.i = true;
        dispatchSaveInstanceState(outState);
    }

    @Override // hli.e
    public final void J0() {
        this.f98451a.e = null;
    }

    @Override // hli.e
    public final void N0() {
        this.f98451a.e = null;
    }

    @Override // hli.e
    public final c W(Lifecycle controllerLifecycle) {
        Intrinsics.checkNotNullParameter(controllerLifecycle, "controllerLifecycle");
        return this.f98451a.W(controllerLifecycle);
    }

    @Override // hli.e
    public final void c0(boolean z) {
        this.f98451a.c0(z);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray container) {
        Intrinsics.checkNotNullParameter(container, "container");
        if (this.f98451a.c()) {
            super.dispatchRestoreInstanceState(container);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchSaveInstanceState(SparseArray container) {
        Intrinsics.checkNotNullParameter(container, "container");
        if (this.f98451a.c()) {
            super.dispatchSaveInstanceState(container);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent ev10) {
        Intrinsics.checkNotNullParameter(ev10, "ev");
        Intrinsics.checkNotNullParameter(this, "containerView");
        Intrinsics.checkNotNullParameter(ev10, "ev");
        return this.f98451a.b(ev10, this) || super.dispatchTouchEvent(ev10);
    }

    @Override // hli.e
    public final void e(SparseArray state) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.f98451a.i = true;
        dispatchRestoreInstanceState(state);
    }

    @Override // hli.e
    @NotNull
    public String getContainerId() {
        return this.f98451a.d;
    }

    @Override // hli.e
    public boolean getControllersTransitionActive() {
        return this.f98451a.getControllersTransitionActive();
    }

    @Override // hli.e
    public boolean getFitNavigationBar() {
        return this.f98451a.f153473c;
    }

    @Override // hli.e
    public boolean getFitStatusBar() {
        return this.f98451a.f153472b;
    }

    @Override // hli.e, ny0.h
    /* JADX INFO: renamed from: getFitsReadableArea */
    public boolean getF56471r() {
        this.f98451a.getClass();
        return false;
    }

    @Override // hli.e
    public WindowInsets getLatestAppliedInsets() {
        return this.f98451a.f153474g;
    }

    @Override // hli.e
    public PointF getLatestDispatchedDownEvent() {
        return this.f98451a.f153475h;
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets insets) {
        Intrinsics.checkNotNullParameter(insets, "insets");
        Intrinsics.checkNotNullParameter(this, "controllerContainer");
        Intrinsics.checkNotNullParameter(insets, "insets");
        return this.f98451a.a(this, insets);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        Intrinsics.checkNotNullParameter(this, "containerView");
        this.f98451a.getClass();
        Intrinsics.checkNotNullParameter(this, "containerView");
        ViewCompat.requestApplyInsets(this);
        super.onAttachedToWindow();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        this.f98452b.b(i);
        super.onMeasure(i, i2);
    }

    @Override // hli.e
    public void setContainerId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.f98451a.setContainerId(str);
    }

    @Override // hli.e
    public void setFitNavigationBar(boolean z) {
        this.f98451a.f153473c = z;
    }

    @Override // hli.e
    public void setFitStatusBar(boolean z) {
        this.f98451a.f153472b = z;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ControllerContainerFrameLayout(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ControllerContainerFrameLayout(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f98451a = new h(context, attributeSet);
        k kVar = new k(this);
        this.f98452b = kVar;
        kVar.d(!((Boolean) g.d().getValue()).booleanValue());
    }

    public /* synthetic */ ControllerContainerFrameLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
