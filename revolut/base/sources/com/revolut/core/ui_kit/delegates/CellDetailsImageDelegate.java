package com.revolut.core.ui_kit.delegates;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003\u0003\u0002\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/CellDetailsImageDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lip0/i7;", "Lip0/k7;", "<init>", "()V", "ip0/j7", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CellDetailsImageDelegate extends BaseRecyclerViewDelegate<ip0.i7, ip0.k7> {
    public CellDetailsImageDelegate() {
        super(R$layout.internal_delegate_cell_details_image, new ip0.g4(21));
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new ip0.k7(kotlin.jvm.internal.s.r(parent, R$layout.internal_delegate_cell_details_image));
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    public final void p(ip0.k7 holder, ip0.i7 data, int i, List payloads) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, payloads);
        ImageView imageView = holder.f164973h;
        TextView textView = holder.f164972g;
        TextView textView2 = holder.f;
        if (payloads.isEmpty()) {
            or0.b.e(this, data.f164646a, textView2, null, 12);
            or0.b.e(this, data.f164647b, textView, null, 12);
            or0.b.f(this, data.f164648c, imageView);
            View itemView = holder.itemView;
            Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
            or0.b.c(this, data, itemView, false, null, 28);
        } else {
            List list = payloads;
            ArrayList<ip0.j7> arrayList = new ArrayList(zhm.w.t(list, 10));
            for (Object obj2 : list) {
                Intrinsics.i(obj2, "null cannot be cast to non-null type com.revolut.core.ui_kit.delegates.CellDetailsImageDelegate.Payload");
                arrayList.add((ip0.j7) obj2);
            }
            for (ip0.j7 j7Var : arrayList) {
                if (j7Var.f164797a) {
                    or0.b.e(this, data.f164646a, textView2, null, 12);
                }
                if (j7Var.f164798b) {
                    or0.b.e(this, data.f164647b, textView, null, 12);
                }
                if (j7Var.f164799c) {
                    or0.b.f(this, data.f164648c, imageView);
                }
                if (j7Var.d) {
                    View itemView2 = holder.itemView;
                    Intrinsics.checkNotNullExpressionValue(itemView2, "itemView");
                    or0.b.c(this, data, itemView2, false, null, 28);
                }
            }
        }
        View itemView3 = holder.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView3, "itemView");
        gq0.d[] elements = {hx7.b.f(data.f164646a), hx7.b.f(data.f164647b)};
        Intrinsics.checkNotNullParameter(elements, "elements");
        hx7.b.u(kotlin.collections.d.L(elements), itemView3);
    }
}
