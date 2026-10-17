package op0;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.internal.views.CutoutImageView;
import com.revolut.core.ui_kit.internal.views.LinearGaugeChartView;
import com.revolut.core.ui_kit.internal.views.SmallActionButton;
import com.revolut.core.ui_kit.internal.views.badge.CircleBadgeView;
import com.revolut.core.ui_kit.internal.views.chart.HorizontalSingleLineChartLegendView;
import com.revolut.core.ui_kit.internal.views.tag.TagView;
import com.revolut.core.ui_kit.views.OverlappedIconsView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class z1 extends p {
    public final ihm.f A;
    public ood.k B;
    public ix0.l0 C;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ConstraintLayout f227497j;
    public final AppCompatTextView k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final AppCompatTextView f227498l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final AppCompatTextView f227499m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final AppCompatTextView f227500n;
    public final AppCompatTextView o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final LinearLayout f227501p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final AppCompatTextView f227502q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final AppCompatTextView f227503r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final FrameLayout f227504s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final SmallActionButton f227505t;
    public final LinearGaugeChartView u;
    public final HorizontalSingleLineChartLegendView v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public CutoutImageView f227506w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public TagView f227507x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public CircleBadgeView f227508y;
    public OverlappedIconsView z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z1(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        View viewFindViewById = itemView.findViewById(R$id.goalProgressWidget_container);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f227497j = (ConstraintLayout) viewFindViewById;
        View viewFindViewById2 = itemView.findViewById(R$id.goalProgressWidget_title);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.k = (AppCompatTextView) viewFindViewById2;
        View viewFindViewById3 = itemView.findViewById(R$id.goalProgressWidget_topContentMainValue);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.f227498l = (AppCompatTextView) viewFindViewById3;
        View viewFindViewById4 = itemView.findViewById(R$id.goalProgressWidget_topContentSecondaryValue);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        this.f227499m = (AppCompatTextView) viewFindViewById4;
        View viewFindViewById5 = itemView.findViewById(R$id.goalProgressWidget_bottomContentValue);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
        this.f227500n = (AppCompatTextView) viewFindViewById5;
        View viewFindViewById6 = itemView.findViewById(R$id.goalProgressWidget_bottomContentStatus);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "findViewById(...)");
        this.o = (AppCompatTextView) viewFindViewById6;
        View viewFindViewById7 = itemView.findViewById(R$id.goalProgressWidget_progressStatusContainer);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById7, "findViewById(...)");
        this.f227501p = (LinearLayout) viewFindViewById7;
        View viewFindViewById8 = itemView.findViewById(R$id.goalProgressWidget_progressDescription);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById8, "findViewById(...)");
        AppCompatTextView appCompatTextView = (AppCompatTextView) viewFindViewById8;
        this.f227502q = appCompatTextView;
        View viewFindViewById9 = itemView.findViewById(R$id.goalProgressWidget_progressSecondaryDescription);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById9, "findViewById(...)");
        AppCompatTextView appCompatTextView2 = (AppCompatTextView) viewFindViewById9;
        this.f227503r = appCompatTextView2;
        View viewFindViewById10 = itemView.findViewById(R$id.goalProgressWidget_topRightContainer);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById10, "findViewById(...)");
        this.f227504s = (FrameLayout) viewFindViewById10;
        View viewFindViewById11 = itemView.findViewById(R$id.goalProgressWidget_actionButton);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById11, "findViewById(...)");
        this.f227505t = (SmallActionButton) viewFindViewById11;
        View viewFindViewById12 = itemView.findViewById(R$id.goalProgressWidget_gaugeChart);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById12, "findViewById(...)");
        this.u = (LinearGaugeChartView) viewFindViewById12;
        View viewFindViewById13 = itemView.findViewById(R$id.goalProgressWidget_chartLegend);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById13, "findViewById(...)");
        this.v = (HorizontalSingleLineChartLegendView) viewFindViewById13;
        ihm.f fVarD = v0.a.d("create(...)");
        this.A = fVarD;
        ix0.c0 c0Var = ix0.c0.f169220a;
        appCompatTextView.setMovementMethod(c0Var);
        appCompatTextView2.setMovementMethod(c0Var);
        fVarD.subscribe(new x(14, new ok7.c(this, 20)));
    }
}
