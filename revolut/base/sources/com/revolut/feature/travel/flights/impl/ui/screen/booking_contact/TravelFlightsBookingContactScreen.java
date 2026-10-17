package com.revolut.feature.travel.flights.impl.ui.screen.booking_contact;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.PhoneEditorDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.travel.flights.api.R$string;
import com.revolut.feature.travel.flights.impl.ui.screen.booking_contact.TravelFlightsBookingContactScreen;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import f4g.e0;
import jii.u;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import rr0.f;
import te0.w;
import vc.s;
import xki.e;
import y4g.c;
import y4g.d;
import y4g.h;
import y4g.k;
import y4g.l;
import zhm.v;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/flights/impl/ui/screen/booking_contact/TravelFlightsBookingContactScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Ly4g/h;", "Ldli/a;", "Ly4g/l;", "feature_travel_flights_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TravelFlightsBookingContactScreen extends ViewController<h> implements dli.a {
    public static final /* synthetic */ KProperty[] T = {o0.f186429a.j(new h0(TravelFlightsBookingContactScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};
    public final TravelFlightsBookingContactScreenContract$InputData K;
    public final InputTextDelegate L;
    public final PhoneEditorDelegate M;
    public final ao.h N;
    public f O;
    public final int P;
    public final Object Q;
    public final Object R;
    public final Object S;

    public TravelFlightsBookingContactScreen(TravelFlightsBookingContactScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = new InputTextDelegate(null);
        this.M = new PhoneEditorDelegate();
        this.N = s.t(this, y4g.b.f);
        this.P = R$layout.screen_recycler_navbar_nextbutton;
        final int i = 0;
        this.Q = w.y0(new Function0(this) { // from class: y4g.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TravelFlightsBookingContactScreen f310920b;

            {
                this.f310920b = this;
            }

            /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                TravelFlightsBookingContactScreen travelFlightsBookingContactScreen = this.f310920b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = TravelFlightsBookingContactScreen.T;
                        phm.a aVar = (phm.a) ue0.e.j(travelFlightsBookingContactScreen.m2()).a().get(f4g.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return (e0) ((z4g.a) ((z4g.b) aVar2.b()).B().mo3808a(travelFlightsBookingContactScreen)).l(travelFlightsBookingContactScreen.K).mo3783build();
                        }
                        throw new IllegalStateException(a0.d.q("Api ", f4g.b.class, " is not found"));
                    case 1:
                        KProperty[] kPropertyArr2 = TravelFlightsBookingContactScreen.T;
                        e0 e0Var = (e0) travelFlightsBookingContactScreen.Q.getValue();
                        switch (e0Var.f132104a) {
                            case 0:
                                return (k) e0Var.f132107g.get();
                            default:
                                return (k) e0Var.f132107g.get();
                        }
                    default:
                        KProperty[] kPropertyArr3 = TravelFlightsBookingContactScreen.T;
                        TravelFlightsBookingContactScreen travelFlightsBookingContactScreen2 = this.f310920b;
                        return dli.f.a(travelFlightsBookingContactScreen2, travelFlightsBookingContactScreen2.d(), v.k(travelFlightsBookingContactScreen2.L, travelFlightsBookingContactScreen2.M), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.R = w.y0(new Function0(this) { // from class: y4g.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TravelFlightsBookingContactScreen f310920b;

            {
                this.f310920b = this;
            }

            /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                TravelFlightsBookingContactScreen travelFlightsBookingContactScreen = this.f310920b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = TravelFlightsBookingContactScreen.T;
                        phm.a aVar = (phm.a) ue0.e.j(travelFlightsBookingContactScreen.m2()).a().get(f4g.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return (e0) ((z4g.a) ((z4g.b) aVar2.b()).B().mo3808a(travelFlightsBookingContactScreen)).l(travelFlightsBookingContactScreen.K).mo3783build();
                        }
                        throw new IllegalStateException(a0.d.q("Api ", f4g.b.class, " is not found"));
                    case 1:
                        KProperty[] kPropertyArr2 = TravelFlightsBookingContactScreen.T;
                        e0 e0Var = (e0) travelFlightsBookingContactScreen.Q.getValue();
                        switch (e0Var.f132104a) {
                            case 0:
                                return (k) e0Var.f132107g.get();
                            default:
                                return (k) e0Var.f132107g.get();
                        }
                    default:
                        KProperty[] kPropertyArr3 = TravelFlightsBookingContactScreen.T;
                        TravelFlightsBookingContactScreen travelFlightsBookingContactScreen2 = this.f310920b;
                        return dli.f.a(travelFlightsBookingContactScreen2, travelFlightsBookingContactScreen2.d(), v.k(travelFlightsBookingContactScreen2.L, travelFlightsBookingContactScreen2.M), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        final int i3 = 2;
        this.S = w.y0(new Function0(this) { // from class: y4g.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TravelFlightsBookingContactScreen f310920b;

            {
                this.f310920b = this;
            }

            /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                TravelFlightsBookingContactScreen travelFlightsBookingContactScreen = this.f310920b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = TravelFlightsBookingContactScreen.T;
                        phm.a aVar = (phm.a) ue0.e.j(travelFlightsBookingContactScreen.m2()).a().get(f4g.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return (e0) ((z4g.a) ((z4g.b) aVar2.b()).B().mo3808a(travelFlightsBookingContactScreen)).l(travelFlightsBookingContactScreen.K).mo3783build();
                        }
                        throw new IllegalStateException(a0.d.q("Api ", f4g.b.class, " is not found"));
                    case 1:
                        KProperty[] kPropertyArr2 = TravelFlightsBookingContactScreen.T;
                        e0 e0Var = (e0) travelFlightsBookingContactScreen.Q.getValue();
                        switch (e0Var.f132104a) {
                            case 0:
                                return (k) e0Var.f132107g.get();
                            default:
                                return (k) e0Var.f132107g.get();
                        }
                    default:
                        KProperty[] kPropertyArr3 = TravelFlightsBookingContactScreen.T;
                        TravelFlightsBookingContactScreen travelFlightsBookingContactScreen2 = this.f310920b;
                        return dli.f.a(travelFlightsBookingContactScreen2, travelFlightsBookingContactScreen2.d(), v.k(travelFlightsBookingContactScreen2.L, travelFlightsBookingContactScreen2.M), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        l uiState = (l) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        LargeActionButton largeActionButton = d3().f174564b;
        y4g.f fVar = uiState.f310932b;
        largeActionButton.setEnabled(fVar == y4g.f.ENABLED);
        f fVar2 = this.O;
        if (fVar2 != null) {
            fVar2.c(fVar == y4g.f.LOADING);
        } else {
            Intrinsics.r("loadingButtonController");
            throw null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (e0) this.Q.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        this.O = d3().f174564b.A.V();
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.travel_flights_booking_contact_title, null, null, 14);
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setSecondDescriptionText(new TextLocalisedClause(R$string.travel_flights_booking_contact_subtitle, null, null, 14));
        navBarWithToolbar.setSecondDescriptionVisible(true);
        d3().f174564b.setText(new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_confirm, null, null, 14));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        ViewController.P2(this, rd0.e.b(d3().f174565c.f59410q), new c(this, continuation, 0), 3);
        ViewController.P2(this, rd0.e.b(d3().f174564b.o), new c(this, continuation, 1), 3);
        ViewController.P2(this, rd0.e.b(this.L.e.f121375b), new d(this, null), 3);
        PhoneEditorDelegate phoneEditorDelegate = this.M;
        ViewController.P2(this, rd0.e.b(phoneEditorDelegate.e.f121375b), new y4g.e(this, null), 3);
        ViewController.P2(this, rd0.e.b(phoneEditorDelegate.f52894c.f121375b), new c(this, continuation, 2), 3);
    }

    public final u d3() {
        ViewBinding value = this.N.getValue(this, T[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (u) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final k d() {
        return (k) this.R.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getP() {
        return this.P;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.S.getValue();
    }
}
