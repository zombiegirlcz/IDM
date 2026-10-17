package com.revolut.core.ui_kit.delegates;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.recycler.BaseBoxRecyclerViewDelegate;
import ip0.pl0;
import ip0.ql0;
import ip0.ri0;
import ip0.rl0;
import ip0.sl0;
import ip0.tl0;
import ip0.ul0;
import ip0.wn;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class fi extends wn {
    public final z4l.j f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fi(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        View viewFindViewById = itemView.findViewById(R$id.transactionsCountPreview_itemsRecyclerView);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        RecyclerView recyclerView = (RecyclerView) viewFindViewById;
        z4l.j jVar = new z4l.j(7, zhm.u.c(new BaseBoxRecyclerViewDelegate<rl0, ul0>() { // from class: com.revolut.core.ui_kit.delegates.TransactionsCountPreviewDelegate$ViewHolder$ItemSkeletonDelegate
            {
                int i = R$layout.internal_delegate_transaction_skeleton_delegate;
                new ri0(17);
            }

            @Override // koi.k
            public final RecyclerView.ViewHolder g(ViewGroup parent) {
                Intrinsics.checkNotNullParameter(parent, "parent");
                return new ul0(kotlin.jvm.internal.s.r(parent, R$layout.internal_delegate_transaction_skeleton_delegate));
            }

            @Override // com.revolut.core.ui_kit.recycler.BaseBoxRecyclerViewDelegate
            /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
            public final void p(ul0 holder, rl0 data, int i, List payloads) {
                Intrinsics.checkNotNullParameter(holder, "holder");
                Intrinsics.checkNotNullParameter(data, "data");
                Intrinsics.checkNotNullParameter(payloads, "payloads");
                super.p(holder, data, i, payloads);
                int size = payloads.size();
                int i2 = 0;
                while (true) {
                    if (i2 >= size) {
                        break;
                    }
                    if (!(payloads.get(i2) instanceof sl0)) {
                        payloads = null;
                        break;
                    }
                    i2++;
                }
                boolean zN = ue0.e.n(payloads);
                if (payloads != null) {
                    int size2 = payloads.size();
                    for (int i3 = 0; i3 < size2; i3++) {
                        zN = zN || ((sl0) payloads.get(i3)).f166366b;
                    }
                }
                if (zN) {
                    ql0 style = data.f166206b;
                    List list = holder.f;
                    Intrinsics.checkNotNullParameter(style, "style");
                    int i5 = tl0.f166538a[style.ordinal()];
                    if (i5 == 1) {
                        holder.itemView.setTag(Integer.valueOf(R$id.internal_transactionsCountPreviewDelegate_transactionSkeleton));
                        int size3 = list.size();
                        for (int i6 = 0; i6 < size3; i6++) {
                            ((View) list.get(i6)).setVisibility(0);
                        }
                        return;
                    }
                    if (i5 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    holder.itemView.setTag(Integer.valueOf(R$id.internal_transactionsCountPreviewDelegate_contentSkeleton));
                    int size4 = list.size();
                    for (int i21 = 0; i21 < size4; i21++) {
                        ((View) list.get(i21)).setVisibility(8);
                    }
                }
            }
        }), false);
        this.f = jVar;
        Context context = recyclerView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        yp0.y.h(recyclerView, jVar, new pl0(context));
    }
}
