package com.revolut.core.ui_kit.delegates;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.R$drawable;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003\u0003\u0002\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/ExtraLargeListingCardLoadingDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lip0/zg;", "Lip0/bh;", "<init>", "()V", "ip0/ah", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ExtraLargeListingCardLoadingDelegate extends BaseRecyclerViewDelegate<ip0.zg, ip0.bh> {
    public ExtraLargeListingCardLoadingDelegate() {
        super(R$layout.internal_delegate_extra_large_card_loading, new ip0.zf(8));
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        ip0.bh bhVar = new ip0.bh(kotlin.jvm.internal.s.r(parent, R$layout.internal_delegate_extra_large_card_loading));
        ifk.b.r(bhVar.f);
        return bhVar;
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    public final void p(ip0.bh holder, ip0.zg data, int i, List list) {
        List<ip0.ah> payloads = list;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, list);
        View view = holder.f163610j;
        View view2 = holder.i;
        View view3 = holder.f163609h;
        ImageView imageView = holder.f163608g;
        int size = payloads.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                break;
            }
            if (!(payloads.get(i2) instanceof ip0.ah)) {
                payloads = null;
                break;
            }
            i2++;
        }
        if (payloads == null) {
            payloads = zhm.f0.f322471a;
        }
        boolean zIsEmpty = payloads.isEmpty();
        boolean z = zIsEmpty;
        for (ip0.ah ahVar : payloads) {
            z = z || ahVar.f163444a;
            zIsEmpty = zIsEmpty || ahVar.f163445b;
        }
        if (zIsEmpty) {
            View itemView = holder.itemView;
            Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
            or0.b.c(this, data, itemView, false, null, 28);
        }
        if (z) {
            int i3 = ip0.ch.f163736a[data.f167459b.ordinal()];
            if (i3 == 1) {
                knm.b.z(imageView, true, null, 14);
                imageView.setBackgroundResource(R$drawable.internal_purple_grey_gradient_background);
                knm.b.z(view3, true, null, 14);
                knm.b.z(view2, false, null, 14);
                knm.b.z(view, false, null, 14);
                return;
            }
            if (i3 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            knm.b.z(imageView, false, null, 14);
            knm.b.z(view3, false, null, 14);
            knm.b.z(view2, true, null, 14);
            knm.b.z(view, true, null, 14);
        }
    }
}
