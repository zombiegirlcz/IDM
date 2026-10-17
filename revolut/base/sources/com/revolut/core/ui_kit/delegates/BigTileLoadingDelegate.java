package com.revolut.core.ui_kit.delegates;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00062\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0004\u0003\u0002\u0007\bB\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\t"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/BigTileLoadingDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lip0/v4;", "Lip0/x4;", "<init>", "()V", "Companion", "ip0/w4", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class BigTileLoadingDelegate extends BaseRecyclerViewDelegate<ip0.v4, ip0.x4> {
    public static final aw0.d0 d = new aw0.d0(12, 10);
    public static final aw0.d0 e = new aw0.d0(1, 1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ihm.f f51749c;

    public BigTileLoadingDelegate() {
        super(R$layout.internal_delegate_big_tile_loading, new ip0.g4(1));
        this.f51749c = v0.a.d("create(...)");
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new ip0.x4(kotlin.jvm.internal.s.r(parent, this.f98535a));
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    public final void p(ip0.x4 holder, ip0.v4 data, int i, List payloads) {
        aw0.d0 d0Var;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, payloads);
        ifk.b.r(holder.f);
        View itemView = holder.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        or0.b.c(this, data, itemView, false, null, 28);
        ViewGroup viewGroup = holder.f167092g;
        Context context = holder.itemView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        viewGroup.setBackgroundColor(kli.a.s(R$attr.uikit_colorShimmer, context));
        ImageView imageView = holder.f167093h;
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
        int i2 = ip0.y4.f167246a[data.f166763b.ordinal()];
        if (i2 == 1) {
            d0Var = d;
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            d0Var = e;
        }
        layoutParams2.dimensionRatio = a0.d.g(d0Var.f10274a, d0Var.f10275b, "H,", ":");
        imageView.setLayoutParams(layoutParams2);
        this.f51749c.onNext(Integer.valueOf(i));
    }
}
