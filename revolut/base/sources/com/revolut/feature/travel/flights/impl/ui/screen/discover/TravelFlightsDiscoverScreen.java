package com.revolut.feature.travel.flights.impl.ui.screen.discover;

import android.view.View;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.InputTravelSearchDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.feature.travel.flights.impl.R$id;
import com.revolut.feature.travel.flights.impl.R$layout;
import com.revolut.feature.travel.flights.impl.ui.screen.discover.TravelFlightsDiscoverScreen;
import com.revolut.kompot.navigable.vc.ViewController;
import f4g.j0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import te0.w;
import v5g.b;
import v5g.c;
import v5g.f;
import v5g.g;
import v5g.h;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/flights/impl/ui/screen/discover/TravelFlightsDiscoverScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lv5g/f;", "Ldli/a;", "Lv5g/h;", "feature_travel_flights_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TravelFlightsDiscoverScreen extends ViewController<f> implements dli.a {
    public final InputTravelSearchDelegate K;
    public final LargeActionButtonDelegate L;
    public final int M;
    public final Object N;
    public final Object O;
    public final Object P;

    public TravelFlightsDiscoverScreen() {
        this(0);
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, q qVar) {
        dli.a.z0((h) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (j0) this.N.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        InputTravelSearchDelegate inputTravelSearchDelegate = this.K;
        ViewController.P2(this, rd0.e.b(inputTravelSearchDelegate.d.f121375b), new b(this, null, 0), 3);
        ViewController.P2(this, rd0.e.b(inputTravelSearchDelegate.e.f121375b), new b(this, null, 1), 3);
        ViewController.P2(this, rd0.e.b(inputTravelSearchDelegate.f.f121375b), new b(this, null, 2), 3);
        ViewController.P2(this, rd0.e.b(inputTravelSearchDelegate.f52601h.f121375b), new b(this, null, 3), 3);
        ViewController.P2(this, rd0.e.b(inputTravelSearchDelegate.i.f121375b), new b(this, null, 4), 3);
        ViewController.P2(this, rd0.e.b(this.L.d.f121375b), new c(this, null), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: d3, reason: merged with bridge method [inline-methods] */
    public final g R2() {
        return (g) this.O.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.M;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.P.getValue();
    }

    public TravelFlightsDiscoverScreen(int i) {
        TravelFlightsDiscoverScreenContract$InputData inputData = new TravelFlightsDiscoverScreenContract$InputData(0);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = new InputTravelSearchDelegate();
        this.L = new LargeActionButtonDelegate();
        this.M = R$layout.screen_travel_flights_discover;
        this.N = w.y0(new v0c.b(this, inputData, 17));
        final int i2 = 0;
        this.O = w.y0(new Function0(this) { // from class: v5g.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TravelFlightsDiscoverScreen f286216b;

            {
                this.f286216b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        j0 j0Var = (j0) this.f286216b.N.getValue();
                        switch (j0Var.f132132a) {
                            case 0:
                                return (g) j0Var.d.get();
                            default:
                                return (g) j0Var.d.get();
                        }
                    default:
                        TravelFlightsDiscoverScreen travelFlightsDiscoverScreen = this.f286216b;
                        return dli.f.a(travelFlightsDiscoverScreen, travelFlightsDiscoverScreen.d(), v.k(travelFlightsDiscoverScreen.K, travelFlightsDiscoverScreen.L), R$id.travelFlightsDiscover_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i3 = 1;
        this.P = w.y0(new Function0(this) { // from class: v5g.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TravelFlightsDiscoverScreen f286216b;

            {
                this.f286216b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        j0 j0Var = (j0) this.f286216b.N.getValue();
                        switch (j0Var.f132132a) {
                            case 0:
                                return (g) j0Var.d.get();
                            default:
                                return (g) j0Var.d.get();
                        }
                    default:
                        TravelFlightsDiscoverScreen travelFlightsDiscoverScreen = this.f286216b;
                        return dli.f.a(travelFlightsDiscoverScreen, travelFlightsDiscoverScreen.d(), v.k(travelFlightsDiscoverScreen.K, travelFlightsDiscoverScreen.L), R$id.travelFlightsDiscover_recyclerView, null, null, null, 56);
                }
            }
        });
    }
}
