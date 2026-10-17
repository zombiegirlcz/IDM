package com.revolut.core.ui_kit.delegates;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.R$drawable;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import ip0.je0;
import ip0.nf0;
import ip0.pf0;
import ip0.qf0;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/SmallCardLoadingDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lip0/nf0;", "Lip0/pf0;", "ip0/of0", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SmallCardLoadingDelegate extends BaseRecyclerViewDelegate<nf0, pf0> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final aw0.d0 f53377c;

    public SmallCardLoadingDelegate() {
        this(null);
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new pf0(kotlin.jvm.internal.s.r(parent, R$layout.internal_delegate_small_card_loading));
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    public final void p(pf0 holder, nf0 data, int i, List payloads) {
        int i2;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, payloads);
        ImageView imageView = holder.f165821h;
        aw0.d0 d0Var = this.f53377c;
        if (d0Var != null) {
            ConstraintLayout constraintLayout = holder.f165820g;
            int id10 = imageView.getId();
            ConstraintSet constraintSetL = ip0.v7.l(constraintLayout);
            constraintSetL.setDimensionRatio(id10, d0Var.f10274a + ":" + d0Var.f10275b);
            constraintSetL.applyTo(constraintLayout);
        }
        ifk.b.r(holder.f);
        View itemView = holder.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        or0.b.c(this, data, itemView, false, null, 28);
        int i3 = qf0.f165973a[data.f165500b.ordinal()];
        if (i3 == 1) {
            i2 = R$drawable.internal_purple_gradient_background;
        } else if (i3 == 2) {
            i2 = R$drawable.internal_teal_gradient_background;
        } else {
            if (i3 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            i2 = R$drawable.internal_accent_gradient_background;
        }
        imageView.setBackgroundResource(i2);
    }

    public SmallCardLoadingDelegate(aw0.d0 d0Var) {
        super(R$layout.internal_delegate_small_card_loading, new je0(8));
        this.f53377c = d0Var;
    }
}
