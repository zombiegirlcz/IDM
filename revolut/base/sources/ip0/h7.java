package ip0;

import android.view.View;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.revolut.core.ui_kit.R$id;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class h7 extends koi.b {
    public final ShimmerFrameLayout f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final View f164517g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final View f164518h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h7(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        View viewFindViewById = itemView.findViewById(R$id.cellDetailsHeadlineLoading_shimmeringView);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f = (ShimmerFrameLayout) viewFindViewById;
        View viewFindViewById2 = itemView.findViewById(R$id.cellDetailsHeadlineLoading_description);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f164517g = viewFindViewById2;
        View viewFindViewById3 = itemView.findViewById(R$id.cellDetailsHeadlineLoading_badge);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.f164518h = viewFindViewById3;
    }
}
