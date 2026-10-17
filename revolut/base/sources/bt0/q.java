package bt0;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.OvershootInterpolator;
import au0.p3;
import aw0.y6;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.internal.views.chart.LineChartView;
import com.revolut.core.ui_kit_core.displayers.haptic.Haptic;
import com.revolut.core.ui_kit_resources.R$attr;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import or0.u;
import org.jetbrains.annotations.NotNull;
import yhm.r;
import zhm.v;

/* JADX INFO: loaded from: classes19.dex */
public final class q extends LineChartView.c {

    @NotNull
    public static final k Companion = new k();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LineChartView f18244c;
    public final wy0.a d;
    public final Context e;
    public final HashMap f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f18245g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f18246h;
    public final HashMap i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final HashMap f18247j;
    public int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ht0.k f18248l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final j f18249m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final bc1.b f18250n;
    public final j o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Paint f18251p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ObjectAnimator f18252q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final m f18253r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final GestureDetector f18254s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final View f18255t;

    public q(LineChartView lineChartView) {
        int iValueAt;
        Intrinsics.checkNotNullParameter(lineChartView, "lineChartView");
        this.f18244c = lineChartView;
        this.d = u.k(lineChartView);
        Context context = lineChartView.getContext();
        this.e = context;
        this.f = new HashMap();
        Intrinsics.checkNotNullExpressionValue(context, "context");
        this.f18245g = kli.a.k(context, 16.0f);
        Intrinsics.checkNotNullExpressionValue(context, "context");
        kli.a.k(context, 20.0f);
        Intrinsics.checkNotNullExpressionValue(context, "context");
        kli.a.k(context, 18.0f);
        Intrinsics.checkNotNullExpressionValue(context, "context");
        kli.a.k(context, 2.0f);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        paint.setColor(-1);
        Paint paint2 = new Paint();
        paint2.setAntiAlias(true);
        paint2.setStyle(Paint.Style.STROKE);
        Unit unit = Unit.f186387a;
        Paint paint3 = new Paint();
        paint3.setAntiAlias(true);
        paint3.setStyle(style);
        new r(paint, paint2, paint3);
        Intrinsics.checkNotNullExpressionValue(context, "context");
        kli.a.k(context, 4.0f);
        Intrinsics.checkNotNullExpressionValue(context, "context");
        kli.a.k(context, 16.5f);
        Intrinsics.checkNotNullExpressionValue(context, "context");
        kli.a.k(context, 3.0f);
        this.f18246h = -1;
        this.i = new HashMap();
        this.f18247j = new HashMap();
        this.k = -1;
        this.f18249m = new j(this, 0);
        this.f18250n = new bc1.b(this, 27);
        this.o = new j(this, 1);
        Paint paint4 = new Paint();
        paint4.setStyle(style);
        Intrinsics.checkNotNullExpressionValue(context, "context");
        paint4.setStrokeWidth(kli.a.k(context, 1.0f));
        paint4.setAntiAlias(true);
        Intrinsics.checkNotNullExpressionValue(context, "context");
        float fK = kli.a.k(context, 2.0f);
        Intrinsics.checkNotNullExpressionValue(context, "context");
        new DashPathEffect(new float[]{fK, kli.a.k(context, 4.0f)}, BitmapDescriptorFactory.HUE_RED);
        int i = R$attr.uikit_colorForeground;
        LineChartView lineChartView2 = this.f18244c;
        int iIndexOfKey = lineChartView2.getColorCache().indexOfKey(i);
        if (iIndexOfKey < 0) {
            Context context2 = this.e;
            Intrinsics.checkNotNullExpressionValue(context2, "context");
            iValueAt = kli.a.s(i, context2);
            lineChartView2.getColorCache().put(i, iValueAt);
        } else {
            iValueAt = lineChartView2.getColorCache().valueAt(iIndexOfKey);
        }
        this.f18251p = i(iValueAt);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, "circleAnimation", BitmapDescriptorFactory.HUE_RED, 1.0f);
        objectAnimatorOfFloat.setInterpolator(new AccelerateDecelerateInterpolator());
        objectAnimatorOfFloat.setDuration(1000L);
        objectAnimatorOfFloat.addListener(new p());
        Intrinsics.checkNotNullExpressionValue(objectAnimatorOfFloat, "apply(...)");
        this.f18252q = objectAnimatorOfFloat;
        m mVar = new m(this);
        this.f18253r = mVar;
        GestureDetector gestureDetector = new GestureDetector(context, mVar);
        gestureDetector.setIsLongpressEnabled(false);
        this.f18254s = gestureDetector;
        View viewInflate = LayoutInflater.from(context).inflate(R$layout.internal_simple_line_chart_view_wtihdrawal_popup, (ViewGroup) null);
        this.f18255t = viewInflate;
    }

    @Override // com.revolut.core.ui_kit.internal.views.chart.LineChartView.c
    public final void a() {
        this.f18252q.start();
    }

    @Override // com.revolut.core.ui_kit.internal.views.chart.LineChartView.c
    public final void b(List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f.clear();
        int i = 0;
        for (Object obj2 : items) {
            int i2 = i + 1;
            if (i < 0) {
                v.s();
                throw null;
            }
            ((y6) obj2).getClass();
            i = i2;
        }
    }

    @Override // com.revolut.core.ui_kit.internal.views.chart.LineChartView.c
    public final boolean c(LineChartView view, MotionEvent event) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(event, "event");
        boolean zOnTouchEvent = this.f18254s.onTouchEvent(event);
        if (!zOnTouchEvent && (event.getAction() == 3 || event.getAction() == 1)) {
            m mVar = this.f18253r;
            mVar.f18240b = false;
            q qVar = mVar.f18241c;
            qVar.f18250n.invoke();
            LineChartView lineChartView = qVar.f18244c;
            lineChartView.invalidate();
            lineChartView.removeCallbacks(mVar.f18239a);
        }
        return zOnTouchEvent;
    }

    @Override // com.revolut.core.ui_kit.internal.views.chart.LineChartView.c
    public final void d() {
        this.f18252q.cancel();
        Iterator it8 = this.f18247j.entrySet().iterator();
        while (it8.hasNext()) {
            ((Animator) ((Map.Entry) it8.next()).getValue()).cancel();
        }
    }

    @Override // com.revolut.core.ui_kit.internal.views.chart.LineChartView.c
    public final void e(Canvas canvas, com.revolut.core.ui_kit.internal.views.chart.h model) {
        int i;
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(model, "model");
        ((n) model).getClass();
        LineChartView lineChartView = this.f18244c;
        Iterator<T> it8 = lineChartView.getChartItems().iterator();
        while (it8.hasNext()) {
            ((y6) it8.next()).getClass();
        }
        if (!this.f18253r.f18240b || (i = this.f18246h) < 0 || i > v.j(lineChartView.getChartItems())) {
            return;
        }
        float fK = k(lineChartView.getChartItems().get(i).f10630a);
        float paddingTop = lineChartView.getF56704g().f56719b.top - lineChartView.getF56704g().f56720c;
        float paddingBottom = lineChartView.getF56704g().f56719b.bottom + lineChartView.getF56704g().f56720c;
        if (lineChartView.getHoverLineIgnoresVerticalChartPadding()) {
            paddingTop -= lineChartView.getPaddingTop();
            paddingBottom += lineChartView.getXAxis() == null ? lineChartView.getPaddingBottom() : 0;
        }
        canvas.drawLine(fK, paddingTop, fK, paddingBottom, this.f18251p);
        int i2 = o.f18243a[lineChartView.getFeatureConfig().f273872c.ordinal()];
        if (i2 == 1) {
            if (this.f18248l == null) {
                Context context = this.e;
                Intrinsics.checkNotNullExpressionValue(context, "context");
                this.f18248l = new ht0.k(context);
            }
            ht0.k kVar = this.f18248l;
            if (kVar != null) {
                kVar.b(canvas, fK, lineChartView.getF56704g().f56719b.bottom - ((lineChartView.getChartItems().get(i).f10631b - lineChartView.getF56704g().f56721g) * lineChartView.getF56704g().d), this.f18251p.getColor());
            }
        } else if (i2 != 2) {
            throw new NoWhenBranchMatchedException();
        }
        h(i, this.f18245g / 2);
    }

    @Override // com.revolut.core.ui_kit.internal.views.chart.LineChartView.c
    public final boolean f(com.revolut.core.ui_kit.internal.views.chart.h hVar) {
        return hVar instanceof n;
    }

    public final void g(int i) {
        int i2 = this.f18245g;
        h(i, i2 / 2);
        j(this.k, i2);
        this.k = -1;
        ((com.revolut.core.ui_kit_core.displayers.haptic.b) this.d.Y()).a(new Haptic.Effect(com.revolut.core.ui_kit_core.displayers.haptic.c.SHORT, true));
    }

    public final void h(int i, int i2) {
        LineChartView lineChartView = this.f18244c;
        float fK = k(lineChartView.getChartItems().get(i).f10630a);
        int i3 = 0;
        while (true) {
            int i5 = i - i3;
            if (i5 < 0 && i + i3 >= lineChartView.getChartItems().size()) {
                return;
            }
            int i6 = i + i3;
            float fK2 = i5 >= 0 ? fK - k(lineChartView.getChartItems().get(i5).f10630a) : Float.MAX_VALUE;
            float fK3 = i6 < lineChartView.getChartItems().size() ? k(lineChartView.getChartItems().get(i6).f10630a) - fK : Float.MAX_VALUE;
            float f = i2;
            if (fK2 > f && fK3 > f) {
                return;
            }
            i3++;
        }
    }

    public final Paint i(int i) {
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.FILL);
        Context context = this.e;
        Intrinsics.checkNotNullExpressionValue(context, "context");
        paint.setStrokeWidth(kli.a.k(context, 1.0f));
        paint.setAntiAlias(true);
        paint.setColor(i);
        return paint;
    }

    public final void j(int i, int i2) {
        Integer numValueOf = Integer.valueOf(i);
        HashMap map = this.f18247j;
        Animator animator = (Animator) map.get(numValueOf);
        if (animator != null) {
            animator.cancel();
        }
        Integer num = (Integer) this.i.get(Integer.valueOf(i));
        if (num != null) {
            int iIntValue = num.intValue();
            Integer numValueOf2 = Integer.valueOf(i);
            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(iIntValue, i2);
            valueAnimatorOfInt.addUpdateListener(new p3(this, i, 1));
            valueAnimatorOfInt.setDuration(250L);
            valueAnimatorOfInt.setInterpolator(new OvershootInterpolator());
            valueAnimatorOfInt.start();
            map.put(numValueOf2, valueAnimatorOfInt);
        }
    }

    public final float k(float f) {
        LineChartView lineChartView = this.f18244c;
        return ((f - lineChartView.getF56704g().f) * lineChartView.getF56704g().e) + lineChartView.getF56704g().f56719b.left;
    }
}
