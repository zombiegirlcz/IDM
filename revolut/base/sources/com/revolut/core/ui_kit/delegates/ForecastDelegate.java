package com.revolut.core.ui_kit.delegates;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.internal.views.fanchart.CurvedFanChartView;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import ip0.oj;
import ip0.pj;
import ip0.qj;
import ip0.rj;
import ip0.sj;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0005\u0003\u0002\u0006\u0007\bB\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\t"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/ForecastDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lip0/qj;", "Lip0/rj;", "<init>", "()V", "ip0/nj", "ip0/oj", "ip0/sj", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ForecastDelegate extends BaseRecyclerViewDelegate<qj, rj> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ihm.b f52369c;

    public ForecastDelegate() {
        super(R$layout.internal_delegate_forecast, new ip0.zf(26));
        this.f52369c = j6.a.h("create(...)");
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new rj(kotlin.jvm.internal.s.r(parent, this.f98535a));
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    public final void p(rj holder, qj data, int i, List list) {
        List payloads = list;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, list);
        CurvedFanChartView curvedFanChartView = holder.f166196h;
        curvedFanChartView.setSelectedPointListener(new a26.s(data, this, 18));
        int size = payloads.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                break;
            }
            if (!(payloads.get(i2) instanceof pj)) {
                payloads = null;
                break;
            }
            i2++;
        }
        if (payloads == null) {
            payloads = zhm.f0.f322471a;
        }
        boolean zIsEmpty = payloads.isEmpty();
        boolean zIsEmpty2 = payloads.isEmpty();
        boolean zIsEmpty3 = payloads.isEmpty();
        boolean zIsEmpty4 = payloads.isEmpty();
        boolean zIsEmpty5 = payloads.isEmpty();
        boolean zIsEmpty6 = payloads.isEmpty();
        boolean zIsEmpty7 = payloads.isEmpty();
        boolean zIsEmpty8 = payloads.isEmpty();
        boolean zIsEmpty9 = payloads.isEmpty();
        boolean zIsEmpty10 = payloads.isEmpty();
        boolean zIsEmpty11 = payloads.isEmpty();
        int size2 = payloads.size();
        int i3 = 0;
        while (i3 < size2) {
            List list2 = payloads;
            pj pjVar = (pj) payloads.get(i3);
            boolean z = zIsEmpty || pjVar.f165832c;
            zIsEmpty2 = zIsEmpty2 || pjVar.f165830a;
            zIsEmpty3 = zIsEmpty3 || pjVar.f165831b;
            zIsEmpty4 = zIsEmpty4 || pjVar.d;
            zIsEmpty5 = zIsEmpty5 || pjVar.e;
            zIsEmpty6 = zIsEmpty6 || pjVar.f;
            zIsEmpty7 = zIsEmpty7 || pjVar.f165833g;
            zIsEmpty8 = zIsEmpty8 || pjVar.f165834h;
            zIsEmpty9 = zIsEmpty9 || pjVar.f165835j;
            boolean z3 = z;
            zIsEmpty10 = zIsEmpty10 || pjVar.i;
            zIsEmpty11 = zIsEmpty11 || pjVar.k;
            i3++;
            payloads = list2;
            zIsEmpty = z3;
        }
        if (zIsEmpty) {
            ip0.nj njVar = data.d;
            List list3 = njVar.f165520a;
            ArrayList arrayList = njVar.f165521b;
            ArrayList arrayList2 = new ArrayList(zhm.w.t(arrayList, 10));
            for (Iterator it8 = arrayList.iterator(); it8.hasNext(); it8 = it8) {
                ip0.mj mjVar = (ip0.mj) it8.next();
                arrayList2.add(new lt0.c(mjVar.f165387a, mjVar.f165388b, mjVar.f165389c, mjVar.d, mjVar.e, mjVar.f, mjVar.f165390g));
            }
            curvedFanChartView.setDataset(new lt0.d(list3, arrayList2));
        }
        if (zIsEmpty2) {
            kli.a.b(holder.f, data.f165989b, ty0.f.f275450a);
        }
        if (zIsEmpty3) {
            holder.f166195g.setModel(data.f165990c);
        }
        if (zIsEmpty4) {
            curvedFanChartView.setOuterRegionVisible(data.e);
        }
        if (zIsEmpty5) {
            curvedFanChartView.setInnerRegionVisible(data.f);
        }
        if (zIsEmpty6) {
            ip0.mj mjVar2 = data.f165991g;
            curvedFanChartView.setSelectedPoint(mjVar2 != null ? new lt0.c(mjVar2.f165387a, mjVar2.f165388b, mjVar2.f165389c, mjVar2.d, mjVar2.e, mjVar2.f, mjVar2.f165390g) : null);
        }
        if (zIsEmpty7) {
            curvedFanChartView.setBaselineColorAttr(data.f165993j);
        }
        if (zIsEmpty8) {
            curvedFanChartView.setForecastColorAttr(data.k);
        }
        if (zIsEmpty9) {
            View itemView = holder.itemView;
            Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
            or0.b.c(this, data, itemView, false, null, 28);
        }
        if (zIsEmpty10) {
            sj sjVar = data.f165992h;
            curvedFanChartView.setYAxisLabelParams(sjVar != null ? new lt0.f(sjVar.f166362a, sjVar.f166363b) : null);
        }
        if (zIsEmpty11) {
            oj ojVar = data.i;
            curvedFanChartView.setLevelLabel(ojVar != null ? new lt0.e(ojVar.f165674b, ojVar.f165673a) : null);
        }
    }
}
