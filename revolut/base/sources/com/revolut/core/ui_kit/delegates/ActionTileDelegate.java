package com.revolut.core.ui_kit.delegates;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00062\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003\u0002\u0003\u0007B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/ActionTileDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lip0/m;", "Lip0/n;", "<init>", "()V", "Companion", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ActionTileDelegate extends BaseRecyclerViewDelegate<ip0.m, ip0.n> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ihm.f f51588c;
    public final e01.a d;

    public ActionTileDelegate() {
        super(R$layout.internal_delegate_action_tile, new ip0.c(3));
        this.f51588c = v0.a.d("create(...)");
        this.d = new e01.a();
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new ip0.n(kotlin.jvm.internal.s.r(parent, R$layout.internal_delegate_action_tile));
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate, koi.k
    /* JADX INFO: renamed from: j */
    public final /* bridge */ /* synthetic */ void p(RecyclerView.ViewHolder viewHolder, koi.j jVar, int i, List list) {
        p((ip0.n) viewHolder, i, list);
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    /* JADX INFO: renamed from: m */
    public final /* bridge */ /* synthetic */ void p(koi.b bVar, koi.j jVar, int i, List list) {
        p((ip0.n) bVar, i, list);
    }

    public final void p(ip0.n holder, int i, List payloads) {
        ActionTileDelegate actionTileDelegate;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(null, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, null, i, payloads);
        List list = payloads;
        boolean zIsEmpty = list.isEmpty();
        boolean zIsEmpty2 = list.isEmpty();
        boolean zIsEmpty3 = list.isEmpty();
        Iterator it8 = payloads.iterator();
        if (it8.hasNext()) {
            it8.next();
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (zIsEmpty) {
            throw null;
        }
        if (zIsEmpty2) {
            throw null;
        }
        if (zIsEmpty3) {
            View itemView = holder.itemView;
            Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
            actionTileDelegate = this;
            or0.b.c(actionTileDelegate, null, itemView, false, null, 28);
        } else {
            actionTileDelegate = this;
        }
        holder.itemView.setOnClickListener(new au0.b2(this, 29));
        efm.r map = holder.f.f58296a.f121375b.map(new ihd.c(20, new im3.e(22)));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        actionTileDelegate.d.a(map, holder);
    }
}
