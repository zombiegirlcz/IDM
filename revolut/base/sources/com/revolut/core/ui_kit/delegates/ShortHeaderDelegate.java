package com.revolut.core.ui_kit.delegates;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import ip0.de0;
import ip0.ee0;
import ip0.t90;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00062\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003\u0002\u0003\u0007B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/ShortHeaderDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lip0/de0;", "Lip0/ee0;", "<init>", "()V", "Companion", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ShortHeaderDelegate extends BaseRecyclerViewDelegate<de0, ee0> {
    public ShortHeaderDelegate() {
        super(R$layout.internal_delegate_short_header, new t90(27));
        new e01.a();
        new e01.a();
        new e01.a();
        Intrinsics.checkNotNullExpressionValue(new ihm.f(), "create(...)");
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R$layout.internal_delegate_short_header, parent, false);
        Intrinsics.h(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        ee0 ee0Var = new ee0(itemView);
        View viewFindViewById = itemView.findViewById(R$id.shortHeader_endImage);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        View viewFindViewById2 = itemView.findViewById(R$id.shortHeader_actionsView);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        return ee0Var;
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate, koi.k
    /* JADX INFO: renamed from: j */
    public final /* bridge */ /* synthetic */ void p(RecyclerView.ViewHolder viewHolder, koi.j jVar, int i, List list) {
        p((ee0) viewHolder, i, list);
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    /* JADX INFO: renamed from: m */
    public final /* bridge */ /* synthetic */ void p(koi.b bVar, koi.j jVar, int i, List list) {
        p((ee0) bVar, i, list);
    }

    public final void p(ee0 holder, int i, List payloads) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(null, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, null, i, payloads);
        if (payloads.isEmpty()) {
            View itemView = holder.itemView;
            Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
            or0.u.k(itemView).Q();
            throw null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it8 = payloads.iterator();
        while (it8.hasNext()) {
            it8.next();
        }
        Iterator it9 = arrayList.iterator();
        if (it9.hasNext()) {
            throw v0.a.e(it9);
        }
    }
}
