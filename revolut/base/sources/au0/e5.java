package au0;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class e5 {

    @NotNull
    private static final c5 Companion = new c5();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f9186a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f9187b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Lazy f9188c;
    public ValueAnimator d;
    public d5 e;
    public float f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f9189g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f9190h;

    public e5(Context context, List titleViews) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(titleViews, "titleViews");
        this.f9186a = context;
        this.f9187b = titleViews;
        this.f9188c = yhm.j.b(new aqe.a(this, 15));
        this.e = d5.UNKNOWN;
        this.f9189g = -1.0f;
        this.f9190h = ro0.g0.b(context, ro0.e0.NAV_BAR_TITLE);
    }

    public final void a(float f) {
        j70.a devicePerformance;
        float interpolation;
        AccelerateInterpolator accelerateInterpolator = ix0.u1.f169315a;
        Context context = this.f9186a;
        Intrinsics.checkNotNullParameter(context, "context");
        float f4 = (1.0f - f) / 1.0f;
        if (f4 > 1.0f) {
            f4 = 1.0f;
        }
        float interpolation2 = ix0.u1.f169315a.getInterpolation(f4) * kli.a.k(context, 16.0f);
        List list = this.f9187b;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            View view = (View) list.get(i);
            view.setTranslationY(interpolation2);
            view.setAlpha(f);
        }
        if (this.f9190h && (devicePerformance = (j70.a) this.f9188c.getValue()) != null) {
            AccelerateInterpolator accelerateInterpolator2 = ix0.u1.f169315a;
            Intrinsics.checkNotNullParameter(context, "context");
            if (f <= BitmapDescriptorFactory.HUE_RED || f >= 1.0f) {
                interpolation = 0.0f;
            } else {
                float f5 = f / 0.8f;
                if (f5 > 1.0f) {
                    f5 = 1.0f;
                }
                interpolation = (1.0f - ix0.u1.f169316b.getInterpolation(f5)) * kli.a.l(context, 10.0f);
            }
            if (interpolation == this.f9189g) {
                return;
            }
            this.f9189g = interpolation;
            int size2 = list.size();
            for (int i2 = 0; i2 < size2; i2++) {
                View view2 = (View) list.get(i2);
                Intrinsics.checkNotNullParameter(view2, "<this>");
                Intrinsics.checkNotNullParameter(devicePerformance, "devicePerformance");
                if (kp0.w0.n(devicePerformance)) {
                    view2.setRenderEffect(interpolation > BitmapDescriptorFactory.HUE_RED ? ro0.d0.b(interpolation) : null);
                }
            }
        }
    }

    public final void b(boolean z) {
        boolean z3;
        d5 d5Var = z ? d5.SHOWN : d5.HIDDEN;
        if (this.e == d5Var) {
            return;
        }
        List list = this.f9187b;
        int size = list.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                break;
            }
            if (!((View) list.get(i)).isLaidOut()) {
                i++;
            } else if (this.e != d5.UNKNOWN) {
                z3 = true;
            }
        }
        z3 = false;
        this.e = d5Var;
        float f = z ? 1.0f : BitmapDescriptorFactory.HUE_RED;
        ValueAnimator valueAnimator = this.d;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (!z3) {
            this.f = f;
            a(f);
            return;
        }
        long j2 = z ? 600L : 300L;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.f, f);
        valueAnimatorOfFloat.setDuration((long) (Math.abs(f - this.f) * j2));
        valueAnimatorOfFloat.setInterpolator(jq0.r.f177393b);
        valueAnimatorOfFloat.addUpdateListener(new b5(this, 0));
        valueAnimatorOfFloat.start();
        this.d = valueAnimatorOfFloat;
    }
}
