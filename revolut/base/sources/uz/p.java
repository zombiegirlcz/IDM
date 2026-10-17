package uz;

import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.jvm.internal.Intrinsics;
import mx0.w5;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public final class p {

    @NotNull
    private static final n Companion = new n();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ur2.a f284541a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f284542b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f284543c;
    public float d;
    public float e;
    public float f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final o f284544g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final o f284545h;
    public final ValueAnimator i;

    public p(ur2.a onUpdate) {
        Intrinsics.checkNotNullParameter(onUpdate, "onUpdate");
        this.f284541a = onUpdate;
        this.f284544g = new o();
        this.f284545h = new o();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(BitmapDescriptorFactory.HUE_RED, 1.0f);
        valueAnimatorOfFloat.setDuration(100L);
        valueAnimatorOfFloat.setInterpolator(new AccelerateDecelerateInterpolator());
        valueAnimatorOfFloat.addUpdateListener(new w5(this, 15));
        Intrinsics.checkNotNullExpressionValue(valueAnimatorOfFloat, "apply(...)");
        this.i = valueAnimatorOfFloat;
    }

    public static boolean a(float f, float f4) {
        return Math.abs(f - f4) < 0.01f;
    }

    public final void b(float f, float f4, float f5, float f6) {
        this.i.cancel();
        this.f284543c = f;
        this.d = f4;
        this.e = f5;
        this.f = f6;
        o oVar = this.f284545h;
        oVar.f284538a = f;
        oVar.f284539b = f4;
        oVar.f284540c = f5;
        oVar.d = f6;
        this.f284542b = true;
        this.f284541a.invoke();
    }
}
