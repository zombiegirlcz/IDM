package com.revolut.core.ui_kit.delegates;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.internal.views.fanchart.CurvedFanChartView;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import ip0.tj;
import ip0.uj;
import ip0.vj;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003\u0006\u0002\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/ForecastLoadingDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lip0/tj;", "Lip0/vj;", "<init>", "()V", "ip0/uj", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ForecastLoadingDelegate extends BaseRecyclerViewDelegate<tj, vj> {
    public ForecastLoadingDelegate() {
        super(R$layout.internal_delegate_forecast_loading, new ip0.zf(27));
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View view = kotlin.jvm.internal.s.r(parent, this.f98535a);
        Intrinsics.checkNotNullParameter(view, "view");
        vj vjVar = new vj(view);
        View viewFindViewById = view.findViewById(R$id.projectionChartLoading_chart);
        CurvedFanChartView curvedFanChartView = (CurvedFanChartView) viewFindViewById;
        curvedFanChartView.setDataset(null);
        curvedFanChartView.setAxisColorAttr(R$attr.uikit_colorShimmer);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "apply(...)");
        return vjVar;
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    public final void p(vj holder, tj data, int i, List payloads) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, payloads);
        int size = payloads.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                break;
            }
            if (!(payloads.get(i2) instanceof uj)) {
                payloads = null;
                break;
            }
            i2++;
        }
        List list = payloads;
        if (list != null && !list.isEmpty()) {
            List list2 = payloads;
            if ((list2 instanceof Collection) && list2.isEmpty()) {
                return;
            }
            Iterator it8 = list2.iterator();
            while (it8.hasNext()) {
                if (((uj) it8.next()).f166688a) {
                }
            }
            return;
        }
        View itemView = holder.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        or0.b.c(this, data, itemView, false, null, 28);
    }
}
