package com.revolut.retail.feature.impl.travel_trips.ui.screen.travel_itinerary.add_event;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import avj.f;
import avj.g;
import avj.i;
import avj.j;
import avj.k;
import avj.l;
import avj.m;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.api.travel_trips.R$string;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import mx0.c7;
import te0.w;
import vc.s;
import xki.e;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/impl/travel_trips/ui/screen/travel_itinerary/add_event/TravelItineraryAddEventScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lavj/f;", "Ltki/c;", "Lavj/h;", "feature_travel_trips_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TravelItineraryAddEventScreen extends ViewController<f> implements tki.c {
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(TravelItineraryAddEventScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarFooterNextbuttonBinding;", 0))};
    public final TravelItineraryAddEventContract$InputData K;
    public final h L;
    public final InputTextDelegate M;
    public final int N;
    public final Object O;
    public final Object P;
    public final Object Q;

    public TravelItineraryAddEventScreen(TravelItineraryAddEventContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = s.t(this, j.f);
        this.M = new InputTextDelegate(null);
        this.N = R$layout.screen_recycler_navbar_footer_nextbutton;
        this.O = w.y0(new i(this, 0));
        this.P = w.y0(new i(this, 1));
        this.Q = w.y0(new i(this, 2));
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        avj.h uiState = (avj.h) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        d3().f174557b.setEnabled(uiState.f10054b);
        NavBarWithToolbar navBarWithToolbar = d3().e;
        TextLocalisedClause textLocalisedClause = uiState.f10055c;
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        Clause clause = uiState.d;
        navBarWithToolbar.setDescriptionVisible(clause != null);
        if (clause != null) {
            navBarWithToolbar.setDescriptionText(clause);
        }
        navBarWithToolbar.setMenuItems(uiState.f);
        d3().f174558c.setContent(new c7(uiState.e, false, null, 6));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (xuj.a) this.P.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        d3().e.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        d3().f174557b.setText(new TextLocalisedClause(R$string.travel_trip_itinerary_add_event_cta, null, null, 14));
        d3().f174557b.setLoadingButtonTag("add_event_save_button");
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        ViewController.P2(this, rd0.e.b(d3().e.f59410q), new k(this, continuation, 0), 3);
        ViewController.P2(this, rd0.e.b(d3().f174557b.o), new k(this, continuation, 1), 3);
        InputTextDelegate inputTextDelegate = this.M;
        ViewController.P2(this, rd0.e.b(inputTextDelegate.e.f121375b), new l(this, null), 3);
        ViewController.P2(this, rd0.e.b(inputTextDelegate.f52575g.f121375b), new m(this, null), 3);
        ViewController.P2(this, rd0.e.b(d3().e.o.f57403b), new ap7.k(this, continuation, 29), 3);
    }

    public final jii.s d3() {
        ViewBinding value = this.L.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.s) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final g d() {
        return (g) this.Q.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.N;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (tki.a) this.O.getValue();
    }
}
