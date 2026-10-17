package uz;

import android.animation.ValueAnimator;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.ColorUtils;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.camerakit.ui.models.Mask;
import com.revolut.camerakit.ui.models.R$color;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;
import skm.a2;
import skm.c2;

/* JADX INFO: loaded from: classes16.dex */
public final class c0 extends c {

    @NotNull
    private static final a0 Companion = new a0();
    public final Path A;
    public final Path B;
    public final Path C;
    public final Path D;
    public final RectF E;
    public final RectF F;
    public final Matrix G;
    public final Matrix H;
    public final Matrix I;
    public final Matrix J;
    public final Matrix K;
    public final RectF L;
    public final RectF M;
    public final int[] N;
    public final int[] O;
    public y P;
    public float Q;
    public float R;
    public d0 S;
    public boolean T;
    public j U;
    public d0 V;
    public d0 W;
    public a2 X;
    public zkm.d Y;
    public boolean Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final Paint f284491a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final Paint f284492b0;
    public final Paint c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final Paint f284493d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final Paint f284494e0;
    public final float f0;
    public final float g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public final int f284495h0;
    public final ValueAnimator i0;
    public final r j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public final p f284496k0;
    public final ValueAnimator l0;
    public final ValueAnimator m0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final d f284497w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final StateFlow f284498x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final e0 f284499y;
    public sz.a z;

    public c0(d view, StateFlow stateFlow) {
        j jVar;
        e0 viewStateMapper = new e0();
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(viewStateMapper, "viewStateMapper");
        super(view);
        this.f284497w = view;
        this.f284498x = stateFlow;
        this.f284499y = viewStateMapper;
        this.A = new Path();
        this.B = new Path();
        this.C = new Path();
        this.D = new Path();
        this.E = new RectF();
        this.F = new RectF();
        this.G = new Matrix();
        this.H = new Matrix();
        this.I = new Matrix();
        this.J = new Matrix();
        this.K = new Matrix();
        this.L = new RectF();
        this.M = new RectF();
        final int i = 2;
        this.N = new int[2];
        this.O = new int[2];
        this.P = y.WAITING_FOR_FACE_MATCH;
        final int i2 = 0;
        this.S = new d0(0);
        this.U = (stateFlow == null || (jVar = (j) stateFlow.getValue()) == null) ? new j(null, null) : jVar;
        this.V = new d0(0);
        this.W = new d0(0);
        final int i3 = 1;
        Paint paint = new Paint(1);
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint.setStrokeWidth(b(40.0f));
        Paint.Cap cap = Paint.Cap.ROUND;
        paint.setStrokeCap(cap);
        Paint.Join join = Paint.Join.ROUND;
        paint.setStrokeJoin(join);
        float fB = b(20.0f);
        BlurMaskFilter.Blur blur = BlurMaskFilter.Blur.NORMAL;
        paint.setMaskFilter(new BlurMaskFilter(fB, blur));
        this.f284491a0 = paint;
        Paint paint2 = new Paint(1);
        paint2.setColor(ContextCompat.getColor(view.getContext(), R$color.camera_kit_zebra_line));
        paint2.setStyle(style);
        paint2.setStrokeWidth(b(1.0f));
        paint2.setStrokeCap(cap);
        paint2.setStrokeJoin(join);
        this.f284492b0 = paint2;
        Paint paint3 = new Paint(1);
        paint3.setStyle(style);
        paint3.setStrokeWidth(b(8.0f));
        paint3.setStrokeCap(cap);
        paint3.setStrokeJoin(join);
        paint3.setMaskFilter(new BlurMaskFilter(b(18.0f), blur));
        this.c0 = paint3;
        Paint paint4 = new Paint(1);
        paint4.setStyle(style);
        paint4.setStrokeWidth(b(4.0f));
        paint4.setStrokeCap(cap);
        paint4.setStrokeJoin(join);
        this.f284493d0 = paint4;
        Paint paint5 = new Paint(1);
        paint5.setColor(-1);
        paint5.setStyle(Paint.Style.FILL);
        this.f284494e0 = paint5;
        this.f0 = b(8.0f);
        this.g0 = b(22.0f);
        this.f284495h0 = ContextCompat.getColor(view.getContext(), R$color.camera_kit_lightRed);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(BitmapDescriptorFactory.HUE_RED, 1.0f);
        valueAnimatorOfFloat.setInterpolator(new AccelerateDecelerateInterpolator());
        valueAnimatorOfFloat.setDuration(180L);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: uz.z

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c0 f284567b;

            {
                this.f284567b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator animator) {
                switch (i2) {
                    case 0:
                        Intrinsics.checkNotNullParameter(animator, "animator");
                        c0 c0Var = this.f284567b;
                        e0 e0Var = c0Var.f284499y;
                        d0 from = c0Var.V;
                        d0 to6 = c0Var.W;
                        Object animatedValue = animator.getAnimatedValue();
                        Intrinsics.i(animatedValue, "null cannot be cast to non-null type kotlin.Float");
                        float fFloatValue = ((Float) animatedValue).floatValue();
                        e0Var.getClass();
                        Intrinsics.checkNotNullParameter(from, "from");
                        Intrinsics.checkNotNullParameter(to6, "to");
                        float f = from.f284504a;
                        c0Var.S = new d0(j6.a.a(to6.f284504a, f, fFloatValue, f), ColorUtils.blendARGB(from.f284505b, to6.f284505b, fFloatValue), rim.d.c(((to6.f284506c - r6) * fFloatValue) + from.f284506c), ColorUtils.blendARGB(from.d, to6.d, fFloatValue));
                        c0Var.f284497w.invalidate();
                        break;
                    case 1:
                        float fFloatValue2 = ((Float) z9h.n.g(animator, "animator", "null cannot be cast to non-null type kotlin.Float")).floatValue();
                        c0 c0Var2 = this.f284567b;
                        c0Var2.Q = fFloatValue2;
                        c0Var2.f284497w.invalidate();
                        break;
                    default:
                        float fFloatValue3 = ((Float) z9h.n.g(animator, "animator", "null cannot be cast to non-null type kotlin.Float")).floatValue();
                        c0 c0Var3 = this.f284567b;
                        c0Var3.R = fFloatValue3;
                        c0Var3.f284497w.invalidate();
                        break;
                }
            }
        });
        Intrinsics.checkNotNullExpressionValue(valueAnimatorOfFloat, "apply(...)");
        this.i0 = valueAnimatorOfFloat;
        this.j0 = new r(new uu9.b(this, 15));
        this.f284496k0 = new p(new ur2.a(this, 9));
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(BitmapDescriptorFactory.HUE_RED, 1.0f);
        valueAnimatorOfFloat2.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: uz.z

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c0 f284567b;

            {
                this.f284567b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator animator) {
                switch (i3) {
                    case 0:
                        Intrinsics.checkNotNullParameter(animator, "animator");
                        c0 c0Var = this.f284567b;
                        e0 e0Var = c0Var.f284499y;
                        d0 from = c0Var.V;
                        d0 to6 = c0Var.W;
                        Object animatedValue = animator.getAnimatedValue();
                        Intrinsics.i(animatedValue, "null cannot be cast to non-null type kotlin.Float");
                        float fFloatValue = ((Float) animatedValue).floatValue();
                        e0Var.getClass();
                        Intrinsics.checkNotNullParameter(from, "from");
                        Intrinsics.checkNotNullParameter(to6, "to");
                        float f = from.f284504a;
                        c0Var.S = new d0(j6.a.a(to6.f284504a, f, fFloatValue, f), ColorUtils.blendARGB(from.f284505b, to6.f284505b, fFloatValue), rim.d.c(((to6.f284506c - r6) * fFloatValue) + from.f284506c), ColorUtils.blendARGB(from.d, to6.d, fFloatValue));
                        c0Var.f284497w.invalidate();
                        break;
                    case 1:
                        float fFloatValue2 = ((Float) z9h.n.g(animator, "animator", "null cannot be cast to non-null type kotlin.Float")).floatValue();
                        c0 c0Var2 = this.f284567b;
                        c0Var2.Q = fFloatValue2;
                        c0Var2.f284497w.invalidate();
                        break;
                    default:
                        float fFloatValue3 = ((Float) z9h.n.g(animator, "animator", "null cannot be cast to non-null type kotlin.Float")).floatValue();
                        c0 c0Var3 = this.f284567b;
                        c0Var3.R = fFloatValue3;
                        c0Var3.f284497w.invalidate();
                        break;
                }
            }
        });
        Intrinsics.checkNotNullExpressionValue(valueAnimatorOfFloat2, "apply(...)");
        this.l0 = valueAnimatorOfFloat2;
        ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(BitmapDescriptorFactory.HUE_RED, 1.0f);
        valueAnimatorOfFloat3.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat3.setDuration(400L);
        valueAnimatorOfFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: uz.z

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c0 f284567b;

            {
                this.f284567b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator animator) {
                switch (i) {
                    case 0:
                        Intrinsics.checkNotNullParameter(animator, "animator");
                        c0 c0Var = this.f284567b;
                        e0 e0Var = c0Var.f284499y;
                        d0 from = c0Var.V;
                        d0 to6 = c0Var.W;
                        Object animatedValue = animator.getAnimatedValue();
                        Intrinsics.i(animatedValue, "null cannot be cast to non-null type kotlin.Float");
                        float fFloatValue = ((Float) animatedValue).floatValue();
                        e0Var.getClass();
                        Intrinsics.checkNotNullParameter(from, "from");
                        Intrinsics.checkNotNullParameter(to6, "to");
                        float f = from.f284504a;
                        c0Var.S = new d0(j6.a.a(to6.f284504a, f, fFloatValue, f), ColorUtils.blendARGB(from.f284505b, to6.f284505b, fFloatValue), rim.d.c(((to6.f284506c - r6) * fFloatValue) + from.f284506c), ColorUtils.blendARGB(from.d, to6.d, fFloatValue));
                        c0Var.f284497w.invalidate();
                        break;
                    case 1:
                        float fFloatValue2 = ((Float) z9h.n.g(animator, "animator", "null cannot be cast to non-null type kotlin.Float")).floatValue();
                        c0 c0Var2 = this.f284567b;
                        c0Var2.Q = fFloatValue2;
                        c0Var2.f284497w.invalidate();
                        break;
                    default:
                        float fFloatValue3 = ((Float) z9h.n.g(animator, "animator", "null cannot be cast to non-null type kotlin.Float")).floatValue();
                        c0 c0Var3 = this.f284567b;
                        c0Var3.R = fFloatValue3;
                        c0Var3.f284497w.invalidate();
                        break;
                }
            }
        });
        Intrinsics.checkNotNullExpressionValue(valueAnimatorOfFloat3, "apply(...)");
        this.m0 = valueAnimatorOfFloat3;
    }

    public final void A(boolean z) {
        rz.u uVar;
        float f;
        float f4;
        y yVar = this.P;
        j jVar = this.U;
        d dVar = this.f284497w;
        int[] iArr = this.N;
        dVar.getLocationOnScreen(iArr);
        rz.u uVar2 = new rz.u(iArr[0], iArr[1], dVar.getWidth(), dVar.getHeight());
        int i = this.f284480g;
        if (i == 0) {
            i = -1;
        }
        int i2 = i;
        int i3 = this.f284481h;
        if (i3 == 0) {
            i3 = this.o;
        }
        int i5 = i3;
        Path path = this.A;
        float f5 = this.g0;
        int i6 = this.f284495h0;
        f0 model = new f0(yVar, jVar, path, uVar2, f5, i2, i5, i6);
        e0 e0Var = this.f284499y;
        e0Var.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        RectF rectF = e0Var.f284509b;
        RectF rectF2 = e0Var.f284508a;
        rz.b bVar = jVar.f284526a;
        if (bVar == null || (uVar = jVar.f284527b) == null || path.isEmpty()) {
            f4 = BitmapDescriptorFactory.HUE_RED;
            f = BitmapDescriptorFactory.HUE_RED;
        } else {
            path.computeBounds(rectF2, false);
            rectF2.offset(r12 - uVar.f258457a, r13 - uVar.f258458b);
            rectF2.offset(BitmapDescriptorFactory.HUE_RED, f5);
            rectF.set(bVar.f258440a);
            if (rectF.isEmpty() || rectF2.isEmpty()) {
                f = BitmapDescriptorFactory.HUE_RED;
            } else {
                float fCenterX = rectF.centerX() - rectF2.centerX();
                float fCenterY = rectF.centerY() - rectF2.centerY();
                float fSqrt = (float) Math.sqrt((fCenterY * fCenterY) + (fCenterX * fCenterX));
                float fMax = Math.max(rectF2.width(), rectF2.height()) * 0.75f;
                f = BitmapDescriptorFactory.HUE_RED;
                if (fMax > BitmapDescriptorFactory.HUE_RED) {
                    f4 = kotlin.ranges.f.f(((kotlin.ranges.f.f(1.0f - ((Math.abs(rectF.height() - rectF2.height()) / rectF2.height()) / 0.45f), BitmapDescriptorFactory.HUE_RED, 1.0f) * 0.3f) + 0.7f) * kotlin.ranges.f.f(1.0f - (fSqrt / fMax), BitmapDescriptorFactory.HUE_RED, 1.0f), BitmapDescriptorFactory.HUE_RED, 1.0f);
                }
            }
            f4 = f;
        }
        float f6 = kotlin.ranges.f.f((f4 - 0.8f) / 0.19999999f, f, 1.0f);
        int iC = yVar.b() ? rim.d.c((1.0f - f6) * 64) : 0;
        int iD = yVar.d(f6, i5, i6);
        d0 d0Var = new d0(f4, i2, iC, iD);
        r rVar = this.j0;
        ValueAnimator valueAnimator = rVar.d;
        if (iD != rVar.f284549b || (!valueAnimator.isRunning() && rVar.e != iD)) {
            rVar.f284549b = iD;
            valueAnimator.cancel();
            if (z) {
                int i21 = rVar.e;
                rVar.f284550c = i21;
                valueAnimator.setDuration((Color.alpha(i21) <= 0 || Color.alpha(iD) <= 0 || ColorUtils.setAlphaComponent(i21, 255) == ColorUtils.setAlphaComponent(iD, 255)) ? 180L : 360L);
                valueAnimator.setFloatValues(BitmapDescriptorFactory.HUE_RED, 1.0f);
                valueAnimator.start();
            } else {
                rVar.e = iD;
                rVar.f284548a.invoke(Integer.valueOf(iD));
            }
        }
        if (d0Var.equals(this.S)) {
            return;
        }
        ValueAnimator valueAnimator2 = this.i0;
        if (valueAnimator2.isRunning() && d0Var.equals(this.W)) {
            return;
        }
        valueAnimator2.cancel();
        if (!z) {
            this.S = d0Var;
            dVar.invalidate();
        } else {
            this.V = this.S;
            this.W = d0Var;
            valueAnimator2.setFloatValues(BitmapDescriptorFactory.HUE_RED, 1.0f);
            valueAnimator2.start();
        }
    }

    @Override // uz.c
    public final int a(int i) {
        sz.a aVar;
        Path path = this.A;
        path.reset();
        d dVar = this.f284497w;
        if (dVar.getMeasuredWidth() == 0 || dVar.getMeasuredHeight() == 0 || (aVar = this.z) == null) {
            return 0;
        }
        path.addPath(((sz.b) aVar).b());
        RectF rectF = this.E;
        path.computeBounds(rectF, false);
        float f = 2;
        float fMax = Math.max(rectF.height() / dVar.getMeasuredHeight(), rectF.width() / (dVar.getMeasuredWidth() - (c((int) rectF.width()) * f)));
        float fHeight = rectF.height() / fMax;
        float fWidth = rectF.width() / fMax;
        float fC = c((int) fWidth);
        RectF rectF2 = this.f284479c;
        rectF2.left = fC;
        float f4 = this.f / f;
        rectF2.top = f4;
        rectF2.right = fC + fWidth;
        rectF2.bottom = fHeight - f4;
        Matrix.ScaleToFit scaleToFit = Matrix.ScaleToFit.CENTER;
        Matrix matrix = this.d;
        matrix.setRectToRect(rectF, rectF2, scaleToFit);
        path.transform(matrix);
        int i2 = ((int) ((this.f284482j / f) + fHeight)) + ((int) (this.g0 * f));
        if (this.P == y.FACE_CAPTURE) {
            if (!this.f284496k0.f284542b) {
                w();
            }
            z();
        }
        A(dVar.isLaidOut());
        return this.P.c() ? Math.max(View.MeasureSpec.getSize(i), i2) : i2;
    }

    @Override // uz.c
    public final void d() {
        StateFlow stateFlow = this.f284498x;
        if (stateFlow != null && this.X == null) {
            zkm.d dVarC = this.Y;
            if (dVarC == null) {
                c2 c2VarE = skm.e0.e();
                skm.p0 p0Var = skm.p0.f264001a;
                dVarC = skm.e0.c(kotlin.coroutines.e.d(c2VarE, zkm.o.f323119a.e));
                this.Y = dVarC;
            }
            this.X = skm.e0.C(dVarC, null, null, new un8.j(stateFlow, this, null, 29), 3);
        }
    }

    @Override // uz.c
    public final void e() {
        o();
        this.l0.cancel();
        this.m0.cancel();
        p pVar = this.f284496k0;
        pVar.i.cancel();
        pVar.f284542b = false;
        this.Z = false;
        this.R = BitmapDescriptorFactory.HUE_RED;
        a2 a2Var = this.X;
        if (a2Var != null) {
            a2Var.f(null);
        }
        this.X = null;
        this.i0.cancel();
        this.j0.d.cancel();
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00e7  */
    @Override // uz.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(android.graphics.Canvas r17) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 378
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: uz.c0.f(android.graphics.Canvas):void");
    }

    @Override // uz.c
    public final void g() {
        this.Z = this.Q >= 1.0f;
        this.l0.cancel();
        if (this.Z) {
            this.R = BitmapDescriptorFactory.HUE_RED;
            this.m0.start();
        } else {
            this.Q = BitmapDescriptorFactory.HUE_RED;
            this.R = BitmapDescriptorFactory.HUE_RED;
            p pVar = this.f284496k0;
            pVar.i.cancel();
            pVar.f284542b = false;
        }
        this.f284497w.invalidate();
    }

    @Override // uz.c
    public final void i(boolean z) {
        boolean z3 = this.i;
        y yVar = this.P;
        super.i(z);
        if (z && !z3 && this.Z) {
            this.Z = false;
        }
        if (!z && yVar == y.FACE_CAPTURE && this.Z && this.U.f284526a == null) {
            this.i = z;
            return;
        }
        y yVar2 = z ? this.u ? y.FACE_CAPTURE : y.FACE_MATCHED : (yVar == y.FACE_CAPTURE || (this.Q < 1.0f && z3) || yVar == y.FACE_CAPTURE_FAILED) ? y.FACE_CAPTURE_FAILED : y.WAITING_FOR_FACE_MATCH;
        if (yVar2 == y.FACE_CAPTURE_FAILED) {
            this.Z = false;
            this.m0.cancel();
            this.Q = BitmapDescriptorFactory.HUE_RED;
            this.R = BitmapDescriptorFactory.HUE_RED;
            p pVar = this.f284496k0;
            pVar.i.cancel();
            pVar.f284542b = false;
        }
        this.P = yVar2;
        this.i = z;
        if (z == z3 && yVar2 == yVar) {
            return;
        }
        A(true);
        this.f284497w.invalidate();
    }

    @Override // uz.c
    public final void j(int i) {
        this.f284481h = i;
        A(false);
    }

    @Override // uz.c
    public final void k(int i) {
        Mask mask = this.e;
        Intrinsics.i(mask, "null cannot be cast to non-null type com.revolut.camerakit.ui.models.Mask.FaceZebra");
        int i2 = ((Mask.FaceZebra) mask).f50846c;
        if (i2 != 0) {
            i = ContextCompat.getColor(this.f284497w.getContext(), i2);
        }
        this.f284480g = i;
        A(false);
    }

    @Override // uz.c
    public final void m(long j2) {
        y yVar = this.P;
        y yVar2 = y.FACE_CAPTURE;
        this.P = yVar2;
        ValueAnimator valueAnimator = this.l0;
        if (yVar != yVar2) {
            this.Z = false;
            this.m0.cancel();
            this.R = BitmapDescriptorFactory.HUE_RED;
            this.Q = BitmapDescriptorFactory.HUE_RED;
            valueAnimator.cancel();
        }
        if (yVar != yVar2) {
            w();
            z();
            d dVar = this.f284497w;
            dVar.requestLayout();
            A(true);
            dVar.invalidate();
        }
        l(y(), this.f284479c.bottom);
        if (yVar != yVar2) {
            valueAnimator.setDuration(j2);
            valueAnimator.start();
        }
    }

    @Override // uz.c
    public final void n() {
    }

    @Override // uz.c
    public final void p() {
    }

    @Override // uz.c
    public final void q(boolean z) {
        this.T = z;
        this.k = false;
    }

    public final float r(RectF rectF, float f, float f4) {
        float f5 = f4 - f;
        return (f5 <= BitmapDescriptorFactory.HUE_RED || rectF.height() <= BitmapDescriptorFactory.HUE_RED) ? BitmapDescriptorFactory.HUE_RED : ((((f5 - rectF.height()) / 2.0f) + f) - rectF.top) - this.g0;
    }

    public final void s(Canvas canvas, Path path) {
        d0 d0Var = this.S;
        int i = d0Var.f284506c;
        if (i > 0) {
            int alphaComponent = ColorUtils.setAlphaComponent(d0Var.f284505b, i);
            Paint paint = this.f284491a0;
            paint.setColor(alphaComponent);
            int iSave = canvas.save();
            try {
                canvas.clipPath(path);
                canvas.drawPath(path, paint);
            } finally {
                canvas.restoreToCount(iSave);
            }
        }
        t(canvas, path, this.j0.e);
    }

    public final void t(Canvas canvas, Path path, int i) {
        if (Color.alpha(i) == 0) {
            return;
        }
        Paint paint = this.c0;
        paint.setColor(i);
        canvas.drawPath(path, paint);
        int iBlendARGB = ColorUtils.blendARGB(-1, i, 0.1f);
        Paint paint2 = this.f284493d0;
        paint2.setColor(iBlendARGB);
        canvas.drawPath(path, paint2);
    }

    public final void u(Canvas canvas, float f, Matrix matrix) {
        if (this.T) {
            Path path = this.B;
            path.rewind();
            path.addPath(this.A);
            path.offset(BitmapDescriptorFactory.HUE_RED, f);
            if (matrix != null) {
                path.transform(matrix);
            }
            Path path2 = this.C;
            path2.rewind();
            path2.addRect(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, canvas.getWidth(), canvas.getHeight(), Path.Direction.CW);
            path2.op(path, Path.Op.DIFFERENCE);
            canvas.drawPath(path2, this.f284494e0);
        }
    }

    public final void v(Canvas canvas, float f, float f4, float f5, float f6) {
        float f32 = f;
        while (f32 < f4) {
            RectF rectF = this.F;
            float fCenterX = rectF.centerX();
            float fCenterY = rectF.centerY();
            float fWidth = rectF.width() / 2.0f;
            float fHeight = rectF.height() / 2.0f;
            Path path = this.D;
            path.rewind();
            path.moveTo(f5, f32);
            if (f32 >= fCenterY - fHeight && f32 <= fCenterY + fHeight) {
                float f35 = (f32 - fCenterY) / fHeight;
                double d = 1.0d - ((double) (f35 * f35));
                if (d < 0.0d) {
                    d = 0.0d;
                }
                float fSqrt = fWidth * ((float) Math.sqrt(d));
                float f36 = fCenterX - fSqrt;
                float f37 = fCenterX + fSqrt;
                float f41 = this.g0;
                path.lineTo(f36 - f41, f32);
                float f42 = 0.4f * fSqrt;
                float f57 = 2;
                float f69 = f41 * f57;
                if (fSqrt < f69 && f32 > fCenterY) {
                    f42 /= f57;
                }
                float f75 = f41 / f57;
                float f77 = f32 - (f42 / f57);
                path.cubicTo(f36 - f75, f32, f36, f77, f36 + f41, f77);
                if (fSqrt > f69) {
                    path.quadTo(fCenterX, f32, f37 - f41, f77);
                } else {
                    path.quadTo(fCenterX, f77, f37 - f41, f77);
                }
                float f81 = f32;
                path.cubicTo(f37, f77, f75 + f37, f81, f37 + f41, f32);
                f32 = f81;
            }
            path.lineTo(f6, f32);
            canvas.drawPath(path, this.f284492b0);
            f32 += this.f0;
        }
    }

    public final void w() {
        Path path = this.A;
        boolean zIsEmpty = path.isEmpty();
        p pVar = this.f284496k0;
        if (zIsEmpty) {
            pVar.i.cancel();
            pVar.f284542b = false;
            return;
        }
        float fY = y();
        float fX = x();
        RectF rectF = this.F;
        path.computeBounds(rectF, false);
        pVar.b(rectF.centerX(), rectF.centerY() + r(rectF, fY, fX) + this.g0, rectF.height(), BitmapDescriptorFactory.HUE_RED);
    }

    public final float x() {
        d dVar = this.f284497w;
        dVar.getLocationOnScreen(this.N);
        dVar.getRootView().getLocationOnScreen(this.O);
        return (dVar.getRootView().getHeight() + r3[1]) - r1[1];
    }

    public final float y() {
        d dVar = this.f284497w;
        dVar.getLocationOnScreen(this.N);
        dVar.getRootView().getLocationOnScreen(this.O);
        return r2[1] - r1[1];
    }

    public final void z() {
        j jVar = this.U;
        rz.b bVar = jVar.f284526a;
        if (bVar == null) {
            return;
        }
        float f = bVar.f258441b;
        Rect rect = bVar.f258440a;
        if (jVar.f284527b == null || this.E.isEmpty() || rect.height() <= 0) {
            return;
        }
        this.f284497w.getLocationOnScreen(this.N);
        float fExactCenterX = (rect.exactCenterX() + r0.f258457a) - r4[0];
        float fExactCenterY = (rect.exactCenterY() + r0.f258458b) - r4[1];
        float fHeight = rect.height();
        p pVar = this.f284496k0;
        ValueAnimator valueAnimator = pVar.i;
        if (!pVar.f284542b) {
            pVar.b(fExactCenterX, fExactCenterY, fHeight, f);
            return;
        }
        float f4 = pVar.f;
        float f5 = (f - f4) % 360.0f;
        if (f5 > 180.0f) {
            f5 -= 360.0f;
        }
        if (f5 < -180.0f) {
            f5 += 360.0f;
        }
        float f6 = f4 + f5;
        if (p.a(pVar.f284543c, fExactCenterX) && p.a(pVar.d, fExactCenterY) && p.a(pVar.e, fHeight) && p.a(pVar.f, f6)) {
            return;
        }
        valueAnimator.cancel();
        o oVar = pVar.f284544g;
        float f32 = pVar.f284543c;
        float f35 = pVar.d;
        float f36 = pVar.e;
        float f37 = pVar.f;
        oVar.f284538a = f32;
        oVar.f284539b = f35;
        oVar.f284540c = f36;
        oVar.d = f37;
        o oVar2 = pVar.f284545h;
        oVar2.f284538a = fExactCenterX;
        oVar2.f284539b = fExactCenterY;
        oVar2.f284540c = fHeight;
        oVar2.d = f6;
        valueAnimator.start();
    }
}
