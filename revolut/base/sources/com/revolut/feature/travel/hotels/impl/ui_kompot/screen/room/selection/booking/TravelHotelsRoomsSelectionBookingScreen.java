package com.revolut.feature.travel.hotels.impl.ui_kompot.screen.room.selection.booking;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import c9g.v;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.ExtraLargeListingCardDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.travel.hotels.api.R$string;
import com.revolut.feature.travel.hotels.impl.R$id;
import com.revolut.feature.travel.hotels.impl.R$layout;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.room.selection.booking.TravelHotelsRoomsSelectionBookingScreen;
import com.revolut.kompot.navigable.vc.ViewController;
import dcf.v0;
import deg.b;
import deg.c;
import deg.g;
import dli.a;
import feg.d;
import feg.f;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import vc.s;
import xki.e;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/hotels/impl/ui_kompot/screen/room/selection/booking/TravelHotelsRoomsSelectionBookingScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Ldeg/g;", "Ldli/a;", "Lfeg/f;", "feature_travel_hotels_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TravelHotelsRoomsSelectionBookingScreen extends ViewController<g> implements a {
    public static final /* synthetic */ KProperty[] Q = {o0.f186429a.j(new h0(TravelHotelsRoomsSelectionBookingScreen.class, "binding", "getBinding()Lcom/revolut/feature/travel/hotels/impl/databinding/ScreenTravelHotelsRoomsSelectionBinding;", 0))};
    public final h K;
    public final d L;
    public final int M;
    public final Object N;
    public final Object O;
    public final Object P;

    public TravelHotelsRoomsSelectionBookingScreen(TravelHotelsRoomsSelectionBookingScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = s.t(this, b.f);
        this.L = new d();
        this.M = R$layout.screen_travel_hotels_rooms_selection;
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: deg.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TravelHotelsRoomsSelectionBookingScreen f113437b;

            {
                this.f113437b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        KProperty[] kPropertyArr = TravelHotelsRoomsSelectionBookingScreen.Q;
                        TravelHotelsRoomsSelectionBookingScreen travelHotelsRoomsSelectionBookingScreen = this.f113437b;
                        return dli.f.a(travelHotelsRoomsSelectionBookingScreen, travelHotelsRoomsSelectionBookingScreen.R2(), travelHotelsRoomsSelectionBookingScreen.L.f134607c, R$id.travelHotelsRoomsSelectionScreen_recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr2 = TravelHotelsRoomsSelectionBookingScreen.Q;
                        return (h) ((g9g.h0) this.f113437b.O.getValue()).f141686c.get();
                }
            }
        });
        this.O = w.y0(new cvi.b(this, inputData, 26));
        final int i2 = 1;
        this.P = w.y0(new Function0(this) { // from class: deg.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TravelHotelsRoomsSelectionBookingScreen f113437b;

            {
                this.f113437b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = TravelHotelsRoomsSelectionBookingScreen.Q;
                        TravelHotelsRoomsSelectionBookingScreen travelHotelsRoomsSelectionBookingScreen = this.f113437b;
                        return dli.f.a(travelHotelsRoomsSelectionBookingScreen, travelHotelsRoomsSelectionBookingScreen.R2(), travelHotelsRoomsSelectionBookingScreen.L.f134607c, R$id.travelHotelsRoomsSelectionScreen_recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr2 = TravelHotelsRoomsSelectionBookingScreen.Q;
                        return (h) ((g9g.h0) this.f113437b.O.getValue()).f141686c.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        f uiState = (f) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        ebm.a.A(d3(), uiState);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (g9g.h0) this.O.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ebm.a.B(d3(), new TextLocalisedClause(R$string.hotels_property_room_selection_select_room, null, null, 14), q2());
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f22435b.f59410q), null, new v0(this, null, 2), 3);
        d dVar = this.L;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(dVar.f134605a.d.f121375b), null, new c(this, null), 3);
        ExtraLargeListingCardDelegate extraLargeListingCardDelegate = dVar.f134605a;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(extraLargeListingCardDelegate.f52266c), null, new deg.d(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(extraLargeListingCardDelegate.f52268h), null, new deg.e(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f22435b.s0()), null, new deg.f(this, null), 3);
    }

    public final v d3() {
        ViewBinding value = this.K.getValue(this, Q[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (v) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final deg.h R2() {
        return (deg.h) this.P.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getM() {
        return this.M;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.N.getValue();
    }
}
