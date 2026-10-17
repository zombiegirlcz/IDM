package com.revolut.feature.travel.flights.impl.ui.screen.checkout;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import c4g.d;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.AttributeSelectorSmallDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsPriceDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.ListingCardBasicDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.ScrollerDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.buttons.TwinVerticalButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.travel.flights.api.R$string;
import com.revolut.feature.travel.flights.impl.R$id;
import com.revolut.feature.travel.flights.impl.R$layout;
import com.revolut.feature.travel.flights.impl.ui.screen.checkout.TravelFlightsCheckoutScreen;
import com.revolut.feature.travel.flights.impl.ui.screen.checkout.TravelFlightsCheckoutScreenContract$InputData;
import com.revolut.feature.travel.flights.impl.ui.screen.checkout.a;
import com.revolut.kompot.navigable.vc.ViewController;
import f4g.l;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import q5g.a0;
import q5g.b0;
import q5g.c0;
import q5g.j;
import q5g.k;
import q5g.m;
import q5g.n;
import q5g.p;
import q5g.r;
import q5g.x;
import q5g.y;
import q5g.z;
import te0.w;
import vc.s;
import xki.e;
import zhm.u;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/flights/impl/ui/screen/checkout/TravelFlightsCheckoutScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lq5g/x;", "Ldli/a;", "Lq5g/c0;", "feature_travel_flights_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TravelFlightsCheckoutScreen extends ViewController<x> implements dli.a {

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f93295b0 = {o0.f186429a.j(new h0(TravelFlightsCheckoutScreen.class, "binding", "getBinding()Lcom/revolut/feature/travel/flights/impl/databinding/ScreenTravelFlightsCheckoutBinding;", 0))};
    public final TravelFlightsCheckoutScreenContract$InputData K;
    public final int L;
    public final h M;
    public final Object N;
    public final Object O;
    public final FullScreenStateDelegate P;
    public final ListSubheaderDelegate Q;
    public final ListingCardBasicDelegate R;
    public final CellDetailsDelegate S;
    public final CellDetailsPriceDelegate T;
    public final TextDelegate U;
    public final RowDelegate V;
    public final AttributeSelectorSmallDelegate W;
    public final ScrollerDelegate X;
    public final RowLoadingDelegate Y;
    public final SelectableDelegate Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final Object f93296a0;

    public TravelFlightsCheckoutScreen(TravelFlightsCheckoutScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_travel_flights_checkout;
        this.M = s.t(this, j.f);
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: q5g.i

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TravelFlightsCheckoutScreen f242379b;

            {
                this.f242379b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                TravelFlightsCheckoutScreen travelFlightsCheckoutScreen = this.f242379b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = TravelFlightsCheckoutScreen.f93295b0;
                        qji.b bVarU2 = travelFlightsCheckoutScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.travel.flights.impl.ui.screen.checkout.di.TravelFlightsCheckoutScreenInjector");
                        f4g.p pVar = (f4g.p) bVarU2;
                        f4g.b bVar = pVar.f132168b;
                        f4g.p pVar2 = pVar.f132169c;
                        TravelFlightsCheckoutScreenContract$InputData travelFlightsCheckoutScreenContract$InputData = travelFlightsCheckoutScreen.K;
                        travelFlightsCheckoutScreenContract$InputData.getClass();
                        return new f4g.l(bVar, pVar2, travelFlightsCheckoutScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = TravelFlightsCheckoutScreen.f93295b0;
                        return (b0) ((f4g.l) travelFlightsCheckoutScreen.N.getValue()).f132146l.get();
                    default:
                        KProperty[] kPropertyArr3 = TravelFlightsCheckoutScreen.f93295b0;
                        TravelFlightsCheckoutScreen travelFlightsCheckoutScreen2 = this.f242379b;
                        return dli.f.a(travelFlightsCheckoutScreen2, travelFlightsCheckoutScreen2.R2(), zhm.v.k(travelFlightsCheckoutScreen2.P, travelFlightsCheckoutScreen2.Q, travelFlightsCheckoutScreen2.R, travelFlightsCheckoutScreen2.S, travelFlightsCheckoutScreen2.T, travelFlightsCheckoutScreen2.U, travelFlightsCheckoutScreen2.V, travelFlightsCheckoutScreen2.X, travelFlightsCheckoutScreen2.Y, travelFlightsCheckoutScreen2.Z), R$id.travelFlightsCheckoutScreen_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: q5g.i

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TravelFlightsCheckoutScreen f242379b;

            {
                this.f242379b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                TravelFlightsCheckoutScreen travelFlightsCheckoutScreen = this.f242379b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = TravelFlightsCheckoutScreen.f93295b0;
                        qji.b bVarU2 = travelFlightsCheckoutScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.travel.flights.impl.ui.screen.checkout.di.TravelFlightsCheckoutScreenInjector");
                        f4g.p pVar = (f4g.p) bVarU2;
                        f4g.b bVar = pVar.f132168b;
                        f4g.p pVar2 = pVar.f132169c;
                        TravelFlightsCheckoutScreenContract$InputData travelFlightsCheckoutScreenContract$InputData = travelFlightsCheckoutScreen.K;
                        travelFlightsCheckoutScreenContract$InputData.getClass();
                        return new f4g.l(bVar, pVar2, travelFlightsCheckoutScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = TravelFlightsCheckoutScreen.f93295b0;
                        return (b0) ((f4g.l) travelFlightsCheckoutScreen.N.getValue()).f132146l.get();
                    default:
                        KProperty[] kPropertyArr3 = TravelFlightsCheckoutScreen.f93295b0;
                        TravelFlightsCheckoutScreen travelFlightsCheckoutScreen2 = this.f242379b;
                        return dli.f.a(travelFlightsCheckoutScreen2, travelFlightsCheckoutScreen2.R2(), zhm.v.k(travelFlightsCheckoutScreen2.P, travelFlightsCheckoutScreen2.Q, travelFlightsCheckoutScreen2.R, travelFlightsCheckoutScreen2.S, travelFlightsCheckoutScreen2.T, travelFlightsCheckoutScreen2.U, travelFlightsCheckoutScreen2.V, travelFlightsCheckoutScreen2.X, travelFlightsCheckoutScreen2.Y, travelFlightsCheckoutScreen2.Z), R$id.travelFlightsCheckoutScreen_recyclerView, null, null, null, 56);
                }
            }
        });
        this.P = new FullScreenStateDelegate();
        this.Q = new ListSubheaderDelegate();
        this.R = new ListingCardBasicDelegate();
        this.S = new CellDetailsDelegate();
        this.T = new CellDetailsPriceDelegate();
        TextDelegate textDelegate = new TextDelegate();
        this.U = textDelegate;
        this.V = new RowDelegate(null, null, 7);
        AttributeSelectorSmallDelegate attributeSelectorSmallDelegate = new AttributeSelectorSmallDelegate();
        this.W = attributeSelectorSmallDelegate;
        this.X = new ScrollerDelegate(u.c(attributeSelectorSmallDelegate), false);
        this.Y = new RowLoadingDelegate();
        this.Z = new SelectableDelegate(textDelegate);
        final int i3 = 2;
        this.f93296a0 = w.y0(new Function0(this) { // from class: q5g.i

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TravelFlightsCheckoutScreen f242379b;

            {
                this.f242379b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                TravelFlightsCheckoutScreen travelFlightsCheckoutScreen = this.f242379b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = TravelFlightsCheckoutScreen.f93295b0;
                        qji.b bVarU2 = travelFlightsCheckoutScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.travel.flights.impl.ui.screen.checkout.di.TravelFlightsCheckoutScreenInjector");
                        f4g.p pVar = (f4g.p) bVarU2;
                        f4g.b bVar = pVar.f132168b;
                        f4g.p pVar2 = pVar.f132169c;
                        TravelFlightsCheckoutScreenContract$InputData travelFlightsCheckoutScreenContract$InputData = travelFlightsCheckoutScreen.K;
                        travelFlightsCheckoutScreenContract$InputData.getClass();
                        return new f4g.l(bVar, pVar2, travelFlightsCheckoutScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = TravelFlightsCheckoutScreen.f93295b0;
                        return (b0) ((f4g.l) travelFlightsCheckoutScreen.N.getValue()).f132146l.get();
                    default:
                        KProperty[] kPropertyArr3 = TravelFlightsCheckoutScreen.f93295b0;
                        TravelFlightsCheckoutScreen travelFlightsCheckoutScreen2 = this.f242379b;
                        return dli.f.a(travelFlightsCheckoutScreen2, travelFlightsCheckoutScreen2.R2(), zhm.v.k(travelFlightsCheckoutScreen2.P, travelFlightsCheckoutScreen2.Q, travelFlightsCheckoutScreen2.R, travelFlightsCheckoutScreen2.S, travelFlightsCheckoutScreen2.T, travelFlightsCheckoutScreen2.U, travelFlightsCheckoutScreen2.V, travelFlightsCheckoutScreen2.X, travelFlightsCheckoutScreen2.Y, travelFlightsCheckoutScreen2.Z), R$id.travelFlightsCheckoutScreen_recyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        c0 uiState = (c0) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        y yVar = qVar instanceof y ? (y) qVar : null;
        if (yVar == null || yVar.f242396a) {
            d3().f21257b.setMenuItems(uiState.f242360c);
        }
        if (yVar == null || yVar.f242397b) {
            a aVar = uiState.f242359b;
            if (aVar instanceof a0) {
                Clause clause = ((a0) aVar).f242355a;
                TwinVerticalButton twinVerticalButton = d3().d;
                twinVerticalButton.setVisibility(0);
                twinVerticalButton.setMainButtonEnabled(true);
                twinVerticalButton.setMainButtonText(clause);
                return;
            }
            if (aVar instanceof z) {
                CompositeClause compositeClause = ((z) aVar).f242398a;
                TwinVerticalButton twinVerticalButton2 = d3().d;
                twinVerticalButton2.setVisibility(0);
                twinVerticalButton2.setMainButtonEnabled(false);
                twinVerticalButton2.setMainButtonText(compositeClause);
                return;
            }
            if (!aVar.equals(a.C0565a.f93309a)) {
                throw new NoWhenBranchMatchedException();
            }
            TwinVerticalButton travelFlightsCheckoutScreenTwinVerticalButtonView = d3().d;
            Intrinsics.checkNotNullExpressionValue(travelFlightsCheckoutScreenTwinVerticalButtonView, "travelFlightsCheckoutScreenTwinVerticalButtonView");
            travelFlightsCheckoutScreenTwinVerticalButtonView.setVisibility(8);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (l) this.N.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar travelFlightsCheckoutScreenNavBar = d3().f21257b;
        Intrinsics.checkNotNullExpressionValue(travelFlightsCheckoutScreenNavBar, "travelFlightsCheckoutScreenNavBar");
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.travel_flights_checkout_screen_title, null, null, 14);
        Integer numValueOf = Integer.valueOf(ofm.q.k(q2()));
        q5g.a model = new q5g.a(textLocalisedClause, numValueOf);
        Intrinsics.checkNotNullParameter(travelFlightsCheckoutScreenNavBar, "<this>");
        Intrinsics.checkNotNullParameter(model, "model");
        travelFlightsCheckoutScreenNavBar.setToolbarTitle(textLocalisedClause);
        travelFlightsCheckoutScreenNavBar.setTitle(textLocalisedClause, null);
        travelFlightsCheckoutScreenNavBar.setNavigationButtonIcon(numValueOf);
        TwinVerticalButton twinVerticalButton = d3().d;
        twinVerticalButton.setFabImage(new ResourceImage(R$drawable.uikit_icn_24_arrow_thin_down, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorBackground), (List) null, (ImageTransformations) null, (Clause) null, 246));
        twinVerticalButton.setDescriptionVisibility(8);
        twinVerticalButton.setSecondaryButtonVisible(false);
        twinVerticalButton.setMainButtonLoadingTag("BUTTON_TAG_BOOK");
        twinVerticalButton.setCollapsed(true, false);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        ViewController.P2(this, rd0.e.b(d3().f21257b.f59410q), new m(this, continuation, 0), 3);
        ViewController.P2(this, rd0.e.b(this.P.f52371h.f121375b), new n(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.W.p()), new q5g.o(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.V.f53218h), new p(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.R.f52729c), new q5g.q(this, null), 3);
        ViewController.P2(this, rd0.e.b(d3().d.m0()), new m(this, continuation, 1), 3);
        ViewController.P2(this, rd0.e.b(d3().d.o0()), new m(this, continuation, 2), 3);
        ViewController.P2(this, rd0.e.b(d3().f21257b.o.f57403b), new k(this, continuation, 1), 3);
        ViewController.P2(this, rd0.e.b(this.Z.r()), new r(this, null), 3);
        TextDelegate textDelegate = this.U;
        ViewController.P2(this, rd0.e.b(textDelegate.d), new k(this, continuation, 0), 3);
        ViewController.P2(this, rd0.e.b(textDelegate.f53530c), new q5g.l(this, null), 3);
    }

    public final d d3() {
        ViewBinding value = this.M.getValue(this, f93295b0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (d) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final b0 R2() {
        return (b0) this.O.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.f93296a0.getValue();
    }
}
