package ip0;

import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.internal.views.SmallActionButton;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class aj extends koi.b {
    public final ShimmerFrameLayout f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final SmallActionButton f163456g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final AppCompatTextView f163457h;
    public final AppCompatTextView i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final View f163458j;
    public final View k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aj(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        View viewFindViewById = itemView.findViewById(R$id.flexibleBarChartLoading_shimmerLayout);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f = (ShimmerFrameLayout) viewFindViewById;
        View viewFindViewById2 = itemView.findViewById(R$id.flexibleBarChartLoading_button);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f163456g = (SmallActionButton) viewFindViewById2;
        View viewFindViewById3 = itemView.findViewById(R$id.flexibleBarChartLoading_title);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.f163457h = (AppCompatTextView) viewFindViewById3;
        View viewFindViewById4 = itemView.findViewById(R$id.flexibleBarChartLoading_display);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        this.i = (AppCompatTextView) viewFindViewById4;
        View viewFindViewById5 = itemView.findViewById(R$id.flexibleBarChartLoading_chart);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
        this.f163458j = viewFindViewById5;
        View viewFindViewById6 = itemView.findViewById(R$id.flexibleBarChartLoading_content);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "findViewById(...)");
        this.k = viewFindViewById6;
    }
}
