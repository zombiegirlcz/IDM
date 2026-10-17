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
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00062\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0005\u0003\u0002\u0007\b\tB\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\n"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/FeedPostLoadingDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lip0/di;", "Lip0/gi;", "<init>", "()V", "Companion", "ip0/ei", "ip0/fi", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class FeedPostLoadingDelegate extends BaseRecyclerViewDelegate<ip0.di, ip0.gi> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final aw0.d0 f52337c = new aw0.d0(4, 5);
    public static final aw0.d0 d = new aw0.d0(1, 1);

    public FeedPostLoadingDelegate() {
        super(R$layout.internal_delegate_feed_post_loading, new ip0.zf(17));
    }

    public static void q(ip0.gi giVar, ip0.fi fiVar) {
        aw0.d0 d0Var;
        int i = ip0.hi.f164563a[fiVar.ordinal()];
        if (i == 1) {
            d0Var = f52337c;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            d0Var = d;
        }
        ImageView imageView = giVar.f164424g;
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
        layoutParams2.dimensionRatio = a0.d.g(d0Var.f10274a, d0Var.f10275b, "H,", ":");
        imageView.setLayoutParams(layoutParams2);
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new ip0.gi(kotlin.jvm.internal.s.r(parent, R$layout.internal_delegate_feed_post_loading));
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    public final void p(ip0.gi holder, ip0.di data, int i, List payloads) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, payloads);
        if (payloads.isEmpty()) {
            q(holder, data.f163901b);
            View itemView = holder.itemView;
            Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
            or0.b.c(this, data, itemView, false, null, 28);
        } else {
            List list = payloads;
            ArrayList<ip0.ei> arrayList = new ArrayList(zhm.w.t(list, 10));
            for (Object obj2 : list) {
                Intrinsics.i(obj2, "null cannot be cast to non-null type com.revolut.core.ui_kit.delegates.FeedPostLoadingDelegate.Payload");
                arrayList.add((ip0.ei) obj2);
            }
            for (ip0.ei eiVar : arrayList) {
                if (eiVar.f164105a) {
                    q(holder, data.f163901b);
                }
                if (eiVar.f164106b) {
                    View itemView2 = holder.itemView;
                    Intrinsics.checkNotNullExpressionValue(itemView2, "itemView");
                    or0.b.c(this, data, itemView2, false, null, 28);
                }
            }
        }
        ifk.b.r(holder.f);
        ViewGroup viewGroup = holder.f164425h;
        Context context = holder.itemView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        viewGroup.setBackgroundColor(kli.a.s(R$attr.uikit_colorShimmer, context));
    }
}
