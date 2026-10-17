package com.revolut.core.ui_kit.delegates;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.internal.views.chart.ChartHeaderView;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import ip0.dk;
import ip0.pn;
import ip0.qn;
import ip0.rn;
import ip0.sn;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003\u0003\u0002\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/HistogramEmptyDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lip0/qn;", "Lip0/sn;", "<init>", "()V", "ip0/rn", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class HistogramEmptyDelegate extends BaseRecyclerViewDelegate<qn, sn> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e01.a f52454c;
    public final e01.a d;
    public final e01.a e;
    public final e01.a f;

    public HistogramEmptyDelegate() {
        super(R$layout.internal_delegate_histogram_empty, new dk(14));
        this.f52454c = new e01.a();
        this.d = new e01.a();
        this.e = new e01.a();
        this.f = new e01.a();
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new sn(kotlin.jvm.internal.s.r(parent, R$layout.internal_delegate_histogram_empty));
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    public final void p(sn holder, qn data, int i, List payloads) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, payloads);
        ChartHeaderView chartHeaderView = holder.f;
        if (payloads.isEmpty()) {
            ChartHeaderView.setChartHeader$default(chartHeaderView, data.f166022a, false, 2, null);
            View view = holder.itemView;
            ty0.c.b(h30.l.x(view, "itemView", view), data.f166023b, holder.f166370g, null, null, 12);
            View view2 = holder.itemView;
            yy0.f.e(h30.l.z(view2, "itemView", view2), data.f166024c, holder.f166371h, null, null, 12);
        } else {
            for (Object obj2 : payloads) {
                if (!(obj2 instanceof rn)) {
                    throw new IllegalArgumentException(v0.a.g(obj2, "payload has wrong type: ").toString());
                }
                rn rnVar = (rn) obj2;
                if (rnVar.f166212a) {
                    ChartHeaderView.setChartHeader$default(chartHeaderView, data.f166022a, false, 2, null);
                }
                if (rnVar.f166213b) {
                    View view3 = holder.itemView;
                    ty0.c.b(h30.l.x(view3, "itemView", view3), data.f166023b, holder.f166370g, null, null, 12);
                }
                if (rnVar.f166214c) {
                    View view4 = holder.itemView;
                    yy0.f.e(h30.l.z(view4, "itemView", view4), data.f166024c, holder.f166371h, null, null, 12);
                }
            }
        }
        View itemView = holder.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        or0.b.c(this, data, itemView, false, null, 28);
        efm.r map = chartHeaderView.a().map(new ip0.qh(26, new pn(data, 0)));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        this.f52454c.a(map, holder);
        efm.r rVarHide = chartHeaderView.f56610c.hide();
        Intrinsics.checkNotNullExpressionValue(rVarHide, "hide(...)");
        efm.r map2 = rVarHide.map(new ip0.qh(27, new pn(data, 1)));
        Intrinsics.checkNotNullExpressionValue(map2, "map(...)");
        this.d.a(map2, holder);
        efm.r map3 = chartHeaderView.d.map(new ip0.qh(28, new pn(data, 2)));
        Intrinsics.checkNotNullExpressionValue(map3, "map(...)");
        this.e.a(map3, holder);
        this.f.a(chartHeaderView.e, holder);
    }
}
