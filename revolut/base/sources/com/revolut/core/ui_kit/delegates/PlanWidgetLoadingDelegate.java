package com.revolut.core.ui_kit.delegates;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.shimmer.ShimmerLinearLayout;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.recycler.BaseBoxRecyclerViewDelegate;
import ip0.p20;
import ip0.r20;
import ip0.tz;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003\u0002\u0006\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/PlanWidgetLoadingDelegate;", "Lcom/revolut/core/ui_kit/recycler/BaseBoxRecyclerViewDelegate;", "Lip0/p20;", "Lip0/r20;", "<init>", "()V", "ip0/q20", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PlanWidgetLoadingDelegate extends BaseBoxRecyclerViewDelegate<p20, r20> {
    public PlanWidgetLoadingDelegate() {
        super(R$layout.internal_delegate_plan_widget_loading, true, new tz(20));
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new r20(kotlin.jvm.internal.s.r(parent, this.f58164c));
    }

    @Override // com.revolut.core.ui_kit.recycler.BaseBoxRecyclerViewDelegate
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public final void p(r20 holder, p20 data, int i, List payloads) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, payloads);
        View view = holder.f166085g;
        data.getClass();
        view.setVisibility(8);
        ShimmerLinearLayout shimmerLinearLayout = holder.f;
        Intrinsics.checkNotNullParameter(shimmerLinearLayout, "<this>");
        c9.e eVarB = yp0.a0.b();
        shimmerLinearLayout.f26156b.b(eVarB);
        if (eVarB.f22257n) {
            shimmerLinearLayout.setLayerType(2, shimmerLinearLayout.f26155a);
        } else {
            shimmerLinearLayout.setLayerType(0, null);
        }
    }
}
