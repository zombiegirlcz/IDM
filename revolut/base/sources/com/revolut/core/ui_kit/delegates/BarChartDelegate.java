package com.revolut.core.ui_kit.delegates;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.internal.views.barchart.BarChartView;
import com.revolut.core.ui_kit.internal.views.chart.HorizontalChartLegendView;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import ip0.dl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\f\u0003\u0002\u0006\u0007\b\t\n\u000b\f\r\u000e\u000fB\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0010"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/BarChartDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lip0/r3;", "Lip0/a4;", "<init>", "()V", "ip0/s3", "ip0/t3", "ip0/p3", "ip0/h3", "ip0/z3", "ip0/u3", "ip0/v3", "ip0/i3", "ip0/f3", "ip0/c3", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class BarChartDelegate extends BaseRecyclerViewDelegate<ip0.r3, ip0.a4> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e01.a f51714c;

    public BarChartDelegate() {
        super(R$layout.internal_delegate_barchart, new ip0.c(27));
        this.f51714c = new e01.a();
    }

    public static int p(List list, ip0.i3 i3Var) {
        if (i3Var == null) {
            return -1;
        }
        Iterator it8 = list.iterator();
        int i = 0;
        while (it8.hasNext()) {
            if (((ip0.h3) it8.next()).f164499a.equals(i3Var)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public static aw0.o1 r(aw0.o1 o1Var) {
        if (!((Boolean) jo0.g.E.getValue()).booleanValue()) {
            return o1Var;
        }
        List list = o1Var.f10449a;
        ArrayList items = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            items.add(new aw0.q1(zhm.u.c(aw0.m0.f10417a), ((aw0.q1) list.get(i)).f10482b));
        }
        aw0.n1 style = o1Var.f10450b;
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(style, "style");
        return new aw0.o1(items, style);
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        ip0.a4 a4Var = new ip0.a4(kotlin.jvm.internal.s.r(parent, this.f98535a));
        a4Var.f163381g.setBackgroundEnabled(true);
        return a4Var;
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public final void p(ip0.a4 holder, ip0.r3 data, int i, List payloads) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, payloads);
        HorizontalChartLegendView horizontalChartLegendView = holder.f;
        TextView textView = holder.f163382h;
        BarChartView barChartView = holder.f163381g;
        ArrayList<ip0.s3> arrayList = new ArrayList();
        for (Object obj2 : payloads) {
            if (obj2 instanceof ip0.s3) {
                arrayList.add(obj2);
            }
        }
        if (arrayList.isEmpty()) {
            ip0.p3 p3Var = data.f166088b;
            barChartView.setDataset(new dl(p3Var, null, null));
            barChartView.setSelectedPosition(p(p3Var.f165762a, data.f166089c));
            barChartView.setDefaultSelectedCategory(p(p3Var.f165762a, data.d));
            kli.a.b(textView, data.e, ty0.f.f275450a);
            horizontalChartLegendView.setModel(r(data.f));
            barChartView.setStyle(data.f166090g);
        } else {
            for (ip0.s3 s3Var : arrayList) {
                boolean z = s3Var.f166281b;
                if (z || s3Var.f166284h) {
                    barChartView.setDataset(new dl(data.f166088b, null, null));
                }
                if (s3Var.d || z) {
                    barChartView.setDefaultSelectedCategory(p(data.f166088b.f165762a, data.d));
                }
                if (s3Var.f166282c || z) {
                    barChartView.setSelectedPosition(p(data.f166088b.f165762a, data.f166089c));
                }
                if (s3Var.e) {
                    kli.a.b(textView, data.e, ty0.f.f275450a);
                }
                if (s3Var.f) {
                    horizontalChartLegendView.setModel(r(data.f));
                }
                if (s3Var.f166283g) {
                    barChartView.setStyle(data.f166090g);
                }
            }
        }
        efm.r map = barChartView.v.map(new ip0.w(new ii4.b(data, 25), 15));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        this.f51714c.a(map, holder);
        View itemView = holder.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        or0.b.c(this, data, itemView, false, null, 28);
    }
}
