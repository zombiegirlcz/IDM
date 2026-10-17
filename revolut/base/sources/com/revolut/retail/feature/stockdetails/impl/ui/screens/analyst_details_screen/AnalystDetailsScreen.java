package com.revolut.retail.feature.stockdetails.impl.ui.screens.analyst_details_screen;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import androidx.viewpager2.widget.ViewPager2;
import ao.h;
import aw0.o9;
import com.revolut.core.ui_kit.delegates.AnalysisMultiChartDelegate;
import com.revolut.core.ui_kit.delegates.ContainerDelegate;
import com.revolut.core.ui_kit.delegates.FanChartDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.MultiTargetFanChartLoadingDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.Tabs;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.kompot.navigable.a;
import com.revolut.kompot.navigable.screen.BaseScreen;
import com.revolut.retail.feature.stockdetails.impl.R$layout;
import com.revolut.retail.feature.stockdetails.impl.ui.screens.analyst_details_screen.AnalystDetailsScreen;
import com.revolut.retail.wealth.resources.R$string;
import java.util.List;
import jki.m;
import jki.o;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import q9c.v;
import rgf.b;
import ruk.c;
import ruk.d;
import ruk.e;
import ruk.k;
import ruk.l;
import te0.w;
import vc.s;
import z0h.s1;
import z4l.j;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/retail/feature/stockdetails/impl/ui/screens/analyst_details_screen/AnalystDetailsScreen;", "Lcom/revolut/kompot/navigable/screen/BaseScreen;", "Lruk/l;", "Lcom/revolut/retail/feature/stockdetails/impl/ui/screens/analyst_details_screen/AnalystDetailsScreenContract$InputData;", "Laii/q;", "Lz0h/s1;", "feature_stock_details_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AnalystDetailsScreen extends BaseScreen<l, AnalystDetailsScreenContract$InputData, q> implements s1 {
    public static final /* synthetic */ KProperty[] X = {o0.f186429a.j(new h0(AnalystDetailsScreen.class, "binding", "getBinding()Lcom/revolut/retail/feature/stockdetails/impl/databinding/ScreenAnalystDetailsBinding;", 0))};
    public final int M;
    public final h N;
    public final Object O;
    public final Object P;
    public final e Q;
    public final TextDelegate R;
    public final FanChartDelegate S;
    public final ListSubheaderDelegate T;
    public final FullScreenStateDelegate U;
    public final AnalysisMultiChartDelegate V;
    public final Object W;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnalystDetailsScreen(AnalystDetailsScreenContract$InputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.M = R$layout.screen_analyst_details;
        this.N = s.t(this, c.f);
        this.O = w.y0(new b(this, inputData, 26));
        final int i = 0;
        this.P = w.y0(new Function0(this) { // from class: ruk.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AnalystDetailsScreen f257591b;

            {
                this.f257591b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                AnalystDetailsScreen analystDetailsScreen = this.f257591b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = AnalystDetailsScreen.X;
                        return (j) ((prk.e) analystDetailsScreen.O.getValue()).f239086h.get();
                    default:
                        return new z4l.j(7, zhm.u.c(new ContainerDelegate(zhm.v.k(analystDetailsScreen.R, analystDetailsScreen.S, analystDetailsScreen.T, new PlainTextDelegate(), analystDetailsScreen.U, new MultiTargetFanChartLoadingDelegate(), analystDetailsScreen.V), null, 6)), false);
                }
            }
        });
        this.Q = new e(this);
        this.R = new TextDelegate();
        this.S = new FanChartDelegate();
        this.T = new ListSubheaderDelegate();
        this.U = new FullScreenStateDelegate();
        this.V = new AnalysisMultiChartDelegate();
        final int i2 = 1;
        this.W = w.y0(new Function0(this) { // from class: ruk.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AnalystDetailsScreen f257591b;

            {
                this.f257591b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                AnalystDetailsScreen analystDetailsScreen = this.f257591b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = AnalystDetailsScreen.X;
                        return (j) ((prk.e) analystDetailsScreen.O.getValue()).f239086h.get();
                    default:
                        return new z4l.j(7, zhm.u.c(new ContainerDelegate(zhm.v.k(analystDetailsScreen.R, analystDetailsScreen.S, analystDetailsScreen.T, new PlainTextDelegate(), analystDetailsScreen.U, new MultiTargetFanChartLoadingDelegate(), analystDetailsScreen.V), null, 6)), false);
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    /* JADX INFO: renamed from: O2 */
    public final void Z2(m mVar, o oVar) {
        l uiState = (l) mVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        Tabs analystDetailsTabs = Z2().f218667c;
        Intrinsics.checkNotNullExpressionValue(analystDetailsTabs, "analystDetailsTabs");
        Tabs.setItems$default(analystDetailsTabs, uiState.f257607b, null, 2, null);
        List list = uiState.f257608c;
        if (list != null) {
            ((j) this.W.getValue()).c(list);
        }
        k kVar = uiState.f257606a;
        Tabs analystDetailsTabs2 = Z2().f218667c;
        Intrinsics.checkNotNullExpressionValue(analystDetailsTabs2, "analystDetailsTabs");
        Tabs.u(analystDetailsTabs2, kVar.f257604a, false, false, false, 14);
        Z2().d.setCurrentItem(kVar.f257605b);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final sji.b S2() {
        return (prk.e) this.O.getValue();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        a.g2(this, rd0.e.b(Z2().f218666b.f59410q), null, new rlh.c(this, null, 18), 3);
        int i = 4;
        int i2 = 2;
        a.g2(this, rd0.e.b(Z2().f218667c.f58882b), null, new v(i2, T2(), ruk.j.class, "onTabSelected", "onTabSelected(Ljava/lang/String;)V", i, 22), 3);
        a.g2(this, rd0.e.b(this.S.f52308c.f121375b), null, new v(i2, T2(), ruk.j.class, "onFanChartHeaderImageClicked", "onFanChartHeaderImageClicked(Lcom/revolut/core/ui_kit/delegates/FanChartDelegate$Model;)V", i, 23), 3);
        a.g2(this, rd0.e.b(this.U.f52371h.f121375b), null, new d(2, 4, ruk.j.class, T2(), "onFullScreenStateMainActionClick", "onFullScreenStateMainActionClick(Lcom/revolut/core/ui_kit/delegates/FullScreenStateDelegate$Model;)V"), 3);
        a.g2(this, rd0.e.b(this.V.f51653c.f121375b), null, new v(i2, T2(), ruk.j.class, "onVerticalBarSelected", "onVerticalBarSelected(Lcom/revolut/core/common/Optional;)V", 4, 24), 3);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final void W2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewPager2 viewPager2 = Z2().d;
        viewPager2.setAdapter((j) this.W.getValue());
        viewPager2.registerOnPageChangeCallback(this.Q);
        NavBarWithToolbar navBarWithToolbar = Z2().f218666b;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.wealth_trading_analyst_ratings_and_targets_home_title, null, null, 14);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        AnalystDetailsScreenContract$InputData analystDetailsScreenContract$InputData = (AnalystDetailsScreenContract$InputData) this.G;
        TextClause textClause = new TextClause(analystDetailsScreenContract$InputData.f103880a.e, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        hel.b bVar = analystDetailsScreenContract$InputData.f103881b;
        navBarWithToolbar.setSecondDescriptionText((bVar == null ? -1 : ruk.b.f257593a[bVar.ordinal()]) == 1 ? new TextLocalisedClause(R$string.wealth_trading_analyst_ratings_and_targets_home_description_uk, zhm.v.k(textClause, textClause), null, 12) : new TextLocalisedClause(R$string.wealth_trading_analyst_ratings_and_targets_home_description, zhm.v.k(textClause, textClause), null, 12));
        navBarWithToolbar.setSecondDescriptionVisible(true);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
    }

    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final void X2() {
        Z2().d.unregisterOnPageChangeCallback(this.Q);
    }

    public final nrk.c Z2() {
        ViewBinding value = this.N.getValue(this, X[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (nrk.c) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    /* JADX INFO: renamed from: a3, reason: merged with bridge method [inline-methods] */
    public final ruk.j T2() {
        return (ruk.j) this.P.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getM() {
        return this.M;
    }

    @Override // z0h.s1
    public final vkm.d r() {
        return rd0.e.b(this.R.d);
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.TRUE;
    }
}
