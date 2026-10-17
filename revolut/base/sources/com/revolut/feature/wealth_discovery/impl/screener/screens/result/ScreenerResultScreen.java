package com.revolut.feature.wealth_discovery.impl.screener.screens.result;

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
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit.views.navbar.TextNavBarMenuItem;
import com.revolut.feature.wealth_discovery.impl.screener.screens.result.ScreenerResultScreen;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.wealth.resources.R$string;
import jii.m;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import nfj.j2;
import nn7.d;
import nqh.b;
import nqh.e;
import nqh.h;
import nqh.i;
import te0.w;
import tki.c;
import tx0.r4;
import uqh.r;
import vc.s;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/wealth_discovery/impl/screener/screens/result/ScreenerResultScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lnqh/h;", "Ltki/c;", "Lnqh/i;", "feature_wealth_discovery_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ScreenerResultScreen extends ViewController<h> implements c {
    public static final /* synthetic */ KProperty[] X = {o0.f186429a.j(new h0(ScreenerResultScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final e K;
    public final ao.h L;
    public final ActionsDelegate M;
    public final FullScreenStateDelegate N;
    public final RowDelegate O;
    public final SmallActionButtonDelegate P;
    public final ListSubheaderDelegate Q;
    public final TextDelegate R;
    public final SwipeToActionDelegate S;
    public final Object T;
    public final int U;
    public final Object V;
    public final Object W;

    public ScreenerResultScreen(e inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = s.t(this, b.f);
        this.M = new ActionsDelegate();
        this.N = new FullScreenStateDelegate();
        RowDelegate rowDelegate = new RowDelegate(null, null, 7);
        this.O = rowDelegate;
        this.P = new SmallActionButtonDelegate();
        this.Q = new ListSubheaderDelegate();
        this.R = new TextDelegate();
        this.S = new SwipeToActionDelegate(rowDelegate, false);
        final int i = 0;
        this.T = w.y0(new Function0(this) { // from class: nqh.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ScreenerResultScreen f218451b;

            {
                this.f218451b = this;
            }

            /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                ScreenerResultScreen screenerResultScreen = this.f218451b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = ScreenerResultScreen.X;
                        return ((oqh.b) screenerResultScreen.W.getValue()).d();
                    case 1:
                        KProperty[] kPropertyArr2 = ScreenerResultScreen.X;
                        ScreenerResultScreen screenerResultScreen2 = this.f218451b;
                        return tki.g.a(screenerResultScreen2, (c) screenerResultScreen2.T.getValue(), v.k(screenerResultScreen2.N, screenerResultScreen2.O, screenerResultScreen2.P, new RowLoadingDelegate(), new ListSubheaderLoadingDelegate(), screenerResultScreen2.Q, screenerResultScreen2.R, screenerResultScreen2.M, screenerResultScreen2.S), R$id.recyclerView, null, new koi.h(null, false, true, 1), null, 40);
                    default:
                        KProperty[] kPropertyArr3 = ScreenerResultScreen.X;
                        qji.b bVarU2 = screenerResultScreen.U2();
                        oqh.c cVar = bVarU2 instanceof oqh.c ? (oqh.c) bVarU2 : null;
                        if (cVar == null) {
                            phm.a aVar = (phm.a) ue0.e.j(screenerResultScreen.m2()).a().get(vnh.b.class);
                            b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                            if (aVar2 == null) {
                                throw new IllegalStateException(a0.d.q("Api ", vnh.b.class, " is not found"));
                            }
                            cVar = (oqh.c) aVar2.b();
                        }
                        oqh.a aVarC = cVar.c();
                        e eVar = screenerResultScreen.K;
                        NavBarWithToolbar navBarWithToolbar = screenerResultScreen.d3().f174539b;
                        Intrinsics.checkNotNullExpressionValue(navBarWithToolbar, "navBarWithToolbar");
                        return aVarC.b(screenerResultScreen, eVar, new r(navBarWithToolbar, screenerResultScreen.Q, screenerResultScreen.O, screenerResultScreen.N, screenerResultScreen.P, screenerResultScreen.M, screenerResultScreen.R), new o5d.b(screenerResultScreen.S));
                }
            }
        });
        this.U = R$layout.screen_recycler_navbar;
        final int i2 = 1;
        this.V = w.y0(new Function0(this) { // from class: nqh.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ScreenerResultScreen f218451b;

            {
                this.f218451b = this;
            }

            /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                ScreenerResultScreen screenerResultScreen = this.f218451b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = ScreenerResultScreen.X;
                        return ((oqh.b) screenerResultScreen.W.getValue()).d();
                    case 1:
                        KProperty[] kPropertyArr2 = ScreenerResultScreen.X;
                        ScreenerResultScreen screenerResultScreen2 = this.f218451b;
                        return tki.g.a(screenerResultScreen2, (c) screenerResultScreen2.T.getValue(), v.k(screenerResultScreen2.N, screenerResultScreen2.O, screenerResultScreen2.P, new RowLoadingDelegate(), new ListSubheaderLoadingDelegate(), screenerResultScreen2.Q, screenerResultScreen2.R, screenerResultScreen2.M, screenerResultScreen2.S), R$id.recyclerView, null, new koi.h(null, false, true, 1), null, 40);
                    default:
                        KProperty[] kPropertyArr3 = ScreenerResultScreen.X;
                        qji.b bVarU2 = screenerResultScreen.U2();
                        oqh.c cVar = bVarU2 instanceof oqh.c ? (oqh.c) bVarU2 : null;
                        if (cVar == null) {
                            phm.a aVar = (phm.a) ue0.e.j(screenerResultScreen.m2()).a().get(vnh.b.class);
                            b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                            if (aVar2 == null) {
                                throw new IllegalStateException(a0.d.q("Api ", vnh.b.class, " is not found"));
                            }
                            cVar = (oqh.c) aVar2.b();
                        }
                        oqh.a aVarC = cVar.c();
                        e eVar = screenerResultScreen.K;
                        NavBarWithToolbar navBarWithToolbar = screenerResultScreen.d3().f174539b;
                        Intrinsics.checkNotNullExpressionValue(navBarWithToolbar, "navBarWithToolbar");
                        return aVarC.b(screenerResultScreen, eVar, new r(navBarWithToolbar, screenerResultScreen.Q, screenerResultScreen.O, screenerResultScreen.N, screenerResultScreen.P, screenerResultScreen.M, screenerResultScreen.R), new o5d.b(screenerResultScreen.S));
                }
            }
        });
        final int i3 = 2;
        this.W = w.y0(new Function0(this) { // from class: nqh.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ScreenerResultScreen f218451b;

            {
                this.f218451b = this;
            }

            /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                ScreenerResultScreen screenerResultScreen = this.f218451b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = ScreenerResultScreen.X;
                        return ((oqh.b) screenerResultScreen.W.getValue()).d();
                    case 1:
                        KProperty[] kPropertyArr2 = ScreenerResultScreen.X;
                        ScreenerResultScreen screenerResultScreen2 = this.f218451b;
                        return tki.g.a(screenerResultScreen2, (c) screenerResultScreen2.T.getValue(), v.k(screenerResultScreen2.N, screenerResultScreen2.O, screenerResultScreen2.P, new RowLoadingDelegate(), new ListSubheaderLoadingDelegate(), screenerResultScreen2.Q, screenerResultScreen2.R, screenerResultScreen2.M, screenerResultScreen2.S), R$id.recyclerView, null, new koi.h(null, false, true, 1), null, 40);
                    default:
                        KProperty[] kPropertyArr3 = ScreenerResultScreen.X;
                        qji.b bVarU2 = screenerResultScreen.U2();
                        oqh.c cVar = bVarU2 instanceof oqh.c ? (oqh.c) bVarU2 : null;
                        if (cVar == null) {
                            phm.a aVar = (phm.a) ue0.e.j(screenerResultScreen.m2()).a().get(vnh.b.class);
                            b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                            if (aVar2 == null) {
                                throw new IllegalStateException(a0.d.q("Api ", vnh.b.class, " is not found"));
                            }
                            cVar = (oqh.c) aVar2.b();
                        }
                        oqh.a aVarC = cVar.c();
                        e eVar = screenerResultScreen.K;
                        NavBarWithToolbar navBarWithToolbar = screenerResultScreen.d3().f174539b;
                        Intrinsics.checkNotNullExpressionValue(navBarWithToolbar, "navBarWithToolbar");
                        return aVarC.b(screenerResultScreen, eVar, new r(navBarWithToolbar, screenerResultScreen.Q, screenerResultScreen.O, screenerResultScreen.N, screenerResultScreen.P, screenerResultScreen.M, screenerResultScreen.R), new o5d.b(screenerResultScreen.S));
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        i uiState = (i) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        navBarWithToolbar.setFiltersState(uiState.f218461b);
        Clause clause = uiState.f218462c;
        navBarWithToolbar.setTitle(clause, null);
        navBarWithToolbar.setToolbarTitle(clause);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, com.revolut.kompot.navigable.a
    public final boolean F2() {
        if (!d3().f174539b.f59421x0) {
            ((a) ((nqh.c) this.T.getValue())).I2();
            return true;
        }
        e0m.e.a(D2());
        d3().f174539b.m0(j4.FROM_CLICKED_BUTTON);
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (oqh.b) this.W.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (nqh.c) this.T.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        d3().f174540c.setTag("ScreenerResultScreen");
        d3().f174539b.setTag("ScreenerResultScreen");
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        navBarWithToolbar.setSearchButtonActive(true);
        navBarWithToolbar.setHint(new TextLocalisedClause(R$string.screener_results_header_search_placeholder, null, null, 14));
        navBarWithToolbar.setMenuItems(u.c(new TextNavBarMenuItem("SAVE_ACTION_ID", new TextLocalisedClause(R$string.screener_action_save, null, null, 14), r4.TEXT, null, 8)));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(d3().f174539b.f59410q), new j2(this, null, 22), 3);
        ViewController.P2(this, rd0.e.b(d3().f174539b.o.f57403b), new d(this, null, 10), 3);
    }

    public final m d3() {
        ViewBinding value = this.L.getValue(this, X[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (m) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getU() {
        return this.U;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (tki.a) this.V.getValue();
    }
}
