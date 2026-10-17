package com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.checkout;

import a83.j0;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import au0.f0;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.AttributeSelectorSmallDelegate;
import com.revolut.core.ui_kit.delegates.AttributeSelectorSmallLoadingDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsLoadingDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsPriceDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsStandaloneNoteDelegate;
import com.revolut.core.ui_kit.delegates.EsimDelegate;
import com.revolut.core.ui_kit.delegates.EsimLoadingDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderLoadingDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
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
import com.revolut.retail.feature.airport.security_fast_track.impl.R$string;
import com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.checkout.AsftCheckoutScreen;
import com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.checkout.AsftCheckoutScreenContract$InputData;
import com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.checkout.a;
import cui.f;
import cui.g;
import cui.i;
import cui.j;
import cui.k;
import cui.n;
import cui.p;
import cui.r;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import lti.d;
import te0.w;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/airport/security_fast_track/impl/ui/screens/checkout/AsftCheckoutScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lcui/n;", "Ldli/a;", "Lcui/r;", "feature_retail_airport_security_fast_track_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AsftCheckoutScreen extends ViewController<n> implements dli.a {
    public static final /* synthetic */ KProperty[] V = {o0.f186429a.j(new h0(AsftCheckoutScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarCollapsingNextbuttonBinding;", 0))};
    public final AsftCheckoutScreenContract$InputData K;
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

    public AsftCheckoutScreen(AsftCheckoutScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbar_collapsing_nextbutton;
        this.M = s.t(this, cui.b.f);
        this.N = w.y0(new cpi.b(13));
        this.O = w.y0(new cpi.b(14));
        this.P = w.y0(new cpi.b(15));
        this.Q = w.y0(new cpi.b(16));
        this.R = w.y0(new cpi.b(17));
        final int i = 0;
        this.S = w.y0(new Function0(this) { // from class: cui.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AsftCheckoutScreen f109002b;

            {
                this.f109002b = this;
            }

            /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r10v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r12v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v18, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                AsftCheckoutScreen asftCheckoutScreen = this.f109002b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = AsftCheckoutScreen.V;
                        AsftCheckoutScreen asftCheckoutScreen2 = this.f109002b;
                        return dli.f.a(asftCheckoutScreen2, asftCheckoutScreen2.d(), zhm.v.k(new ListSubheaderDelegate(), new ListSubheaderLoadingDelegate(), new EsimDelegate(), new EsimLoadingDelegate(), (CellDetailsDelegate) asftCheckoutScreen2.P.getValue(), (FullScreenStateDelegate) asftCheckoutScreen2.N.getValue(), new ScrollerDelegate(zhm.v.k((AttributeSelectorSmallDelegate) asftCheckoutScreen2.O.getValue(), new AttributeSelectorSmallLoadingDelegate()), false), new CellDetailsPriceDelegate(), new CellDetailsLoadingDelegate(), new CellDetailsStandaloneNoteDelegate(), (RowDelegate) asftCheckoutScreen2.Q.getValue(), (TextDelegate) asftCheckoutScreen2.R.getValue()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = AsftCheckoutScreen.V;
                        qji.b bVarU2 = asftCheckoutScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.checkout.di.AsftCheckoutScreenInjector");
                        lti.k kVar = (lti.k) bVarU2;
                        lti.g gVar = kVar.f199922a;
                        lti.k kVar2 = kVar.f199923b;
                        AsftCheckoutScreenContract$InputData asftCheckoutScreenContract$InputData = asftCheckoutScreen.K;
                        asftCheckoutScreenContract$InputData.getClass();
                        return new lti.d(gVar, kVar2, asftCheckoutScreen, asftCheckoutScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = AsftCheckoutScreen.V;
                        return (o) ((lti.d) asftCheckoutScreen.T.getValue()).i.get();
                }
            }
        });
        final int i2 = 1;
        this.T = w.y0(new Function0(this) { // from class: cui.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AsftCheckoutScreen f109002b;

            {
                this.f109002b = this;
            }

            /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r10v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r12v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v18, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                AsftCheckoutScreen asftCheckoutScreen = this.f109002b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = AsftCheckoutScreen.V;
                        AsftCheckoutScreen asftCheckoutScreen2 = this.f109002b;
                        return dli.f.a(asftCheckoutScreen2, asftCheckoutScreen2.d(), zhm.v.k(new ListSubheaderDelegate(), new ListSubheaderLoadingDelegate(), new EsimDelegate(), new EsimLoadingDelegate(), (CellDetailsDelegate) asftCheckoutScreen2.P.getValue(), (FullScreenStateDelegate) asftCheckoutScreen2.N.getValue(), new ScrollerDelegate(zhm.v.k((AttributeSelectorSmallDelegate) asftCheckoutScreen2.O.getValue(), new AttributeSelectorSmallLoadingDelegate()), false), new CellDetailsPriceDelegate(), new CellDetailsLoadingDelegate(), new CellDetailsStandaloneNoteDelegate(), (RowDelegate) asftCheckoutScreen2.Q.getValue(), (TextDelegate) asftCheckoutScreen2.R.getValue()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = AsftCheckoutScreen.V;
                        qji.b bVarU2 = asftCheckoutScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.checkout.di.AsftCheckoutScreenInjector");
                        lti.k kVar = (lti.k) bVarU2;
                        lti.g gVar = kVar.f199922a;
                        lti.k kVar2 = kVar.f199923b;
                        AsftCheckoutScreenContract$InputData asftCheckoutScreenContract$InputData = asftCheckoutScreen.K;
                        asftCheckoutScreenContract$InputData.getClass();
                        return new lti.d(gVar, kVar2, asftCheckoutScreen, asftCheckoutScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = AsftCheckoutScreen.V;
                        return (o) ((lti.d) asftCheckoutScreen.T.getValue()).i.get();
                }
            }
        });
        final int i3 = 2;
        this.U = w.y0(new Function0(this) { // from class: cui.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AsftCheckoutScreen f109002b;

            {
                this.f109002b = this;
            }

            /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r10v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r12v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v18, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                AsftCheckoutScreen asftCheckoutScreen = this.f109002b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = AsftCheckoutScreen.V;
                        AsftCheckoutScreen asftCheckoutScreen2 = this.f109002b;
                        return dli.f.a(asftCheckoutScreen2, asftCheckoutScreen2.d(), zhm.v.k(new ListSubheaderDelegate(), new ListSubheaderLoadingDelegate(), new EsimDelegate(), new EsimLoadingDelegate(), (CellDetailsDelegate) asftCheckoutScreen2.P.getValue(), (FullScreenStateDelegate) asftCheckoutScreen2.N.getValue(), new ScrollerDelegate(zhm.v.k((AttributeSelectorSmallDelegate) asftCheckoutScreen2.O.getValue(), new AttributeSelectorSmallLoadingDelegate()), false), new CellDetailsPriceDelegate(), new CellDetailsLoadingDelegate(), new CellDetailsStandaloneNoteDelegate(), (RowDelegate) asftCheckoutScreen2.Q.getValue(), (TextDelegate) asftCheckoutScreen2.R.getValue()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = AsftCheckoutScreen.V;
                        qji.b bVarU2 = asftCheckoutScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.checkout.di.AsftCheckoutScreenInjector");
                        lti.k kVar = (lti.k) bVarU2;
                        lti.g gVar = kVar.f199922a;
                        lti.k kVar2 = kVar.f199923b;
                        AsftCheckoutScreenContract$InputData asftCheckoutScreenContract$InputData = asftCheckoutScreen.K;
                        asftCheckoutScreenContract$InputData.getClass();
                        return new lti.d(gVar, kVar2, asftCheckoutScreen, asftCheckoutScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = AsftCheckoutScreen.V;
                        return (o) ((lti.d) asftCheckoutScreen.T.getValue()).i.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        r uiState = (r) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        cui.q qVar2 = uiState.f109023b;
        NavBarWithToolbar navBarWithToolbar = d3().f174552c;
        navBarWithToolbar.setMenuItems(v.l(qVar2.f109019a));
        f0.t(navBarWithToolbar, qVar2.f109020b, false, 6);
        Clause clause = qVar2.f109021c;
        navBarWithToolbar.setDescriptionText(clause);
        navBarWithToolbar.setDescriptionVisible(clause != null);
        a aVar = uiState.f109024c;
        if (aVar.equals(a.C0600a.f98810a)) {
            CollapsingActionButton collapsingGoToButton = d3().f174551b;
            Intrinsics.checkNotNullExpressionValue(collapsingGoToButton, "collapsingGoToButton");
            collapsingGoToButton.setVisibility(8);
        } else {
            if (!(aVar instanceof p)) {
                throw new NoWhenBranchMatchedException();
            }
            CollapsingActionButton collapsingActionButton = d3().f174551b;
            p pVar = (p) aVar;
            collapsingActionButton.setLargeButtonText(pVar.f109016a);
            collapsingActionButton.L(pVar.f109017b);
            collapsingActionButton.setEnabled(pVar.f109018c);
            collapsingActionButton.setVisibility(0);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (d) this.T.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174552c;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.asft_checkout_title, null, null, 14);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        d3().f174551b.setFabImage(new ResourceImage(R$drawable.uikit_icn_24_arrow_thin_down, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorBackground), (List) null, (ImageTransformations) null, (Clause) null, 246));
    }

    /* JADX WARN: Type inference failed for: r5v10, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v15, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v21, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v27, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v40, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        ViewController.P2(this, rd0.e.b(d3().f174552c.f59410q), new g(this, null, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174552c.o.f57403b), null, new g(this, null, 2), 3);
        ViewController.P2(this, rd0.e.b(((AttributeSelectorSmallDelegate) this.O.getValue()).p()), new i(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, new j0(new cbf.c(rd0.e.b(((CellDetailsDelegate) this.P.getValue()).d), 22), 17), null, new j(this, continuation, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, new cbf.c(rd0.e.b(((RowDelegate) this.Q.getValue()).f53218h), 23), null, new k(this, null), 3);
        ViewController.P2(this, rd0.e.b(((TextDelegate) this.R.getValue()).d), new j(this, continuation, 1), 3);
        ViewController.P2(this, rd0.e.b(d3().f174551b.d()), new f(this, null), 3);
        ViewController.P2(this, rd0.e.b(d3().f174551b.c()), new g(this, null, 0), 3);
        ViewController.P2(this, rd0.e.b(((FullScreenStateDelegate) this.N.getValue()).f52371h.f121375b), new cui.h(this, null), 3);
    }

    public final jii.q d3() {
        ViewBinding value = this.M.getValue(this, V[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.q) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final cui.o d() {
        return (cui.o) this.U.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getO() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.S.getValue();
    }
}
