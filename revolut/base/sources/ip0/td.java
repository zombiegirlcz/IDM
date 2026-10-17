package ip0;

import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.internal.views.LinearGaugeChartView;
import com.revolut.core.ui_kit.internal.views.SmallActionButton;
import com.revolut.core.ui_kit.internal.views.chart.HorizontalSingleLineChartLegendView;
import com.revolut.core.ui_kit.internal.views.timer.CountDownTimerView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class td extends koi.b {
    public final TextView f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ImageView f166497g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ShimmerFrameLayout f166498h;
    public final ImageView i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ShimmerFrameLayout f166499j;
    public final View k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final TextView f166500l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ShimmerFrameLayout f166501m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final TextView f166502n;
    public final ShimmerFrameLayout o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ProgressBar f166503p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final TextView f166504q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final SmallActionButton f166505r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final LinearGaugeChartView f166506s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final HorizontalSingleLineChartLegendView f166507t;
    public final CountDownTimerView u;
    public final ShimmerFrameLayout v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public td(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        View viewFindViewById = itemView.findViewById(R$id.counterText_topSectionLabel);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f = (TextView) viewFindViewById;
        View viewFindViewById2 = itemView.findViewById(R$id.counterText_closeButton);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f166497g = (ImageView) viewFindViewById2;
        View viewFindViewById3 = itemView.findViewById(R$id.counterText_topSectionLabelLoading);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.f166498h = (ShimmerFrameLayout) viewFindViewById3;
        View viewFindViewById4 = itemView.findViewById(R$id.counterText_topSectionIcon);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        this.i = (ImageView) viewFindViewById4;
        View viewFindViewById5 = itemView.findViewById(R$id.counterText_topSectionIconLoading);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
        this.f166499j = (ShimmerFrameLayout) viewFindViewById5;
        View viewFindViewById6 = itemView.findViewById(R$id.counterText_topSectionIconLoadingView);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "findViewById(...)");
        this.k = viewFindViewById6;
        View viewFindViewById7 = itemView.findViewById(R$id.counterText_valueSectionTitle);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById7, "findViewById(...)");
        this.f166500l = (TextView) viewFindViewById7;
        View viewFindViewById8 = itemView.findViewById(R$id.counterText_valueSectionTitleLoading);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById8, "findViewById(...)");
        this.f166501m = (ShimmerFrameLayout) viewFindViewById8;
        View viewFindViewById9 = itemView.findViewById(R$id.counterText_valueSectionDescription);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById9, "findViewById(...)");
        this.f166502n = (TextView) viewFindViewById9;
        View viewFindViewById10 = itemView.findViewById(R$id.counterText_valueSectionDescriptionLoading);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById10, "findViewById(...)");
        this.o = (ShimmerFrameLayout) viewFindViewById10;
        View viewFindViewById11 = itemView.findViewById(R$id.counterText_bottomSectionProgressBar);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById11, "findViewById(...)");
        this.f166503p = (ProgressBar) viewFindViewById11;
        View viewFindViewById12 = itemView.findViewById(R$id.counterText_bottomSectionProgressDescription);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById12, "findViewById(...)");
        this.f166504q = (TextView) viewFindViewById12;
        View viewFindViewById13 = itemView.findViewById(R$id.counterText_bottomSectionActionButton);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById13, "findViewById(...)");
        this.f166505r = (SmallActionButton) viewFindViewById13;
        View viewFindViewById14 = itemView.findViewById(R$id.counterText_bottomSectionLinearGaugeChartView);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById14, "findViewById(...)");
        this.f166506s = (LinearGaugeChartView) viewFindViewById14;
        View viewFindViewById15 = itemView.findViewById(R$id.counterText_bottomSectionChartLegend);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById15, "findViewById(...)");
        this.f166507t = (HorizontalSingleLineChartLegendView) viewFindViewById15;
        View viewFindViewById16 = itemView.findViewById(R$id.counterText_bottomSectionCountDownTimer);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById16, "findViewById(...)");
        this.u = (CountDownTimerView) viewFindViewById16;
        View viewFindViewById17 = itemView.findViewById(R$id.counterText_bottomSectionCountDownTimerLoading);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById17, "findViewById(...)");
        this.v = (ShimmerFrameLayout) viewFindViewById17;
    }
}
