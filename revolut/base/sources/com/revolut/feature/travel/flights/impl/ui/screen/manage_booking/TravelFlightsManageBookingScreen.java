package com.revolut.feature.travel.flights.impl.ui.screen.manage_booking;

import android.view.View;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.CounterTextDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.travel.flights.impl.R$id;
import com.revolut.feature.travel.flights.impl.R$layout;
import com.revolut.feature.travel.flights.impl.ui.screen.manage_booking.TravelFlightsManageBookingScreen;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import f4g.u;
import k6g.c;
import k6g.d;
import k6g.g;
import k6g.h;
import k6g.i;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import pki.b;
import te0.w;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/flights/impl/ui/screen/manage_booking/TravelFlightsManageBookingScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lk6g/g;", "Ldli/a;", "Lk6g/i;", "feature_travel_flights_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TravelFlightsManageBookingScreen extends ViewController<g> implements a {
    public final CounterTextDelegate K;
    public final RowDelegate L;
    public final LargeActionButtonDelegate M;
    public final int N;
    public final Object O;
    public final Object P;
    public final Object Q;

    public TravelFlightsManageBookingScreen(TravelFlightsManageBookingScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = new CounterTextDelegate();
        this.L = new RowDelegate(null, null, 7);
        this.M = new LargeActionButtonDelegate();
        this.N = R$layout.screen_travel_flights_manage_booking;
        this.O = w.y0(new jnf.a(this, inputData, 28));
        final int i = 0;
        this.P = w.y0(new Function0(this) { // from class: k6g.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TravelFlightsManageBookingScreen f181711b;

            {
                this.f181711b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        return (h) ((u) this.f181711b.O.getValue()).f132198b.get();
                    default:
                        TravelFlightsManageBookingScreen travelFlightsManageBookingScreen = this.f181711b;
                        return dli.f.a(travelFlightsManageBookingScreen, (h) travelFlightsManageBookingScreen.P.getValue(), v.k(travelFlightsManageBookingScreen.K, new ListSubheaderDelegate(), travelFlightsManageBookingScreen.L, travelFlightsManageBookingScreen.M), R$id.travelFlightsManageBookingScreen_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.Q = w.y0(new Function0(this) { // from class: k6g.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TravelFlightsManageBookingScreen f181711b;

            {
                this.f181711b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        return (h) ((u) this.f181711b.O.getValue()).f132198b.get();
                    default:
                        TravelFlightsManageBookingScreen travelFlightsManageBookingScreen = this.f181711b;
                        return dli.f.a(travelFlightsManageBookingScreen, (h) travelFlightsManageBookingScreen.P.getValue(), v.k(travelFlightsManageBookingScreen.K, new ListSubheaderDelegate(), travelFlightsManageBookingScreen.L, travelFlightsManageBookingScreen.M), R$id.travelFlightsManageBookingScreen_recyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, q qVar) {
        a.z0((i) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (u) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final b R2() {
        return (h) this.P.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(this.L.f53218h), new k6g.b(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.K.d), new c(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.M.d.f121375b), new d(this, null), 3);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getU() {
        return this.N;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.Q.getValue();
    }
}
