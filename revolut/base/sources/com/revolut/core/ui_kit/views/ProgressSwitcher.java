package com.revolut.core.ui_kit.views;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0017\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u000f2\b\b\u0001\u0010\u0012\u001a\u00020\u0006¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u0006¢\u0006\u0004\b\u0016\u0010\u0014J\u0017\u0010\u0018\u001a\u00020\u000f2\b\b\u0001\u0010\u0017\u001a\u00020\u0006¢\u0006\u0004\b\u0018\u0010\u0014J\u0017\u0010\u001a\u001a\u00020\u000f2\b\b\u0001\u0010\u0019\u001a\u00020\u0006¢\u0006\u0004\b\u001a\u0010\u0014R(\u0010 \u001a\u0004\u0018\u00010\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0004@BX\u0084\u000e¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u000b\u0010\u001f¨\u0006!"}, d2 = {"Lcom/revolut/core/ui_kit/views/ProgressSwitcher;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/widget/ImageView;", "getProgressView", "()Landroid/widget/ImageView;", "", "visible", "", "setProgressVisible", "(Z)V", "size", "setProgressSize", "(I)V", "gravity", "setProgressGravity", "color", "setProgressTintColor", "colorAttr", "setProgressTintAttr", "Landroidx/appcompat/widget/AppCompatImageView;", "value", "a", "Landroidx/appcompat/widget/AppCompatImageView;", "()Landroidx/appcompat/widget/AppCompatImageView;", "progressView", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public class ProgressSwitcher extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public AppCompatImageView progressView;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f58843b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f58844c;
    public int d;
    public int e;
    public int f;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ProgressSwitcher(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public void L(boolean z) {
        setProgressVisible(z);
    }

    public final int b() {
        if (this.f == 0) {
            return this.e;
        }
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        return kli.a.s(this.f, context);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j2) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        if (!this.f58843b || view == this.progressView) {
            return super.drawChild(canvas, view, j2);
        }
        return true;
    }

    public final AppCompatImageView getProgressView() {
        return this.progressView;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f58843b) {
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f58843b) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void setProgressGravity(int gravity) {
        this.d = gravity;
        AppCompatImageView appCompatImageView = this.progressView;
        if (appCompatImageView != null) {
            ViewGroup.LayoutParams layoutParams = appCompatImageView.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            }
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            layoutParams2.gravity = gravity;
            appCompatImageView.setLayoutParams(layoutParams2);
        }
    }

    public final void setProgressSize(int size) {
        this.f58844c = size;
        AppCompatImageView appCompatImageView = this.progressView;
        if (appCompatImageView != null) {
            or0.u.A(appCompatImageView, size, size);
        }
    }

    public final void setProgressTintAttr(int colorAttr) {
        if (this.f == colorAttr || colorAttr == 0) {
            return;
        }
        this.f = colorAttr;
        this.e = 0;
        AppCompatImageView appCompatImageView = this.progressView;
        if (appCompatImageView != null) {
            appCompatImageView.setColorFilter(b());
        }
    }

    public final void setProgressTintColor(int color) {
        if (this.e != color) {
            this.e = color;
            this.f = 0;
            AppCompatImageView appCompatImageView = this.progressView;
            if (appCompatImageView != null) {
                appCompatImageView.setColorFilter(b());
            }
        }
    }

    public final void setProgressVisible(boolean visible) {
        if (visible == this.f58843b) {
            return;
        }
        this.f58843b = visible;
        getProgressView().setVisibility(this.f58843b ? 0 : 4);
        cancelPendingInputEvents();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ProgressSwitcher(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final ImageView getProgressView() {
        AppCompatImageView appCompatImageView = this.progressView;
        if (appCompatImageView == null) {
            appCompatImageView = new AppCompatImageView(getContext());
            int iK = this.f58844c;
            if (iK == 0) {
                Context context = appCompatImageView.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                iK = kli.a.k(context, 24.0f);
            }
            appCompatImageView.setLayoutParams(new FrameLayout.LayoutParams(iK, iK, this.d));
            AnimatedVectorDrawableCompat animatedVectorDrawableCompatCreate = AnimatedVectorDrawableCompat.create(appCompatImageView.getContext(), R$drawable.uikit_icn_48_loading_anim);
            appCompatImageView.setImageDrawable(animatedVectorDrawableCompatCreate);
            appCompatImageView.setColorFilter(b());
            Context context2 = appCompatImageView.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            if (jq0.a.a(context2) && animatedVectorDrawableCompatCreate != null) {
                animatedVectorDrawableCompatCreate.start();
            }
            addView(appCompatImageView);
            this.progressView = appCompatImageView;
        }
        return appCompatImageView;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProgressSwitcher(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.d = 17;
        this.f = R$attr.uikit_colorForeground;
    }

    public /* synthetic */ ProgressSwitcher(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
