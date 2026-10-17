package op0;

import android.view.View;
import android.widget.TextView;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.revolut.core.ui_kit.R$id;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class x2 extends p {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final TextView f227476j;
    public final ShimmerFrameLayout k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x2(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        View viewFindViewById = itemView.findViewById(R$id.mapWidgetLoading_title);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f227476j = (TextView) viewFindViewById;
        View viewFindViewById2 = itemView.findViewById(R$id.mapWidgetLoading_shimmeringView);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) viewFindViewById2;
        this.k = shimmerFrameLayout;
        shimmerFrameLayout.setOutlineProvider(new w2());
        shimmerFrameLayout.setClipToOutline(true);
    }
}
