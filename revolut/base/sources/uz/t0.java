package uz;

import android.animation.ValueAnimator;
import android.graphics.BlurMaskFilter;
import android.graphics.Camera;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.ColorUtils;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.onfido.android.sdk.capture.ui.camera.CapturePresenter;
import com.revolut.camerakit.ui.models.DocumentMaskModel;
import com.revolut.camerakit.ui.models.R$color;
import java.util.ArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public final class t0 extends c {

    @NotNull
    private static final r0 Companion = new r0();
    public final Path A;
    public final ArrayList B;
    public final Path C;
    public final Path D;
    public final RectF E;
    public final int[] F;
    public final int[] G;
    public boolean H;
    public boolean I;
    public float J;
    public float K;
    public int L;
    public boolean M;
    public p0 N;
    public float O;
    public float P;
    public boolean Q;
    public u0 R;
    public u0 S;
    public u0 T;
    public float U;
    public final androidx.camera.viewfinder.a V;
    public final Camera W;
    public final Paint X;
    public final Paint Y;
    public final Paint Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final Paint f284552a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final int f284553b0;
    public final float c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final float[] f284554d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final float f284555e0;
    public final ValueAnimator f0;
    public final ValueAnimator g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public final ValueAnimator f284556h0;
    public final ValueAnimator i0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final d f284557w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final DocumentMaskModel f284558x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final v0 f284559y;
    public final Path z;

    public t0(d view, DocumentMaskModel documentMaskModel) {
        v0 viewStateMapper = new v0();
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(documentMaskModel, "documentMaskModel");
        Intrinsics.checkNotNullParameter(viewStateMapper, "viewStateMapper");
        super(view);
        this.f284557w = view;
        this.f284558x = documentMaskModel;
        this.f284559y = viewStateMapper;
        this.z = new Path();
        this.A = new Path();
        ArrayList arrayList = new ArrayList(32);
        final int i = 0;
        for (int i2 = 0; i2 < 32; i2++) {
            arrayList.add(new Path());
        }
        this.B = arrayList;
        this.C = new Path();
        this.D = new Path();
        this.E = new RectF();
        final int i3 = 2;
        this.F = new int[2];
        this.G = new int[2];
        final int i5 = 1;
        this.H = true;
        this.I = true;
        this.N = p0.WAITING_FOR_MATCH;
        this.R = new u0(0, 0, 0);
        this.S = new u0(0, 0, 0);
        this.T = new u0(0, 0, 0);
        this.U = 1.0f;
        androidx.camera.viewfinder.a aVar = new androidx.camera.viewfinder.a(this, 26);
        this.V = aVar;
        this.W = new Camera();
        this.f284557w.addOnLayoutChangeListener(aVar);
        Paint paint = new Paint(1);
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint.setStrokeWidth(b(4.0f));
        Paint.Cap cap = Paint.Cap.ROUND;
        paint.setStrokeCap(cap);
        Paint.Join join = Paint.Join.ROUND;
        paint.setStrokeJoin(join);
        this.X = paint;
        Paint paint2 = new Paint(1);
        paint2.setStyle(style);
        paint2.setStrokeWidth(b(40.0f));
        paint2.setStrokeCap(cap);
        paint2.setStrokeJoin(join);
        float fB = b(20.0f);
        BlurMaskFilter.Blur blur = BlurMaskFilter.Blur.NORMAL;
        paint2.setMaskFilter(new BlurMaskFilter(fB, blur));
        this.Y = paint2;
        Paint paint3 = new Paint(1);
        paint3.setStyle(style);
        paint3.setStrokeWidth(b(8.0f));
        paint3.setStrokeCap(cap);
        paint3.setStrokeJoin(join);
        paint3.setMaskFilter(new BlurMaskFilter(b(18.0f), blur));
        this.Z = paint3;
        Paint paint4 = new Paint(1);
        paint4.setColor(ContextCompat.getColor(this.f284557w.getContext(), R$color.camera_kit_zebra_line));
        paint4.setStyle(style);
        paint4.setStrokeWidth(b(1.0f));
        paint4.setStrokeCap(cap);
        paint4.setStrokeJoin(join);
        this.f284552a0 = paint4;
        this.f284553b0 = ContextCompat.getColor(this.f284557w.getContext(), R$color.camera_kit_lightRed);
        this.c0 = b(8.0f);
        final int i6 = 3;
        this.f284554d0 = new float[]{b(1.1428572f), b(2.0f), b(4.0f), b(8.0f), b(12.0f), b(16.0f)};
        this.f284555e0 = b(22.0f);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(BitmapDescriptorFactory.HUE_RED, 1.0f);
        valueAnimatorOfFloat.setInterpolator(new AccelerateDecelerateInterpolator());
        valueAnimatorOfFloat.setDuration(180L);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: uz.q0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ t0 f284547b;

            {
                this.f284547b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator animator) {
                switch (i) {
                    case 0:
                        Intrinsics.checkNotNullParameter(animator, "animator");
                        t0 t0Var = this.f284547b;
                        v0 v0Var = t0Var.f284559y;
                        u0 from = t0Var.S;
                        u0 to6 = t0Var.T;
                        Object animatedValue = animator.getAnimatedValue();
                        Intrinsics.i(animatedValue, "null cannot be cast to non-null type kotlin.Float");
                        float fFloatValue = ((Float) animatedValue).floatValue();
                        v0Var.getClass();
                        Intrinsics.checkNotNullParameter(from, "from");
                        Intrinsics.checkNotNullParameter(to6, "to");
                        t0Var.R = new u0(ColorUtils.blendARGB(from.f284560a, to6.f284560a, fFloatValue), rim.d.c(((to6.f284561b - r5) * fFloatValue) + from.f284561b), ColorUtils.blendARGB(from.f284562c, to6.f284562c, fFloatValue));
                        t0Var.f284557w.invalidate();
                        break;
                    case 1:
                        float fFloatValue2 = ((Float) z9h.n.g(animator, "animator", "null cannot be cast to non-null type kotlin.Float")).floatValue();
                        t0 t0Var2 = this.f284547b;
                        t0Var2.U = fFloatValue2;
                        t0Var2.f284557w.invalidate();
                        break;
                    case 2:
                        float fFloatValue3 = ((Float) z9h.n.g(animator, "animator", "null cannot be cast to non-null type kotlin.Float")).floatValue();
                        t0 t0Var3 = this.f284547b;
                        t0Var3.O = fFloatValue3;
                        t0Var3.f284557w.invalidate();
                        break;
                    default:
                        float fFloatValue4 = ((Float) z9h.n.g(animator, "animation", "null cannot be cast to non-null type kotlin.Float")).floatValue();
                        t0 t0Var4 = this.f284547b;
                        t0Var4.P = fFloatValue4;
                        t0Var4.f284557w.invalidate();
                        break;
                }
            }
        });
        Intrinsics.checkNotNullExpressionValue(valueAnimatorOfFloat, "apply(...)");
        this.f0 = valueAnimatorOfFloat;
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(1.0f, BitmapDescriptorFactory.HUE_RED);
        valueAnimatorOfFloat2.setInterpolator(new AccelerateDecelerateInterpolator());
        valueAnimatorOfFloat2.setDuration(180L);
        valueAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: uz.q0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ t0 f284547b;

            {
                this.f284547b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator animator) {
                switch (i5) {
                    case 0:
                        Intrinsics.checkNotNullParameter(animator, "animator");
                        t0 t0Var = this.f284547b;
                        v0 v0Var = t0Var.f284559y;
                        u0 from = t0Var.S;
                        u0 to6 = t0Var.T;
                        Object animatedValue = animator.getAnimatedValue();
                        Intrinsics.i(animatedValue, "null cannot be cast to non-null type kotlin.Float");
                        float fFloatValue = ((Float) animatedValue).floatValue();
                        v0Var.getClass();
                        Intrinsics.checkNotNullParameter(from, "from");
                        Intrinsics.checkNotNullParameter(to6, "to");
                        t0Var.R = new u0(ColorUtils.blendARGB(from.f284560a, to6.f284560a, fFloatValue), rim.d.c(((to6.f284561b - r5) * fFloatValue) + from.f284561b), ColorUtils.blendARGB(from.f284562c, to6.f284562c, fFloatValue));
                        t0Var.f284557w.invalidate();
                        break;
                    case 1:
                        float fFloatValue2 = ((Float) z9h.n.g(animator, "animator", "null cannot be cast to non-null type kotlin.Float")).floatValue();
                        t0 t0Var2 = this.f284547b;
                        t0Var2.U = fFloatValue2;
                        t0Var2.f284557w.invalidate();
                        break;
                    case 2:
                        float fFloatValue3 = ((Float) z9h.n.g(animator, "animator", "null cannot be cast to non-null type kotlin.Float")).floatValue();
                        t0 t0Var3 = this.f284547b;
                        t0Var3.O = fFloatValue3;
                        t0Var3.f284557w.invalidate();
                        break;
                    default:
                        float fFloatValue4 = ((Float) z9h.n.g(animator, "animation", "null cannot be cast to non-null type kotlin.Float")).floatValue();
                        t0 t0Var4 = this.f284547b;
                        t0Var4.P = fFloatValue4;
                        t0Var4.f284557w.invalidate();
                        break;
                }
            }
        });
        Intrinsics.checkNotNullExpressionValue(valueAnimatorOfFloat2, "apply(...)");
        this.g0 = valueAnimatorOfFloat2;
        ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(BitmapDescriptorFactory.HUE_RED, 1.0f);
        valueAnimatorOfFloat3.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: uz.q0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ t0 f284547b;

            {
                this.f284547b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator animator) {
                switch (i3) {
                    case 0:
                        Intrinsics.checkNotNullParameter(animator, "animator");
                        t0 t0Var = this.f284547b;
                        v0 v0Var = t0Var.f284559y;
                        u0 from = t0Var.S;
                        u0 to6 = t0Var.T;
                        Object animatedValue = animator.getAnimatedValue();
                        Intrinsics.i(animatedValue, "null cannot be cast to non-null type kotlin.Float");
                        float fFloatValue = ((Float) animatedValue).floatValue();
                        v0Var.getClass();
                        Intrinsics.checkNotNullParameter(from, "from");
                        Intrinsics.checkNotNullParameter(to6, "to");
                        t0Var.R = new u0(ColorUtils.blendARGB(from.f284560a, to6.f284560a, fFloatValue), rim.d.c(((to6.f284561b - r5) * fFloatValue) + from.f284561b), ColorUtils.blendARGB(from.f284562c, to6.f284562c, fFloatValue));
                        t0Var.f284557w.invalidate();
                        break;
                    case 1:
                        float fFloatValue2 = ((Float) z9h.n.g(animator, "animator", "null cannot be cast to non-null type kotlin.Float")).floatValue();
                        t0 t0Var2 = this.f284547b;
                        t0Var2.U = fFloatValue2;
                        t0Var2.f284557w.invalidate();
                        break;
                    case 2:
                        float fFloatValue3 = ((Float) z9h.n.g(animator, "animator", "null cannot be cast to non-null type kotlin.Float")).floatValue();
                        t0 t0Var3 = this.f284547b;
                        t0Var3.O = fFloatValue3;
                        t0Var3.f284557w.invalidate();
                        break;
                    default:
                        float fFloatValue4 = ((Float) z9h.n.g(animator, "animation", "null cannot be cast to non-null type kotlin.Float")).floatValue();
                        t0 t0Var4 = this.f284547b;
                        t0Var4.P = fFloatValue4;
                        t0Var4.f284557w.invalidate();
                        break;
                }
            }
        });
        Intrinsics.checkNotNullExpressionValue(valueAnimatorOfFloat3, "apply(...)");
        this.f284556h0 = valueAnimatorOfFloat3;
        ValueAnimator valueAnimatorOfFloat4 = ValueAnimator.ofFloat(BitmapDescriptorFactory.HUE_RED, 15.0f);
        valueAnimatorOfFloat4.setDuration(CapturePresenter.PASSPORT_OVERLAY_DELAY_MS);
        valueAnimatorOfFloat4.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: uz.q0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ t0 f284547b;

            {
                this.f284547b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator animator) {
                switch (i6) {
                    case 0:
                        Intrinsics.checkNotNullParameter(animator, "animator");
                        t0 t0Var = this.f284547b;
                        v0 v0Var = t0Var.f284559y;
                        u0 from = t0Var.S;
                        u0 to6 = t0Var.T;
                        Object animatedValue = animator.getAnimatedValue();
                        Intrinsics.i(animatedValue, "null cannot be cast to non-null type kotlin.Float");
                        float fFloatValue = ((Float) animatedValue).floatValue();
                        v0Var.getClass();
                        Intrinsics.checkNotNullParameter(from, "from");
                        Intrinsics.checkNotNullParameter(to6, "to");
                        t0Var.R = new u0(ColorUtils.blendARGB(from.f284560a, to6.f284560a, fFloatValue), rim.d.c(((to6.f284561b - r5) * fFloatValue) + from.f284561b), ColorUtils.blendARGB(from.f284562c, to6.f284562c, fFloatValue));
                        t0Var.f284557w.invalidate();
                        break;
                    case 1:
                        float fFloatValue2 = ((Float) z9h.n.g(animator, "animator", "null cannot be cast to non-null type kotlin.Float")).floatValue();
                        t0 t0Var2 = this.f284547b;
                        t0Var2.U = fFloatValue2;
                        t0Var2.f284557w.invalidate();
                        break;
                    case 2:
                        float fFloatValue3 = ((Float) z9h.n.g(animator, "animator", "null cannot be cast to non-null type kotlin.Float")).floatValue();
                        t0 t0Var3 = this.f284547b;
                        t0Var3.O = fFloatValue3;
                        t0Var3.f284557w.invalidate();
                        break;
                    default:
                        float fFloatValue4 = ((Float) z9h.n.g(animator, "animation", "null cannot be cast to non-null type kotlin.Float")).floatValue();
                        t0 t0Var4 = this.f284547b;
                        t0Var4.P = fFloatValue4;
                        t0Var4.f284557w.invalidate();
                        break;
                }
            }
        });
        this.i0 = valueAnimatorOfFloat4;
    }

    public final void A(boolean z) {
        p0 p0Var = this.N;
        int i = this.f284480g;
        if (i == 0) {
            i = -1;
        }
        int i2 = this.f284481h;
        if (i2 == 0) {
            i2 = this.o;
        }
        int i3 = this.f284553b0;
        w0 model = new w0(p0Var, i, i2, i3);
        this.f284559y.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        u0 u0Var = new u0(i, p0Var.a() ? 64 : 0, p0Var.b(i2, i3));
        if (u0Var.equals(this.R)) {
            return;
        }
        ValueAnimator valueAnimator = this.f0;
        if (valueAnimator.isRunning() && u0Var.equals(this.T)) {
            return;
        }
        valueAnimator.cancel();
        if (!z) {
            this.R = u0Var;
            this.f284557w.invalidate();
        } else {
            this.S = this.R;
            this.T = u0Var;
            valueAnimator.setFloatValues(BitmapDescriptorFactory.HUE_RED, 1.0f);
            valueAnimator.start();
        }
    }

    @Override // uz.c
    public final int a(int i) {
        d dVar = this.f284557w;
        if (dVar.getMeasuredWidth() == 0 || dVar.getMeasuredHeight() == 0) {
            return 0;
        }
        Path path = this.z;
        path.reset();
        float fC = c(dVar.getMeasuredWidth());
        float f = 2;
        float measuredWidth = dVar.getMeasuredWidth() - (fC * f);
        DocumentMaskModel documentMaskModel = this.f284558x;
        float f4 = documentMaskModel.f50822b;
        float f5 = documentMaskModel.f50823c;
        float f6 = measuredWidth / f4;
        int measuredHeight = dVar.getMeasuredHeight();
        float f32 = this.f284487q;
        float f35 = f32 * f;
        if (measuredHeight < ((int) (f35 + f6))) {
            float measuredHeight2 = f6 / (dVar.getMeasuredHeight() - f35);
            measuredWidth /= measuredHeight2;
            f6 /= measuredHeight2;
            fC = (dVar.getMeasuredWidth() - measuredWidth) / f;
        }
        float measuredHeight3 = ((dVar.getMeasuredHeight() - f6) / f) + f32;
        RectF rectF = this.f284479c;
        rectF.left = fC;
        rectF.top = measuredHeight3;
        rectF.right = fC + measuredWidth;
        float f36 = measuredHeight3 + f6;
        rectF.bottom = f36;
        path.addRoundRect(rectF, b(f5), b(f5), Path.Direction.CW);
        path.computeBounds(this.E, true);
        this.H = true;
        A(dVar.isLaidOut());
        int i2 = (int) ((this.f284555e0 * f) + f36 + f32);
        return this.N == p0.CAPTURE ? Math.max(View.MeasureSpec.getSize(i), i2) : i2;
    }

    @Override // uz.c
    public final void d() {
        t();
    }

    @Override // uz.c
    public final void e() {
        o();
        this.f284556h0.cancel();
        this.f0.cancel();
        this.g0.cancel();
        p();
    }

    @Override // uz.c
    public final void f(Canvas canvas) {
        int iSave;
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        if (this.z.isEmpty()) {
            return;
        }
        int i = s0.f284551a[this.N.ordinal()];
        if (i != 1) {
            if (i != 2 && i != 3 && i != 4) {
                throw new NoWhenBranchMatchedException();
            }
            if (!this.Q) {
                iSave = canvas.save();
                try {
                    u(canvas);
                    canvas.restoreToCount(iSave);
                    v(canvas, this.R.f284562c, 1.0f);
                    return;
                } finally {
                }
            }
            iSave = canvas.save();
            try {
                s(canvas);
                u(canvas);
                w(canvas);
                v(canvas, this.R.f284562c, 1.0f);
                return;
            } finally {
            }
        }
        iSave = canvas.save();
        try {
            s(canvas);
            u(canvas);
            canvas.restoreToCount(iSave);
            float f = this.U;
            iSave = canvas.save();
            try {
                s(canvas);
                v(canvas, this.R.f284562c, f);
                canvas.restoreToCount(iSave);
                float f4 = this.J;
                float f5 = ((this.K - f4) * this.O) + f4;
                iSave = canvas.save();
                try {
                    canvas.clipRect(BitmapDescriptorFactory.HUE_RED, f4, this.f284557w.getWidth(), f5);
                    if (this.M) {
                        x(canvas, f4, f5);
                    } else {
                        y();
                        float f6 = this.O;
                        Paint paint = this.f284552a0;
                        if (f6 >= 1.0f || !this.I) {
                            canvas.drawPath(this.A, paint);
                        } else {
                            int iG = (kotlin.ranges.f.g((int) Math.ceil((f5 - f4) / this.c0), 0, this.L) + 15) / 16;
                            for (int i2 = 0; i2 < iG; i2++) {
                                canvas.drawPath((Path) this.B.get(i2), paint);
                            }
                        }
                    }
                } catch (Throwable th10) {
                    throw th10;
                }
            } finally {
            }
        } finally {
        }
    }

    @Override // uz.c
    public final void g() {
        this.g0.cancel();
        ValueAnimator valueAnimator = this.f284556h0;
        valueAnimator.cancel();
        valueAnimator.setStartDelay(0L);
        if (this.O < 1.0f) {
            this.O = BitmapDescriptorFactory.HUE_RED;
            this.U = 1.0f;
        } else {
            this.U = BitmapDescriptorFactory.HUE_RED;
        }
        this.f284557w.invalidate();
    }

    @Override // uz.c
    public final void h() {
        this.f284557w.removeOnLayoutChangeListener(this.V);
        super.h();
    }

    @Override // uz.c
    public final void i(boolean z) {
        p0 p0Var;
        boolean z3 = this.i;
        p0 p0Var2 = this.N;
        super.i(z);
        if (z) {
            p0Var = this.u ? p0.CAPTURE : p0.MATCHED;
        } else {
            float f = this.O;
            p0Var = f == 1.0f ? p0.CAPTURE : ((f >= 1.0f || !z3) && p0Var2 != p0.CAPTURE_FAILED) ? p0.WAITING_FOR_MATCH : p0.CAPTURE_FAILED;
        }
        this.N = p0Var;
        this.i = z;
        if (p0Var != p0.CAPTURE) {
            this.g0.cancel();
            this.U = 1.0f;
            ValueAnimator valueAnimator = this.f284556h0;
            valueAnimator.cancel();
            valueAnimator.setStartDelay(0L);
        }
        if (z == z3 && this.N == p0Var2) {
            return;
        }
        A(true);
        this.f284557w.invalidate();
    }

    @Override // uz.c
    public final void j(int i) {
        this.f284481h = i;
        A(false);
    }

    @Override // uz.c
    public final void k(int i) {
        this.f284480g = i;
        A(false);
    }

    @Override // uz.c
    public final void m(long j2) {
        p0 p0Var = this.N;
        p0 p0Var2 = p0.CAPTURE;
        this.N = p0Var2;
        this.M = j2 == 0;
        ValueAnimator valueAnimator = this.g0;
        ValueAnimator valueAnimator2 = this.f284556h0;
        if (p0Var != p0Var2) {
            this.O = BitmapDescriptorFactory.HUE_RED;
            valueAnimator2.cancel();
            valueAnimator.cancel();
            this.U = 1.0f;
            this.f284557w.requestLayout();
            A(true);
        }
        RectF rectF = this.f284479c;
        l(rectF.top, rectF.bottom);
        if (p0Var != p0Var2) {
            if (j2 == 0) {
                this.U = BitmapDescriptorFactory.HUE_RED;
                valueAnimator2.setStartDelay(0L);
                valueAnimator2.setDuration(j2);
                valueAnimator2.start();
                return;
            }
            valueAnimator.start();
            valueAnimator2.setStartDelay(180L);
            valueAnimator2.setDuration(j2);
            valueAnimator2.start();
        }
    }

    @Override // uz.c
    public final void n() {
        if (this.Q) {
            return;
        }
        this.Q = true;
        this.i0.start();
    }

    @Override // uz.c
    public final void p() {
        if (this.Q) {
            this.i0.cancel();
            this.P = BitmapDescriptorFactory.HUE_RED;
            this.Q = false;
            this.f284557w.invalidate();
        }
    }

    public final void r(Path path, float f, int i, int i2) {
        float fZ;
        RectF rectF = this.E;
        float fCenterX = rectF.centerX();
        float fWidth = rectF.width() / 2.0f;
        float fB = b(this.f284558x.f50823c);
        if (fB > fWidth) {
            fB = fWidth;
        }
        float f4 = rectF.top;
        float f5 = rectF.bottom;
        float f6 = f4 + fB;
        if (f < f6) {
            fZ = z(f, f6, fB);
        } else {
            float f32 = f5 - fB;
            fZ = f > f32 ? z(f, f32, fB) : rectF.left;
        }
        float f35 = fCenterX - fZ;
        if (f35 <= fWidth) {
            fWidth = f35;
        }
        float f36 = fCenterX + fWidth;
        path.moveTo(BitmapDescriptorFactory.HUE_RED, f);
        if (f >= f4 && f <= f5) {
            int iMin = Math.min(i, (i2 - i) - 1);
            if (iMin < 0) {
                iMin = 0;
            }
            float[] fArr = this.f284554d0;
            Intrinsics.checkNotNullParameter(fArr, "<this>");
            int length = fArr.length - 1;
            if (iMin > length) {
                iMin = length;
            }
            float f37 = fArr[iMin];
            float f41 = this.f284555e0;
            path.lineTo(fZ - f41, f);
            float f42 = f - f37;
            path.cubicTo(fZ, f, fZ, f42, fZ + f41, f42);
            path.lineTo(f36 - f41, f42);
            path.cubicTo(f36, f42, f36, f, f36 + f41, f);
        }
        path.lineTo(this.f284557w.getWidth(), f);
    }

    public final void s(Canvas canvas) {
        Camera camera = this.W;
        camera.save();
        camera.rotateX(this.P);
        RectF rectF = this.E;
        canvas.translate(rectF.centerX(), rectF.bottom);
        camera.applyToCanvas(canvas);
        canvas.translate(-rectF.centerX(), -rectF.bottom);
        camera.restore();
    }

    public final void t() {
        d dVar = this.f284557w;
        dVar.getLocationOnScreen(this.F);
        View rootView = dVar.getRootView();
        int[] iArr = this.G;
        rootView.getLocationOnScreen(iArr);
        int i = iArr[1];
        this.J = i - r1[1];
        this.K = (dVar.getRootView().getHeight() + i) - r1[1];
        this.H = true;
    }

    public final void u(Canvas canvas) {
        Path path = this.z;
        u0 u0Var = this.R;
        int i = u0Var.f284561b;
        if (i > 0) {
            int alphaComponent = ColorUtils.setAlphaComponent(u0Var.f284560a, i);
            Paint paint = this.Y;
            paint.setColor(alphaComponent);
            int iSave = canvas.save();
            try {
                canvas.clipPath(path);
                canvas.drawPath(path, paint);
            } finally {
                canvas.restoreToCount(iSave);
            }
        }
    }

    public final void v(Canvas canvas, int i, float f) {
        float f4 = kotlin.ranges.f.f(f, BitmapDescriptorFactory.HUE_RED, 1.0f);
        int iC = rim.d.c(Color.alpha(i) * f4);
        if (iC == 0) {
            return;
        }
        int alphaComponent = ColorUtils.setAlphaComponent(i, iC);
        Paint paint = this.Z;
        paint.setColor(alphaComponent);
        Path path = this.z;
        canvas.drawPath(path, paint);
        int alphaComponent2 = ColorUtils.setAlphaComponent(ColorUtils.blendARGB(-1, i, 0.1f), rim.d.c(Color.alpha(r5) * f4));
        Paint paint2 = this.X;
        paint2.setColor(alphaComponent2);
        canvas.drawPath(path, paint2);
    }

    public final void w(Canvas canvas) {
        float fB = b(this.f284558x.f50823c);
        for (int i = 4; i > 0; i--) {
            float f = i * this.c0;
            Path path = this.D;
            path.rewind();
            RectF rectF = this.E;
            float f4 = fB + f;
            path.addRoundRect(rectF.left - f, rectF.top - f, rectF.right + f, rectF.bottom + f, f4, f4, Path.Direction.CW);
            canvas.drawPath(path, this.f284552a0);
        }
    }

    public final void x(Canvas canvas, float f, float f4) {
        float fZ;
        Path path;
        RectF rectF = this.E;
        double d = rectF.top - f;
        float f5 = this.c0;
        int iCeil = (int) Math.ceil(d / f5);
        int iCeil2 = ((((int) Math.ceil(((double) (rectF.bottom - f)) / r5)) - 1) - iCeil) + 1;
        float f6 = f;
        int i = 0;
        while (f6 < f4) {
            int i2 = i - iCeil;
            float fCenterX = rectF.centerX();
            float fWidth = rectF.width() / 2.0f;
            float fB = b(this.f284558x.f50823c);
            if (fB > fWidth) {
                fB = fWidth;
            }
            float f32 = rectF.top;
            float f35 = rectF.bottom;
            float f36 = f32 + fB;
            if (f6 < f36) {
                fZ = z(f6, f36, fB);
            } else {
                float f37 = f35 - fB;
                fZ = f6 > f37 ? z(f6, f37, fB) : rectF.left;
            }
            float f41 = fCenterX - fZ;
            if (f41 <= fWidth) {
                fWidth = f41;
            }
            float f42 = fCenterX + fWidth;
            Path path2 = this.C;
            path2.rewind();
            path2.moveTo(BitmapDescriptorFactory.HUE_RED, f6);
            if (f6 < f32 || f6 > f35) {
                path = path2;
            } else {
                int iMin = Math.min(i2, (iCeil2 - i2) - 1);
                if (iMin < 0) {
                    iMin = 0;
                }
                float[] fArr = this.f284554d0;
                Intrinsics.checkNotNullParameter(fArr, "<this>");
                int length = fArr.length - 1;
                if (iMin > length) {
                    iMin = length;
                }
                float f57 = fArr[iMin];
                float f69 = this.f284555e0;
                path2.lineTo(fZ - f69, f6);
                float f75 = f6 - f57;
                path = path2;
                path.cubicTo(fZ, f6, fZ, f75, fZ + f69, f75);
                path.lineTo(f42 - f69, f75);
                float f77 = f6;
                path.cubicTo(f42, f75, f42, f77, f42 + f69, f6);
                f6 = f77;
            }
            path.lineTo(this.f284557w.getWidth(), f6);
            canvas.drawPath(path, this.f284552a0);
            f6 += f5;
            i++;
        }
    }

    public final void y() {
        if (this.H) {
            float f = this.J;
            float f4 = this.K;
            Path path = this.A;
            path.rewind();
            this.I = true;
            RectF rectF = this.E;
            double d = rectF.top - f;
            float f5 = this.c0;
            double d5 = f5;
            int iCeil = (int) Math.ceil(d / d5);
            int iCeil2 = ((((int) Math.ceil(((double) (rectF.bottom - f)) / d5)) - 1) - iCeil) + 1;
            int i = -1;
            Path path2 = null;
            int i2 = 0;
            int i3 = 16;
            while (f < f4) {
                if (i3 == 16) {
                    i++;
                    path2 = (Path) zhm.d0.e0(i, this.B);
                    if (path2 == null) {
                        this.I = false;
                    } else {
                        path2.rewind();
                    }
                    i3 = 0;
                }
                int i5 = i2 - iCeil;
                r(path, f, i5, iCeil2);
                if (path2 != null) {
                    r(path2, f, i5, iCeil2);
                }
                f += f5;
                i2++;
                i3++;
            }
            this.L = i2;
            this.H = false;
        }
    }

    public final float z(float f, float f4, float f5) {
        float f6 = this.E.left + f5;
        float f32 = f - f4;
        float f35 = (f5 * f5) - (f32 * f32);
        if (f35 < BitmapDescriptorFactory.HUE_RED) {
            f35 = 0.0f;
        }
        return f6 - ((float) Math.sqrt(f35));
    }
}
