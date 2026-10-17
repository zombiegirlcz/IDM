package com.revolut.feature.travel.miles.impl.ui.flow.search_dashboard;

import ali.g;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.travel.miles.api.R$string;
import com.revolut.feature.travel.miles.impl.R$id;
import com.revolut.feature.travel.miles.impl.R$layout;
import com.revolut.feature.travel.miles.impl.ui.flow.search_dashboard.TravelMilesFlightSearchDashboardPagerFlow;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.kompot.navigable.vc.pager.PagerItem;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import mzb.e;
import nfj.j2;
import ngg.b;
import ngg.c;
import ngg.h;
import ngg.i;
import ngg.l;
import te0.w;
import ufg.j;
import vc.s;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/travel/miles/impl/ui/flow/search_dashboard/TravelMilesFlightSearchDashboardPagerFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lngg/h;", "Lali/g;", "Lngg/l;", "Lcom/revolut/feature/travel/miles/impl/ui/flow/search_dashboard/TravelMilesFlightSearchDashboardPagerFlowContract$PagerItem;", "feature_travel_miles_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TravelMilesFlightSearchDashboardPagerFlow extends ViewController<h> implements g {
    public static final /* synthetic */ KProperty[] P = {o0.f186429a.j(new h0(TravelMilesFlightSearchDashboardPagerFlow.class, "binding", "getBinding()Lcom/revolut/feature/travel/miles/impl/databinding/ScreenTravelMilesFlightSearchDashboardPagerBinding;", 0))};
    public final int K;
    public final Object L;
    public final ao.h M;
    public final Object N;
    public final Object O;

    public TravelMilesFlightSearchDashboardPagerFlow(TravelMilesFlightSearchDashboardPagerFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = R$layout.screen_travel_miles_flight_search_dashboard_pager;
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: ngg.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TravelMilesFlightSearchDashboardPagerFlow f215146b;

            {
                this.f215146b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                TravelMilesFlightSearchDashboardPagerFlow travelMilesFlightSearchDashboardPagerFlow = this.f215146b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = TravelMilesFlightSearchDashboardPagerFlow.P;
                        return mif.a.a(travelMilesFlightSearchDashboardPagerFlow, 0, R$id.travelMilesFlightSearchDashboardPagerScreen_viewPager, travelMilesFlightSearchDashboardPagerFlow.d(), 5);
                    default:
                        KProperty[] kPropertyArr2 = TravelMilesFlightSearchDashboardPagerFlow.P;
                        return (i) ((ufg.j) travelMilesFlightSearchDashboardPagerFlow.N.getValue()).d.get();
                }
            }
        });
        this.M = s.t(this, b.f);
        this.N = w.y0(new e(this, inputData, 28));
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: ngg.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TravelMilesFlightSearchDashboardPagerFlow f215146b;

            {
                this.f215146b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                TravelMilesFlightSearchDashboardPagerFlow travelMilesFlightSearchDashboardPagerFlow = this.f215146b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = TravelMilesFlightSearchDashboardPagerFlow.P;
                        return mif.a.a(travelMilesFlightSearchDashboardPagerFlow, 0, R$id.travelMilesFlightSearchDashboardPagerScreen_viewPager, travelMilesFlightSearchDashboardPagerFlow.d(), 5);
                    default:
                        KProperty[] kPropertyArr2 = TravelMilesFlightSearchDashboardPagerFlow.P;
                        return (i) ((ufg.j) travelMilesFlightSearchDashboardPagerFlow.N.getValue()).d.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        l uiState = (l) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        d3().f253805b.setItems(uiState.f215157a.f215156a);
        d3().f253805b.b(uiState.f215158b);
        d3().f253806c.setMenuItems(uiState.f215159c);
    }

    @Override // ali.g
    public final void Q1(PagerItem pagerItem) {
        TravelMilesFlightSearchDashboardPagerFlowContract$PagerItem pagerItem2 = (TravelMilesFlightSearchDashboardPagerFlowContract$PagerItem) pagerItem;
        Intrinsics.checkNotNullParameter(pagerItem2, "pagerItem");
        a aVar = (a) d();
        aVar.getClass();
        Intrinsics.checkNotNullParameter(pagerItem2, "pagerItem");
        aVar.H2(aVar.f94254q, new nfj.l(pagerItem2, 8));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (j) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final qji.b R1() {
        return (j) this.N.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f253806c;
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.miles_home_title, null, null, 14));
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.miles_home_title, null, null, 14), null);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f253806c;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(navBarWithToolbar.f59410q), null, new j2(this, null, 2), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(navBarWithToolbar.o.f57403b), null, new c(this, null, 0), 3);
        ViewController.P2(this, rd0.e.b(d3().f253805b.f58581q), new c(this, null, 1), 3);
    }

    public final rfg.l d3() {
        ViewBinding value = this.M.getValue(this, P[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (rfg.l) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final i d() {
        return (i) this.O.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (ali.c) this.L.getValue();
    }
}
