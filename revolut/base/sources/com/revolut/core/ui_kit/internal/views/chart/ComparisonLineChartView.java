package com.revolut.core.ui_kit.internal.views.chart;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Handler;
import android.os.Looper;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.ViewCompat;
import au0.l5;
import aw0.b2;
import aw0.c2;
import aw0.e2;
import aw0.f2;
import aw0.k2;
import aw0.m2;
import aw0.n2;
import aw0.r1;
import aw0.x1;
import aw0.y1;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.animation.ArgbEvaluatorCompat;
import com.onfido.android.sdk.capture.ui.camera.CapturePresenter;
import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_resources.R$attr;
import ct0.l;
import ct0.p;
import ht0.b0;
import ht0.k;
import ht0.m;
import iv0.j;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import mx0.w5;
import org.bouncycastle.asn1.eac.CertificateBody;
import org.jetbrains.annotations.NotNull;
import th9.t;
import ts0.n;
import ts0.o;
import zhm.d0;
import zhm.f0;
import zhm.v;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\b\u0007\u0018\u0000 K2\u00020\u0001:\u0006LM\u001c\u0014N\fB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR*\u0010\u0012\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R.\u0010\u001a\u001a\u0004\u0018\u00010\u00132\b\u0010\u000b\u001a\u0004\u0018\u00010\u00138\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R*\u0010\"\u001a\u00020\u001b2\u0006\u0010\u000b\u001a\u00020\u001b8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R*\u0010*\u001a\u00020#2\u0006\u0010\u000b\u001a\u00020#8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R$\u00100\u001a\u00020+2\u0006\u0010\u000b\u001a\u00020+8\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b,\u0010-\"\u0004\b.\u0010/R*\u00108\u001a\u0002012\u0006\u0010\u000b\u001a\u0002018\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b2\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u00107R$\u0010>\u001a\u0002092\u0006\u0010\u000b\u001a\u0002098\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b:\u0010;\"\u0004\b<\u0010=R(\u0010D\u001a\u0004\u0018\u00010?2\b\u0010\u000b\u001a\u0004\u0018\u00010?8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR\u0014\u0010H\u001a\u00020E8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bF\u0010GR\u0014\u0010J\u001a\u00020E8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bI\u0010G¨\u0006O"}, d2 = {"Lcom/revolut/core/ui_kit/internal/views/chart/ComparisonLineChartView;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Law0/y1;", "value", "a", "Law0/y1;", "getData", "()Law0/y1;", "setData", "(Law0/y1;)V", "data", "Luw0/i;", "b", "Luw0/i;", "getDataChangeAnimationRequest", "()Luw0/i;", "setDataChangeAnimationRequest", "(Luw0/i;)V", "dataChangeAnimationRequest", "Law0/n2;", "c", "Law0/n2;", "getStyle", "()Law0/n2;", "setStyle", "(Law0/n2;)V", "style", "Lts0/n;", "e", "Lts0/n;", "getFeatureConfig", "()Lts0/n;", "setFeatureConfig", "(Lts0/n;)V", "featureConfig", "Lcom/revolut/core/ui_kit/internal/views/chart/ComparisonLineChartView$b;", "f", "Lcom/revolut/core/ui_kit/internal/views/chart/ComparisonLineChartView$b;", "setConfig", "(Lcom/revolut/core/ui_kit/internal/views/chart/ComparisonLineChartView$b;)V", "config", "Law0/x1;", "P", "Law0/x1;", "getHeightMode", "()Law0/x1;", "setHeightMode", "(Law0/x1;)V", "heightMode", "", "R", "F", "setAppearingAnimatedValue", "(F)V", "appearingAnimatedValue", "Law0/r1;", "getPopupContent", "()Law0/r1;", "setPopupContent", "(Law0/r1;)V", "popupContent", "", "getApplyGrid", "()Z", "applyGrid", "getApplyPeaks", "applyPeaks", "Companion", "ts0/p", "com/revolut/core/ui_kit/internal/views/chart/d", "ts0/o", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ComparisonLineChartView extends View {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();
    public Clause A;
    public float B;
    public float C;
    public float D;
    public float E;
    public int F;
    public ValueAnimator G;
    public float H;
    public ValueAnimator I;
    public int J;
    public int K;
    public final ArgbEvaluatorCompat L;
    public final d M;
    public final GestureDetector N;
    public final ihm.f O;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    public x1 heightMode;
    public final bt0.g Q;

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    public float appearingAnimatedValue;
    public final ir0.g S;
    public final j T;
    public final ir0.e U;
    public final boolean V;
    public final boolean W;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public y1 data;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final ir0.b f56615a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public uw0.i dataChangeAnimationRequest;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final ct0.c f56617b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public n2 style;
    public final p c0;
    public r1 d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final ct0.j f56619d0;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public n featureConfig;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final l f56620e0;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public b config;
    public final it0.a f0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final c f56621g;
    public float[] g0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f56622h;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public final k f56623h0;
    public final float i;
    public final m i0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final float f56624j;
    public final RectF j0;
    public final float k;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public final o f56625k0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final float f56626l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final float f56627m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final float f56628n;
    public final float o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final float f56629p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final fd0.d f56630q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final nr0.e f56631r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final TextPaint f56632s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Paint f56633t;
    public final Paint u;
    public final Paint v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Paint f56634w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Paint f56635x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final Paint f56636y;
    public final List z;

    /* JADX INFO: renamed from: com.revolut.core.ui_kit.internal.views.chart.ComparisonLineChartView$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Color f56637a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Color f56638b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Color f56639c;
        public final Color d;
        public final Color e;
        public final Color f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final Color f56640g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final Color f56641h;
        public final Color i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final Color f56642j;
        public final Color k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final Color f56643l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final Color f56644m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final boolean f56645n;
        public final boolean o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public final e2 f56646p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public final boolean f56647q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public final boolean f56648r;

        public b() {
            this(0);
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof b)) {
                return false;
            }
            b bVar = (b) obj2;
            return Intrinsics.f(this.f56637a, bVar.f56637a) && Intrinsics.f(this.f56638b, bVar.f56638b) && Intrinsics.f(this.f56639c, bVar.f56639c) && Intrinsics.f(this.d, bVar.d) && Intrinsics.f(this.e, bVar.e) && Intrinsics.f(this.f, bVar.f) && Intrinsics.f(this.f56640g, bVar.f56640g) && Intrinsics.f(this.f56641h, bVar.f56641h) && Intrinsics.f(this.i, bVar.i) && Intrinsics.f(this.f56642j, bVar.f56642j) && Intrinsics.f(this.k, bVar.k) && Intrinsics.f(this.f56643l, bVar.f56643l) && Intrinsics.f(this.f56644m, bVar.f56644m) && this.f56645n == bVar.f56645n && this.o == bVar.o && this.f56646p == bVar.f56646p && this.f56647q == bVar.f56647q && this.f56648r == bVar.f56648r;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f56648r) + j6.a.c((this.f56646p.hashCode() + j6.a.c(j6.a.c(ehe.n.d(this.f56644m, ehe.n.d(this.f56643l, ehe.n.d(this.k, ehe.n.d(this.f56642j, ehe.n.d(this.i, ehe.n.d(this.f56641h, ehe.n.d(this.f56640g, ehe.n.d(this.f, ehe.n.d(this.e, ehe.n.d(this.d, ehe.n.d(this.f56639c, ehe.n.d(this.f56638b, this.f56637a.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31, this.f56645n), 31, this.o)) * 31, 31, this.f56647q);
        }

        public b(Color currentLineColor, Color previousLineColor, Color axisTextColor, Color gradientEndColor, Color verticalScrubLineColor, Color horizontalDottedLineColor, Color positiveColor, Color positiveTranslucentColor, Color negativeColor, Color negativeTranslucentColor, Color neutralColor, Color neutralTranslucentColor, Color popupBackgroundColor, boolean z, boolean z3, e2 colorMode, boolean z4, boolean z6) {
            Intrinsics.checkNotNullParameter(currentLineColor, "currentLineColor");
            Intrinsics.checkNotNullParameter(previousLineColor, "previousLineColor");
            Intrinsics.checkNotNullParameter(axisTextColor, "axisTextColor");
            Intrinsics.checkNotNullParameter(gradientEndColor, "gradientEndColor");
            Intrinsics.checkNotNullParameter(verticalScrubLineColor, "verticalScrubLineColor");
            Intrinsics.checkNotNullParameter(horizontalDottedLineColor, "horizontalDottedLineColor");
            Intrinsics.checkNotNullParameter(positiveColor, "positiveColor");
            Intrinsics.checkNotNullParameter(positiveTranslucentColor, "positiveTranslucentColor");
            Intrinsics.checkNotNullParameter(negativeColor, "negativeColor");
            Intrinsics.checkNotNullParameter(negativeTranslucentColor, "negativeTranslucentColor");
            Intrinsics.checkNotNullParameter(neutralColor, "neutralColor");
            Intrinsics.checkNotNullParameter(neutralTranslucentColor, "neutralTranslucentColor");
            Intrinsics.checkNotNullParameter(popupBackgroundColor, "popupBackgroundColor");
            Intrinsics.checkNotNullParameter(colorMode, "colorMode");
            this.f56637a = currentLineColor;
            this.f56638b = previousLineColor;
            this.f56639c = axisTextColor;
            this.d = gradientEndColor;
            this.e = verticalScrubLineColor;
            this.f = horizontalDottedLineColor;
            this.f56640g = positiveColor;
            this.f56641h = positiveTranslucentColor;
            this.i = negativeColor;
            this.f56642j = negativeTranslucentColor;
            this.k = neutralColor;
            this.f56643l = neutralTranslucentColor;
            this.f56644m = popupBackgroundColor;
            this.f56645n = z;
            this.o = z3;
            this.f56646p = colorMode;
            this.f56647q = z4;
            this.f56648r = z6;
        }

        public /* synthetic */ b(int i) {
            int i2 = R$attr.uikit_colorAccentNeutral;
            Color.Solid solid = new Color.Solid(i2);
            int i3 = R$attr.uikit_colorAccentNeutral_20;
            this(solid, new Color.Solid(i3), new Color.Solid(R$attr.uikit_colorGreyTone50), new Color.Solid(R$attr.uikit_colorTransparent), new Color.Solid(R$attr.uikit_colorAccentNeutral_50), new Color.Solid(R$attr.uikit_colorForeground_50), new Color.Solid(R$attr.uikit_colorPerformancePositive), new Color.Solid(R$attr.uikit_colorPerformancePositive_50), new Color.Solid(R$attr.uikit_colorPerformanceNegative), new Color.Solid(R$attr.uikit_colorPerformanceNegative_50), new Color.Solid(i2), new Color.Solid(i3), new Color.Solid(R$attr.uikit_colorPopoverBackground), true, true, e2.MONOCHROMATIC, false, false);
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ArrayList f56649a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ArrayList f56650b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Path f56651c;
        public final PathMeasure d;
        public final Path e;
        public final PathMeasure f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final Path f56652g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final Path f56653h;
        public final Path i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final Path f56654j;
        public float k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public float f56655l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public float f56656m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public com.revolut.core.ui_kit.internal.views.chart.b f56657n;
        public boolean o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public bt0.b f56658p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public List f56659q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public com.revolut.core.ui_kit.internal.views.chart.c f56660r;

        public c() {
            this(0);
        }

        public c(int i) {
            ArrayList xAxisLabel = new ArrayList();
            ArrayList yAxisLabel = new ArrayList();
            Path currentLinePath = new Path();
            PathMeasure currentLinePathMeasure = new PathMeasure(currentLinePath, false);
            Path previousLinePath = new Path();
            PathMeasure previousLinePathMeasure = new PathMeasure(previousLinePath, false);
            Path supportLinePath = new Path();
            Path gradientPath = new Path();
            Path horizontalDottedPath = new Path();
            Path verticalScrubPath = new Path();
            f0 peakPositions = f0.f322471a;
            Intrinsics.checkNotNullParameter(xAxisLabel, "xAxisLabel");
            Intrinsics.checkNotNullParameter(yAxisLabel, "yAxisLabel");
            Intrinsics.checkNotNullParameter(currentLinePath, "currentLinePath");
            Intrinsics.checkNotNullParameter(currentLinePathMeasure, "currentLinePathMeasure");
            Intrinsics.checkNotNullParameter(previousLinePath, "previousLinePath");
            Intrinsics.checkNotNullParameter(previousLinePathMeasure, "previousLinePathMeasure");
            Intrinsics.checkNotNullParameter(supportLinePath, "supportLinePath");
            Intrinsics.checkNotNullParameter(gradientPath, "gradientPath");
            Intrinsics.checkNotNullParameter(horizontalDottedPath, "horizontalDottedPath");
            Intrinsics.checkNotNullParameter(verticalScrubPath, "verticalScrubPath");
            Intrinsics.checkNotNullParameter(peakPositions, "peakPositions");
            this.f56649a = xAxisLabel;
            this.f56650b = yAxisLabel;
            this.f56651c = currentLinePath;
            this.d = currentLinePathMeasure;
            this.e = previousLinePath;
            this.f = previousLinePathMeasure;
            this.f56652g = supportLinePath;
            this.f56653h = gradientPath;
            this.i = horizontalDottedPath;
            this.f56654j = verticalScrubPath;
            this.k = -1.0f;
            this.f56655l = -1.0f;
            this.f56656m = -1.0f;
            this.f56657n = null;
            this.o = false;
            this.f56658p = null;
            this.f56659q = peakPositions;
            this.f56660r = null;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ComparisonLineChartView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static final void a(ComparisonLineChartView comparisonLineChartView) {
        comparisonLineChartView.H = BitmapDescriptorFactory.HUE_RED;
        comparisonLineChartView.v.setAlpha(0);
        ValueAnimator valueAnimator = comparisonLineChartView.G;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }

    private final boolean getApplyGrid() {
        return this.V && this.featureConfig.f273891a;
    }

    private final boolean getApplyPeaks() {
        return this.V && this.featureConfig.f273892b && this.W;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setAppearingAnimatedValue(float f) {
        this.appearingAnimatedValue = f;
        List list = this.z;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((Paint) list.get(i)).setAlpha((int) (255 * f));
        }
        invalidate();
    }

    private final void setConfig(b bVar) {
        this.config = bVar;
        this.f56622h = true;
        invalidate();
    }

    public final void c(Path linePath, PathMeasure linePathMeasure, ArrayList lineData) {
        Intrinsics.checkNotNullParameter(linePath, "linePath");
        Intrinsics.checkNotNullParameter(linePathMeasure, "linePathMeasure");
        Intrinsics.checkNotNullParameter(lineData, "lineData");
        linePath.reset();
        if (lineData.size() < 2) {
            return;
        }
        linePath.moveTo(this.f56624j, h(((Number) lineData.get(0)).floatValue()));
        int size = lineData.size() - 1;
        int i = 1;
        while (i < size) {
            int i2 = i - 1;
            float fG = g(i2);
            float fG2 = g(i);
            int i3 = i + 1;
            float fG3 = g(i3);
            float fH = h(((Number) lineData.get(i2)).floatValue());
            float fH2 = h(((Number) lineData.get(i)).floatValue());
            float fH3 = h(((Number) lineData.get(i3)).floatValue());
            linePath.lineTo(j6.a.a(fG2, fG, 0.8f, fG), j6.a.a(fH2, fH, 0.8f, fH));
            linePath.quadTo(fG2, fH2, ((fG3 - fG2) * 0.2f) + fG2, j6.a.a(fH3, fH2, 0.2f, fH2));
            i = i3;
        }
        linePath.lineTo(g(lineData.size() - 1), h(((Number) d0.m0(lineData)).floatValue()));
        linePathMeasure.setPath(linePath, false);
    }

    public final void d(c cVar, ArrayList arrayList, ArrayList arrayList2) {
        int size;
        Float f;
        float fFloatValue;
        int i;
        if (arrayList.isEmpty()) {
            cVar.f56657n = null;
            cVar.k = -1.0f;
            cVar.f56655l = -1.0f;
            return;
        }
        d dVar = this.M;
        if (!dVar.f56774c || arrayList.size() < 2) {
            size = arrayList.size() - 1;
            float fG = g(size);
            float fH = h(((Number) arrayList.get(size)).floatValue());
            cVar.k = fG;
            cVar.f56655l = fH;
        } else {
            float fG2 = g(arrayList.size() - 1);
            float f4 = dVar.d;
            float f5 = this.f56624j;
            float f6 = kotlin.ranges.f.f(f4, f5, fG2);
            PathMeasure pathMeasure = cVar.d;
            float f32 = dVar.d;
            float length = pathMeasure.getLength();
            float[] fArr = new float[2];
            float f35 = Float.MAX_VALUE;
            float f36 = 0.0f;
            for (float f37 = 0.0f; f37 < length; f37 += 2.0f) {
                pathMeasure.getPosTan(f37, fArr, null);
                float f41 = fArr[0];
                float f42 = fArr[1];
                float fAbs = Math.abs(f41 - f32);
                if (fAbs < f35) {
                    f35 = fAbs;
                    f36 = f42;
                }
                if (f35 == BitmapDescriptorFactory.HUE_RED) {
                    break;
                }
            }
            float f57 = f36;
            cVar.k = f6;
            cVar.f56655l = f57;
            size = kotlin.ranges.f.g(rim.d.c((f6 - f5) / (this.B / (this.F - 1))), 0, arrayList.size() - 1);
            this.O.onNext(new c2(size));
        }
        if (!arrayList2.isEmpty() || this.style.a() == f2.FIRST_OF_CURRENT_LINE) {
            float fFloatValue2 = ((Number) arrayList.get(size)).floatValue();
            int i2 = e.d[this.style.a().ordinal()];
            if (i2 == 1) {
                f = (Float) d0.d0(arrayList);
            } else if (i2 == 2) {
                f = (Float) d0.e0(size, arrayList2);
            } else {
                if (i2 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                f = (Float) d0.o0(arrayList2);
            }
            fFloatValue = fFloatValue2 - (f != null ? f.floatValue() : 0.0f);
        } else {
            fFloatValue = 0.0f;
        }
        com.revolut.core.ui_kit.internal.views.chart.b bVar = fFloatValue > BitmapDescriptorFactory.HUE_RED ? com.revolut.core.ui_kit.internal.views.chart.b.POSITIVE : fFloatValue < BitmapDescriptorFactory.HUE_RED ? com.revolut.core.ui_kit.internal.views.chart.b.NEGATIVE : com.revolut.core.ui_kit.internal.views.chart.b.NEUTRAL;
        int i3 = e.f56777c[this.config.f56646p.ordinal()];
        if (i3 == 1) {
            i = i(bVar, false);
        } else {
            if (i3 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i = j(this.config.k);
        }
        if (bVar == cVar.f56657n && i == this.K) {
            return;
        }
        cVar.f56657n = bVar;
        this.K = i;
        if (!jo0.m.f176851h) {
            this.J = i;
            this.u.setColor(i);
            Paint paint = this.v;
            paint.setColor(i);
            paint.setAlpha((int) (255 * 0.1f));
            return;
        }
        ValueAnimator valueAnimator = this.I;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimatorOfObject = ValueAnimator.ofObject(this.L, Integer.valueOf(this.J), Integer.valueOf(i));
        valueAnimatorOfObject.setDuration(150L);
        valueAnimatorOfObject.addUpdateListener(new w5(this, 6));
        valueAnimatorOfObject.addListener(new l5(this, 24));
        valueAnimatorOfObject.start();
        this.I = valueAnimatorOfObject;
    }

    @Override // android.view.View
    public final boolean dispatchHoverEvent(MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        return this.f56625k0.dispatchHoverEvent(event) || super.dispatchHoverEvent(event);
    }

    @Override // android.view.View
    public final boolean dispatchKeyEvent(KeyEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        return this.f56625k0.dispatchKeyEvent(event) || super.dispatchKeyEvent(event);
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x0207  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(float r19) {
        /*
            Method dump skipped, instruction units count: 525
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.core.ui_kit.internal.views.chart.ComparisonLineChartView.e(float):void");
    }

    public final void f(Path path, float f) {
        path.reset();
        float f4 = this.i;
        path.moveTo(f, f4);
        path.lineTo(f, this.C + f4);
    }

    public final float g(int i) {
        int i2 = this.F - 1;
        float f = this.f56624j;
        return i2 == 0 ? f : ((i * this.B) / (r0 - 1)) + f;
    }

    @NotNull
    public final y1 getData() {
        return this.data;
    }

    public final uw0.i getDataChangeAnimationRequest() {
        return this.dataChangeAnimationRequest;
    }

    @NotNull
    public final n getFeatureConfig() {
        return this.featureConfig;
    }

    @NotNull
    public final x1 getHeightMode() {
        return this.heightMode;
    }

    /* JADX INFO: renamed from: getPopupContent, reason: from getter */
    public final r1 getD() {
        return this.d;
    }

    @NotNull
    public final n2 getStyle() {
        return this.style;
    }

    public final float h(float f) {
        float f4 = this.D;
        float f5 = this.E;
        float f6 = f4 - f5;
        float f32 = this.i;
        return f6 == BitmapDescriptorFactory.HUE_RED ? f32 + this.C : (((f4 - f) * this.C) / (f4 - f5)) + f32;
    }

    public final int i(com.revolut.core.ui_kit.internal.views.chart.b bVar, boolean z) {
        Color color;
        int i = e.f[bVar.ordinal()];
        if (i == 1) {
            int i2 = e.e[this.style.d().ordinal()];
            if (i2 == 1) {
                b bVar2 = this.config;
                color = !z ? bVar2.f56640g : bVar2.f56641h;
            } else {
                if (i2 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                b bVar3 = this.config;
                color = !z ? bVar3.i : bVar3.f56642j;
            }
        } else if (i == 2) {
            int i3 = e.e[this.style.d().ordinal()];
            if (i3 == 1) {
                b bVar4 = this.config;
                color = !z ? bVar4.i : bVar4.f56642j;
            } else {
                if (i3 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                b bVar5 = this.config;
                color = !z ? bVar5.f56640g : bVar5.f56641h;
            }
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            b bVar6 = this.config;
            color = !z ? bVar6.k : bVar6.f56643l;
        }
        return j(color);
    }

    public final int j(Color color) {
        fd0.d dVar = this.f56630q;
        Integer num = (Integer) dVar.c(color);
        if (num != null) {
            return num.intValue();
        }
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int iC = io0.a.c(context, color);
        dVar.d(color, Integer.valueOf(iC));
        return iC;
    }

    public final void k(ts0.p pVar) {
        ValueAnimator valueAnimator = this.G;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(BitmapDescriptorFactory.HUE_RED, 1.0f);
        int i = e.f56776b[pVar.ordinal()];
        if (i == 1) {
            valueAnimatorOfFloat.setDuration(CapturePresenter.CONFIRMATION_VIEW_ANIM_DELAY);
            valueAnimatorOfFloat.setRepeatMode(1);
            valueAnimatorOfFloat.setRepeatCount(-1);
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            valueAnimatorOfFloat.setDuration(200L);
            this.v.setAlpha(CertificateBody.profileType);
        }
        valueAnimatorOfFloat.addUpdateListener(new androidx.core.view.j(this, pVar, 26));
        valueAnimatorOfFloat.start();
        this.G = valueAnimatorOfFloat;
    }

    public final void l(r1 r1Var, boolean z) {
        if (Intrinsics.f(this.d, r1Var)) {
            return;
        }
        this.d = r1Var;
        bt0.g gVar = this.Q;
        nr0.e eVar = gVar.f18228a;
        TextPaint textPaint = gVar.f18229b;
        if (!Intrinsics.f(gVar.k, r1Var)) {
            r1 r1Var2 = gVar.k;
            if (r1Var2 != null) {
                List list = r1Var2.f10505a;
                int size = list.size();
                List list2 = r1Var2.f10506b;
                int iMin = Math.min(size, list2.size());
                for (int i = 0; i < iMin; i++) {
                    eVar.e((Clause) list.get(i), textPaint);
                    eVar.e((Clause) list2.get(i), textPaint);
                }
            }
            if (r1Var != null) {
                List list3 = r1Var.f10505a;
                int size2 = list3.size();
                List list4 = r1Var.f10506b;
                int iMin2 = Math.min(size2, list4.size());
                for (int i2 = 0; i2 < iMin2; i2++) {
                    eVar.f((Clause) list3.get(i2), textPaint);
                    eVar.f((Clause) list4.get(i2), textPaint);
                }
            }
            gVar.k = r1Var;
        }
        c cVar = this.f56621g;
        if (r1Var == null) {
            cVar.f56658p = null;
        } else if (z) {
            e(cVar.k);
        }
        invalidate();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0308  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0324 A[LOOP:4: B:106:0x0322->B:107:0x0324, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:139:0x03fe  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x0831  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x02e4  */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v16, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r10v17, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r28v0 */
    /* JADX WARN: Type inference failed for: r2v148, types: [java.lang.Float] */
    /* JADX WARN: Type inference failed for: r2v154 */
    /* JADX WARN: Type inference failed for: r2v187 */
    /* JADX WARN: Type inference failed for: r6v1, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r6v26, types: [ir0.e] */
    /* JADX WARN: Type inference failed for: r6v8, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v52 */
    /* JADX WARN: Type inference failed for: r8v53, types: [java.lang.Float] */
    /* JADX WARN: Type inference failed for: r8v73 */
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
    public final void onDraw(android.graphics.Canvas r42) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2955
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.core.ui_kit.internal.views.chart.ComparisonLineChartView.onDraw(android.graphics.Canvas):void");
    }

    @Override // android.view.View
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        this.f56625k0.onFocusChanged(z, i, rect);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (!this.config.f56647q || this.data.a().size() < 2 || this.f56621g.f56657n == null) {
            return super.onTouchEvent(event);
        }
        boolean zOnTouchEvent = this.N.onTouchEvent(event);
        if (!zOnTouchEvent && (event.getAction() == 3 || event.getAction() == 1)) {
            d dVar = this.M;
            dVar.f56773b = false;
            ComparisonLineChartView comparisonLineChartView = dVar.e;
            c cVar = comparisonLineChartView.f56621g;
            cVar.o = false;
            dVar.f56774c = false;
            comparisonLineChartView.d(cVar, comparisonLineChartView.getData().a(), comparisonLineChartView.getData().b());
            a(comparisonLineChartView);
            comparisonLineChartView.k(ts0.p.PULSATING);
            comparisonLineChartView.O.onNext(b2.f10241a);
            comparisonLineChartView.f56622h = true;
            comparisonLineChartView.invalidate();
            comparisonLineChartView.removeCallbacks(dVar.f56772a);
        }
        return zOnTouchEvent;
    }

    public final void setData(@NotNull y1 value) {
        Intrinsics.checkNotNullParameter(value, "value");
        boolean zF = Intrinsics.f(this.data, value);
        this.data = value;
        boolean z = jo0.m.f176851h;
        if (z && this.config.f56648r) {
            this.T.a(this.dataChangeAnimationRequest);
        } else {
            setAppearingAnimatedValue(1.0f);
            this.S.i(false);
            if (z) {
                k(ts0.p.PULSATING);
            } else {
                this.H = 1.0f;
            }
        }
        this.f56622h = true;
        invalidate();
        if (zF) {
            return;
        }
        this.f56625k0.invalidateRoot();
    }

    public final void setDataChangeAnimationRequest(uw0.i iVar) {
        if (Intrinsics.f(this.dataChangeAnimationRequest, iVar)) {
            return;
        }
        this.dataChangeAnimationRequest = iVar;
        y1 y1Var = this.data;
        y1.Companion.getClass();
        if (Intrinsics.f(y1Var, y1.f10615h)) {
            return;
        }
        this.T.a(iVar);
    }

    public final void setFeatureConfig(@NotNull n value) {
        Intrinsics.checkNotNullParameter(value, "value");
        if (Intrinsics.f(this.featureConfig, value)) {
            return;
        }
        this.featureConfig = value;
        this.f56622h = true;
        invalidate();
    }

    public final void setHeightMode(@NotNull x1 value) {
        int iK;
        Intrinsics.checkNotNullParameter(value, "value");
        if (this.heightMode == value) {
            return;
        }
        this.heightMode = value;
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams == null) {
            return;
        }
        int i = e.f56775a[this.heightMode.ordinal()];
        if (i == 1) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            iK = kli.a.k(context, 200.0f);
        } else if (i == 2) {
            Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            iK = kli.a.k(context2, 280.0f);
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            iK = -1;
        }
        if (layoutParams.height == iK) {
            return;
        }
        ViewGroup.LayoutParams layoutParams2 = getLayoutParams();
        if (layoutParams2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams2.height = iK;
        setLayoutParams(layoutParams2);
    }

    public final void setPopupContent(r1 r1Var) {
        l(r1Var, true);
    }

    public final void setStyle(@NotNull n2 value) {
        boolean z;
        boolean z3;
        boolean z4;
        boolean z6;
        Intrinsics.checkNotNullParameter(value, "value");
        this.style = value;
        if (value instanceof k2) {
            z3 = true;
            z4 = true;
            z6 = true;
            z = true;
        } else {
            if (!(value instanceof m2)) {
                throw new NoWhenBranchMatchedException();
            }
            m2 m2Var = (m2) value;
            boolean z11 = m2Var.f10421g;
            z = m2Var.f10422h;
            z3 = z11;
            z4 = false;
            z6 = false;
        }
        b bVar = this.config;
        Color currentLineColor = value.g();
        Color neutralColor = value.e();
        Color neutralTranslucentColor = value.c();
        e2 colorMode = value.b();
        Color previousLineColor = bVar.f56638b;
        Color axisTextColor = bVar.f56639c;
        Color gradientEndColor = bVar.d;
        Color verticalScrubLineColor = bVar.e;
        Color horizontalDottedLineColor = bVar.f;
        Color positiveColor = bVar.f56640g;
        Color positiveTranslucentColor = bVar.f56641h;
        Color negativeColor = bVar.i;
        Color negativeTranslucentColor = bVar.f56642j;
        Color popupBackgroundColor = bVar.f56644m;
        Intrinsics.checkNotNullParameter(currentLineColor, "currentLineColor");
        Intrinsics.checkNotNullParameter(previousLineColor, "previousLineColor");
        Intrinsics.checkNotNullParameter(axisTextColor, "axisTextColor");
        Intrinsics.checkNotNullParameter(gradientEndColor, "gradientEndColor");
        Intrinsics.checkNotNullParameter(verticalScrubLineColor, "verticalScrubLineColor");
        Intrinsics.checkNotNullParameter(horizontalDottedLineColor, "horizontalDottedLineColor");
        Intrinsics.checkNotNullParameter(positiveColor, "positiveColor");
        Intrinsics.checkNotNullParameter(positiveTranslucentColor, "positiveTranslucentColor");
        Intrinsics.checkNotNullParameter(negativeColor, "negativeColor");
        Intrinsics.checkNotNullParameter(negativeTranslucentColor, "negativeTranslucentColor");
        Intrinsics.checkNotNullParameter(neutralColor, "neutralColor");
        Intrinsics.checkNotNullParameter(neutralTranslucentColor, "neutralTranslucentColor");
        Intrinsics.checkNotNullParameter(popupBackgroundColor, "popupBackgroundColor");
        Intrinsics.checkNotNullParameter(colorMode, "colorMode");
        setConfig(new b(currentLineColor, previousLineColor, axisTextColor, gradientEndColor, verticalScrubLineColor, horizontalDottedLineColor, positiveColor, positiveTranslucentColor, negativeColor, negativeTranslucentColor, neutralColor, neutralTranslucentColor, popupBackgroundColor, z3, z4, colorMode, z6, z));
        int i = z6 ? 1 : 2;
        if (getImportantForAccessibility() != i) {
            setImportantForAccessibility(i);
            this.f56625k0.invalidateRoot();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ComparisonLineChartView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r3v20, types: [java.lang.Object, kotlin.Lazy] */
    public ComparisonLineChartView(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        y1.Companion.getClass();
        this.data = y1.f10615h;
        this.style = new k2(null, null, null, null, 63);
        this.featureConfig = new n(false, false);
        this.config = new b(0);
        this.f56621g = new c(0);
        float fL = kli.a.l(context, 12.0f);
        this.i = kli.a.l(context, 12.0f);
        this.f56624j = kli.a.l(context, 12.0f);
        this.k = kli.a.l(context, 31.0f);
        this.f56626l = kli.a.l(context, 26.0f);
        this.f56627m = kli.a.l(context, 4.0f);
        float fL2 = kli.a.l(context, 2.0f);
        this.f56628n = kli.a.l(context, 4.0f);
        this.o = kli.a.l(context, 12.0f);
        float fL3 = kli.a.l(context, 1.0f);
        float fL4 = kli.a.l(context, 1.0f);
        float fL5 = kli.a.l(context, 1.0f);
        float fL6 = kli.a.l(context, 8.0f);
        this.f56629p = kli.a.l(context, 8.0f);
        this.f56630q = new fd0.d(20);
        nr0.e eVar = new nr0.e(this, new t(this, 15));
        this.f56631r = eVar;
        TextPaint textPaint = new TextPaint();
        textPaint.setColor(j(this.config.f56639c));
        textPaint.setTextSize(fL);
        textPaint.setAntiAlias(true);
        textPaint.setTextAlign(Paint.Align.CENTER);
        this.f56632s = textPaint;
        Paint paint = new Paint();
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth(fL2);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setAntiAlias(true);
        this.f56633t = paint;
        Paint paint2 = new Paint();
        Paint.Style style2 = Paint.Style.FILL;
        paint2.setStyle(style2);
        paint2.setAntiAlias(true);
        this.u = paint2;
        Paint paint3 = new Paint();
        paint3.setStyle(style2);
        paint3.setAlpha(0);
        paint3.setAntiAlias(true);
        this.v = paint3;
        Paint paint4 = new Paint();
        paint4.setStyle(style2);
        paint4.setAntiAlias(true);
        this.f56634w = paint4;
        Paint paint5 = new Paint();
        paint5.setColor(j(this.config.e));
        paint5.setStyle(style);
        paint5.setStrokeWidth(fL3);
        paint5.setAntiAlias(true);
        this.f56635x = paint5;
        Paint paint6 = new Paint();
        paint6.setStyle(style);
        paint6.setStrokeWidth(fL4);
        paint6.setAntiAlias(true);
        paint6.setPathEffect(new DashPathEffect(new float[]{fL5, fL6}, BitmapDescriptorFactory.HUE_RED));
        this.f56636y = paint6;
        Paint paint7 = new Paint();
        paint7.setStyle(style2);
        paint7.setColor(j(this.config.f56644m));
        paint7.setAntiAlias(true);
        this.z = v.k(textPaint, paint2, paint5, paint6);
        int iJ = j(this.config.k);
        this.J = iJ;
        this.K = iJ;
        this.L = new ArgbEvaluatorCompat();
        d dVar = new d(this);
        this.M = dVar;
        GestureDetector gestureDetector = new GestureDetector(context, dVar, new Handler(Looper.getMainLooper()));
        gestureDetector.setIsLongpressEnabled(false);
        this.N = gestureDetector;
        this.O = v0.a.d("create(...)");
        this.heightMode = x1.REGULAR;
        this.Q = new bt0.g(context, eVar, textPaint, paint7, new b0(0, this, ComparisonLineChartView.class, "invalidate", "invalidate()V", 0, 21));
        this.appearingAnimatedValue = 1.0f;
        ir0.g gVarA = ebm.a.a(this, paint);
        this.S = gVarA;
        this.T = new j(this, gVarA, new lt0.n(this, 1), new lm.d(13));
        this.U = new ir0.e(this, gVarA);
        this.V = ((Boolean) jo0.g.F.getValue()).booleanValue();
        this.W = kli.a.q(context);
        this.f56615a0 = new ir0.b(this, gVarA);
        this.f56617b0 = new ct0.c(context);
        this.c0 = new p(context);
        this.f56619d0 = new ct0.j(context);
        this.f56620e0 = new l(context, eVar);
        this.f0 = new it0.a();
        this.g0 = new float[0];
        this.f56623h0 = new k(context);
        this.i0 = new m(context);
        this.j0 = new RectF();
        o oVar = new o(this);
        this.f56625k0 = oVar;
        ViewCompat.setAccessibilityDelegate(this, oVar);
        setImportantForAccessibility(this.config.f56647q ? 1 : 2);
    }

    public /* synthetic */ ComparisonLineChartView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
