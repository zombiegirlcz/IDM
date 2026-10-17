package com.revolut.feature.travel.hotels.impl.ui_kompot.screen.traveller_information_edit;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import c9g.y;
import cli.o;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.travel.hotels.api.R$string;
import com.revolut.feature.travel.hotels.impl.R$id;
import com.revolut.feature.travel.hotels.impl.R$layout;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.traveller_information_edit.TravelHotelsTravellerInformationEditScreen;
import com.revolut.kompot.navigable.vc.ViewController;
import dfg.d;
import dfg.f;
import dfg.g;
import g9g.n0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import vc.s;
import xki.e;
import zhm.u;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/hotels/impl/ui_kompot/screen/traveller_information_edit/TravelHotelsTravellerInformationEditScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Ldfg/h;", "feature_travel_hotels_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TravelHotelsTravellerInformationEditScreen extends ViewController<q> implements dli.a {
    public static final /* synthetic */ KProperty[] Q = {o0.f186429a.j(new h0(TravelHotelsTravellerInformationEditScreen.class, "binding", "getBinding()Lcom/revolut/feature/travel/hotels/impl/databinding/ScreenTravelHotelsTravellerInformationEditBinding;", 0))};
    public final int K;
    public final InputTextDelegate L;
    public final Object M;
    public final h N;
    public final Object O;
    public final Object P;

    public TravelHotelsTravellerInformationEditScreen(TravelHotelsTravellerInformationEditScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = R$layout.screen_travel_hotels_traveller_information_edit;
        this.L = new InputTextDelegate(null);
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: dfg.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TravelHotelsTravellerInformationEditScreen f113891b;

            {
                this.f113891b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        KProperty[] kPropertyArr = TravelHotelsTravellerInformationEditScreen.Q;
                        TravelHotelsTravellerInformationEditScreen travelHotelsTravellerInformationEditScreen = this.f113891b;
                        return dli.f.a(travelHotelsTravellerInformationEditScreen, (g) travelHotelsTravellerInformationEditScreen.P.getValue(), u.c(travelHotelsTravellerInformationEditScreen.L), R$id.travelHotelsTravellerInformationEdit_recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr2 = TravelHotelsTravellerInformationEditScreen.Q;
                        return (g) ((n0) this.f113891b.O.getValue()).d.get();
                }
            }
        });
        this.N = s.t(this, dfg.b.f);
        this.O = w.y0(new cvi.b(this, inputData, 27));
        final int i2 = 1;
        this.P = w.y0(new Function0(this) { // from class: dfg.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TravelHotelsTravellerInformationEditScreen f113891b;

            {
                this.f113891b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = TravelHotelsTravellerInformationEditScreen.Q;
                        TravelHotelsTravellerInformationEditScreen travelHotelsTravellerInformationEditScreen = this.f113891b;
                        return dli.f.a(travelHotelsTravellerInformationEditScreen, (g) travelHotelsTravellerInformationEditScreen.P.getValue(), u.c(travelHotelsTravellerInformationEditScreen.L), R$id.travelHotelsTravellerInformationEdit_recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr2 = TravelHotelsTravellerInformationEditScreen.Q;
                        return (g) ((n0) this.f113891b.O.getValue()).d.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        dfg.h uiState = (dfg.h) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        LargeActionButton largeActionButton = d3().f22449b;
        f fVar = uiState.f113898b;
        largeActionButton.setEnabled(fVar.f113895a);
        largeActionButton.setText(fVar.f113896b);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (n0) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (g) this.P.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f22450c;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.hotels_booking_details_manage_booking_travel_information_title, null, null, 14);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f22450c.f59410q), null, new dfg.c(this, continuation, 0), 3);
        InputTextDelegate inputTextDelegate = this.L;
        ViewController.P2(this, rd0.e.b(inputTextDelegate.e.f121375b), new d(this, null), 3);
        ViewController.P2(this, rd0.e.b(inputTextDelegate.f.f121375b), new d8j.c(this, continuation, 15), 3);
        ViewController.P2(this, rd0.e.b(d3().f22449b.o), new dfg.c(this, continuation, 1), 3);
    }

    public final y d3() {
        ViewBinding value = this.N.getValue(this, Q[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (y) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getU() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.M.getValue();
    }
}
