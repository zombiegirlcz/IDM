package com.revolut.core.ui_kit.internal.views;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import aw0.c9;
import aw0.d9;
import aw0.e9;
import aw0.f9;
import aw0.q9;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.internal.views.RadialGaugeView;
import com.revolut.core.ui_kit_resources.R$attr;
import java.util.ArrayList;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import ms0.q3;
import ms0.r3;
import org.jetbrains.annotations.NotNull;
import te0.w;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0007\u0018\u0000 +2\u00020\u0001:\u0002\n,B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0014\u0010\u0015R\u001b\u0010\u001b\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001b\u0010\u001e\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u0018\u001a\u0004\b\u001d\u0010\u001aR\u001b\u0010!\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010\u0018\u001a\u0004\b \u0010\u001aR\u001b\u0010$\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010\u0018\u001a\u0004\b#\u0010\u001aR\u001b\u0010'\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b%\u0010\u0018\u001a\u0004\b&\u0010\u001aR\u001b\u0010*\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b(\u0010\u0018\u001a\u0004\b)\u0010\u001a¨\u0006-"}, d2 = {"Lcom/revolut/core/ui_kit/internal/views/RadialGaugeView;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lms0/q3;", "size", "", "setChartSize", "(Lms0/q3;)V", "Law0/f9;", "data", "setGaugeData", "(Law0/f9;)V", "", "getOuterArcRadius", "()F", "Landroid/graphics/Paint;", "i", "Lkotlin/Lazy;", "getArcBackgroundPaint", "()Landroid/graphics/Paint;", "arcBackgroundPaint", "j", "getArcPositivePaint", "arcPositivePaint", "k", "getArcNegativePaint", "arcNegativePaint", "l", "getArcNeutralStaticPaint", "arcNeutralStaticPaint", "m", "getArcNeutralWarningPaint", "arcNeutralWarningPaint", "o", "getSplitterPaint", "splitterPaint", "Companion", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class RadialGaugeView extends View {

    @NotNull
    private static final a Companion = new a();

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final Pair[] f56338x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final Pair[] f56339y;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f56340a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f56341b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f56342c;
    public int d;
    public int e;
    public int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f56343g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f56344h;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public final Lazy arcBackgroundPaint;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    public final Lazy arcPositivePaint;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public final Lazy arcNegativePaint;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    public final Lazy arcNeutralStaticPaint;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    public final Lazy arcNeutralWarningPaint;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Paint f56348n;
    public final Object o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public f9 f56349p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public float f56350q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public float f56351r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final ArrayList f56352s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Path f56353t;
    public float u;
    public final Path v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public float f56354w;

    public static final class a {
        private a() {
        }
    }

    static {
        Float fValueOf = Float.valueOf(BitmapDescriptorFactory.HUE_RED);
        Pair pair = new Pair(fValueOf, Float.valueOf(0.31f));
        Pair pair2 = new Pair(Float.valueOf(0.3516f), Float.valueOf(0.6483f));
        Float fValueOf2 = Float.valueOf(0.6899f);
        Float fValueOf3 = Float.valueOf(1.0f);
        f56338x = new Pair[]{pair, pair2, new Pair(fValueOf2, fValueOf3)};
        f56339y = new Pair[]{new Pair(fValueOf, Float.valueOf(0.1696f)), new Pair(Float.valueOf(0.2096f), Float.valueOf(0.3793f)), new Pair(Float.valueOf(0.4193f), Float.valueOf(0.589f)), new Pair(Float.valueOf(0.629f), Float.valueOf(0.7986f)), new Pair(Float.valueOf(0.8386f), fValueOf3)};
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RadialGaugeView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static float g(float f, Pair[] pairArr) {
        float f4 = kotlin.ranges.f.f(f, BitmapDescriptorFactory.HUE_RED, 1.0f);
        float length = 1.0f / pairArr.length;
        int iNextAfter = f4 == BitmapDescriptorFactory.HUE_RED ? 0 : (int) (Math.nextAfter(f4, Double.NEGATIVE_INFINITY) / length);
        float fA = m72.b.a(iNextAfter, length, f4, length);
        Pair pair = pairArr[iNextAfter];
        return ((((Number) pair.f186386b).floatValue() - ((Number) pair.f186385a).floatValue()) * fA) + ((Number) pair.f186385a).floatValue();
    }

    private final Paint getArcBackgroundPaint() {
        return (Paint) this.arcBackgroundPaint.getValue();
    }

    private final Paint getArcNegativePaint() {
        return (Paint) this.arcNegativePaint.getValue();
    }

    private final Paint getArcNeutralStaticPaint() {
        return (Paint) this.arcNeutralStaticPaint.getValue();
    }

    private final Paint getArcNeutralWarningPaint() {
        return (Paint) this.arcNeutralWarningPaint.getValue();
    }

    private final Paint getArcPositivePaint() {
        return (Paint) this.arcPositivePaint.getValue();
    }

    private final float getOuterArcRadius() {
        return (this.d - this.f56340a) / 2.0f;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final Paint getSplitterPaint() {
        return (Paint) this.o.getValue();
    }

    public final Path a(float f, float f4) {
        float outerArcRadius = getOuterArcRadius();
        float f5 = outerArcRadius - this.e;
        double radians = Math.toRadians(-180.0d);
        double radians2 = Math.toRadians(180.0d);
        double d = (((double) f) * radians2) + radians;
        double d5 = (radians2 * ((double) f4)) + radians;
        float fD = d(f5);
        float fD2 = d(outerArcRadius);
        float fD3 = d(f5);
        double d6 = d5 - ((double) d(outerArcRadius));
        float fCos = (((float) Math.cos(d6)) * outerArcRadius) + this.f56350q;
        float fSin = (((float) Math.sin(d6)) * outerArcRadius) + this.f56351r;
        Path path = new Path();
        float f6 = this.f56350q;
        float f32 = f6 - f5;
        float f35 = this.f56351r;
        RectF rectF = new RectF(f32, f35 - f5, f6 + f5, f35 + f5);
        float degrees = (float) Math.toDegrees(((double) fD) + d);
        path.arcTo(rectF, degrees, ((float) Math.toDegrees(d5 - ((double) fD3))) - degrees);
        path.lineTo(fCos, fSin);
        float f36 = this.f56350q;
        float f37 = this.f56351r;
        RectF rectF2 = new RectF(f36 - outerArcRadius, f37 - outerArcRadius, f36 + outerArcRadius, f37 + outerArcRadius);
        float degrees2 = (float) Math.toDegrees(d + ((double) fD2));
        float degrees3 = ((float) Math.toDegrees(d6)) - degrees2;
        path.arcTo(rectF2, degrees2 + degrees3, -degrees3);
        path.close();
        return path;
    }

    public final void b() {
        Paint arcNeutralStaticPaint;
        float f;
        int i;
        float fG;
        float f4;
        float fG2;
        Paint arcPositivePaint;
        f9 f9Var = this.f56349p;
        if (f9Var == null) {
            return;
        }
        ArrayList arrayList = this.f56352s;
        arrayList.clear();
        Path path = this.f56353t;
        path.reset();
        Path path2 = this.v;
        path2.reset();
        boolean z = f9Var instanceof c9;
        if (z) {
            c9 c9Var = (c9) f9Var;
            f4 = c9Var.f10261a;
            int i2 = r3.f208397b[c9Var.f10262b.ordinal()];
            if (i2 == 1) {
                arcPositivePaint = getArcPositivePaint();
            } else if (i2 == 2) {
                arcPositivePaint = getArcNegativePaint();
            } else {
                if (i2 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                arcPositivePaint = getArcNeutralStaticPaint();
            }
            arrayList.add(new Pair(a(BitmapDescriptorFactory.HUE_RED, 1.0f), getArcBackgroundPaint()));
            arrayList.add(new Pair(a(BitmapDescriptorFactory.HUE_RED, f4), arcPositivePaint));
            f = 180.0f;
        } else {
            boolean z3 = f9Var instanceof e9;
            if (!z3) {
                throw new NoWhenBranchMatchedException();
            }
            e9 e9Var = (e9) f9Var;
            float f5 = e9Var.f10296a;
            int i3 = r3.f208398c[e9Var.d.ordinal()];
            if (i3 == 1) {
                arcNeutralStaticPaint = getArcNeutralStaticPaint();
            } else {
                if (i3 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                arcNeutralStaticPaint = getArcNeutralWarningPaint();
            }
            d9 d9Var = e9Var.f10298c;
            int[] iArr = r3.d;
            int i5 = iArr[d9Var.ordinal()];
            f = 180.0f;
            Pair[] pairArr = f56338x;
            Pair[] pairArr2 = f56339y;
            if (i5 == 1) {
                i = 2;
                fG = g(f5, pairArr);
                arrayList.add(new Pair(a(((Number) pairArr[0].f186385a).floatValue(), ((Number) pairArr[0].f186386b).floatValue()), getArcNegativePaint()));
                arrayList.add(new Pair(a(((Number) pairArr[1].f186385a).floatValue(), ((Number) pairArr[1].f186386b).floatValue()), arcNeutralStaticPaint));
                arrayList.add(new Pair(a(((Number) pairArr[2].f186385a).floatValue(), ((Number) pairArr[2].f186386b).floatValue()), getArcPositivePaint()));
            } else {
                if (i5 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                float fG3 = g(f5, pairArr2);
                i = 2;
                arrayList.add(new Pair(a(((Number) pairArr2[0].f186385a).floatValue(), ((Number) pairArr2[0].f186386b).floatValue()), getArcNegativePaint()));
                arrayList.add(new Pair(a(((Number) pairArr2[1].f186385a).floatValue(), ((Number) pairArr2[1].f186386b).floatValue()), getArcNegativePaint()));
                arrayList.add(new Pair(a(((Number) pairArr2[2].f186385a).floatValue(), ((Number) pairArr2[2].f186386b).floatValue()), arcNeutralStaticPaint));
                arrayList.add(new Pair(a(((Number) pairArr2[3].f186385a).floatValue(), ((Number) pairArr2[3].f186386b).floatValue()), getArcPositivePaint()));
                arrayList.add(new Pair(a(((Number) pairArr2[4].f186385a).floatValue(), ((Number) pairArr2[4].f186386b).floatValue()), getArcPositivePaint()));
                fG = fG3;
            }
            Float fValueOf = null;
            if (!z) {
                if (!z3) {
                    throw new NoWhenBranchMatchedException();
                }
                e9 e9Var2 = (e9) f9Var;
                Float f6 = e9Var2.f10297b;
                if (f6 != null) {
                    float fFloatValue = f6.floatValue();
                    int i6 = iArr[e9Var2.f10298c.ordinal()];
                    if (i6 == 1) {
                        fG2 = g(fFloatValue, pairArr);
                    } else {
                        if (i6 != i) {
                            throw new NoWhenBranchMatchedException();
                        }
                        fG2 = g(fFloatValue, pairArr2);
                    }
                    fValueOf = Float.valueOf(fG2);
                }
            }
            if (fValueOf != null) {
                float fFloatValue2 = fValueOf.floatValue();
                float f32 = (this.e / 2.0f) + (-getOuterArcRadius());
                float f35 = this.f56342c / 2;
                path2.moveTo(BitmapDescriptorFactory.HUE_RED, f35 + f32);
                path2.lineTo(BitmapDescriptorFactory.HUE_RED, f32 - f35);
                this.f56354w = (fFloatValue2 * 180.0f) - 90.0f;
            }
            f4 = fG;
        }
        float f36 = this.f;
        float f37 = this.f56341b;
        float f41 = f36 - (f37 / 2);
        path.moveTo(f41, BitmapDescriptorFactory.HUE_RED);
        float f42 = -f41;
        path.arcTo(new RectF(f42, f42, f41, f41), BitmapDescriptorFactory.HUE_RED, -180.0f);
        path.lineTo(BitmapDescriptorFactory.HUE_RED, this.f56343g - f37);
        path.lineTo(f41, BitmapDescriptorFactory.HUE_RED);
        path.close();
        this.u = ((f4 * f) - 180.0f) - 90.0f;
    }

    public final Paint c(int i) {
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeWidth(this.f56340a);
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        paint.setColor(kli.a.s(i, context));
        return paint;
    }

    public final float d(float f) {
        return (float) Math.atan(Math.tan(((double) (this.f56340a / 2.0f)) / ((double) f)));
    }

    public final float e(float f) {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        return kli.a.l(context, f);
    }

    public final int f(int i) {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        return kli.a.k(context, i);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        for (Pair pair : this.f56352s) {
            canvas.drawPath((Path) pair.f186385a, (Paint) pair.f186386b);
        }
        Path path = this.f56353t;
        if (path.isEmpty()) {
            path = null;
        }
        if (path != null) {
            canvas.save();
            canvas.translate(this.f56350q, this.f56351r);
            canvas.rotate(this.u);
            canvas.drawPath(path, this.f56348n);
            canvas.restore();
        }
        Path path2 = this.v;
        Path path3 = path2.isEmpty() ? null : path2;
        if (path3 != null) {
            canvas.save();
            canvas.translate(this.f56350q, this.f56351r);
            canvas.rotate(this.f56354w);
            canvas.drawPath(path3, getSplitterPaint());
            canvas.restore();
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int iC = 0;
        if (this.d == 0 || this.e == 0) {
            setMeasuredDimension(0, 0);
            return;
        }
        f9 f9Var = this.f56349p;
        if (!(f9Var instanceof c9)) {
            if (f9Var instanceof e9) {
                if (((e9) f9Var).f10297b != null) {
                    iC = rim.d.c(this.f56344h);
                }
            } else if (f9Var != null) {
                throw new NoWhenBranchMatchedException();
            }
        }
        int i3 = (iC * 2) + this.d;
        int iC2 = rim.d.c((this.f56340a / 2.0f) + (i3 / 2.0f)) + this.f + iC;
        int mode = View.MeasureSpec.getMode(i2);
        if (mode == Integer.MIN_VALUE) {
            iC2 = Math.min(iC2, View.MeasureSpec.getSize(i2));
        } else if (mode == 1073741824) {
            iC2 = View.MeasureSpec.getSize(i2);
        }
        setMeasuredDimension(i3, iC2);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i5) {
        super.onSizeChanged(i, i2, i3, i5);
        this.f56350q = i / 2.0f;
        this.f56351r = (i2 - (this.f56340a / 2.0f)) - this.f;
        b();
    }

    public final void setChartSize(@NotNull q3 size) {
        Intrinsics.checkNotNullParameter(size, "size");
        int i = r3.f208396a[size.ordinal()];
        if (i == 1) {
            this.d = f(64);
            this.e = f(2);
            this.f = f(3);
            this.f56343g = f(22);
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            this.d = f(128);
            this.e = f(4);
            this.f = f(4);
            this.f56343g = f(48);
        }
        b();
        requestLayout();
        invalidate();
    }

    public final void setGaugeData(@NotNull f9 data) {
        Intrinsics.checkNotNullParameter(data, "data");
        f9 f9Var = this.f56349p;
        e9 e9Var = f9Var instanceof e9 ? (e9) f9Var : null;
        boolean z = (e9Var != null ? e9Var.f10297b : null) != null;
        boolean z3 = data instanceof e9;
        e9 e9Var2 = z3 ? (e9) data : null;
        boolean z4 = (!(f9Var instanceof e9) && z3) || ((f9Var instanceof e9) && !z3) || z != ((e9Var2 != null ? e9Var2.f10297b : null) != null);
        this.f56349p = data;
        b();
        invalidate();
        if (z4) {
            requestLayout();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RadialGaugeView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RadialGaugeView(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        setWillNotDraw(false);
        setChartSize(q3.SMALL);
        int iF = f(4);
        this.f56340a = iF;
        float fE = e(1.5f);
        this.f56341b = fE;
        float fE2 = e(10.0f);
        this.f56342c = fE2;
        this.f56344h = ((fE2 - this.e) - iF) / 2;
        final int i2 = 0;
        this.arcBackgroundPaint = yhm.j.b(new Function0(this) { // from class: ms0.p3

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RadialGaugeView f208367b;

            {
                this.f208367b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i3 = i2;
                RadialGaugeView radialGaugeView = this.f208367b;
                switch (i3) {
                    case 0:
                        Pair[] pairArr = RadialGaugeView.f56338x;
                        return radialGaugeView.c(R$attr.uikit_colorGreyTone10);
                    case 1:
                        Pair[] pairArr2 = RadialGaugeView.f56338x;
                        return radialGaugeView.c(R$attr.uikit_colorPerformancePositive);
                    case 2:
                        Pair[] pairArr3 = RadialGaugeView.f56338x;
                        return radialGaugeView.c(R$attr.uikit_colorPerformanceNegative);
                    case 3:
                        Pair[] pairArr4 = RadialGaugeView.f56338x;
                        return radialGaugeView.c(q9.STATIC.a());
                    case 4:
                        Pair[] pairArr5 = RadialGaugeView.f56338x;
                        return radialGaugeView.c(q9.WARNING.a());
                    default:
                        Pair[] pairArr6 = RadialGaugeView.f56338x;
                        Paint paint = new Paint(1);
                        paint.setStyle(Paint.Style.STROKE);
                        int i5 = R$attr.uikit_colorForeground;
                        Context context2 = radialGaugeView.getContext();
                        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                        paint.setColor(kli.a.s(i5, context2));
                        paint.setStrokeWidth(radialGaugeView.e(1.0f));
                        paint.setStrokeCap(Paint.Cap.ROUND);
                        paint.setPathEffect(new DashPathEffect(new float[]{radialGaugeView.e(2.5f), radialGaugeView.e(1.5f)}, radialGaugeView.e(1.25f)));
                        return paint;
                }
            }
        });
        final int i3 = 1;
        this.arcPositivePaint = yhm.j.b(new Function0(this) { // from class: ms0.p3

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RadialGaugeView f208367b;

            {
                this.f208367b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i32 = i3;
                RadialGaugeView radialGaugeView = this.f208367b;
                switch (i32) {
                    case 0:
                        Pair[] pairArr = RadialGaugeView.f56338x;
                        return radialGaugeView.c(R$attr.uikit_colorGreyTone10);
                    case 1:
                        Pair[] pairArr2 = RadialGaugeView.f56338x;
                        return radialGaugeView.c(R$attr.uikit_colorPerformancePositive);
                    case 2:
                        Pair[] pairArr3 = RadialGaugeView.f56338x;
                        return radialGaugeView.c(R$attr.uikit_colorPerformanceNegative);
                    case 3:
                        Pair[] pairArr4 = RadialGaugeView.f56338x;
                        return radialGaugeView.c(q9.STATIC.a());
                    case 4:
                        Pair[] pairArr5 = RadialGaugeView.f56338x;
                        return radialGaugeView.c(q9.WARNING.a());
                    default:
                        Pair[] pairArr6 = RadialGaugeView.f56338x;
                        Paint paint = new Paint(1);
                        paint.setStyle(Paint.Style.STROKE);
                        int i5 = R$attr.uikit_colorForeground;
                        Context context2 = radialGaugeView.getContext();
                        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                        paint.setColor(kli.a.s(i5, context2));
                        paint.setStrokeWidth(radialGaugeView.e(1.0f));
                        paint.setStrokeCap(Paint.Cap.ROUND);
                        paint.setPathEffect(new DashPathEffect(new float[]{radialGaugeView.e(2.5f), radialGaugeView.e(1.5f)}, radialGaugeView.e(1.25f)));
                        return paint;
                }
            }
        });
        final int i5 = 2;
        this.arcNegativePaint = yhm.j.b(new Function0(this) { // from class: ms0.p3

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RadialGaugeView f208367b;

            {
                this.f208367b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i32 = i5;
                RadialGaugeView radialGaugeView = this.f208367b;
                switch (i32) {
                    case 0:
                        Pair[] pairArr = RadialGaugeView.f56338x;
                        return radialGaugeView.c(R$attr.uikit_colorGreyTone10);
                    case 1:
                        Pair[] pairArr2 = RadialGaugeView.f56338x;
                        return radialGaugeView.c(R$attr.uikit_colorPerformancePositive);
                    case 2:
                        Pair[] pairArr3 = RadialGaugeView.f56338x;
                        return radialGaugeView.c(R$attr.uikit_colorPerformanceNegative);
                    case 3:
                        Pair[] pairArr4 = RadialGaugeView.f56338x;
                        return radialGaugeView.c(q9.STATIC.a());
                    case 4:
                        Pair[] pairArr5 = RadialGaugeView.f56338x;
                        return radialGaugeView.c(q9.WARNING.a());
                    default:
                        Pair[] pairArr6 = RadialGaugeView.f56338x;
                        Paint paint = new Paint(1);
                        paint.setStyle(Paint.Style.STROKE);
                        int i59 = R$attr.uikit_colorForeground;
                        Context context2 = radialGaugeView.getContext();
                        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                        paint.setColor(kli.a.s(i59, context2));
                        paint.setStrokeWidth(radialGaugeView.e(1.0f));
                        paint.setStrokeCap(Paint.Cap.ROUND);
                        paint.setPathEffect(new DashPathEffect(new float[]{radialGaugeView.e(2.5f), radialGaugeView.e(1.5f)}, radialGaugeView.e(1.25f)));
                        return paint;
                }
            }
        });
        final int i6 = 3;
        this.arcNeutralStaticPaint = yhm.j.b(new Function0(this) { // from class: ms0.p3

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RadialGaugeView f208367b;

            {
                this.f208367b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i32 = i6;
                RadialGaugeView radialGaugeView = this.f208367b;
                switch (i32) {
                    case 0:
                        Pair[] pairArr = RadialGaugeView.f56338x;
                        return radialGaugeView.c(R$attr.uikit_colorGreyTone10);
                    case 1:
                        Pair[] pairArr2 = RadialGaugeView.f56338x;
                        return radialGaugeView.c(R$attr.uikit_colorPerformancePositive);
                    case 2:
                        Pair[] pairArr3 = RadialGaugeView.f56338x;
                        return radialGaugeView.c(R$attr.uikit_colorPerformanceNegative);
                    case 3:
                        Pair[] pairArr4 = RadialGaugeView.f56338x;
                        return radialGaugeView.c(q9.STATIC.a());
                    case 4:
                        Pair[] pairArr5 = RadialGaugeView.f56338x;
                        return radialGaugeView.c(q9.WARNING.a());
                    default:
                        Pair[] pairArr6 = RadialGaugeView.f56338x;
                        Paint paint = new Paint(1);
                        paint.setStyle(Paint.Style.STROKE);
                        int i59 = R$attr.uikit_colorForeground;
                        Context context2 = radialGaugeView.getContext();
                        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                        paint.setColor(kli.a.s(i59, context2));
                        paint.setStrokeWidth(radialGaugeView.e(1.0f));
                        paint.setStrokeCap(Paint.Cap.ROUND);
                        paint.setPathEffect(new DashPathEffect(new float[]{radialGaugeView.e(2.5f), radialGaugeView.e(1.5f)}, radialGaugeView.e(1.25f)));
                        return paint;
                }
            }
        });
        final int i21 = 4;
        this.arcNeutralWarningPaint = yhm.j.b(new Function0(this) { // from class: ms0.p3

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RadialGaugeView f208367b;

            {
                this.f208367b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i32 = i21;
                RadialGaugeView radialGaugeView = this.f208367b;
                switch (i32) {
                    case 0:
                        Pair[] pairArr = RadialGaugeView.f56338x;
                        return radialGaugeView.c(R$attr.uikit_colorGreyTone10);
                    case 1:
                        Pair[] pairArr2 = RadialGaugeView.f56338x;
                        return radialGaugeView.c(R$attr.uikit_colorPerformancePositive);
                    case 2:
                        Pair[] pairArr3 = RadialGaugeView.f56338x;
                        return radialGaugeView.c(R$attr.uikit_colorPerformanceNegative);
                    case 3:
                        Pair[] pairArr4 = RadialGaugeView.f56338x;
                        return radialGaugeView.c(q9.STATIC.a());
                    case 4:
                        Pair[] pairArr5 = RadialGaugeView.f56338x;
                        return radialGaugeView.c(q9.WARNING.a());
                    default:
                        Pair[] pairArr6 = RadialGaugeView.f56338x;
                        Paint paint = new Paint(1);
                        paint.setStyle(Paint.Style.STROKE);
                        int i59 = R$attr.uikit_colorForeground;
                        Context context2 = radialGaugeView.getContext();
                        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                        paint.setColor(kli.a.s(i59, context2));
                        paint.setStrokeWidth(radialGaugeView.e(1.0f));
                        paint.setStrokeCap(Paint.Cap.ROUND);
                        paint.setPathEffect(new DashPathEffect(new float[]{radialGaugeView.e(2.5f), radialGaugeView.e(1.5f)}, radialGaugeView.e(1.25f)));
                        return paint;
                }
            }
        });
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        int i22 = R$attr.uikit_colorForeground;
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        paint.setColor(kli.a.s(i22, context2));
        paint.setStrokeWidth(fE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        this.f56348n = paint;
        final int i32 = 5;
        this.o = w.y0(new Function0(this) { // from class: ms0.p3

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RadialGaugeView f208367b;

            {
                this.f208367b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i322 = i32;
                RadialGaugeView radialGaugeView = this.f208367b;
                switch (i322) {
                    case 0:
                        Pair[] pairArr = RadialGaugeView.f56338x;
                        return radialGaugeView.c(R$attr.uikit_colorGreyTone10);
                    case 1:
                        Pair[] pairArr2 = RadialGaugeView.f56338x;
                        return radialGaugeView.c(R$attr.uikit_colorPerformancePositive);
                    case 2:
                        Pair[] pairArr3 = RadialGaugeView.f56338x;
                        return radialGaugeView.c(R$attr.uikit_colorPerformanceNegative);
                    case 3:
                        Pair[] pairArr4 = RadialGaugeView.f56338x;
                        return radialGaugeView.c(q9.STATIC.a());
                    case 4:
                        Pair[] pairArr5 = RadialGaugeView.f56338x;
                        return radialGaugeView.c(q9.WARNING.a());
                    default:
                        Pair[] pairArr6 = RadialGaugeView.f56338x;
                        Paint paint2 = new Paint(1);
                        paint2.setStyle(Paint.Style.STROKE);
                        int i59 = R$attr.uikit_colorForeground;
                        Context context22 = radialGaugeView.getContext();
                        Intrinsics.checkNotNullExpressionValue(context22, "getContext(...)");
                        paint2.setColor(kli.a.s(i59, context22));
                        paint2.setStrokeWidth(radialGaugeView.e(1.0f));
                        paint2.setStrokeCap(Paint.Cap.ROUND);
                        paint2.setPathEffect(new DashPathEffect(new float[]{radialGaugeView.e(2.5f), radialGaugeView.e(1.5f)}, radialGaugeView.e(1.25f)));
                        return paint2;
                }
            }
        });
        this.f56352s = new ArrayList();
        this.f56353t = new Path();
        this.v = new Path();
    }

    public /* synthetic */ RadialGaugeView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
