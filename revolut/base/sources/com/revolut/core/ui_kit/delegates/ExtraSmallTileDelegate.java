package com.revolut.core.ui_kit.delegates;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.recycler.BaseBoxRecyclerViewDelegate;
import com.revolut.core.ui_kit_core.actionshandler.TrackableItem;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0006\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/ExtraSmallTileDelegate;", "Lcom/revolut/core/ui_kit/recycler/BaseBoxRecyclerViewDelegate;", "Lcom/revolut/core/ui_kit/delegates/ExtraSmallTileDelegate$Model;", "Lip0/oh;", "<init>", "()V", "Model", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ExtraSmallTileDelegate extends BaseBoxRecyclerViewDelegate<Model, ip0.oh> {
    public final ihm.f e;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/ExtraSmallTileDelegate$Model;", "Lqv0/i;", "Lqv0/p;", "Lcom/revolut/core/ui_kit_core/actionshandler/TrackableItem;", "", "toString", "()Ljava/lang/String;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Model implements qv0.i, qv0.p, TrackableItem {
    }

    public ExtraSmallTileDelegate() {
        super(R$layout.internal_delegate_extra_small_tile, true, new ip0.zf(12));
        this.e = v0.a.d("create(...)");
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View itemView = kotlin.jvm.internal.s.r(parent, R$layout.internal_delegate_extra_small_tile);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        ip0.oh ohVar = new ip0.oh(itemView);
        View viewFindViewById = itemView.findViewById(R$id.extraSmallTile_overlappedIconsView);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        View viewFindViewById2 = itemView.findViewById(R$id.extraSmallTile_titleText);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        View viewFindViewById3 = itemView.findViewById(R$id.extraSmallTile_descriptionText);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        return ohVar;
    }

    @Override // com.revolut.core.ui_kit.recycler.BaseBoxRecyclerViewDelegate, com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate, koi.k
    /* JADX INFO: renamed from: j */
    public final /* bridge */ /* synthetic */ void p(RecyclerView.ViewHolder viewHolder, koi.j jVar, int i, List list) {
        q((ip0.oh) viewHolder, i, list);
    }

    @Override // com.revolut.core.ui_kit.recycler.BaseBoxRecyclerViewDelegate, com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    /* JADX INFO: renamed from: m */
    public final /* bridge */ /* synthetic */ void p(koi.b bVar, koi.j jVar, int i, List list) {
        q((ip0.oh) bVar, i, list);
    }

    @Override // com.revolut.core.ui_kit.recycler.BaseBoxRecyclerViewDelegate
    public final /* bridge */ /* synthetic */ void p(koi.b bVar, qv0.i iVar, int i, List list) {
        q((ip0.oh) bVar, i, list);
    }

    public final void q(ip0.oh holder, int i, List payloads) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(null, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, null, i, payloads);
        boolean zIsEmpty = payloads.isEmpty();
        boolean zIsEmpty2 = payloads.isEmpty();
        boolean zIsEmpty3 = payloads.isEmpty();
        Iterator it8 = payloads.iterator();
        while (it8.hasNext()) {
            it8.next();
        }
        if (zIsEmpty || zIsEmpty2 || zIsEmpty3) {
            throw null;
        }
        View itemView = holder.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        or0.m.a(itemView);
        itemView.setOnClickListener(new au0.r2(null, this, 8));
    }
}
