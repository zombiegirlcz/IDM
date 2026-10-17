package com.revolut.core.ui_kit.internal.views.fanchart;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import aw0.a4;
import aw0.b4;
import aw0.l1;
import aw0.m1;
import aw0.r3;
import aw0.s3;
import aw0.t3;
import aw0.u3;
import aw0.v3;
import aw0.w3;
import aw0.y3;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.internal.views.fanchart.FanChartView;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit_resources.R$attr;
import ht0.v;
import ir0.g;
import iv0.j;
import java.util.List;
import jb3.l;
import jo0.m;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import lt0.h;
import lt0.k;
import lt0.n;
import ms0.j;
import ms0.o;
import org.jetbrains.annotations.NotNull;
import uw0.i;
import yhm.r;
import zhm.f0;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0019\b\u0000\u0018\u00002\u00020\u0001:\u0005@ABCDB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010R.\u0010\u0019\u001a\u0004\u0018\u00010\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R(\u0010\u001f\u001a\u0004\u0018\u00010\u001a2\b\u0010\u0012\u001a\u0004\u0018\u00010\u001a8\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR(\u0010%\u001a\u0004\u0018\u00010 2\b\u0010\u0012\u001a\u0004\u0018\u00010 8\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001b\u0010+\u001a\u00020&8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R$\u00101\u001a\u00020,2\u0006\u0010\u0012\u001a\u00020,8\u0002@BX\u0083\u000e¢\u0006\f\n\u0004\b-\u0010.\"\u0004\b/\u00100R$\u00104\u001a\u00020,2\u0006\u0010\u0012\u001a\u00020,8\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b2\u0010.\"\u0004\b3\u00100R\u0014\u00107\u001a\u00020\u00068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b5\u00106R\u0014\u00109\u001a\u00020\u00068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b8\u00106R\u0014\u0010;\u001a\u00020\u00068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b:\u00106R\u0014\u0010=\u001a\u00020\u00068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b<\u00106R\u0014\u0010?\u001a\u00020\u00068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b>\u00106¨\u0006E"}, d2 = {"Lcom/revolut/core/ui_kit/internal/views/fanchart/FanChartView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Law0/s3;", "fanChartModel", "Law0/r3;", "colorScheme", "", "setData", "(Law0/s3;Law0/r3;)V", "Luw0/i;", "value", "c", "Luw0/i;", "getDataChangeAnimationRequest", "()Luw0/i;", "setDataChangeAnimationRequest", "(Luw0/i;)V", "dataChangeAnimationRequest", "Law0/b4;", "d", "Law0/b4;", "setFanChartYAxisLegends", "(Law0/b4;)V", "fanChartYAxisLegends", "Law0/a4;", "e", "Law0/a4;", "setXAxisLegends", "(Law0/a4;)V", "xAxisLegends", "Lht0/v;", "h", "Lkotlin/Lazy;", "getSmoother", "()Lht0/v;", "smoother", "", "L", "F", "setCircleAnimation", "(F)V", "circleAnimation", "N", "setAppearingAnimatedValue", "appearingAnimatedValue", "getHighEffectiveColor", "()I", "highEffectiveColor", "getAverageEffectiveColor", "averageEffectiveColor", "getLowEffectiveColor", "lowEffectiveColor", "getExtraLowEffectiveColor", "extraLowEffectiveColor", "getCurrentEffectiveColor", "currentEffectiveColor", "lt0/j", "lt0/k", "a", "lt0/h", "lt0/m", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class FanChartView extends FrameLayout {
    public static final /* synthetic */ int Q = 0;
    public Path A;
    public Path B;
    public Path C;
    public Path D;
    public Path E;
    public h F;
    public aim.e G;
    public final o H;
    public boolean I;
    public boolean J;
    public boolean K;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    public float circleAnimation;
    public final ObjectAnimator M;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    public float appearingAnimatedValue;
    public final g O;
    public final j P;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ihm.f f56963a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public s3 f56964b;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public i dataChangeAnimationRequest;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public b4 fanChartYAxisLegends;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public a4 xAxisLegends;
    public r3 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f56966g;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    public final Lazy smoother;
    public List i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final k f56968j;
    public final a k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final nr0.e f56969l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final SparseIntArray f56970m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f56971n;
    public RectF o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public RectF f56972p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public RectF f56973q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public RectF f56974r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public RectF f56975s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public PointF f56976t;
    public PointF u;
    public PointF v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public PointF f56977w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public PointF f56978x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Path f56979y;
    public Path z;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f56980a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final Paint f56981b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final Paint f56982c;
        public static final Paint d;
        public static final Paint e;
        public static final r f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final TextPaint f56983g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final TextPaint f56984h;
        public static final Paint i;

        static {
            Paint paintC = com.google.android.gms.internal.mlkit_vision_face.a.c(true);
            Paint.Style style = Paint.Style.FILL_AND_STROKE;
            paintC.setStyle(style);
            f56981b = paintC;
            Paint paintC2 = com.google.android.gms.internal.mlkit_vision_face.a.c(true);
            Paint.Style style2 = Paint.Style.STROKE;
            paintC2.setStyle(style2);
            f56982c = paintC2;
            Paint paint = new Paint();
            paint.setAntiAlias(true);
            paint.setStyle(style2);
            d = paint;
            Paint paint2 = new Paint();
            paint2.setAntiAlias(true);
            paint2.setStyle(style);
            e = paint2;
            Paint paintC3 = com.google.android.gms.internal.mlkit_vision_face.a.c(true);
            Paint.Style style3 = Paint.Style.FILL;
            paintC3.setStyle(style3);
            paintC3.setColor(-1);
            Paint paint3 = new Paint();
            paint3.setAntiAlias(true);
            paint3.setStyle(style2);
            Paint paint4 = new Paint();
            paint4.setAntiAlias(true);
            paint4.setStyle(style3);
            Unit unit = Unit.f186387a;
            f = new r(paintC3, paint3, paint4);
            TextPaint textPaint = new TextPaint();
            textPaint.setAntiAlias(true);
            textPaint.setTextAlign(Paint.Align.RIGHT);
            f56983g = textPaint;
            TextPaint textPaint2 = new TextPaint();
            textPaint2.setAntiAlias(true);
            textPaint2.setTextAlign(Paint.Align.CENTER);
            f56984h = textPaint2;
            Paint paint5 = new Paint();
            paint5.setAntiAlias(true);
            paint5.setStyle(style2);
            paint5.setDither(true);
            paint5.setStrokeJoin(Paint.Join.ROUND);
            paint5.setStrokeCap(Paint.Cap.ROUND);
            i = paint5;
        }

        private a() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FanChartView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static int f(v3 v3Var, int i) {
        if (v3Var == null) {
            return i;
        }
        if (v3Var.equals(u3.f10555a)) {
            return R$attr.uikit_colorPerformancePositive;
        }
        if (v3Var.equals(t3.f10540a)) {
            return R$attr.uikit_colorPerformanceNegative;
        }
        throw new NoWhenBranchMatchedException();
    }

    private final int getAverageEffectiveColor() {
        w3 w3VarG;
        s3 s3Var = this.f56964b;
        v3 v3Var = (s3Var == null || (w3VarG = s3Var.g()) == null) ? null : w3VarG.f10584b;
        r3 r3Var = this.f;
        Integer num = r3Var.f10509a;
        return e(f(v3Var, num != null ? num.intValue() : r3Var.f10510b));
    }

    private final int getCurrentEffectiveColor() {
        w3 current;
        s3 s3Var = this.f56964b;
        v3 v3Var = (s3Var == null || (current = s3Var.getCurrent()) == null) ? null : current.f10584b;
        r3 r3Var = this.f;
        Integer num = r3Var.f10509a;
        return e(f(v3Var, num != null ? num.intValue() : r3Var.f10510b));
    }

    private final int getExtraLowEffectiveColor() {
        w3 w3VarF;
        s3 s3Var = this.f56964b;
        return e(f((s3Var == null || (w3VarF = s3Var.f()) == null) ? null : w3VarF.f10584b, this.f.f10510b));
    }

    private final int getHighEffectiveColor() {
        w3 w3VarB;
        s3 s3Var = this.f56964b;
        return e(f((s3Var == null || (w3VarB = s3Var.b()) == null) ? null : w3VarB.f10584b, this.f.f10510b));
    }

    private final int getLowEffectiveColor() {
        w3 w3VarD;
        s3 s3Var = this.f56964b;
        return e(f((s3Var == null || (w3VarD = s3Var.d()) == null) ? null : w3VarD.f10584b, this.f.f10510b));
    }

    private final v getSmoother() {
        return (v) this.smoother.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setAppearingAnimatedValue(float f) {
        this.appearingAnimatedValue = f;
        invalidate();
    }

    private final void setCircleAnimation(float f) {
        this.circleAnimation = f;
        invalidate();
    }

    private final void setFanChartYAxisLegends(b4 b4Var) {
        b4 b4Var2 = this.fanChartYAxisLegends;
        a aVar = this.k;
        nr0.e eVar = this.f56969l;
        if (b4Var2 != null) {
            Clause clause = b4Var2.f10246b;
            aVar.getClass();
            TextPaint textPaint = a.f56983g;
            eVar.e(clause, textPaint);
            eVar.e(b4Var2.f10247c, textPaint);
            eVar.e(b4Var2.d, textPaint);
            eVar.e(b4Var2.e, textPaint);
        }
        this.fanChartYAxisLegends = b4Var;
        o oVar = this.H;
        if (b4Var != null) {
            Clause clause2 = b4Var.f10246b;
            aVar.getClass();
            TextPaint textPaint2 = a.f56983g;
            eVar.f(clause2, textPaint2);
            eVar.f(b4Var.f10247c, textPaint2);
            eVar.f(b4Var.d, textPaint2);
            eVar.f(b4Var.e, textPaint2);
            Clause clause3 = b4Var.f10245a;
            if (clause3 != null) {
                oVar.setContent(new ms0.k(clause3, null));
            }
        }
        oVar.setVisibility((b4Var != null ? b4Var.f10245a : null) != null ? 0 : 8);
    }

    private final void setXAxisLegends(a4 a4Var) {
        a4 a4Var2 = this.xAxisLegends;
        a aVar = this.k;
        nr0.e eVar = this.f56969l;
        if (a4Var2 != null) {
            TimeClause timeClause = a4Var2.f10229c;
            aVar.getClass();
            TextPaint textPaint = a.f56984h;
            eVar.e(timeClause, textPaint);
            eVar.e(a4Var2.f10227a, textPaint);
            eVar.e(a4Var2.f10228b, textPaint);
        }
        this.xAxisLegends = a4Var;
        if (a4Var != null) {
            TimeClause timeClause2 = a4Var.f10229c;
            aVar.getClass();
            TextPaint textPaint2 = a.f56984h;
            eVar.f(timeClause2, textPaint2);
            eVar.f(a4Var.f10227a, textPaint2);
            eVar.f(a4Var.f10228b, textPaint2);
        }
    }

    public final void b(Canvas canvas) {
        Integer num;
        if (this.f56966g && (num = this.f.f10509a) != null) {
            int iIntValue = num.intValue();
            int iSave = canvas.save();
            try {
                Path path = this.f56979y;
                if (path == null) {
                    Intrinsics.r("gradientPath");
                    throw null;
                }
                canvas.clipPath(path);
                this.k.getClass();
                Paint paint = a.f56981b;
                paint.setColor(e(iIntValue));
                paint.setAlpha(25);
                canvas.drawPaint(paint);
            } finally {
                canvas.restoreToCount(iSave);
            }
        }
    }

    public final void c(Canvas canvas) {
        PointF pointF;
        this.k.getClass();
        Paint paint = a.e;
        boolean z = this.I;
        k kVar = this.f56968j;
        if (z) {
            paint.setColor(getHighEffectiveColor());
            PointF pointF2 = this.u;
            if (pointF2 == null) {
                Intrinsics.r("highDot");
                throw null;
            }
            canvas.drawCircle(pointF2.x, pointF2.y, kVar.f199741a, paint);
        }
        if (this.J) {
            paint.setColor(getLowEffectiveColor());
            PointF pointF3 = this.v;
            if (pointF3 == null) {
                Intrinsics.r("lowDot");
                throw null;
            }
            canvas.drawCircle(pointF3.x, pointF3.y, kVar.f199741a, paint);
        }
        if (this.K && (pointF = this.f56978x) != null) {
            paint.setColor(getExtraLowEffectiveColor());
            canvas.drawCircle(pointF.x, pointF.y, kVar.f199741a, paint);
        }
        paint.setColor(getAverageEffectiveColor());
        PointF pointF4 = this.f56977w;
        if (pointF4 == null) {
            Intrinsics.r("averageDot");
            throw null;
        }
        float f = pointF4.x;
        float f4 = pointF4.y;
        int i = kVar.f199741a;
        int i2 = kVar.f199741a;
        canvas.drawCircle(f, f4, i, paint);
        r rVar = a.f;
        Paint paint2 = (Paint) rVar.f314201a;
        Paint paint3 = (Paint) rVar.f314202b;
        Paint paint4 = (Paint) rVar.f314203c;
        paint4.setColor(getCurrentEffectiveColor());
        paint4.setAlpha((int) ((1 - this.circleAnimation) * 0.6f * 255));
        paint3.setColor(getCurrentEffectiveColor());
        paint3.setStrokeWidth(kVar.f199743c);
        PointF pointF5 = this.f56976t;
        if (pointF5 == null) {
            Intrinsics.r("currentDot");
            throw null;
        }
        canvas.drawCircle(pointF5.x, pointF5.y, ((kVar.f199742b - i2) * this.circleAnimation) + i2, paint4);
        PointF pointF6 = this.f56976t;
        if (pointF6 == null) {
            Intrinsics.r("currentDot");
            throw null;
        }
        canvas.drawCircle(pointF6.x, pointF6.y, i2, paint2);
        PointF pointF7 = this.f56976t;
        if (pointF7 != null) {
            canvas.drawCircle(pointF7.x, pointF7.y, i2, paint3);
        } else {
            Intrinsics.r("currentDot");
            throw null;
        }
    }

    public final void d(Canvas canvas) {
        Path path;
        this.k.getClass();
        Paint paint = a.f56982c;
        paint.setColor(e(this.f.f10510b));
        Path path2 = this.z;
        if (path2 == null) {
            Intrinsics.r("verticalPath");
            throw null;
        }
        canvas.drawPath(path2, paint);
        Paint paint2 = a.d;
        k kVar = this.f56968j;
        paint2.setPathEffect(kVar.f);
        if (this.I) {
            paint2.setColor(getHighEffectiveColor());
            Path path3 = this.A;
            if (path3 == null) {
                Intrinsics.r("highPath");
                throw null;
            }
            canvas.drawPath(path3, paint2);
        }
        if (this.J) {
            paint2.setColor(getLowEffectiveColor());
            Path path4 = this.B;
            if (path4 == null) {
                Intrinsics.r("lowPath");
                throw null;
            }
            canvas.drawPath(path4, paint2);
        }
        if (this.K && (path = this.D) != null) {
            paint2.setColor(getExtraLowEffectiveColor());
            canvas.drawPath(path, paint2);
        }
        int averageEffectiveColor = getAverageEffectiveColor();
        g gVar = this.O;
        gVar.d(averageEffectiveColor);
        gVar.s(kVar.f);
        Path path5 = this.C;
        if (path5 != null) {
            gVar.e(canvas, path5, true, true);
        } else {
            Intrinsics.r("averagePath");
            throw null;
        }
    }

    public final int e(int i) {
        SparseIntArray sparseIntArray = this.f56970m;
        int iIndexOfKey = sparseIntArray.indexOfKey(i);
        if (iIndexOfKey >= 0) {
            return sparseIntArray.valueAt(iIndexOfKey);
        }
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int iS = kli.a.s(i, context);
        sparseIntArray.put(i, iS);
        return iS;
    }

    public final i getDataChangeAnimationRequest() {
        return this.dataChangeAnimationRequest;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (m.f176851h) {
            this.M.start();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        if (m.f176851h) {
            this.M.cancel();
        }
        super.onDetachedFromWindow();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0484  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x04ea  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0506  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0520  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x066d  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x0679  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x067c  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x068b  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x06e1  */
    /* JADX WARN: Removed duplicated region for block: B:386:0x0832  */
    /* JADX WARN: Type inference failed for: r0v105 */
    /* JADX WARN: Type inference failed for: r0v106 */
    /* JADX WARN: Type inference failed for: r0v40 */
    /* JADX WARN: Type inference failed for: r0v41, types: [android.graphics.Path] */
    /* JADX WARN: Type inference failed for: r0v47 */
    /* JADX WARN: Type inference failed for: r0v48, types: [java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r0v53 */
    /* JADX WARN: Type inference failed for: r0v54, types: [aim.e] */
    /* JADX WARN: Type inference failed for: r0v73, types: [aim.e, java.util.List] */
    /* JADX WARN: Type inference failed for: r11v40 */
    /* JADX WARN: Type inference failed for: r11v41, types: [aw0.v3] */
    /* JADX WARN: Type inference failed for: r11v61 */
    /* JADX WARN: Type inference failed for: r15v13 */
    /* JADX WARN: Type inference failed for: r15v14, types: [aw0.v3] */
    /* JADX WARN: Type inference failed for: r15v21 */
    /* JADX WARN: Type inference failed for: r15v22 */
    /* JADX WARN: Type inference failed for: r15v5 */
    /* JADX WARN: Type inference failed for: r15v6, types: [aw0.v3] */
    /* JADX WARN: Type inference failed for: r26v0, types: [java.lang.Number] */
    /* JADX WARN: Type inference failed for: r3v144 */
    /* JADX WARN: Type inference failed for: r3v145 */
    /* JADX WARN: Type inference failed for: r3v146 */
    /* JADX WARN: Type inference failed for: r3v33 */
    /* JADX WARN: Type inference failed for: r3v34, types: [aw0.y3] */
    /* JADX WARN: Type inference failed for: r3v51 */
    /* JADX WARN: Type inference failed for: r3v52, types: [android.graphics.PointF] */
    /* JADX WARN: Type inference failed for: r3v78 */
    /* JADX WARN: Type inference failed for: r3v79, types: [android.graphics.Path] */
    /* JADX WARN: Type inference failed for: r9v29, types: [android.graphics.PointF] */
    /* JADX WARN: Type inference failed for: r9v30, types: [android.graphics.PointF] */
    /* JADX WARN: Type inference failed for: r9v31, types: [android.graphics.PointF] */
    /* JADX WARN: Type inference failed for: r9v35 */
    /* JADX WARN: Type inference failed for: r9v36 */
    /* JADX WARN: Type inference failed for: r9v43 */
    /* JADX WARN: Type inference failed for: r9v44, types: [aw0.v3] */
    /* JADX WARN: Type inference failed for: r9v67 */
    /* JADX WARN: Type inference failed for: r9v68 */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onDraw(android.graphics.Canvas r31) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2439
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.core.ui_kit.internal.views.fanchart.FanChartView.onDraw(android.graphics.Canvas):void");
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int suggestedMinimumWidth = getSuggestedMinimumWidth();
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == Integer.MIN_VALUE) {
            suggestedMinimumWidth = Math.min(suggestedMinimumWidth, size);
        } else if (mode == 1073741824) {
            suggestedMinimumWidth = size;
        }
        int suggestedMinimumHeight = getSuggestedMinimumHeight();
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode2 == Integer.MIN_VALUE) {
            suggestedMinimumHeight = Math.min(suggestedMinimumHeight, size2);
        } else if (mode2 == 1073741824) {
            suggestedMinimumHeight = size2;
        }
        setMeasuredDimension(suggestedMinimumWidth, suggestedMinimumHeight);
    }

    public final void setData(@NotNull s3 fanChartModel, @NotNull r3 colorScheme) {
        List list;
        Intrinsics.checkNotNullParameter(fanChartModel, "fanChartModel");
        Intrinsics.checkNotNullParameter(colorScheme, "colorScheme");
        this.f56964b = fanChartModel;
        setFanChartYAxisLegends(fanChartModel.c());
        boolean z = fanChartModel instanceof y3;
        y3 y3Var = z ? (y3) fanChartModel : null;
        setXAxisLegends(y3Var != null ? y3Var.f : null);
        y3 y3Var2 = z ? (y3) fanChartModel : null;
        if (y3Var2 == null || (list = y3Var2.e) == null) {
            list = f0.f322471a;
        }
        this.i = list;
        this.f = colorScheme;
        this.f56966g = fanChartModel.a();
        this.P.a(this.dataChangeAnimationRequest);
        this.f56971n = true;
        invalidate();
    }

    public final void setDataChangeAnimationRequest(i iVar) {
        if (Intrinsics.f(this.dataChangeAnimationRequest, iVar)) {
            return;
        }
        this.dataChangeAnimationRequest = iVar;
        if (this.f56964b != null) {
            this.P.a(iVar);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FanChartView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FanChartView(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f56963a = v0.a.d("create(...)");
        r3.Companion.getClass();
        this.f = r3.f;
        final int i2 = 1;
        this.f56966g = true;
        final int i3 = 0;
        this.smoother = yhm.j.b(new Function0(this) { // from class: lt0.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FanChartView f199740b;

            {
                this.f199740b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i5 = i3;
                FanChartView fanChartView = this.f199740b;
                switch (i5) {
                    case 0:
                        int i6 = FanChartView.Q;
                        return m1.a(new l1.c(0), fanChartView);
                    default:
                        fanChartView.f56971n = true;
                        fanChartView.invalidate();
                        return Unit.f186387a;
                }
            }
        });
        this.i = f0.f322471a;
        k kVar = new k(context);
        this.f56968j = kVar;
        this.k = a.f56980a;
        this.f56969l = new nr0.e(this, new Function0(this) { // from class: lt0.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FanChartView f199740b;

            {
                this.f199740b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i5 = i2;
                FanChartView fanChartView = this.f199740b;
                switch (i5) {
                    case 0:
                        int i6 = FanChartView.Q;
                        return m1.a(new l1.c(0), fanChartView);
                    default:
                        fanChartView.f56971n = true;
                        fanChartView.invalidate();
                        return Unit.f186387a;
                }
            }
        });
        this.f56970m = new SparseIntArray();
        this.f56971n = true;
        this.F = h.TOP;
        this.I = true;
        this.J = true;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, "circleAnimation", BitmapDescriptorFactory.HUE_RED, 1.0f);
        objectAnimatorOfFloat.setInterpolator(new AccelerateDecelerateInterpolator());
        objectAnimatorOfFloat.setDuration(kVar.f199744g);
        objectAnimatorOfFloat.addListener(new aq0.k(this, 7));
        Intrinsics.checkNotNullExpressionValue(objectAnimatorOfFloat, "apply(...)");
        this.M = objectAnimatorOfFloat;
        this.appearingAnimatedValue = 1.0f;
        g gVarA = ebm.a.a(this, new Paint(a.d));
        this.O = gVarA;
        this.P = new j(this, gVarA, new n(this, i3), new lm.d(13));
        setWillNotDraw(false);
        int i5 = R$attr.internal_textAppearanceBody3;
        l.d(a.f56983g, context, i5);
        TextPaint textPaint = a.f56984h;
        l.d(textPaint, context, i5);
        textPaint.setColor(e(R$attr.uikit_colorGreyTone50));
        Paint paint = a.i;
        paint.setStrokeWidth(kli.a.l(context, 2.0f));
        paint.setPathEffect(new CornerPathEffect(kli.a.l(context, 2.0f)));
        o oVar = new o(context, null, 6, i3);
        oVar.setBackground(j.a.f208294a);
        this.H = oVar;
        addView(oVar, new FrameLayout.LayoutParams(-2, -2));
    }

    public /* synthetic */ FanChartView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
