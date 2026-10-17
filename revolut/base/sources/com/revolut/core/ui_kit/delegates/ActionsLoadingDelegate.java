package com.revolut.core.ui_kit.delegates;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.delegates.u;
import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0003\u0002B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/ActionsLoadingDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lip0/c0;", "Lip0/d0;", "<init>", "()V", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ActionsLoadingDelegate extends BaseRecyclerViewDelegate<ip0.c0, ip0.d0> {
    public ActionsLoadingDelegate() {
        super(R$layout.internal_delegate_actions_loading, new ip0.c(7));
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new ip0.d0(kotlin.jvm.internal.s.r(parent, R$layout.internal_delegate_actions_loading));
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    public final void p(ip0.d0 holder, ip0.c0 data, int i, List payloads) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, payloads);
        ActionsView actionsView = holder.f;
        u uVar = data.f163663b;
        if (uVar instanceof u.a) {
            actionsView.setLayoutType(((u.a) uVar).f54793b ? mx0.l.DYNAMIC_CIRCLE_ACTIONS : mx0.l.SCROLLABLE);
            actionsView.m(((u.a) data.f163663b).f54792a, true);
        } else {
            if (!uVar.equals(u.b.f54794a)) {
                throw new NoWhenBranchMatchedException();
            }
            actionsView.setLayoutType(mx0.l.SCROLLABLE);
            actionsView.m(1, true);
        }
        View itemView = holder.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        or0.b.c(this, data, itemView, false, null, 28);
    }
}
