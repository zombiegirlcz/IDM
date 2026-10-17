package com.revolut.feature.invest.smart_notifications.impl.ui.screen.all_insights;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import avk.j;
import cli.o;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderLoadingDelegate;
import com.revolut.core.ui_kit.delegates.NewsDelegate;
import com.revolut.core.ui_kit.delegates.NewsLoadingDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.invest.smart_notifications.impl.ui.screen.all_insights.AllInsightsScreen;
import com.revolut.feature.invest.smart_notifications.impl.ui.screen.all_insights.AllInsightsScreenContract$InputData;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import com.revolut.retail.wealth.resources.R$string;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import t18.l;
import t18.m;
import t18.n;
import t18.p;
import tki.c;
import vc.s;
import xki.e;
import yp0.y;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/invest/smart_notifications/impl/ui/screen/all_insights/AllInsightsScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ltki/c;", "Lt18/s;", "feature_invest_smart_notifications_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AllInsightsScreen extends ViewController<q> implements c {
    public static final /* synthetic */ KProperty[] V = {o0.f186429a.j(new h0(AllInsightsScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final AllInsightsScreenContract$InputData K;
    public final Lazy L;
    public final Lazy M;
    public final int N;
    public final h O;
    public final NewsDelegate P;
    public final ListSubheaderDelegate Q;
    public final FullScreenStateDelegate R;
    public final TextDelegate S;
    public final Lazy T;
    public final j U;

    public AllInsightsScreen(AllInsightsScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        final int i = 0;
        this.L = yhm.j.b(new Function0(this) { // from class: t18.i

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AllInsightsScreen f267221b;

            {
                this.f267221b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                AllInsightsScreen allInsightsScreen = this.f267221b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = AllInsightsScreen.V;
                        phm.a aVar = (phm.a) ue0.e.j(allInsightsScreen.m2()).a().get(m18.e.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", m18.e.class, " is not found"));
                        }
                        m18.e eVar = ((m18.e) aVar2.b()).f201271q;
                        AllInsightsScreenContract$InputData allInsightsScreenContract$InputData = allInsightsScreen.K;
                        avk.j jVar = allInsightsScreen.U;
                        allInsightsScreenContract$InputData.getClass();
                        jVar.getClass();
                        return new m18.a(eVar, allInsightsScreenContract$InputData, jVar);
                    case 1:
                        KProperty[] kPropertyArr2 = AllInsightsScreen.V;
                        return (p) ((m18.a) allInsightsScreen.L.getValue()).f201255h.get();
                    default:
                        KProperty[] kPropertyArr3 = AllInsightsScreen.V;
                        AllInsightsScreen allInsightsScreen2 = this.f267221b;
                        return tki.g.a(allInsightsScreen2, allInsightsScreen2.R2(), zhm.v.k(allInsightsScreen2.P, allInsightsScreen2.Q, allInsightsScreen2.R, allInsightsScreen2.S, new ListSubheaderLoadingDelegate(), new NewsLoadingDelegate()), 0, null, new koi.h(null, false, true, 1), null, 44);
                }
            }
        });
        final int i2 = 1;
        this.M = yhm.j.b(new Function0(this) { // from class: t18.i

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AllInsightsScreen f267221b;

            {
                this.f267221b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                AllInsightsScreen allInsightsScreen = this.f267221b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = AllInsightsScreen.V;
                        phm.a aVar = (phm.a) ue0.e.j(allInsightsScreen.m2()).a().get(m18.e.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", m18.e.class, " is not found"));
                        }
                        m18.e eVar = ((m18.e) aVar2.b()).f201271q;
                        AllInsightsScreenContract$InputData allInsightsScreenContract$InputData = allInsightsScreen.K;
                        avk.j jVar = allInsightsScreen.U;
                        allInsightsScreenContract$InputData.getClass();
                        jVar.getClass();
                        return new m18.a(eVar, allInsightsScreenContract$InputData, jVar);
                    case 1:
                        KProperty[] kPropertyArr2 = AllInsightsScreen.V;
                        return (p) ((m18.a) allInsightsScreen.L.getValue()).f201255h.get();
                    default:
                        KProperty[] kPropertyArr3 = AllInsightsScreen.V;
                        AllInsightsScreen allInsightsScreen2 = this.f267221b;
                        return tki.g.a(allInsightsScreen2, allInsightsScreen2.R2(), zhm.v.k(allInsightsScreen2.P, allInsightsScreen2.Q, allInsightsScreen2.R, allInsightsScreen2.S, new ListSubheaderLoadingDelegate(), new NewsLoadingDelegate()), 0, null, new koi.h(null, false, true, 1), null, 44);
                }
            }
        });
        this.N = R$layout.screen_recycler_navbar;
        this.O = s.t(this, t18.j.f);
        this.P = new NewsDelegate();
        this.Q = new ListSubheaderDelegate();
        this.R = new FullScreenStateDelegate();
        this.S = new TextDelegate();
        final int i3 = 2;
        this.T = yhm.j.b(new Function0(this) { // from class: t18.i

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AllInsightsScreen f267221b;

            {
                this.f267221b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                AllInsightsScreen allInsightsScreen = this.f267221b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = AllInsightsScreen.V;
                        phm.a aVar = (phm.a) ue0.e.j(allInsightsScreen.m2()).a().get(m18.e.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", m18.e.class, " is not found"));
                        }
                        m18.e eVar = ((m18.e) aVar2.b()).f201271q;
                        AllInsightsScreenContract$InputData allInsightsScreenContract$InputData = allInsightsScreen.K;
                        avk.j jVar = allInsightsScreen.U;
                        allInsightsScreenContract$InputData.getClass();
                        jVar.getClass();
                        return new m18.a(eVar, allInsightsScreenContract$InputData, jVar);
                    case 1:
                        KProperty[] kPropertyArr2 = AllInsightsScreen.V;
                        return (p) ((m18.a) allInsightsScreen.L.getValue()).f201255h.get();
                    default:
                        KProperty[] kPropertyArr3 = AllInsightsScreen.V;
                        AllInsightsScreen allInsightsScreen2 = this.f267221b;
                        return tki.g.a(allInsightsScreen2, allInsightsScreen2.R2(), zhm.v.k(allInsightsScreen2.P, allInsightsScreen2.Q, allInsightsScreen2.R, allInsightsScreen2.S, new ListSubheaderLoadingDelegate(), new NewsLoadingDelegate()), 0, null, new koi.h(null, false, true, 1), null, 44);
                }
            }
        });
        this.U = new j(this, 27);
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        t18.s uiState = (t18.s) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        d3().f174539b.setMenuItems(uiState.f267228a);
        d3().f174539b.setFilters(uiState.f267229b);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (m18.a) this.L.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.invest_smart_notifications_feed_all_insights_title, null, null, 14);
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        Intrinsics.checkNotNullExpressionValue(navBarWithToolbar, "navBarWithToolbar");
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        d3().f174539b.setToolbarTitle(textLocalisedClause);
        d3().f174539b.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(d3().f174539b.f59410q), new l(this, null, 0), 3);
        ViewController.P2(this, new t05.c(rd0.e.b(d3().f174539b.o.f57403b), 4), new l(this, null, 1), 3);
        ViewController.P2(this, rd0.e.b(d3().f174539b.s0()), new m(this, null), 3);
        NewsDelegate newsDelegate = this.P;
        ViewController.P2(this, rd0.e.b(newsDelegate.p()), new n(this, null), 3);
        ViewController.P2(this, kii.e.t(newsDelegate.f, "hide(...)"), new sy6.j(this, null, 7), 3);
        ViewController.P2(this, rd0.e.b(this.R.f52371h.f121375b), new t18.o(this, null), 3);
        ScreenContentRecyclerView recyclerView = d3().f174540c;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "recyclerView");
        y.a(recyclerView, 25, true, new sx8.a(this, 12));
    }

    public final jii.m d3() {
        ViewBinding value = this.O.getValue(this, V[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.m) value;
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final p R2() {
        return (p) this.M.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getN() {
        return this.N;
    }

    @Override // oki.f
    public final pki.a k() {
        return (tki.a) this.T.getValue();
    }
}
