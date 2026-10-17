package com.revolut.retail.feature.airportlounges.impl.ui.screens.checkout;

import a83.j0;
import an9.i;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import au0.f0;
import axi.f;
import axi.g;
import axi.j;
import axi.k;
import axi.m;
import axi.n;
import axi.p;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.AttributeSelectorSmallDelegate;
import com.revolut.core.ui_kit.delegates.AttributeSelectorSmallLoadingDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsLoadingDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsPriceDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsStandaloneNoteDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.HighlightTileDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderLoadingDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.ScrollerDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.buttons.CollapsingActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;
import com.revolut.retail.feature.airportlounges.impl.R$string;
import com.revolut.retail.feature.airportlounges.impl.ui.screens.checkout.AirportLoungePassCheckoutScreen;
import com.revolut.retail.feature.airportlounges.impl.ui.screens.checkout.AirportLoungePassCheckoutScreenContract$InputData;
import com.revolut.retail.feature.airportlounges.impl.ui.screens.checkout.a;
import cwi.a0;
import efm.r;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import mga.i0;
import te0.w;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/retail/feature/airportlounges/impl/ui/screens/checkout/AirportLoungePassCheckoutScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laxi/m;", "Ldli/a;", "Laxi/q;", "Lmga/i0;", "feature_retail_airport_lounges_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AirportLoungePassCheckoutScreen extends ViewController<m> implements dli.a, i0 {
    public static final /* synthetic */ KProperty[] W = {o0.f186429a.j(new h0(AirportLoungePassCheckoutScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarCollapsingNextbuttonBinding;", 0))};
    public final AirportLoungePassCheckoutScreenContract$InputData K;
    public final int L;
    public final h M;
    public final Object N;
    public final Object O;
    public final Object P;
    public final Object Q;
    public final Object R;
    public final Object S;
    public final Object T;
    public final Object U;
    public final Object V;

    public AirportLoungePassCheckoutScreen(AirportLoungePassCheckoutScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbar_collapsing_nextbutton;
        this.M = s.t(this, axi.b.f);
        this.N = w.y0(new aw1.a(7));
        this.O = w.y0(new aw1.a(8));
        this.P = w.y0(new aw1.a(9));
        this.Q = w.y0(new aw1.a(10));
        this.R = w.y0(new aw1.a(11));
        this.S = w.y0(new aw1.a(12));
        final int i = 0;
        this.T = w.y0(new Function0(this) { // from class: axi.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AirportLoungePassCheckoutScreen f10944b;

            {
                this.f10944b = this;
            }

            /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v20, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r9v4, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                AirportLoungePassCheckoutScreen airportLoungePassCheckoutScreen = this.f10944b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = AirportLoungePassCheckoutScreen.W;
                        AirportLoungePassCheckoutScreen airportLoungePassCheckoutScreen2 = this.f10944b;
                        return dli.f.a(airportLoungePassCheckoutScreen2, airportLoungePassCheckoutScreen2.d(), zhm.v.k((FullScreenStateDelegate) airportLoungePassCheckoutScreen2.N.getValue(), (RowDelegate) airportLoungePassCheckoutScreen2.P.getValue(), new RowLoadingDelegate(), new ListSubheaderDelegate(), new ListSubheaderLoadingDelegate(), new ScrollerDelegate(zhm.v.k((AttributeSelectorSmallDelegate) airportLoungePassCheckoutScreen2.O.getValue(), new AttributeSelectorSmallLoadingDelegate()), false), (CellDetailsDelegate) airportLoungePassCheckoutScreen2.Q.getValue(), new CellDetailsPriceDelegate(), new CellDetailsLoadingDelegate(), new CellDetailsStandaloneNoteDelegate(), (TextDelegate) airportLoungePassCheckoutScreen2.R.getValue(), (HighlightTileDelegate) airportLoungePassCheckoutScreen2.S.getValue()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = AirportLoungePassCheckoutScreen.W;
                        qji.b bVarU2 = airportLoungePassCheckoutScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.airportlounges.impl.ui.screens.checkout.di.AirportLoungePassCheckoutScreenInjector");
                        cwi.y yVar = (cwi.y) bVarU2;
                        cwi.h0 h0Var = yVar.f109817b;
                        cwi.y yVar2 = yVar.f109818c;
                        AirportLoungePassCheckoutScreenContract$InputData airportLoungePassCheckoutScreenContract$InputData = airportLoungePassCheckoutScreen.K;
                        airportLoungePassCheckoutScreenContract$InputData.getClass();
                        return new cwi.a0(h0Var, yVar2, airportLoungePassCheckoutScreen, airportLoungePassCheckoutScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = AirportLoungePassCheckoutScreen.W;
                        return (n) ((cwi.a0) airportLoungePassCheckoutScreen.U.getValue()).o.get();
                }
            }
        });
        final int i2 = 1;
        this.U = w.y0(new Function0(this) { // from class: axi.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AirportLoungePassCheckoutScreen f10944b;

            {
                this.f10944b = this;
            }

            /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v20, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r9v4, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                AirportLoungePassCheckoutScreen airportLoungePassCheckoutScreen = this.f10944b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = AirportLoungePassCheckoutScreen.W;
                        AirportLoungePassCheckoutScreen airportLoungePassCheckoutScreen2 = this.f10944b;
                        return dli.f.a(airportLoungePassCheckoutScreen2, airportLoungePassCheckoutScreen2.d(), zhm.v.k((FullScreenStateDelegate) airportLoungePassCheckoutScreen2.N.getValue(), (RowDelegate) airportLoungePassCheckoutScreen2.P.getValue(), new RowLoadingDelegate(), new ListSubheaderDelegate(), new ListSubheaderLoadingDelegate(), new ScrollerDelegate(zhm.v.k((AttributeSelectorSmallDelegate) airportLoungePassCheckoutScreen2.O.getValue(), new AttributeSelectorSmallLoadingDelegate()), false), (CellDetailsDelegate) airportLoungePassCheckoutScreen2.Q.getValue(), new CellDetailsPriceDelegate(), new CellDetailsLoadingDelegate(), new CellDetailsStandaloneNoteDelegate(), (TextDelegate) airportLoungePassCheckoutScreen2.R.getValue(), (HighlightTileDelegate) airportLoungePassCheckoutScreen2.S.getValue()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = AirportLoungePassCheckoutScreen.W;
                        qji.b bVarU2 = airportLoungePassCheckoutScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.airportlounges.impl.ui.screens.checkout.di.AirportLoungePassCheckoutScreenInjector");
                        cwi.y yVar = (cwi.y) bVarU2;
                        cwi.h0 h0Var = yVar.f109817b;
                        cwi.y yVar2 = yVar.f109818c;
                        AirportLoungePassCheckoutScreenContract$InputData airportLoungePassCheckoutScreenContract$InputData = airportLoungePassCheckoutScreen.K;
                        airportLoungePassCheckoutScreenContract$InputData.getClass();
                        return new cwi.a0(h0Var, yVar2, airportLoungePassCheckoutScreen, airportLoungePassCheckoutScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = AirportLoungePassCheckoutScreen.W;
                        return (n) ((cwi.a0) airportLoungePassCheckoutScreen.U.getValue()).o.get();
                }
            }
        });
        final int i3 = 2;
        this.V = w.y0(new Function0(this) { // from class: axi.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AirportLoungePassCheckoutScreen f10944b;

            {
                this.f10944b = this;
            }

            /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v20, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r9v4, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                AirportLoungePassCheckoutScreen airportLoungePassCheckoutScreen = this.f10944b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = AirportLoungePassCheckoutScreen.W;
                        AirportLoungePassCheckoutScreen airportLoungePassCheckoutScreen2 = this.f10944b;
                        return dli.f.a(airportLoungePassCheckoutScreen2, airportLoungePassCheckoutScreen2.d(), zhm.v.k((FullScreenStateDelegate) airportLoungePassCheckoutScreen2.N.getValue(), (RowDelegate) airportLoungePassCheckoutScreen2.P.getValue(), new RowLoadingDelegate(), new ListSubheaderDelegate(), new ListSubheaderLoadingDelegate(), new ScrollerDelegate(zhm.v.k((AttributeSelectorSmallDelegate) airportLoungePassCheckoutScreen2.O.getValue(), new AttributeSelectorSmallLoadingDelegate()), false), (CellDetailsDelegate) airportLoungePassCheckoutScreen2.Q.getValue(), new CellDetailsPriceDelegate(), new CellDetailsLoadingDelegate(), new CellDetailsStandaloneNoteDelegate(), (TextDelegate) airportLoungePassCheckoutScreen2.R.getValue(), (HighlightTileDelegate) airportLoungePassCheckoutScreen2.S.getValue()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = AirportLoungePassCheckoutScreen.W;
                        qji.b bVarU2 = airportLoungePassCheckoutScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.airportlounges.impl.ui.screens.checkout.di.AirportLoungePassCheckoutScreenInjector");
                        cwi.y yVar = (cwi.y) bVarU2;
                        cwi.h0 h0Var = yVar.f109817b;
                        cwi.y yVar2 = yVar.f109818c;
                        AirportLoungePassCheckoutScreenContract$InputData airportLoungePassCheckoutScreenContract$InputData = airportLoungePassCheckoutScreen.K;
                        airportLoungePassCheckoutScreenContract$InputData.getClass();
                        return new cwi.a0(h0Var, yVar2, airportLoungePassCheckoutScreen, airportLoungePassCheckoutScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = AirportLoungePassCheckoutScreen.W;
                        return (n) ((cwi.a0) airportLoungePassCheckoutScreen.U.getValue()).o.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        axi.q uiState = (axi.q) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        p pVar = uiState.f10967b;
        NavBarWithToolbar navBarWithToolbar = d3().f174552c;
        navBarWithToolbar.setMenuItems(v.l(pVar != null ? pVar.f10963a : null));
        f0.t(navBarWithToolbar, pVar != null ? pVar.f10964b : null, false, 6);
        navBarWithToolbar.setDescriptionText(pVar != null ? pVar.f10965c : null);
        navBarWithToolbar.setDescriptionVisible((pVar != null ? pVar.f10965c : null) != null);
        a aVar = uiState.f10968c;
        if (aVar.equals(a.C0604a.f99054a)) {
            CollapsingActionButton collapsingGoToButton = d3().f174551b;
            Intrinsics.checkNotNullExpressionValue(collapsingGoToButton, "collapsingGoToButton");
            collapsingGoToButton.setVisibility(8);
        } else {
            if (!(aVar instanceof axi.o)) {
                throw new NoWhenBranchMatchedException();
            }
            CollapsingActionButton collapsingActionButton = d3().f174551b;
            axi.o oVar2 = (axi.o) aVar;
            collapsingActionButton.setLargeButtonText(oVar2.f10960a);
            collapsingActionButton.L(oVar2.f10961b);
            collapsingActionButton.setEnabled(oVar2.f10962c);
            collapsingActionButton.setVisibility(0);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // mga.i0
    public final r N0() {
        return ((HighlightTileDelegate) this.S.getValue()).f52437c;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (a0) this.U.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174552c;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.airport_lounges_checkout_header_title, null, null, 14);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        d3().f174551b.setFabImage(new ResourceImage(R$drawable.uikit_icn_24_arrow_thin_down, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorBackground), (List) null, (ImageTransformations) null, (Clause) null, 246));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // mga.i0
    public final r a2() {
        return ((RowDelegate) this.P.getValue()).f53218h;
    }

    /* JADX WARN: Type inference failed for: r6v10, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v15, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v21, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v26, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v39, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        ViewController.P2(this, rd0.e.b(d3().f174552c.f59410q), new axi.h(this, null, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174552c.o.f57403b), null, new axi.h(this, null, 2), 3);
        ViewController.P2(this, rd0.e.b(((AttributeSelectorSmallDelegate) this.O.getValue()).p()), new j(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, new j0(new i(rd0.e.b(((CellDetailsDelegate) this.Q.getValue()).d), 15), 5), null, new f(this, continuation, 1), 3);
        ?? r62 = this.P;
        com.revolut.kompot.navigable.a.g2(this, new i(rd0.e.b(((RowDelegate) r62.getValue()).f53218h), 16), null, new k(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((RowDelegate) r62.getValue()).f53226s), null, new f(this, continuation, 2), 3);
        ViewController.P2(this, rd0.e.b(((TextDelegate) this.R.getValue()).d), new f(this, continuation, 0), 3);
        ViewController.P2(this, rd0.e.b(d3().f174551b.d()), new g(this, null), 3);
        ViewController.P2(this, rd0.e.b(d3().f174551b.c()), new axi.h(this, null, 0), 3);
        ViewController.P2(this, rd0.e.b(((FullScreenStateDelegate) this.N.getValue()).f52371h.f121375b), new axi.i(this, null), 3);
    }

    public final jii.q d3() {
        ViewBinding value = this.M.getValue(this, W[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.q) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final n d() {
        return (n) this.V.getValue();
    }

    @Override // mga.l0
    public final View g0() {
        ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout = d3().f174550a;
        Intrinsics.checkNotNullExpressionValue(controllerContainerCoordinatorLayout, "getRoot(...)");
        return controllerContainerCoordinatorLayout;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.T.getValue();
    }
}
