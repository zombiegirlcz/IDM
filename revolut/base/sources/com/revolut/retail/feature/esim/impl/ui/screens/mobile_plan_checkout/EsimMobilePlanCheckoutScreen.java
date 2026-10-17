package com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_checkout;

import afj.r;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsLoadingDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsRevPointsDelegate;
import com.revolut.core.ui_kit.delegates.FooterTextDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.InputChecklistDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.buttons.CollapsingActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarMenuItem;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.esim.impl.R$id;
import com.revolut.retail.feature.esim.impl.R$layout;
import com.revolut.retail.feature.esim.impl.R$string;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_checkout.EsimMobilePlanCheckoutScreen;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_checkout.EsimMobilePlanCheckoutScreenContract$InputData;
import ihm.f;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import njf.d;
import njj.a0;
import njj.c;
import njj.c0;
import njj.i0;
import njj.j0;
import njj.k0;
import njj.l;
import njj.n;
import njj.t;
import njj.u;
import njj.x;
import njj.y;
import te0.w;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/ui/screens/mobile_plan_checkout/EsimMobilePlanCheckoutScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lnjj/i0;", "Ldli/a;", "Lnjj/k0;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class EsimMobilePlanCheckoutScreen extends ViewController<i0> implements dli.a {
    public static final /* synthetic */ KProperty[] Y = {o0.f186429a.j(new h0(EsimMobilePlanCheckoutScreen.class, "binding", "getBinding()Lcom/revolut/retail/feature/esim/impl/databinding/ScreenEsimCheckoutBinding;", 0))};
    public final EsimMobilePlanCheckoutScreenContract$InputData K;
    public final int L;
    public final h M;
    public final FullScreenStateDelegate N;
    public final RowDelegate O;
    public final CellDetailsDelegate P;
    public final ListSubheaderDelegate Q;
    public final FooterTextDelegate R;
    public final InputChecklistDelegate S;
    public final CellDetailsActionDelegate T;
    public final CellDetailsRevPointsDelegate U;
    public final Object V;
    public final Object W;
    public final Object X;

    public EsimMobilePlanCheckoutScreen(EsimMobilePlanCheckoutScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_esim_checkout;
        this.M = s.t(this, c.f);
        this.N = new FullScreenStateDelegate();
        this.O = new RowDelegate(null, null, 7);
        this.P = new CellDetailsDelegate();
        this.Q = new ListSubheaderDelegate();
        this.R = new FooterTextDelegate();
        this.S = new InputChecklistDelegate();
        this.T = new CellDetailsActionDelegate();
        this.U = new CellDetailsRevPointsDelegate();
        final int i = 0;
        this.V = w.y0(new Function0(this) { // from class: njj.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EsimMobilePlanCheckoutScreen f216542b;

            {
                this.f216542b = this;
            }

            /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                EsimMobilePlanCheckoutScreen esimMobilePlanCheckoutScreen = this.f216542b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = EsimMobilePlanCheckoutScreen.Y;
                        EsimMobilePlanCheckoutScreen esimMobilePlanCheckoutScreen2 = this.f216542b;
                        return dli.f.a(esimMobilePlanCheckoutScreen2, esimMobilePlanCheckoutScreen2.d(), zhm.v.k(esimMobilePlanCheckoutScreen2.N, new RowLoadingDelegate(), new CellDetailsLoadingDelegate(), esimMobilePlanCheckoutScreen2.U, esimMobilePlanCheckoutScreen2.O, esimMobilePlanCheckoutScreen2.Q, esimMobilePlanCheckoutScreen2.P, esimMobilePlanCheckoutScreen2.R, esimMobilePlanCheckoutScreen2.S, esimMobilePlanCheckoutScreen2.T), R$id.screenEsimCheckout_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = EsimMobilePlanCheckoutScreen.Y;
                        qji.b bVarU2 = esimMobilePlanCheckoutScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_checkout.di.EsimMobilePlanCheckoutScreenInjector");
                        afj.q qVar = (afj.q) bVarU2;
                        afj.b bVar = qVar.f4397b;
                        afj.q qVar2 = qVar.f4398c;
                        EsimMobilePlanCheckoutScreenContract$InputData esimMobilePlanCheckoutScreenContract$InputData = esimMobilePlanCheckoutScreen.K;
                        esimMobilePlanCheckoutScreenContract$InputData.getClass();
                        return new afj.r(bVar, qVar2, esimMobilePlanCheckoutScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = EsimMobilePlanCheckoutScreen.Y;
                        return (j0) ((afj.r) esimMobilePlanCheckoutScreen.W.getValue()).f4415h.get();
                }
            }
        });
        final int i2 = 1;
        this.W = w.y0(new Function0(this) { // from class: njj.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EsimMobilePlanCheckoutScreen f216542b;

            {
                this.f216542b = this;
            }

            /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                EsimMobilePlanCheckoutScreen esimMobilePlanCheckoutScreen = this.f216542b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = EsimMobilePlanCheckoutScreen.Y;
                        EsimMobilePlanCheckoutScreen esimMobilePlanCheckoutScreen2 = this.f216542b;
                        return dli.f.a(esimMobilePlanCheckoutScreen2, esimMobilePlanCheckoutScreen2.d(), zhm.v.k(esimMobilePlanCheckoutScreen2.N, new RowLoadingDelegate(), new CellDetailsLoadingDelegate(), esimMobilePlanCheckoutScreen2.U, esimMobilePlanCheckoutScreen2.O, esimMobilePlanCheckoutScreen2.Q, esimMobilePlanCheckoutScreen2.P, esimMobilePlanCheckoutScreen2.R, esimMobilePlanCheckoutScreen2.S, esimMobilePlanCheckoutScreen2.T), R$id.screenEsimCheckout_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = EsimMobilePlanCheckoutScreen.Y;
                        qji.b bVarU2 = esimMobilePlanCheckoutScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_checkout.di.EsimMobilePlanCheckoutScreenInjector");
                        afj.q qVar = (afj.q) bVarU2;
                        afj.b bVar = qVar.f4397b;
                        afj.q qVar2 = qVar.f4398c;
                        EsimMobilePlanCheckoutScreenContract$InputData esimMobilePlanCheckoutScreenContract$InputData = esimMobilePlanCheckoutScreen.K;
                        esimMobilePlanCheckoutScreenContract$InputData.getClass();
                        return new afj.r(bVar, qVar2, esimMobilePlanCheckoutScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = EsimMobilePlanCheckoutScreen.Y;
                        return (j0) ((afj.r) esimMobilePlanCheckoutScreen.W.getValue()).f4415h.get();
                }
            }
        });
        final int i3 = 2;
        this.X = w.y0(new Function0(this) { // from class: njj.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EsimMobilePlanCheckoutScreen f216542b;

            {
                this.f216542b = this;
            }

            /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                EsimMobilePlanCheckoutScreen esimMobilePlanCheckoutScreen = this.f216542b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = EsimMobilePlanCheckoutScreen.Y;
                        EsimMobilePlanCheckoutScreen esimMobilePlanCheckoutScreen2 = this.f216542b;
                        return dli.f.a(esimMobilePlanCheckoutScreen2, esimMobilePlanCheckoutScreen2.d(), zhm.v.k(esimMobilePlanCheckoutScreen2.N, new RowLoadingDelegate(), new CellDetailsLoadingDelegate(), esimMobilePlanCheckoutScreen2.U, esimMobilePlanCheckoutScreen2.O, esimMobilePlanCheckoutScreen2.Q, esimMobilePlanCheckoutScreen2.P, esimMobilePlanCheckoutScreen2.R, esimMobilePlanCheckoutScreen2.S, esimMobilePlanCheckoutScreen2.T), R$id.screenEsimCheckout_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = EsimMobilePlanCheckoutScreen.Y;
                        qji.b bVarU2 = esimMobilePlanCheckoutScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_checkout.di.EsimMobilePlanCheckoutScreenInjector");
                        afj.q qVar = (afj.q) bVarU2;
                        afj.b bVar = qVar.f4397b;
                        afj.q qVar2 = qVar.f4398c;
                        EsimMobilePlanCheckoutScreenContract$InputData esimMobilePlanCheckoutScreenContract$InputData = esimMobilePlanCheckoutScreen.K;
                        esimMobilePlanCheckoutScreenContract$InputData.getClass();
                        return new afj.r(bVar, qVar2, esimMobilePlanCheckoutScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = EsimMobilePlanCheckoutScreen.Y;
                        return (j0) ((afj.r) esimMobilePlanCheckoutScreen.W.getValue()).f4415h.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        k0 uiState = (k0) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        c0 c0Var = uiState.f216568a;
        NavBarMenuItem navBarMenuItem = uiState.f216569b;
        NavBarWithToolbar navBarWithToolbar = d3().f296798c;
        navBarWithToolbar.setMenuItems(v.l(navBarMenuItem));
        navBarWithToolbar.setSecondDescriptionVisible((c0Var != null ? c0Var.f216548a : null) != null);
        navBarWithToolbar.setSecondDescriptionText(c0Var != null ? c0Var.f216548a : null);
        a0 a0Var = uiState.d;
        Clause clause = a0Var.f216538a;
        boolean z = a0Var.f216539b;
        CollapsingActionButton collapsingActionButton = d3().f296797b;
        collapsingActionButton.setLargeButtonEnabled(z);
        collapsingActionButton.setLargeButtonText(clause);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (r) this.W.getValue();
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
        collapsingActionButton.setFabImage(new ResourceImage(R$drawable.uikit_icn_24_arrow_thin_down, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorBackground), (List) null, (ImageTransformations) null, (Clause) null, 246));
        collapsingActionButton.setLoadingButtonTag("ESIM_CHECKOUT_MAIN_BUTTON_LOADING_TAG");
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        ViewController.P2(this, rd0.e.b(d3().f296798c.f59410q), new u(this, continuation, 0), 3);
        ViewController.P2(this, new mmh.e(rd0.e.b(d3().f296798c.o.f57403b), 24), new u(this, continuation, 1), 3);
        ViewController.P2(this, rd0.e.b(this.N.f52371h.f121375b), new x(this, null), 3);
        ViewController.P2(this, rd0.e.b(d3().f296797b.d()), new n68.x(this, null, 20), 3);
        ViewController.P2(this, rd0.e.b(d3().f296797b.c()), new u(this, continuation, 2), 3);
        RowDelegate rowDelegate = this.O;
        ViewController.P2(this, new mmh.e(rd0.e.b(rowDelegate.f53218h), 25), new y(this, null), 3);
        ViewController.P2(this, new mmh.e(rd0.e.b(rowDelegate.f53225r), 26), new njj.q(this, null), 3);
        ViewController.P2(this, new mmh.e(wp5.y.x(rowDelegate.f53218h, rowDelegate.f53224q, "mergeWith(...)"), 27), new njj.r(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.T.d), new njj.s(this, null), 3);
        CellDetailsDelegate cellDetailsDelegate = this.P;
        ViewController.P2(this, new l(new mmh.e(rd0.e.b(cellDetailsDelegate.d), 28), 0), new t(this, continuation, 0), 3);
        ViewController.P2(this, new n(rd0.e.b(this.R.e.f121375b), 0), new t(this, continuation, 1), 3);
        f fVar = cellDetailsDelegate.d;
        ViewController.P2(this, new mmh.e(rd0.e.b(fVar), 29), new njj.v(this, null), 3);
        ViewController.P2(this, new n(rd0.e.b(fVar), 1), new t(this, continuation, 2), 3);
        ViewController.P2(this, rd0.e.b(w.a0(this.Q.f52707c, new d(4))), new t(this, continuation, 3), 3);
        InputChecklistDelegate inputChecklistDelegate = this.S;
        ViewController.P2(this, rd0.e.b(inputChecklistDelegate.f52518c), new njj.w(this, null), 3);
        ViewController.P2(this, new n(rd0.e.b(inputChecklistDelegate.p()), 2), new t(this, continuation, 4), 3);
        ViewController.P2(this, rd0.e.b(this.U.f51889c), new t(this, continuation, 5), 3);
    }

    public final wej.a d3() {
        ViewBinding value = this.M.getValue(this, Y[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (wej.a) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final j0 d() {
        return (j0) this.X.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.V.getValue();
    }
}
