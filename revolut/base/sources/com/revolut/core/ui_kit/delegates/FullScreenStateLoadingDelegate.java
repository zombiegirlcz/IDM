package com.revolut.core.ui_kit.delegates;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import ip0.dk;
import ip0.ek;
import ip0.gk;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00062\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003\u0002\u0003\u0007B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/FullScreenStateLoadingDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lip0/ek;", "Lip0/gk;", "<init>", "()V", "Companion", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class FullScreenStateLoadingDelegate extends BaseRecyclerViewDelegate<ek, gk> {

    @NotNull
    private static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public FullScreenStateLoadingDelegate() {
        super(R$layout.internal_delegate_full_screen_state_loading, new dk(0));
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new gk(kotlin.jvm.internal.s.r(parent, this.f98535a));
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    public final void p(gk holder, ek data, int i, List payloads) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, payloads);
        ShimmerFrameLayout shimmerFrameLayout = holder.f;
        shimmerFrameLayout.setClipToOutline(true);
        shimmerFrameLayout.setOutlineProvider(holder.i);
        ShimmerFrameLayout shimmerFrameLayout2 = holder.f164432h;
        ShimmerFrameLayout shimmerFrameLayout3 = holder.f164431g;
        Intrinsics.checkNotNullParameter(data, "data");
        if (data.f164116b) {
            shimmerFrameLayout.setVisibility(0);
            ifk.b.r(shimmerFrameLayout);
        } else {
            shimmerFrameLayout.setVisibility(8);
            shimmerFrameLayout.d(null);
        }
        if (data.f164117c) {
            shimmerFrameLayout3.setVisibility(0);
            shimmerFrameLayout2.setVisibility(0);
            ifk.b.r(shimmerFrameLayout3);
            ifk.b.r(shimmerFrameLayout2);
        } else {
            shimmerFrameLayout3.setVisibility(8);
            shimmerFrameLayout2.setVisibility(8);
            shimmerFrameLayout3.d(null);
            shimmerFrameLayout2.d(null);
        }
        View itemView = holder.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        or0.b.c(this, data, itemView, true, null, 24);
    }
}
