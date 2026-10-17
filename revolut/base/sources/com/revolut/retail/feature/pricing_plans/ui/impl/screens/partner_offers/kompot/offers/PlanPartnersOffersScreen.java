package com.revolut.retail.feature.pricing_plans.ui.impl.screens.partner_offers.kompot.offers;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.delegates.CenteredContentTileDelegate;
import com.revolut.core.ui_kit.delegates.CenteredContentTileLoadingDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.GridBoxDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.pricing_plans.ui.impl.R$string;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.partner_offers.kompot.offers.PlanPartnersOffersScreen;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.partner_offers.kompot.offers.PlanPartnersOffersScreenContract$InputData;
import dli.a;
import efm.r;
import jii.u;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import qgk.i0;
import qgk.w0;
import qgk.x0;
import te0.w;
import ukk.b;
import ukk.c;
import ukk.d;
import ukk.g;
import ukk.i;
import ukk.j;
import ukk.k;
import vc.s;
import xki.e;
import z92.f;
import zhm.v;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/impl/screens/partner_offers/kompot/offers/PlanPartnersOffersScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lukk/k;", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PlanPartnersOffersScreen extends ViewController<q> implements a {
    public static final /* synthetic */ KProperty[] W = {o0.f186429a.j(new h0(PlanPartnersOffersScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};
    public final PlanPartnersOffersScreenContract$InputData K;
    public final int L;
    public final int M;
    public final CenteredContentTileDelegate N;
    public final FullScreenStateDelegate O;
    public final RowDelegate P;
    public final ListSubheaderDelegate Q;
    public final GridBoxDelegate R;
    public final Object S;
    public final h T;
    public final Object U;
    public final Object V;

    public PlanPartnersOffersScreen(PlanPartnersOffersScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbar_nextbutton;
        this.M = f.m(inputData.f103456a);
        CenteredContentTileDelegate centeredContentTileDelegate = new CenteredContentTileDelegate();
        this.N = centeredContentTileDelegate;
        this.O = new FullScreenStateDelegate();
        this.P = new RowDelegate(null, null, 7);
        this.Q = new ListSubheaderDelegate();
        final int i = 2;
        final int i2 = 0;
        final int i3 = 1;
        this.R = new GridBoxDelegate(v.k(centeredContentTileDelegate, new CenteredContentTileLoadingDelegate()), 8.0f, 8.0f, 3);
        this.S = w.y0(new Function0(this) { // from class: ukk.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PlanPartnersOffersScreen f280773b;

            {
                this.f280773b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i5 = i2;
                PlanPartnersOffersScreen planPartnersOffersScreen = this.f280773b;
                switch (i5) {
                    case 0:
                        KProperty[] kPropertyArr = PlanPartnersOffersScreen.W;
                        PlanPartnersOffersScreen planPartnersOffersScreen2 = this.f280773b;
                        return dli.f.a(planPartnersOffersScreen2, planPartnersOffersScreen2.d(), v.k(planPartnersOffersScreen2.O, planPartnersOffersScreen2.R, planPartnersOffersScreen2.Q, planPartnersOffersScreen2.P, new TextDelegate()), 0, null, null, null, 60);
                    case 1:
                        KProperty[] kPropertyArr2 = PlanPartnersOffersScreen.W;
                        qji.b bVarU2 = planPartnersOffersScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.pricing_plans.ui.impl.screens.partner_offers.kompot.offers.di.PlanPartnersOffersScreenInjector");
                        w0 w0Var = (w0) bVarU2;
                        i0 i0Var = w0Var.f246304b;
                        w0 w0Var2 = w0Var.f246305c;
                        PlanPartnersOffersScreenContract$InputData planPartnersOffersScreenContract$InputData = planPartnersOffersScreen.K;
                        planPartnersOffersScreenContract$InputData.getClass();
                        return new x0(i0Var, w0Var2, planPartnersOffersScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = PlanPartnersOffersScreen.W;
                        return (i) ((x0) planPartnersOffersScreen.U.getValue()).f246321c.get();
                }
            }
        });
        this.T = s.t(this, b.f);
        this.U = w.y0(new Function0(this) { // from class: ukk.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PlanPartnersOffersScreen f280773b;

            {
                this.f280773b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i5 = i3;
                PlanPartnersOffersScreen planPartnersOffersScreen = this.f280773b;
                switch (i5) {
                    case 0:
                        KProperty[] kPropertyArr = PlanPartnersOffersScreen.W;
                        PlanPartnersOffersScreen planPartnersOffersScreen2 = this.f280773b;
                        return dli.f.a(planPartnersOffersScreen2, planPartnersOffersScreen2.d(), v.k(planPartnersOffersScreen2.O, planPartnersOffersScreen2.R, planPartnersOffersScreen2.Q, planPartnersOffersScreen2.P, new TextDelegate()), 0, null, null, null, 60);
                    case 1:
                        KProperty[] kPropertyArr2 = PlanPartnersOffersScreen.W;
                        qji.b bVarU2 = planPartnersOffersScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.pricing_plans.ui.impl.screens.partner_offers.kompot.offers.di.PlanPartnersOffersScreenInjector");
                        w0 w0Var = (w0) bVarU2;
                        i0 i0Var = w0Var.f246304b;
                        w0 w0Var2 = w0Var.f246305c;
                        PlanPartnersOffersScreenContract$InputData planPartnersOffersScreenContract$InputData = planPartnersOffersScreen.K;
                        planPartnersOffersScreenContract$InputData.getClass();
                        return new x0(i0Var, w0Var2, planPartnersOffersScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = PlanPartnersOffersScreen.W;
                        return (i) ((x0) planPartnersOffersScreen.U.getValue()).f246321c.get();
                }
            }
        });
        this.V = w.y0(new Function0(this) { // from class: ukk.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PlanPartnersOffersScreen f280773b;

            {
                this.f280773b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i5 = i;
                PlanPartnersOffersScreen planPartnersOffersScreen = this.f280773b;
                switch (i5) {
                    case 0:
                        KProperty[] kPropertyArr = PlanPartnersOffersScreen.W;
                        PlanPartnersOffersScreen planPartnersOffersScreen2 = this.f280773b;
                        return dli.f.a(planPartnersOffersScreen2, planPartnersOffersScreen2.d(), v.k(planPartnersOffersScreen2.O, planPartnersOffersScreen2.R, planPartnersOffersScreen2.Q, planPartnersOffersScreen2.P, new TextDelegate()), 0, null, null, null, 60);
                    case 1:
                        KProperty[] kPropertyArr2 = PlanPartnersOffersScreen.W;
                        qji.b bVarU2 = planPartnersOffersScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.pricing_plans.ui.impl.screens.partner_offers.kompot.offers.di.PlanPartnersOffersScreenInjector");
                        w0 w0Var = (w0) bVarU2;
                        i0 i0Var = w0Var.f246304b;
                        w0 w0Var2 = w0Var.f246305c;
                        PlanPartnersOffersScreenContract$InputData planPartnersOffersScreenContract$InputData = planPartnersOffersScreen.K;
                        planPartnersOffersScreenContract$InputData.getClass();
                        return new x0(i0Var, w0Var2, planPartnersOffersScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = PlanPartnersOffersScreen.W;
                        return (i) ((x0) planPartnersOffersScreen.U.getValue()).f246321c.get();
                }
            }
        });
    }

    @Override // com.revolut.kompot.navigable.a
    /* JADX INFO: renamed from: A2 */
    public final Integer getL() {
        return Integer.valueOf(this.M);
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        k uiState = (k) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        j jVar = uiState.f280779b;
        Clause clause = uiState.f280780c;
        if (jVar != null) {
            TextLocalisedClause textLocalisedClause = jVar.f280776a;
            navBarWithToolbar.setToolbarTitle(textLocalisedClause);
            Clause clause2 = jVar.f280777b;
            navBarWithToolbar.setTitle(textLocalisedClause, null);
            navBarWithToolbar.setSecondDescriptionText(clause2);
            navBarWithToolbar.setSecondDescriptionVisible(clause2 != null);
        } else {
            navBarWithToolbar.setSecondDescriptionVisible(false);
        }
        d3().f174564b.setText(clause);
        LargeActionButton goToButton = d3().f174564b;
        Intrinsics.checkNotNullExpressionValue(goToButton, "goToButton");
        goToButton.setVisibility(clause == null ? 8 : 0);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (x0) this.U.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        pd.b.p(view, new TextLocalisedClause(R$string.plan_subscriptions_title, null, null, 14));
        d3().f174565c.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174565c.f59410q), null, new c(this, continuation, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.N.e), null, new d(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.O.f52371h.f121375b), null, new ukk.e(this, null), 3);
        RowDelegate rowDelegate = this.P;
        r rVarFilter = rowDelegate.f53218h.mergeWith(rowDelegate.f53220l).filter(new uhl.b(new uj6.v(9), 18));
        Intrinsics.checkNotNullExpressionValue(rVarFilter, "filter(...)");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(rVarFilter), null, new ukk.f(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174564b.o), null, new c(this, continuation, 1), 3);
        ViewController.P2(this, rd0.e.b(this.Q.f52707c), new g(this, null), 3);
    }

    public final u d3() {
        ViewBinding value = this.T.getValue(this, W[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (u) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final i d() {
        return (i) this.V.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.S.getValue();
    }
}
