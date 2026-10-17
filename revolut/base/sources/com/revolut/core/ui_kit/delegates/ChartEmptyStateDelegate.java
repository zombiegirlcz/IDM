package com.revolut.core.ui_kit.delegates;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.image.type.complex.ComplexImage;
import com.revolut.core.ui_kit.recycler.BaseBoxRecyclerViewDelegate;
import com.revolut.core.ui_kit.views.FullScreenStateView;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00062\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0004\u0003\u0002\u0007\bB\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\t"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/ChartEmptyStateDelegate;", "Lcom/revolut/core/ui_kit/recycler/BaseBoxRecyclerViewDelegate;", "Lip0/ga;", "Lip0/ia;", "<init>", "()V", "Companion", "ip0/ha", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ChartEmptyStateDelegate extends BaseBoxRecyclerViewDelegate<ip0.ga, ip0.ia> {
    public ChartEmptyStateDelegate() {
        super(R$layout.internal_delegate_chart_empty_state, true, new ip0.h8(15));
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        ip0.ia iaVar = new ip0.ia(kotlin.jvm.internal.s.r(parent, R$layout.internal_delegate_chart_empty_state));
        FullScreenStateView fullScreenStateView = iaVar.f;
        fullScreenStateView.setTitleSingleLine(true);
        fullScreenStateView.setCaptionSingleLine(true);
        fullScreenStateView.setCaptionClickable(false);
        fullScreenStateView.setImageSize(64, 64);
        return iaVar;
    }

    @Override // com.revolut.core.ui_kit.recycler.BaseBoxRecyclerViewDelegate
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public final void p(ip0.ia holder, ip0.ga data, int i, List list) {
        List payloads = list;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, list);
        FullScreenStateView fullScreenStateView = holder.f;
        int size = payloads.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                break;
            }
            if (!(payloads.get(i2) instanceof ip0.ha)) {
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
        boolean z4 = z3;
        for (int i3 = 0; i3 < size2; i3++) {
            ip0.ha haVar = (ip0.ha) payloads.get(i3);
            zIsEmpty = zIsEmpty || haVar.f164524a;
            z = z || haVar.f164525b;
            z3 = z3 || haVar.f164526c;
            z4 = z4 || haVar.d;
        }
        if (zIsEmpty) {
            fullScreenStateView.setTitleText(data.f164376b);
        }
        if (z) {
            FullScreenStateView.setCaptionText$default(fullScreenStateView, data.f164377c, null, 2, null);
        }
        if (z3) {
            FullScreenStateView.setImage$default(fullScreenStateView, new ComplexImage.Regular(data.d), null, 2, null);
        }
        if (z4) {
            View itemView = holder.itemView;
            Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
            or0.b.c(this, data, itemView, false, null, 28);
        }
    }
}
