package com.revolut.core.ui_kit.delegates;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.internal.views.chart.ChartHeaderView;
import com.revolut.core.ui_kit.internal.views.fanchart.MultiTargetFanChartView;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import ip0.fv;
import ip0.ix;
import ip0.px;
import ip0.qx;
import ip0.rx;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0004\u0002\u0006\u0003\u0007B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/MultiTargetFanChartDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lip0/px;", "Lip0/rx;", "<init>", "()V", "ip0/qx", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class MultiTargetFanChartDelegate extends BaseRecyclerViewDelegate<px, rx> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e01.a f52778c;
    public final ihm.f d;
    public final e01.a e;

    public static abstract class a {

        /* JADX INFO: renamed from: com.revolut.core.ui_kit.delegates.MultiTargetFanChartDelegate$a$a, reason: collision with other inner class name */
        public static final class C0413a extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0413a f52779a = new C0413a();

            private C0413a() {
            }
        }

        private a() {
        }
    }

    public MultiTargetFanChartDelegate() {
        super(R$layout.internal_delegate_multi_target_fan_chart, new fv(13));
        this.f52778c = new e01.a();
        this.d = v0.a.d("create(...)");
        this.e = new e01.a();
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new rx(kotlin.jvm.internal.s.r(parent, this.f98535a));
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    public final void p(rx holder, px data, int i, List payloads) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, payloads);
        TextView textView = holder.f166252h;
        MultiTargetFanChartView multiTargetFanChartView = holder.f166251g;
        ChartHeaderView chartHeaderView = holder.f;
        ArrayList<qx> arrayList = new ArrayList();
        for (Object obj2 : payloads) {
            if (obj2 instanceof qx) {
                arrayList.add(obj2);
            }
        }
        boolean zN = ue0.e.n(payloads);
        boolean zN2 = ue0.e.n(payloads);
        boolean zN3 = ue0.e.n(payloads);
        boolean zN4 = ue0.e.n(payloads);
        for (qx qxVar : arrayList) {
            zN = zN || qxVar.f166062a;
            zN2 = zN2 || qxVar.f166063b;
            zN3 = zN3 || qxVar.f166064c;
            zN4 = zN4 || qxVar.d;
        }
        if (zN) {
            ChartHeaderView.setChartHeader$default(chartHeaderView, data.f165893a, false, 2, null);
        }
        if (zN2) {
            multiTargetFanChartView.setDataset(data.f165894b);
        }
        if (zN3) {
            or0.b.e(this, data.f165895c, textView, new i4g.g(1, this.d, ihm.f.class, "onNext", "onNext(Ljava/lang/Object;)V", 0, 21), 8);
            textView.setGravity(1);
        }
        if (zN4) {
            View itemView = holder.itemView;
            Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
            or0.b.c(this, data, itemView, false, null, 24);
        }
        efm.r map = chartHeaderView.a().map(new ix(5, new ip0.ad(data, 24)));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        this.f52778c.a(map, holder);
        efm.r map2 = multiTargetFanChartView.getPointSelectionPublishSubject().map(new ix(6, new ip0.za(9)));
        Intrinsics.checkNotNullExpressionValue(map2, "map(...)");
        this.e.a(map2, holder);
    }
}
