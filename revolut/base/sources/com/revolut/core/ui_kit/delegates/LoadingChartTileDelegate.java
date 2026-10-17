package com.revolut.core.ui_kit.delegates;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.lottie.LottieAnimationView;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.R$raw;
import com.revolut.core.ui_kit.internal.views.UiKitMediaView;
import com.revolut.core.ui_kit_core.displayers.image.models.LottieImage;
import com.revolut.core.ui_kit_core.displayers.image.models.LottieSource;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import ip0.fv;
import ip0.vv;
import ip0.wv;
import ip0.xv;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jmrtd.lds.LDSFile;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00062\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0004\u0002\u0007\u0003\bB\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\t"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/LoadingChartTileDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lip0/vv;", "Lip0/xv;", "<init>", "()V", "Companion", "ip0/wv", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class LoadingChartTileDelegate extends BaseRecyclerViewDelegate<vv, xv> {
    public LoadingChartTileDelegate() {
        super(R$layout.internal_delegate_loading_chart_tile, new fv(2));
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View view = kotlin.jvm.internal.s.r(parent, R$layout.internal_delegate_loading_chart_tile);
        Intrinsics.checkNotNullParameter(view, "view");
        xv xvVar = new xv(view);
        View viewFindViewById = view.findViewById(R$id.loadingChartTile_shimmerLayout);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        View viewFindViewById2 = view.findViewById(R$id.loadingChartTile_chartPlaceholder);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        ifk.b.r((ShimmerFrameLayout) viewFindViewById);
        LottieAnimationView lottieAnimationViewI = ((UiKitMediaView) viewFindViewById2).i();
        yy0.f fVarQ = or0.u.k(lottieAnimationViewI).Q();
        LottieSource.Companion companion = LottieSource.INSTANCE;
        int i = R$raw.internal_lottie_chart_loading;
        companion.getClass();
        LottieSource lottieSourceA = dz0.a.a(companion, i);
        ImageView.ScaleType scaleType = ImageView.ScaleType.FIT_XY;
        yy0.f.e(fVarQ, new LottieImage(lottieSourceA, (List) null, LDSFile.EF_DG14_TAG), lottieAnimationViewI, null, null, 12);
        return xvVar;
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    public final void p(xv holder, vv data, int i, List payloads) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, payloads);
        boolean zIsEmpty = payloads.isEmpty();
        for (Object obj2 : payloads) {
            if (!(obj2 instanceof wv)) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            zIsEmpty |= ((wv) obj2).f167064a;
        }
        if (zIsEmpty) {
            View itemView = holder.itemView;
            Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
            or0.b.c(this, data, itemView, false, null, 28);
        }
    }
}
