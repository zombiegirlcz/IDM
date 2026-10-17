package com.revolut.core.ui_kit.internal.views.framelayout;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import androidx.transition.RevTransitionUtils;
import aw0.d0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import ms0.k5;
import nt0.c;
import nt0.d;
import ny0.h;
import ny0.k;
import org.jetbrains.annotations.NotNull;
import ut0.b;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0017\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0004:\u0002\u0012\u0017B'\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u000f2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0016\u0010\u0011R\"\u0010\u001c\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u0011R\u0014\u0010\u001e\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001a¨\u0006\u001f"}, d2 = {"Lcom/revolut/core/ui_kit/internal/views/framelayout/UIKitFrameLayout;", "Landroid/widget/FrameLayout;", "Lms0/k5;", "Lut0/b;", "", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "value", "", "setReadableAreaGuidelinesEnabled", "(Z)V", "Lnt0/c;", "config", "setAspectRatio", "(Lnt0/c;)V", "setFitsReadableArea", "a", "Z", "getTouchingEnabled", "()Z", "setTouchingEnabled", "touchingEnabled", "getFitsReadableArea", "fitsReadableArea", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public class UIKitFrameLayout extends FrameLayout implements k5, b, h {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public boolean touchingEnabled;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f57098b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f57099c;
    public a d;
    public c e;
    public boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final k f57100g;

    public static final class a implements View.OnLayoutChangeListener {
        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(View v, int i, int i2, int i3, int i5, int i6, int i21, int i22, int i32) {
            Intrinsics.checkNotNullParameter(v, "v");
            RevTransitionUtils.setLeftTopRightBottom(v, i, i2, (i22 - i6) + i, (i32 - i21) + i2);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public UIKitFrameLayout(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public void a(int i, int i2, int i3, int i5, boolean z) {
        super.onLayout(z, i, i2, i3, i5);
    }

    public final void b(boolean z) {
        if (z == this.f57098b) {
            return;
        }
        this.f57098b = z;
        if (z) {
            a aVar = this.d;
            if (aVar == null) {
                aVar = new a();
                this.d = aVar;
            }
            addOnLayoutChangeListener(aVar);
        } else {
            View.OnLayoutChangeListener onLayoutChangeListener = this.d;
            if (onLayoutChangeListener != null) {
                removeOnLayoutChangeListener(onLayoutChangeListener);
            }
            if (this.f57099c) {
                requestLayout();
            }
        }
        this.f57099c = false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (this.touchingEnabled) {
            return super.dispatchTouchEvent(event);
        }
        return false;
    }

    @Override // ny0.h
    public boolean getFitsReadableArea() {
        return this.f;
    }

    public final boolean getTouchingEnabled() {
        return this.touchingEnabled;
    }

    @Override // ut0.b
    public final void j(int i, int i2) {
        super.onMeasure(i, i2);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i5) {
        if (this.f57098b) {
            this.f57099c = true;
        } else {
            a(i, i2, i3, i5, z);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int i3;
        int i5;
        this.f57100g.b(i);
        c cVar = this.e;
        if (cVar == null) {
            super.onMeasure(i, i2);
            return;
        }
        int i6 = cVar.f218945c;
        int i21 = d.f218946a[cVar.f218944b.ordinal()];
        if (i21 == 1) {
            i3 = i6;
            i5 = Integer.MAX_VALUE;
        } else {
            if (i21 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i5 = i6;
            i3 = Integer.MAX_VALUE;
        }
        d0 d0Var = cVar.f218943a;
        ut0.d.a(this, i, i2, d0Var.f10274a / d0Var.f10275b, cVar.f218944b, i3, i5);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.f57098b) {
            this.f57099c = true;
        } else {
            super.requestLayout();
        }
    }

    public final void setAspectRatio(c config) {
        if (Intrinsics.f(this.e, config)) {
            return;
        }
        this.e = config;
        requestLayout();
    }

    public void setFitsReadableArea(boolean value) {
        if (this.f == value) {
            return;
        }
        this.f = value;
        requestLayout();
    }

    public void setReadableAreaGuidelinesEnabled(boolean value) {
        this.f57100g.d(value);
    }

    public final void setTouchingEnabled(boolean z) {
        this.touchingEnabled = z;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public UIKitFrameLayout(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UIKitFrameLayout(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.touchingEnabled = true;
        this.f57100g = new k(this);
    }

    public /* synthetic */ UIKitFrameLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
