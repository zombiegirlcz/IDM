package com.revolut.core.ui_kit.delegates;

import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import ip0.qn0;
import ip0.tn0;
import ip0.un0;
import ip0.vn0;
import ip0.wn0;
import ip0.xn0;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0004\u0003\u0006\u0002\u0007B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/VoucherExtraSmallLoadingDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lip0/un0;", "Lip0/xn0;", "<init>", "()V", "ip0/tn0", "ip0/vn0", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class VoucherExtraSmallLoadingDelegate extends BaseRecyclerViewDelegate<un0, xn0> {
    public VoucherExtraSmallLoadingDelegate() {
        super(R$layout.internal_delegate_extra_small_voucher_loading, new qn0(1));
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new xn0(kotlin.jvm.internal.s.r(parent, this.f98535a));
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    public final void p(xn0 holder, un0 data, int i, List payloads) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, payloads);
        ShimmerFrameLayout shimmerFrameLayout = holder.f;
        boolean zN = ue0.e.n(payloads);
        Iterator it8 = payloads.iterator();
        while (true) {
            boolean z = true;
            if (!it8.hasNext()) {
                break;
            }
            Object next = it8.next();
            if (next instanceof vn0) {
                if (!zN && !((vn0) next).f166855a) {
                    z = false;
                }
                zN = z;
            }
        }
        if (zN) {
            tn0 mode = data.f;
            View view = holder.i;
            View view2 = holder.f167202h;
            ViewGroup viewGroup = holder.f167201g;
            Intrinsics.checkNotNullParameter(mode, "mode");
            int i2 = wn0.f167052a[mode.ordinal()];
            if (i2 == 1) {
                ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
                if (layoutParams != null) {
                    layoutParams.height = -2;
                }
                ViewGroup.LayoutParams layoutParams2 = shimmerFrameLayout.getLayoutParams();
                if (layoutParams2 != null) {
                    layoutParams2.height = -2;
                }
                ViewGroup.LayoutParams layoutParams3 = view2.getLayoutParams();
                if (layoutParams3 != null) {
                    layoutParams3.height = -2;
                }
                ViewGroup.LayoutParams layoutParams4 = view.getLayoutParams();
                ConstraintLayout.LayoutParams layoutParams5 = layoutParams4 instanceof ConstraintLayout.LayoutParams ? (ConstraintLayout.LayoutParams) layoutParams4 : null;
                if (layoutParams5 != null) {
                    layoutParams5.dimensionRatio = "H,109:57";
                }
            } else {
                if (i2 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                ViewGroup.LayoutParams layoutParams6 = viewGroup.getLayoutParams();
                if (layoutParams6 != null) {
                    layoutParams6.height = -1;
                }
                ViewGroup.LayoutParams layoutParams7 = shimmerFrameLayout.getLayoutParams();
                if (layoutParams7 != null) {
                    layoutParams7.height = -1;
                }
                ViewGroup.LayoutParams layoutParams8 = view2.getLayoutParams();
                if (layoutParams8 != null) {
                    layoutParams8.height = -1;
                }
                ViewGroup.LayoutParams layoutParams9 = view.getLayoutParams();
                ConstraintLayout.LayoutParams layoutParams10 = layoutParams9 instanceof ConstraintLayout.LayoutParams ? (ConstraintLayout.LayoutParams) layoutParams9 : null;
                if (layoutParams10 != null) {
                    layoutParams10.dimensionRatio = null;
                }
            }
        }
        ifk.b.r(shimmerFrameLayout);
        View itemView = holder.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        or0.b.c(this, data, itemView, false, null, 28);
    }
}
