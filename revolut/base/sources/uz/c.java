package uz;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import androidx.core.content.ContextCompat;
import com.revolut.camerakit.ui.models.Mask;
import com.revolut.camerakit.ui.models.R$color;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import mx0.w5;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public abstract class c {

    @NotNull
    private static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f284477a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f284478b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final RectF f284479c;
    public final Matrix d;
    public Mask e;
    public final float f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f284480g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f284481h;
    public boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final float f284482j;
    public boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final RectF f284483l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Paint f284484m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Paint f284485n;
    public final int o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f284486p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final float f284487q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f284488r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Float f284489s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f284490t;
    public boolean u;
    public final ValueAnimator v;

    public c(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.f284477a = view;
        this.f284478b = b(16.0f);
        this.f284479c = new RectF();
        this.d = new Matrix();
        this.f = b(4.0f);
        float fB = b(1.0f);
        this.f284482j = fB;
        this.f284483l = new RectF();
        Paint paint = new Paint();
        paint.setColor(ContextCompat.getColor(view.getContext(), R$color.camera_kit_lightBlue));
        paint.setStrokeWidth(fB);
        paint.setStrokeCap(Paint.Cap.ROUND);
        this.f284484m = paint;
        Paint paint2 = new Paint();
        paint2.setStyle(Paint.Style.FILL);
        paint2.setColor(ContextCompat.getColor(view.getContext(), R$color.camera_kit_lightBlue_40));
        this.f284485n = paint2;
        this.o = ContextCompat.getColor(view.getContext(), R$color.camera_kit_lightBlue);
        this.f284487q = b(10.0f);
        aq0.k kVar = new aq0.k(this, 17);
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setDuration(1000L);
        valueAnimator.setRepeatMode(2);
        valueAnimator.setRepeatCount(-1);
        valueAnimator.addUpdateListener(new w5(this, 13));
        valueAnimator.addListener(kVar);
        this.v = valueAnimator;
    }

    public abstract int a(int i);

    public final float b(float f) {
        Context context = this.f284477a.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        return jb3.l.g(context, f);
    }

    public final float c(int i) {
        Number numberValueOf;
        Mask mask = this.e;
        if (mask == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        int i2 = b.f284475a[mask.getF50847a().ordinal()];
        float f = this.f284478b;
        if (i2 == 1) {
            int measuredWidth = (this.f284477a.getMeasuredWidth() - i) / 2;
            int i3 = (int) f;
            if (measuredWidth < i3) {
                measuredWidth = i3;
            }
            numberValueOf = Integer.valueOf(measuredWidth);
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            numberValueOf = Float.valueOf(f);
        }
        return numberValueOf.floatValue();
    }

    public void d() {
    }

    public void e() {
        o();
    }

    public abstract void f(Canvas canvas);

    public void g() {
    }

    public void h() {
        o();
        e();
    }

    public void i(boolean z) {
        if (this.i == z) {
            return;
        }
        this.i = z;
        this.f284477a.invalidate();
    }

    public void j(int i) {
        this.f284481h = i;
    }

    public void k(int i) {
        this.f284480g = i;
    }

    public final void l(float f, float f4) {
        this.f284488r = false;
        if (this.u || this.e == null) {
            return;
        }
        this.f284489s = Float.valueOf(f4);
        this.u = true;
        float[] fArr = {f, f4};
        ValueAnimator valueAnimator = this.v;
        valueAnimator.setFloatValues(fArr);
        valueAnimator.start();
    }

    public abstract void m(long j2);

    public abstract void n();

    public final void o() {
        if (this.u) {
            this.v.cancel();
            this.u = false;
            this.f284490t = false;
            g();
            this.f284477a.invalidate();
        }
    }

    public abstract void p();

    public void q(boolean z) {
        this.k = z;
    }
}
