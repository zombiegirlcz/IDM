package com.revolut.feature.travel.flights.impl.ui.screen.itinerary_preview;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import c4g.i;
import cli.o;
import com.revolut.core.ui_kit.delegates.FlightSegmentDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextWarningDelegate;
import com.revolut.core.ui_kit.delegates.TabsDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.travel.flights.api.R$string;
import com.revolut.feature.travel.flights.impl.R$id;
import com.revolut.feature.travel.flights.impl.R$layout;
import com.revolut.feature.travel.flights.impl.ui.screen.itinerary_preview.TravelFlightsItineraryPreviewScreen;
import com.revolut.feature.travel.flights.impl.ui.screen.itinerary_preview.TravelFlightsItineraryPreviewScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import f4g.r;
import ft.d;
import g6g.b;
import g6g.c;
import g6g.e;
import g6g.f;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import vc.s;
import zhm.v;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/flights/impl/ui/screen/itinerary_preview/TravelFlightsItineraryPreviewScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lg6g/e;", "feature_travel_flights_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TravelFlightsItineraryPreviewScreen extends ViewController<q> implements a {
    public static final /* synthetic */ KProperty[] T = {o0.f186429a.j(new h0(TravelFlightsItineraryPreviewScreen.class, "binding", "getBinding()Lcom/revolut/feature/travel/flights/impl/databinding/ScreenTravelFlightsItineraryPreviewBinding;", 0))};
    public final TravelFlightsItineraryPreviewScreenContract$InputData K;
    public final int L;
    public final h M;
    public final TabsDelegate N;
    public final FlightSegmentDelegate O;
    public final PlainTextWarningDelegate P;
    public final Object Q;
    public final Object R;
    public final Object S;

    public TravelFlightsItineraryPreviewScreen(TravelFlightsItineraryPreviewScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_travel_flights_itinerary_preview;
        this.M = s.t(this, b.f);
        this.N = new TabsDelegate();
        this.O = new FlightSegmentDelegate();
        this.P = new PlainTextWarningDelegate();
        final int i = 0;
        this.Q = w.y0(new Function0(this) { // from class: g6g.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TravelFlightsItineraryPreviewScreen f140940b;

            {
                this.f140940b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                TravelFlightsItineraryPreviewScreen travelFlightsItineraryPreviewScreen = this.f140940b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = TravelFlightsItineraryPreviewScreen.T;
                        TravelFlightsItineraryPreviewScreen travelFlightsItineraryPreviewScreen2 = this.f140940b;
                        return dli.f.a(travelFlightsItineraryPreviewScreen2, (f) travelFlightsItineraryPreviewScreen2.S.getValue(), v.k(travelFlightsItineraryPreviewScreen2.N, travelFlightsItineraryPreviewScreen2.O, travelFlightsItineraryPreviewScreen2.P), R$id.travelFlightsItineraryPreviewScreen_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = TravelFlightsItineraryPreviewScreen.T;
                        phm.a aVar = (phm.a) ue0.e.j(travelFlightsItineraryPreviewScreen.m2()).a().get(f4g.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", f4g.b.class, " is not found"));
                        }
                        f4g.b bVar = ((f4g.b) aVar2.b()).o;
                        TravelFlightsItineraryPreviewScreenContract$InputData travelFlightsItineraryPreviewScreenContract$InputData = travelFlightsItineraryPreviewScreen.K;
                        travelFlightsItineraryPreviewScreenContract$InputData.getClass();
                        return new r(bVar, travelFlightsItineraryPreviewScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = TravelFlightsItineraryPreviewScreen.T;
                        return (f) ((r) travelFlightsItineraryPreviewScreen.R.getValue()).f132181c.get();
                }
            }
        });
        final int i2 = 1;
        this.R = w.y0(new Function0(this) { // from class: g6g.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TravelFlightsItineraryPreviewScreen f140940b;

            {
                this.f140940b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                TravelFlightsItineraryPreviewScreen travelFlightsItineraryPreviewScreen = this.f140940b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = TravelFlightsItineraryPreviewScreen.T;
                        TravelFlightsItineraryPreviewScreen travelFlightsItineraryPreviewScreen2 = this.f140940b;
                        return dli.f.a(travelFlightsItineraryPreviewScreen2, (f) travelFlightsItineraryPreviewScreen2.S.getValue(), v.k(travelFlightsItineraryPreviewScreen2.N, travelFlightsItineraryPreviewScreen2.O, travelFlightsItineraryPreviewScreen2.P), R$id.travelFlightsItineraryPreviewScreen_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = TravelFlightsItineraryPreviewScreen.T;
                        phm.a aVar = (phm.a) ue0.e.j(travelFlightsItineraryPreviewScreen.m2()).a().get(f4g.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", f4g.b.class, " is not found"));
                        }
                        f4g.b bVar = ((f4g.b) aVar2.b()).o;
                        TravelFlightsItineraryPreviewScreenContract$InputData travelFlightsItineraryPreviewScreenContract$InputData = travelFlightsItineraryPreviewScreen.K;
                        travelFlightsItineraryPreviewScreenContract$InputData.getClass();
                        return new r(bVar, travelFlightsItineraryPreviewScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = TravelFlightsItineraryPreviewScreen.T;
                        return (f) ((r) travelFlightsItineraryPreviewScreen.R.getValue()).f132181c.get();
                }
            }
        });
        final int i3 = 2;
        this.S = w.y0(new Function0(this) { // from class: g6g.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TravelFlightsItineraryPreviewScreen f140940b;

            {
                this.f140940b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                TravelFlightsItineraryPreviewScreen travelFlightsItineraryPreviewScreen = this.f140940b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = TravelFlightsItineraryPreviewScreen.T;
                        TravelFlightsItineraryPreviewScreen travelFlightsItineraryPreviewScreen2 = this.f140940b;
                        return dli.f.a(travelFlightsItineraryPreviewScreen2, (f) travelFlightsItineraryPreviewScreen2.S.getValue(), v.k(travelFlightsItineraryPreviewScreen2.N, travelFlightsItineraryPreviewScreen2.O, travelFlightsItineraryPreviewScreen2.P), R$id.travelFlightsItineraryPreviewScreen_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = TravelFlightsItineraryPreviewScreen.T;
                        phm.a aVar = (phm.a) ue0.e.j(travelFlightsItineraryPreviewScreen.m2()).a().get(f4g.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", f4g.b.class, " is not found"));
                        }
                        f4g.b bVar = ((f4g.b) aVar2.b()).o;
                        TravelFlightsItineraryPreviewScreenContract$InputData travelFlightsItineraryPreviewScreenContract$InputData = travelFlightsItineraryPreviewScreen.K;
                        travelFlightsItineraryPreviewScreenContract$InputData.getClass();
                        return new r(bVar, travelFlightsItineraryPreviewScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = TravelFlightsItineraryPreviewScreen.T;
                        return (f) ((r) travelFlightsItineraryPreviewScreen.R.getValue()).f132181c.get();
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, cli.q qVar) {
        a.z0((e) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (r) this.R.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (f) this.S.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.travel_flights_itinerary_preview_screen_title, null, null, 14);
        ViewBinding value = this.M.getValue(this, T[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        NavBarWithToolbar navBarWithToolbar = ((i) value).f21272b;
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.M.getValue(this, T[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ViewController.P2(this, rd0.e.b(((i) value).f21272b.f59410q), new d(this, null, 29), 3);
        ViewController.P2(this, rd0.e.b(this.N.f53515c.f121375b), new c(this, null, 0), 3);
        ViewController.P2(this, rd0.e.b(this.P.s()), new c(this, null, 1), 3);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.Q.getValue();
    }
}
