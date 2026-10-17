package com.revolut.core.ui_kit.delegates;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0005\u0003\u0002\u0006\u0007\bB\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\t"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/AvatarLoadingDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lip0/d2;", "Lip0/e2;", "<init>", "()V", "ip0/b2", "ip0/c2", "ip0/g2", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AvatarLoadingDelegate extends BaseRecyclerViewDelegate<ip0.d2, ip0.e2> {
    public AvatarLoadingDelegate() {
        super(R$layout.internal_delegate_avatar_loading, new ip0.c(22));
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new ip0.e2(kotlin.jvm.internal.s.r(parent, R$layout.internal_delegate_avatar_loading));
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    public final void p(ip0.e2 holder, ip0.d2 data, int i, List payloads) {
        int i2;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, payloads);
        ImageView imageView = holder.f164008h;
        ImageView imageView2 = holder.f164007g;
        boolean zN = ue0.e.n(payloads);
        boolean zN2 = ue0.e.n(payloads);
        Iterator it8 = payloads.iterator();
        while (true) {
            boolean z = true;
            if (!it8.hasNext()) {
                break;
            }
            Object next = it8.next();
            if (next instanceof ip0.b2) {
                zN = zN || ((ip0.b2) next).f163517a;
                if (!zN2 && !((ip0.b2) next).f163518b) {
                    z = false;
                }
                zN2 = z;
            }
        }
        if (zN) {
            int i3 = ip0.f2.f164184a[data.k.ordinal()];
            if (i3 == 1) {
                imageView2.setVisibility(0);
                imageView.setVisibility(4);
            } else {
                if (i3 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                imageView2.setVisibility(4);
                imageView.setVisibility(0);
            }
        }
        if (zN2) {
            int i5 = ip0.f2.f164185b[data.f163829l.ordinal()];
            if (i5 == 1) {
                i2 = -2;
            } else {
                if (i5 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                i2 = -1;
            }
            View itemView = holder.itemView;
            Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
            ViewGroup.LayoutParams layoutParams = itemView.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            layoutParams.width = i2;
            itemView.setLayoutParams(layoutParams);
            ViewGroup viewGroup = holder.i;
            ViewGroup.LayoutParams layoutParams2 = viewGroup.getLayoutParams();
            if (layoutParams2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            layoutParams2.width = i2;
            viewGroup.setLayoutParams(layoutParams2);
        }
        ifk.b.r(holder.f);
    }
}
