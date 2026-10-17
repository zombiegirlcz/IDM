package com.revolut.core.ui_kit.delegates;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import ip0.hq;
import ip0.qt;
import ip0.rt;
import ip0.st;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003\u0002\u0006\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/LinearProgressWithAmountLoadingDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lip0/qt;", "Lip0/st;", "<init>", "()V", "ip0/rt", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class LinearProgressWithAmountLoadingDelegate extends BaseRecyclerViewDelegate<qt, st> {
    public LinearProgressWithAmountLoadingDelegate() {
        super(R$layout.internal_delegate_linear_progress_with_amount_loading, new hq(20));
        v0.a.d("create(...)");
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View view = kotlin.jvm.internal.s.r(parent, R$layout.internal_delegate_linear_progress_with_amount_loading);
        Intrinsics.checkNotNullParameter(view, "view");
        return new st(view);
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    public final void p(st holder, qt data, int i, List payloads) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, payloads);
        boolean zIsEmpty = payloads.isEmpty();
        Iterator it8 = payloads.iterator();
        boolean z = zIsEmpty;
        while (true) {
            if (!it8.hasNext()) {
                break;
            }
            Object next = it8.next();
            if (!(next instanceof rt)) {
                zIsEmpty = true;
                z = true;
                break;
            } else {
                zIsEmpty = zIsEmpty || ((rt) next).f166235b;
                z = z || ((rt) next).f166234a;
            }
        }
        data.getClass();
        holder.itemView.setOnClickListener(null);
        if (zIsEmpty || z) {
            View itemView = holder.itemView;
            Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
            or0.b.c(this, data, itemView, false, null, 24);
        }
    }
}
