package com.revolut.uicomponent.dialogs.bottom.delegate;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import com.revolut.uicomponent.R$id;
import java.util.List;
import koi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import ryl.b;
import yhm.d;
import zhm.d0;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003\u0002\u0004\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/uicomponent/dialogs/bottom/delegate/BottomDialogImageTextDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lcom/revolut/uicomponent/dialogs/bottom/delegate/a;", "Lryl/b;", "a", "core_ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@d
public final class BottomDialogImageTextDelegate extends BaseRecyclerViewDelegate<com.revolut.uicomponent.dialogs.bottom.delegate.a, b> {

    public static final class a {
        public final boolean equals(Object obj2) {
            return this == obj2 || (obj2 instanceof a);
        }

        public final int hashCode() {
            return 0;
        }
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View itemView = s.r(parent, this.f98535a);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        b bVar = new b(itemView);
        View viewFindViewById = itemView.findViewById(R$id.title);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        View viewFindViewById2 = itemView.findViewById(R$id.right_label);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        View viewFindViewById3 = itemView.findViewById(R$id.icon);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        return bVar;
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate, koi.k
    /* JADX INFO: renamed from: j */
    public final /* bridge */ /* synthetic */ void p(RecyclerView.ViewHolder viewHolder, j jVar, int i, List list) {
        p((b) viewHolder, i, list);
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    /* JADX INFO: renamed from: m */
    public final /* bridge */ /* synthetic */ void p(koi.b bVar, j jVar, int i, List list) {
        p((b) bVar, i, list);
    }

    public final void p(b holder, int i, List payloads) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(null, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, null, i, payloads);
        if (payloads.isEmpty()) {
            throw null;
        }
        Object objO0 = d0.o0(payloads);
        if (objO0 != null) {
        }
    }
}
