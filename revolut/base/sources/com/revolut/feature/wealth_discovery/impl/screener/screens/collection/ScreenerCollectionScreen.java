package com.revolut.feature.wealth_discovery.impl.screener.screens.collection;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import au0.j4;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.ActionsDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderLoadingDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.SmallActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.SwipeToActionDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.feature.wealth_discovery.impl.screener.screens.collection.ScreenerCollectionScreen;
import com.revolut.feature.wealth_discovery.impl.screener.screens.collection.ScreenerCollectionScreenContract$InputData;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.wealth.resources.R$string;
import dli.c;
import e0m.e;
import jii.u;
import joh.x;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import t9l.f;
import te0.w;
import tna.p;
import tph.b;
import tph.d;
import tph.i;
import tph.k;
import tph.l;
import uqh.r;
import vc.s;
import zhm.v;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00052\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003:\u0001\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/wealth_discovery/impl/screener/screens/collection/ScreenerCollectionScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Ltph/i;", "Ldli/a;", "Ltph/l;", "Companion", "a", "feature_wealth_discovery_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ScreenerCollectionScreen extends ViewController<i> implements dli.a {
    public final ScreenerCollectionScreenContract$InputData K;
    public final h L;
    public final FullScreenStateDelegate M;
    public final RowDelegate N;
    public final SmallActionButtonDelegate O;
    public final ListSubheaderDelegate P;
    public final ActionsDelegate Q;
    public final TextDelegate R;
    public final SwipeToActionDelegate S;
    public final Object T;
    public final int U;
    public final Object V;
    public final Object W;
    public static final /* synthetic */ KProperty[] X = {o0.f186429a.j(new h0(ScreenerCollectionScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: com.revolut.feature.wealth_discovery.impl.screener.screens.collection.ScreenerCollectionScreen$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    public ScreenerCollectionScreen(ScreenerCollectionScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = s.t(this, b.f);
        this.M = new FullScreenStateDelegate();
        RowDelegate rowDelegate = new RowDelegate(null, null, 7);
        this.N = rowDelegate;
        this.O = new SmallActionButtonDelegate();
        this.P = new ListSubheaderDelegate();
        this.Q = new ActionsDelegate();
        this.R = new TextDelegate();
        this.S = new SwipeToActionDelegate(rowDelegate, false);
        final int i = 0;
        this.T = w.y0(new Function0(this) { // from class: tph.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ScreenerCollectionScreen f273376b;

            {
                this.f273376b = this;
            }

            /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                ScreenerCollectionScreen screenerCollectionScreen = this.f273376b;
                switch (i2) {
                    case 0:
                        ScreenerCollectionScreen.Companion companion = ScreenerCollectionScreen.INSTANCE;
                        return (e) ((joh.k) ((uph.a) screenerCollectionScreen.W.getValue())).f177023r.get();
                    case 1:
                        ScreenerCollectionScreen.Companion companion2 = ScreenerCollectionScreen.INSTANCE;
                        ScreenerCollectionScreen screenerCollectionScreen2 = this.f273376b;
                        return dli.f.a(screenerCollectionScreen2, screenerCollectionScreen2.d(), v.k(screenerCollectionScreen2.M, screenerCollectionScreen2.N, screenerCollectionScreen2.O, new RowLoadingDelegate(), new ListSubheaderLoadingDelegate(), screenerCollectionScreen2.P, screenerCollectionScreen2.Q, screenerCollectionScreen2.R, screenerCollectionScreen2.S), R$id.recyclerView, null, new koi.h(null, false, true, 1), null, 40);
                    default:
                        ScreenerCollectionScreen.Companion companion3 = ScreenerCollectionScreen.INSTANCE;
                        qji.b bVarU2 = screenerCollectionScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.wealth_discovery.impl.screener.screens.collection.di.ScreenerCollectionControllerComponentInjector");
                        x xVar = (x) bVarU2;
                        joh.w wVar = xVar.f177075b;
                        x xVar2 = xVar.f177076c;
                        ScreenerCollectionScreenContract$InputData screenerCollectionScreenContract$InputData = screenerCollectionScreen.K;
                        NavBarWithToolbar navBarWithToolbar = screenerCollectionScreen.d3().f174565c;
                        Intrinsics.checkNotNullExpressionValue(navBarWithToolbar, "navBarWithToolbar");
                        r rVar = new r(navBarWithToolbar, screenerCollectionScreen.P, screenerCollectionScreen.N, screenerCollectionScreen.M, screenerCollectionScreen.O, screenerCollectionScreen.Q, screenerCollectionScreen.R);
                        o5d.b bVar = new o5d.b(screenerCollectionScreen.S);
                        screenerCollectionScreenContract$InputData.getClass();
                        return new joh.k(wVar, xVar2, screenerCollectionScreenContract$InputData, rVar, bVar);
                }
            }
        });
        this.U = R$layout.screen_recycler_navbar_nextbutton;
        final int i2 = 1;
        this.V = w.y0(new Function0(this) { // from class: tph.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ScreenerCollectionScreen f273376b;

            {
                this.f273376b = this;
            }

            /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                ScreenerCollectionScreen screenerCollectionScreen = this.f273376b;
                switch (i22) {
                    case 0:
                        ScreenerCollectionScreen.Companion companion = ScreenerCollectionScreen.INSTANCE;
                        return (e) ((joh.k) ((uph.a) screenerCollectionScreen.W.getValue())).f177023r.get();
                    case 1:
                        ScreenerCollectionScreen.Companion companion2 = ScreenerCollectionScreen.INSTANCE;
                        ScreenerCollectionScreen screenerCollectionScreen2 = this.f273376b;
                        return dli.f.a(screenerCollectionScreen2, screenerCollectionScreen2.d(), v.k(screenerCollectionScreen2.M, screenerCollectionScreen2.N, screenerCollectionScreen2.O, new RowLoadingDelegate(), new ListSubheaderLoadingDelegate(), screenerCollectionScreen2.P, screenerCollectionScreen2.Q, screenerCollectionScreen2.R, screenerCollectionScreen2.S), R$id.recyclerView, null, new koi.h(null, false, true, 1), null, 40);
                    default:
                        ScreenerCollectionScreen.Companion companion3 = ScreenerCollectionScreen.INSTANCE;
                        qji.b bVarU2 = screenerCollectionScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.wealth_discovery.impl.screener.screens.collection.di.ScreenerCollectionControllerComponentInjector");
                        x xVar = (x) bVarU2;
                        joh.w wVar = xVar.f177075b;
                        x xVar2 = xVar.f177076c;
                        ScreenerCollectionScreenContract$InputData screenerCollectionScreenContract$InputData = screenerCollectionScreen.K;
                        NavBarWithToolbar navBarWithToolbar = screenerCollectionScreen.d3().f174565c;
                        Intrinsics.checkNotNullExpressionValue(navBarWithToolbar, "navBarWithToolbar");
                        r rVar = new r(navBarWithToolbar, screenerCollectionScreen.P, screenerCollectionScreen.N, screenerCollectionScreen.M, screenerCollectionScreen.O, screenerCollectionScreen.Q, screenerCollectionScreen.R);
                        o5d.b bVar = new o5d.b(screenerCollectionScreen.S);
                        screenerCollectionScreenContract$InputData.getClass();
                        return new joh.k(wVar, xVar2, screenerCollectionScreenContract$InputData, rVar, bVar);
                }
            }
        });
        final int i3 = 2;
        this.W = w.y0(new Function0(this) { // from class: tph.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ScreenerCollectionScreen f273376b;

            {
                this.f273376b = this;
            }

            /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                ScreenerCollectionScreen screenerCollectionScreen = this.f273376b;
                switch (i22) {
                    case 0:
                        ScreenerCollectionScreen.Companion companion = ScreenerCollectionScreen.INSTANCE;
                        return (e) ((joh.k) ((uph.a) screenerCollectionScreen.W.getValue())).f177023r.get();
                    case 1:
                        ScreenerCollectionScreen.Companion companion2 = ScreenerCollectionScreen.INSTANCE;
                        ScreenerCollectionScreen screenerCollectionScreen2 = this.f273376b;
                        return dli.f.a(screenerCollectionScreen2, screenerCollectionScreen2.d(), v.k(screenerCollectionScreen2.M, screenerCollectionScreen2.N, screenerCollectionScreen2.O, new RowLoadingDelegate(), new ListSubheaderLoadingDelegate(), screenerCollectionScreen2.P, screenerCollectionScreen2.Q, screenerCollectionScreen2.R, screenerCollectionScreen2.S), R$id.recyclerView, null, new koi.h(null, false, true, 1), null, 40);
                    default:
                        ScreenerCollectionScreen.Companion companion3 = ScreenerCollectionScreen.INSTANCE;
                        qji.b bVarU2 = screenerCollectionScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.wealth_discovery.impl.screener.screens.collection.di.ScreenerCollectionControllerComponentInjector");
                        x xVar = (x) bVarU2;
                        joh.w wVar = xVar.f177075b;
                        x xVar2 = xVar.f177076c;
                        ScreenerCollectionScreenContract$InputData screenerCollectionScreenContract$InputData = screenerCollectionScreen.K;
                        NavBarWithToolbar navBarWithToolbar = screenerCollectionScreen.d3().f174565c;
                        Intrinsics.checkNotNullExpressionValue(navBarWithToolbar, "navBarWithToolbar");
                        r rVar = new r(navBarWithToolbar, screenerCollectionScreen.P, screenerCollectionScreen.N, screenerCollectionScreen.M, screenerCollectionScreen.O, screenerCollectionScreen.Q, screenerCollectionScreen.R);
                        o5d.b bVar = new o5d.b(screenerCollectionScreen.S);
                        screenerCollectionScreenContract$InputData.getClass();
                        return new joh.k(wVar, xVar2, screenerCollectionScreenContract$InputData, rVar, bVar);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        l uiState = (l) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        k kVar = uiState.f273388b;
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        Intrinsics.checkNotNullExpressionValue(navBarWithToolbar, "navBarWithToolbar");
        Clause clause = kVar.f273384a;
        Clause clause2 = kVar.f273385b;
        yy0.l lVarA = null;
        navBarWithToolbar.setTitle(clause, null);
        if (clause != null) {
            d3().f174565c.setToolbarTitle(clause);
        }
        d3().f174565c.setLoadingVisible(kVar.f273386c);
        d3().f174565c.setSecondDescriptionText(clause2);
        d3().f174565c.setSecondDescriptionVisible(clause2 != null);
        NavBarWithToolbar navBarWithToolbar2 = d3().f174565c;
        Image image = kVar.d;
        if (image != null) {
            yy0.l.Companion.getClass();
            lVarA = yy0.i.a(image);
        }
        navBarWithToolbar2.setEndImage(lVarA);
        d3().f174565c.setMenuItems(uiState.f273389c);
        LargeActionButton goToButton = d3().f174564b;
        Intrinsics.checkNotNullExpressionValue(goToButton, "goToButton");
        goToButton.setVisibility(uiState.d.f273383a ? 0 : 8);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController, com.revolut.kompot.navigable.a
    public final boolean F2() {
        if (!d3().f174565c.f59421x0) {
            return false;
        }
        e.a(D2());
        d3().f174565c.m0(j4.FROM_CLICKED_BUTTON);
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (uph.a) this.W.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        navBarWithToolbar.setSearchButtonActive(true);
        navBarWithToolbar.setHint(new TextLocalisedClause(R$string.screener_results_header_search_placeholder, null, null, 14));
        d3().f174564b.setText(new TextLocalisedClause(R$string.screener_edit_screen_update, null, null, 14));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(d3().f174565c.f59410q), new d(this, null, 0), 3);
        ViewController.P2(this, rd0.e.b(d3().f174565c.x0()), new p(this, null, 3), 3);
        ViewController.P2(this, new f(rd0.e.b(d3().f174565c.o.f57403b), 18), new d(this, null, 1), 3);
        ViewController.P2(this, rd0.e.b(d3().f174564b.o), new d(this, null, 2), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174565c.f59409p.o), null, new eqh.d(view, null, 1), 3);
    }

    public final u d3() {
        ViewBinding value = this.L.getValue(this, X[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (u) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final tph.e d() {
        return (tph.e) this.T.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getW() {
        return this.U;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (c) this.V.getValue();
    }
}
