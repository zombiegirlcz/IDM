package ip0;

import android.view.View;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.internal.views.trend.TrendPreviewView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class fm0 extends koi.b {
    public final TrendPreviewView f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ShimmerFrameLayout f164289g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fm0(View view) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "view");
        View viewFindViewById = view.findViewById(R$id.trendPreviewLoading_chart);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f = (TrendPreviewView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R$id.trendPreviewLoading_shimmerLayout);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f164289g = (ShimmerFrameLayout) viewFindViewById2;
    }
}
