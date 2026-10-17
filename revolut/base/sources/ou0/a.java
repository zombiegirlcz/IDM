package ou0;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.BlurMaskFilter;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.jvm.internal.Intrinsics;
import mx0.w5;

/* JADX INFO: loaded from: classes19.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f229750a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Paint f229751b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Paint f229752c;
    public int d;
    public int e;
    public int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ValueAnimator f229753g;

    public a(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.f229750a = view;
        this.f229751b = new Paint(1);
    }

    public final void a(boolean z) {
        ValueAnimator valueAnimator = this.f229753g;
        Object animatedValue = valueAnimator != null ? valueAnimator.getAnimatedValue() : null;
        Float f = animatedValue instanceof Float ? (Float) animatedValue : null;
        float f4 = BitmapDescriptorFactory.HUE_RED;
        float fFloatValue = f != null ? f.floatValue() : 0.0f;
        if (z) {
            f4 = 1.0f;
        }
        if (fFloatValue != f4 || (valueAnimator != null && valueAnimator.isRunning())) {
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(new float[0]);
            valueAnimatorOfFloat.addUpdateListener(new w5(this, 2));
            valueAnimatorOfFloat.setDuration(200L);
            this.f229753g = valueAnimatorOfFloat;
            valueAnimatorOfFloat.setFloatValues(fFloatValue, f4);
            valueAnimatorOfFloat.start();
        }
    }

    public void b() {
        Context context = this.f229750a.getContext();
        Intrinsics.h(context);
        this.d = kli.a.s(R$attr.uikit_colorOnAccent, context);
        this.e = kli.a.s(R$attr.uikit_colorAccentControlNeutral, context);
        if (kli.a.q(context)) {
            Paint paint = new Paint(1);
            paint.setMaskFilter(new BlurMaskFilter(kli.a.l(context, 16.0f), BlurMaskFilter.Blur.NORMAL));
            paint.setColor(kli.a.s(R$attr.uikit_colorAccentControlNeutral, context));
            ColorMatrix colorMatrix = new ColorMatrix();
            colorMatrix.setScale(0.8f, 0.8f, 0.8f, 1.0f);
            paint.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
            paint.setAlpha(0);
            this.f229752c = paint;
        }
        this.f = kli.a.s(R$attr.uikit_colorGreyTone10, context);
    }

    public abstract void c(float f);

    public final void d(MotionEvent event, boolean z) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (this.f229750a.isEnabled()) {
            if (event.getAction() == 0 && z) {
                a(true);
            } else if (event.getAction() == 1 || event.getAction() == 3) {
                a(false);
            }
        }
    }
}
