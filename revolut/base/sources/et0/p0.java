package et0;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.Interpolator;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import au0.b5;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class p0 extends FrameLayout {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ int f129086m = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AppCompatImageView f129087a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AppCompatImageView f129088b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f129089c;
    public final int d;
    public final int e;
    public boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f129090g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final AnimatorSet f129091h;
    public final ResourceImage i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ResourceImage f129092j;
    public float k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Paint f129093l;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public p0(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setExpanded(boolean z) {
        if (this.f != z) {
            this.f = z;
            requestLayout();
        }
    }

    public final void b() {
        this.f129090g = false;
        this.f129091h.cancel();
        setExpanded(true);
        this.k = BitmapDescriptorFactory.HUE_RED;
        AppCompatImageView appCompatImageView = this.f129087a;
        appCompatImageView.setAlpha(1.0f);
        appCompatImageView.setScaleX(1.0f);
        appCompatImageView.setScaleY(1.0f);
        appCompatImageView.setTranslationY(BitmapDescriptorFactory.HUE_RED);
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        yy0.f.e(jh.d.f(context).Q(), this.i, appCompatImageView, null, null, 12);
        AppCompatImageView appCompatImageView2 = this.f129088b;
        appCompatImageView2.setScaleX(1.0f);
        appCompatImageView2.setScaleY(1.0f);
        appCompatImageView2.setVisibility(0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        canvas.drawRoundRect(BitmapDescriptorFactory.HUE_RED, this.k, getWidth(), getHeight(), getWidth() / 2.0f, getWidth() / 2.0f, this.f129093l);
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(this.f129089c, 1073741824), View.MeasureSpec.makeMeasureSpec(this.f ? this.d : this.e, 1073741824));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public p0(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        int iK = kli.a.k(context, 40.0f);
        this.f129089c = iK;
        this.d = kli.a.k(context, 68.0f);
        int iK2 = kli.a.k(context, 40.0f);
        this.e = iK2;
        int iK3 = kli.a.k(context, 16.0f);
        this.f = true;
        ResourceImage resourceImage = new ResourceImage(R$drawable.uikit_icn_24_lock_opened, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone50), (List) null, (ImageTransformations) null, (Clause) null, 246);
        this.i = resourceImage;
        this.f129092j = new ResourceImage(R$drawable.uikit_icn_24_lock_anim, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone50), (List) null, (ImageTransformations) null, (Clause) null, 246);
        Paint paint = new Paint();
        paint.setColor(kli.a.s(R$attr.uikit_colorSearchBackground, context));
        paint.setAntiAlias(true);
        this.f129093l = paint;
        AppCompatImageView appCompatImageView = new AppCompatImageView(context);
        appCompatImageView.setLayoutParams(new FrameLayout.LayoutParams(iK, iK2, 48));
        int iK4 = kli.a.k(context, 8.0f);
        appCompatImageView.setPadding(iK4, iK4, iK4, iK4);
        yy0.f.e(jh.d.f(context).Q(), resourceImage, appCompatImageView, null, null, 12);
        this.f129087a = appCompatImageView;
        addView(appCompatImageView);
        AppCompatImageView appCompatImageView2 = new AppCompatImageView(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iK3, iK3, 81);
        layoutParams.bottomMargin = kli.a.k(context, 8.0f);
        appCompatImageView2.setLayoutParams(layoutParams);
        yy0.f.e(jh.d.f(context).Q(), new ResourceImage(R$drawable.uikit_icn_16_chevron_up, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone50), (List) null, (ImageTransformations) null, (Clause) null, 246), appCompatImageView2, null, null, 12);
        this.f129088b = appCompatImageView2;
        addView(appCompatImageView2);
        AnimatorSet animatorSet = new AnimatorSet();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(BitmapDescriptorFactory.HUE_RED, 1.0f);
        valueAnimatorOfFloat.setDuration(200L);
        Interpolator interpolator = jq0.r.f177392a;
        valueAnimatorOfFloat.setInterpolator(interpolator);
        o0 o0Var = new o0(valueAnimatorOfFloat, this, 0);
        valueAnimatorOfFloat.addListener(o0Var);
        valueAnimatorOfFloat.addUpdateListener(o0Var);
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(BitmapDescriptorFactory.HUE_RED, 1.0f);
        valueAnimatorOfFloat2.setDuration(200L);
        valueAnimatorOfFloat2.setInterpolator(interpolator);
        o0 o0Var2 = new o0(valueAnimatorOfFloat2, this, 2);
        valueAnimatorOfFloat2.addListener(o0Var2);
        valueAnimatorOfFloat2.addUpdateListener(o0Var2);
        ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(BitmapDescriptorFactory.HUE_RED, 1.0f);
        valueAnimatorOfFloat3.setStartDelay(400L);
        valueAnimatorOfFloat3.setDuration(200L);
        valueAnimatorOfFloat3.setInterpolator(interpolator);
        valueAnimatorOfFloat3.addUpdateListener(new b5(this, 13));
        ValueAnimator valueAnimatorOfFloat4 = ValueAnimator.ofFloat(BitmapDescriptorFactory.HUE_RED, 1.0f);
        valueAnimatorOfFloat4.setDuration(200L);
        valueAnimatorOfFloat4.setInterpolator(interpolator);
        o0 o0Var3 = new o0(valueAnimatorOfFloat4, this, 1);
        valueAnimatorOfFloat4.addListener(o0Var3);
        valueAnimatorOfFloat4.addUpdateListener(o0Var3);
        animatorSet.playSequentially(valueAnimatorOfFloat, valueAnimatorOfFloat2, valueAnimatorOfFloat3, valueAnimatorOfFloat4);
        this.f129091h = animatorSet;
    }

    public /* synthetic */ p0(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
