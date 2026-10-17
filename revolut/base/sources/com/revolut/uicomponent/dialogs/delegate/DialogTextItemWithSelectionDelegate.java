package com.revolut.uicomponent.dialogs.delegate;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import com.revolut.uicomponent.R$id;
import java.util.List;
import koi.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import syl.i;
import syl.j;
import yhm.d;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lcom/revolut/uicomponent/dialogs/delegate/DialogTextItemWithSelectionDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lsyl/j;", "Lsyl/i;", "core_ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@d
public final class DialogTextItemWithSelectionDelegate extends BaseRecyclerViewDelegate<j, i> {
    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View itemView = s.r(parent, this.f98535a);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        i iVar = new i(itemView);
        View viewFindViewById = itemView.findViewById(R$id.dialog_item_title);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        View viewFindViewById2 = itemView.findViewById(R$id.dialog_item_checked_tick);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        return iVar;
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate, koi.k
    /* JADX INFO: renamed from: j */
    public final void p(RecyclerView.ViewHolder viewHolder, koi.j jVar, int i, List payloads) {
        i holder = (i) viewHolder;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(null, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, null, i, payloads);
        throw null;
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    /* JADX INFO: renamed from: m */
    public final void p(b bVar, koi.j jVar, int i, List payloads) {
        i holder = (i) bVar;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(null, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, null, i, payloads);
        throw null;
    }
}
