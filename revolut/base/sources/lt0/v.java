package lt0;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.RectF;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.widget.AppCompatTextView;
import aw0.l7;
import aw0.m7;
import aw0.p7;
import aw0.q7;
import aw0.s7;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_resources.R$attr;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import lkf.f0;
import lt0.q;
import org.jetbrains.annotations.NotNull;
import te0.w;

/* JADX INFO: loaded from: classes19.dex */
public final class v implements s {

    @NotNull
    public static final u Companion = new u();
    public float A;
    public float B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ty0.c f199762a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f199763b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public s7 f199764c;
    public p d;
    public final Object e;
    public final Object f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f199765g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Object f199766h;
    public k0.b i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f199767j;
    public boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f199768l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f199769m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f199770n;
    public q7 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f199771p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Object f199772q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public View f199773r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public AppCompatTextView f199774s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public AppCompatTextView f199775t;
    public AppCompatTextView u;
    public AppCompatTextView v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public AppCompatTextView f199776w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public AppCompatTextView f199777x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final Object f199778y;
    public ihm.f z;

    public v(Context context, ty0.c clauseDisplayer) {
        Intrinsics.checkNotNullParameter(clauseDisplayer, "clauseDisplayer");
        Intrinsics.checkNotNullParameter(context, "context");
        this.f199762a = clauseDisplayer;
        this.f199763b = context;
        final int i = 0;
        this.e = w.y0(new Function0(this) { // from class: lt0.t

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ v f199761b;

            {
                this.f199761b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        return Integer.valueOf(ViewConfiguration.get(this.f199761b.f199763b).getScaledTouchSlop());
                    case 1:
                        Paint paintC = com.google.android.gms.internal.mlkit_vision_face.a.c(true);
                        paintC.setColor(kli.a.s(R$attr.uikit_colorForeground, this.f199761b.f199763b));
                        paintC.setStrokeWidth(kli.a.k(r1.f199763b, 1.0f));
                        paintC.setStyle(Paint.Style.STROKE);
                        return paintC;
                    default:
                        return Float.valueOf(kli.a.k(this.f199761b.f199763b, 8.0f));
                }
            }
        });
        this.f = w.y0(new f0(16));
        this.f199765g = w.y0(new f0(17));
        this.f199766h = w.y0(new f0(18));
        this.f199768l = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.f199771p = Float.MAX_VALUE;
        final int i2 = 1;
        this.f199772q = w.y0(new Function0(this) { // from class: lt0.t

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ v f199761b;

            {
                this.f199761b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        return Integer.valueOf(ViewConfiguration.get(this.f199761b.f199763b).getScaledTouchSlop());
                    case 1:
                        Paint paintC = com.google.android.gms.internal.mlkit_vision_face.a.c(true);
                        paintC.setColor(kli.a.s(R$attr.uikit_colorForeground, this.f199761b.f199763b));
                        paintC.setStrokeWidth(kli.a.k(r1.f199763b, 1.0f));
                        paintC.setStyle(Paint.Style.STROKE);
                        return paintC;
                    default:
                        return Float.valueOf(kli.a.k(this.f199761b.f199763b, 8.0f));
                }
            }
        });
        final int i3 = 2;
        this.f199778y = w.y0(new Function0(this) { // from class: lt0.t

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ v f199761b;

            {
                this.f199761b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        return Integer.valueOf(ViewConfiguration.get(this.f199761b.f199763b).getScaledTouchSlop());
                    case 1:
                        Paint paintC = com.google.android.gms.internal.mlkit_vision_face.a.c(true);
                        paintC.setColor(kli.a.s(R$attr.uikit_colorForeground, this.f199761b.f199763b));
                        paintC.setStrokeWidth(kli.a.k(r1.f199763b, 1.0f));
                        paintC.setStyle(Paint.Style.STROKE);
                        return paintC;
                    default:
                        return Float.valueOf(kli.a.k(this.f199761b.f199763b, 8.0f));
                }
            }
        });
        this.A = Float.MIN_VALUE;
        this.B = Float.MIN_VALUE;
    }

    public final q7 a(float f) {
        p7 p7Var;
        List<q7> list;
        if (f == Float.MIN_VALUE) {
            return null;
        }
        float f4 = this.f199771p / 2;
        s7 s7Var = this.f199764c;
        if (s7Var != null && (p7Var = s7Var.f10531c) != null && (list = p7Var.d) != null) {
            Pair pair = null;
            for (q7 q7Var : list) {
                float fAbs = Math.abs(q7Var.d - f);
                if (fAbs <= f4) {
                    if (fAbs < (pair != null ? ((Number) pair.f186385a).floatValue() : Float.MAX_VALUE)) {
                        pair = new Pair(Float.valueOf(fAbs), q7Var);
                    }
                }
            }
            if (pair != null) {
                return (q7) pair.f186386b;
            }
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final PointF b() {
        return (PointF) this.f199766h.getValue();
    }

    public final void c() {
        if (this.f199773r != null) {
            return;
        }
        View viewInflate = LayoutInflater.from(this.f199763b).inflate(R$layout.internal_multitarget_fan_chart_tooltip, (ViewGroup) null);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        this.f199773r = viewInflate;
        if (viewInflate == null) {
            Intrinsics.r("tooltipView");
            throw null;
        }
        View viewFindViewById = viewInflate.findViewById(R$id.multiTargetFanChartTooltip_high);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f199774s = (AppCompatTextView) viewFindViewById;
        View view = this.f199773r;
        if (view == null) {
            Intrinsics.r("tooltipView");
            throw null;
        }
        View viewFindViewById2 = view.findViewById(R$id.multiTargetFanChartTooltip_average);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f199775t = (AppCompatTextView) viewFindViewById2;
        View view2 = this.f199773r;
        if (view2 == null) {
            Intrinsics.r("tooltipView");
            throw null;
        }
        View viewFindViewById3 = view2.findViewById(R$id.multiTargetFanChartTooltip_low);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.u = (AppCompatTextView) viewFindViewById3;
        View view3 = this.f199773r;
        if (view3 == null) {
            Intrinsics.r("tooltipView");
            throw null;
        }
        View viewFindViewById4 = view3.findViewById(R$id.multiTargetFanChartTooltip_highValue);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        this.v = (AppCompatTextView) viewFindViewById4;
        View view4 = this.f199773r;
        if (view4 == null) {
            Intrinsics.r("tooltipView");
            throw null;
        }
        View viewFindViewById5 = view4.findViewById(R$id.multiTargetFanChartTooltip_averageValue);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
        this.f199776w = (AppCompatTextView) viewFindViewById5;
        View view5 = this.f199773r;
        if (view5 == null) {
            Intrinsics.r("tooltipView");
            throw null;
        }
        View viewFindViewById6 = view5.findViewById(R$id.multiTargetFanChartTooltip_lowValue);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "findViewById(...)");
        this.f199777x = (AppCompatTextView) viewFindViewById6;
    }

    public final void d(float f, float f4) {
        ihm.f fVar = this.z;
        if (fVar != null) {
            fVar.onNext((f == Float.MIN_VALUE || f4 == Float.MIN_VALUE) ? q.a.f199757a : new r(f, f4));
        }
    }

    public final void e(AppCompatTextView appCompatTextView, Clause clause) {
        ty0.c.b(this.f199762a, clause, appCompatTextView, null, null, 12);
    }

    public final void f(q7 q7Var) {
        this.k = (q7Var == null || q7Var.equals(this.o)) ? false : true;
        this.o = q7Var;
    }

    public final void g(float f, ViewParent viewParent) {
        RectF rectF;
        this.f199767j = true;
        viewParent.requestDisallowInterceptTouchEvent(true);
        float fH = h(f);
        this.A = fH;
        p pVar = this.d;
        if (pVar == null || (rectF = pVar.f199754a) == null) {
            f = Float.MIN_VALUE;
        } else {
            float f4 = rectF.left;
            if (f < f4) {
                f = f4;
            } else {
                float f5 = rectF.right;
                if (f > f5) {
                    f = f5;
                }
            }
        }
        this.B = f;
        f(a(fH));
        d(this.A, this.B);
    }

    public final float h(float f) {
        s7 s7Var;
        p pVar = this.d;
        if (pVar == null || (s7Var = this.f199764c) == null) {
            return Float.MIN_VALUE;
        }
        m7 m7Var = s7Var.d;
        RectF rectF = pVar.f199754a;
        float f4 = rectF.left;
        if (f < f4) {
            m7Var.getClass();
            return BitmapDescriptorFactory.HUE_RED;
        }
        if (f <= rectF.right) {
            float f5 = (f - f4) / pVar.f199755b;
            m7Var.getClass();
            return f5 + BitmapDescriptorFactory.HUE_RED;
        }
        Iterator it8 = s7Var.f10530b.iterator();
        if (!it8.hasNext()) {
            throw new NoSuchElementException();
        }
        float fMax = ((l7) it8.next()).f10407a;
        while (it8.hasNext()) {
            fMax = Math.max(fMax, ((l7) it8.next()).f10407a);
        }
        return fMax;
    }
}
