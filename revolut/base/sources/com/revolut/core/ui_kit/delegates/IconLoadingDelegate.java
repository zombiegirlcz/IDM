package com.revolut.core.ui_kit.delegates;

import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import ip0.dk;
import ip0.ep;
import ip0.gp;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0002\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/IconLoadingDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lip0/ep;", "Lip0/gp;", "<init>", "()V", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class IconLoadingDelegate extends BaseRecyclerViewDelegate<ep, gp> {
    public IconLoadingDelegate() {
        super(R$layout.internal_delegate_icon_loading, new dk(23));
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new gp(kotlin.jvm.internal.s.r(parent, this.f98535a));
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    public final void p(gp holder, ep data, int i, List payloads) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, payloads);
        ImageView imageView = holder.f;
        imageView.setClipToOutline(true);
        imageView.setOutlineProvider(holder.f164459h);
        ifk.b.r(holder.f164458g);
    }
}
