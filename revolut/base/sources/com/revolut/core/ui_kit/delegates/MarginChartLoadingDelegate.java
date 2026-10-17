package com.revolut.core.ui_kit.delegates;

import android.content.Context;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.shimmer.ShimmerConstraintLayout;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.recycler.BaseBoxRecyclerViewDelegate;
import ip0.fv;
import ip0.fx;
import ip0.hx;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003\u0002\u0006\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/MarginChartLoadingDelegate;", "Lcom/revolut/core/ui_kit/recycler/BaseBoxRecyclerViewDelegate;", "Lip0/fx;", "Lip0/hx;", "<init>", "()V", "ip0/gx", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class MarginChartLoadingDelegate extends BaseBoxRecyclerViewDelegate<fx, hx> {
    public MarginChartLoadingDelegate() {
        super(R$layout.internal_delegate_margin_chart_loading, true, new fv(11));
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        hx hxVar = new hx(kotlin.jvm.internal.s.r(parent, this.f58164c));
        c9.f fVar = c9.f.SHIMMERING_CHILDREN_ONLY;
        ShimmerConstraintLayout shimmerConstraintLayout = hxVar.f;
        shimmerConstraintLayout.setShimmerMode(fVar);
        Context context = hxVar.itemView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        shimmerConstraintLayout.h0(yp0.a0.a(context));
        return hxVar;
    }
}
