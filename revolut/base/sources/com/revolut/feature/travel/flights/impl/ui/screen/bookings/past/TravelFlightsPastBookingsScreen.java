package com.revolut.feature.travel.flights.impl.ui.screen.bookings.past;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import ao.h;
import c4g.m;
import cli.o;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.travel.core.api.R$string;
import com.revolut.feature.travel.flights.impl.R$id;
import com.revolut.feature.travel.flights.impl.R$layout;
import com.revolut.feature.travel.flights.impl.ui.screen.bookings.TravelFlightsBookingListItemDelegate;
import com.revolut.feature.travel.flights.impl.ui.screen.bookings.past.TravelFlightsPastBookingsScreen;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import dli.f;
import f4g.g;
import f4g.p;
import h5g.c;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import pki.b;
import te0.w;
import vc.s;
import xki.e;
import zhm.u;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/travel/flights/impl/ui/screen/bookings/past/TravelFlightsPastBookingsScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lh5g/c;", "<init>", "()V", "feature_travel_flights_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TravelFlightsPastBookingsScreen extends ViewController<q> implements dli.a {
    public static final /* synthetic */ KProperty[] P = {o0.f186429a.j(new h0(TravelFlightsPastBookingsScreen.class, "binding", "getBinding()Lcom/revolut/feature/travel/flights/impl/databinding/ScreenTravelFlightsPastBookingsBinding;", 0))};
    public final h K = s.t(this, a.f);
    public final int L = R$layout.screen_travel_flights_past_bookings;
    public final Object M;
    public final Object N;
    public final Object O;

    public static final /* synthetic */ class a extends kotlin.jvm.internal.q implements Function1 {
        public static final a f = new a();

        public a() {
            super(1, m.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/feature/travel/flights/impl/databinding/ScreenTravelFlightsPastBookingsBinding;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj2) {
            View p0 = (View) obj2;
            Intrinsics.checkNotNullParameter(p0, "p0");
            int i = R$id.travelFlightsPastBookings_navBar;
            NavBarWithToolbar navBarWithToolbar = (NavBarWithToolbar) ViewBindings.findChildViewById(p0, i);
            if (navBarWithToolbar != null) {
                i = R$id.travelFlightsPastBookings_recyclerView;
                if (((ScreenContentRecyclerView) ViewBindings.findChildViewById(p0, i)) != null) {
                    return new m((ControllerContainerCoordinatorLayout) p0, navBarWithToolbar);
                }
            }
            throw new NullPointerException("Missing required view with ID: ".concat(p0.getResources().getResourceName(i)));
        }
    }

    public TravelFlightsPastBookingsScreen() {
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: h5g.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TravelFlightsPastBookingsScreen f149554b;

            {
                this.f149554b = this;
            }

            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                TravelFlightsPastBookingsScreen travelFlightsPastBookingsScreen = this.f149554b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = TravelFlightsPastBookingsScreen.P;
                        qji.b bVarU2 = travelFlightsPastBookingsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.travel.flights.impl.ui.screen.bookings.past.di.TravelFlightsPastBookingsScreenInjector");
                        f4g.b bVar = ((p) bVarU2).f132168b;
                        f4g.w wVar = new f4g.w();
                        wVar.f132210a = e4m.b.b(new g(bVar, wVar, 2));
                        return wVar;
                    case 1:
                        KProperty[] kPropertyArr2 = TravelFlightsPastBookingsScreen.P;
                        return (e) ((f4g.w) travelFlightsPastBookingsScreen.M.getValue()).f132210a.get();
                    default:
                        KProperty[] kPropertyArr3 = TravelFlightsPastBookingsScreen.P;
                        TravelFlightsPastBookingsScreen travelFlightsPastBookingsScreen2 = this.f149554b;
                        return f.a(travelFlightsPastBookingsScreen2, (e) travelFlightsPastBookingsScreen2.N.getValue(), u.c(new TravelFlightsBookingListItemDelegate()), R$id.travelFlightsPastBookings_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: h5g.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TravelFlightsPastBookingsScreen f149554b;

            {
                this.f149554b = this;
            }

            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                TravelFlightsPastBookingsScreen travelFlightsPastBookingsScreen = this.f149554b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = TravelFlightsPastBookingsScreen.P;
                        qji.b bVarU2 = travelFlightsPastBookingsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.travel.flights.impl.ui.screen.bookings.past.di.TravelFlightsPastBookingsScreenInjector");
                        f4g.b bVar = ((p) bVarU2).f132168b;
                        f4g.w wVar = new f4g.w();
                        wVar.f132210a = e4m.b.b(new g(bVar, wVar, 2));
                        return wVar;
                    case 1:
                        KProperty[] kPropertyArr2 = TravelFlightsPastBookingsScreen.P;
                        return (e) ((f4g.w) travelFlightsPastBookingsScreen.M.getValue()).f132210a.get();
                    default:
                        KProperty[] kPropertyArr3 = TravelFlightsPastBookingsScreen.P;
                        TravelFlightsPastBookingsScreen travelFlightsPastBookingsScreen2 = this.f149554b;
                        return f.a(travelFlightsPastBookingsScreen2, (e) travelFlightsPastBookingsScreen2.N.getValue(), u.c(new TravelFlightsBookingListItemDelegate()), R$id.travelFlightsPastBookings_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i3 = 2;
        this.O = w.y0(new Function0(this) { // from class: h5g.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TravelFlightsPastBookingsScreen f149554b;

            {
                this.f149554b = this;
            }

            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                TravelFlightsPastBookingsScreen travelFlightsPastBookingsScreen = this.f149554b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = TravelFlightsPastBookingsScreen.P;
                        qji.b bVarU2 = travelFlightsPastBookingsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.travel.flights.impl.ui.screen.bookings.past.di.TravelFlightsPastBookingsScreenInjector");
                        f4g.b bVar = ((p) bVarU2).f132168b;
                        f4g.w wVar = new f4g.w();
                        wVar.f132210a = e4m.b.b(new g(bVar, wVar, 2));
                        return wVar;
                    case 1:
                        KProperty[] kPropertyArr2 = TravelFlightsPastBookingsScreen.P;
                        return (e) ((f4g.w) travelFlightsPastBookingsScreen.M.getValue()).f132210a.get();
                    default:
                        KProperty[] kPropertyArr3 = TravelFlightsPastBookingsScreen.P;
                        TravelFlightsPastBookingsScreen travelFlightsPastBookingsScreen2 = this.f149554b;
                        return f.a(travelFlightsPastBookingsScreen2, (e) travelFlightsPastBookingsScreen2.N.getValue(), u.c(new TravelFlightsBookingListItemDelegate()), R$id.travelFlightsPastBookings_recyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, cli.q qVar) {
        dli.a.z0((c) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (f4g.w) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final b d() {
        return (h5g.e) this.N.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.travel_screen_booking_past_and_cancelled_title, null, null, 14);
        ViewBinding value = this.K.getValue(this, P[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        NavBarWithToolbar navBarWithToolbar = ((m) value).f21283b;
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_arrow_thin_left));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.K.getValue(this, P[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ViewController.P2(this, rd0.e.b(((m) value).f21283b.f59410q), new gqh.o(this, null, 18), 3);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getM() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.O.getValue();
    }
}
