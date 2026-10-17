package com.revolut.feature.travel.flights.impl.ui.screen.itinerary;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import au0.b1;
import au0.c1;
import au0.m0;
import au0.s0;
import au0.u0;
import au0.z0;
import aw0.m6;
import aw0.n6;
import aw0.s8;
import cli.o;
import cli.q;
import com.google.android.gms.location.GeofenceStatusCodes;
import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsRevPointsDelegate;
import com.revolut.core.ui_kit.delegates.FlightSegmentDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextWarningDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.NavBarWithContainerBackground;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithBigTile;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.feature.travel.flights.impl.R$id;
import com.revolut.feature.travel.flights.impl.R$layout;
import com.revolut.feature.travel.flights.impl.ui.screen.itinerary.TravelFlightsItineraryScreen;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.common.ui.R$string;
import cvi.b;
import d6g.d;
import d6g.h;
import d6g.j;
import d6g.k;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import tki.c;
import vc.s;
import xki.e;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/flights/impl/ui/screen/itinerary/TravelFlightsItineraryScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Ld6g/h;", "Ltki/c;", "Ld6g/k;", "feature_travel_flights_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TravelFlightsItineraryScreen extends ViewController<h> implements c {
    public static final /* synthetic */ KProperty[] T = {o0.f186429a.j(new h0(TravelFlightsItineraryScreen.class, "binding", "getBinding()Lcom/revolut/feature/travel/flights/impl/databinding/ScreenTravelFlightsItineraryBinding;", 0))};
    public final int K;
    public final ao.h L;
    public final FlightSegmentDelegate M;
    public final CellDetailsDelegate N;
    public final CellDetailsRevPointsDelegate O;
    public final PlainTextWarningDelegate P;
    public final Object Q;
    public final Object R;
    public final Object S;

    public TravelFlightsItineraryScreen(TravelFlightsItineraryScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = R$layout.screen_travel_flights_itinerary;
        this.L = s.t(this, d6g.c.f);
        this.M = new FlightSegmentDelegate();
        this.N = new CellDetailsDelegate();
        this.O = new CellDetailsRevPointsDelegate();
        this.P = new PlainTextWarningDelegate();
        final int i = 0;
        this.Q = w.y0(new Function0(this) { // from class: d6g.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TravelFlightsItineraryScreen f111535b;

            {
                this.f111535b = this;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        KProperty[] kPropertyArr = TravelFlightsItineraryScreen.T;
                        TravelFlightsItineraryScreen travelFlightsItineraryScreen = this.f111535b;
                        return tki.g.a(travelFlightsItineraryScreen, (j) travelFlightsItineraryScreen.S.getValue(), v.k(travelFlightsItineraryScreen.M, travelFlightsItineraryScreen.N, travelFlightsItineraryScreen.O, travelFlightsItineraryScreen.P), R$id.travelFlightsItineraryScreen_recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr2 = TravelFlightsItineraryScreen.T;
                        return (j) ((f4g.s) this.f111535b.R.getValue()).f132189g.get();
                }
            }
        });
        this.R = w.y0(new b(this, inputData, 16));
        final int i2 = 1;
        this.S = w.y0(new Function0(this) { // from class: d6g.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TravelFlightsItineraryScreen f111535b;

            {
                this.f111535b = this;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = TravelFlightsItineraryScreen.T;
                        TravelFlightsItineraryScreen travelFlightsItineraryScreen = this.f111535b;
                        return tki.g.a(travelFlightsItineraryScreen, (j) travelFlightsItineraryScreen.S.getValue(), v.k(travelFlightsItineraryScreen.M, travelFlightsItineraryScreen.N, travelFlightsItineraryScreen.O, travelFlightsItineraryScreen.P), R$id.travelFlightsItineraryScreen_recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr2 = TravelFlightsItineraryScreen.T;
                        return (j) ((f4g.s) this.f111535b.R.getValue()).f132189g.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        k uiState = (k) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        NavBarWithBigTile travelFlightsItineraryScreenNavBar = d3().f21270c;
        Intrinsics.checkNotNullExpressionValue(travelFlightsItineraryScreenNavBar, "travelFlightsItineraryScreenNavBar");
        d6g.a model = uiState.f111542a;
        Intrinsics.checkNotNullParameter(travelFlightsItineraryScreenNavBar, "<this>");
        Intrinsics.checkNotNullParameter(model, "model");
        travelFlightsItineraryScreenNavBar.setToolbarTitle(model.f111531a);
        c1.S(travelFlightsItineraryScreenNavBar, u.c(new u0(new NavBarWithContainerBackground.ImageBackground(model.d, s8.MULTICOLOR, (Color.SolidRes) null, 12), new z0(model.f111532b, false), new au0.o0(model.f111533c), null)), null, null, 6);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (f4g.s) this.R.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (j) this.S.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithBigTile navBarWithBigTile = d3().f21270c;
        navBarWithBigTile.setNavigationButtonIcon(new ResourceImage(ofm.q.k(q2()), (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254));
        navBarWithBigTile.setBackgroundOverlayDecoration(m0.BOTTOM_BLUR);
        navBarWithBigTile.setThemeBasedColorSchemeEnabled(true);
        navBarWithBigTile.setTitleStyle(b1.DEFAULT);
        navBarWithBigTile.setLayoutType(s0.CENTERED_HORIZONTALLY);
        d3().f21269b.setModel(new aw0.e(false, null, null, m6.c(n6.Companion, new TextLocalisedClause(R$string.common_action_continue, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, "SUBMIT_BUTTON_TAG", false, null, null, null, GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION), null, null, 55));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        ViewController.P2(this, rd0.e.b(d3().f21270c.f59357t), new d(this, continuation, 0), 3);
        ViewController.P2(this, rd0.e.b(this.O.f51889c), new d6g.e(this, null, 0), 3);
        ViewController.P2(this, rd0.e.b(this.P.s()), new d6g.e(this, null, 1), 3);
        ViewController.P2(this, rd0.e.b(d3().f21269b.f), new d(this, continuation, 1), 3);
    }

    public final c4g.h d3() {
        ViewBinding value = this.L.getValue(this, T[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (c4g.h) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (tki.a) this.Q.getValue();
    }
}
