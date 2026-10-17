package iu0;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Paint;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit_resources.R$attr;
import java.util.Arrays;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f168432a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f168433b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f168434c;
    public final float d;
    public final float e;
    public final float f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f168435g;

    public e(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f168432a = context;
        this.f168433b = kli.a.s(R$attr.uikit_colorAccentNeutral, context);
        this.f168434c = kli.a.s(R$attr.uikit_colorAccentNeutral_40, context);
        float fV = kli.a.v(R$attr.uikit_pincode_dot_diameter, context) / 2.0f;
        this.d = fV;
        float fV2 = kli.a.v(R$attr.uikit_pincode_dot_margin, context);
        this.e = fV2;
        this.f = (fV2 + fV) * 2;
        this.f168435g = yhm.j.c(yhm.k.NONE, new ite.d(this, 1));
    }

    public static Paint a(int i) {
        Paint paint = new Paint();
        paint.setColor(i);
        paint.setStyle(Paint.Style.FILL);
        return paint;
    }

    public static ValueAnimator b(e eVar, float[] scaleValues, Function1 onAnimationUpdate) {
        eVar.getClass();
        Intrinsics.checkNotNullParameter(scaleValues, "scaleValues");
        Intrinsics.checkNotNullParameter(onAnimationUpdate, "onAnimationUpdate");
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(Arrays.copyOf(scaleValues, scaleValues.length));
        valueAnimatorOfFloat.setDuration(500L);
        valueAnimatorOfFloat.setInterpolator(new OvershootInterpolator(2.0f));
        et0.c cVar = new et0.c(valueAnimatorOfFloat, new isd.a(21), onAnimationUpdate, 1);
        valueAnimatorOfFloat.addListener(cVar);
        valueAnimatorOfFloat.addUpdateListener(cVar);
        Intrinsics.checkNotNullExpressionValue(valueAnimatorOfFloat, "apply(...)");
        return valueAnimatorOfFloat;
    }

    public static int d(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (mode == Integer.MIN_VALUE) {
            size = Math.min(i, size);
        } else if (mode != 1073741824) {
            size = i;
        }
        if (size < i) {
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.b(rd0.c.WARNING, "DotsModeDelegate", "The view is too small and will be truncated", null, null, 16);
        }
        return size;
    }

    public final ValueAnimator c(Function1 onAnimationUpdate, Function1 onAnimationEnd) {
        Intrinsics.checkNotNullParameter(onAnimationUpdate, "onAnimationUpdate");
        Intrinsics.checkNotNullParameter(onAnimationEnd, "onAnimationEnd");
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(BitmapDescriptorFactory.HUE_RED, 1.0f, BitmapDescriptorFactory.HUE_RED);
        valueAnimatorOfFloat.setDuration(125L);
        ap0.q qVar = new ap0.q(valueAnimatorOfFloat, onAnimationEnd, this, onAnimationUpdate, 2);
        valueAnimatorOfFloat.addListener(qVar);
        valueAnimatorOfFloat.addUpdateListener(qVar);
        Intrinsics.checkNotNullExpressionValue(valueAnimatorOfFloat, "apply(...)");
        return valueAnimatorOfFloat;
    }
}
