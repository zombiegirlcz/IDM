package com.revolut.core.ui_kit.delegates;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.internal.views.swipeablecards.cover.SwipeableCardCoverHeaderView;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import ip0.ci0;
import ip0.di0;
import ip0.ei0;
import ip0.je0;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003\u0003\u0002\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/SwipeableCardCoverHeaderDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lip0/ci0;", "Lip0/ei0;", "<init>", "()V", "ip0/di0", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SwipeableCardCoverHeaderDelegate extends BaseRecyclerViewDelegate<ci0, ei0> {
    public SwipeableCardCoverHeaderDelegate() {
        super(R$layout.internal_delegate_swipeable_card_cover_header, new je0(27));
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new ei0(kotlin.jvm.internal.s.r(parent, this.f98535a));
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    public final void p(ei0 holder, ci0 data, int i, List payloads) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, payloads);
        SwipeableCardCoverHeaderView swipeableCardCoverHeaderView = holder.f;
        int size = payloads.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                break;
            }
            if (!(payloads.get(i2) instanceof di0)) {
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
        boolean z3 = z;
        for (int i3 = 0; i3 < size2; i3++) {
            di0 di0Var = (di0) payloads.get(i3);
            zIsEmpty = zIsEmpty || di0Var.f163906a;
            z = z || di0Var.f163907b;
            z3 = z3 || di0Var.f163908c;
        }
        if (zIsEmpty) {
            swipeableCardCoverHeaderView.setSmallTitle(data.f163740a);
        }
        if (z) {
            swipeableCardCoverHeaderView.setBigTitle(data.f163741b);
        }
        if (z3) {
            swipeableCardCoverHeaderView.setSubtitle(data.f163742c);
        }
    }
}
