package s01;

import android.view.View;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.airbnb.lottie.LottieAnimationView;
import com.revolut.core_ui_advanced_chart.R$id;
import com.revolut.feature.retail.advanced_charts.models.AdvancedChartSymbol;
import com.revolut.feature.retail.advanced_charts.models.LockPolicy;
import com.revolut.feature.retail.advanced_charts.models.OverlayPolicy;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class j extends koi.b {
    public final FrameLayout f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final WebView f258785g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final LottieAnimationView f258786h;
    public String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public c1b.h f258787j;
    public c1b.k k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Boolean f258788l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public d1b.e f258789m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public c1b.e f258790n;
    public Set o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public OverlayPolicy f258791p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public LockPolicy f258792q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Set f258793r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public AdvancedChartSymbol f258794s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public c1b.j f258795t;
    public d1b.d u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        View viewFindViewById = itemView.findViewById(R$id.advancedChartsView_container);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f = (FrameLayout) viewFindViewById;
        View viewFindViewById2 = itemView.findViewById(R$id.advancedChartsView_webView);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f258785g = (WebView) viewFindViewById2;
        View viewFindViewById3 = itemView.findViewById(R$id.advancedChartsView_progress);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.f258786h = (LottieAnimationView) viewFindViewById3;
    }
}
