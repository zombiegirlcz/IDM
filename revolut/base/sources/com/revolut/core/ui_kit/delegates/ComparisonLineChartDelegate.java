package com.revolut.core.ui_kit.delegates;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.internal.views.chart.ComparisonLineChartView;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\u0018\u0000 \u00072\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0004:\u0005\b\u0002\t\u0003\nB\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u000b"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/ComparisonLineChartDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lip0/nb;", "Lip0/pb;", "", "<init>", "()V", "Companion", "lnd/a0", "ip0/ob", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ComparisonLineChartDelegate extends BaseRecyclerViewDelegate<ip0.nb, ip0.pb> {

    @NotNull
    private static final a Companion = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e01.a f52114c;

    public static final class a {
        private a() {
        }
    }

    public ComparisonLineChartDelegate() {
        super(R$id.internal_comparison_line_chart_delegate_type, new ip0.lb(1));
        this.f52114c = new e01.a();
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        FrameLayout frameLayout = new FrameLayout(parent.getContext());
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        ComparisonLineChartView comparisonLineChartView = new ComparisonLineChartView(context, null, 6, 0);
        comparisonLineChartView.setId(R$id.comparisonLineChart_chartView);
        comparisonLineChartView.setFeatureConfig(new ts0.n(true, true));
        Context context2 = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        comparisonLineChartView.setLayoutParams(new ViewGroup.MarginLayoutParams(-1, kli.a.k(context2, 200.0f)));
        frameLayout.addView(comparisonLineChartView);
        return new ip0.pb(frameLayout);
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate, koi.k
    public final void onViewRecycled(RecyclerView.ViewHolder holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        ip0.pb pbVar = (ip0.pb) holder;
        this.f52114c.c(pbVar);
        pbVar.f.setPopupContent(null);
        pbVar.f165803g = Integer.MIN_VALUE;
        Intrinsics.checkNotNullParameter(holder, "holder");
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    public final void p(ip0.pb holder, ip0.nb data, int i, List payloads) {
        ComparisonLineChartDelegate comparisonLineChartDelegate;
        ip0.nb nbVar;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, payloads);
        ComparisonLineChartView comparisonLineChartView = holder.f;
        int size = payloads.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                break;
            }
            if (!(payloads.get(i2) instanceof ip0.ob)) {
                payloads = null;
                break;
            }
            i2++;
        }
        List list = payloads;
        boolean z = list == null || list.isEmpty();
        boolean z3 = list == null || list.isEmpty();
        boolean z4 = list == null || list.isEmpty();
        boolean z6 = list == null || list.isEmpty();
        boolean z11 = list == null || list.isEmpty();
        boolean z12 = list == null || list.isEmpty();
        boolean z29 = list == null || list.isEmpty();
        if (payloads != null) {
            for (ip0.ob obVar : payloads) {
                z = z || obVar.f165647a;
                z3 = z3 || obVar.f165648b;
                z4 = z4 || obVar.f165649c;
                z6 = z6 || obVar.d;
                z11 = z11 || obVar.f;
                z12 = z12 || obVar.e;
                z29 = z29 || obVar.f165650g;
            }
        }
        if (z29) {
            comparisonLineChartView.setDataChangeAnimationRequest(data.f165485l);
        }
        if (z12) {
            comparisonLineChartView.setStyle(data.d);
        }
        if (z) {
            comparisonLineChartView.setData(data.f165480b);
        }
        if (z3 || z4) {
            comparisonLineChartView.setPopupContent(data.f165481c);
            holder.f165803g = Integer.MIN_VALUE;
        }
        if (z6) {
            comparisonLineChartView.setHeightMode(data.e);
        }
        if (z11) {
            View itemView = holder.itemView;
            Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
            comparisonLineChartDelegate = this;
            nbVar = data;
            or0.b.c(comparisonLineChartDelegate, nbVar, itemView, false, null, 28);
        } else {
            comparisonLineChartDelegate = this;
            nbVar = data;
        }
        efm.r rVarHide = comparisonLineChartView.O.hide();
        Intrinsics.checkNotNullExpressionValue(rVarHide, "hide(...)");
        efm.r rVarDoOnNext = rVarHide.doOnNext(new ip0.a9(new ijg.c(holder, nbVar, 29), 16));
        Intrinsics.checkNotNullExpressionValue(rVarDoOnNext, "doOnNext(...)");
        comparisonLineChartDelegate.f52114c.a(rVarDoOnNext, holder);
    }
}
