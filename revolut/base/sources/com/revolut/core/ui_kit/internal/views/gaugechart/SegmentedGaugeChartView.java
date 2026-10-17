package com.revolut.core.ui_kit.internal.views.gaugechart;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.DecelerateInterpolator;
import androidx.collection.MutableScatterMap;
import androidx.core.graphics.ColorUtils;
import androidx.core.view.GestureDetectorCompat;
import aw0.i4;
import aw0.j4;
import aw0.k4;
import aw0.l4;
import aw0.m4;
import aw0.n4;
import aw0.o4;
import aw0.p4;
import aw0.q4;
import aw0.r4;
import aw0.s4;
import aw0.t4;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.R$string;
import com.revolut.core.ui_kit.internal.views.gaugechart.SegmentedGaugeChartView;
import com.revolut.core.ui_kit.internal.views.gaugechart.a;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.h;
import com.revolut.core.ui_kit.models.j0;
import com.revolut.core.ui_kit_resources.R$attr;
import fd0.d;
import ihm.f;
import ir0.e;
import ir0.g;
import iv0.j;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import jq0.c;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pt0.k;
import pt0.l;
import pt0.m;
import pt0.o;
import pt0.p;
import pt0.q;
import pt0.r;
import pt0.s;
import uw0.i;
import z9h.n;
import zhm.d0;
import zhm.f0;
import zhm.w;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b \b\u0007\u0018\u0000 \\2\u00020\u00012\u00020\u0002:\u0004\u0015]\r\u0014B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR*\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R*\u0010\u001b\u001a\u00020\u00142\u0006\u0010\f\u001a\u00020\u00148\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\"\u0010#\u001a\u00020\u001c8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R$\u0010+\u001a\u0004\u0018\u00010$8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R \u00103\u001a\u00020,8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b-\u0010.\u0012\u0004\b1\u00102\u001a\u0004\b/\u00100R$\u00109\u001a\u0002042\u0006\u0010\f\u001a\u0002048\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b5\u00106\"\u0004\b7\u00108R \u0010=\u001a\u00020,8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b:\u0010.\u0012\u0004\b<\u00102\u001a\u0004\b;\u00100R.\u0010D\u001a\u0004\u0018\u00010>2\b\u0010\f\u001a\u0004\u0018\u00010>8\u0006@BX\u0087\u000e¢\u0006\u0012\n\u0004\b?\u0010@\u0012\u0004\bC\u00102\u001a\u0004\bA\u0010BR$\u0010G\u001a\u0002042\u0006\u0010\f\u001a\u0002048\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\bE\u00106\"\u0004\bF\u00108R$\u0010J\u001a\u0002042\u0006\u0010\f\u001a\u0002048\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\bH\u00106\"\u0004\bI\u00108R$\u0010M\u001a\u0002042\u0006\u0010\f\u001a\u0002048\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\bK\u00106\"\u0004\bL\u00108R$\u0010P\u001a\u0002042\u0006\u0010\f\u001a\u0002048\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\bN\u00106\"\u0004\bO\u00108R$\u0010S\u001a\u0002042\u0006\u0010\f\u001a\u0002048\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\bQ\u00106\"\u0004\bR\u00108R*\u0010W\u001a\u00020\u001c2\u0006\u0010\f\u001a\u00020\u001c8F@FX\u0087\u000e¢\u0006\u0012\u0012\u0004\bV\u00102\u001a\u0004\bT\u0010 \"\u0004\bU\u0010\"R\u0014\u0010Y\u001a\u00020\u001c8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bX\u0010 R\u0014\u0010[\u001a\u00020\u001c8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bZ\u0010 ¨\u0006^"}, d2 = {"Lcom/revolut/core/ui_kit/internal/views/gaugechart/SegmentedGaugeChartView;", "Landroid/view/View;", "", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lcom/revolut/core/ui_kit/models/h;", "value", "a", "Lcom/revolut/core/ui_kit/models/h;", "getData", "()Lcom/revolut/core/ui_kit/models/h;", "setData", "(Lcom/revolut/core/ui_kit/models/h;)V", "data", "Lpt0/o;", "b", "Lpt0/o;", "getChartSize", "()Lpt0/o;", "setChartSize", "(Lpt0/o;)V", "chartSize", "", "c", "Z", "getGesturesEnabled", "()Z", "setGesturesEnabled", "(Z)V", "gesturesEnabled", "Luw0/i;", "d", "Luw0/i;", "getDataChangeAnimationRequest", "()Luw0/i;", "setDataChangeAnimationRequest", "(Luw0/i;)V", "dataChangeAnimationRequest", "Landroid/animation/ValueAnimator;", "E", "Landroid/animation/ValueAnimator;", "getSelectionAnimator", "()Landroid/animation/ValueAnimator;", "getSelectionAnimator$annotations", "()V", "selectionAnimator", "", "P", "F", "setDataChangeProgress", "(F)V", "dataChangeProgress", "R", "getUnselectionAnimator", "getUnselectionAnimator$annotations", "unselectionAnimator", "", "S", "Ljava/lang/String;", "getUnselectingSegmentId", "()Ljava/lang/String;", "getUnselectingSegmentId$annotations", "unselectingSegmentId", "U", "setSelectionProgress", "selectionProgress", "V", "setSelectionColorFadeProgress", "selectionColorFadeProgress", "W", "setUnselectionProgress", "unselectionProgress", "a0", "setProgressGaugeStep", "progressGaugeStep", "j0", "setAppearingAnimatedValue", "appearingAnimatedValue", "getMiniStyle", "setMiniStyle", "getMiniStyle$annotations", "miniStyle", "getBackgroundGlowEnabled", "backgroundGlowEnabled", "getFadeEnabled", "fadeEnabled", "Companion", "pt0/p", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SegmentedGaugeChartView extends View {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();
    public static final n4 p0 = n4.DESCENDING;
    public static final int q0 = R$string.uikit_pie_chart_other;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static final int f57121r0 = R$attr.uikit_colorGreyTone50;
    public final int A;
    public final GestureDetectorCompat B;
    public final f C;
    public final ValueAnimator D;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public final ValueAnimator selectionAnimator;
    public final ValueAnimator F;
    public final ValueAnimator G;
    public List H;
    public List I;
    public final MutableScatterMap J;
    public final MutableScatterMap K;
    public boolean L;
    public Object M;
    public long[] N;
    public final ArrayList O;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    public float dataChangeProgress;
    public final ValueAnimator Q;

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    public final ValueAnimator unselectionAnimator;

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    public String unselectingSegmentId;
    public String T;

    /* JADX INFO: renamed from: U, reason: from kotlin metadata */
    public float selectionProgress;

    /* JADX INFO: renamed from: V, reason: from kotlin metadata */
    public float selectionColorFadeProgress;

    /* JADX INFO: renamed from: W, reason: from kotlin metadata */
    public float unselectionProgress;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public h data;

    /* JADX INFO: renamed from: a0, reason: collision with root package name and from kotlin metadata */
    public float progressGaugeStep;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public o chartSize;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public Path[] f57125b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public boolean gesturesEnabled;
    public a.b[] c0;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public i dataChangeAnimationRequest;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final Path f57127d0;
    public String e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final a.b f57128e0;
    public String f;
    public final RectF f0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public r f57129g;
    public Integer g0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f57130h;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public int f57131h0;
    public pt0.a i;
    public boolean i0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final b f57132j;

    /* JADX INFO: renamed from: j0, reason: from kotlin metadata */
    public float appearingAnimatedValue;
    public boolean k;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public final g f57133k0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f57134l;
    public final j l0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f57135m;
    public final e m0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Paint f57136n;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public final int f57137n0;
    public LinearGradient o;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public final int f57138o0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f57139p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public float f57140q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public float f57141r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final c f57142s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final RectF f57143t;
    public final RectF u;
    public final com.revolut.core.ui_kit.internal.views.gaugechart.b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final g f57144w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Paint f57145x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final d f57146y;
    public final int z;

    /* JADX INFO: renamed from: com.revolut.core.ui_kit.internal.views.gaugechart.SegmentedGaugeChartView$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public List f57147a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final HashMap f57148b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final HashMap f57149c;
        public List d;
        public final RectF e;
        public float f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public float f57150g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public float f57151h;
        public float i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public float f57152j;
        public float k;

        public b() {
            this(0);
        }

        public b(int i) {
            f0 segmentsToDraw = f0.f322471a;
            HashMap overrideSegmentValue = new HashMap();
            HashMap animationAmountOverrides = new HashMap();
            RectF drawRect = new RectF();
            Intrinsics.checkNotNullParameter(segmentsToDraw, "processedSegments");
            Intrinsics.checkNotNullParameter(overrideSegmentValue, "overrideSegmentValue");
            Intrinsics.checkNotNullParameter(animationAmountOverrides, "animationAmountOverrides");
            Intrinsics.checkNotNullParameter(segmentsToDraw, "segmentsToDraw");
            Intrinsics.checkNotNullParameter(drawRect, "drawRect");
            this.f57147a = segmentsToDraw;
            this.f57148b = overrideSegmentValue;
            this.f57149c = animationAmountOverrides;
            this.d = segmentsToDraw;
            this.e = drawRect;
            this.f = BitmapDescriptorFactory.HUE_RED;
            this.f57150g = BitmapDescriptorFactory.HUE_RED;
            this.f57151h = BitmapDescriptorFactory.HUE_RED;
            this.i = BitmapDescriptorFactory.HUE_RED;
            this.f57152j = BitmapDescriptorFactory.HUE_RED;
            this.k = BitmapDescriptorFactory.HUE_RED;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SegmentedGaugeChartView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static void a(SegmentedGaugeChartView segmentedGaugeChartView, ValueAnimator valueAnimator) {
        segmentedGaugeChartView.setUnselectionProgress(((Float) n.g(valueAnimator, "animation", "null cannot be cast to non-null type kotlin.Float")).floatValue());
    }

    public static void b(SegmentedGaugeChartView segmentedGaugeChartView, ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) n.g(valueAnimator, "animation", "null cannot be cast to non-null type kotlin.Float")).floatValue();
        if (fFloatValue < 0.5f) {
            segmentedGaugeChartView.setUnselectionProgress(1.0f - (fFloatValue * 2.0f));
            segmentedGaugeChartView.setSelectionProgress(BitmapDescriptorFactory.HUE_RED);
        } else {
            segmentedGaugeChartView.unselectingSegmentId = null;
            segmentedGaugeChartView.setUnselectionProgress(BitmapDescriptorFactory.HUE_RED);
            segmentedGaugeChartView.setSelectionProgress((fFloatValue - 0.5f) * 2.0f);
        }
    }

    public static void c(SegmentedGaugeChartView segmentedGaugeChartView, ValueAnimator valueAnimator) {
        segmentedGaugeChartView.setProgressGaugeStep(((Float) n.g(valueAnimator, "animation", "null cannot be cast to non-null type kotlin.Float")).floatValue());
    }

    public static void d(SegmentedGaugeChartView segmentedGaugeChartView, ValueAnimator valueAnimator) {
        segmentedGaugeChartView.setDataChangeProgress(((Float) n.g(valueAnimator, "animation", "null cannot be cast to non-null type kotlin.Float")).floatValue());
    }

    public static void e(SegmentedGaugeChartView segmentedGaugeChartView, ValueAnimator valueAnimator) {
        segmentedGaugeChartView.setSelectionColorFadeProgress(((Float) n.g(valueAnimator, "animation", "null cannot be cast to non-null type kotlin.Float")).floatValue());
    }

    public static Unit f(SegmentedGaugeChartView segmentedGaugeChartView, float f) {
        segmentedGaugeChartView.setAppearingAnimatedValue(f);
        return Unit.f186387a;
    }

    public static void g(SegmentedGaugeChartView segmentedGaugeChartView, ValueAnimator valueAnimator) {
        segmentedGaugeChartView.setSelectionProgress(((Float) n.g(valueAnimator, "animation", "null cannot be cast to non-null type kotlin.Float")).floatValue());
    }

    private final boolean getBackgroundGlowEnabled() {
        return this.f57130h && this.i.f239567a && this.f57144w.m();
    }

    private final boolean getFadeEnabled() {
        return this.i.f239568b && (this.chartSize instanceof pt0.n);
    }

    @yhm.d
    public static /* synthetic */ void getMiniStyle$annotations() {
    }

    public static /* synthetic */ void getSelectionAnimator$annotations() {
    }

    public static /* synthetic */ void getUnselectingSegmentId$annotations() {
    }

    public static /* synthetic */ void getUnselectionAnimator$annotations() {
    }

    public static float p(h hVar) {
        return a.c(hVar.b());
    }

    private final void setAppearingAnimatedValue(float f) {
        this.appearingAnimatedValue = f;
        int i = q.f239582a[this.data.c().ordinal()];
        if (i == 1) {
            this.k = true;
        } else if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        invalidate();
    }

    private final void setDataChangeProgress(float f) {
        this.dataChangeProgress = f;
        this.k = true;
        invalidate();
    }

    private final void setProgressGaugeStep(float f) {
        this.progressGaugeStep = f;
        invalidate();
    }

    private final void setSelectionColorFadeProgress(float f) {
        this.selectionColorFadeProgress = f;
        invalidate();
    }

    private final void setSelectionProgress(float f) {
        this.selectionProgress = f;
        this.k = true;
        invalidate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setUnselectionProgress(float f) {
        this.unselectionProgress = f;
        this.k = true;
        invalidate();
    }

    public static k4 v(j4 j4Var) {
        Clause clauseB = j4Var.b();
        return (!Intrinsics.f(j4Var.a(), "SMALL_SEGMENTS_GROUP_ID") || clauseB == null) ? new m4(j4Var) : new l4(j4Var.a(), clauseB, j4Var.d(), j4Var.c());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v13, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v6, types: [java.lang.Iterable, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v7 */
    public static List x(h hVar) {
        ?? E;
        if (hVar.e().isEmpty()) {
            return f0.f322471a;
        }
        float f = hVar.f();
        if (f == BitmapDescriptorFactory.HUE_RED) {
            return f0.f322471a;
        }
        s4 s4VarI = hVar.i();
        if (s4VarI instanceof p4) {
            List listE = hVar.e();
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : listE) {
                if (obj2 instanceof i4) {
                    arrayList.add(obj2);
                }
            }
            E = j0.b(arrayList, (p4) s4VarI, f);
        } else if (s4VarI instanceof q4) {
            List listE2 = hVar.e();
            List list = ((q4) s4VarI).f10486a;
            ArrayList<j4> arrayList2 = new ArrayList();
            for (Object obj3 : listE2) {
                j4 j4Var = (j4) obj3;
                if (list.contains(j4Var.a()) || Math.abs(j4Var.d()) > 0) {
                    arrayList2.add(obj3);
                }
            }
            E = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            for (j4 j4Var2 : arrayList2) {
                if (list.contains(j4Var2.a()) || Math.abs(j4Var2.d()) / f >= 0.05f) {
                    E.add(j4Var2);
                } else {
                    arrayList3.add(j4Var2);
                }
            }
            int size = E.size() - 2147483646;
            Integer numValueOf = Integer.valueOf(size);
            if (size <= 0) {
                numValueOf = null;
            }
            if (numValueOf != null) {
                for (j4 j4Var3 : d0.V0(d0.P0(E, new s()), numValueOf.intValue())) {
                    arrayList3.add(j4Var3);
                    E.remove(j4Var3);
                }
            }
        } else {
            if (!Intrinsics.f(s4VarI, r4.f10512a)) {
                throw new NoWhenBranchMatchedException();
            }
            E = hVar.e();
        }
        Iterable iterable = (Iterable) E;
        ArrayList arrayList4 = new ArrayList(w.t(iterable, 10));
        Iterator it8 = iterable.iterator();
        while (it8.hasNext()) {
            arrayList4.add(((j4) it8.next()).a());
        }
        return arrayList4;
    }

    @NotNull
    public final o getChartSize() {
        return this.chartSize;
    }

    @NotNull
    public final h getData() {
        return this.data;
    }

    public final i getDataChangeAnimationRequest() {
        return this.dataChangeAnimationRequest;
    }

    public final boolean getGesturesEnabled() {
        return this.gesturesEnabled;
    }

    public final boolean getMiniStyle() {
        return this.chartSize instanceof pt0.n;
    }

    @NotNull
    public final ValueAnimator getSelectionAnimator() {
        return this.selectionAnimator;
    }

    public final String getUnselectingSegmentId() {
        return this.unselectingSegmentId;
    }

    @NotNull
    public final ValueAnimator getUnselectionAnimator() {
        return this.unselectionAnimator;
    }

    public final void i() {
        this.i = tz4.d.A(this.data.b());
        int i = q.f239582a[this.data.c().ordinal()];
        g gVar = this.f57133k0;
        if (i == 1) {
            gVar.j(Paint.Style.FILL);
            gVar.f(Paint.Cap.BUTT);
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            if (q()) {
                gVar.j(Paint.Style.FILL);
                gVar.f(Paint.Cap.BUTT);
            } else {
                gVar.j(Paint.Style.STROKE);
                gVar.f(Paint.Cap.ROUND);
            }
        }
        float fT = t();
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        this.f57145x.setStrokeWidth(kli.a.l(context, fT));
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        gVar.r(kli.a.l(context2, fT));
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        gVar.q(kli.a.l(context3, this.chartSize instanceof pt0.n ? 10.0f : 12.0f));
        int iR = r();
        boolean z = (this.chartSize instanceof pt0.n) && this.i.d;
        if (this.f57134l == iR && this.f57135m == z) {
            return;
        }
        this.f57134l = iR;
        this.f57135m = z;
        requestLayout();
    }

    /* JADX WARN: Code restructure failed: missing block: B:323:0x0789, code lost:
    
        r5 = r34;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x032a  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x032e  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0592  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x05a6  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x05ce  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0630  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0633  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0638  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0644  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0660  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x0663  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x068a  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x069b  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x069e  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x06b0  */
    /* JADX WARN: Removed duplicated region for block: B:340:0x07de  */
    /* JADX WARN: Removed duplicated region for block: B:345:0x07e9  */
    /* JADX WARN: Removed duplicated region for block: B:348:0x07fb  */
    /* JADX WARN: Removed duplicated region for block: B:353:0x0807  */
    /* JADX WARN: Removed duplicated region for block: B:364:0x083f  */
    /* JADX WARN: Removed duplicated region for block: B:369:0x084b  */
    /* JADX WARN: Removed duplicated region for block: B:382:0x0881  */
    /* JADX WARN: Removed duplicated region for block: B:384:0x0889  */
    /* JADX WARN: Removed duplicated region for block: B:476:0x0b37  */
    /* JADX WARN: Removed duplicated region for block: B:480:0x0b43  */
    /* JADX WARN: Removed duplicated region for block: B:526:0x07d0 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0219  */
    /* JADX WARN: Type inference failed for: r10v54, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r10v58, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v40, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v44, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v51, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r8v61, types: [java.lang.Object, java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void j() {
        /*
            Method dump skipped, instruction units count: 3020
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.core.ui_kit.internal.views.gaugechart.SegmentedGaugeChartView.j():void");
    }

    public final Integer k(j4 j4Var) {
        Color color;
        int iIntValue;
        i4 i4Var = j4Var instanceof i4 ? (i4) j4Var : null;
        if (i4Var == null || (color = i4Var.d) == null) {
            return null;
        }
        d dVar = this.f57146y;
        Integer num = (Integer) dVar.c(color);
        if (num == null) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            iIntValue = io0.a.c(context, color);
            dVar.d(color, Integer.valueOf(iIntValue));
        } else {
            iIntValue = num.intValue();
        }
        return Integer.valueOf(iIntValue);
    }

    public final void l(Canvas canvas) {
        float fB;
        float fP;
        int iIntValue;
        g gVar;
        Canvas canvas2;
        b bVar = this.f57132j;
        if (bVar.f57147a.isEmpty()) {
            m(canvas);
            return;
        }
        t4 t4VarC = this.data.c();
        int[] iArr = q.f239582a;
        int i = iArr[t4VarC.ordinal()];
        if (i != 1) {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            m(canvas);
        }
        int i2 = iArr[this.data.c().ordinal()];
        if (i2 == 1) {
            fB = a.b(this.data.b());
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            fB = p(this.data) + ((bVar.f57152j - p(this.data)) * this.appearingAnimatedValue);
        }
        float f = fB;
        int i3 = iArr[this.data.c().ordinal()];
        if (i3 == 1) {
            fP = p(this.data);
        } else {
            if (i3 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            fP = p(this.data) + ((bVar.k - p(this.data)) * this.appearingAnimatedValue);
        }
        float f4 = fP;
        Integer numValueOf = null;
        Integer numValueOf2 = this.data.d() ? Integer.valueOf(this.z) : null;
        if (this.data.d()) {
            iIntValue = this.A;
        } else {
            int i5 = iArr[this.data.c().ordinal()];
            if (i5 == 1) {
                iIntValue = this.f57137n0;
            } else {
                if (i5 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                iIntValue = this.f57138o0;
            }
        }
        if (getBackgroundGlowEnabled()) {
            this.g0 = numValueOf2;
            this.f57131h0 = iIntValue;
            int i6 = q.f239583b[this.data.b().ordinal()];
            com.revolut.core.ui_kit.internal.views.gaugechart.b bVar2 = this.v;
            if (i6 == 1 || i6 == 2) {
                bVar2.b(canvas, bVar.d, f, this);
            } else {
                if (i6 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                int iSave = canvas.save();
                try {
                    canvas.clipRect(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, canvas.getWidth(), bVar.f57150g);
                    bVar2.b(canvas, bVar.d, f, this);
                } finally {
                    canvas.restoreToCount(iSave);
                }
            }
        }
        int size = bVar.d.size();
        int i21 = 0;
        while (true) {
            gVar = this.f57133k0;
            if (i21 >= size) {
                break;
            }
            p pVar = (p) bVar.d.get(i21);
            if (pVar.f239580b <= f) {
                gt0.a aVarU = u(pVar);
                gVar.d(s(pVar, aVarU, numValueOf2, iIntValue));
                if (aVarU == gt0.a.SELECTED) {
                    numValueOf = Integer.valueOf(i21);
                    canvas2 = canvas;
                } else {
                    canvas2 = canvas;
                    n(canvas2, pVar, f, f4, aVarU);
                }
            } else {
                canvas2 = canvas;
            }
            i21++;
            canvas = canvas2;
        }
        Canvas canvas3 = canvas;
        if (numValueOf != null) {
            p pVar2 = (p) bVar.d.get(numValueOf.intValue());
            if (numValueOf2 != null) {
                iIntValue = numValueOf2.intValue();
            } else {
                Integer numK = k(pVar2.f239579a);
                if (numK != null) {
                    iIntValue = numK.intValue();
                }
            }
            gVar.d(iIntValue);
            n(canvas3, pVar2, f, f4, gt0.a.SELECTED);
        }
    }

    public final void m(Canvas canvas) {
        int i;
        int i2 = q.f239582a[this.data.c().ordinal()];
        if (i2 == 1) {
            i = this.f57137n0;
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i = this.f57138o0;
        }
        Paint paint = this.f57145x;
        paint.setColor(i);
        canvas.drawArc(this.f57132j.e, p(this.data), a.d(this.data.b()), false, paint);
    }

    public final void n(Canvas canvas, p pVar, float f, float f4, gt0.a aVar) {
        int i = q.f239582a[this.data.c().ordinal()];
        g gVar = this.f57133k0;
        float f5 = BitmapDescriptorFactory.HUE_RED;
        if (i == 1) {
            Path path = pVar.e;
            if (path != null) {
                if (q()) {
                    gVar.e(canvas, path, (12 & 4) != 0, true);
                    return;
                }
                if (aVar != gt0.a.NO_SELECTION) {
                    e eVar = this.m0;
                    g gVar2 = eVar.f167935b;
                    if (gVar2.m()) {
                        float fA = gVar2.a();
                        if (aVar == gt0.a.SELECTED) {
                            f5 = eVar.f167936c * 1.0f;
                        }
                        gVar2.h(f5);
                        gVar.e(canvas, path, (12 & 4) != 0, true);
                        gVar2.h(fA);
                        return;
                    }
                }
                gVar.e(canvas, path, (12 & 4) != 0, true);
                return;
            }
            return;
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        float f6 = this.progressGaugeStep;
        float f32 = pVar.f239581c;
        float f35 = pVar.f239580b;
        float f36 = kotlin.ranges.f.f(((pVar.d * f6) + (f32 - f35)) + f35, f4, f) - f35;
        boolean zQ = q();
        b bVar = this.f57132j;
        if (!zQ) {
            RectF rectF = bVar.e;
            ir0.f fVar = g.Companion;
            gVar.b(canvas, rectF, f35, f36);
            return;
        }
        float fT = gVar.t();
        float fMin = Math.min(f36, BitmapDescriptorFactory.HUE_RED) + f35;
        float fAbs = Math.abs(f36);
        RectF rectF2 = bVar.e;
        RectF rectF3 = this.f0;
        rectF3.set(rectF2);
        float f37 = (-fT) / 2.0f;
        rectF3.inset(f37, f37);
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        float fL = kli.a.l(context, 2.0f);
        a.b bVar2 = this.f57128e0;
        Path path2 = this.f57127d0;
        a.a(path2, rectF3, fMin, fAbs, fT, fL, bVar2, true);
        gVar.e(canvas, path2, (12 & 4) != 0, true);
    }

    public final void o(int i) {
        if (i > this.f57125b0.length) {
            Path[] pathArr = new Path[i];
            for (int i2 = 0; i2 < i; i2++) {
                Path path = (Path) kotlin.collections.d.W(i2, this.f57125b0);
                if (path == null) {
                    path = new Path();
                }
                pathArr[i2] = path;
            }
            this.f57125b0 = pathArr;
        }
        if (i > this.c0.length) {
            a.b[] bVarArr = new a.b[i];
            for (int i3 = 0; i3 < i; i3++) {
                a.b bVar = (a.b) kotlin.collections.d.W(i3, this.c0);
                if (bVar == null) {
                    bVar = new a.b();
                }
                bVarArr[i3] = bVar;
            }
            this.c0 = bVarArr;
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        this.f57142s.i();
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        if (this.k) {
            j();
        }
        if (!getFadeEnabled()) {
            l(canvas);
            return;
        }
        canvas.saveLayer(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, getWidth(), getHeight(), null);
        l(canvas);
        float height = getHeight();
        LinearGradient linearGradient = this.o;
        if (linearGradient != null) {
            Paint paint = this.f57136n;
            paint.setShader(linearGradient);
            canvas.drawRect(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, getWidth(), height, paint);
            paint.setShader(null);
        }
        canvas.restore();
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int iIntValue;
        boolean z;
        int iIntValue2;
        Integer numValueOf;
        int mode = View.MeasureSpec.getMode(i);
        Integer numValueOf2 = (mode == Integer.MIN_VALUE || mode == 1073741824) ? Integer.valueOf(View.MeasureSpec.getSize(i)) : null;
        int mode2 = View.MeasureSpec.getMode(i2);
        Integer numValueOf3 = (mode2 == Integer.MIN_VALUE || mode2 == 1073741824) ? Integer.valueOf(View.MeasureSpec.getSize(i2)) : null;
        int iR = r();
        Integer numValueOf4 = Integer.valueOf(iR);
        if (iR == -1) {
            numValueOf4 = null;
        }
        if ((this.chartSize instanceof pt0.n) && this.i.d) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            float fL = kli.a.l(context, 12.0f);
            if (numValueOf3 != null) {
                float fIntValue = (numValueOf3.intValue() - fL) * 2.0f;
                if (fIntValue < BitmapDescriptorFactory.HUE_RED) {
                    fIntValue = 0.0f;
                }
                numValueOf = Integer.valueOf(rim.d.c(fIntValue));
            } else {
                numValueOf = null;
            }
            int iMin = Math.min(numValueOf2 != null ? numValueOf2.intValue() : Integer.MAX_VALUE, Math.min(numValueOf4 != null ? numValueOf4.intValue() : Integer.MAX_VALUE, numValueOf != null ? numValueOf.intValue() : Integer.MAX_VALUE));
            Integer numValueOf5 = iMin != Integer.MAX_VALUE ? Integer.valueOf(iMin) : null;
            iIntValue2 = numValueOf5 != null ? numValueOf5.intValue() : 0;
            setMeasuredDimension(iIntValue2, rim.d.c((iIntValue2 / 2.0f) + fL));
            return;
        }
        boolean z3 = true;
        if (numValueOf2 != null) {
            iIntValue = numValueOf2.intValue();
            z = true;
        } else {
            iIntValue = 0;
            z = false;
        }
        if (numValueOf3 != null && (!z || numValueOf3.intValue() < iIntValue)) {
            iIntValue = numValueOf3.intValue();
            z = true;
        }
        if (numValueOf4 == null || (z && numValueOf4.intValue() >= iIntValue)) {
            z3 = z;
        } else {
            iIntValue = numValueOf4.intValue();
        }
        iIntValue2 = z3 ? iIntValue : 0;
        setMeasuredDimension(iIntValue2, iIntValue2);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i5) {
        super.onSizeChanged(i, i2, i3, i5);
        j();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (this.gesturesEnabled) {
            int i = q.f239582a[this.data.c().ordinal()];
            if (i != 1) {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
            } else if (this.B.onTouchEvent(event)) {
                return true;
            }
        }
        return super.onTouchEvent(event);
    }

    public final boolean q() {
        return this.f57130h && this.i.f239569c && !(this.chartSize instanceof pt0.n);
    }

    public final int r() {
        o oVar = this.chartSize;
        if (Intrinsics.f(oVar, k.f239576a)) {
            if (q()) {
                return -1;
            }
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            return kli.a.k(context, 320.0f);
        }
        if (Intrinsics.f(oVar, l.f239577a)) {
            Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            return kli.a.k(context2, 214.0f);
        }
        if (Intrinsics.f(oVar, m.f239578a)) {
            return -1;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final int s(p pVar, gt0.a aVar, Integer num, int i) {
        j4 j4Var = pVar.f239579a;
        Integer numK = k(j4Var);
        if (q() && Intrinsics.f(this.T, j4Var.a())) {
            return ColorUtils.blendARGB(num != null ? num.intValue() : numK != null ? numK.intValue() : i, i, this.selectionColorFadeProgress);
        }
        if (aVar != gt0.a.OTHER_SELECTED && !this.data.d()) {
            if (num != null) {
                return num.intValue();
            }
            if (numK != null) {
                return numK.intValue();
            }
        }
        return i;
    }

    public final void setChartSize(@NotNull o value) {
        Intrinsics.checkNotNullParameter(value, "value");
        if (Intrinsics.f(this.chartSize, value)) {
            return;
        }
        this.chartSize = value;
        i();
        boolean backgroundGlowEnabled = getBackgroundGlowEnabled();
        if (getLayerType() != backgroundGlowEnabled) {
            setLayerType(backgroundGlowEnabled ? 1 : 0, null);
        }
        if (!getBackgroundGlowEnabled()) {
            this.f57142s.i();
        }
        this.k = true;
        invalidate();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:145:0x032a A[EDGE_INSN: B:262:0x032a->B:145:0x032a BREAK  A[LOOP:9: B:136:0x02f7->B:263:?]] */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0340 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0401  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0415  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0422  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0450  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x049e  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x04aa  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x04ad  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x04b7  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x04ca  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x04d3  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x04d9  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x04dd  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01e4 A[PHI: r13
      0x01e4: PHI (r13v17 aw0.j4) = (r13v16 aw0.j4), (r13v19 aw0.j4) binds: [B:70:0x01c1, B:78:0x01e1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r2v16, types: [java.lang.Object, java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void setData(@org.jetbrains.annotations.NotNull com.revolut.core.ui_kit.models.h r19) {
        /*
            Method dump skipped, instruction units count: 1280
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.core.ui_kit.internal.views.gaugechart.SegmentedGaugeChartView.setData(com.revolut.core.ui_kit.models.h):void");
    }

    public final void setDataChangeAnimationRequest(i iVar) {
        this.dataChangeAnimationRequest = iVar;
    }

    public final void setGesturesEnabled(boolean z) {
        this.gesturesEnabled = z;
    }

    public final void setMiniStyle(boolean z) {
        setChartSize(z ? l.f239577a : k.f239576a);
    }

    public final float t() {
        if (q()) {
            return 10.0f;
        }
        o oVar = this.chartSize;
        if (Intrinsics.f(oVar, k.f239576a)) {
            return 12.0f;
        }
        if (Intrinsics.f(oVar, l.f239577a)) {
            return 8.0f;
        }
        if (Intrinsics.f(oVar, m.f239578a)) {
            return 6.0f;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final gt0.a u(p pVar) {
        String strA = pVar.f239579a.a();
        if (this.data.g() == null) {
            return gt0.a.NO_SELECTION;
        }
        if (Intrinsics.f(this.data.g(), strA)) {
            return gt0.a.SELECTED;
        }
        if ((!q() || !Intrinsics.f(this.T, strA)) && Intrinsics.f(this.unselectingSegmentId, strA)) {
            return gt0.a.NO_SELECTION;
        }
        return gt0.a.OTHER_SELECTED;
    }

    public final void w() {
        boolean backgroundGlowEnabled = getBackgroundGlowEnabled();
        c cVar = this.f57142s;
        if (backgroundGlowEnabled) {
            com.revolut.core.ui_kit.internal.views.gaugechart.b bVar = this.v;
            RectF rectF = bVar.f57168g;
            RectF out = this.u;
            Intrinsics.checkNotNullParameter(out, "out");
            if (bVar.f57181y && !rectF.isEmpty()) {
                out.set(rectF);
                RectF rectF2 = cVar.k;
                View view = cVar.f177340a;
                RectF rectF3 = cVar.f177345j;
                if (view.getWidth() == 0 || view.getHeight() == 0) {
                    cVar.i();
                    return;
                }
                ViewParent parent = view.getParent();
                ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                if (viewGroup == null) {
                    cVar.i();
                    return;
                }
                rectF3.set(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, view.getWidth(), view.getHeight());
                cVar.u = !((view instanceof ViewGroup ? (ViewGroup) view : null) == null ? false : cVar.a(r7, r7, rectF3));
                c.f(cVar, rectF3, view, viewGroup);
                rectF2.set(out);
                c.f(cVar, rectF2, view, viewGroup);
                cVar.h(rectF3, rectF2, null, null, null);
                return;
            }
        }
        cVar.i();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SegmentedGaugeChartView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    public SegmentedGaugeChartView(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        f0 f0Var = f0.f322471a;
        this.data = new com.revolut.core.ui_kit.models.f(f0Var);
        this.chartSize = k.f239576a;
        this.gesturesEnabled = true;
        this.f57130h = ((Boolean) jo0.g.E.getValue()).booleanValue();
        this.i = tz4.d.A(o4.FULL_CIRCLE);
        this.f57132j = new b(0);
        this.f57134l = -2;
        Paint paintC = com.google.android.gms.internal.mlkit_vision_face.a.c(true);
        Paint paint = new Paint(1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        this.f57136n = paint;
        this.f57142s = new c(this);
        this.f57143t = new RectF();
        this.u = new RectF();
        this.v = new com.revolut.core.ui_kit.internal.views.gaugechart.b();
        this.f57144w = ebm.a.a(this, new Paint());
        Paint paintC2 = com.google.android.gms.internal.mlkit_vision_face.a.c(true);
        paintC2.setStyle(Paint.Style.STROKE);
        paintC2.setStrokeCap(Paint.Cap.ROUND);
        this.f57145x = paintC2;
        this.f57146y = new d(50);
        this.z = io0.a.c(context, new Color.Solid(R$attr.uikit_colorForeground));
        this.A = io0.a.c(context, new Color.Solid(R$attr.uikit_colorGreyTone10));
        this.C = v0.a.d("create(...)");
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setDuration(1000L);
        valueAnimator.setInterpolator(new DecelerateInterpolator());
        final int i2 = 0;
        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: pt0.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SegmentedGaugeChartView f239575b;

            {
                this.f239575b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                switch (i2) {
                    case 0:
                        SegmentedGaugeChartView.c(this.f239575b, valueAnimator2);
                        break;
                    case 1:
                        SegmentedGaugeChartView.g(this.f239575b, valueAnimator2);
                        break;
                    case 2:
                        SegmentedGaugeChartView.b(this.f239575b, valueAnimator2);
                        break;
                    case 3:
                        SegmentedGaugeChartView.e(this.f239575b, valueAnimator2);
                        break;
                    case 4:
                        SegmentedGaugeChartView.d(this.f239575b, valueAnimator2);
                        break;
                    default:
                        SegmentedGaugeChartView.a(this.f239575b, valueAnimator2);
                        break;
                }
            }
        });
        valueAnimator.addListener(new r(this, 1));
        this.D = valueAnimator;
        ValueAnimator valueAnimator2 = new ValueAnimator();
        valueAnimator2.setDuration(300L);
        valueAnimator2.setInterpolator(new DecelerateInterpolator());
        final int i3 = 1;
        valueAnimator2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: pt0.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SegmentedGaugeChartView f239575b;

            {
                this.f239575b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator22) {
                switch (i3) {
                    case 0:
                        SegmentedGaugeChartView.c(this.f239575b, valueAnimator22);
                        break;
                    case 1:
                        SegmentedGaugeChartView.g(this.f239575b, valueAnimator22);
                        break;
                    case 2:
                        SegmentedGaugeChartView.b(this.f239575b, valueAnimator22);
                        break;
                    case 3:
                        SegmentedGaugeChartView.e(this.f239575b, valueAnimator22);
                        break;
                    case 4:
                        SegmentedGaugeChartView.d(this.f239575b, valueAnimator22);
                        break;
                    default:
                        SegmentedGaugeChartView.a(this.f239575b, valueAnimator22);
                        break;
                }
            }
        });
        valueAnimator2.addListener(new r(this, 4));
        this.selectionAnimator = valueAnimator2;
        ValueAnimator valueAnimator3 = new ValueAnimator();
        valueAnimator3.setDuration(300L);
        valueAnimator3.setInterpolator(new DecelerateInterpolator());
        final int i5 = 2;
        valueAnimator3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: pt0.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SegmentedGaugeChartView f239575b;

            {
                this.f239575b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator22) {
                switch (i5) {
                    case 0:
                        SegmentedGaugeChartView.c(this.f239575b, valueAnimator22);
                        break;
                    case 1:
                        SegmentedGaugeChartView.g(this.f239575b, valueAnimator22);
                        break;
                    case 2:
                        SegmentedGaugeChartView.b(this.f239575b, valueAnimator22);
                        break;
                    case 3:
                        SegmentedGaugeChartView.e(this.f239575b, valueAnimator22);
                        break;
                    case 4:
                        SegmentedGaugeChartView.d(this.f239575b, valueAnimator22);
                        break;
                    default:
                        SegmentedGaugeChartView.a(this.f239575b, valueAnimator22);
                        break;
                }
            }
        });
        valueAnimator3.addListener(new r(this, 3));
        this.F = valueAnimator3;
        ValueAnimator valueAnimator4 = new ValueAnimator();
        valueAnimator4.setDuration(100L);
        valueAnimator4.setInterpolator(new DecelerateInterpolator());
        final int i6 = 3;
        valueAnimator4.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: pt0.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SegmentedGaugeChartView f239575b;

            {
                this.f239575b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator22) {
                switch (i6) {
                    case 0:
                        SegmentedGaugeChartView.c(this.f239575b, valueAnimator22);
                        break;
                    case 1:
                        SegmentedGaugeChartView.g(this.f239575b, valueAnimator22);
                        break;
                    case 2:
                        SegmentedGaugeChartView.b(this.f239575b, valueAnimator22);
                        break;
                    case 3:
                        SegmentedGaugeChartView.e(this.f239575b, valueAnimator22);
                        break;
                    case 4:
                        SegmentedGaugeChartView.d(this.f239575b, valueAnimator22);
                        break;
                    default:
                        SegmentedGaugeChartView.a(this.f239575b, valueAnimator22);
                        break;
                }
            }
        });
        this.G = valueAnimator4;
        this.H = f0Var;
        this.I = f0Var;
        this.J = new MutableScatterMap(0, 1, null);
        this.K = new MutableScatterMap(0, 1, null);
        this.M = f0Var;
        this.N = new long[0];
        this.O = new ArrayList();
        this.dataChangeProgress = 1.0f;
        ValueAnimator valueAnimator5 = new ValueAnimator();
        valueAnimator5.setDuration(500L);
        valueAnimator5.setInterpolator(new DecelerateInterpolator());
        final int i21 = 4;
        valueAnimator5.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: pt0.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SegmentedGaugeChartView f239575b;

            {
                this.f239575b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator22) {
                switch (i21) {
                    case 0:
                        SegmentedGaugeChartView.c(this.f239575b, valueAnimator22);
                        break;
                    case 1:
                        SegmentedGaugeChartView.g(this.f239575b, valueAnimator22);
                        break;
                    case 2:
                        SegmentedGaugeChartView.b(this.f239575b, valueAnimator22);
                        break;
                    case 3:
                        SegmentedGaugeChartView.e(this.f239575b, valueAnimator22);
                        break;
                    case 4:
                        SegmentedGaugeChartView.d(this.f239575b, valueAnimator22);
                        break;
                    default:
                        SegmentedGaugeChartView.a(this.f239575b, valueAnimator22);
                        break;
                }
            }
        });
        valueAnimator5.addListener(new r(this, 0));
        this.Q = valueAnimator5;
        ValueAnimator valueAnimator6 = new ValueAnimator();
        valueAnimator6.setDuration(300L);
        valueAnimator6.setInterpolator(new DecelerateInterpolator());
        final int i22 = 5;
        valueAnimator6.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: pt0.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SegmentedGaugeChartView f239575b;

            {
                this.f239575b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator22) {
                switch (i22) {
                    case 0:
                        SegmentedGaugeChartView.c(this.f239575b, valueAnimator22);
                        break;
                    case 1:
                        SegmentedGaugeChartView.g(this.f239575b, valueAnimator22);
                        break;
                    case 2:
                        SegmentedGaugeChartView.b(this.f239575b, valueAnimator22);
                        break;
                    case 3:
                        SegmentedGaugeChartView.e(this.f239575b, valueAnimator22);
                        break;
                    case 4:
                        SegmentedGaugeChartView.d(this.f239575b, valueAnimator22);
                        break;
                    default:
                        SegmentedGaugeChartView.a(this.f239575b, valueAnimator22);
                        break;
                }
            }
        });
        valueAnimator6.addListener(new r(this, i22));
        this.unselectionAnimator = valueAnimator6;
        this.selectionColorFadeProgress = 1.0f;
        this.unselectionProgress = 1.0f;
        this.f57125b0 = new Path[0];
        this.c0 = new a.b[0];
        this.f57127d0 = new Path();
        this.f57128e0 = new a.b();
        this.f0 = new RectF();
        this.appearingAnimatedValue = 1.0f;
        g gVarA = ebm.a.a(this, paintC);
        this.f57133k0 = gVarA;
        this.l0 = new j(this, gVarA, hx7.q.b(new pp5.d(this, 25)), new pgk.f(this, 20));
        this.m0 = new e(this, gVarA);
        i();
        this.B = new GestureDetectorCompat(context, new bx0.q(this, 10), new Handler(Looper.getMainLooper()));
        this.f57137n0 = io0.a.c(context, new Color.Solid(R$attr.uikit_colorGreyTone8));
        this.f57138o0 = io0.a.c(context, new Color.Solid(R$attr.uikit_colorGreyTone10));
    }

    public /* synthetic */ SegmentedGaugeChartView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
