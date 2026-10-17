package com.revolut.core.ui_kit.internal.views;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOverlay;
import androidx.appcompat.widget.SwitchCompat;
import androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import ms0.v4;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u001d\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0012\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0018\u001a\u00020\u000e2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0000¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Lcom/revolut/core/ui_kit/internal/views/SwitcherView;", "Landroidx/appcompat/widget/SwitchCompat;", "Lrr0/d;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Landroid/graphics/drawable/Drawable;", "getProgressDrawable", "()Landroid/graphics/drawable/Drawable;", "Landroid/view/View$OnTouchListener;", "listener", "", "setOnTouchListener", "(Landroid/view/View$OnTouchListener;)V", "Landroid/view/View$OnClickListener;", "setOnClickListener", "(Landroid/view/View$OnClickListener;)V", "Lfu0/h;", "target", "setLoadingHighlightTarget$ui_kit_components_release", "(Lfu0/h;)V", "setLoadingHighlightTarget", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SwitcherView extends SwitchCompat implements rr0.d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f56428c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rr0.g f56429a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Drawable f56430b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SwitcherView(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f56429a = s.b(this, true);
        int iS = kli.a.s(R$attr.uikit_colorBackground, context);
        int iS2 = kli.a.s(R$attr.uikit_colorAccent, context);
        int iS3 = kli.a.s(R$attr.uikit_colorGreyTone20, context);
        int iS4 = kli.a.s(R$attr.uikit_colorGreyTone10, context);
        int[] iArr = {iS2, -1, io0.c.e(0.4f, iS2, iS), io0.c.e(0.8f, kli.a.s(R$attr.uikit_colorGreyTone5, context), -1)};
        int[][] iArr2 = v4.f208469a;
        setThumbTintList(new ColorStateList(iArr2, iArr));
        setTrackTintList(new ColorStateList(iArr2, new int[]{io0.c.e(0.5f, iS2, iS), iS3, io0.c.e(0.28f, iS2, iS), iS4}));
        setSwitchMinWidth(kli.a.k(context, 50.0f));
    }

    private final Drawable getProgressDrawable() {
        Drawable drawableD = this.f56430b;
        if (drawableD == null) {
            AnimatedVectorDrawableCompat animatedVectorDrawableCompatCreate = AnimatedVectorDrawableCompat.create(getContext(), R$drawable.uikit_icn_48_loading_anim);
            if (animatedVectorDrawableCompatCreate == null || (drawableD = animatedVectorDrawableCompatCreate.mutate()) == null) {
                drawableD = dr0.l.d(0);
            }
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            drawableD.setTintList(kli.a.u(R$attr.uikit_colorAccent, context));
            Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            if (jq0.a.a(context2) && (drawableD instanceof Animatable)) {
                ((Animatable) drawableD).start();
            }
            this.f56430b = drawableD;
        }
        return drawableD;
    }

    @Override // rr0.d
    public final void L(boolean z) {
        int i;
        if (z) {
            Drawable progressDrawable = getProgressDrawable();
            getOverlay().add(progressDrawable);
            if (isLaidOut()) {
                a(progressDrawable);
            }
            i = 0;
        } else {
            Drawable drawable = this.f56430b;
            if (drawable != null) {
                ViewOverlay overlay = getOverlay();
                Intrinsics.checkNotNullExpressionValue(overlay, "getOverlay(...)");
                overlay.remove(drawable);
            }
            i = 255;
        }
        Drawable thumbDrawable = getThumbDrawable();
        if (thumbDrawable != null) {
            thumbDrawable.setAlpha(i);
        }
        Drawable trackDrawable = getTrackDrawable();
        if (trackDrawable != null) {
            trackDrawable.setAlpha(i);
        }
    }

    public final void a(Drawable drawable) {
        int width = getWidth();
        int height = getHeight();
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int iMin = Math.min(height, Math.min(width, kli.a.k(context, 24.0f)));
        int i = (width - iMin) / 2;
        int i2 = (height - iMin) / 2;
        drawable.setBounds(i, i2, i + iMin, iMin + i2);
    }

    @Override // androidx.appcompat.widget.SwitchCompat, android.widget.TextView, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i5) {
        Drawable drawable;
        super.onLayout(z, i, i2, i3, i5);
        if (!z || (drawable = this.f56430b) == null) {
            return;
        }
        a(drawable);
    }

    public final void setLoadingHighlightTarget$ui_kit_components_release(fu0.h target) {
        if (target == null) {
            target = new twg.c(this);
        }
        this.f56429a.f(target);
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener listener) {
        super.setOnClickListener(listener != null ? new kp0.l(this, listener, 7) : null);
    }

    @Override // android.view.View
    public void setOnTouchListener(View.OnTouchListener listener) {
        super.setOnTouchListener(listener != null ? new ar0.a(this, listener, 8) : null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SwitcherView(@NotNull Context context) {
        this(context, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
