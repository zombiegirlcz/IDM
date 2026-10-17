package com.revolut.core.ui_kit.delegates.widgets;

import android.content.Context;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import aw0.l5;
import aw0.m5;
import aw0.o5;
import aw0.p5;
import aw0.q5;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import com.revolut.core.ui_kit.internal.views.ResizableTileHeaderView;
import com.revolut.core.ui_kit.internal.views.chart.ChartDetailsView;
import com.revolut.core.ui_kit.internal.views.chart.ChartGridBackgroundView;
import com.revolut.core.ui_kit.internal.views.chart.ComparisonLineChartView;
import com.revolut.core.ui_kit.internal.views.chart.HistogramView;
import com.revolut.core.ui_kit.internal.views.gaugechart.SegmentedGaugeChartView;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit_resources.R$attr;
import ip0.v7;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jmrtd.cbeff.ISO781611;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00062\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0004\u0003\u0007\b\tB\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\n"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/widgets/ChartWithDetailsWidgetDelegate;", "Lcom/revolut/core/ui_kit/delegates/widgets/BaseDraggableWidgetDelegate;", "Lcom/revolut/core/ui_kit/delegates/widgets/ChartWithDetailsWidgetDelegate$Model;", "Lcom/revolut/core/ui_kit/delegates/widgets/l0;", "<init>", "()V", "Companion", "Model", "op0/n0", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ChartWithDetailsWidgetDelegate extends BaseDraggableWidgetDelegate<Model, l0> {

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0004\u0007\b\t\nJ\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u000b"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/widgets/ChartWithDetailsWidgetDelegate$Model;", "Lqv0/q;", "Lcom/revolut/core/ui_kit/delegates/widgets/BaseDraggableWidgetDelegate$Model;", "Lqv0/p;", "", "toString", "()Ljava/lang/String;", "com/revolut/core/ui_kit/delegates/widgets/j0", "com/revolut/core/ui_kit/delegates/widgets/k0", "com/revolut/core/ui_kit/delegates/widgets/i0", "com/revolut/core/ui_kit/delegates/widgets/a0", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Model extends BaseDraggableWidgetDelegate.Model implements qv0.q, qv0.p {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f55042b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Clause f55043c;
        public final MoneyClause d;
        public final j0 e;
        public final i0 f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final a0 f55044g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final op0.q f55045h;
        public Parcelable i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final Object f55046j;
        public op0.r k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public qv0.c f55047l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public p31.c f55048m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public p31.c f55049n;
        public p31.c o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public p31.c f55050p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public int f55051q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f55052r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final int f55053s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final int f55054t;
        public final py0.c u;

        public Model(String listId, Clause topLabel, MoneyClause title, j0 j0Var, i0 i0Var, a0 chartContent, op0.q widgetSize, Object obj2, int i) {
            j0Var = (i & 8) != 0 ? null : j0Var;
            widgetSize = (i & 64) != 0 ? op0.q.MEDIUM : widgetSize;
            obj2 = (i & 128) != 0 ? null : obj2;
            Intrinsics.checkNotNullParameter(listId, "listId");
            Intrinsics.checkNotNullParameter(topLabel, "topLabel");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(chartContent, "chartContent");
            Intrinsics.checkNotNullParameter(widgetSize, "widgetSize");
            op0.r rVar = op0.r.SEEN;
            c.e eVar = new c.e((qv0.h) null, 3);
            this.f55042b = listId;
            this.f55043c = topLabel;
            this.d = title;
            this.e = j0Var;
            this.f = i0Var;
            this.f55044g = chartContent;
            this.f55045h = widgetSize;
            this.i = null;
            this.f55046j = obj2;
            this.k = rVar;
            this.f55047l = eVar;
            this.f55048m = null;
            this.f55049n = null;
            this.o = null;
            this.f55050p = null;
            int i2 = R$attr.uikit_dp0;
            this.f55051q = i2;
            this.f55052r = i2;
            this.f55053s = i2;
            this.f55054t = i2;
            this.u = new py0.c(topLabel);
        }

        @Override // com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate.Model
        /* JADX INFO: renamed from: C, reason: from getter */
        public final op0.r getF55013j() {
            return this.k;
        }

        @Override // com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate.Model
        public final void D(op0.r rVar) {
            Intrinsics.checkNotNullParameter(rVar, "<set-?>");
            this.k = rVar;
        }

        @Override // qv0.p
        /* JADX INFO: renamed from: a, reason: from getter */
        public final Object getF55012h() {
            return this.f55046j;
        }

        @Override // koi.j
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getF55009b() {
            return this.f55042b;
        }

        @Override // gx0.c
        /* JADX INFO: renamed from: d */
        public final py0.d getF54970q() {
            return this.u;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Model)) {
                return false;
            }
            Model model = (Model) obj2;
            return Intrinsics.f(this.f55042b, model.f55042b) && Intrinsics.f(this.f55043c, model.f55043c) && Intrinsics.f(this.d, model.d) && Intrinsics.f(this.e, model.e) && Intrinsics.f(this.f, model.f) && Intrinsics.f(this.f55044g, model.f55044g) && this.f55045h == model.f55045h && Intrinsics.f(this.i, model.i) && Intrinsics.f(this.f55046j, model.f55046j) && this.k == model.k && Intrinsics.f(this.f55047l, model.f55047l) && Intrinsics.f(this.f55048m, model.f55048m) && Intrinsics.f(this.f55049n, model.f55049n) && Intrinsics.f(this.o, model.o) && Intrinsics.f(this.f55050p, model.f55050p);
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: f, reason: from getter */
        public final int getO() {
            return this.f55051q;
        }

        @Override // qv0.o
        public final void g(int i) {
            this.f55051q = i;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        public final Parcelable getAnalyticsContext() {
            return this.i;
        }

        public final int hashCode() {
            int iA = v7.a(p.a.a(this.f55042b.hashCode() * 31, 31, this.f55043c), 31, this.d);
            j0 j0Var = this.e;
            int iHashCode = (iA + (j0Var == null ? 0 : j0Var.hashCode())) * 31;
            i0 i0Var = this.f;
            int iB = okl.m.b(this.f55045h, (this.f55044g.hashCode() + ((iHashCode + (i0Var == null ? 0 : i0Var.hashCode())) * 31)) * 31, 31);
            Parcelable parcelable = this.i;
            int iHashCode2 = (iB + (parcelable == null ? 0 : parcelable.hashCode())) * 31;
            Object obj2 = this.f55046j;
            int i = h30.l.i(this.f55047l, okl.m.c(this.k, (iHashCode2 + (obj2 == null ? 0 : obj2.hashCode())) * 31, 31), 31);
            p31.c cVar = this.f55048m;
            int iHashCode3 = (i + (cVar == null ? 0 : cVar.hashCode())) * 31;
            p31.c cVar2 = this.f55049n;
            int iHashCode4 = (iHashCode3 + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
            p31.c cVar3 = this.o;
            int iHashCode5 = (iHashCode4 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
            p31.c cVar4 = this.f55050p;
            return iHashCode5 + (cVar4 != null ? cVar4.hashCode() : 0);
        }

        @Override // o31.c
        /* JADX INFO: renamed from: i, reason: from getter */
        public final p31.c getK() {
            return this.f55048m;
        }

        @Override // qv0.i
        public final void j(qv0.c cVar) {
            Intrinsics.checkNotNullParameter(cVar, "<set-?>");
            this.f55047l = cVar;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: k, reason: from getter */
        public final p31.c getF52330l() {
            return this.f55049n;
        }

        @Override // qv0.n
        public final void l(p31.c cVar) {
            this.o = cVar;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: m, reason: from getter */
        public final int getF52333p() {
            return this.f55052r;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: n, reason: from getter */
        public final int getF52335r() {
            return this.f55054t;
        }

        @Override // qv0.o
        public final void o(int i) {
            this.f55052r = i;
        }

        @Override // gx0.c
        /* JADX INFO: renamed from: p, reason: from getter */
        public final op0.q getF55011g() {
            return this.f55045h;
        }

        @Override // qv0.i
        /* JADX INFO: renamed from: p1, reason: from getter */
        public final qv0.c getF52329j() {
            return this.f55047l;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: q, reason: from getter */
        public final p31.c getF52332n() {
            return this.f55050p;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: r, reason: from getter */
        public final p31.c getF52331m() {
            return this.o;
        }

        @Override // o31.c
        public final void s(p31.c cVar) {
            this.f55048m = cVar;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        public final void setAnalyticsContext(Parcelable parcelable) {
            this.i = parcelable;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: t, reason: from getter */
        public final int getF52334q() {
            return this.f55053s;
        }

        @Override // o31.c
        public final void u(p31.c cVar) {
            this.f55049n = cVar;
        }

        @Override // qv0.n
        public final void w(p31.c cVar) {
            this.f55050p = cVar;
        }

        @Override // koi.j
        public final Object z(Object oldItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Model model = oldItem instanceof Model ? (Model) oldItem : null;
            if (model != null) {
                return new op0.n0(!Intrinsics.f(this.f55043c, model.f55043c), !Intrinsics.f(this.d, model.d), !Intrinsics.f(this.e, model.e), !Intrinsics.f(this.f, model.f), !Intrinsics.f(this.f55044g, model.f55044g), this.f55045h != model.f55045h);
            }
            return null;
        }
    }

    public ChartWithDetailsWidgetDelegate() {
        super(R$layout.internal_delegate_widget_chart_with_details, new ood.g0(27));
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        l0 l0Var = new l0(kotlin.jvm.internal.s.r(parent, R$layout.internal_delegate_widget_chart_with_details));
        ResizableTileHeaderView resizableTileHeaderView = l0Var.f55413n;
        resizableTileHeaderView.setTopLabelMaxLines(1);
        resizableTileHeaderView.setRightSubtitle(null);
        p(l0Var, true);
        return l0Var;
    }

    @Override // com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public final void p(l0 holder, Model data, int i, List list) {
        List payloads = list;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, list);
        ChartDetailsView chartDetailsView = holder.f55414p;
        ResizableTileHeaderView resizableTileHeaderView = holder.f55413n;
        FrameLayout frameLayout = holder.o;
        int size = payloads.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                break;
            }
            if (!(payloads.get(i2) instanceof op0.n0)) {
                payloads = null;
                break;
            }
            i2++;
        }
        if (payloads == null) {
            payloads = zhm.f0.f322471a;
        }
        boolean zIsEmpty = payloads.isEmpty();
        int size2 = payloads.size();
        boolean z = zIsEmpty;
        boolean z3 = z;
        boolean z4 = z3;
        boolean z6 = z4;
        boolean z11 = z6;
        for (int i3 = 0; i3 < size2; i3++) {
            op0.n0 n0Var = (op0.n0) payloads.get(i3);
            zIsEmpty = zIsEmpty || n0Var.f227354a;
            z = z || n0Var.f227355b;
            z3 = z3 || n0Var.f227356c;
            z4 = z4 || n0Var.d;
            z6 = z6 || n0Var.e;
            z11 = z11 || n0Var.f;
        }
        if (zIsEmpty) {
            resizableTileHeaderView.setTopLabel(data.f55043c);
        }
        if (z) {
            resizableTileHeaderView.setTitle(data.d);
        }
        if (z3) {
            j0 j0Var = data.e;
            resizableTileHeaderView.setBottomSubtitle(j0Var != null ? j0Var.d : null);
        }
        if (z4) {
            i0 i0Var = data.f;
            chartDetailsView.setVisibility(i0Var != null ? 0 : 8);
            if (i0Var != null) {
                chartDetailsView.setModel(i0Var);
            }
        }
        if (z6) {
            a0 a0Var = data.f55044g;
            if (a0Var instanceof w) {
                w chartContent = (w) a0Var;
                Intrinsics.checkNotNullParameter(chartContent, "chartContent");
                HistogramView histogramView = holder.k;
                if (histogramView == null) {
                    Context context = holder.itemView.getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                    histogramView = new HistogramView(context, null, 6, 0);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
                    Context context2 = holder.itemView.getContext();
                    Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                    int iK = kli.a.k(context2, 12.0f);
                    layoutParams.setMarginEnd(iK);
                    layoutParams.bottomMargin = iK;
                    histogramView.setLayoutParams(layoutParams);
                    histogramView.setRoundedCorners(true);
                    histogramView.setGesturesEnabled(false);
                    histogramView.setBackgroundEnabled(false);
                    histogramView.setYAxis(null);
                    histogramView.setTooltip(null);
                    histogramView.d(new q5(8.0f, BitmapDescriptorFactory.HUE_RED, (l5) null, (o5) null, m5.FIXED, aw0.k0.GRADIENT, (p5) null, ISO781611.SMT_DO_DS));
                    holder.k = histogramView;
                    frameLayout.addView(histogramView);
                }
                histogramView.setItems(chartContent.f55539a);
                holder.I(histogramView, ts0.i.HORIZONTAL, BitmapDescriptorFactory.HUE_RED, 0.75f, 2.0f);
            } else if (a0Var instanceof x) {
                x chartContent2 = (x) a0Var;
                Intrinsics.checkNotNullParameter(chartContent2, "chartContent");
                ComparisonLineChartView comparisonLineChartView = holder.f55410j;
                if (comparisonLineChartView == null) {
                    Context context3 = holder.itemView.getContext();
                    Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
                    comparisonLineChartView = new ComparisonLineChartView(context3, null, 6, 0);
                    comparisonLineChartView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                    holder.f55410j = comparisonLineChartView;
                    frameLayout.addView(comparisonLineChartView);
                }
                comparisonLineChartView.setStyle(chartContent2.e);
                comparisonLineChartView.setData(chartContent2.f55546a);
                holder.I(comparisonLineChartView, ts0.i.FULL, 12.0f, 0.75f, 2.0f);
            } else if (a0Var instanceof z) {
                z chartContent3 = (z) a0Var;
                Intrinsics.checkNotNullParameter(chartContent3, "chartContent");
                SegmentedGaugeChartView segmentedGaugeChartView = holder.f55411l;
                if (segmentedGaugeChartView == null) {
                    Context context4 = holder.itemView.getContext();
                    Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
                    segmentedGaugeChartView = new SegmentedGaugeChartView(context4, null, 6, 0);
                    segmentedGaugeChartView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1, 17));
                    segmentedGaugeChartView.setMiniStyle(true);
                    segmentedGaugeChartView.setGesturesEnabled(false);
                    holder.f55411l = segmentedGaugeChartView;
                    frameLayout.addView(segmentedGaugeChartView);
                }
                segmentedGaugeChartView.setData(chartContent3.f55573b);
                holder.I(segmentedGaugeChartView, null, BitmapDescriptorFactory.HUE_RED, 1.0f, BitmapDescriptorFactory.HUE_RED);
            } else {
                if (!(a0Var instanceof y)) {
                    throw new NoWhenBranchMatchedException();
                }
                holder.H(0.75f, 2.0f);
                for (int i5 = 0; i5 < frameLayout.getChildCount(); i5++) {
                    View childAt = frameLayout.getChildAt(i5);
                    Intrinsics.checkNotNullExpressionValue(childAt, "getChildAt(...)");
                    childAt.setVisibility(8);
                }
                holder.f55412m = null;
                ChartGridBackgroundView chartGridBackgroundView = holder.f55415q;
                chartGridBackgroundView.setVisibility(0);
                chartGridBackgroundView.setModel(new ts0.j(ts0.i.FULL, ts0.f.f273866a));
            }
        }
        if (z11) {
            holder.F(data.f55045h);
        }
    }
}
