package com.revolut.core.ui_kit.delegates;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.R$id;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import ip0.fv;
import ip0.mz;
import ip0.nz;
import ip0.oz;
import ip0.pz;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00062\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0005\u0003\u0002\u0007\b\tB\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\n"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/OrderBookHeaderDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lip0/nz;", "Lip0/pz;", "<init>", "()V", "Companion", "ip0/mz", "ip0/oz", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class OrderBookHeaderDelegate extends BaseRecyclerViewDelegate<nz, pz> {
    public OrderBookHeaderDelegate() {
        super(R$id.internal_order_book_header_delegate, new fv(28));
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        cu0.a aVar = new cu0.a(context, null, 6, 0);
        aVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        return new pz(aVar);
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    public final void p(pz holder, nz data, int i, List payloads) {
        nz nzVar;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, payloads);
        cu0.a aVar = holder.f;
        boolean zIsEmpty = payloads.isEmpty();
        boolean z = zIsEmpty;
        for (Object obj2 : payloads) {
            Intrinsics.i(obj2, "null cannot be cast to non-null type com.revolut.core.ui_kit.delegates.OrderBookHeaderDelegate.OrderBookHeaderModelPayload");
            oz ozVar = (oz) obj2;
            z = z || ozVar.f165738a;
            zIsEmpty = zIsEmpty || ozVar.f165739b;
        }
        if (zIsEmpty) {
            View itemView = holder.itemView;
            Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
            nzVar = data;
            or0.b.c(this, nzVar, itemView, false, null, 28);
        } else {
            nzVar = data;
        }
        if (z) {
            mz mzVar = nzVar.f165590a;
            boolean z3 = mzVar.f165434c;
            aVar.setText(mzVar.f165432a, mzVar.f165433b);
            aVar.setProgress(50, z3);
            float f = z3 ? 46.0f : 60.0f;
            Context context = holder.itemView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            aVar.setMinimumHeight(kli.a.k(context, f));
        }
    }
}
