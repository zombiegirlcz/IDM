package com.revolut.core.ui_kit.delegates;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.internal.views.chart.ChartHeaderView;
import com.revolut.core.ui_kit.internal.views.chart.HistogramView;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import ip0.dk;
import ip0.in;
import ip0.jn;
import ip0.kn;
import ip0.ln;
import ip0.on;
import ip0.wk;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u00062\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0006\u0003\u0002\u0007\b\t\nB\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u000b"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/HistogramDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lip0/kn;", "Lip0/on;", "<init>", "()V", "Companion", "ip0/mn", "ip0/ln", "ip0/jn", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class HistogramDelegate extends BaseRecyclerViewDelegate<kn, on> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e01.a f52451c;
    public final e01.a d;
    public final e01.a e;
    public final e01.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e01.a f52452g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ihm.f f52453h;

    public HistogramDelegate() {
        super(R$layout.internal_delegate_histogram, new dk(13));
        this.f52451c = new e01.a();
        this.d = new e01.a();
        this.e = new e01.a();
        this.f = new e01.a();
        this.f52452g = new e01.a();
        this.f52453h = v0.a.d("create(...)");
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        on onVar = new on(kotlin.jvm.internal.s.r(parent, R$layout.internal_delegate_histogram));
        onVar.f.setBackgroundEnabled(true);
        return onVar;
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    public final void p(on holder, kn data, int i, List payloads) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, payloads);
        HistogramView histogramView = holder.f;
        if (payloads.isEmpty()) {
            uw0.i iVar = data.f165053r;
            ArrayList arrayList = data.f165043b;
            histogramView.setDataChangeAnimationRequest(iVar);
            histogramView.setItems(arrayList);
            histogramView.setYAxis(data.d);
            histogramView.setTooltip(data.f165044c);
            histogramView.setSelectedPosition(zhm.d0.g0(null, arrayList));
            histogramView.d(data.f);
            histogramView.setContentDescription((Clause) null);
        } else {
            for (Object obj2 : payloads) {
                if (!(obj2 instanceof ln)) {
                    throw new IllegalArgumentException(v0.a.g(obj2, "payload has wrong type: ").toString());
                }
                ln lnVar = (ln) obj2;
                if (lnVar.f165232h) {
                    histogramView.setDataChangeAnimationRequest(data.f165053r);
                }
                if (lnVar.f165228a) {
                    histogramView.setItems(data.f165043b);
                }
                if (lnVar.f165230c) {
                    histogramView.setYAxis(data.d);
                }
                if (lnVar.f165229b) {
                    histogramView.setTooltip(data.f165044c);
                }
                if (lnVar.f) {
                    histogramView.setSelectedPosition(zhm.d0.g0(null, data.f165043b));
                }
                if (lnVar.e) {
                    histogramView.d(data.f);
                }
                if (lnVar.i) {
                    data.getClass();
                    histogramView.setContentDescription((Clause) null);
                }
            }
        }
        ChartHeaderView chartHeaderView = holder.f165693g;
        efm.r map = chartHeaderView.a().map(new ip0.qh(21, new in(data, 0)));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        this.f52451c.a(map, holder);
        efm.r rVarHide = chartHeaderView.f56610c.hide();
        Intrinsics.checkNotNullExpressionValue(rVarHide, "hide(...)");
        efm.r map2 = rVarHide.map(new ip0.qh(22, new in(data, 1)));
        Intrinsics.checkNotNullExpressionValue(map2, "map(...)");
        this.d.a(map2, holder);
        efm.r rVarHide2 = histogramView.f56682r0.hide();
        Intrinsics.checkNotNullExpressionValue(rVarHide2, "hide(...)");
        efm.r map3 = rVarHide2.map(new ip0.qh(23, new in(data, 2)));
        Intrinsics.checkNotNullExpressionValue(map3, "map(...)");
        this.e.a(map3, holder);
        efm.r map4 = chartHeaderView.d.map(new ip0.qh(24, new in(data, 3)));
        Intrinsics.checkNotNullExpressionValue(map4, "map(...)");
        this.f.a(map4, holder);
        this.f52452g.a(chartHeaderView.e, holder);
        Intrinsics.checkNotNullParameter(data, "data");
        ifm.c cVar = holder.f165694h;
        if (cVar != null) {
            cVar.dispose();
        }
        efm.r rVarHide3 = histogramView.f56682r0.hide();
        Intrinsics.checkNotNullExpressionValue(rVarHide3, "hide(...)");
        holder.f165694h = rVarHide3.distinctUntilChanged().subscribe(new ip0.qh(25, new wk(holder, data, 2)));
        jn jnVar = data.f165046h;
        View itemView = holder.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        jnVar.getClass();
        or0.b.c(this, data, itemView, false, null, 24);
        holder.itemView.setOnClickListener(null);
        holder.itemView.setClickable(false);
        histogramView.setGesturesEnabled(true);
    }
}
