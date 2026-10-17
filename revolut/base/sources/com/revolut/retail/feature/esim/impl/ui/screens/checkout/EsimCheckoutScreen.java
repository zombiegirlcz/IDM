package com.revolut.retail.feature.esim.impl.ui.screens.checkout;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import au0.f0;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.AttributeSelectorSmallDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsLoadingDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsPriceDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsRevPointsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsSwitcherDelegate;
import com.revolut.core.ui_kit.delegates.FooterTextDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.InputChecklistDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.ScrollerDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.buttons.CollapsingActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.esim.impl.R$id;
import com.revolut.retail.feature.esim.impl.R$layout;
import com.revolut.retail.feature.esim.impl.R$string;
import com.revolut.retail.feature.esim.impl.ui.screens.checkout.EsimCheckoutScreen;
import com.revolut.retail.feature.esim.impl.ui.screens.checkout.EsimCheckoutScreenContract$InputData;
import java.util.List;
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
import yzb.c;
import z0f.k;
import z75.f;
import zgj.a0;
import zgj.b;
import zgj.i;
import zgj.j;
import zgj.l;
import zgj.m;
import zgj.n;
import zgj.x;
import zgj.y;
import zgj.z;
import zhm.v;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/ui/screens/checkout/EsimCheckoutScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lzgj/x;", "Ldli/a;", "Lzgj/a0;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class EsimCheckoutScreen extends ViewController<x> implements dli.a {

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f100904a0 = {o0.f186429a.j(new h0(EsimCheckoutScreen.class, "binding", "getBinding()Lcom/revolut/retail/feature/esim/impl/databinding/ScreenEsimCheckoutBinding;", 0))};
    public final EsimCheckoutScreenContract$InputData K;
    public final int L;
    public final boolean M;
    public final h N;
    public final RowDelegate O;
    public final PlainTextDelegate P;
    public final FooterTextDelegate Q;
    public final CellDetailsDelegate R;
    public final FullScreenStateDelegate S;
    public final InputChecklistDelegate T;
    public final AttributeSelectorSmallDelegate U;
    public final CellDetailsSwitcherDelegate V;
    public final CellDetailsRevPointsDelegate W;
    public final Object X;
    public final Object Y;
    public final Object Z;

    public EsimCheckoutScreen(EsimCheckoutScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_esim_checkout;
        this.M = true;
        this.N = s.t(this, b.f);
        this.O = new RowDelegate(null, null, 7);
        this.P = new PlainTextDelegate();
        this.Q = new FooterTextDelegate();
        this.R = new CellDetailsDelegate();
        this.S = new FullScreenStateDelegate();
        this.T = new InputChecklistDelegate();
        this.U = new AttributeSelectorSmallDelegate();
        this.V = new CellDetailsSwitcherDelegate();
        this.W = new CellDetailsRevPointsDelegate();
        final int i = 0;
        this.X = w.y0(new Function0(this) { // from class: zgj.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EsimCheckoutScreen f322140b;

            {
                this.f322140b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                EsimCheckoutScreen esimCheckoutScreen = this.f322140b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = EsimCheckoutScreen.f100904a0;
                        qji.b bVarU2 = esimCheckoutScreen.U2();
                        if (bVarU2 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type com.revolut.retail.feature.esim.impl.ui.screens.checkout.di.EsimCheckoutScreenInjector");
                        }
                        afj.c cVar = (afj.c) bVarU2;
                        afj.b bVar = cVar.f4183b;
                        afj.c cVar2 = cVar.f4184c;
                        EsimCheckoutScreenContract$InputData esimCheckoutScreenContract$InputData = esimCheckoutScreen.K;
                        esimCheckoutScreenContract$InputData.getClass();
                        return new afj.e(bVar, cVar2, esimCheckoutScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = EsimCheckoutScreen.f100904a0;
                        return (y) ((afj.e) esimCheckoutScreen.X.getValue()).f4216h.get();
                    default:
                        KProperty[] kPropertyArr3 = EsimCheckoutScreen.f100904a0;
                        EsimCheckoutScreen esimCheckoutScreen2 = this.f322140b;
                        return dli.f.a(esimCheckoutScreen2, esimCheckoutScreen2.d(), zhm.v.k(esimCheckoutScreen2.O, esimCheckoutScreen2.P, esimCheckoutScreen2.Q, esimCheckoutScreen2.R, new RowLoadingDelegate(), esimCheckoutScreen2.S, new ListSubheaderDelegate(), new CellDetailsLoadingDelegate(), new CellDetailsPriceDelegate(), esimCheckoutScreen2.T, esimCheckoutScreen2.V, new ScrollerDelegate(zhm.u.c(esimCheckoutScreen2.U), false), esimCheckoutScreen2.W), R$id.screenEsimCheckout_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.Y = w.y0(new Function0(this) { // from class: zgj.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EsimCheckoutScreen f322140b;

            {
                this.f322140b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                EsimCheckoutScreen esimCheckoutScreen = this.f322140b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = EsimCheckoutScreen.f100904a0;
                        qji.b bVarU2 = esimCheckoutScreen.U2();
                        if (bVarU2 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type com.revolut.retail.feature.esim.impl.ui.screens.checkout.di.EsimCheckoutScreenInjector");
                        }
                        afj.c cVar = (afj.c) bVarU2;
                        afj.b bVar = cVar.f4183b;
                        afj.c cVar2 = cVar.f4184c;
                        EsimCheckoutScreenContract$InputData esimCheckoutScreenContract$InputData = esimCheckoutScreen.K;
                        esimCheckoutScreenContract$InputData.getClass();
                        return new afj.e(bVar, cVar2, esimCheckoutScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = EsimCheckoutScreen.f100904a0;
                        return (y) ((afj.e) esimCheckoutScreen.X.getValue()).f4216h.get();
                    default:
                        KProperty[] kPropertyArr3 = EsimCheckoutScreen.f100904a0;
                        EsimCheckoutScreen esimCheckoutScreen2 = this.f322140b;
                        return dli.f.a(esimCheckoutScreen2, esimCheckoutScreen2.d(), zhm.v.k(esimCheckoutScreen2.O, esimCheckoutScreen2.P, esimCheckoutScreen2.Q, esimCheckoutScreen2.R, new RowLoadingDelegate(), esimCheckoutScreen2.S, new ListSubheaderDelegate(), new CellDetailsLoadingDelegate(), new CellDetailsPriceDelegate(), esimCheckoutScreen2.T, esimCheckoutScreen2.V, new ScrollerDelegate(zhm.u.c(esimCheckoutScreen2.U), false), esimCheckoutScreen2.W), R$id.screenEsimCheckout_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i3 = 2;
        this.Z = w.y0(new Function0(this) { // from class: zgj.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EsimCheckoutScreen f322140b;

            {
                this.f322140b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                EsimCheckoutScreen esimCheckoutScreen = this.f322140b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = EsimCheckoutScreen.f100904a0;
                        qji.b bVarU2 = esimCheckoutScreen.U2();
                        if (bVarU2 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type com.revolut.retail.feature.esim.impl.ui.screens.checkout.di.EsimCheckoutScreenInjector");
                        }
                        afj.c cVar = (afj.c) bVarU2;
                        afj.b bVar = cVar.f4183b;
                        afj.c cVar2 = cVar.f4184c;
                        EsimCheckoutScreenContract$InputData esimCheckoutScreenContract$InputData = esimCheckoutScreen.K;
                        esimCheckoutScreenContract$InputData.getClass();
                        return new afj.e(bVar, cVar2, esimCheckoutScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = EsimCheckoutScreen.f100904a0;
                        return (y) ((afj.e) esimCheckoutScreen.X.getValue()).f4216h.get();
                    default:
                        KProperty[] kPropertyArr3 = EsimCheckoutScreen.f100904a0;
                        EsimCheckoutScreen esimCheckoutScreen2 = this.f322140b;
                        return dli.f.a(esimCheckoutScreen2, esimCheckoutScreen2.d(), zhm.v.k(esimCheckoutScreen2.O, esimCheckoutScreen2.P, esimCheckoutScreen2.Q, esimCheckoutScreen2.R, new RowLoadingDelegate(), esimCheckoutScreen2.S, new ListSubheaderDelegate(), new CellDetailsLoadingDelegate(), new CellDetailsPriceDelegate(), esimCheckoutScreen2.T, esimCheckoutScreen2.V, new ScrollerDelegate(zhm.u.c(esimCheckoutScreen2.U), false), esimCheckoutScreen2.W), R$id.screenEsimCheckout_recyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        a0 uiState = (a0) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        zgj.q qVar2 = uiState.f322143c;
        Clause clause = qVar2.f322172a;
        boolean z = qVar2.f322173b;
        CollapsingActionButton collapsingActionButton = d3().f296797b;
        collapsingActionButton.setLargeButtonEnabled(z);
        collapsingActionButton.setLargeButtonText(clause);
        z zVar = uiState.f322141a;
        NavBarWithToolbar navBarWithToolbar = d3().f296798c;
        navBarWithToolbar.setMenuItems(v.l(zVar != null ? zVar.f322188a : null));
        f0.t(navBarWithToolbar, zVar != null ? zVar.f322189b : null, false, 6);
        navBarWithToolbar.setDescriptionText(zVar != null ? zVar.f322190c : null);
        navBarWithToolbar.setDescriptionVisible((zVar != null ? zVar.f322190c : null) != null);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (afj.e) this.X.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f296798c;
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.esim_checkout_title, null, null, 14), null);
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.esim_checkout_title, null, null, 14));
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        CollapsingActionButton collapsingActionButton = d3().f296797b;
        collapsingActionButton.setCollapsible(true);
        collapsingActionButton.setLoadingButtonTag("ESIM_CHECKOUT_MAIN_BUTTON_LOADING_TAG");
        collapsingActionButton.V();
        collapsingActionButton.setFabImage(new ResourceImage(R$drawable.uikit_icn_24_arrow_thin_down, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorBackground), (List) null, (ImageTransformations) null, (Clause) null, 246));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        ViewController.P2(this, rd0.e.b(d3().f296798c.f59410q), new n(this, continuation, 0), 3);
        ViewController.P2(this, rd0.e.b(d3().f296797b.d()), new c(this, null, 15), 3);
        ViewController.P2(this, rd0.e.b(d3().f296797b.c()), new n(this, continuation, 1), 3);
        ViewController.P2(this, rd0.e.b(this.Q.e.f121375b), new i(this, continuation, 5), 3);
        ViewController.P2(this, new f(rd0.e.b(d3().f296798c.o.f57403b), 1), new n(this, continuation, 2), 3);
        CellDetailsDelegate cellDetailsDelegate = this.R;
        ViewController.P2(this, rd0.e.b(cellDetailsDelegate.e), new zgj.o(this, null), 3);
        ViewController.P2(this, new k(new f(rd0.e.b(cellDetailsDelegate.d), 2), 4), new i(this, continuation, 0), 3);
        ViewController.P2(this, rd0.e.b(this.S.f52371h.f121375b), new j(this, null), 3);
        ViewController.P2(this, new f(rd0.e.b(this.O.f53218h), 3), new zgj.k(this, null), 3);
        InputChecklistDelegate inputChecklistDelegate = this.T;
        ViewController.P2(this, rd0.e.b(inputChecklistDelegate.f52518c), new l(this, null), 3);
        ViewController.P2(this, rd0.e.b(inputChecklistDelegate.p()), new i(this, continuation, 1), 3);
        ViewController.P2(this, new f(rd0.e.b(this.U.p()), 5), new i(this, continuation, 2), 3);
        ViewController.P2(this, new f(rd0.e.b(this.V.f51912c), 4), new m(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.W.f51889c), new i(this, continuation, 3), 3);
        ViewController.P2(this, rd0.e.b(this.P.d.f121375b), new i(this, continuation, 4), 3);
    }

    public final wej.a d3() {
        ViewBinding value = this.N.getValue(this, f100904a0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (wej.a) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final y d() {
        return (y) this.Y.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getU() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.Z.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.M);
    }
}
