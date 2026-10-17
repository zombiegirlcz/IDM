package com.revolut.core.ui_kit.delegates;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.R$dimen;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.internal.views.order_book.OrderBookChartLabelsView;
import com.revolut.core.ui_kit.internal.views.order_book.OrderBookChartView;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import ip0.fv;
import ip0.iz;
import ip0.jz;
import ip0.lz;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0004\u0002\u0004\u0003\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/OrderBookChartDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lip0/iz;", "Lip0/lz;", "ip0/jz", "ip0/kz", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class OrderBookChartDelegate extends BaseRecyclerViewDelegate<iz, lz> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final du0.a f52881c;

    public OrderBookChartDelegate() {
        this(0);
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        lz lzVar = new lz(kotlin.jvm.internal.s.r(parent, R$layout.internal_order_book_chart));
        lzVar.f.setTooltipCalculator(this.f52881c);
        return lzVar;
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    public final void p(lz holder, iz data, int i, List list) {
        List<jz> payloads = list;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, list);
        OrderBookChartLabelsView orderBookChartLabelsView = holder.f165281g;
        OrderBookChartView orderBookChartView = holder.f;
        int size = payloads.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                break;
            }
            if (!(payloads.get(i2) instanceof jz)) {
                payloads = null;
                break;
            }
            i2++;
        }
        boolean zN = ue0.e.n(payloads);
        boolean zN2 = ue0.e.n(payloads);
        boolean zN3 = ue0.e.n(payloads);
        boolean zN4 = ue0.e.n(payloads);
        if (payloads != null) {
            for (jz jzVar : payloads) {
                zN = zN || jzVar.f164926a;
                zN2 = zN2 || jzVar.f164927b;
                zN3 = zN3 || jzVar.f164928c;
                zN4 = zN4 || jzVar.d;
            }
        }
        if (zN) {
            orderBookChartView.setModel(data.f164757a);
        }
        if (zN2) {
            List<? extends Clause> list2 = data.f164758b;
            orderBookChartLabelsView.setVisibility(list2.isEmpty() ? 8 : 0);
            orderBookChartLabelsView.setLabels(list2);
        }
        if (zN4) {
            View itemView = holder.itemView;
            Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
            or0.b.c(this, data, itemView, false, null, 28);
        }
        if (zN3) {
            data.getClass();
            int dimensionPixelSize = orderBookChartView.getResources().getDimensionPixelSize(R$dimen.internal_order_book_chart_default_height);
            ViewGroup.LayoutParams layoutParams = orderBookChartView.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            layoutParams.height = dimensionPixelSize;
            orderBookChartView.setLayoutParams(layoutParams);
            View itemView2 = holder.itemView;
            Intrinsics.checkNotNullExpressionValue(itemView2, "itemView");
            ViewGroup.LayoutParams layoutParams2 = itemView2.getLayoutParams();
            if (layoutParams2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            layoutParams2.height = -2;
            itemView2.setLayoutParams(layoutParams2);
        }
        orderBookChartView.setSelectedTooltipChangedListener(new ip0.ad(holder, 25));
    }

    public OrderBookChartDelegate(int i) {
        du0.a tooltipCalculator = new du0.a();
        Intrinsics.checkNotNullParameter(tooltipCalculator, "tooltipCalculator");
        super(R$layout.internal_order_book_chart, new fv(27));
        this.f52881c = tooltipCalculator;
    }
}
