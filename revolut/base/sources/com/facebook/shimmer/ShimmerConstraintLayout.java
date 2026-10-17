package com.facebook.shimmer;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.ViewGroupKt;
import c9.e;
import c9.f;
import c9.g;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.internal.shimmer.RevolutShimmerDrawable;
import cs0.a;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import ms0.a4;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001:\u0001\nB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/facebook/shimmer/ShimmerConstraintLayout;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lc9/f;", "shimmerMode", "", "setShimmerMode", "(Lc9/f;)V", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public class ShimmerConstraintLayout extends ConstraintLayout {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Paint f26145b;
    public ShimmerDrawable f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public RevolutShimmerDrawable f26146g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f26147h;
    public final Path i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public f f26148j;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ShimmerConstraintLayout(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        if (!this.f26147h) {
            super.dispatchDraw(canvas);
            return;
        }
        int i = g.f22263a[this.f26148j.ordinal()];
        if (i == 1) {
            super.dispatchDraw(canvas);
            canvas.save();
            canvas.clipPath(this.i);
            ShimmerDrawable shimmerDrawable = this.f;
            if (shimmerDrawable != null) {
                shimmerDrawable.draw(canvas);
            }
            RevolutShimmerDrawable revolutShimmerDrawable = this.f26146g;
            if (revolutShimmerDrawable != null) {
                revolutShimmerDrawable.draw(canvas);
            }
            canvas.restore();
            return;
        }
        if (i == 2) {
            int iSaveLayer = canvas.saveLayer(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, getWidth(), getHeight(), null);
            super.dispatchDraw(canvas);
            ShimmerDrawable shimmerDrawable2 = this.f;
            if (shimmerDrawable2 != null) {
                shimmerDrawable2.draw(canvas);
            }
            RevolutShimmerDrawable revolutShimmerDrawable2 = this.f26146g;
            if (revolutShimmerDrawable2 != null) {
                revolutShimmerDrawable2.draw(canvas);
            }
            canvas.restoreToCount(iSaveLayer);
            return;
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        super.dispatchDraw(canvas);
        ShimmerDrawable shimmerDrawable3 = this.f;
        if (shimmerDrawable3 != null) {
            shimmerDrawable3.draw(canvas);
        }
        RevolutShimmerDrawable revolutShimmerDrawable3 = this.f26146g;
        if (revolutShimmerDrawable3 != null) {
            revolutShimmerDrawable3.draw(canvas);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void f0(int i, int i2, ViewGroup viewGroup) {
        for (View view : ViewGroupKt.getChildren(viewGroup)) {
            if (view instanceof a4) {
                ((a4) view).a(view.getLeft() + i, view.getTop() + i2, this.i);
            } else if (view instanceof ViewGroup) {
                ViewGroup viewGroup2 = (ViewGroup) view;
                f0(viewGroup2.getLeft() + i, viewGroup2.getTop() + i2, viewGroup2);
            }
        }
    }

    public final void g0() {
        if (this.f26147h) {
            m0();
            this.f26147h = false;
            invalidate();
        }
    }

    public final void h0(a aVar) {
        ShimmerDrawable shimmerDrawable = this.f;
        if (shimmerDrawable != null) {
            shimmerDrawable.c();
        }
        this.f = null;
        RevolutShimmerDrawable revolutShimmerDrawable = this.f26146g;
        if (revolutShimmerDrawable == null) {
            revolutShimmerDrawable = new RevolutShimmerDrawable();
            this.f26146g = revolutShimmerDrawable;
            revolutShimmerDrawable.setCallback(this);
            revolutShimmerDrawable.setBounds(0, 0, getWidth(), getHeight());
        }
        revolutShimmerDrawable.a(aVar);
    }

    public final void i0(e eVar) {
        RevolutShimmerDrawable revolutShimmerDrawable = this.f26146g;
        if (revolutShimmerDrawable != null) {
            revolutShimmerDrawable.c();
        }
        this.f26146g = null;
        ShimmerDrawable shimmerDrawable = this.f;
        if (shimmerDrawable == null) {
            shimmerDrawable = new ShimmerDrawable();
            this.f = shimmerDrawable;
            shimmerDrawable.setCallback(this);
            shimmerDrawable.setBounds(0, 0, getWidth(), getHeight());
        }
        shimmerDrawable.b(eVar);
        if (eVar == null || !eVar.f22257n) {
            setLayerType(0, null);
        } else {
            setLayerType(2, this.f26145b);
        }
    }

    public final void j0() {
        if (this.f26147h) {
            return;
        }
        this.f26147h = true;
        l0();
    }

    public final void l0() {
        ValueAnimator valueAnimator;
        ShimmerDrawable shimmerDrawable = this.f;
        if (shimmerDrawable != null && (valueAnimator = shimmerDrawable.e) != null && !valueAnimator.isStarted() && shimmerDrawable.getCallback() != null) {
            shimmerDrawable.e.start();
        }
        RevolutShimmerDrawable revolutShimmerDrawable = this.f26146g;
        if (revolutShimmerDrawable != null) {
            revolutShimmerDrawable.c();
            revolutShimmerDrawable.b();
        }
    }

    public final void m0() {
        ShimmerDrawable shimmerDrawable = this.f;
        if (shimmerDrawable != null) {
            shimmerDrawable.c();
        }
        RevolutShimmerDrawable revolutShimmerDrawable = this.f26146g;
        if (revolutShimmerDrawable != null) {
            revolutShimmerDrawable.c();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ShimmerDrawable shimmerDrawable = this.f;
        if (shimmerDrawable != null) {
            shimmerDrawable.a();
        }
        RevolutShimmerDrawable revolutShimmerDrawable = this.f26146g;
        if (revolutShimmerDrawable != null) {
            revolutShimmerDrawable.b();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m0();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i5) {
        super.onLayout(z, i, i2, i3, i5);
        if (this.f26148j == f.SHIMMERING_CHILDREN_ONLY) {
            this.i.reset();
            f0(0, 0, this);
        }
        int width = getWidth();
        int height = getHeight();
        ShimmerDrawable shimmerDrawable = this.f;
        if (shimmerDrawable != null) {
            shimmerDrawable.setBounds(0, 0, width, height);
        }
        RevolutShimmerDrawable revolutShimmerDrawable = this.f26146g;
        if (revolutShimmerDrawable != null) {
            revolutShimmerDrawable.setBounds(0, 0, width, height);
        }
    }

    public final void setShimmerMode(@NotNull f shimmerMode) {
        Intrinsics.checkNotNullParameter(shimmerMode, "shimmerMode");
        this.f26148j = shimmerMode;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable who) {
        Intrinsics.checkNotNullParameter(who, "who");
        return super.verifyDrawable(who) || who == this.f || who == this.f26146g;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ShimmerConstraintLayout(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShimmerConstraintLayout(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f26145b = new Paint();
        this.f26147h = true;
        this.i = new Path();
        this.f26148j = f.ALL_CHILDREN_BOUNDS;
        setWillNotDraw(false);
    }

    public /* synthetic */ ShimmerConstraintLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
