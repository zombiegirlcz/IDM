package com.revolut.core.ui_kit.delegates;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.internal.views.swipeablecards.container.SwipeableCardContainerView;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import ip0.fg0;
import ip0.ri0;
import ip0.si0;
import ip0.ti0;
import ip0.ui0;
import ip0.vi0;
import ip0.w10;
import ip0.wi0;
import ip0.ws;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00042\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003R\u00020\u00000\u0001:\u0005\u0003\u0002\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/SwipeableCardInnerRecyclerItemDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lip0/ui0;", "Lip0/wi0;", "Companion", "ip0/ti0", "ip0/vi0", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SwipeableCardInnerRecyclerItemDelegate extends BaseRecyclerViewDelegate<ui0, wi0> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f53512c;
    public final ihm.f d;
    public final e01.a e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SwipeableCardInnerRecyclerItemDelegate(List delegates) {
        super(R$layout.internal_delegate_swipeable_card_inner_recycler_item, new ri0(0));
        Intrinsics.checkNotNullParameter(delegates, "delegates");
        this.f53512c = delegates;
        this.d = v0.a.d("create(...)");
        this.e = new e01.a();
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new wi0(this, kotlin.jvm.internal.s.r(parent, this.f98535a));
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    public final void p(wi0 holder, ui0 data, int i, List payloads) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, payloads);
        View view = holder.itemView;
        Intrinsics.i(view, "null cannot be cast to non-null type com.revolut.core.ui_kit.internal.views.swipeablecards.container.SwipeableCardContainerView");
        LinkedHashMap linkedHashMap = ((SwipeableCardContainerView) view).i;
        tu0.c cVar = new tu0.c();
        Intrinsics.checkNotNullParameter(linkedHashMap, "<this>");
        linkedHashMap.put("SwipeableCardContainerViewGradientOnScrollDelegate", cVar);
        RecyclerView recyclerView = holder.f;
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        Intrinsics.i(adapter, "null cannot be cast to non-null type com.revolut.rxdiffadapter.RxDiffAdapter");
        List list = data.f166686b;
        ti0 ti0Var = data.f166687c;
        ((z4l.j) adapter).c(list);
        holder.itemView.setOnClickListener(new ws(this, data, 24));
        LargeActionButton largeActionButton = holder.f167035g;
        efm.r map = largeActionButton.o.map(new fg0(new w10(data, 18), 7));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        this.e.a(map, holder);
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : payloads) {
            vi0 vi0Var = obj2 instanceof vi0 ? (vi0) obj2 : null;
            if (vi0Var != null) {
                arrayList.add(vi0Var);
            }
        }
        if (arrayList.isEmpty()) {
            largeActionButton.setVisibility(ti0Var.f166524a ? 0 : 8);
            largeActionButton.setEnabled(ti0Var.f166525b);
            largeActionButton.setText(ti0Var.f166526c);
            largeActionButton.setLoadingButtonTag(ti0Var.d);
            Context context = holder.itemView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            knm.b.v(kli.a.k(context, ti0Var.f166524a ? 106.0f : 24.0f), recyclerView);
            return;
        }
        Iterator it8 = arrayList.iterator();
        while (it8.hasNext()) {
            si0 si0Var = ((vi0) it8.next()).f166824a;
            if (si0Var.f166359a) {
                largeActionButton.setVisibility(ti0Var.f166524a ? 0 : 8);
                Context context2 = holder.itemView.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                knm.b.v(kli.a.k(context2, ti0Var.f166524a ? 106.0f : 24.0f), recyclerView);
            }
            if (si0Var.f166360b) {
                largeActionButton.setEnabled(ti0Var.f166525b);
            }
            if (si0Var.d) {
                largeActionButton.setLoadingButtonTag(ti0Var.d);
            }
            if (si0Var.f166361c) {
                largeActionButton.setText(ti0Var.f166526c);
            }
        }
    }
}
