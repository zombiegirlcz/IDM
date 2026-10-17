package com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_phone_number_checkout;

import a83.j0;
import afj.i0;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsLoadingDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsRevPointsDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.InputChecklistDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderLoadingDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
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
import com.revolut.retail.feature.esim.impl.R$string;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_phone_number_checkout.EsimMobilePlanPhoneNumberCheckoutScreen;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_phone_number_checkout.EsimMobilePlanPhoneNumberCheckoutScreenContract$InputData;
import d83.i;
import dkk.a0;
import dmj.b0;
import dmj.c0;
import dmj.d;
import dmj.k;
import dmj.p;
import dmj.r;
import dmj.t;
import dmj.u;
import dmj.x;
import dmj.z;
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
import wp5.y;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/ui/screens/mobile_plan_phone_number_checkout/EsimMobilePlanPhoneNumberCheckoutScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lcom/revolut/retail/feature/esim/impl/ui/screens/mobile_plan_phone_number_checkout/a;", "Ldli/a;", "Ldmj/c0;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class EsimMobilePlanPhoneNumberCheckoutScreen extends ViewController<a> implements dli.a {
    public static final /* synthetic */ KProperty[] X = {o0.f186429a.j(new h0(EsimMobilePlanPhoneNumberCheckoutScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarCollapsingNextbuttonBinding;", 0))};
    public final EsimMobilePlanPhoneNumberCheckoutScreenContract$InputData K;
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
    public final Object W;

    public EsimMobilePlanPhoneNumberCheckoutScreen(EsimMobilePlanPhoneNumberCheckoutScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbar_collapsing_nextbutton;
        this.M = s.t(this, d.f);
        this.N = w.y0(new dkd.a(25));
        this.O = w.y0(new dkd.a(26));
        this.P = w.y0(new dkd.a(27));
        this.Q = w.y0(new dkd.a(28));
        this.R = w.y0(new dkd.a(29));
        this.S = w.y0(new dmj.b(0));
        this.T = w.y0(new dmj.b(1));
        final int i = 0;
        this.U = w.y0(new Function0(this) { // from class: dmj.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EsimMobilePlanPhoneNumberCheckoutScreen f116141b;

            {
                this.f116141b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                EsimMobilePlanPhoneNumberCheckoutScreen esimMobilePlanPhoneNumberCheckoutScreen = this.f116141b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = EsimMobilePlanPhoneNumberCheckoutScreen.X;
                        EsimMobilePlanPhoneNumberCheckoutScreen esimMobilePlanPhoneNumberCheckoutScreen2 = this.f116141b;
                        return dli.f.a(esimMobilePlanPhoneNumberCheckoutScreen2, esimMobilePlanPhoneNumberCheckoutScreen2.d(), zhm.v.k((FullScreenStateDelegate) esimMobilePlanPhoneNumberCheckoutScreen2.N.getValue(), new RowLoadingDelegate(), new CellDetailsLoadingDelegate(), (RowDelegate) esimMobilePlanPhoneNumberCheckoutScreen2.O.getValue(), (CellDetailsDelegate) esimMobilePlanPhoneNumberCheckoutScreen2.P.getValue(), new ListSubheaderDelegate(), new ListSubheaderLoadingDelegate(), (TextDelegate) esimMobilePlanPhoneNumberCheckoutScreen2.Q.getValue(), (CellDetailsRevPointsDelegate) esimMobilePlanPhoneNumberCheckoutScreen2.T.getValue(), (InputChecklistDelegate) esimMobilePlanPhoneNumberCheckoutScreen2.R.getValue(), (CellDetailsActionDelegate) esimMobilePlanPhoneNumberCheckoutScreen2.S.getValue()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = EsimMobilePlanPhoneNumberCheckoutScreen.X;
                        qji.b bVarU2 = esimMobilePlanPhoneNumberCheckoutScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_phone_number_checkout.di.EsimMobilePlanPhoneNumberCheckoutScreenInjector");
                        afj.k0 k0Var = (afj.k0) bVarU2;
                        afj.b bVar = k0Var.f4310b;
                        afj.k0 k0Var2 = k0Var.f4311c;
                        EsimMobilePlanPhoneNumberCheckoutScreenContract$InputData esimMobilePlanPhoneNumberCheckoutScreenContract$InputData = esimMobilePlanPhoneNumberCheckoutScreen.K;
                        esimMobilePlanPhoneNumberCheckoutScreenContract$InputData.getClass();
                        return new afj.i0(bVar, k0Var2, esimMobilePlanPhoneNumberCheckoutScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = EsimMobilePlanPhoneNumberCheckoutScreen.X;
                        return (b0) ((afj.i0) esimMobilePlanPhoneNumberCheckoutScreen.V.getValue()).d.get();
                }
            }
        });
        final int i2 = 1;
        this.V = w.y0(new Function0(this) { // from class: dmj.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EsimMobilePlanPhoneNumberCheckoutScreen f116141b;

            {
                this.f116141b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                EsimMobilePlanPhoneNumberCheckoutScreen esimMobilePlanPhoneNumberCheckoutScreen = this.f116141b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = EsimMobilePlanPhoneNumberCheckoutScreen.X;
                        EsimMobilePlanPhoneNumberCheckoutScreen esimMobilePlanPhoneNumberCheckoutScreen2 = this.f116141b;
                        return dli.f.a(esimMobilePlanPhoneNumberCheckoutScreen2, esimMobilePlanPhoneNumberCheckoutScreen2.d(), zhm.v.k((FullScreenStateDelegate) esimMobilePlanPhoneNumberCheckoutScreen2.N.getValue(), new RowLoadingDelegate(), new CellDetailsLoadingDelegate(), (RowDelegate) esimMobilePlanPhoneNumberCheckoutScreen2.O.getValue(), (CellDetailsDelegate) esimMobilePlanPhoneNumberCheckoutScreen2.P.getValue(), new ListSubheaderDelegate(), new ListSubheaderLoadingDelegate(), (TextDelegate) esimMobilePlanPhoneNumberCheckoutScreen2.Q.getValue(), (CellDetailsRevPointsDelegate) esimMobilePlanPhoneNumberCheckoutScreen2.T.getValue(), (InputChecklistDelegate) esimMobilePlanPhoneNumberCheckoutScreen2.R.getValue(), (CellDetailsActionDelegate) esimMobilePlanPhoneNumberCheckoutScreen2.S.getValue()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = EsimMobilePlanPhoneNumberCheckoutScreen.X;
                        qji.b bVarU2 = esimMobilePlanPhoneNumberCheckoutScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_phone_number_checkout.di.EsimMobilePlanPhoneNumberCheckoutScreenInjector");
                        afj.k0 k0Var = (afj.k0) bVarU2;
                        afj.b bVar = k0Var.f4310b;
                        afj.k0 k0Var2 = k0Var.f4311c;
                        EsimMobilePlanPhoneNumberCheckoutScreenContract$InputData esimMobilePlanPhoneNumberCheckoutScreenContract$InputData = esimMobilePlanPhoneNumberCheckoutScreen.K;
                        esimMobilePlanPhoneNumberCheckoutScreenContract$InputData.getClass();
                        return new afj.i0(bVar, k0Var2, esimMobilePlanPhoneNumberCheckoutScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = EsimMobilePlanPhoneNumberCheckoutScreen.X;
                        return (b0) ((afj.i0) esimMobilePlanPhoneNumberCheckoutScreen.V.getValue()).d.get();
                }
            }
        });
        final int i3 = 2;
        this.W = w.y0(new Function0(this) { // from class: dmj.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EsimMobilePlanPhoneNumberCheckoutScreen f116141b;

            {
                this.f116141b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                EsimMobilePlanPhoneNumberCheckoutScreen esimMobilePlanPhoneNumberCheckoutScreen = this.f116141b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = EsimMobilePlanPhoneNumberCheckoutScreen.X;
                        EsimMobilePlanPhoneNumberCheckoutScreen esimMobilePlanPhoneNumberCheckoutScreen2 = this.f116141b;
                        return dli.f.a(esimMobilePlanPhoneNumberCheckoutScreen2, esimMobilePlanPhoneNumberCheckoutScreen2.d(), zhm.v.k((FullScreenStateDelegate) esimMobilePlanPhoneNumberCheckoutScreen2.N.getValue(), new RowLoadingDelegate(), new CellDetailsLoadingDelegate(), (RowDelegate) esimMobilePlanPhoneNumberCheckoutScreen2.O.getValue(), (CellDetailsDelegate) esimMobilePlanPhoneNumberCheckoutScreen2.P.getValue(), new ListSubheaderDelegate(), new ListSubheaderLoadingDelegate(), (TextDelegate) esimMobilePlanPhoneNumberCheckoutScreen2.Q.getValue(), (CellDetailsRevPointsDelegate) esimMobilePlanPhoneNumberCheckoutScreen2.T.getValue(), (InputChecklistDelegate) esimMobilePlanPhoneNumberCheckoutScreen2.R.getValue(), (CellDetailsActionDelegate) esimMobilePlanPhoneNumberCheckoutScreen2.S.getValue()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = EsimMobilePlanPhoneNumberCheckoutScreen.X;
                        qji.b bVarU2 = esimMobilePlanPhoneNumberCheckoutScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_phone_number_checkout.di.EsimMobilePlanPhoneNumberCheckoutScreenInjector");
                        afj.k0 k0Var = (afj.k0) bVarU2;
                        afj.b bVar = k0Var.f4310b;
                        afj.k0 k0Var2 = k0Var.f4311c;
                        EsimMobilePlanPhoneNumberCheckoutScreenContract$InputData esimMobilePlanPhoneNumberCheckoutScreenContract$InputData = esimMobilePlanPhoneNumberCheckoutScreen.K;
                        esimMobilePlanPhoneNumberCheckoutScreenContract$InputData.getClass();
                        return new afj.i0(bVar, k0Var2, esimMobilePlanPhoneNumberCheckoutScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = EsimMobilePlanPhoneNumberCheckoutScreen.X;
                        return (b0) ((afj.i0) esimMobilePlanPhoneNumberCheckoutScreen.V.getValue()).d.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        c0 uiState = (c0) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        d3().f174552c.setMenuItems(v.l(uiState.f116142a));
        z zVar = uiState.f116144c;
        CollapsingActionButton collapsingActionButton = d3().f174551b;
        collapsingActionButton.setLargeButtonEnabled(zVar.f116190b);
        collapsingActionButton.setLargeButtonText(zVar.f116189a);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (i0) this.V.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174552c;
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.esim_checkout_title, null, null, 14));
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.esim_checkout_title, null, null, 14), null);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        CollapsingActionButton collapsingActionButton = d3().f174551b;
        collapsingActionButton.setFabImage(new ResourceImage(R$drawable.uikit_icn_24_arrow_thin_down, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorBackground), (List) null, (ImageTransformations) null, (Clause) null, 246));
        collapsingActionButton.setLoadingButtonTag("ESIM_CHECKOUT_MAIN_BUTTON_LOADING_TAG");
    }

    /* JADX WARN: Type inference failed for: r6v19, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v25, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v31, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v37, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v43, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v49, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v54, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174552c.f59410q), null, new dmj.s(this, continuation, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, new i(rd0.e.b(d3().f174552c.o.f57403b), 25), null, new dmj.s(this, continuation, 2), 3);
        ViewController.P2(this, rd0.e.b(d3().f174551b.d()), new dmj.v(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174551b.c()), null, new dmj.s(this, continuation, 3), 3);
        ViewController.P2(this, rd0.e.b(((FullScreenStateDelegate) this.N.getValue()).f52371h.f121375b), new dmj.w(this, null), 3);
        ?? r62 = this.O;
        com.revolut.kompot.navigable.a.g2(this, new i(rd0.e.b(((RowDelegate) r62.getValue()).f53218h), 26), null, new x(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, new i(rd0.e.b(((RowDelegate) r62.getValue()).f53225r), 27), null, new p(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, new i(y.x(((RowDelegate) r62.getValue()).f53218h, ((RowDelegate) r62.getValue()).f53224q, "mergeWith(...)"), 28), null, new dmj.q(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, new k(rd0.e.b(((TextDelegate) this.Q.getValue()).d), 1), null, new r(this, null, 0), 3);
        ?? r64 = this.P;
        com.revolut.kompot.navigable.a.g2(this, new j0(new i(rd0.e.b(((CellDetailsDelegate) r64.getValue()).d), 29), 24), null, new r(this, null, 1), 3);
        ViewController.P2(this, new j0(new k(rd0.e.b(((CellDetailsDelegate) r64.getValue()).d), 0), 25), new r(this, null, 2), 3);
        ?? r67 = this.R;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((InputChecklistDelegate) r67.getValue()).f52518c), null, new t(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, new k(rd0.e.b(((InputChecklistDelegate) r67.getValue()).p()), 2), null, new r(this, null, 3), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((CellDetailsActionDelegate) this.S.getValue()).d), null, new u(this, null), 3);
        efm.r rVarFilter = ((CellDetailsRevPointsDelegate) this.T.getValue()).f51889c.filter(new a0(new dmj.a(0), 2));
        Intrinsics.checkNotNullExpressionValue(rVarFilter, "filter(...)");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(rVarFilter), null, new dmj.s(this, continuation, 1), 3);
    }

    public final jii.q d3() {
        ViewBinding value = this.M.getValue(this, X[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.q) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final b0 d() {
        return (b0) this.W.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.U.getValue();
    }
}
