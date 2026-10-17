package com.revolut.feature.travel.flights.impl.ui.flow.home;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.travel.flights.api.R$string;
import com.revolut.feature.travel.flights.impl.R$id;
import com.revolut.feature.travel.flights.impl.R$layout;
import com.revolut.feature.travel.flights.impl.ui.flow.home.TravelFlightsHomeFlow;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.kompot.navigable.vc.pager.PagerItem;
import f4g.q;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import l4g.b;
import l4g.c;
import l4g.d;
import l4g.g;
import l4g.i;
import l4g.l;
import pki.a;
import te0.w;
import vc.s;
import xki.e;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/travel/flights/impl/ui/flow/home/TravelFlightsHomeFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Ll4g/g;", "Lali/g;", "Ll4g/i;", "Lcom/revolut/feature/travel/flights/impl/ui/flow/home/TravelFlightsHomeFlowContract$PagerItem;", "feature_travel_flights_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TravelFlightsHomeFlow extends ViewController<g> implements ali.g {
    public static final /* synthetic */ KProperty[] P = {o0.f186429a.j(new h0(TravelFlightsHomeFlow.class, "binding", "getBinding()Lcom/revolut/feature/travel/flights/impl/databinding/ScreenTravelFlightsHomeBinding;", 0))};
    public final h K;
    public final int L;
    public final Object M;
    public final Object N;
    public final Object O;

    public TravelFlightsHomeFlow(TravelFlightsHomeFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = s.t(this, b.f);
        this.L = R$layout.screen_travel_flights_home;
        this.M = w.y0(new kpl.b(this, inputData, 13));
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: l4g.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TravelFlightsHomeFlow f192107b;

            {
                this.f192107b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                TravelFlightsHomeFlow travelFlightsHomeFlow = this.f192107b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = TravelFlightsHomeFlow.P;
                        return (d) ((q) travelFlightsHomeFlow.M.getValue()).f.get();
                    default:
                        KProperty[] kPropertyArr2 = TravelFlightsHomeFlow.P;
                        return mif.a.a(travelFlightsHomeFlow, 0, R$id.travelFlightsHome_viewPager, travelFlightsHomeFlow.d(), 5);
                }
            }
        });
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: l4g.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TravelFlightsHomeFlow f192107b;

            {
                this.f192107b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                TravelFlightsHomeFlow travelFlightsHomeFlow = this.f192107b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = TravelFlightsHomeFlow.P;
                        return (d) ((q) travelFlightsHomeFlow.M.getValue()).f.get();
                    default:
                        KProperty[] kPropertyArr2 = TravelFlightsHomeFlow.P;
                        return mif.a.a(travelFlightsHomeFlow, 0, R$id.travelFlightsHome_viewPager, travelFlightsHomeFlow.d(), 5);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        i uiState = (i) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        d3().f21266b.setItems(uiState.f192116b);
        d3().f21266b.b(uiState.f192115a);
        d3().f21267c.setMenuItems(uiState.f192117c);
    }

    @Override // ali.g
    public final void Q1(PagerItem pagerItem) {
        TravelFlightsHomeFlowContract$PagerItem pagerItem2 = (TravelFlightsHomeFlowContract$PagerItem) pagerItem;
        Intrinsics.checkNotNullParameter(pagerItem2, "pagerItem");
        l lVar = (l) d();
        lVar.getClass();
        Intrinsics.checkNotNullParameter(pagerItem2, "pagerItem");
        lVar.H2(lVar.f192123r, new l0c.s(pagerItem2, 11));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (q) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final qji.b R1() {
        return (q) this.M.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f21267c;
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.travel_flights_search_header_title, null, null, 14), null);
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.travel_flights_search_header_title, null, null, 14));
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(d3().f21267c.f59410q), new ko2.b(this, null, 26), 3);
        ViewController.P2(this, rd0.e.b(d3().f21266b.f58581q), new c(this, null, 0), 3);
        ViewController.P2(this, rd0.e.b(d3().f21267c.o.f57403b), new c(this, null, 1), 3);
    }

    public final c4g.g d3() {
        ViewBinding value = this.K.getValue(this, P[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (c4g.g) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final d d() {
        return (d) this.N.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final a k() {
        return (ali.c) this.O.getValue();
    }

    public TravelFlightsHomeFlow() {
        this(new TravelFlightsHomeFlowContract$InputData(0));
    }
}
