package ip0;

import android.content.Context;
import android.text.InputFilter;
import android.view.View;
import android.widget.TextView;
import com.facebook.shimmer.ShimmerConstraintLayout;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.internal.views.chart.LineChartView;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.amount.AmountEditView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class ng0 extends koi.b {
    public final AmountEditView f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AmountEditView f165508g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final LargeActionButton f165509h;
    public final ShimmerConstraintLayout i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final LineChartView f165510j;
    public final TextView k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final TextView f165511l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final View f165512m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final View f165513n;
    public InputFilter.LengthFilter o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public InputFilter.LengthFilter f165514p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ng0(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        View viewFindViewById = itemView.findViewById(R$id.exchangeSmartTile_topAmount);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f = (AmountEditView) viewFindViewById;
        View viewFindViewById2 = itemView.findViewById(R$id.exchangeSmartTile_bottomAmount);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f165508g = (AmountEditView) viewFindViewById2;
        View viewFindViewById3 = itemView.findViewById(R$id.exchangeSmartTile_button);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.f165509h = (LargeActionButton) viewFindViewById3;
        View viewFindViewById4 = itemView.findViewById(R$id.exchangeSmartTile_chartContainer);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        ShimmerConstraintLayout shimmerConstraintLayout = (ShimmerConstraintLayout) viewFindViewById4;
        this.i = shimmerConstraintLayout;
        View viewFindViewById5 = shimmerConstraintLayout.findViewById(R$id.exchangeSmartTile_chartView);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
        this.f165510j = (LineChartView) viewFindViewById5;
        View viewFindViewById6 = shimmerConstraintLayout.findViewById(R$id.exchangeSmartTile_topChartTitle);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "findViewById(...)");
        this.k = (TextView) viewFindViewById6;
        View viewFindViewById7 = shimmerConstraintLayout.findViewById(R$id.exchangeSmartTile_bottomChartTitle);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById7, "findViewById(...)");
        this.f165511l = (TextView) viewFindViewById7;
        View viewFindViewById8 = shimmerConstraintLayout.findViewById(R$id.exchangeSmartTile_topChartTitleStub);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById8, "findViewById(...)");
        this.f165512m = viewFindViewById8;
        View viewFindViewById9 = shimmerConstraintLayout.findViewById(R$id.exchangeSmartTile_bottomChartTitleStub);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById9, "findViewById(...)");
        this.f165513n = viewFindViewById9;
        shimmerConstraintLayout.setShimmerMode(c9.f.SHIMMERING_CHILDREN_ONLY);
        Context context = itemView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        shimmerConstraintLayout.h0(yp0.a0.a(context));
    }
}
