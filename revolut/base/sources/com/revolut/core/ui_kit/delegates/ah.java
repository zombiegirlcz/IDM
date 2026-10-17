package com.revolut.core.ui_kit.delegates;

import android.content.Context;
import android.view.View;
import com.facebook.shimmer.ShimmerConstraintLayout;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.internal.views.chart.LineChartView;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class ah extends koi.b {
    public final LineChartView f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final View f53684g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final View f53685h;
    public final View i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f53686j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ah(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        View viewFindViewById = itemView.findViewById(R$id.smartTileExchangeLoading_chartView);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        LineChartView lineChartView = (LineChartView) viewFindViewById;
        this.f = lineChartView;
        View viewFindViewById2 = itemView.findViewById(R$id.smartTileExchangeLoading_internalContainer);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f53684g = viewFindViewById2;
        View viewFindViewById3 = itemView.findViewById(R$id.smartTileExchangeLoading_topChartLabelView);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.f53685h = viewFindViewById3;
        View viewFindViewById4 = itemView.findViewById(R$id.smartTileExchangeLoading_bottomChartLabelView);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        this.i = viewFindViewById4;
        this.f53686j = true;
        View viewFindViewById5 = itemView.findViewById(R$id.smartTileExchangeLoading_button);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
        LargeActionButton largeActionButton = (LargeActionButton) viewFindViewById5;
        largeActionButton.G = null;
        largeActionButton.n(largeActionButton.f58720s);
        largeActionButton.o(LargeActionButton.ButtonStyle.f58737s);
        View viewFindViewById6 = itemView.findViewById(R$id.smartTileExchangeLoading_root);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "findViewById(...)");
        ShimmerConstraintLayout shimmerConstraintLayout = (ShimmerConstraintLayout) viewFindViewById6;
        shimmerConstraintLayout.setShimmerMode(c9.f.SHIMMERING_CHILDREN_ONLY);
        Context context = itemView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        shimmerConstraintLayout.h0(yp0.a0.a(context));
        shimmerConstraintLayout.l0();
        SmartTileExchangeDelegate.INSTANCE.getClass();
        lineChartView.setChartItems(SmartTileExchangeDelegate.f53419g);
        lineChartView.setColorScheme(new aw0.x6(zhm.u.c(new aw0.w6(R$attr.uikit_colorGreyTone50, R$attr.uikit_colorGreyTone20, R$attr.uikit_colorTransparent, BitmapDescriptorFactory.HUE_RED, 1000.0f, true, aw0.v6.SQUARE))));
        Context context2 = itemView.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        lineChartView.setGraphLineWidth(kli.a.k(context2, 1.0f));
        lineChartView.setYAxis(SmartTileExchangeLoadingDelegate.f53434c);
    }
}
