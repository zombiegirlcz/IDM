package com.revolut.core.ui_kit.delegates;

import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.internal.views.SmallActionButton;
import com.revolut.core.ui_kit.internal.views.gaugechart.SegmentedGaugeChartView;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import ip0.hd0;
import ip0.id0;
import ip0.t90;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0002\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/SegmentedGaugeChartLoadingDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lip0/hd0;", "Lip0/id0;", "<init>", "()V", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SegmentedGaugeChartLoadingDelegate extends BaseRecyclerViewDelegate<hd0, id0> {
    public SegmentedGaugeChartLoadingDelegate() {
        super(R$layout.internal_delegate_segmented_gauge_chart_loading, new t90(24));
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new id0(kotlin.jvm.internal.s.r(parent, this.f98535a));
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    public final void p(id0 holder, hd0 data, int i, List payloads) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, payloads);
        ShimmerFrameLayout shimmerFrameLayout = holder.f;
        AppCompatTextView appCompatTextView = holder.i;
        SegmentedGaugeChartView segmentedGaugeChartView = holder.f164682g;
        SmallActionButton smallActionButton = holder.f164683h;
        ifk.b.r(shimmerFrameLayout);
        if (data.f164534b) {
            smallActionButton.setVisibility(8);
            appCompatTextView.setVisibility(8);
            segmentedGaugeChartView.setMiniStyle(true);
        } else {
            smallActionButton.setVisibility(0);
            appCompatTextView.setVisibility(0);
            smallActionButton.i(ms0.h4.WHITE_OR_BLACK);
            segmentedGaugeChartView.setMiniStyle(false);
        }
        segmentedGaugeChartView.setData(new com.revolut.core.ui_kit.models.f(zhm.f0.f322471a));
        View itemView = holder.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        or0.b.c(this, data, itemView, false, null, 28);
    }
}
