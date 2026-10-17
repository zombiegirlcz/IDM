package com.revolut.core.ui_kit.widget.dashboard;

import a08.g0;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.extensions.rx.BreadcrumbException;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.delegates.ListCellDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.WidgetHeaderLoadingDelegate;
import com.revolut.core.ui_kit.internal.delegates.WidgetHeaderDelegate;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.acquiring.card_reader.order.impl.ui.screen.product_details.CardReaderProductDetailsScreenContract$ProductDetailsWidgetType;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import efm.r;
import ihm.f;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import koi.k;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.s0;
import ks0.n;
import lak.l;
import lul.d;
import ly0.c;
import pq0.o;
import pq0.q;
import qv0.i;
import z4l.j;
import zhm.f0;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u0000 \u0006*\b\b\u0000\u0010\u0002*\u00020\u00012\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00050\u0003:\u0004\u0005\u0004\u0007\b¨\u0006\t"}, d2 = {"Lcom/revolut/core/ui_kit/widget/dashboard/DashboardBoxViewWidgetDelegate;", "Lz4l/j;", "T", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lcom/revolut/core/ui_kit/widget/dashboard/a;", "Lly0/c;", "Companion", "b", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class DashboardBoxViewWidgetDelegate<T extends j> extends BaseRecyclerViewDelegate<a, c> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CardReaderProductDetailsScreenContract$ProductDetailsWidgetType f59769c;
    public final f d;
    public final HashMap e;
    public final f f;

    public static abstract class b {
        private b() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DashboardBoxViewWidgetDelegate(CardReaderProductDetailsScreenContract$ProductDetailsWidgetType widgetType) {
        super(widgetType.getType(), new lp2.c(widgetType, 17));
        Intrinsics.checkNotNullParameter(widgetType, "widgetType");
        this.f59769c = widgetType;
        this.d = v0.a.d("create(...)");
        this.e = new HashMap();
        this.f = v0.a.d("create(...)");
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        WidgetHeaderDelegate widgetHeaderDelegate = new WidgetHeaderDelegate();
        c holder = new c(s.r(parent, R$layout.internal_delegate_dashboard_box_view_widget), new j(new koi.c(0), false, 14), widgetHeaderDelegate);
        j adapter = holder.f;
        adapter.f.b(v.k(widgetHeaderDelegate, new WidgetHeaderLoadingDelegate(), new RowLoadingDelegate()));
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        Intrinsics.checkNotNullParameter(holder, "holder");
        Iterator it8 = u.c(new ListCellDelegate()).iterator();
        while (it8.hasNext()) {
            adapter.f.a((k) it8.next());
        }
        return holder;
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate, koi.k
    /* JADX INFO: renamed from: h */
    public final void o(RecyclerView.ViewHolder viewHolder) {
        c holder = (c) viewHolder;
        Intrinsics.checkNotNullParameter(holder, "holder");
        ifm.c cVar = (ifm.c) this.e.get(holder);
        if (cVar != null) {
            cVar.dispose();
        }
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    public final void o(koi.b bVar) {
        c holder = (c) bVar;
        Intrinsics.checkNotNullParameter(holder, "holder");
        ifm.c cVar = (ifm.c) this.e.get(holder);
        if (cVar != null) {
            cVar.dispose();
        }
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    public final void p(c holder, a data, int i, List payloads) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, payloads);
        com.revolut.core.ui_kit.widget.dashboard.b bVar = data.e;
        boolean z = data.f59772c;
        Collection collection = z ? bVar.f59773a : f0.f322471a;
        s0 s0Var = new s0(2);
        ly0.a aVar = data.d;
        s0Var.a(new o(z ? q.EXPANDED : q.COLLAPSED, aVar.f200624a, R$attr.uikit_dp24, aVar.f200625b, aVar.f200626c, data.f59770a));
        s0Var.b(collection.toArray(new i[0]));
        ArrayList arrayList = s0Var.f186433a;
        List listK = v.k(arrayList.toArray(new i[arrayList.size()]));
        yp0.b.k(listK, R$attr.uikit_dp8, R$attr.uikit_dp0, 0, 0, 28);
        holder.f.c(listK);
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public final void n(c holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        HashMap map = this.e;
        ifm.c cVar = (ifm.c) map.get(holder);
        if (cVar != null) {
            cVar.dispose();
        }
        Intrinsics.checkNotNullParameter(holder, "holder");
        f fVar = holder.f200627g.f55848c;
        d dVar = new d(this, holder, 4);
        r rVarOnErrorResumeNext = fVar.onErrorResumeNext(new n(new l(new BreadcrumbException(), 16), (char) 0));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe = rVarOnErrorResumeNext.subscribe(new g0(29, dVar), new g0(29, ly0.d.f200628a));
        Intrinsics.checkNotNullExpressionValue(cVarSubscribe, "subscribe(...)");
        map.put(holder, cVarSubscribe);
    }
}
