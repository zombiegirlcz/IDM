package com.revolut.core.ui_kit.delegates;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.recycler.BaseGroupRecyclerViewDelegate;
import ip0.je0;
import ip0.yg0;
import ip0.zg0;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003\u0002\u0006\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/SplitColumnCellLoadingDelegate;", "Lcom/revolut/core/ui_kit/recycler/BaseGroupRecyclerViewDelegate;", "Lcom/revolut/core/ui_kit/delegates/kh;", "Lip0/zg0;", "<init>", "()V", "ip0/yg0", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SplitColumnCellLoadingDelegate extends BaseGroupRecyclerViewDelegate<kh, zg0> {
    public SplitColumnCellLoadingDelegate() {
        super(R$layout.internal_delegate_split_column_cell_loading, new je0(19));
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new zg0(kotlin.jvm.internal.s.r(parent, R$layout.internal_delegate_split_column_cell_loading));
    }

    @Override // com.revolut.core.ui_kit.recycler.BaseGroupRecyclerViewDelegate
    public final void q(koi.b bVar, qv0.l lVar, int i, List payloads) {
        zg0 holder = (zg0) bVar;
        kh data = (kh) lVar;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        int size = payloads.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                break;
            }
            if (!(payloads.get(i2) instanceof yg0)) {
                payloads = null;
                break;
            }
            i2++;
        }
        if (payloads == null) {
            payloads = zhm.f0.f322471a;
        }
        boolean zIsEmpty = payloads.isEmpty();
        int size2 = payloads.size();
        boolean z = zIsEmpty;
        for (int i3 = 0; i3 < size2; i3++) {
            yg0 yg0Var = (yg0) payloads.get(i3);
            zIsEmpty = zIsEmpty || yg0Var.f167313b;
            z = z || yg0Var.f167312a;
        }
        if (zIsEmpty) {
            zq0.b.d(holder.f167464g, holder.f167465h, data.f54391g, data.f54394l, true, false);
            qv0.c cVar = data.f54391g;
            View itemView = holder.itemView;
            Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
            or0.b.j(this, cVar, itemView);
            View itemView2 = holder.itemView;
            Intrinsics.checkNotNullExpressionValue(itemView2, "itemView");
            or0.b.o(this, data, itemView2);
        }
        if (z) {
            dh columnsWidthsMode = data.f54389b;
            holder.getClass();
            Intrinsics.checkNotNullParameter(columnsWidthsMode, "columnsWidthsMode");
            holder.f.a(columnsWidthsMode);
        }
    }
}
