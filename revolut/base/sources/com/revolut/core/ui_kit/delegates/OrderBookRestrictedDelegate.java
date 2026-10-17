package com.revolut.core.ui_kit.delegates;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.delegates.OrderBookItemDelegate;
import com.revolut.core.ui_kit.internal.views.SmallActionButton;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import ip0.ix;
import ip0.tz;
import ip0.wz;
import ip0.xz;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00062\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0004\u0003\u0002\u0007\bB\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\t"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/OrderBookRestrictedDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lcom/revolut/core/ui_kit/delegates/ea;", "Lip0/xz;", "<init>", "()V", "Companion", "ip0/wz", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class OrderBookRestrictedDelegate extends BaseRecyclerViewDelegate<ea, xz> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e01.a f52886c;

    /* JADX INFO: renamed from: com.revolut.core.ui_kit.delegates.OrderBookRestrictedDelegate$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    public OrderBookRestrictedDelegate() {
        super(R$layout.internal_order_book_restricted, new tz(1));
        this.f52886c = new e01.a();
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new xz(kotlin.jvm.internal.s.r(parent, R$layout.internal_order_book_restricted));
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    public final void p(xz holder, ea data, int i, List payloads) {
        int i2;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, payloads);
        SmallActionButton smallActionButton = holder.f;
        boolean zIsEmpty = payloads.isEmpty();
        Iterator it8 = payloads.iterator();
        boolean z = zIsEmpty;
        boolean z3 = z;
        boolean z4 = z3;
        while (true) {
            if (!it8.hasNext()) {
                break;
            }
            Object next = it8.next();
            Intrinsics.i(next, "null cannot be cast to non-null type com.revolut.core.ui_kit.delegates.OrderBookRestrictedDelegate.OrderBookRestrictedPayload");
            wz wzVar = (wz) next;
            zIsEmpty = zIsEmpty || wzVar.f167071a;
            z = z || wzVar.f167072b;
            z4 = z4 || wzVar.f167073c;
            z3 = z3 || wzVar.d;
        }
        if (zIsEmpty) {
            smallActionButton.setText(data.f54100b);
        }
        if (z) {
            RecyclerView.Adapter adapter = holder.f167224g.getAdapter();
            Intrinsics.i(adapter, "null cannot be cast to non-null type com.revolut.rxdiffadapter.RxDiffAdapter");
            z4l.j jVar = (z4l.j) adapter;
            List list = data.f54101c;
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (i2 = 0; i2 < size; i2++) {
                arrayList.add(new da(a0.d.n("restricted_price_data_", i2), (OrderBookItemDelegate.a) list.get(i2), null));
            }
            jVar.c(arrayList);
        }
        if (z3) {
            View itemView = holder.itemView;
            Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
            or0.b.c(this, data, itemView, false, null, 28);
        }
        efm.r map = smallActionButton.f56386h.map(new ix(16, new ip0.ad(data, 26)));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        this.f52886c.a(map, holder);
    }
}
