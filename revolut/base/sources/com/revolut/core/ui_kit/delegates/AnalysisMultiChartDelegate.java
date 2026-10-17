package com.revolut.core.ui_kit.delegates;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.internal.views.barchart.HorizontalBarView;
import com.revolut.core.ui_kit.internal.views.chart.SegmentedChartView;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 \u00062\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\t\u0003\u0002\u0007\b\t\n\u000b\f\rB\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u000e"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/AnalysisMultiChartDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lip0/e1;", "Lip0/i1;", "<init>", "()V", "Companion", "ip0/f1", "ip0/d1", "ip0/h1", "ip0/g1", "ip0/y0", "ip0/c1", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AnalysisMultiChartDelegate extends BaseRecyclerViewDelegate<ip0.e1, ip0.i1> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e01.a f51653c;

    public AnalysisMultiChartDelegate() {
        super(R$layout.internal_delegate_analysis_multi_chart, new ip0.c(13));
        this.f51653c = new e01.a();
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new ip0.i1(kotlin.jvm.internal.s.r(parent, this.f98535a));
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    public final void p(ip0.i1 holder, ip0.e1 data, int i, List payloads) {
        List list;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, payloads);
        TextView textView = holder.f164622h;
        SegmentedChartView segmentedChartView = holder.i;
        List list2 = payloads;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            list = payloads;
        } else {
            Iterator it8 = list2.iterator();
            while (it8.hasNext()) {
                if (!(it8.next() instanceof ip0.f1)) {
                    list = null;
                    break;
                }
            }
            list = payloads;
        }
        if (list == null) {
            list = zhm.f0.f322471a;
        }
        Intrinsics.i(list, "null cannot be cast to non-null type kotlin.collections.List<com.revolut.core.ui_kit.delegates.AnalysisMultiChartDelegate.Payload>");
        boolean zIsEmpty = list.isEmpty();
        int size = payloads.size();
        boolean z = zIsEmpty;
        boolean z3 = z;
        boolean z4 = z3;
        boolean z6 = z4;
        boolean z11 = z6;
        boolean z12 = z11;
        for (int i2 = 0; i2 < size; i2++) {
            ip0.f1 f1Var = (ip0.f1) list.get(i2);
            zIsEmpty = zIsEmpty || f1Var.f164177a;
            z = z || f1Var.f164178b;
            z3 = z3 || f1Var.f164179c;
            z4 = z4 || f1Var.d;
            z6 = z6 || f1Var.e;
            z11 = z11 || f1Var.f;
            z12 = z12 || f1Var.f164180g;
        }
        if (zIsEmpty) {
            kli.a.b(holder.f, data.f163992a, ty0.f.f275450a);
        }
        if (z) {
            kli.a.b(holder.f164621g, data.f163993b, ty0.f.f275450a);
        }
        if (z3) {
            data.getClass();
            List bars = data.f163994c;
            Intrinsics.checkNotNullParameter(bars, "bars");
            HorizontalBarView horizontalBarView = holder.f164623j;
            ArrayList arrayList = new ArrayList(bars.size());
            int size2 = bars.size();
            int i3 = 0;
            while (i3 < size2) {
                ip0.d1 d1Var = (ip0.d1) bars.get(i3);
                arrayList.add(new ps0.m(null, d1Var.f163821a, R$attr.uikit_colorGrey50, r11.f167228a / 100, d1Var.f163822b.f167229b));
                i3++;
                bars = bars;
            }
            horizontalBarView.setBars(new ps0.n(arrayList, 100, 60));
        }
        if (z4 && data.e != null) {
            kli.a.b(textView, data.d, ty0.f.f275450a);
        }
        if (z6) {
            Clause clause = data.d;
            List list3 = data.e;
            List list4 = list3;
            if (list4 == null || list4.isEmpty() || clause == null) {
                kli.a.b(textView, null, ty0.f.f275450a);
                segmentedChartView.setVisibility(8);
                segmentedChartView.setItems(zhm.f0.f322471a);
            } else {
                ArrayList arrayList2 = new ArrayList(list3.size());
                int size3 = list3.size();
                int i5 = 0;
                while (i5 < size3) {
                    ip0.g1 g1Var = (ip0.g1) list3.get(i5);
                    String strN = a0.d.n("vertical_bar_id_", i5);
                    ArrayList arrayList3 = g1Var.f164323a;
                    List list5 = list3;
                    ArrayList arrayList4 = new ArrayList(arrayList3.size());
                    int size4 = arrayList3.size();
                    int i6 = size3;
                    int i21 = 0;
                    while (i21 < size4) {
                        int i22 = size4;
                        arrayList4.add(new ts0.m0(r5.f167228a, ((ip0.y0) arrayList3.get(i21)).f167229b.f10572a));
                        i21++;
                        size4 = i22;
                        i5 = i5;
                    }
                    arrayList2.add(new ts0.l0(g1Var.f164324b, strN, arrayList4));
                    i5++;
                    size3 = i6;
                    list3 = list5;
                }
                kli.a.b(textView, clause, ty0.f.f275450a);
                segmentedChartView.setVisibility(0);
                segmentedChartView.setItems(arrayList2);
            }
        }
        if (z11) {
            Intrinsics.checkNotNullParameter(data, "data");
            segmentedChartView.setSelectedPosition(data.f);
        }
        if (z12) {
            View itemView = holder.itemView;
            Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
            or0.b.c(this, data, itemView, false, null, 28);
        }
        efm.r rVarHide = segmentedChartView.B.hide();
        Intrinsics.checkNotNullExpressionValue(rVarHide, "hide(...)");
        efm.r map = rVarHide.map(new ip0.w(new ii4.b(holder, 24), 14));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        this.f51653c.a(map, holder);
    }
}
