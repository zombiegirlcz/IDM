package com.revolut.core.ui_kit.views;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import mx0.x5;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u0000 \u000f2\u00020\u0001:\u0002\n\u0010B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Lcom/revolut/core/ui_kit/views/FadingImageBackgroundLayout;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lmx0/x5;", "model", "", "setModel", "(Lmx0/x5;)V", "Companion", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class FadingImageBackgroundLayout extends ConstraintLayout {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FadeBottomImageView f58540b;
    public final Paint f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Paint f58541g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f58542h;
    public x5 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ValueAnimator f58543j;

    /* JADX INFO: renamed from: com.revolut.core.ui_kit.views.FadingImageBackgroundLayout$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FadingImageBackgroundLayout(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View child, long j2) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(child, "child");
        boolean zDrawChild = super.drawChild(canvas, child, j2);
        if (Intrinsics.f(child, this.f58540b)) {
            canvas.drawRect(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, getWidth(), getHeight(), this.f58541g);
        }
        return zDrawChild;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ValueAnimator valueAnimator = this.f58543j;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        int i = this.f58542h;
        Paint paint = this.f;
        paint.setAlpha(i);
        canvas.drawRect(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, getWidth(), getHeight(), paint);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i5) {
        super.onSizeChanged(i, i2, i3, i5);
        if (i == 0 || i2 == 0) {
            return;
        }
        this.f58541g.setShader(new LinearGradient(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, i2, new int[]{0, io0.a.d(0.3f, -16777216), io0.a.d(0.7f, -16777216)}, new float[]{0.4f, 0.6f, 1.0f}, Shader.TileMode.CLAMP));
    }

    public final void setModel(@NotNull x5 model) {
        Intrinsics.checkNotNullParameter(model, "model");
        if (Intrinsics.f(this.i, model)) {
            return;
        }
        x5 x5Var = this.i;
        this.i = model;
        boolean z = true;
        boolean z3 = x5Var == null || !x5Var.f210105a.equals(model.f210105a);
        if (x5Var != null && x5Var.f210106b == model.f210106b) {
            z = false;
        }
        FadeBottomImageView fadeBottomImageView = this.f58540b;
        if (z3) {
            ValueAnimator valueAnimator = this.f58543j;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            fadeBottomImageView.setAlpha(BitmapDescriptorFactory.HUE_RED);
            fadeBottomImageView.setImageDrawable(null);
            this.f58542h = 0;
            yy0.f.e(or0.u.k(this).Q(), model.f210105a, this.f58540b, new mqi.a(this, 28), null, 8);
            invalidate();
        }
        if (z) {
            int i = model.f210106b;
            ViewGroup.LayoutParams layoutParams = fadeBottomImageView.getLayoutParams();
            ConstraintLayout.LayoutParams layoutParams2 = layoutParams instanceof ConstraintLayout.LayoutParams ? (ConstraintLayout.LayoutParams) layoutParams : null;
            if (layoutParams2 != null) {
                layoutParams2.bottomToTop = i;
                fadeBottomImageView.setLayoutParams(layoutParams2);
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FadingImageBackgroundLayout(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FadingImageBackgroundLayout(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        FadeBottomImageView fadeBottomImageView = new FadeBottomImageView(context, null, 6, 0);
        fadeBottomImageView.setId(View.generateViewId());
        fadeBottomImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        fadeBottomImageView.setImportantForAccessibility(2);
        fadeBottomImageView.setFadeRatio(0.5f);
        this.f58540b = fadeBottomImageView;
        this.f = new Paint(1);
        this.f58541g = new Paint(1);
        setWillNotDraw(false);
        ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(-1, 0);
        layoutParams.topToTop = 0;
        layoutParams.bottomToTop = -1;
        layoutParams.startToStart = 0;
        layoutParams.endToEnd = 0;
        Unit unit = Unit.f186387a;
        addView(fadeBottomImageView, layoutParams);
    }

    public /* synthetic */ FadingImageBackgroundLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
