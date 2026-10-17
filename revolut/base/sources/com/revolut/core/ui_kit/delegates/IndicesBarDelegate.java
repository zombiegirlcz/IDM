package com.revolut.core.ui_kit.delegates;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.internal.views.IndicesBarView$IndexBarDelegate;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import ip0.cq;
import ip0.dk;
import ip0.dq;
import ip0.eq;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003\u0002\u0006\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/IndicesBarDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lip0/cq;", "Lip0/eq;", "<init>", "()V", "ip0/dq", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class IndicesBarDelegate extends BaseRecyclerViewDelegate<cq, eq> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final IndicesBarView$IndexBarDelegate f52516c;

    public IndicesBarDelegate() {
        super(R$id.internal_indices_bar_delegate_view_type, new dk(28));
        this.f52516c = new IndicesBarView$IndexBarDelegate();
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        ms0.i1 i1Var = new ms0.i1(context, this.f52516c);
        i1Var.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        return new eq(i1Var);
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    public final void p(eq holder, cq data, int i, List payloads) {
        cq cqVar;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, payloads);
        boolean zN = ue0.e.n(payloads);
        boolean zN2 = ue0.e.n(payloads);
        for (Object obj2 : payloads) {
            if (obj2 instanceof dq) {
                boolean z = true;
                zN = zN || ((dq) obj2).f163937a;
                if (!zN2 && !((dq) obj2).f163938b) {
                    z = false;
                }
                zN2 = z;
            }
        }
        if (zN2) {
            View itemView = holder.itemView;
            Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
            cqVar = data;
            or0.b.c(this, cqVar, itemView, false, null, 28);
        } else {
            cqVar = data;
        }
        if (zN) {
            holder.f.setItems(cqVar.f163776a);
        }
    }
}
