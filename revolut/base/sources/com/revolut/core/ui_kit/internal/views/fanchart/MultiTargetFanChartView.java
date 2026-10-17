package com.revolut.core.ui_kit.internal.views.fanchart;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.text.Layout;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import androidx.appcompat.widget.AppCompatTextView;
import aw0.l7;
import aw0.o7;
import aw0.p7;
import aw0.q7;
import aw0.r7;
import aw0.s7;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit_resources.R$attr;
import ir0.g;
import iv0.j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jb3.l;
import jo0.m;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import lt0.o;
import lt0.q;
import lt0.s;
import org.jetbrains.annotations.NotNull;
import uw0.i;
import zhm.d0;
import zhm.u;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 b2\u00020\u0001:\u0004c\u000f\u0016]B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\f\u001a\u00020\u000b*\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rR*\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00068\u0006@FX\u0087\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R*\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00068\u0006@FX\u0087\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0010\u001a\u0004\b\u0017\u0010\u0012\"\u0004\b\u0018\u0010\u0014R*\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00068\u0006@FX\u0087\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u0010\u001a\u0004\b\u001b\u0010\u0012\"\u0004\b\u001c\u0010\u0014R*\u0010!\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00068\u0006@FX\u0087\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u0010\u001a\u0004\b\u001f\u0010\u0012\"\u0004\b \u0010\u0014R*\u0010%\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00068\u0006@FX\u0087\u000e¢\u0006\u0012\n\u0004\b\"\u0010\u0010\u001a\u0004\b#\u0010\u0012\"\u0004\b$\u0010\u0014R.\u0010+\u001a\u0004\u0018\u00010\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\n8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010\rR.\u00103\u001a\u0004\u0018\u00010,2\b\u0010\u000e\u001a\u0004\u0018\u00010,8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\u001d\u0010:\u001a\b\u0012\u0004\u0012\u000205048\u0006¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R$\u0010@\u001a\u00020;2\u0006\u0010\u000e\u001a\u00020;8\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b<\u0010=\"\u0004\b>\u0010?R$\u0010C\u001a\u00020;2\u0006\u0010\u000e\u001a\u00020;8\u0002@BX\u0083\u000e¢\u0006\f\n\u0004\bA\u0010=\"\u0004\bB\u0010?R\u001b\u0010H\u001a\u00020;8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bD\u0010E\u001a\u0004\bF\u0010GR\u001b\u0010K\u001a\u00020;8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bI\u0010E\u001a\u0004\bJ\u0010GR\u001b\u0010N\u001a\u00020;8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bL\u0010E\u001a\u0004\bM\u0010GR\u001b\u0010Q\u001a\u00020;8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bO\u0010E\u001a\u0004\bP\u0010GR\u001b\u0010T\u001a\u00020;8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bR\u0010E\u001a\u0004\bS\u0010GR\u001b\u0010Y\u001a\u00020U8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bV\u0010E\u001a\u0004\bW\u0010XR\u001b\u0010[\u001a\u00020;8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b=\u0010E\u001a\u0004\bZ\u0010GR!\u0010a\u001a\b\u0012\u0004\u0012\u00020]0\\8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b^\u0010E\u001a\u0004\b_\u0010`¨\u0006d"}, d2 = {"Lcom/revolut/core/ui_kit/internal/views/fanchart/MultiTargetFanChartView;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Law0/s7;", "", "setBounds", "(Law0/s7;)V", "value", "a", "I", "getColorValueIncrease", "()I", "setColorValueIncrease", "(I)V", "colorValueIncrease", "b", "getColorValueReduction", "setColorValueReduction", "colorValueReduction", "c", "getColorValueRangeNeutral", "setColorValueRangeNeutral", "colorValueRangeNeutral", "d", "getColorValuePointNeutral", "setColorValuePointNeutral", "colorValuePointNeutral", "e", "getColorBaseline", "setColorBaseline", "colorBaseline", "f", "Law0/s7;", "getDataset", "()Law0/s7;", "setDataset", "dataset", "Luw0/i;", "g", "Luw0/i;", "getDataChangeAnimationRequest", "()Luw0/i;", "setDataChangeAnimationRequest", "(Luw0/i;)V", "dataChangeAnimationRequest", "Lihm/f;", "Llt0/q;", "h", "Lihm/f;", "getPointSelectionPublishSubject", "()Lihm/f;", "pointSelectionPublishSubject", "", "i", "F", "setAppearingAnimatedValue", "(F)V", "appearingAnimatedValue", "x", "setStartPointFlashingMultiplayer", "startPointFlashingMultiplayer", "z", "Lkotlin/Lazy;", "getForecastLabelLeftMargin", "()F", "forecastLabelLeftMargin", "A", "getForecastLabelToChartMargin", "forecastLabelToChartMargin", "B", "getForecastLabelToBoundMargin", "forecastLabelToBoundMargin", "C", "getForecastPointRadiusPx", "forecastPointRadiusPx", "D", "getForecastLineThicknessPx", "forecastLineThicknessPx", "Landroid/graphics/DashPathEffect;", "E", "getDashEffect", "()Landroid/graphics/DashPathEffect;", "dashEffect", "getChartBottomMarginPx", "chartBottomMarginPx", "", "Llt0/s;", "G", "getDrawingDelegates", "()Ljava/util/List;", "drawingDelegates", "Companion", "com/revolut/core/ui_kit/internal/views/fanchart/a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class MultiTargetFanChartView extends View {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();
    public final Object A;
    public final Object B;
    public final Object C;
    public final Object D;
    public final Object E;
    public final Object F;
    public final Object G;
    public boolean H;
    public q I;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public int colorValueIncrease;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public int colorValueReduction;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public int colorValueRangeNeutral;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public int colorValuePointNeutral;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public int colorBaseline;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public s7 dataset;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public i dataChangeAnimationRequest;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    public final ihm.f pointSelectionPublishSubject;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public float appearingAnimatedValue;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final g f56990j;
    public final j k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ir0.e f56991l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public a f56992m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public nr0.e f56993n;
    public final SparseIntArray o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f56994p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public float f56995q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public float f56996r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final float f56997s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final float f56998t;
    public final float u;
    public final float v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final float f56999w;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    public float startPointFlashingMultiplayer;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final ObjectAnimator f57001y;
    public final Object z;

    /* JADX INFO: renamed from: com.revolut.core.ui_kit.internal.views.fanchart.MultiTargetFanChartView$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    public static abstract class b {
        private b() {
        }

        public abstract Clause a();

        public abstract com.revolut.core.ui_kit.internal.views.fanchart.c b();

        public abstract float c();

        public abstract float d();
    }

    public static final class c extends AnimatorListenerAdapter {
        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animation) {
            Intrinsics.checkNotNullParameter(animation, "animation");
            animation.setStartDelay(1000L);
            animation.start();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MultiTargetFanChartView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static Unit a(MultiTargetFanChartView multiTargetFanChartView, float f) {
        multiTargetFanChartView.setAppearingAnimatedValue(f);
        return Unit.f186387a;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final float getChartBottomMarginPx() {
        return ((Number) this.F.getValue()).floatValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final DashPathEffect getDashEffect() {
        return (DashPathEffect) this.E.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final List<s> getDrawingDelegates() {
        return (List) this.G.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final float getForecastLabelLeftMargin() {
        return ((Number) this.z.getValue()).floatValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final float getForecastLabelToBoundMargin() {
        return ((Number) this.B.getValue()).floatValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final float getForecastLabelToChartMargin() {
        return ((Number) this.A.getValue()).floatValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final float getForecastLineThicknessPx() {
        return ((Number) this.D.getValue()).floatValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final float getForecastPointRadiusPx() {
        return ((Number) this.C.getValue()).floatValue();
    }

    private final void setAppearingAnimatedValue(float f) {
        this.appearingAnimatedValue = f;
        invalidate();
    }

    private final void setBounds(s7 s7Var) {
        Float fValueOf;
        List list = s7Var.f10530b;
        float fFloatValue = s7Var.d.f10424a;
        List list2 = list;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        Iterator it8 = list2.iterator();
        while (it8.hasNext()) {
            arrayList.add(Float.valueOf(((l7) it8.next()).f10408b));
        }
        List list3 = list;
        ArrayList arrayList2 = new ArrayList(w.t(list3, 10));
        Iterator it9 = list3.iterator();
        while (it9.hasNext()) {
            arrayList2.add(Float.valueOf(((l7) it9.next()).d));
        }
        ArrayList arrayList3 = new ArrayList(w.t(list3, 10));
        Iterator it10 = list3.iterator();
        while (it10.hasNext()) {
            arrayList3.add(Float.valueOf(((l7) it10.next()).e));
        }
        ArrayList arrayListU = w.u(v.k(arrayList, arrayList2, arrayList3, u.c(Float.valueOf(fFloatValue))));
        Float fQ0 = d0.q0(arrayListU);
        this.f56994p = fQ0 != null ? fQ0.floatValue() : fFloatValue;
        Float fW0 = d0.w0(arrayListU);
        if (fW0 != null) {
            fFloatValue = fW0.floatValue();
        }
        this.f56995q = fFloatValue;
        Iterator it11 = list3.iterator();
        if (it11.hasNext()) {
            float fMax = ((l7) it11.next()).f10407a;
            while (it11.hasNext()) {
                fMax = Math.max(fMax, ((l7) it11.next()).f10407a);
            }
            fValueOf = Float.valueOf(fMax);
        } else {
            fValueOf = null;
        }
        this.f56996r = fValueOf != null ? fValueOf.floatValue() : BitmapDescriptorFactory.HUE_RED;
    }

    private final void setStartPointFlashingMultiplayer(float f) {
        this.startPointFlashingMultiplayer = f;
        invalidate();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x05bc  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00af  */
    /*  JADX ERROR: NullPointerException in pass: LoopRegionVisitor
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.use(jadx.core.dex.instructions.args.RegisterArg)" because "ssaVar" is null
        	at jadx.core.dex.nodes.InsnNode.rebindArgs(InsnNode.java:506)
        	at jadx.core.dex.nodes.InsnNode.rebindArgs(InsnNode.java:509)
        */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1692
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.core.ui_kit.internal.views.fanchart.MultiTargetFanChartView.b():void");
    }

    public final Pair c(RectF rectF) {
        float f = this.f56994p;
        float f4 = this.f56995q;
        float fWidth = BitmapDescriptorFactory.HUE_RED;
        float fHeight = f == f4 ? 0.0f : rectF.height() / (this.f56994p - this.f56995q);
        if (BitmapDescriptorFactory.HUE_RED != this.f56996r) {
            fWidth = rectF.width() / (this.f56996r - BitmapDescriptorFactory.HUE_RED);
        }
        return new Pair(Float.valueOf(fHeight), Float.valueOf(fWidth));
    }

    public final void d(Canvas canvas) {
        a aVar = this.f56992m;
        if (aVar == null) {
            Intrinsics.r("drawHolder");
            throw null;
        }
        Paint paint = aVar.f57010n;
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(getForecastLineThicknessPx());
        paint.setColor(m(this.colorBaseline));
        paint.setPathEffect(getDashEffect());
        a aVar2 = this.f56992m;
        if (aVar2 != null) {
            canvas.drawPath(aVar2.e, paint);
        } else {
            Intrinsics.r("drawHolder");
            throw null;
        }
    }

    public final void e(Canvas canvas, b bVar, Float f) {
        int iN = n(bVar, false);
        a aVar = this.f56992m;
        if (aVar == null) {
            Intrinsics.r("drawHolder");
            throw null;
        }
        Paint paint = aVar.f57010n;
        paint.setPathEffect(null);
        paint.setColor(iN);
        if (bVar instanceof e) {
            paint.setStyle(Paint.Style.FILL);
            paint.setAlpha((int) ((1 - this.startPointFlashingMultiplayer) * 0.6f * 255));
            e eVar = (e) bVar;
            float f4 = eVar.f57020b;
            float f5 = eVar.f57019a;
            float f6 = this.v;
            float f32 = this.f56998t;
            canvas.drawCircle(f5, f4, ((f6 - f32) * this.startPointFlashingMultiplayer) + f32, paint);
            paint.setColor(m(R$attr.uikit_colorWhite));
            canvas.drawCircle(f5, f4, f32, paint);
            paint.setColor(iN);
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(this.u);
            canvas.drawCircle(f5, f4, f32, paint);
            return;
        }
        if (!(bVar instanceof com.revolut.core.ui_kit.internal.views.fanchart.b)) {
            if (!(bVar instanceof d)) {
                throw new NoWhenBranchMatchedException();
            }
            paint.setStyle(Paint.Style.FILL);
            d dVar = (d) bVar;
            canvas.drawCircle(dVar.f57016a, dVar.f57017b, getForecastPointRadiusPx(), paint);
            return;
        }
        com.revolut.core.ui_kit.internal.views.fanchart.b bVar2 = (com.revolut.core.ui_kit.internal.views.fanchart.b) bVar;
        float f35 = bVar2.f57014b;
        float f36 = bVar2.f57013a;
        gt0.a aVar2 = f == null ? gt0.a.NO_SELECTION : (f36 - getForecastPointRadiusPx() > f.floatValue() || f.floatValue() > getForecastPointRadiusPx() + f36) ? gt0.a.OTHER_SELECTED : gt0.a.SELECTED;
        a aVar3 = this.f56992m;
        if (aVar3 == null) {
            Intrinsics.r("drawHolder");
            throw null;
        }
        g gVar = aVar3.f57009m;
        gVar.j(Paint.Style.FILL);
        gVar.s(null);
        gVar.d(iN);
        gt0.a aVar4 = gt0.a.NO_SELECTION;
        g gVar2 = this.f56990j;
        if (aVar2 != aVar4) {
            ir0.e eVar2 = this.f56991l;
            g gVar3 = eVar2.f167935b;
            if (gVar3.m()) {
                float fA = gVar3.a();
                gVar3.h(aVar2 == gt0.a.SELECTED ? eVar2.f167936c * 1.0f : BitmapDescriptorFactory.HUE_RED);
                gVar2.c(f36, f35, canvas, getForecastPointRadiusPx());
                gVar3.h(fA);
                return;
            }
        }
        gVar2.c(f36, f35, canvas, getForecastPointRadiusPx());
    }

    public final void f(Canvas canvas, Float f) {
        a aVar = this.f56992m;
        if (aVar == null) {
            Intrinsics.r("drawHolder");
            throw null;
        }
        g gVar = aVar.f57009m;
        gVar.s(getDashEffect());
        gVar.j(Paint.Style.STROKE);
        gVar.r(getForecastLineThicknessPx());
        gVar.d(m(this.colorValueIncrease));
        a aVar2 = this.f56992m;
        if (aVar2 == null) {
            Intrinsics.r("drawHolder");
            throw null;
        }
        Path path = aVar2.f57006h;
        ir0.e eVar = this.f56991l;
        eVar.b(canvas, path, f);
        gVar.d(m(this.colorValueReduction));
        a aVar3 = this.f56992m;
        if (aVar3 != null) {
            eVar.b(canvas, aVar3.i, f);
        } else {
            Intrinsics.r("drawHolder");
            throw null;
        }
    }

    public final void g(Canvas canvas, b bVar, boolean z) {
        float height;
        if (!(bVar instanceof e)) {
            if (!(bVar instanceof com.revolut.core.ui_kit.internal.views.fanchart.b) && !(bVar instanceof d)) {
                throw new NoWhenBranchMatchedException();
            }
            h(canvas, bVar, z);
            return;
        }
        nr0.e eVar = this.f56993n;
        if (eVar == null) {
            Intrinsics.r("textCache");
            throw null;
        }
        e eVar2 = (e) bVar;
        float f = eVar2.f57020b;
        MoneyClause moneyClause = eVar2.d;
        a aVar = this.f56992m;
        if (aVar == null) {
            Intrinsics.r("drawHolder");
            throw null;
        }
        Layout layoutB = eVar.b(moneyClause, aVar.f57011p);
        float f4 = eVar2.f57019a - this.f56998t;
        int i = f.f57023b[eVar2.f57021c.ordinal()];
        float f5 = this.f56997s;
        float f6 = this.v;
        if (i == 1 || i == 2) {
            height = f + f6 + f5;
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            height = ((f - f6) - f5) - layoutB.getHeight();
        }
        a.a.h(layoutB, canvas, f4, height);
    }

    public final int getColorBaseline() {
        return this.colorBaseline;
    }

    public final int getColorValueIncrease() {
        return this.colorValueIncrease;
    }

    public final int getColorValuePointNeutral() {
        return this.colorValuePointNeutral;
    }

    public final int getColorValueRangeNeutral() {
        return this.colorValueRangeNeutral;
    }

    public final int getColorValueReduction() {
        return this.colorValueReduction;
    }

    public final i getDataChangeAnimationRequest() {
        return this.dataChangeAnimationRequest;
    }

    public final s7 getDataset() {
        return this.dataset;
    }

    @NotNull
    public final ihm.f getPointSelectionPublishSubject() {
        return this.pointSelectionPublishSubject;
    }

    public final void h(Canvas canvas, b bVar, boolean z) {
        float fD;
        a aVar = this.f56992m;
        if (aVar == null) {
            Intrinsics.r("drawHolder");
            throw null;
        }
        TextPaint textPaint = aVar.f57012q;
        textPaint.setColor(n(bVar, true));
        nr0.e eVar = this.f56993n;
        if (eVar == null) {
            Intrinsics.r("textCache");
            throw null;
        }
        Layout layoutB = eVar.b(bVar.a(), textPaint);
        if (z) {
            s7 s7Var = this.dataset;
            if ((s7Var != null ? s7Var.e : null) == o7.DEFAULT) {
                a.a.h(layoutB, canvas, bVar.c() + getForecastPointRadiusPx() + getForecastLabelLeftMargin(), bVar.d() - (layoutB.getHeight() / 2));
                return;
            }
        }
        float fC = bVar.c();
        int i = f.f57023b[bVar.b().ordinal()];
        if (i == 1 || i == 2) {
            fD = ((bVar.d() - getForecastPointRadiusPx()) - getForecastLabelToChartMargin()) - layoutB.getHeight();
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            fD = bVar.d() + getForecastPointRadiusPx() + getForecastLabelToChartMargin();
        }
        a.a.g(layoutB, canvas, fC, fD);
    }

    public final void i(Canvas canvas) {
        a aVar = this.f56992m;
        if (aVar == null) {
            Intrinsics.r("drawHolder");
            throw null;
        }
        Paint paint = aVar.f57010n;
        paint.setAntiAlias(true);
        paint.setPathEffect(null);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(m(this.colorValueRangeNeutral));
        paint.setAlpha(13);
        a aVar2 = this.f56992m;
        if (aVar2 == null) {
            Intrinsics.r("drawHolder");
            throw null;
        }
        canvas.drawPath(aVar2.f, paint);
        paint.setColor(m(this.colorValueRangeNeutral));
        paint.setAlpha(13);
        a aVar3 = this.f56992m;
        if (aVar3 != null) {
            canvas.drawPath(aVar3.f57005g, paint);
        } else {
            Intrinsics.r("drawHolder");
            throw null;
        }
    }

    public final void j(Canvas canvas) {
        a aVar = this.f56992m;
        if (aVar == null) {
            Intrinsics.r("drawHolder");
            throw null;
        }
        for (Pair pair : aVar.f57008l) {
            float fFloatValue = ((Number) pair.f186385a).floatValue();
            Clause clause = (Clause) pair.f186386b;
            nr0.e eVar = this.f56993n;
            if (eVar == null) {
                Intrinsics.r("textCache");
                throw null;
            }
            a aVar2 = this.f56992m;
            if (aVar2 == null) {
                Intrinsics.r("drawHolder");
                throw null;
            }
            a.a.g(eVar.b(clause, aVar2.o), canvas, fFloatValue, BitmapDescriptorFactory.HUE_RED);
        }
    }

    public final void k() {
        if (this.f56992m == null) {
            a aVar = new a(this.f56990j);
            this.f56992m = aVar;
            TextPaint textPaint = aVar.f57011p;
            textPaint.setAntiAlias(true);
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            l.d(textPaint, context, R$attr.internal_textAppearanceEmphasis4);
            textPaint.setColor(m(R$attr.uikit_colorGrey50));
            a aVar2 = this.f56992m;
            if (aVar2 == null) {
                Intrinsics.r("drawHolder");
                throw null;
            }
            TextPaint textPaint2 = aVar2.f57012q;
            textPaint2.setAntiAlias(true);
            Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            l.d(textPaint2, context2, R$attr.internal_textAppearanceBody3);
            a aVar3 = this.f56992m;
            if (aVar3 == null) {
                Intrinsics.r("drawHolder");
                throw null;
            }
            TextPaint textPaint3 = aVar3.o;
            textPaint3.setAntiAlias(true);
            Context context3 = getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
            l.d(textPaint3, context3, R$attr.internal_textAppearanceBody3);
            textPaint3.setColor(m(R$attr.uikit_colorGrey50));
        }
        if (this.f56993n == null) {
            this.f56993n = new nr0.e(this, new ljd.e(this, 15));
        }
    }

    public final boolean l(float f, com.revolut.core.ui_kit.internal.views.fanchart.b bVar) {
        a aVar = this.f56992m;
        if (aVar == null) {
            Intrinsics.r("drawHolder");
            throw null;
        }
        TextPaint textPaint = aVar.f57012q;
        textPaint.setColor(n(bVar, true));
        nr0.e eVar = this.f56993n;
        if (eVar != null) {
            return Math.abs(f - bVar.f57014b) <= ((float) eVar.b(bVar.d, textPaint).getHeight());
        }
        Intrinsics.r("textCache");
        throw null;
    }

    public final int m(int i) {
        SparseIntArray sparseIntArray = this.o;
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

    public final int n(b bVar, boolean z) {
        int i = f.f57023b[bVar.b().ordinal()];
        if (i == 1) {
            return m(this.colorValueIncrease);
        }
        if (i != 2) {
            if (i == 3) {
                return m(this.colorValueReduction);
            }
            throw new NoWhenBranchMatchedException();
        }
        if (bVar instanceof d) {
            return m(z ? this.colorValueRangeNeutral : this.colorValuePointNeutral);
        }
        return m(this.colorValueIncrease);
    }

    public final float o(float f, float f4) {
        return (f - BitmapDescriptorFactory.HUE_RED) * f4;
    }

    @Override // android.view.View
    public final void onAttachedToWindow() throws Throwable {
        super.onAttachedToWindow();
        k();
        if (m.f176851h) {
            this.f57001y.start();
        }
        if (this.H) {
            b();
        }
        Iterator<T> it8 = getDrawingDelegates().iterator();
        while (it8.hasNext()) {
            lt0.v vVar = (lt0.v) ((s) it8.next());
            vVar.getClass();
            Intrinsics.checkNotNullParameter(this, "view");
            vVar.c();
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f57001y.cancel();
        Iterator<T> it8 = getDrawingDelegates().iterator();
        while (it8.hasNext()) {
            lt0.v vVar = (lt0.v) ((s) it8.next());
            vVar.getClass();
            Intrinsics.checkNotNullParameter(this, "view");
            vVar.f199767j = false;
            k0.b bVar = vVar.i;
            if (bVar != null) {
                getHandler().removeCallbacks(bVar);
            }
            getParent().requestDisallowInterceptTouchEvent(false);
            vVar.A = Float.MIN_VALUE;
            vVar.B = Float.MIN_VALUE;
            vVar.f(null);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:170:0x02af, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x02bd, code lost:
    
        throw r0;
     */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01d7  */
    /* JADX WARN: Type inference failed for: r13v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v13, types: [java.lang.Object, kotlin.Lazy] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onDraw(android.graphics.Canvas r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 739
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.core.ui_kit.internal.views.fanchart.MultiTargetFanChartView.onDraw(android.graphics.Canvas):void");
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
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

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i5) throws Throwable {
        super.onSizeChanged(i, i2, i3, i5);
        b();
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00e8  */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v12, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r10) {
        /*
            Method dump skipped, instruction units count: 324
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.core.ui_kit.internal.views.fanchart.MultiTargetFanChartView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final float p(float f, float f4, float f5) {
        return f5 - ((f - this.f56995q) * f4);
    }

    public final void setColorBaseline(int i) {
        this.colorBaseline = i;
        this.H = true;
        invalidate();
    }

    public final void setColorValueIncrease(int i) {
        this.colorValueIncrease = i;
        this.H = true;
        invalidate();
    }

    public final void setColorValuePointNeutral(int i) {
        this.colorValuePointNeutral = i;
        this.H = true;
        invalidate();
    }

    public final void setColorValueRangeNeutral(int i) {
        this.colorValueRangeNeutral = i;
        this.H = true;
        invalidate();
    }

    public final void setColorValueReduction(int i) {
        this.colorValueReduction = i;
        this.H = true;
        invalidate();
    }

    public final void setDataChangeAnimationRequest(i iVar) {
        if (Intrinsics.f(this.dataChangeAnimationRequest, iVar)) {
            return;
        }
        this.dataChangeAnimationRequest = iVar;
        if (this.dataset != null) {
            this.k.a(iVar);
        }
    }

    public final void setDataset(s7 s7Var) {
        k();
        if (s7Var != null) {
            nr0.e eVar = this.f56993n;
            if (eVar == null) {
                Intrinsics.r("textCache");
                throw null;
            }
            eVar.a();
            nr0.e eVar2 = this.f56993n;
            if (eVar2 == null) {
                Intrinsics.r("textCache");
                throw null;
            }
            MoneyClause moneyClause = s7Var.d.f10425b;
            a aVar = this.f56992m;
            if (aVar == null) {
                Intrinsics.r("drawHolder");
                throw null;
            }
            eVar2.f(moneyClause, aVar.f57011p);
            for (l7 l7Var : s7Var.f10530b) {
                nr0.e eVar3 = this.f56993n;
                if (eVar3 == null) {
                    Intrinsics.r("textCache");
                    throw null;
                }
                Clause clause = l7Var.f10409c;
                a aVar2 = this.f56992m;
                if (aVar2 == null) {
                    Intrinsics.r("drawHolder");
                    throw null;
                }
                eVar3.f(clause, aVar2.f57012q);
                Clause clause2 = l7Var.f;
                if (clause2 != null) {
                    nr0.e eVar4 = this.f56993n;
                    if (eVar4 == null) {
                        Intrinsics.r("textCache");
                        throw null;
                    }
                    a aVar3 = this.f56992m;
                    if (aVar3 == null) {
                        Intrinsics.r("drawHolder");
                        throw null;
                    }
                    eVar4.f(clause2, aVar3.f57012q);
                }
                Clause clause3 = l7Var.f10410g;
                if (clause3 != null) {
                    nr0.e eVar5 = this.f56993n;
                    if (eVar5 == null) {
                        Intrinsics.r("textCache");
                        throw null;
                    }
                    a aVar4 = this.f56992m;
                    if (aVar4 == null) {
                        Intrinsics.r("drawHolder");
                        throw null;
                    }
                    eVar5.f(clause3, aVar4.f57012q);
                }
            }
            for (r7 r7Var : s7Var.f10529a) {
                nr0.e eVar6 = this.f56993n;
                if (eVar6 == null) {
                    Intrinsics.r("textCache");
                    throw null;
                }
                TimeClause timeClause = r7Var.f10515b;
                a aVar5 = this.f56992m;
                if (aVar5 == null) {
                    Intrinsics.r("drawHolder");
                    throw null;
                }
                eVar6.f(timeClause, aVar5.o);
            }
            setBounds(s7Var);
            Iterator<T> it8 = getDrawingDelegates().iterator();
            while (it8.hasNext()) {
                lt0.v vVar = (lt0.v) ((s) it8.next());
                vVar.getClass();
                p7 p7Var = s7Var.f10531c;
                vVar.c();
                AppCompatTextView appCompatTextView = vVar.f199774s;
                if (appCompatTextView == null) {
                    Intrinsics.r("tooltipHighLabel");
                    throw null;
                }
                vVar.e(appCompatTextView, p7Var.f10468a);
                AppCompatTextView appCompatTextView2 = vVar.f199775t;
                if (appCompatTextView2 == null) {
                    Intrinsics.r("tooltipAverageLabel");
                    throw null;
                }
                vVar.e(appCompatTextView2, p7Var.f10469b);
                AppCompatTextView appCompatTextView3 = vVar.u;
                if (appCompatTextView3 == null) {
                    Intrinsics.r("tooltipLowLabel");
                    throw null;
                }
                vVar.e(appCompatTextView3, p7Var.f10470c);
                List list = p7Var.d;
                int size = list.size() - 1;
                int i = 0;
                while (i < size) {
                    int i2 = i + 1;
                    vVar.f199771p = Math.min(vVar.f199771p, Math.abs(((q7) list.get(i2)).d - ((q7) list.get(i)).d));
                    i = i2;
                }
                vVar.f199764c = s7Var;
            }
        }
        this.dataset = s7Var;
        this.H = true;
        this.k.a(this.dataChangeAnimationRequest);
        invalidate();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MultiTargetFanChartView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultiTargetFanChartView(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.colorValueIncrease = R$attr.uikit_colorPerformancePositive;
        this.colorValueReduction = R$attr.uikit_colorPerformanceNegative;
        this.colorValueRangeNeutral = R$attr.uikit_colorGrey50;
        int i2 = R$attr.uikit_colorGrey20;
        this.colorValuePointNeutral = i2;
        this.colorBaseline = i2;
        ihm.f fVarD = v0.a.d("create(...)");
        this.pointSelectionPublishSubject = fVarD;
        this.appearingAnimatedValue = 1.0f;
        Paint paintC = com.google.android.gms.internal.mlkit_vision_face.a.c(true);
        Unit unit = Unit.f186387a;
        g gVarA = ebm.a.a(this, paintC);
        this.f56990j = gVarA;
        int i3 = 13;
        this.k = new j(this, gVarA, hx7.q.b(new o(this, 1)), new lm.d(i3));
        this.f56991l = new ir0.e(this, gVarA);
        this.o = new SparseIntArray();
        this.f56997s = kli.a.k(context, 8.0f);
        this.f56998t = kli.a.k(context, 4.0f);
        this.u = kli.a.k(context, 3.0f);
        this.v = kli.a.k(context, 13.5f);
        this.f56999w = kli.a.k(context, 32.0f);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, "startPointFlashingMultiplayer", BitmapDescriptorFactory.HUE_RED, 1.0f);
        objectAnimatorOfFloat.setInterpolator(new AccelerateDecelerateInterpolator());
        objectAnimatorOfFloat.setDuration(1000L);
        objectAnimatorOfFloat.addListener(new c());
        Intrinsics.checkNotNullExpressionValue(objectAnimatorOfFloat, "apply(...)");
        this.f57001y = objectAnimatorOfFloat;
        this.z = te0.w.y0(new b0.b(context, 23));
        this.A = te0.w.y0(new b0.b(context, 24));
        this.B = te0.w.y0(new b0.b(context, 25));
        int i5 = 26;
        this.C = te0.w.y0(new b0.b(context, i5));
        this.D = te0.w.y0(new b0.b(context, 27));
        this.E = te0.w.y0(new b0.b(context, 28));
        this.F = te0.w.y0(new b0.b(context, 29));
        this.G = te0.w.y0(new lea.b(this, context, i5));
        this.H = true;
        setWillNotDraw(false);
        fVarD.subscribe(new lr9.m(new o(this, 0), i3));
    }

    public /* synthetic */ MultiTargetFanChartView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
