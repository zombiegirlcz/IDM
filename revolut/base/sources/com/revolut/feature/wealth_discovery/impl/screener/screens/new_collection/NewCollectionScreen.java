package com.revolut.feature.wealth_discovery.impl.screener.screens.new_collection;

import android.view.View;
import androidx.viewbinding.ViewBinding;
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
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.wealth_discovery.impl.screener.screens.new_collection.NewCollectionScreen;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.wealth.resources.R$string;
import e0m.e;
import eqh.b;
import eqh.d;
import eqh.g;
import eqh.h;
import eqh.i;
import jii.u;
import joh.r;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import tki.c;
import vc.s;
import zhm.v;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/wealth_discovery/impl/screener/screens/new_collection/NewCollectionScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Leqh/h;", "Ltki/c;", "Leqh/i;", "feature_wealth_discovery_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class NewCollectionScreen extends ViewController<h> implements c {
    public static final /* synthetic */ KProperty[] X = {o0.f186429a.j(new h0(NewCollectionScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};
    public final g K;
    public final ao.h L;
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

    public NewCollectionScreen(g inputData) {
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
        this.T = w.y0(new Function0(this) { // from class: eqh.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ NewCollectionScreen f128459b;

            {
                this.f128459b = this;
            }

            /* JADX WARN: Type inference failed for: r1v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                NewCollectionScreen newCollectionScreen = this.f128459b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = NewCollectionScreen.X;
                        return (e) ((joh.f) ((fqh.a) newCollectionScreen.W.getValue())).f177002r.get();
                    case 1:
                        KProperty[] kPropertyArr2 = NewCollectionScreen.X;
                        NewCollectionScreen newCollectionScreen2 = this.f128459b;
                        return tki.g.a(newCollectionScreen2, (e) newCollectionScreen2.T.getValue(), v.k(newCollectionScreen2.M, newCollectionScreen2.N, newCollectionScreen2.O, new RowLoadingDelegate(), new ListSubheaderLoadingDelegate(), newCollectionScreen2.P, newCollectionScreen2.Q, newCollectionScreen2.R, newCollectionScreen2.S), R$id.recyclerView, null, new koi.h(null, false, true, 1), null, 40);
                    default:
                        KProperty[] kPropertyArr3 = NewCollectionScreen.X;
                        qji.b bVarU2 = newCollectionScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.wealth_discovery.impl.screener.screens.new_collection.di.NewCollectionControllerComponentInjector");
                        r rVar = (r) bVarU2;
                        joh.w wVar = rVar.f177053b;
                        r rVar2 = rVar.f177054c;
                        g gVar = newCollectionScreen.K;
                        NavBarWithToolbar navBarWithToolbar = newCollectionScreen.d3().f174565c;
                        Intrinsics.checkNotNullExpressionValue(navBarWithToolbar, "navBarWithToolbar");
                        uqh.r rVar3 = new uqh.r(navBarWithToolbar, newCollectionScreen.P, newCollectionScreen.N, newCollectionScreen.M, newCollectionScreen.O, newCollectionScreen.Q, newCollectionScreen.R);
                        o5d.b bVar = new o5d.b(newCollectionScreen.S);
                        gVar.getClass();
                        return new joh.f(wVar, rVar2, gVar, rVar3, bVar);
                }
            }
        });
        this.U = R$layout.screen_recycler_navbar_nextbutton;
        final int i2 = 1;
        this.V = w.y0(new Function0(this) { // from class: eqh.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ NewCollectionScreen f128459b;

            {
                this.f128459b = this;
            }

            /* JADX WARN: Type inference failed for: r1v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                NewCollectionScreen newCollectionScreen = this.f128459b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = NewCollectionScreen.X;
                        return (e) ((joh.f) ((fqh.a) newCollectionScreen.W.getValue())).f177002r.get();
                    case 1:
                        KProperty[] kPropertyArr2 = NewCollectionScreen.X;
                        NewCollectionScreen newCollectionScreen2 = this.f128459b;
                        return tki.g.a(newCollectionScreen2, (e) newCollectionScreen2.T.getValue(), v.k(newCollectionScreen2.M, newCollectionScreen2.N, newCollectionScreen2.O, new RowLoadingDelegate(), new ListSubheaderLoadingDelegate(), newCollectionScreen2.P, newCollectionScreen2.Q, newCollectionScreen2.R, newCollectionScreen2.S), R$id.recyclerView, null, new koi.h(null, false, true, 1), null, 40);
                    default:
                        KProperty[] kPropertyArr3 = NewCollectionScreen.X;
                        qji.b bVarU2 = newCollectionScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.wealth_discovery.impl.screener.screens.new_collection.di.NewCollectionControllerComponentInjector");
                        r rVar = (r) bVarU2;
                        joh.w wVar = rVar.f177053b;
                        r rVar2 = rVar.f177054c;
                        g gVar = newCollectionScreen.K;
                        NavBarWithToolbar navBarWithToolbar = newCollectionScreen.d3().f174565c;
                        Intrinsics.checkNotNullExpressionValue(navBarWithToolbar, "navBarWithToolbar");
                        uqh.r rVar3 = new uqh.r(navBarWithToolbar, newCollectionScreen.P, newCollectionScreen.N, newCollectionScreen.M, newCollectionScreen.O, newCollectionScreen.Q, newCollectionScreen.R);
                        o5d.b bVar = new o5d.b(newCollectionScreen.S);
                        gVar.getClass();
                        return new joh.f(wVar, rVar2, gVar, rVar3, bVar);
                }
            }
        });
        final int i3 = 2;
        this.W = w.y0(new Function0(this) { // from class: eqh.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ NewCollectionScreen f128459b;

            {
                this.f128459b = this;
            }

            /* JADX WARN: Type inference failed for: r1v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                NewCollectionScreen newCollectionScreen = this.f128459b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = NewCollectionScreen.X;
                        return (e) ((joh.f) ((fqh.a) newCollectionScreen.W.getValue())).f177002r.get();
                    case 1:
                        KProperty[] kPropertyArr2 = NewCollectionScreen.X;
                        NewCollectionScreen newCollectionScreen2 = this.f128459b;
                        return tki.g.a(newCollectionScreen2, (e) newCollectionScreen2.T.getValue(), v.k(newCollectionScreen2.M, newCollectionScreen2.N, newCollectionScreen2.O, new RowLoadingDelegate(), new ListSubheaderLoadingDelegate(), newCollectionScreen2.P, newCollectionScreen2.Q, newCollectionScreen2.R, newCollectionScreen2.S), R$id.recyclerView, null, new koi.h(null, false, true, 1), null, 40);
                    default:
                        KProperty[] kPropertyArr3 = NewCollectionScreen.X;
                        qji.b bVarU2 = newCollectionScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.wealth_discovery.impl.screener.screens.new_collection.di.NewCollectionControllerComponentInjector");
                        r rVar = (r) bVarU2;
                        joh.w wVar = rVar.f177053b;
                        r rVar2 = rVar.f177054c;
                        g gVar = newCollectionScreen.K;
                        NavBarWithToolbar navBarWithToolbar = newCollectionScreen.d3().f174565c;
                        Intrinsics.checkNotNullExpressionValue(navBarWithToolbar, "navBarWithToolbar");
                        uqh.r rVar3 = new uqh.r(navBarWithToolbar, newCollectionScreen.P, newCollectionScreen.N, newCollectionScreen.M, newCollectionScreen.O, newCollectionScreen.Q, newCollectionScreen.R);
                        o5d.b bVar = new o5d.b(newCollectionScreen.S);
                        gVar.getClass();
                        return new joh.f(wVar, rVar2, gVar, rVar3, bVar);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        i uiState = (i) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
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
        return (fqh.a) this.W.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (eqh.e) this.T.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.wealth_screener_new_screener_title, null, null, 14);
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setSearchButtonActive(true);
        navBarWithToolbar.setHint(new TextLocalisedClause(R$string.screener_results_header_search_placeholder, null, null, 14));
        d3().f174564b.setText(new TextLocalisedClause(R$string.screener_action_save, null, null, 14));
        LargeActionButton goToButton = d3().f174564b;
        Intrinsics.checkNotNullExpressionValue(goToButton, "goToButton");
        goToButton.setVisibility(0);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(d3().f174565c.f59410q), new eqh.c(this, null, 0), 3);
        ViewController.P2(this, rd0.e.b(d3().f174564b.o), new eqh.c(this, null, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174565c.f59409p.o), null, new d(view, null, 0), 3);
    }

    public final u d3() {
        ViewBinding value = this.L.getValue(this, X[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (u) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.U;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (tki.a) this.V.getValue();
    }
}
