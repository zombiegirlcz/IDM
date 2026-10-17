package com.revolut.core.ui_kit.delegates;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.shimmer.ShimmerConstraintLayout;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.internal.drawables.AnimatedBorderGradientDrawable;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import ip0.je0;
import ip0.oh0;
import ip0.ph0;
import ip0.qh0;
import ip0.rh0;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0003\u0002B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/SummaryCardLoadingDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lip0/qh0;", "Lip0/rh0;", "<init>", "()V", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SummaryCardLoadingDelegate extends BaseRecyclerViewDelegate<qh0, rh0> {
    public SummaryCardLoadingDelegate() {
        super(R$layout.internal_delegate_summary_loading, new je0(25));
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        rh0 rh0Var = new rh0(kotlin.jvm.internal.s.r(parent, R$layout.internal_delegate_summary_loading));
        c.e eVar = new c.e(qv0.h.EXTRA_LARGE, 2);
        ShimmerConstraintLayout shimmerConstraintLayout = rh0Var.f;
        or0.b.j(this, eVar, shimmerConstraintLayout);
        oh0.a(shimmerConstraintLayout);
        return rh0Var;
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate, koi.k
    /* JADX INFO: renamed from: h */
    public final void o(RecyclerView.ViewHolder viewHolder) {
        rh0 holder = (rh0) viewHolder;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(holder, "holder");
        List list = oh0.f165664a;
        ShimmerConstraintLayout view = holder.f;
        Intrinsics.checkNotNullParameter(view, "view");
        AnimatedBorderGradientDrawable animatedBorderGradientDrawableB = oh0.b(view.getBackground());
        if (animatedBorderGradientDrawableB != null) {
            animatedBorderGradientDrawableB.stop();
        }
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate, koi.k
    /* JADX INFO: renamed from: k */
    public final void n(RecyclerView.ViewHolder viewHolder) {
        rh0 holder = (rh0) viewHolder;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(holder, "holder");
        List list = oh0.f165664a;
        ShimmerConstraintLayout view = holder.f;
        Intrinsics.checkNotNullParameter(view, "view");
        AnimatedBorderGradientDrawable animatedBorderGradientDrawableB = oh0.b(view.getBackground());
        if (animatedBorderGradientDrawableB != null) {
            animatedBorderGradientDrawableB.start();
        }
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    public final void n(koi.b bVar) {
        rh0 holder = (rh0) bVar;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(holder, "holder");
        List list = oh0.f165664a;
        ShimmerConstraintLayout view = holder.f;
        Intrinsics.checkNotNullParameter(view, "view");
        AnimatedBorderGradientDrawable animatedBorderGradientDrawableB = oh0.b(view.getBackground());
        if (animatedBorderGradientDrawableB != null) {
            animatedBorderGradientDrawableB.start();
        }
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    public final void o(koi.b bVar) {
        rh0 holder = (rh0) bVar;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(holder, "holder");
        List list = oh0.f165664a;
        ShimmerConstraintLayout view = holder.f;
        Intrinsics.checkNotNullParameter(view, "view");
        AnimatedBorderGradientDrawable animatedBorderGradientDrawableB = oh0.b(view.getBackground());
        if (animatedBorderGradientDrawableB != null) {
            animatedBorderGradientDrawableB.stop();
        }
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    public final void p(rh0 holder, qh0 data, int i, List payloads) {
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
            if (!(payloads.get(i2) instanceof ph0)) {
                payloads = null;
                break;
            }
            i2++;
        }
        List list = payloads;
        if (list != null && !list.isEmpty()) {
            int size2 = payloads.size();
            for (int i3 = 0; i3 < size2; i3++) {
                if (!((ph0) payloads.get(i3)).f165826a) {
                }
            }
            return;
        }
        data.getClass();
        ShimmerConstraintLayout shimmerConstraintLayout = holder.f;
        if (shimmerConstraintLayout.f26147h) {
            shimmerConstraintLayout.g0();
            shimmerConstraintLayout.i0(null);
        }
    }
}
