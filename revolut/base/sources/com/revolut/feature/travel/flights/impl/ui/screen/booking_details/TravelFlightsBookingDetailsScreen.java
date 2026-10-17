package com.revolut.feature.travel.flights.impl.ui.screen.booking_details;

import a07.b;
import a5g.c;
import a5g.d;
import a5g.f;
import a5g.g;
import android.view.View;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderLoadingDelegate;
import com.revolut.core.ui_kit.delegates.ListingTileDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.feature.travel.flights.impl.R$id;
import com.revolut.feature.travel.flights.impl.R$layout;
import com.revolut.feature.travel.flights.impl.ui.screen.booking_details.TravelFlightsBookingDetailsScreen;
import com.revolut.kompot.navigable.vc.ViewController;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import te0.w;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/flights/impl/ui/screen/booking_details/TravelFlightsBookingDetailsScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "", "Ldli/a;", "La5g/g;", "feature_travel_flights_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TravelFlightsBookingDetailsScreen extends ViewController<Object> implements dli.a {
    public final RowDelegate K;
    public final FullScreenStateDelegate L;
    public final int M;
    public final Object N;
    public final Object O;
    public final Object P;

    public TravelFlightsBookingDetailsScreen(TravelFlightsBookingDetailsScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = new RowDelegate(null, null, 7);
        this.L = new FullScreenStateDelegate();
        this.M = R$layout.screen_travel_flights_booking_details;
        this.N = w.y0(new b(this, inputData, 9));
        final int i = 0;
        this.O = w.y0(new Function0(this) { // from class: a5g.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TravelFlightsBookingDetailsScreen f1379b;

            {
                this.f1379b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        return (f) ((f4g.e) this.f1379b.N.getValue()).f132103c.get();
                    default:
                        TravelFlightsBookingDetailsScreen travelFlightsBookingDetailsScreen = this.f1379b;
                        return dli.f.a(travelFlightsBookingDetailsScreen, (f) travelFlightsBookingDetailsScreen.O.getValue(), v.k(new ListingTileDelegate(), new ListSubheaderDelegate(), new ListSubheaderLoadingDelegate(), travelFlightsBookingDetailsScreen.K, new RowLoadingDelegate(), new TextDelegate(), travelFlightsBookingDetailsScreen.L), R$id.travelFlightsBookingDetailsScreen_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.P = w.y0(new Function0(this) { // from class: a5g.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TravelFlightsBookingDetailsScreen f1379b;

            {
                this.f1379b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        return (f) ((f4g.e) this.f1379b.N.getValue()).f132103c.get();
                    default:
                        TravelFlightsBookingDetailsScreen travelFlightsBookingDetailsScreen = this.f1379b;
                        return dli.f.a(travelFlightsBookingDetailsScreen, (f) travelFlightsBookingDetailsScreen.O.getValue(), v.k(new ListingTileDelegate(), new ListSubheaderDelegate(), new ListSubheaderLoadingDelegate(), travelFlightsBookingDetailsScreen.K, new RowLoadingDelegate(), new TextDelegate(), travelFlightsBookingDetailsScreen.L), R$id.travelFlightsBookingDetailsScreen_recyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, q qVar) {
        dli.a.z0((g) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (f4g.e) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (f) this.O.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        RowDelegate rowDelegate = this.K;
        ViewController.P2(this, rd0.e.b(rowDelegate.f53218h), new a5g.b(this, null), 3);
        ViewController.P2(this, rd0.e.b(rowDelegate.f53224q), new c(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.L.f52371h.f121375b), new d(this, null), 3);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.M;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.P.getValue();
    }
}
