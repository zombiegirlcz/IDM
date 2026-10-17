package com.revolut.core.ui_kit.delegates;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.R$drawable;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import ip0.fv;
import ip0.qv;
import ip0.rv;
import ip0.sv;
import ip0.tv;
import ip0.uv;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003\u0003\u0002\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/ListingTileLoadingDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lip0/rv;", "Lip0/tv;", "<init>", "()V", "ip0/sv", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ListingTileLoadingDelegate extends BaseRecyclerViewDelegate<rv, tv> {
    public ListingTileLoadingDelegate() {
        super(R$layout.internal_delegate_listing_tile_loading, new fv(1));
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new tv(kotlin.jvm.internal.s.r(parent, R$layout.internal_delegate_listing_tile_loading));
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    public final void p(tv holder, rv data, int i, List payloads) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, payloads);
        View itemView = holder.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        or0.b.c(this, data, itemView, false, null, 28);
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : payloads) {
            if (obj2 instanceof sv) {
                arrayList.add(obj2);
            }
        }
        boolean zIsEmpty = arrayList.isEmpty();
        Iterator it8 = arrayList.iterator();
        while (it8.hasNext()) {
            zIsEmpty = zIsEmpty || ((sv) it8.next()).f166389a;
        }
        ifk.b.r(holder.f);
        if (zIsEmpty) {
            qv qvVar = data.f166243b;
            ImageView imageView = holder.f166566g;
            int i2 = uv.f166732a[qvVar.ordinal()];
            if (i2 == 1) {
                imageView.setBackgroundResource(R$drawable.internal_purple_grey_gradient_background);
                imageView.setAlpha(0.3f);
            } else {
                if (i2 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                Context context = imageView.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                imageView.setBackground(new ColorDrawable(kli.a.s(R$attr.uikit_colorShimmer, context)));
                imageView.setAlpha(1.0f);
            }
        }
    }
}
