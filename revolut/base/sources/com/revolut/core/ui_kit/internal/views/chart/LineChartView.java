package com.revolut.core.ui_kit.internal.views.chart;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.Shader;
import android.text.Layout;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import aw0.a7;
import aw0.b7;
import aw0.fa;
import aw0.t6;
import aw0.u6;
import aw0.v1;
import aw0.w6;
import aw0.x6;
import aw0.y6;
import aw0.z6;
import bt0.h;
import bt0.q;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit_resources.R$attr;
import ct0.m;
import ct0.p;
import ht0.v;
import iv0.j;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import jb3.l;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qfm.e1;
import th9.t;
import tjf.m0;
import ts0.g0;
import ts0.h0;
import ts0.i0;
import ts0.j0;
import zhm.d0;
import zhm.f0;
import zhm.u;
import zhm.w;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000°\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0007\u0018\u0000 £\u00012\u00020\u00012\u00020\u0002:\u0007¤\u0001¥\u0001¦\u0001\u001aB'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ/\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u001e\u001a\u00020\u00198\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR \u0010&\u001a\u00020\u001f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b \u0010!\u0012\u0004\b$\u0010%\u001a\u0004\b\"\u0010#R$\u0010-\u001a\u00020'2\u0006\u0010(\u001a\u00020'8\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b)\u0010*\"\u0004\b+\u0010,R*\u00104\u001a\u00020\u00072\u0006\u0010(\u001a\u00020\u00078\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R*\u0010\u0016\u001a\u00020\u00152\u0006\u0010(\u001a\u00020\u00158\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b/\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u0010\u0018R*\u0010<\u001a\u0002092\u0006\u0010(\u001a\u0002098\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R*\u0010G\u001a\u00020@2\u0006\u0010(\u001a\u00020@8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bA\u0010B\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR*\u0010K\u001a\u0002092\u0006\u0010(\u001a\u0002098\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bH\u0010;\u001a\u0004\bI\u0010=\"\u0004\bJ\u0010?R*\u0010S\u001a\u00020L2\u0006\u0010(\u001a\u00020L8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bM\u0010N\u001a\u0004\bO\u0010P\"\u0004\bQ\u0010RR.\u0010[\u001a\u0004\u0018\u00010T2\b\u0010(\u001a\u0004\u0018\u00010T8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bU\u0010V\u001a\u0004\bW\u0010X\"\u0004\bY\u0010ZR.\u0010c\u001a\u0004\u0018\u00010\\2\b\u0010(\u001a\u0004\u0018\u00010\\8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b]\u0010^\u001a\u0004\b_\u0010`\"\u0004\ba\u0010bR.\u0010k\u001a\u0004\u0018\u00010d2\b\u0010(\u001a\u0004\u0018\u00010d8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\be\u0010f\u001a\u0004\bg\u0010h\"\u0004\bi\u0010jR6\u0010t\u001a\b\u0012\u0004\u0012\u00020m0l2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020m0l8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bn\u0010o\u001a\u0004\bp\u0010q\"\u0004\br\u0010sR.\u0010|\u001a\u0004\u0018\u00010u2\b\u0010(\u001a\u0004\u0018\u00010u8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bv\u0010w\u001a\u0004\bx\u0010y\"\u0004\bz\u0010{R3\u0010\u0084\u0001\u001a\u0004\u0018\u00010}2\b\u0010(\u001a\u0004\u0018\u00010}8\u0006@FX\u0086\u000e¢\u0006\u0016\n\u0004\b~\u0010\u007f\u001a\u0006\b\u0080\u0001\u0010\u0081\u0001\"\u0006\b\u0082\u0001\u0010\u0083\u0001R3\u0010\u008c\u0001\u001a\u00030\u0085\u00012\u0007\u0010(\u001a\u00030\u0085\u00018\u0006@FX\u0086\u000e¢\u0006\u0018\n\u0006\b\u0086\u0001\u0010\u0087\u0001\u001a\u0006\b\u0088\u0001\u0010\u0089\u0001\"\u0006\b\u008a\u0001\u0010\u008b\u0001R.\u0010\u0090\u0001\u001a\u0002092\u0006\u0010(\u001a\u0002098\u0006@FX\u0086\u000e¢\u0006\u0015\n\u0005\b\u008d\u0001\u0010;\u001a\u0005\b\u008e\u0001\u0010=\"\u0005\b\u008f\u0001\u0010?R&\u0010\u0094\u0001\u001a\u0002098\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u0091\u0001\u0010;\u001a\u0005\b\u0092\u0001\u0010=\"\u0005\b\u0093\u0001\u0010?R$\u0010\u009b\u0001\u001a\n\u0012\u0005\u0012\u00030\u0096\u00010\u0095\u00018\u0006¢\u0006\u0010\n\u0006\b\u0097\u0001\u0010\u0098\u0001\u001a\u0006\b\u0099\u0001\u0010\u009a\u0001R#\u0010\u009e\u0001\u001a\t\u0012\u0004\u0012\u00020\u000f0\u0095\u00018\u0006¢\u0006\u0010\n\u0006\b\u009c\u0001\u0010\u0098\u0001\u001a\u0006\b\u009d\u0001\u0010\u009a\u0001R\u0016\u0010 \u0001\u001a\u0002098BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b\u009f\u0001\u0010=R\u0016\u0010¢\u0001\u001a\u0002098BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b¡\u0001\u0010=¨\u0006§\u0001"}, d2 = {"Lcom/revolut/core/ui_kit/internal/views/chart/LineChartView;", "Landroid/widget/FrameLayout;", "Lur0/a;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "left", "top", "right", "bottom", "", "setPadding", "(IIII)V", "Lcom/revolut/core/ui_kit/internal/views/chart/LineChartView$b;", "getChartDrawHolder", "()Lcom/revolut/core/ui_kit/internal/views/chart/LineChartView$b;", "Law0/x6;", "colorScheme", "setupGraphPaintHolders", "(Law0/x6;)V", "Landroid/util/SparseIntArray;", "a", "Landroid/util/SparseIntArray;", "getColorCache", "()Landroid/util/SparseIntArray;", "colorCache", "Lbt0/q;", "l", "Lbt0/q;", "getLineChartTrendViewInteractionDrawingDelegate", "()Lbt0/q;", "getLineChartTrendViewInteractionDrawingDelegate$annotations", "()V", "lineChartTrendViewInteractionDrawingDelegate", "", "value", "w", "F", "setAppearingAnimatedValue", "(F)V", "appearingAnimatedValue", "H", "I", "getGraphLineWidth", "()I", "setGraphLineWidth", "(I)V", "graphLineWidth", "Law0/x6;", "getColorScheme", "()Law0/x6;", "setColorScheme", "", "J", "Z", "isContextualColorSchemeEnabled", "()Z", "setContextualColorSchemeEnabled", "(Z)V", "Lts0/h0;", "K", "Lts0/h0;", "getFeatureConfig", "()Lts0/h0;", "setFeatureConfig", "(Lts0/h0;)V", "featureConfig", "L", "getApplyAlphaGradientAroundSelectedPoint", "setApplyAlphaGradientAroundSelectedPoint", "applyAlphaGradientAroundSelectedPoint", "Law0/z6;", "M", "Law0/z6;", "getLineChartViewParams", "()Law0/z6;", "setLineChartViewParams", "(Law0/z6;)V", "lineChartViewParams", "Lcom/revolut/core/ui_kit/internal/views/chart/h;", "N", "Lcom/revolut/core/ui_kit/internal/views/chart/h;", "getDrawingDelegateModel", "()Lcom/revolut/core/ui_kit/internal/views/chart/h;", "setDrawingDelegateModel", "(Lcom/revolut/core/ui_kit/internal/views/chart/h;)V", "drawingDelegateModel", "Law0/a7;", "O", "Law0/a7;", "getXAxis", "()Law0/a7;", "setXAxis", "(Law0/a7;)V", "xAxis", "Law0/b7;", "P", "Law0/b7;", "getYAxis", "()Law0/b7;", "setYAxis", "(Law0/b7;)V", "yAxis", "", "Law0/y6;", "Q", "Ljava/util/List;", "getChartItems", "()Ljava/util/List;", "setChartItems", "(Ljava/util/List;)V", "chartItems", "Luw0/i;", "R", "Luw0/i;", "getDataChangeAnimationRequest", "()Luw0/i;", "setDataChangeAnimationRequest", "(Luw0/i;)V", "dataChangeAnimationRequest", "Law0/u6;", "S", "Law0/u6;", "getBaseline", "()Law0/u6;", "setBaseline", "(Law0/u6;)V", "baseline", "Lht0/v;", "T", "Lht0/v;", "getInterpolationStrategy", "()Lht0/v;", "setInterpolationStrategy", "(Lht0/v;)V", "interpolationStrategy", "U", "getClipChartLineHorizontally", "setClipChartLineHorizontally", "clipChartLineHorizontally", "V", "getHoverLineIgnoresVerticalChartPadding", "setHoverLineIgnoresVerticalChartPadding", "hoverLineIgnoresVerticalChartPadding", "Lefm/i;", "Lbt0/h;", "W", "Lefm/i;", "getObserveScrollingStateChanges", "()Lefm/i;", "observeScrollingStateChanges", "a0", "getObserveClicks", "observeClicks", "getApplyGrid", "applyGrid", "getApplyPeaks", "applyPeaks", "Companion", "b", "d", "c", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class LineChartView extends FrameLayout implements ur0.a {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();
    public final p A;
    public final boolean B;
    public final boolean C;
    public final ct0.c D;
    public final it0.a E;
    public float[] F;
    public Object G;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public int graphLineWidth;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public x6 colorScheme;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    public boolean isContextualColorSchemeEnabled;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    public h0 featureConfig;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    public boolean applyAlphaGradientAroundSelectedPoint;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    public z6 lineChartViewParams;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    public h drawingDelegateModel;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    public a7 xAxis;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    public b7 yAxis;

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    public List chartItems;

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    public uw0.i dataChangeAnimationRequest;

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    public u6 baseline;

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    public v interpolationStrategy;

    /* JADX INFO: renamed from: U, reason: from kotlin metadata */
    public boolean clipChartLineHorizontally;

    /* JADX INFO: renamed from: V, reason: from kotlin metadata */
    public boolean hoverLineIgnoresVerticalChartPadding;
    public final dgm.e W;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final SparseIntArray colorCache;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final dgm.e f56701a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final nr0.e f56702b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final RectF f56703c;
    public final RectF d;
    public final Path e;
    public final Path f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final b f56704g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final DashPathEffect f56705h;
    public final DashPathEffect i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final float f56706j;
    public final dgm.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    public final q lineChartTrendViewInteractionDrawingDelegate;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final List f56708m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f56709n;
    public final int o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final TextPaint f56710p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final TextPaint f56711q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Paint f56712r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final DashPathEffect f56713s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f56714t;
    public v1 u;
    public bt0.h v;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    public float appearingAnimatedValue;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final ir0.g f56716x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final j f56717y;
    public final ir0.e z;

    /* JADX INFO: renamed from: com.revolut.core.ui_kit.internal.views.chart.LineChartView$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final RectF f56718a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final RectF f56719b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f56720c;
        public float d;
        public float e;
        public float f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public float f56721g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public d[] f56722h;
        public final RectF i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final Path f56723j;

        public b() {
            this(0);
        }

        public b(int i) {
            RectF drawRect = new RectF();
            RectF chartRect = new RectF();
            d[] graphPaintHolders = new d[2];
            for (int i2 = 0; i2 < 2; i2++) {
                graphPaintHolders[i2] = new d(0);
            }
            RectF baselineRect = new RectF();
            Path baselinePath = new Path();
            Path projectionPath = new Path();
            Intrinsics.checkNotNullParameter(drawRect, "drawRect");
            Intrinsics.checkNotNullParameter(chartRect, "chartRect");
            Intrinsics.checkNotNullParameter(graphPaintHolders, "graphPaintHolders");
            Intrinsics.checkNotNullParameter(baselineRect, "baselineRect");
            Intrinsics.checkNotNullParameter(baselinePath, "baselinePath");
            Intrinsics.checkNotNullParameter(projectionPath, "projectionPath");
            this.f56718a = drawRect;
            this.f56719b = chartRect;
            this.f56720c = BitmapDescriptorFactory.HUE_RED;
            this.d = BitmapDescriptorFactory.HUE_RED;
            this.e = BitmapDescriptorFactory.HUE_RED;
            this.f = BitmapDescriptorFactory.HUE_RED;
            this.f56721g = BitmapDescriptorFactory.HUE_RED;
            this.f56722h = graphPaintHolders;
            this.i = baselineRect;
            this.f56723j = baselinePath;
        }
    }

    public static abstract class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public dgm.e f56724a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public dgm.e f56725b;

        public void a() {
        }

        public void b(List items) {
            Intrinsics.checkNotNullParameter(items, "items");
        }

        public boolean c(LineChartView view, MotionEvent event) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(event, "event");
            return view.onTouchEvent(event);
        }

        public void d() {
        }

        public abstract void e(Canvas canvas, h hVar);

        public abstract boolean f(h hVar);
    }

    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Paint f56726a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Paint f56727b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f56728c;
        public float d;
        public boolean e;

        public d() {
            this(0);
        }

        public d(int i) {
            Paint linePaint = com.google.android.gms.internal.mlkit_vision_face.a.c(true);
            linePaint.setStyle(Paint.Style.STROKE);
            Paint backgroundPaint = new Paint();
            backgroundPaint.setAntiAlias(true);
            Intrinsics.checkNotNullParameter(linePaint, "linePaint");
            Intrinsics.checkNotNullParameter(backgroundPaint, "backgroundPaint");
            this.f56726a = linePaint;
            this.f56727b = backgroundPaint;
            this.f56728c = BitmapDescriptorFactory.HUE_RED;
            this.d = BitmapDescriptorFactory.HUE_RED;
            this.e = false;
        }
    }

    public static final class e implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj2, Object obj3) {
            return cim.b.b(Float.valueOf(((t6) obj2).f10542a), Float.valueOf(((t6) obj3).f10542a));
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LineChartView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static Unit a(LineChartView lineChartView, float f) {
        lineChartView.setAppearingAnimatedValue(f);
        return Unit.f186387a;
    }

    private final boolean getApplyGrid() {
        return this.B && this.featureConfig.f273870a;
    }

    private final boolean getApplyPeaks() {
        return this.B && this.featureConfig.f273871b && this.C;
    }

    public static /* synthetic */ void getLineChartTrendViewInteractionDrawingDelegate$annotations() {
    }

    private final void setAppearingAnimatedValue(float f) {
        this.appearingAnimatedValue = f;
        invalidate();
    }

    private final void setupGraphPaintHolders(x6 colorScheme) {
        LinearGradient linearGradient;
        DashPathEffect dashPathEffect;
        List list = colorScheme.f10606a;
        boolean zIsEmpty = list.isEmpty();
        int i = 0;
        b bVar = this.f56704g;
        if (zIsEmpty) {
            d[] dVarArr = new d[0];
            bVar.getClass();
            Intrinsics.checkNotNullParameter(dVarArr, "<set-?>");
            bVar.f56722h = dVarArr;
            return;
        }
        if (bVar.f56722h.length != list.size()) {
            d[] dVarArr2 = bVar.f56722h;
            int size = list.size();
            d[] dVarArr3 = new d[size];
            for (int i2 = 0; i2 < size; i2++) {
                d dVar = (d) kotlin.collections.d.W(i2, dVarArr2);
                if (dVar == null) {
                    dVar = new d(0);
                }
                dVarArr3[i2] = dVar;
            }
            Intrinsics.checkNotNullParameter(dVarArr3, "<set-?>");
            bVar.f56722h = dVarArr3;
        }
        d[] dVarArr4 = bVar.f56722h;
        int length = dVarArr4.length;
        int i3 = 0;
        while (i < length) {
            d dVar2 = dVarArr4[i];
            int i5 = i3 + 1;
            w6 w6Var = (w6) list.get(i3);
            int i6 = w6Var.f10589c;
            boolean z = w6Var.f;
            int i21 = w6Var.f10588b;
            DashPathEffect dashPathEffect2 = null;
            if (i6 == 0 || i21 == 0) {
                linearGradient = null;
            } else {
                RectF rectF = bVar.f56719b;
                linearGradient = new LinearGradient(BitmapDescriptorFactory.HUE_RED, rectF.top, BitmapDescriptorFactory.HUE_RED, rectF.bottom, d(i21), d(w6Var.f10589c), Shader.TileMode.CLAMP);
            }
            Paint paint = dVar2.f56726a;
            paint.setStrokeWidth(this.graphLineWidth);
            paint.setColor(d(w6Var.f10587a));
            if (z) {
                int i22 = j0.f273878b[w6Var.f10590g.ordinal()];
                if (i22 == 1) {
                    dashPathEffect = this.f56705h;
                } else {
                    if (i22 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    dashPathEffect = this.i;
                }
                dashPathEffect2 = dashPathEffect;
            }
            paint.setPathEffect(dashPathEffect2);
            dVar2.f56727b.setShader(linearGradient);
            dVar2.f56728c = e(w6Var.d);
            dVar2.d = e(w6Var.e);
            dVar2.e = !z;
            i++;
            i3 = i5;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v12, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v12, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v24, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r3v31, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v59, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v20, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void b() {
        int iMax;
        int iMax2;
        float fK;
        Object arrayList;
        List<t6> list;
        float fK2;
        t6 t6Var;
        t6 t6Var2;
        List list2;
        float f = this.f56709n;
        b bVar = this.f56704g;
        bVar.f56720c = f;
        RectF rectF = bVar.f56719b;
        RectF rectF2 = bVar.f56718a;
        rectF2.left = getPaddingLeft();
        rectF2.right = getWidth() - getPaddingRight();
        rectF2.top = getPaddingTop();
        rectF2.bottom = getHeight() - getPaddingBottom();
        a7 a7Var = this.xAxis;
        TextPaint textPaint = this.f56710p;
        nr0.e eVar = this.f56702b;
        if (a7Var != null) {
            Iterator it8 = a7Var.f10233a.iterator();
            iMax = 0;
            while (it8.hasNext()) {
                iMax = Math.max(eVar.b(((t6) it8.next()).f10543b, textPaint).getHeight(), iMax);
            }
        } else {
            iMax = 0;
        }
        b7 b7Var = this.yAxis;
        TextPaint textPaint2 = this.f56711q;
        if (b7Var == null || (list2 = b7Var.f10249a) == null) {
            iMax2 = 0;
        } else {
            Iterator it9 = list2.iterator();
            iMax2 = 0;
            while (it9.hasNext()) {
                iMax2 = Math.max(eVar.b(((t6) it9.next()).f10543b, textPaint2).getWidth(), iMax2);
            }
        }
        u6 u6Var = this.baseline;
        if (u6Var != null) {
            Clause clause = u6Var.f10563b;
            iMax2 = Math.max(clause != null ? eVar.b(clause, textPaint2).getWidth() : 0, iMax2);
        }
        a7 a7Var2 = this.xAxis;
        float fHeight = BitmapDescriptorFactory.HUE_RED;
        float width = (a7Var2 == null || (t6Var2 = (t6) d0.d0(a7Var2.f10233a)) == null) ? 0.0f : eVar.b(t6Var2.f10543b, textPaint).getWidth() / 2.0f;
        a7 a7Var3 = this.xAxis;
        float width2 = (a7Var3 == null || (t6Var = (t6) d0.o0(a7Var3.f10233a)) == null) ? 0.0f : eVar.b(t6Var.f10543b, textPaint).getWidth() / 2.0f;
        rectF.top = rectF2.top;
        float f4 = rectF2.bottom;
        if (iMax != 0) {
            Intrinsics.checkNotNullExpressionValue(getContext(), "getContext(...)");
            fK = iMax + kli.a.k(r12, this.lineChartViewParams.f10643b);
        } else {
            fK = 0.0f;
        }
        rectF.bottom = f4 - fK;
        rectF.left = rectF2.left + width;
        int i = j0.f273877a[this.featureConfig.d.ordinal()];
        if (i == 1) {
            rectF.right = rectF2.right - width2;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            float f5 = rectF2.right - width2;
            if (iMax2 != 0) {
                Intrinsics.checkNotNullExpressionValue(getContext(), "getContext(...)");
                fK2 = iMax2 + kli.a.k(r5, this.lineChartViewParams.f10642a);
            } else {
                fK2 = 0.0f;
            }
            rectF.right = f5 - fK2;
        }
        float f6 = rectF.top;
        float f32 = this.f56709n;
        rectF.top = f6 + f32;
        rectF.bottom -= f32;
        if (this.clipChartLineHorizontally) {
            rectF.left = rectF.left;
            rectF.right = rectF.right;
        } else {
            rectF.left = Math.max(rectF.left, f32);
            rectF.right = Math.min(rectF.right, getWidth() - this.f56709n);
        }
        float fMin = Float.POSITIVE_INFINITY;
        float fMax = Float.NEGATIVE_INFINITY;
        float fMax2 = Float.NEGATIVE_INFINITY;
        float fMin2 = Float.POSITIVE_INFINITY;
        for (y6 y6Var : this.chartItems) {
            float f35 = y6Var.f10631b;
            float f36 = y6Var.f10630a;
            fMax = Math.max(f35, fMax);
            fMin = Math.min(y6Var.f10631b, fMin);
            fMax2 = Math.max(f36, fMax2);
            fMin2 = Math.min(f36, fMin2);
        }
        b7 b7Var2 = this.yAxis;
        if (b7Var2 != null && (list = b7Var2.f10249a) != null) {
            for (t6 t6Var3 : list) {
                fMax = Math.max(t6Var3.f10542a, fMax);
                fMin = Math.min(t6Var3.f10542a, fMin);
            }
        }
        a7 a7Var4 = this.xAxis;
        if (a7Var4 != null) {
            for (t6 t6Var4 : a7Var4.f10233a) {
                fMax2 = Math.max(t6Var4.f10542a, fMax2);
                fMin2 = Math.min(t6Var4.f10542a, fMin2);
            }
        }
        float f37 = fMax2;
        u6 u6Var2 = this.baseline;
        if (u6Var2 != null) {
            float f41 = u6Var2.f10562a;
            fMax = Math.max(f41, fMax);
            fMin = Math.min(f41, fMin);
        }
        bVar.f = fMin2;
        bVar.f56721g = fMin;
        bVar.e = f37 == fMin2 ? 0.0f : rectF.width() / (f37 - fMin2);
        if (fMax != fMin) {
            fHeight = rectF.height() / (fMax - fMin);
        }
        bVar.d = fHeight;
        Path path = this.e;
        path.reset();
        Path path2 = this.f;
        path2.reset();
        if (!this.chartItems.isEmpty()) {
            v vVar = this.interpolationStrategy;
            List<y6> list3 = this.chartItems;
            ArrayList arrayList2 = new ArrayList(w.t(list3, 10));
            for (y6 y6Var2 : list3) {
                arrayList2.add(new PointF(e(y6Var2.f10630a), f(y6Var2.f10631b)));
            }
            List listA = vVar.a(arrayList2);
            cp5.c.c(listA, path, 0, zhm.v.j(listA));
            path2.set(path);
            path2.lineTo(rectF.right, rectF.bottom);
            path2.lineTo(rectF.left, rectF.bottom);
            path2.close();
        }
        if (!getApplyPeaks() || this.chartItems.size() < 2) {
            arrayList = f0.f322471a;
        } else {
            if (this.F.length != this.chartItems.size()) {
                this.F = new float[this.chartItems.size()];
            }
            List list4 = this.chartItems;
            int size = list4.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.F[i2] = ((y6) list4.get(i2)).f10631b;
            }
            float[] fArr = this.F;
            this.E.getClass();
            Set setA = it0.a.a(fArr);
            arrayList = new ArrayList(w.t(setA, 10));
            Iterator it10 = setA.iterator();
            while (it10.hasNext()) {
                int iIntValue = ((Number) it10.next()).intValue();
                arrayList.add(new PointF(e(((y6) this.chartItems.get(iIntValue)).f10630a) - rectF.left, f(((y6) this.chartItems.get(iIntValue)).f10631b) - rectF.bottom));
            }
        }
        this.G = arrayList;
        v1 v1Var = this.u;
        x6 x6Var = this.colorScheme;
        if (this.isContextualColorSchemeEnabled && v1Var != null) {
            x6Var = new x6(u.c(new w6(v1Var.a(), 0, 0, fMin2, f37, false, 70)));
        }
        setupGraphPaintHolders(x6Var);
        this.f56714t = false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void c(Canvas canvas) {
        List list;
        List list2;
        RectF rectF = this.f56703c;
        rectF.set(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
        RectF rectF2 = this.d;
        rectF2.set(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
        b7 b7Var = this.yAxis;
        if (b7Var == null || (list = b7Var.f10249a) == null) {
            return;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            t6 t6Var = (t6) list.get(i);
            ?? r2 = t6Var.f10543b;
            float f = t6Var.f10542a;
            nr0.e eVar = this.f56702b;
            TextPaint textPaint = this.f56711q;
            Layout layoutB = eVar.b(r2, textPaint);
            b bVar = this.f56704g;
            float f4 = bVar.f56718a.right;
            RectF rectF3 = bVar.i;
            Style d5 = ((fa) t6Var.f10543b).getF();
            Custom custom = d5 instanceof Custom ? (Custom) d5 : null;
            Custom.Color color = custom != null ? custom.f57757a : null;
            Custom.Color.Solid solid = color instanceof Custom.Color.Solid ? (Custom.Color.Solid) color : null;
            Integer numValueOf = solid != null ? Integer.valueOf(solid.f57767a) : null;
            textPaint.setColor(numValueOf != null ? d(numValueOf.intValue()) : d(R$attr.uikit_colorGreyTone50));
            g0 g0Var = this.featureConfig.d;
            int[] iArr = j0.f273877a;
            int i2 = iArr[g0Var.ordinal()];
            if (i2 == 1) {
                rectF.left = (f4 - layoutB.getWidth()) - 4.0f;
                b7 b7Var2 = this.yAxis;
                float f5 = (t6Var == ((b7Var2 == null || (list2 = b7Var2.f10249a) == null) ? null : (t6) d0.o0(list2)) ? f(f) + (layoutB.getLineBottom(0) / 2) : f(f) - (layoutB.getLineBottom(0) / 2)) - 2.0f;
                rectF.top = f5;
                rectF.bottom = f5 + layoutB.getHeight() + 4.0f;
                rectF.right = f4;
            } else {
                if (i2 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                rectF.left = f4 - layoutB.getWidth();
                float f6 = f(f) - (layoutB.getLineBottom(0) / 2);
                rectF.top = f6;
                rectF.bottom = f6 + layoutB.getHeight();
                rectF.right = f4;
            }
            if (!gj7.b.t(rectF, rectF2) && !gj7.b.t(rectF, rectF3)) {
                int i3 = iArr[this.featureConfig.d.ordinal()];
                if (i3 == 1) {
                    this.A.c(canvas, m.EXTREME, layoutB, textPaint, rectF);
                } else {
                    if (i3 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    a.a.i(layoutB, canvas, f4, rectF.top);
                }
                rectF2.set(rectF);
            }
        }
    }

    public final int d(int i) {
        SparseIntArray sparseIntArray = this.colorCache;
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

    public final float e(float f) {
        b bVar = this.f56704g;
        return ((f - bVar.f) * bVar.e) + bVar.f56719b.left;
    }

    public final float f(float f) {
        b bVar = this.f56704g;
        return bVar.f56719b.bottom - ((f - bVar.f56721g) * bVar.d);
    }

    public final boolean getApplyAlphaGradientAroundSelectedPoint() {
        return this.applyAlphaGradientAroundSelectedPoint;
    }

    @Override // android.view.View
    public final u6 getBaseline() {
        return this.baseline;
    }

    @NotNull
    /* JADX INFO: renamed from: getChartDrawHolder, reason: from getter */
    public final b getF56704g() {
        return this.f56704g;
    }

    @NotNull
    public final List<y6> getChartItems() {
        return this.chartItems;
    }

    public final boolean getClipChartLineHorizontally() {
        return this.clipChartLineHorizontally;
    }

    @NotNull
    public final SparseIntArray getColorCache() {
        return this.colorCache;
    }

    @NotNull
    public final x6 getColorScheme() {
        return this.colorScheme;
    }

    public final uw0.i getDataChangeAnimationRequest() {
        return this.dataChangeAnimationRequest;
    }

    public final h getDrawingDelegateModel() {
        return this.drawingDelegateModel;
    }

    @NotNull
    public final h0 getFeatureConfig() {
        return this.featureConfig;
    }

    public final int getGraphLineWidth() {
        return this.graphLineWidth;
    }

    public final boolean getHoverLineIgnoresVerticalChartPadding() {
        return this.hoverLineIgnoresVerticalChartPadding;
    }

    @NotNull
    public final v getInterpolationStrategy() {
        return this.interpolationStrategy;
    }

    @NotNull
    public final q getLineChartTrendViewInteractionDrawingDelegate() {
        return this.lineChartTrendViewInteractionDrawingDelegate;
    }

    @NotNull
    public final z6 getLineChartViewParams() {
        return this.lineChartViewParams;
    }

    @NotNull
    public final efm.i getObserveClicks() {
        return this.f56701a0;
    }

    @NotNull
    public final efm.i getObserveScrollingStateChanges() {
        return this.W;
    }

    public final a7 getXAxis() {
        return this.xAxis;
    }

    public final b7 getYAxis() {
        return this.yAxis;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        List list = this.f56708m;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (((c) obj2).f(this.drawingDelegateModel)) {
                arrayList.add(obj2);
            }
        }
        Iterator it8 = arrayList.iterator();
        while (it8.hasNext()) {
            ((c) it8.next()).a();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        List list = this.f56708m;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (((c) obj2).f(this.drawingDelegateModel)) {
                arrayList.add(obj2);
            }
        }
        Iterator it8 = arrayList.iterator();
        while (it8.hasNext()) {
            ((c) it8.next()).d();
        }
        super.onDetachedFromWindow();
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0114  */
    /* JADX WARN: Type inference failed for: r4v33, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r6v4, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onDraw(android.graphics.Canvas r20) {
        /*
            Method dump skipped, instruction units count: 600
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.core.ui_kit.internal.views.chart.LineChartView.onDraw(android.graphics.Canvas):void");
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
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i5) {
        super.onSizeChanged(i, i2, i3, i5);
        b();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent event) {
        Object next;
        Intrinsics.checkNotNullParameter(event, "event");
        Iterator it8 = this.f56708m.iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (((c) next).f(this.drawingDelegateModel)) {
                break;
            }
        }
        c cVar = (c) next;
        if (cVar != null && cVar.c(this, event)) {
            return true;
        }
        return super.onTouchEvent(event);
    }

    @Override // ur0.a
    public final void r(v1 colorScheme, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(colorScheme, "colorScheme");
        this.u = colorScheme;
        this.f56714t = true;
        int iD = d(colorScheme.a());
        q qVar = this.lineChartTrendViewInteractionDrawingDelegate;
        qVar.f18251p = qVar.i(iD);
        invalidate();
    }

    public final void setApplyAlphaGradientAroundSelectedPoint(boolean z) {
        this.applyAlphaGradientAroundSelectedPoint = z;
        this.f56714t = true;
        invalidate();
    }

    public final void setBaseline(u6 u6Var) {
        TextPaint textPaint = this.f56711q;
        nr0.e eVar = this.f56702b;
        if (u6Var != null) {
            eVar.f(u6Var.f10563b, textPaint);
        }
        u6 u6Var2 = this.baseline;
        if (u6Var2 != null) {
            eVar.e(u6Var2.f10563b, textPaint);
        }
        this.baseline = u6Var;
        this.f56714t = true;
        invalidate();
    }

    public final void setChartItems(@NotNull List<y6> value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.chartItems = value;
        this.f56714t = true;
        invalidate();
        this.f56717y.a(this.dataChangeAnimationRequest);
    }

    public final void setClipChartLineHorizontally(boolean z) {
        this.clipChartLineHorizontally = z;
        this.f56714t = true;
        invalidate();
    }

    public final void setColorScheme(@NotNull x6 value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.colorScheme = value;
        this.f56714t = true;
        invalidate();
    }

    public final void setContextualColorSchemeEnabled(boolean z) {
        this.isContextualColorSchemeEnabled = z;
        this.f56714t = true;
        invalidate();
    }

    public final void setDataChangeAnimationRequest(uw0.i iVar) {
        if (Intrinsics.f(this.dataChangeAnimationRequest, iVar)) {
            return;
        }
        this.dataChangeAnimationRequest = iVar;
        if (this.chartItems.isEmpty()) {
            return;
        }
        this.f56717y.a(iVar);
    }

    public final void setDrawingDelegateModel(h hVar) {
        this.drawingDelegateModel = hVar;
        this.f56714t = true;
        List list = this.f56708m;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (((c) obj2).f(this.drawingDelegateModel)) {
                arrayList.add(obj2);
            }
        }
        Iterator it8 = arrayList.iterator();
        while (it8.hasNext()) {
            ((c) it8.next()).b(this.chartItems);
        }
        invalidate();
    }

    public final void setFeatureConfig(@NotNull h0 value) {
        Intrinsics.checkNotNullParameter(value, "value");
        if (Intrinsics.f(this.featureConfig, value)) {
            return;
        }
        this.featureConfig = value;
        this.f56714t = true;
        invalidate();
    }

    public final void setGraphLineWidth(int i) {
        this.graphLineWidth = i;
        this.f56709n = i / 2.0f;
        invalidate();
    }

    public final void setHoverLineIgnoresVerticalChartPadding(boolean z) {
        this.hoverLineIgnoresVerticalChartPadding = z;
    }

    public final void setInterpolationStrategy(@NotNull v value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.interpolationStrategy = value;
        this.f56714t = true;
        invalidate();
    }

    public final void setLineChartViewParams(@NotNull z6 value) {
        Intrinsics.checkNotNullParameter(value, "value");
        int i = value.f10644c;
        int i2 = value.d;
        if (i != this.lineChartViewParams.f10644c) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            l.d(this.f56710p, context, value.f10644c);
        }
        if (i2 != this.lineChartViewParams.d) {
            Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            l.d(this.f56711q, context2, i2);
        }
        this.lineChartViewParams = value;
        this.f56714t = true;
        invalidate();
    }

    @Override // android.view.View
    public void setPadding(int left, int top, int right, int bottom) {
        this.f56714t = true;
        super.setPadding(left, top, right, bottom);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v3, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v7, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void setXAxis(a7 a7Var) {
        TextPaint textPaint = this.f56710p;
        nr0.e eVar = this.f56702b;
        if (a7Var != null) {
            Iterator it8 = a7Var.f10233a.iterator();
            while (it8.hasNext()) {
                eVar.f(((t6) it8.next()).f10543b, textPaint);
            }
        }
        a7 a7Var2 = this.xAxis;
        if (a7Var2 != null) {
            Iterator it9 = a7Var2.f10233a.iterator();
            while (it9.hasNext()) {
                eVar.e(((t6) it9.next()).f10543b, textPaint);
            }
        }
        this.xAxis = a7Var;
        this.f56714t = true;
        invalidate();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v3, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v7, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void setYAxis(b7 b7Var) {
        List list;
        List list2;
        if (b7Var != null) {
            List items = d0.P0(b7Var.f10249a, new e());
            Intrinsics.checkNotNullParameter(items, "items");
            b7Var = new b7(items);
        }
        TextPaint textPaint = this.f56711q;
        nr0.e eVar = this.f56702b;
        if (b7Var != null && (list2 = b7Var.f10249a) != null) {
            Iterator it8 = list2.iterator();
            while (it8.hasNext()) {
                eVar.f(((t6) it8.next()).f10543b, textPaint);
            }
        }
        b7 b7Var2 = this.yAxis;
        if (b7Var2 != null && (list = b7Var2.f10249a) != null) {
            Iterator it9 = list.iterator();
            while (it9.hasNext()) {
                eVar.e(((t6) it9.next()).f10543b, textPaint);
            }
        }
        this.yAxis = b7Var;
        this.f56714t = true;
        invalidate();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LineChartView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
    public LineChartView(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.colorCache = new SparseIntArray();
        this.f56702b = new nr0.e(this, new t(this, 17));
        this.f56703c = new RectF();
        this.d = new RectF();
        this.e = new Path();
        this.f = new Path();
        this.f56704g = new b(0);
        this.f56705h = new DashPathEffect(new float[]{kli.a.k(context, 4.0f), kli.a.k(context, 4.0f)}, BitmapDescriptorFactory.HUE_RED);
        this.i = new DashPathEffect(new float[]{kli.a.k(context, 1.0f), kli.a.k(context, 3.0f)}, BitmapDescriptorFactory.HUE_RED);
        this.f56706j = kli.a.k(context, 32.0f);
        dgm.e subject = new dgm.e();
        Intrinsics.checkNotNullExpressionValue(subject, "create(...)");
        this.k = subject;
        dgm.e subject2 = new dgm.e();
        Intrinsics.checkNotNullExpressionValue(subject2, "create(...)");
        q qVar = new q(this);
        this.lineChartTrendViewInteractionDrawingDelegate = qVar;
        Intrinsics.checkNotNullParameter(subject, "subject");
        qVar.f56724a = subject;
        Intrinsics.checkNotNullParameter(subject2, "subject");
        qVar.f56725b = subject2;
        this.f56708m = u.c(qVar);
        this.f56709n = kli.a.k(context, 2.0f) / 2.0f;
        this.o = kli.a.k(context, 2.0f);
        TextPaint textPaint = new TextPaint();
        textPaint.setTextAlign(Paint.Align.CENTER);
        textPaint.setAntiAlias(true);
        l.d(textPaint, context, R$attr.internal_textAppearanceBody2);
        textPaint.setColor(d(R$attr.uikit_colorGreyTone50));
        this.f56710p = textPaint;
        TextPaint textPaint2 = new TextPaint();
        textPaint2.setTextAlign(Paint.Align.RIGHT);
        textPaint2.setAntiAlias(true);
        l.d(textPaint2, context, R$attr.internal_textAppearanceBody2);
        this.f56711q = textPaint2;
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.FILL);
        paint.setStrokeWidth(kli.a.k(context, 1.0f));
        paint.setAntiAlias(true);
        this.f56712r = paint;
        this.f56713s = new DashPathEffect(new float[]{kli.a.k(context, 2.0f), kli.a.k(context, 5.0f)}, BitmapDescriptorFactory.HUE_RED);
        this.f56714t = true;
        this.v = h.a.f18234a;
        this.appearingAnimatedValue = 1.0f;
        ir0.g gVarA = ebm.a.a(this, new Paint(paint));
        this.f56716x = gVarA;
        this.f56717y = new j(this, gVarA, hx7.q.b(new i0(this, 0)), new lm.d(13));
        this.z = new ir0.e(this, gVarA);
        this.A = new p(context);
        this.B = ((Boolean) jo0.g.F.getValue()).booleanValue();
        this.C = kli.a.q(context);
        this.D = new ct0.c(context);
        this.E = new it0.a();
        this.F = new float[0];
        f0 f0Var = f0.f322471a;
        this.G = f0Var;
        this.graphLineWidth = kli.a.k(context, 2.0f);
        this.colorScheme = new x6(f0Var);
        this.isContextualColorSchemeEnabled = true;
        this.featureConfig = new h0(null, null, 15);
        this.lineChartViewParams = new z6(0, 0, 15);
        this.chartItems = f0Var;
        this.interpolationStrategy = new ht0.u();
        this.W = subject;
        this.f56701a0 = subject2;
        setWillNotDraw(false);
        subject.m(new m0(new i0(this, 1), 28), mfm.f.e, mfm.f.f205043c, e1.INSTANCE);
    }

    public /* synthetic */ LineChartView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
