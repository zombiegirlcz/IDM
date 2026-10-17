package com.revolut.core.ui_kit.delegates;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.R$id;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import java.time.LocalDate;
import java.time.YearMonth;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0007\u0006\u0002\u0007\b\t\n\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u000b"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/DatePickerDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lcom/revolut/core/ui_kit/delegates/g5;", "Lip0/yd;", "<init>", "()V", "b", "ip0/xd", "ip0/vd", "ip0/wd", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class DatePickerDelegate extends BaseRecyclerViewDelegate<g5, ip0.yd> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e01.a f52176c;
    public final e01.a d;

    public static abstract class a {

        /* JADX INFO: renamed from: com.revolut.core.ui_kit.delegates.DatePickerDelegate$a$a, reason: collision with other inner class name */
        public static final class C0402a extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0402a f52177a = new C0402a();

            private C0402a() {
            }
        }

        private a() {
        }
    }

    public static abstract class b {

        public static final class a extends b {
            public final boolean equals(Object obj2) {
                return this == obj2 || (obj2 instanceof a);
            }

            public final int hashCode() {
                return Integer.hashCode(1);
            }
        }

        private b() {
        }
    }

    public DatePickerDelegate() {
        super(R$id.internal_date_picker_delegate_type, new ip0.lb(14));
        this.f52176c = new e01.a();
        this.d = new e01.a();
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        ms0.l0 l0Var = new ms0.l0(context, null, 6, 0);
        l0Var.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
        return new ip0.yd(l0Var);
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    public final void p(ip0.yd holder, g5 data, int i, List payloads) {
        List list;
        ms0.l0 l0Var;
        DatePickerDelegate datePickerDelegate;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, payloads);
        int size = payloads.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                list = payloads;
                break;
            } else {
                if (!(payloads.get(i2) instanceof ip0.xd)) {
                    list = null;
                    break;
                }
                i2++;
            }
        }
        if (list == null) {
            list = zhm.f0.f322471a;
        }
        Intrinsics.i(list, "null cannot be cast to non-null type kotlin.collections.List<com.revolut.core.ui_kit.delegates.DatePickerDelegate.Payload>");
        boolean zIsEmpty = list.isEmpty();
        int size2 = payloads.size();
        boolean z = zIsEmpty;
        boolean z3 = z;
        boolean z4 = z3;
        boolean z6 = z4;
        boolean z11 = z6;
        boolean z12 = z11;
        boolean z29 = z12;
        boolean z31 = z29;
        boolean z41 = z31;
        boolean z49 = z41;
        boolean z54 = z49;
        boolean z74 = z54;
        boolean z83 = z74;
        boolean z89 = z83;
        int i3 = 0;
        while (i3 < size2) {
            int i5 = size2;
            ip0.xd xdVar = (ip0.xd) list.get(i3);
            zIsEmpty = zIsEmpty || xdVar.f167134a;
            z = z || xdVar.f167135b;
            z3 = z3 || xdVar.f167136c;
            z4 = z4 || xdVar.d;
            z6 = z6 || xdVar.e;
            z11 = z11 || xdVar.f;
            z12 = z12 || xdVar.f167137g;
            z29 = z29 || xdVar.f167138h;
            z31 = z31 || xdVar.i;
            z41 = z41 || xdVar.f167139j;
            z49 = z49 || xdVar.k;
            List list2 = list;
            z54 = z54 || xdVar.f167140l;
            z74 = z74 || xdVar.f167141m;
            z83 = z83 || xdVar.f167142n;
            z89 = z89 || xdVar.o;
            i3++;
            size2 = i5;
            list = list2;
        }
        ms0.l0 l0Var2 = holder.f;
        if (zIsEmpty || z || z3 || z4 || z6 || z11 || z12 || z29 || z31 || z41 || z49 || z54 || z74 || z83) {
            YearMonth yearMonthFrom = YearMonth.from(data.f54185b);
            Intrinsics.checkNotNullExpressionValue(yearMonthFrom, "from(...)");
            LocalDate localDate = data.f54186c;
            boolean z96 = data.d;
            l0Var2.setModel(yearMonthFrom, data.f54187g, data.f54188h, localDate, data.f, data.e, data.i, data.f54189j, data.k, z96, null, null, data.f54190l, data.f54191m);
            l0Var = l0Var2;
        } else {
            l0Var = l0Var2;
        }
        if (z89) {
            View itemView = holder.itemView;
            Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
            datePickerDelegate = this;
            or0.b.c(datePickerDelegate, data, itemView, false, null, 28);
        } else {
            datePickerDelegate = this;
        }
        efm.r map = l0Var.f208319l.f57204a.p().map(new mlk.b0(new mqg.b(14), 27));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        efm.r map2 = map.map(new ip0.a9(new ip0.ud(data, 0), 21));
        Intrinsics.checkNotNullExpressionValue(map2, "map(...)");
        datePickerDelegate.f52176c.a(map2, holder);
        efm.r map3 = l0Var.f208319l.f57204a.p().map(new mlk.b0(new mqg.b(14), 27));
        Intrinsics.checkNotNullExpressionValue(map3, "map(...)");
        efm.r map4 = map3.map(new ip0.a9(new ip0.za(2), 22));
        od0.h hVar = od0.i.Companion;
        LocalDate localDate2 = data.f54186c;
        hVar.getClass();
        efm.r map5 = efm.r.combineLatest(map4.startWith(od0.h.a(localDate2)), l0Var.o.map(new ip0.a9(new ip0.za(3), 23)).startWith(data.f54185b), new ip0.a9(new ip0.lb(15), 24)).skip(1L).map(new ip0.a9(new ip0.ud(data, 1), 25));
        Intrinsics.checkNotNullExpressionValue(map5, "map(...)");
        datePickerDelegate.d.a(map5, holder);
    }
}
