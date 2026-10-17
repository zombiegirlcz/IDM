package com.revolut.core.ui_kit.internal.views.fanchart;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.text.Layout;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.internal.views.fanchart.CurvedFanChartView;
import com.revolut.core.ui_kit.internal.views.tag.TagView;
import com.revolut.core.ui_kit.internal.views.tag.TagViewData;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import hx7.q;
import ir0.g;
import iv0.j;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import jb3.l;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import or0.u;
import org.jetbrains.annotations.NotNull;
import uw0.i;
import zhm.f0;
import zhm.v;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u0007\n\u0002\b\u0018\b\u0000\u0018\u0000 q2\u00020\u0001:\u0004\u001c\n@\u0015B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012R0\u0010\u001b\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0014\u0012\u0004\u0012\u00020\f0\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR.\u0010$\u001a\u0004\u0018\u00010\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R.\u0010,\u001a\u0004\u0018\u00010%2\b\u0010\u001d\u001a\u0004\u0018\u00010%8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R.\u00103\u001a\u0004\u0018\u00010\u00142\b\u0010\u001d\u001a\u0004\u0018\u00010\u00148\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R*\u0010;\u001a\u0002042\u0006\u0010\u001d\u001a\u0002048\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b5\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R*\u0010?\u001a\u0002042\u0006\u0010\u001d\u001a\u0002048\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b<\u00106\u001a\u0004\b=\u00108\"\u0004\b>\u0010:R.\u0010G\u001a\u0004\u0018\u00010@2\b\u0010\u001d\u001a\u0004\u0018\u00010@8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bA\u0010B\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR\"\u0010N\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010MR\"\u0010R\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bO\u0010I\u001a\u0004\bP\u0010K\"\u0004\bQ\u0010MR\u001a\u0010U\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\bS\u0010I\u001a\u0004\bT\u0010KR\"\u0010Y\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bV\u0010I\u001a\u0004\bW\u0010K\"\u0004\bX\u0010MR$\u0010_\u001a\u00020Z2\u0006\u0010\u001d\u001a\u00020Z8\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b[\u0010\\\"\u0004\b]\u0010^R\u0014\u0010a\u001a\u00020\u00068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b`\u0010KR\u0014\u0010c\u001a\u00020\u00068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bb\u0010KR\u0014\u0010e\u001a\u00020\u00068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bd\u0010KR\u0014\u0010g\u001a\u00020\u00068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bf\u0010KR\u0014\u0010i\u001a\u00020\u00068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bh\u0010KR\u0014\u0010k\u001a\u00020\u00068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bj\u0010KR\u0014\u0010m\u001a\u00020\u00068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bl\u0010KR\u0014\u0010p\u001a\u00020\u00108BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bn\u0010o¨\u0006r"}, d2 = {"Lcom/revolut/core/ui_kit/internal/views/fanchart/CurvedFanChartView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Llt0/e;", "levelLabel", "", "setLevelLabel", "(Llt0/e;)V", "", "Ldj0/d;", "getAllMoneyValuesToDraw", "()Ljava/util/List;", "Lkotlin/Function1;", "Llt0/c;", "a", "Lkotlin/jvm/functions/Function1;", "getSelectedPointListener", "()Lkotlin/jvm/functions/Function1;", "setSelectedPointListener", "(Lkotlin/jvm/functions/Function1;)V", "selectedPointListener", "Llt0/d;", "value", "b", "Llt0/d;", "getDataset", "()Llt0/d;", "setDataset", "(Llt0/d;)V", "dataset", "Luw0/i;", "c", "Luw0/i;", "getDataChangeAnimationRequest", "()Luw0/i;", "setDataChangeAnimationRequest", "(Luw0/i;)V", "dataChangeAnimationRequest", "d", "Llt0/c;", "getSelectedPoint", "()Llt0/c;", "setSelectedPoint", "(Llt0/c;)V", "selectedPoint", "", "e", "Z", "getOuterRegionVisible", "()Z", "setOuterRegionVisible", "(Z)V", "outerRegionVisible", "f", "getInnerRegionVisible", "setInnerRegionVisible", "innerRegionVisible", "Llt0/f;", "g", "Llt0/f;", "getYAxisLabelParams", "()Llt0/f;", "setYAxisLabelParams", "(Llt0/f;)V", "yAxisLabelParams", "h", "I", "getBaselineColorAttr", "()I", "setBaselineColorAttr", "(I)V", "baselineColorAttr", "i", "getForecastColorAttr", "setForecastColorAttr", "forecastColorAttr", "j", "getGoalColorAttr", "goalColorAttr", "k", "getAxisColorAttr", "setAxisColorAttr", "axisColorAttr", "", "U", "F", "setAppearingAnimatedValue", "(F)V", "appearingAnimatedValue", "getChartPadding", "chartPadding", "getCircleRadius", "circleRadius", "getCircleOuterRadius", "circleOuterRadius", "getAxisStrokeWidth", "axisStrokeWidth", "getLineStrokeWidth", "lineStrokeWidth", "getSelectedPointStrokeWidth", "selectedPointStrokeWidth", "getGlowingOffset", "glowingOffset", "getDefaultMoneyRange", "()Ldj0/d;", "defaultMoneyRange", "Companion", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CurvedFanChartView extends FrameLayout {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();
    public final Paint A;
    public final Paint B;
    public final TextPaint C;
    public final TextPaint D;
    public final Paint E;
    public boolean F;
    public RectF G;
    public RectF H;
    public RectF I;
    public RectF J;
    public final Path K;
    public final PointF L;
    public final PointF M;
    public final Path N;
    public final PointF O;
    public final PointF P;
    public final Path Q;
    public final Path R;
    public final Path S;
    public Float T;

    /* JADX INFO: renamed from: U, reason: from kotlin metadata */
    public float appearingAnimatedValue;
    public final g V;
    public final j W;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public Function1 selectedPointListener;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final ir0.e f56945a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public lt0.d dataset;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final TagView f56947b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public i dataChangeAnimationRequest;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public lt0.c selectedPoint;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public boolean outerRegionVisible;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public boolean innerRegionVisible;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public lt0.f yAxisLabelParams;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    public int baselineColorAttr;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public int forecastColorAttr;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    public final int goalColorAttr;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public int axisColorAttr;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public dj0.d f56952l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public dj0.d f56953m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f56954n;
    public int o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f56955p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f56956q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f56957r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f56958s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ArrayList f56959t;
    public final LinkedHashMap u;
    public lt0.e v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final SparseIntArray f56960w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final nr0.e f56961x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final nr0.e f56962y;
    public final Paint z;

    /* JADX INFO: renamed from: com.revolut.core.ui_kit.internal.views.fanchart.CurvedFanChartView$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CurvedFanChartView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static Unit a(CurvedFanChartView curvedFanChartView, float f) {
        curvedFanChartView.setAppearingAnimatedValue(f);
        return Unit.f186387a;
    }

    private final List<dj0.d> getAllMoneyValuesToDraw() {
        dj0.d dVar;
        List<lt0.c> list;
        ArrayList arrayList = new ArrayList();
        lt0.d dVar2 = this.dataset;
        if (dVar2 != null && (list = dVar2.f199734b) != null) {
            for (lt0.c cVar : list) {
                arrayList.add(cVar.f199729b);
                arrayList.add(cVar.f199730c);
                if (this.innerRegionVisible) {
                    arrayList.add(cVar.d);
                    arrayList.add(cVar.f);
                }
                if (this.outerRegionVisible) {
                    arrayList.add(cVar.e);
                    arrayList.add(cVar.f199731g);
                }
            }
        }
        lt0.e eVar = this.v;
        if (eVar != null && (dVar = eVar.f199735a) != null) {
            arrayList.add(dVar);
        }
        dj0.d.Companion.getClass();
        arrayList.add(dj0.d.e);
        return arrayList;
    }

    private final int getAxisStrokeWidth() {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        return kli.a.k(context, 1.0f);
    }

    private final int getChartPadding() {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        return kli.a.k(context, 8.0f);
    }

    private final int getCircleOuterRadius() {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        return kli.a.k(context, 4.0f);
    }

    private final int getCircleRadius() {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        return kli.a.k(context, 2.0f);
    }

    private final dj0.d getDefaultMoneyRange() {
        dj0.d.Companion.getClass();
        return new dj0.d(12000000L, dj0.d.f115081c);
    }

    private final int getGlowingOffset() {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        return kli.a.k(context, 32.0f);
    }

    private final int getLineStrokeWidth() {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        return kli.a.k(context, 2.0f);
    }

    private final int getSelectedPointStrokeWidth() {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        return kli.a.k(context, 1.0f);
    }

    private final void setAppearingAnimatedValue(float f) {
        this.appearingAnimatedValue = f;
        invalidate();
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x023f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b() {
        /*
            Method dump skipped, instruction units count: 1326
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.core.ui_kit.internal.views.fanchart.CurvedFanChartView.b():void");
    }

    public final void c(Canvas canvas) {
        g gVar = this.V;
        Path path = this.K;
        if (path.isEmpty()) {
            return;
        }
        RectF rectF = this.H;
        if (rectF == null) {
            Intrinsics.r("graphRect");
            throw null;
        }
        float f = rectF.left;
        float f4 = rectF.top;
        int iSave = canvas.save();
        canvas.translate(f, f4);
        try {
            gVar.d(h(this.baselineColorAttr));
            PointF pointF = this.M;
            float f5 = pointF.x;
            float f6 = pointF.y;
            iSave = canvas.save();
            canvas.translate(f5, f6);
            gVar.j(Paint.Style.FILL);
            gVar.c(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, canvas, getCircleRadius());
            canvas.restoreToCount(iSave);
            gVar.j(Paint.Style.STROKE);
            this.f56945a0.b(canvas, path, this.T);
        } catch (Throwable th10) {
            throw th10;
        } finally {
            canvas.restoreToCount(iSave);
        }
    }

    public final void d(Canvas canvas) {
        g gVar = this.V;
        Path path = this.N;
        if (path.isEmpty()) {
            return;
        }
        RectF rectF = this.H;
        if (rectF == null) {
            Intrinsics.r("graphRect");
            throw null;
        }
        float f = rectF.left;
        float f4 = rectF.top;
        int iSave = canvas.save();
        canvas.translate(f, f4);
        try {
            gVar.d(h(this.forecastColorAttr));
            PointF pointF = this.P;
            float f5 = pointF.x;
            float f6 = pointF.y;
            iSave = canvas.save();
            canvas.translate(f5, f6);
            gVar.j(Paint.Style.FILL);
            gVar.c(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, canvas, getCircleRadius());
            canvas.restoreToCount(iSave);
            gVar.j(Paint.Style.STROKE);
            this.f56945a0.b(canvas, path, this.T);
        } catch (Throwable th10) {
            throw th10;
        } finally {
            canvas.restoreToCount(iSave);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0095  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(android.graphics.Canvas r6, android.graphics.Path r7, int r8, float r9, float r10) {
        /*
            r5 = this;
            boolean r7 = r7.isEmpty()
            if (r7 == 0) goto L7
            return
        L7:
            ir0.g r7 = r5.V
            r7.d(r8)
            android.graphics.Paint$Style r8 = android.graphics.Paint.Style.FILL
            r7.j(r8)
            int r0 = com.revolut.core.ui_kit_resources.R$attr.uikit_colorBackground
            int r0 = r5.h(r0)
            android.graphics.Paint r1 = r5.A
            r1.setColor(r0)
            r1.setStyle(r8)
            android.graphics.RectF r8 = r5.H
            java.lang.String r0 = "graphRect"
            r2 = 0
            if (r8 == 0) goto La6
            float r3 = r8.left
            float r3 = r3 + r9
            float r8 = r8.top
            float r8 = r8 + r10
            java.lang.Float r9 = r5.T
            if (r9 == 0) goto L44
            float r9 = r9.floatValue()
            android.graphics.RectF r10 = r5.H
            if (r10 == 0) goto L40
            float r10 = r10.left
            float r9 = r9 + r10
            java.lang.Float r2 = java.lang.Float.valueOf(r9)
            goto L44
        L40:
            kotlin.jvm.internal.Intrinsics.r(r0)
            throw r2
        L44:
            if (r2 == 0) goto L66
            int r9 = r5.getCircleOuterRadius()
            float r9 = (float) r9
            float r9 = r3 - r9
            float r10 = r2.floatValue()
            int r9 = (r9 > r10 ? 1 : (r9 == r10 ? 0 : -1))
            if (r9 > 0) goto L66
            float r9 = r2.floatValue()
            int r10 = r5.getCircleOuterRadius()
            float r10 = (float) r10
            float r10 = r10 + r3
            int r9 = (r9 > r10 ? 1 : (r9 == r10 ? 0 : -1))
            if (r9 > 0) goto L66
            gt0.a r9 = gt0.a.SELECTED
            goto L68
        L66:
            gt0.a r9 = gt0.a.NO_SELECTION
        L68:
            gt0.a r10 = gt0.a.NO_SELECTION
            if (r9 == r10) goto L95
            ir0.e r10 = r5.f56945a0
            ir0.g r0 = r10.f167935b
            boolean r2 = r0.m()
            if (r2 != 0) goto L77
            goto L95
        L77:
            float r2 = r0.a()
            gt0.a r4 = gt0.a.SELECTED
            if (r9 != r4) goto L85
            r9 = 1065353216(0x3f800000, float:1.0)
            float r10 = r10.f167936c
            float r10 = r10 * r9
            goto L86
        L85:
            r10 = 0
        L86:
            r0.h(r10)
            int r9 = r5.getCircleOuterRadius()
            float r9 = (float) r9
            r7.c(r3, r8, r6, r9)
            r0.h(r2)
            goto L9d
        L95:
            int r9 = r5.getCircleOuterRadius()
            float r9 = (float) r9
            r7.c(r3, r8, r6, r9)
        L9d:
            int r7 = r5.getCircleRadius()
            float r7 = (float) r7
            r6.drawCircle(r3, r8, r7, r1)
            return
        La6:
            kotlin.jvm.internal.Intrinsics.r(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.core.ui_kit.internal.views.fanchart.CurvedFanChartView.e(android.graphics.Canvas, android.graphics.Path, int, float, float):void");
    }

    public final void f(Canvas canvas) {
        Path path = this.R;
        Path path2 = this.Q;
        Paint paint = this.A;
        RectF rectF = this.H;
        if (rectF == null) {
            Intrinsics.r("graphRect");
            throw null;
        }
        float f = rectF.left;
        float f4 = rectF.top;
        int iSave = canvas.save();
        canvas.translate(f, f4);
        try {
            paint.setStyle(Paint.Style.FILL);
            paint.setColor(h(this.forecastColorAttr));
            if (!path2.isEmpty() && this.outerRegionVisible) {
                paint.setAlpha(25);
                Unit unit = Unit.f186387a;
                canvas.drawPath(path2, paint);
            }
            if (!path.isEmpty() && this.innerRegionVisible) {
                paint.setAlpha(51);
                Unit unit2 = Unit.f186387a;
                canvas.drawPath(path, paint);
            }
            paint.setAlpha(255);
            canvas.restoreToCount(iSave);
        } catch (Throwable th10) {
            canvas.restoreToCount(iSave);
            throw th10;
        }
    }

    public final lt0.c g(MotionEvent motionEvent) {
        Pair pair;
        RectF rectF = this.H;
        if (rectF == null) {
            Intrinsics.r("graphRect");
            throw null;
        }
        float f = rectF.left;
        float f4 = rectF.right;
        float x3 = motionEvent.getX();
        if (f <= x3 && x3 <= f4) {
            RectF rectF2 = this.H;
            if (rectF2 == null) {
                Intrinsics.r("graphRect");
                throw null;
            }
            float f5 = rectF2.top;
            float f6 = rectF2.bottom;
            float y2 = motionEvent.getY();
            if (f5 <= y2 && y2 <= f6) {
                Pair pair2 = null;
                for (Map.Entry entry : this.u.entrySet()) {
                    float x5 = motionEvent.getX();
                    RectF rectF3 = this.H;
                    if (rectF3 == null) {
                        Intrinsics.r("graphRect");
                        throw null;
                    }
                    float fAbs = Math.abs((x5 - rectF3.left) - ((Number) entry.getKey()).floatValue());
                    if (pair2 == null) {
                        pair = new Pair(Float.valueOf(fAbs), entry.getValue());
                    } else if (fAbs < ((Number) pair2.f186385a).floatValue()) {
                        pair = new Pair(Float.valueOf(fAbs), entry.getValue());
                    }
                    pair2 = pair;
                }
                if (pair2 != null) {
                    return (lt0.c) pair2.f186386b;
                }
            }
        }
        return null;
    }

    public final int getAxisColorAttr() {
        return this.axisColorAttr;
    }

    public final int getBaselineColorAttr() {
        return this.baselineColorAttr;
    }

    public final i getDataChangeAnimationRequest() {
        return this.dataChangeAnimationRequest;
    }

    public final lt0.d getDataset() {
        return this.dataset;
    }

    public final int getForecastColorAttr() {
        return this.forecastColorAttr;
    }

    public final int getGoalColorAttr() {
        return this.goalColorAttr;
    }

    public final boolean getInnerRegionVisible() {
        return this.innerRegionVisible;
    }

    public final boolean getOuterRegionVisible() {
        return this.outerRegionVisible;
    }

    public final lt0.c getSelectedPoint() {
        return this.selectedPoint;
    }

    @NotNull
    public final Function1<lt0.c, Unit> getSelectedPointListener() {
        return this.selectedPointListener;
    }

    public final lt0.f getYAxisLabelParams() {
        return this.yAxisLabelParams;
    }

    public final int h(int i) {
        SparseIntArray sparseIntArray = this.f56960w;
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

    public final float i(dj0.d dVar) {
        long j2 = this.f56952l.f115082a;
        long j3 = this.f56953m.f115082a;
        long j5 = j2 - j3;
        if (j5 <= 0) {
            RectF rectF = this.H;
            if (rectF != null) {
                return rectF.height();
            }
            Intrinsics.r("graphRect");
            throw null;
        }
        long j16 = dVar.f115082a - j3;
        RectF rectF2 = this.H;
        if (rectF2 == null) {
            Intrinsics.r("graphRect");
            throw null;
        }
        float fHeight = rectF2.height();
        float f = j16;
        RectF rectF3 = this.H;
        if (rectF3 != null) {
            return fHeight - ((rectF3.height() * f) / j5);
        }
        Intrinsics.r("graphRect");
        throw null;
    }

    public final void j() {
        lt0.e eVar = this.v;
        if (eVar != null) {
            float fI = i(eVar.f199735a);
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            float fK = kli.a.k(context, 2.0f);
            float height = fI + fK;
            TagView tagView = this.f56947b0;
            float height2 = tagView.getHeight() + height;
            RectF rectF = this.H;
            if (rectF == null) {
                Intrinsics.r("graphRect");
                throw null;
            }
            if (height2 >= rectF.height()) {
                height = (fI - fK) - tagView.getHeight();
            }
            tagView.setTranslationY(height);
            RectF rectF2 = this.H;
            if (rectF2 != null) {
                tagView.setTranslationX(rectF2.left);
            } else {
                Intrinsics.r("graphRect");
                throw null;
            }
        }
    }

    /* JADX WARN: Finally extract failed */
    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        if (this.F) {
            b();
            j();
        }
        int iH = h(this.axisColorAttr);
        Paint paint = this.z;
        paint.setColor(iH);
        RectF rectF = this.H;
        if (rectF == null) {
            Intrinsics.r("graphRect");
            throw null;
        }
        float f = rectF.left;
        float f4 = rectF.bottom;
        canvas.drawLine(f, f4, rectF.right, f4, paint);
        RectF rectF2 = this.H;
        if (rectF2 == null) {
            Intrinsics.r("graphRect");
            throw null;
        }
        float f5 = rectF2.right;
        canvas.drawLine(f5, rectF2.bottom, f5, rectF2.top, paint);
        RectF rectF3 = this.H;
        if (rectF3 == null) {
            Intrinsics.r("graphRect");
            throw null;
        }
        float f6 = rectF3.left;
        RectF rectF4 = this.J;
        if (rectF4 == null) {
            Intrinsics.r("xAxisRect");
            throw null;
        }
        float f32 = rectF4.top;
        int iSave = canvas.save();
        canvas.translate(f6, f32);
        try {
            RectF rectF5 = this.H;
            if (rectF5 == null) {
                Intrinsics.r("graphRect");
                throw null;
            }
            float fWidth = rectF5.width();
            lt0.d dVar = this.dataset;
            List list = dVar != null ? dVar.f199733a : null;
            if (list == null) {
                list = f0.f322471a;
            }
            int size = list.size();
            float f35 = BitmapDescriptorFactory.HUE_RED;
            float f36 = size > 1 ? fWidth / (size - 1) : 0.0f;
            int i = 0;
            for (Object obj2 : list) {
                int i2 = i + 1;
                if (i < 0) {
                    v.s();
                    throw null;
                }
                a.a.g(this.f56961x.b((Clause) obj2, this.C), canvas, i * f36, BitmapDescriptorFactory.HUE_RED);
                i = i2;
            }
            canvas.restoreToCount(iSave);
            ArrayList arrayList = this.f56959t;
            RectF rectF6 = this.I;
            if (rectF6 == null) {
                Intrinsics.r("yAxisRect");
                throw null;
            }
            float f37 = rectF6.left;
            float f41 = rectF6.top;
            iSave = canvas.save();
            canvas.translate(f37, f41);
            try {
                RectF rectF7 = this.I;
                if (rectF7 == null) {
                    Intrinsics.r("yAxisRect");
                    throw null;
                }
                float fHeight = rectF7.height();
                int size2 = arrayList.size();
                if (size2 > 1) {
                    f35 = fHeight / size2;
                }
                for (int i3 = 0; i3 < size2; i3++) {
                    Layout layoutB = this.f56962y.b((Clause) arrayList.get(i3), this.D);
                    RectF rectF8 = this.I;
                    if (rectF8 == null) {
                        Intrinsics.r("yAxisRect");
                        throw null;
                    }
                    a.a.i(layoutB, canvas, rectF8.width(), (i3 * f35) - (layoutB.getHeight() / 2.0f));
                }
                canvas.restoreToCount(iSave);
                iSave = canvas.save();
                try {
                    if (this.appearingAnimatedValue != 1.0f) {
                        RectF rectF9 = this.H;
                        if (rectF9 == null) {
                            Intrinsics.r("graphRect");
                            throw null;
                        }
                        float glowingOffset = rectF9.left - getGlowingOffset();
                        RectF rectF10 = this.H;
                        if (rectF10 == null) {
                            Intrinsics.r("graphRect");
                            throw null;
                        }
                        float glowingOffset2 = rectF10.top - getGlowingOffset();
                        RectF rectF11 = this.H;
                        if (rectF11 == null) {
                            Intrinsics.r("graphRect");
                            throw null;
                        }
                        float glowingOffset3 = (((rectF11.right + getGlowingOffset()) - glowingOffset) * this.appearingAnimatedValue) + glowingOffset;
                        RectF rectF12 = this.H;
                        if (rectF12 == null) {
                            Intrinsics.r("graphRect");
                            throw null;
                        }
                        canvas.clipRect(glowingOffset, glowingOffset2, glowingOffset3, rectF12.bottom + getGlowingOffset());
                    }
                    f(canvas);
                    c(canvas);
                    d(canvas);
                    RectF rectF13 = this.H;
                    if (rectF13 == null) {
                        Intrinsics.r("graphRect");
                        throw null;
                    }
                    float f42 = rectF13.left;
                    float f57 = rectF13.top;
                    iSave = canvas.save();
                    canvas.translate(f42, f57);
                    try {
                        canvas.drawPath(this.S, this.B);
                        canvas.restoreToCount(iSave);
                        int iH2 = h(this.baselineColorAttr);
                        PointF pointF = this.L;
                        e(canvas, this.K, iH2, pointF.x, pointF.y);
                        int iH3 = h(this.forecastColorAttr);
                        PointF pointF2 = this.O;
                        e(canvas, this.N, iH3, pointF2.x, pointF2.y);
                        lt0.e eVar = this.v;
                        dj0.d dVar2 = eVar != null ? eVar.f199735a : null;
                        if (dVar2 != null) {
                            RectF rectF14 = this.H;
                            if (rectF14 == null) {
                                Intrinsics.r("graphRect");
                                throw null;
                            }
                            float f69 = rectF14.right;
                            float fI = i(dVar2);
                            RectF rectF15 = this.H;
                            if (rectF15 == null) {
                                Intrinsics.r("graphRect");
                                throw null;
                            }
                            canvas.drawLine(rectF15.left, fI, f69, fI, this.E);
                        }
                    } finally {
                        canvas.restoreToCount(iSave);
                    }
                } catch (Throwable th10) {
                    throw th10;
                }
            } catch (Throwable th11) {
                throw th11;
            }
        } catch (Throwable th12) {
            throw th12;
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i5) {
        super.onLayout(z, i, i2, i3, i5);
        j();
    }

    @Override // android.widget.FrameLayout, android.view.View
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
        this.f56947b0.measure(0, 0);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i5) {
        super.onSizeChanged(i, i2, i3, i5);
        b();
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0046  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r5) {
        /*
            r4 = this;
            java.lang.String r0 = "event"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            boolean r0 = r4.isEnabled()
            if (r0 != 0) goto L10
            boolean r5 = super.onTouchEvent(r5)
            return r5
        L10:
            lt0.d r0 = r4.dataset
            r1 = 0
            if (r0 == 0) goto L18
            java.util.List r0 = r0.f199734b
            goto L19
        L18:
            r0 = r1
        L19:
            if (r0 != 0) goto L1d
            zhm.f0 r0 = zhm.f0.f322471a
        L1d:
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            r2 = 1
            if (r0 != 0) goto L5d
            int r0 = r5.getAction()
            if (r0 == 0) goto L54
            if (r0 == r2) goto L46
            r3 = 2
            if (r0 == r3) goto L35
            r5 = 3
            if (r0 == r5) goto L46
            goto L5d
        L35:
            android.view.ViewParent r0 = r4.getParent()
            r0.requestDisallowInterceptTouchEvent(r2)
            lt0.c r5 = r4.g(r5)
            kotlin.jvm.functions.Function1 r0 = r4.selectedPointListener
            r0.invoke(r5)
            goto L5d
        L46:
            android.view.ViewParent r5 = r4.getParent()
            r0 = 0
            r5.requestDisallowInterceptTouchEvent(r0)
            kotlin.jvm.functions.Function1 r5 = r4.selectedPointListener
            r5.invoke(r1)
            goto L5d
        L54:
            lt0.c r5 = r4.g(r5)
            kotlin.jvm.functions.Function1 r0 = r4.selectedPointListener
            r0.invoke(r5)
        L5d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.core.ui_kit.internal.views.fanchart.CurvedFanChartView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void setAxisColorAttr(int i) {
        this.axisColorAttr = i;
    }

    public final void setBaselineColorAttr(int i) {
        this.baselineColorAttr = i;
    }

    public final void setDataChangeAnimationRequest(i iVar) {
        if (Intrinsics.f(this.dataChangeAnimationRequest, iVar)) {
            return;
        }
        this.dataChangeAnimationRequest = iVar;
        lt0.d dVar = this.dataset;
        lt0.d.Companion.getClass();
        if (Intrinsics.f(dVar, lt0.d.f199732c)) {
            return;
        }
        this.W.a(iVar);
    }

    public final void setDataset(lt0.d dVar) {
        this.F = true;
        this.dataset = dVar;
        this.W.a(this.dataChangeAnimationRequest);
        invalidate();
    }

    public final void setForecastColorAttr(int i) {
        this.forecastColorAttr = i;
    }

    public final void setInnerRegionVisible(boolean z) {
        this.F = true;
        this.innerRegionVisible = z;
        invalidate();
    }

    public final void setLevelLabel(lt0.e levelLabel) {
        this.v = levelLabel;
        TextLocalisedClause textLocalisedClause = levelLabel != null ? levelLabel.f199736b : null;
        TagView tagView = this.f56947b0;
        u.c(tagView, textLocalisedClause);
        if (levelLabel != null) {
            TextLocalisedClause textLocalisedClause2 = levelLabel.f199736b;
            int i = this.goalColorAttr;
            tagView.setContent(new TagViewData(null, textLocalisedClause2, new Color.Solid(i), i, null, 1000));
        }
        this.F = true;
        invalidate();
    }

    public final void setOuterRegionVisible(boolean z) {
        this.F = true;
        this.outerRegionVisible = z;
        invalidate();
    }

    public final void setSelectedPoint(lt0.c cVar) {
        this.F = true;
        this.selectedPoint = cVar;
        invalidate();
    }

    public final void setSelectedPointListener(@NotNull Function1<? super lt0.c, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "<set-?>");
        this.selectedPointListener = function1;
    }

    public final void setYAxisLabelParams(lt0.f fVar) {
        this.F = true;
        this.yAxisLabelParams = fVar;
        invalidate();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CurvedFanChartView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CurvedFanChartView(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.selectedPointListener = new lsl.b(2);
        lt0.d.Companion.getClass();
        this.dataset = lt0.d.f199732c;
        final int i2 = 1;
        this.outerRegionVisible = true;
        this.innerRegionVisible = true;
        this.baselineColorAttr = R$attr.uikit_colorPerformancePositive;
        int i3 = R$attr.uikit_colorAccent;
        this.forecastColorAttr = i3;
        this.goalColorAttr = i3;
        this.axisColorAttr = R$attr.uikit_colorGreyTone20;
        dj0.d.Companion.getClass();
        dj0.d dVar = dj0.d.e;
        this.f56952l = dVar;
        this.f56953m = dVar;
        int iK = kli.a.k(context, 38.0f);
        this.f56954n = iK;
        this.o = iK;
        int iK2 = kli.a.k(context, 18.0f);
        this.f56955p = iK2;
        this.f56956q = iK2;
        int iK3 = kli.a.k(context, 30.0f);
        this.f56957r = iK3;
        this.f56958s = iK3;
        this.f56959t = new ArrayList();
        this.u = new LinkedHashMap();
        this.f56960w = new SparseIntArray();
        final int i5 = 0;
        this.f56961x = new nr0.e(this, new Function0(this) { // from class: lt0.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CurvedFanChartView f199727b;

            {
                this.f199727b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i5) {
                    case 0:
                        CurvedFanChartView curvedFanChartView = this.f199727b;
                        curvedFanChartView.F = true;
                        curvedFanChartView.invalidate();
                        break;
                    default:
                        CurvedFanChartView curvedFanChartView2 = this.f199727b;
                        curvedFanChartView2.F = true;
                        curvedFanChartView2.invalidate();
                        break;
                }
                return Unit.f186387a;
            }
        });
        this.f56962y = new nr0.e(this, new Function0(this) { // from class: lt0.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CurvedFanChartView f199727b;

            {
                this.f199727b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        CurvedFanChartView curvedFanChartView = this.f199727b;
                        curvedFanChartView.F = true;
                        curvedFanChartView.invalidate();
                        break;
                    default:
                        CurvedFanChartView curvedFanChartView2 = this.f199727b;
                        curvedFanChartView2.F = true;
                        curvedFanChartView2.invalidate();
                        break;
                }
                return Unit.f186387a;
            }
        });
        Paint paint = new Paint();
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint.setStrokeWidth(getAxisStrokeWidth());
        paint.setColor(h(this.axisColorAttr));
        this.z = paint;
        Paint paint2 = new Paint();
        paint2.setStyle(style);
        paint2.setStrokeWidth(getLineStrokeWidth());
        paint2.setAntiAlias(true);
        paint2.setColor(-65536);
        this.A = paint2;
        Paint paint3 = new Paint();
        paint3.setStyle(style);
        paint3.setStrokeWidth(getSelectedPointStrokeWidth());
        paint3.setColor(h(R$attr.uikit_colorForeground));
        this.B = paint3;
        TextPaint textPaint = new TextPaint();
        textPaint.setTextAlign(Paint.Align.CENTER);
        textPaint.setAntiAlias(true);
        textPaint.setColor(h(R$attr.uikit_colorGreyTone50));
        this.C = textPaint;
        TextPaint textPaint2 = new TextPaint();
        textPaint2.setTextAlign(Paint.Align.RIGHT);
        textPaint2.setAntiAlias(true);
        textPaint2.setColor(h(R$attr.uikit_colorGreyTone50));
        this.D = textPaint2;
        Paint paint4 = new Paint();
        paint4.setStyle(style);
        paint4.setStrokeWidth(kli.a.l(context, 2.0f));
        paint4.setPathEffect(new DashPathEffect(new float[]{kli.a.l(context, 0.25f), kli.a.l(context, 4.0f)}, BitmapDescriptorFactory.HUE_RED));
        paint4.setStrokeCap(Paint.Cap.ROUND);
        paint4.setAntiAlias(true);
        paint4.setColor(h(i3));
        this.E = paint4;
        this.F = true;
        this.K = new Path();
        this.L = new PointF();
        this.M = new PointF();
        this.N = new Path();
        this.O = new PointF();
        this.P = new PointF();
        this.Q = new Path();
        this.R = new Path();
        this.S = new Path();
        this.appearingAnimatedValue = 1.0f;
        g gVarA = ebm.a.a(this, new Paint(paint2));
        this.V = gVarA;
        this.W = new j(this, gVarA, q.b(new lk4.g(this, 29)), new lm.d(13));
        this.f56945a0 = new ir0.e(this, gVarA);
        TagView tagView = new TagView(context, null, 6, 0);
        addView(tagView);
        this.f56947b0 = tagView;
        setWillNotDraw(false);
        l.d(textPaint, context, R$attr.internal_textAppearanceBody3);
        l.d(textPaint2, context, R$attr.internal_textAppearanceBody3);
    }

    public /* synthetic */ CurvedFanChartView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
