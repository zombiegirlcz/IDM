package com.revolut.core.ui_kit.delegates;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003\u0002\u0006\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/ComparisonLineChartLoadingDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lip0/qb;", "Lip0/sb;", "<init>", "()V", "ip0/rb", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ComparisonLineChartLoadingDelegate extends BaseRecyclerViewDelegate<ip0.qb, ip0.sb> {
    public ComparisonLineChartLoadingDelegate() {
        super(R$layout.internal_delegate_comparison_line_chart_loading, new ip0.lb(2));
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new ip0.sb(kotlin.jvm.internal.s.r(parent, this.f98535a));
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    public final void p(ip0.sb holder, ip0.qb data, int i, List payloads) {
        int iA;
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
            if (!(payloads.get(i2) instanceof ip0.rb)) {
                payloads = null;
                break;
            }
            i2++;
        }
        List list = payloads;
        boolean z = list == null || list.isEmpty();
        boolean z3 = list == null || list.isEmpty();
        if (payloads != null) {
            int size2 = payloads.size();
            for (int i3 = 0; i3 < size2; i3++) {
                ip0.rb rbVar = (ip0.rb) payloads.get(i3);
                z = z || rbVar.f166156a;
                z3 = z3 || rbVar.f166157b;
            }
        }
        holder.f.post(new fp0.l(holder, 10));
        if (z) {
            View itemView = holder.itemView;
            Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
            int i5 = ip0.tb.f166492a[data.f165953b.ordinal()];
            if (i5 == 1) {
                iA = com.google.android.gms.internal.mlkit_vision_face.a.a(itemView, "getContext(...)", 200.0f);
            } else if (i5 == 2) {
                iA = com.google.android.gms.internal.mlkit_vision_face.a.a(itemView, "getContext(...)", 280.0f);
            } else {
                if (i5 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                iA = -1;
            }
            ViewGroup.LayoutParams layoutParams = itemView.getLayoutParams();
            if (layoutParams != null && layoutParams.height != iA) {
                ViewGroup.LayoutParams layoutParams2 = itemView.getLayoutParams();
                if (layoutParams2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                }
                layoutParams2.height = iA;
                itemView.setLayoutParams(layoutParams2);
            }
        }
        if (z3) {
            View itemView2 = holder.itemView;
            Intrinsics.checkNotNullExpressionValue(itemView2, "itemView");
            or0.b.c(this, data, itemView2, false, null, 28);
        }
    }
}
