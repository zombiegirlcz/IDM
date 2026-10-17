package com.revolut.retail.feature.stockdetails.impl.ui.screens.insights;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import avk.j;
import b1h.f;
import cli.o;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.HeaderDelegate;
import com.revolut.core.ui_kit.delegates.HeaderLoadingDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.ReferralContactDelegate;
import com.revolut.core.ui_kit.delegates.ScrollerBoxDelegate;
import com.revolut.core.ui_kit.delegates.SmallRadialGaugeDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.IconNavBarMenuItem;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.stockdetails.impl.ui.screens.insights.InsightsScreen;
import com.revolut.retail.feature.stockdetails.impl.ui.screens.insights.InsightsScreenContract$InputData;
import com.revolut.retail.wealth.resources.R$string;
import com.youTransactor.uCube.rpc.Constants;
import dli.a;
import efm.r;
import h30.l;
import java.util.List;
import jii.k;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import n2h.b;
import n2h.c;
import n2h.d;
import n2h.g;
import org.jetbrains.annotations.NotNull;
import pvk.f0;
import pvk.i;
import pvk.m;
import pvk.n;
import pvk.q;
import te0.w;
import vc.s;
import xki.e;
import zhm.u;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u00052\u00020\u0006:\u0001\b¨\u0006\t"}, d2 = {"Lcom/revolut/retail/feature/stockdetails/impl/ui/screens/insights/InsightsScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lpvk/q;", "Ldli/a;", "Lpvk/f0;", "Ln2h/g;", "Lb1h/f;", "Companion", "a", "feature_stock_details_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class InsightsScreen extends ViewController<q> implements a, g, f {
    public final InsightsScreenContract$InputData K;
    public final Object L;
    public final Object M;
    public final h N;
    public final int O;
    public final ListSubheaderDelegate P;
    public final ReferralContactDelegate Q;
    public final ScrollerBoxDelegate R;
    public final FullScreenStateDelegate S;
    public final HeaderDelegate T;
    public final TextDelegate U;
    public final Object V;
    public final j W;
    public static final /* synthetic */ KProperty[] X = {o0.f186429a.j(new h0(InsightsScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarActionFooterBinding;", 0))};

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: com.revolut.retail.feature.stockdetails.impl.ui.screens.insights.InsightsScreen$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    public InsightsScreen(InsightsScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: pvk.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InsightsScreen f240278b;

            {
                this.f240278b = this;
            }

            /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        InsightsScreen.Companion companion = InsightsScreen.INSTANCE;
                        InsightsScreen insightsScreen = this.f240278b;
                        qji.b bVarR1 = insightsScreen.z2().R1();
                        Intrinsics.i(bVarR1, "null cannot be cast to non-null type com.revolut.retail.feature.stockdetails.impl.ui.screens.insights.di.InsightsScreenComponent.Injector");
                        prk.x xVar = (prk.x) bVarR1;
                        prk.g0 g0Var = xVar.f239310b;
                        prk.x xVar2 = xVar.f239311c;
                        InsightsScreenContract$InputData insightsScreenContract$InputData = insightsScreen.K;
                        n2h.e eVar = new n2h.e(insightsScreenContract$InputData.f104019a, insightsScreenContract$InputData.f104020b);
                        avk.j jVar = insightsScreen.W;
                        jVar.getClass();
                        return new prk.y(g0Var, xVar2, insightsScreenContract$InputData, insightsScreen, eVar, insightsScreen, jVar);
                    case 1:
                        InsightsScreen.Companion companion2 = InsightsScreen.INSTANCE;
                        return (o) ((prk.y) ((qvk.a) this.f240278b.L.getValue())).f239320n.get();
                    default:
                        InsightsScreen.Companion companion3 = InsightsScreen.INSTANCE;
                        InsightsScreen insightsScreen2 = this.f240278b;
                        return dli.f.a(insightsScreen2, insightsScreen2.R2(), zhm.v.k(insightsScreen2.T, insightsScreen2.P, insightsScreen2.R, insightsScreen2.U, new HeaderLoadingDelegate(), insightsScreen2.S, new SmallRadialGaugeDelegate()), R$id.screenRecyclerNavbarActionFooter_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.M = w.y0(new Function0(this) { // from class: pvk.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InsightsScreen f240278b;

            {
                this.f240278b = this;
            }

            /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        InsightsScreen.Companion companion = InsightsScreen.INSTANCE;
                        InsightsScreen insightsScreen = this.f240278b;
                        qji.b bVarR1 = insightsScreen.z2().R1();
                        Intrinsics.i(bVarR1, "null cannot be cast to non-null type com.revolut.retail.feature.stockdetails.impl.ui.screens.insights.di.InsightsScreenComponent.Injector");
                        prk.x xVar = (prk.x) bVarR1;
                        prk.g0 g0Var = xVar.f239310b;
                        prk.x xVar2 = xVar.f239311c;
                        InsightsScreenContract$InputData insightsScreenContract$InputData = insightsScreen.K;
                        n2h.e eVar = new n2h.e(insightsScreenContract$InputData.f104019a, insightsScreenContract$InputData.f104020b);
                        avk.j jVar = insightsScreen.W;
                        jVar.getClass();
                        return new prk.y(g0Var, xVar2, insightsScreenContract$InputData, insightsScreen, eVar, insightsScreen, jVar);
                    case 1:
                        InsightsScreen.Companion companion2 = InsightsScreen.INSTANCE;
                        return (o) ((prk.y) ((qvk.a) this.f240278b.L.getValue())).f239320n.get();
                    default:
                        InsightsScreen.Companion companion3 = InsightsScreen.INSTANCE;
                        InsightsScreen insightsScreen2 = this.f240278b;
                        return dli.f.a(insightsScreen2, insightsScreen2.R2(), zhm.v.k(insightsScreen2.T, insightsScreen2.P, insightsScreen2.R, insightsScreen2.U, new HeaderLoadingDelegate(), insightsScreen2.S, new SmallRadialGaugeDelegate()), R$id.screenRecyclerNavbarActionFooter_recyclerView, null, null, null, 56);
                }
            }
        });
        this.N = s.t(this, pvk.g.f);
        this.O = R$layout.screen_recycler_navbar_action_footer;
        this.P = new ListSubheaderDelegate();
        ReferralContactDelegate referralContactDelegate = new ReferralContactDelegate();
        this.Q = referralContactDelegate;
        this.R = new ScrollerBoxDelegate(u.c(referralContactDelegate));
        this.S = new FullScreenStateDelegate();
        this.T = new HeaderDelegate();
        this.U = new TextDelegate();
        final int i3 = 2;
        this.V = w.y0(new Function0(this) { // from class: pvk.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InsightsScreen f240278b;

            {
                this.f240278b = this;
            }

            /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        InsightsScreen.Companion companion = InsightsScreen.INSTANCE;
                        InsightsScreen insightsScreen = this.f240278b;
                        qji.b bVarR1 = insightsScreen.z2().R1();
                        Intrinsics.i(bVarR1, "null cannot be cast to non-null type com.revolut.retail.feature.stockdetails.impl.ui.screens.insights.di.InsightsScreenComponent.Injector");
                        prk.x xVar = (prk.x) bVarR1;
                        prk.g0 g0Var = xVar.f239310b;
                        prk.x xVar2 = xVar.f239311c;
                        InsightsScreenContract$InputData insightsScreenContract$InputData = insightsScreen.K;
                        n2h.e eVar = new n2h.e(insightsScreenContract$InputData.f104019a, insightsScreenContract$InputData.f104020b);
                        avk.j jVar = insightsScreen.W;
                        jVar.getClass();
                        return new prk.y(g0Var, xVar2, insightsScreenContract$InputData, insightsScreen, eVar, insightsScreen, jVar);
                    case 1:
                        InsightsScreen.Companion companion2 = InsightsScreen.INSTANCE;
                        return (o) ((prk.y) ((qvk.a) this.f240278b.L.getValue())).f239320n.get();
                    default:
                        InsightsScreen.Companion companion3 = InsightsScreen.INSTANCE;
                        InsightsScreen insightsScreen2 = this.f240278b;
                        return dli.f.a(insightsScreen2, insightsScreen2.R2(), zhm.v.k(insightsScreen2.T, insightsScreen2.P, insightsScreen2.R, insightsScreen2.U, new HeaderLoadingDelegate(), insightsScreen2.S, new SmallRadialGaugeDelegate()), R$id.screenRecyclerNavbarActionFooter_recyclerView, null, null, null, 56);
                }
            }
        });
        this.W = new j(this, 21);
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        f0 uiState = (f0) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        d dVar = uiState.f240280b;
        if (dVar instanceof b) {
            d3().f174533b.setModel(((b) dVar).f211541a);
            d3().f174533b.setVisibility(0);
        } else {
            if (!(dVar instanceof c)) {
                throw new NoWhenBranchMatchedException();
            }
            d3().f174533b.setVisibility(8);
        }
    }

    @Override // n2h.g
    public final r C0() {
        return r.never();
    }

    @Override // n2h.g
    public final r G0() {
        return r.never();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (qvk.a) this.L.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174534c;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.instrument_insights_title, null, null, 14);
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        navBarWithToolbar.setMenuItems(u.c(new IconNavBarMenuItem("history-menu-list-id", new ResourceImage(R$drawable.uikit_icn_24_history, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), new TextLocalisedClause(R$string.instrument_insights_bar_button_instrument_suggestion_history_accessability_label, null, null, 14), null, Constants.TAG_FULL_SVPP_IDENTIFICATION)));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, new i(rd0.e.b(d3().f174534c.o.f57403b), 0), null, new m(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174534c.f59410q), null, new m(this, null, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, new i(rd0.e.b(this.T.f52395j), 1), null, new n(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, new i(l.y(d3().f174533b.f, d3().f174533b.f58955g, "merge(...)"), 2), null, new n(this, null, 1), 3);
    }

    public final k d3() {
        ViewBinding value = this.N.getValue(this, X[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (k) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final pvk.o d() {
        return (pvk.o) this.M.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.O;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.V.getValue();
    }
}
