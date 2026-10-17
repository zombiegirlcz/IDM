package com.revolut.feature.travel.flights.impl.ui.screen.bookings;

import android.view.View;
import cli.o;
import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListingTileLoadingDelegate;
import com.revolut.feature.travel.flights.impl.R$id;
import com.revolut.feature.travel.flights.impl.R$layout;
import com.revolut.feature.travel.flights.impl.ui.screen.bookings.TravelFlightsBookingsScreen;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import dli.c;
import ew1.d;
import f0d.k;
import f4g.q;
import f5g.h;
import f5g.i;
import f5g.j;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import pki.b;
import te0.w;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/travel/flights/impl/ui/screen/bookings/TravelFlightsBookingsScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lf5g/h;", "Ldli/a;", "Lf5g/j;", "<init>", "()V", "feature_travel_flights_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TravelFlightsBookingsScreen extends ViewController<h> implements a {
    public final CellDetailsChevronDelegate K = new CellDetailsChevronDelegate();
    public final FullScreenStateDelegate L = new FullScreenStateDelegate();
    public final TravelFlightsBookingListItemDelegate M = new TravelFlightsBookingListItemDelegate();
    public final int N = R$layout.screen_travel_flights_bookings;
    public final Object O;
    public final Object P;
    public final Object Q;

    public TravelFlightsBookingsScreen() {
        final int i = 0;
        this.O = w.y0(new Function0(this) { // from class: f5g.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TravelFlightsBookingsScreen f132315b;

            {
                this.f132315b = this;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                TravelFlightsBookingsScreen travelFlightsBookingsScreen = this.f132315b;
                int i3 = 0;
                switch (i2) {
                    case 0:
                        qji.b bVarU2 = travelFlightsBookingsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.travel.flights.impl.ui.screen.bookings.di.TravelFlightsBookingsScreenInjector");
                        f4g.b bVar = ((q) bVarU2).f132174b;
                        f4g.h hVar = new f4g.h();
                        hVar.f132121a = e4m.b.b(new f4g.g(bVar, hVar, i3));
                        return hVar;
                    case 1:
                        return (i) ((f4g.h) travelFlightsBookingsScreen.O.getValue()).f132121a.get();
                    default:
                        TravelFlightsBookingsScreen travelFlightsBookingsScreen2 = this.f132315b;
                        return dli.f.a(travelFlightsBookingsScreen2, (i) travelFlightsBookingsScreen2.P.getValue(), v.k(travelFlightsBookingsScreen2.M, new ListingTileLoadingDelegate(), travelFlightsBookingsScreen2.K, travelFlightsBookingsScreen2.L), R$id.travelFlightsBookings_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.P = w.y0(new Function0(this) { // from class: f5g.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TravelFlightsBookingsScreen f132315b;

            {
                this.f132315b = this;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                TravelFlightsBookingsScreen travelFlightsBookingsScreen = this.f132315b;
                int i3 = 0;
                switch (i22) {
                    case 0:
                        qji.b bVarU2 = travelFlightsBookingsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.travel.flights.impl.ui.screen.bookings.di.TravelFlightsBookingsScreenInjector");
                        f4g.b bVar = ((q) bVarU2).f132174b;
                        f4g.h hVar = new f4g.h();
                        hVar.f132121a = e4m.b.b(new f4g.g(bVar, hVar, i3));
                        return hVar;
                    case 1:
                        return (i) ((f4g.h) travelFlightsBookingsScreen.O.getValue()).f132121a.get();
                    default:
                        TravelFlightsBookingsScreen travelFlightsBookingsScreen2 = this.f132315b;
                        return dli.f.a(travelFlightsBookingsScreen2, (i) travelFlightsBookingsScreen2.P.getValue(), v.k(travelFlightsBookingsScreen2.M, new ListingTileLoadingDelegate(), travelFlightsBookingsScreen2.K, travelFlightsBookingsScreen2.L), R$id.travelFlightsBookings_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i3 = 2;
        this.Q = w.y0(new Function0(this) { // from class: f5g.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TravelFlightsBookingsScreen f132315b;

            {
                this.f132315b = this;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                TravelFlightsBookingsScreen travelFlightsBookingsScreen = this.f132315b;
                int i32 = 0;
                switch (i22) {
                    case 0:
                        qji.b bVarU2 = travelFlightsBookingsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.travel.flights.impl.ui.screen.bookings.di.TravelFlightsBookingsScreenInjector");
                        f4g.b bVar = ((q) bVarU2).f132174b;
                        f4g.h hVar = new f4g.h();
                        hVar.f132121a = e4m.b.b(new f4g.g(bVar, hVar, i32));
                        return hVar;
                    case 1:
                        return (i) ((f4g.h) travelFlightsBookingsScreen.O.getValue()).f132121a.get();
                    default:
                        TravelFlightsBookingsScreen travelFlightsBookingsScreen2 = this.f132315b;
                        return dli.f.a(travelFlightsBookingsScreen2, (i) travelFlightsBookingsScreen2.P.getValue(), v.k(travelFlightsBookingsScreen2.M, new ListingTileLoadingDelegate(), travelFlightsBookingsScreen2.K, travelFlightsBookingsScreen2.L), R$id.travelFlightsBookings_recyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, cli.q qVar) {
        a.z0((j) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (f4g.h) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final b e3() {
        return (i) this.P.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(w.a0(this.M.f93284c.f52751c, new k(27))), new d(this, null, 23), 3);
        ViewController.P2(this, rd0.e.b(this.K.f51821c), new f5g.d(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.L.f52371h.f121375b), new f5g.e(this, null), 3);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getN() {
        return this.N;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (c) this.Q.getValue();
    }
}
