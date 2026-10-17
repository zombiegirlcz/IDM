package com.revolut.core.ui_kit.delegates;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import ip0.fv;
import ip0.ix;
import ip0.qz;
import ip0.rz;
import ip0.sz;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0004\u0003\u0002\u0006\u0007B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/OrderBookItemDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lcom/revolut/core/ui_kit/delegates/da;", "Lip0/sz;", "<init>", "()V", "a", "ip0/rz", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class OrderBookItemDelegate extends BaseRecyclerViewDelegate<da, sz> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e01.a f52882c;
    public final e01.a d;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Clause f52883a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Clause f52884b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f52885c;
        public final Clause d;
        public final Clause e;
        public final int f;

        public a() {
            this(null, null, 0, null, null, 0);
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof a)) {
                return false;
            }
            a aVar = (a) obj2;
            return Intrinsics.f(this.f52883a, aVar.f52883a) && Intrinsics.f(this.f52884b, aVar.f52884b) && this.f52885c == aVar.f52885c && Intrinsics.f(this.d, aVar.d) && Intrinsics.f(this.e, aVar.e) && this.f == aVar.f;
        }

        public final int hashCode() {
            Clause clause = this.f52883a;
            int iHashCode = (clause == null ? 0 : clause.hashCode()) * 31;
            Clause clause2 = this.f52884b;
            int iB = j6.a.b(this.f52885c, (iHashCode + (clause2 == null ? 0 : clause2.hashCode())) * 31, 31);
            Clause clause3 = this.d;
            int iHashCode2 = (iB + (clause3 == null ? 0 : clause3.hashCode())) * 31;
            Clause clause4 = this.e;
            return Integer.hashCode(this.f) + ((iHashCode2 + (clause4 != null ? clause4.hashCode() : 0)) * 31);
        }

        public a(Clause clause, Clause clause2, int i, Clause clause3, Clause clause4, int i2) {
            this.f52883a = clause;
            this.f52884b = clause2;
            this.f52885c = i;
            this.d = clause3;
            this.e = clause4;
            this.f = i2;
        }
    }

    public OrderBookItemDelegate() {
        super(R$id.internal_order_book_item_delegate, new fv(29));
        this.f52882c = new e01.a();
        this.d = new e01.a();
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        cu0.c cVar = new cu0.c(context, null, 6, 0);
        cVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        return new sz(cVar);
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    public final void p(sz holder, da data, int i, List payloads) {
        OrderBookItemDelegate orderBookItemDelegate;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, payloads);
        boolean zIsEmpty = payloads.isEmpty();
        Iterator it8 = payloads.iterator();
        boolean z = zIsEmpty;
        boolean z3 = z;
        while (true) {
            if (!it8.hasNext()) {
                break;
            }
            Object next = it8.next();
            Intrinsics.i(next, "null cannot be cast to non-null type com.revolut.core.ui_kit.delegates.OrderBookItemDelegate.OrderBookItemModelPayload");
            rz rzVar = (rz) next;
            z = z || rzVar.f166253a;
            z3 = z3 || rzVar.f166254b;
            zIsEmpty = zIsEmpty || rzVar.f166255c;
        }
        if (zIsEmpty) {
            View itemView = holder.itemView;
            Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
            orderBookItemDelegate = this;
            or0.b.c(orderBookItemDelegate, data, itemView, false, null, 28);
        } else {
            orderBookItemDelegate = this;
        }
        if (z3) {
            holder.f.setClickable(data.f54027c != null);
        }
        cu0.c cVar = holder.f;
        if (z) {
            a aVar = data.f54026b;
            cVar.setData(aVar.f52883a, aVar.f52884b, aVar.f52885c, aVar.d, aVar.e, aVar.f);
        }
        efm.r map = cVar.f108714l.map(new ix(14, new qz(data, 0)));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        orderBookItemDelegate.f52882c.a(map, holder);
        efm.r map2 = cVar.f108715m.map(new ix(15, new qz(data, 1)));
        Intrinsics.checkNotNullExpressionValue(map2, "map(...)");
        orderBookItemDelegate.d.a(map2, holder);
    }
}
