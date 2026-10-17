package com.revolut.core.ui_kit.internal.views.fanchart;

import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.text.TextPaint;
import ir0.g;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RectF f57002a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final RectF f57003b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final RectF f57004c;
    public final RectF d;
    public final Path e;
    public final Path f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Path f57005g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Path f57006h;
    public final Path i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ArrayList f57007j;
    public final ArrayList k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ArrayList f57008l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final g f57009m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Paint f57010n;
    public final TextPaint o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final TextPaint f57011p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final TextPaint f57012q;

    public a(g glowableElement) {
        RectF drawRect = new RectF();
        RectF chartRect = new RectF();
        RectF graphRect = new RectF();
        RectF xAxisRect = new RectF();
        Path baselinePath = new Path();
        Path valueIncreaseRangePath = new Path();
        Path valueReductionRangePath = new Path();
        Path valueIncreaseLinePath = new Path();
        Path valueReductionLinePath = new Path();
        ArrayList points = new ArrayList();
        ArrayList rangePoints = new ArrayList();
        ArrayList xAxisLabels = new ArrayList();
        Paint graphPaint = new Paint();
        TextPaint xAxisLabelPaint = new TextPaint();
        TextPaint startPointLabelPaint = new TextPaint();
        TextPaint forecastPointLabelPaint = new TextPaint();
        Intrinsics.checkNotNullParameter(drawRect, "drawRect");
        Intrinsics.checkNotNullParameter(chartRect, "chartRect");
        Intrinsics.checkNotNullParameter(graphRect, "graphRect");
        Intrinsics.checkNotNullParameter(xAxisRect, "xAxisRect");
        Intrinsics.checkNotNullParameter(baselinePath, "baselinePath");
        Intrinsics.checkNotNullParameter(valueIncreaseRangePath, "valueIncreaseRangePath");
        Intrinsics.checkNotNullParameter(valueReductionRangePath, "valueReductionRangePath");
        Intrinsics.checkNotNullParameter(valueIncreaseLinePath, "valueIncreaseLinePath");
        Intrinsics.checkNotNullParameter(valueReductionLinePath, "valueReductionLinePath");
        Intrinsics.checkNotNullParameter(points, "points");
        Intrinsics.checkNotNullParameter(rangePoints, "rangePoints");
        Intrinsics.checkNotNullParameter(xAxisLabels, "xAxisLabels");
        Intrinsics.checkNotNullParameter(glowableElement, "glowableElement");
        Intrinsics.checkNotNullParameter(graphPaint, "graphPaint");
        Intrinsics.checkNotNullParameter(xAxisLabelPaint, "xAxisLabelPaint");
        Intrinsics.checkNotNullParameter(startPointLabelPaint, "startPointLabelPaint");
        Intrinsics.checkNotNullParameter(forecastPointLabelPaint, "forecastPointLabelPaint");
        this.f57002a = drawRect;
        this.f57003b = chartRect;
        this.f57004c = graphRect;
        this.d = xAxisRect;
        this.e = baselinePath;
        this.f = valueIncreaseRangePath;
        this.f57005g = valueReductionRangePath;
        this.f57006h = valueIncreaseLinePath;
        this.i = valueReductionLinePath;
        this.f57007j = points;
        this.k = rangePoints;
        this.f57008l = xAxisLabels;
        this.f57009m = glowableElement;
        this.f57010n = graphPaint;
        this.o = xAxisLabelPaint;
        this.f57011p = startPointLabelPaint;
        this.f57012q = forecastPointLabelPaint;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f57002a, aVar.f57002a) && Intrinsics.f(this.f57003b, aVar.f57003b) && Intrinsics.f(this.f57004c, aVar.f57004c) && Intrinsics.f(this.d, aVar.d) && Intrinsics.f(this.e, aVar.e) && Intrinsics.f(this.f, aVar.f) && Intrinsics.f(this.f57005g, aVar.f57005g) && Intrinsics.f(this.f57006h, aVar.f57006h) && Intrinsics.f(this.i, aVar.i) && Intrinsics.f(this.f57007j, aVar.f57007j) && Intrinsics.f(this.k, aVar.k) && Intrinsics.f(this.f57008l, aVar.f57008l) && Intrinsics.f(this.f57009m, aVar.f57009m) && Intrinsics.f(this.f57010n, aVar.f57010n) && Intrinsics.f(this.o, aVar.o) && Intrinsics.f(this.f57011p, aVar.f57011p) && Intrinsics.f(this.f57012q, aVar.f57012q);
    }

    public final int hashCode() {
        return this.f57012q.hashCode() + ((this.f57011p.hashCode() + ((this.o.hashCode() + ((this.f57010n.hashCode() + ((this.f57009m.hashCode() + com.google.android.gms.internal.mlkit_vision_face.a.b(this.f57008l, com.google.android.gms.internal.mlkit_vision_face.a.b(this.k, com.google.android.gms.internal.mlkit_vision_face.a.b(this.f57007j, (this.i.hashCode() + ((this.f57006h.hashCode() + ((this.f57005g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.f57004c.hashCode() + ((this.f57003b.hashCode() + (this.f57002a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31, 31), 31), 31)) * 31)) * 31)) * 31)) * 31);
    }
}
