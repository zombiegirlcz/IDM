package com.revolut.core.ui_kit.delegates;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.internal.views.trend.TrendPreviewView;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import ip0.dm0;
import ip0.em0;
import ip0.fm0;
import ip0.ri0;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00062\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0004\u0002\u0007\u0003\bB\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\t"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/TrendPreviewLoadingDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lip0/dm0;", "Lip0/fm0;", "<init>", "()V", "Companion", "ip0/em0", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TrendPreviewLoadingDelegate extends BaseRecyclerViewDelegate<dm0, fm0> {
    public TrendPreviewLoadingDelegate() {
        super(R$layout.internal_delegate_trend_preview_loading, new ri0(21));
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new fm0(kotlin.jvm.internal.s.r(parent, this.f98535a));
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    public final void p(fm0 holder, dm0 data, int i, List payloads) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, payloads);
        ShimmerFrameLayout shimmerFrameLayout = holder.f164289g;
        TrendPreviewView trendPreviewView = holder.f;
        ifk.b.r(shimmerFrameLayout);
        if (payloads.isEmpty()) {
            trendPreviewView.setItems(data.f163928b);
            aw0.ya.Companion.getClass();
            trendPreviewView.setChartColor(aw0.ya.f10633g);
            trendPreviewView.setFillFraction(data.f163929c);
            View itemView = holder.itemView;
            Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
            or0.b.c(this, data, itemView, false, null, 28);
            return;
        }
        for (Object obj2 : payloads) {
            if (!(obj2 instanceof em0)) {
                throw new IllegalArgumentException(v0.a.g(obj2, "payload has wrong type: ").toString());
            }
            em0 em0Var = (em0) obj2;
            if (em0Var.f164125a) {
                trendPreviewView.setItems(data.f163928b);
            }
            if (em0Var.f164127c) {
                trendPreviewView.setFillFraction(data.f163929c);
            }
            if (em0Var.f164126b) {
                View itemView2 = holder.itemView;
                Intrinsics.checkNotNullExpressionValue(itemView2, "itemView");
                or0.b.c(this, data, itemView2, false, null, 28);
            }
        }
    }
}
