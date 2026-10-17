package com.revolut.feature.travel.flights.impl.ui.screen.ticket_rules;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderLoadingDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.travel.flights.impl.R$id;
import com.revolut.feature.travel.flights.impl.R$layout;
import com.revolut.feature.travel.flights.impl.ui.screen.ticket_rules.TravelFlightsTicketRulesScreen;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import f4g.y0;
import hwi.l0;
import i1d.b;
import i7g.c;
import i7g.d;
import i7g.f;
import i7g.g;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/flights/impl/ui/screen/ticket_rules/TravelFlightsTicketRulesScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Li7g/f;", "feature_travel_flights_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TravelFlightsTicketRulesScreen extends ViewController<q> implements a {
    public static final /* synthetic */ KProperty[] Q = {o0.f186429a.j(new h0(TravelFlightsTicketRulesScreen.class, "binding", "getBinding()Lcom/revolut/feature/travel/flights/impl/databinding/ScreenTravelFlightsTicketRulesBinding;", 0))};
    public final FullScreenStateDelegate K;
    public final int L;
    public final h M;
    public final Object N;
    public final Object O;
    public final Object P;

    public TravelFlightsTicketRulesScreen(TravelFlightsTicketRulesScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = new FullScreenStateDelegate();
        this.L = R$layout.screen_travel_flights_ticket_rules;
        this.M = s.t(this, c.f);
        this.N = w.y0(new b(this, inputData, 4));
        final int i = 0;
        this.O = w.y0(new Function0(this) { // from class: i7g.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TravelFlightsTicketRulesScreen f159292b;

            {
                this.f159292b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        KProperty[] kPropertyArr = TravelFlightsTicketRulesScreen.Q;
                        y0 y0Var = (y0) this.f159292b.N.getValue();
                        switch (y0Var.f132221a) {
                            case 0:
                                return (g) y0Var.f132223c.get();
                            default:
                                return (g) y0Var.f132223c.get();
                        }
                    default:
                        KProperty[] kPropertyArr2 = TravelFlightsTicketRulesScreen.Q;
                        TravelFlightsTicketRulesScreen travelFlightsTicketRulesScreen = this.f159292b;
                        return dli.f.a(travelFlightsTicketRulesScreen, (g) travelFlightsTicketRulesScreen.O.getValue(), v.k(new ListSubheaderDelegate(), new ListSubheaderLoadingDelegate(), new RowDelegate(null, null, 7), new RowLoadingDelegate(), new PlainTextDelegate(), travelFlightsTicketRulesScreen.K), R$id.travelFlightsTicketRulesScreen_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.P = w.y0(new Function0(this) { // from class: i7g.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TravelFlightsTicketRulesScreen f159292b;

            {
                this.f159292b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = TravelFlightsTicketRulesScreen.Q;
                        y0 y0Var = (y0) this.f159292b.N.getValue();
                        switch (y0Var.f132221a) {
                            case 0:
                                return (g) y0Var.f132223c.get();
                            default:
                                return (g) y0Var.f132223c.get();
                        }
                    default:
                        KProperty[] kPropertyArr2 = TravelFlightsTicketRulesScreen.Q;
                        TravelFlightsTicketRulesScreen travelFlightsTicketRulesScreen = this.f159292b;
                        return dli.f.a(travelFlightsTicketRulesScreen, (g) travelFlightsTicketRulesScreen.O.getValue(), v.k(new ListSubheaderDelegate(), new ListSubheaderLoadingDelegate(), new RowDelegate(null, null, 7), new RowLoadingDelegate(), new PlainTextDelegate(), travelFlightsTicketRulesScreen.K), R$id.travelFlightsTicketRulesScreen_recyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        f uiState = (f) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        NavBarWithToolbar travelFlightsTicketRulesScreenNavBar = d3().f21293b;
        Intrinsics.checkNotNullExpressionValue(travelFlightsTicketRulesScreenNavBar, "travelFlightsTicketRulesScreenNavBar");
        i7g.a model = uiState.f159295a;
        Intrinsics.checkNotNullParameter(travelFlightsTicketRulesScreenNavBar, "<this>");
        Intrinsics.checkNotNullParameter(model, "model");
        TextLocalisedClause textLocalisedClause = model.f159289a;
        travelFlightsTicketRulesScreenNavBar.setToolbarTitle(textLocalisedClause);
        travelFlightsTicketRulesScreenNavBar.setTitle(textLocalisedClause, null);
        Clause clause = model.f159290b;
        if (clause != null) {
            travelFlightsTicketRulesScreenNavBar.setSecondDescriptionText(clause);
        }
        travelFlightsTicketRulesScreenNavBar.setSecondDescriptionVisible(clause != null);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (y0) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (g) this.O.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        d3().f21293b.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(d3().f21293b.f59410q), new l0(this, null, 22), 3);
        ViewController.P2(this, rd0.e.b(this.K.f52371h.f121375b), new d(this, null), 3);
    }

    public final c4g.q d3() {
        ViewBinding value = this.M.getValue(this, Q[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (c4g.q) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.P.getValue();
    }
}
