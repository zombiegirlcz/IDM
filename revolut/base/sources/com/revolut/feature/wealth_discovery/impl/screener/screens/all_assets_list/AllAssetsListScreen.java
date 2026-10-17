package com.revolut.feature.wealth_discovery.impl.screener.screens.all_assets_list;

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
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.wealth_discovery.impl.screener.screens.all_assets_list.AllAssetsListScreen;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.wealth.resources.R$string;
import e0m.e;
import jii.u;
import jph.b;
import jph.g;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import tki.c;
import uqh.r;
import vc.s;
import zhm.v;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/wealth_discovery/impl/screener/screens/all_assets_list/AllAssetsListScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "", "Ltki/c;", "Ljph/h;", "feature_wealth_discovery_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AllAssetsListScreen extends ViewController<Object> implements c {
    public static final /* synthetic */ KProperty[] X = {o0.f186429a.j(new h0(AllAssetsListScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};
    public final g K;
    public final h L;
    public final FullScreenStateDelegate M;
    public final RowDelegate N;
    public final SmallActionButtonDelegate O;
    public final ListSubheaderDelegate P;
    public final TextDelegate Q;
    public final ActionsDelegate R;
    public final SwipeToActionDelegate S;
    public final Object T;
    public final int U;
    public final Object V;
    public final Object W;

    public AllAssetsListScreen(g inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = s.t(this, b.f);
        this.M = new FullScreenStateDelegate();
        RowDelegate rowDelegate = new RowDelegate(null, null, 7);
        this.N = rowDelegate;
        this.O = new SmallActionButtonDelegate();
        this.P = new ListSubheaderDelegate();
        this.Q = new TextDelegate();
        this.R = new ActionsDelegate();
        this.S = new SwipeToActionDelegate(rowDelegate, false);
        final int i = 0;
        this.T = w.y0(new Function0(this) { // from class: jph.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AllAssetsListScreen f177277b;

            {
                this.f177277b = this;
            }

            /* JADX WARN: Type inference failed for: r1v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                AllAssetsListScreen allAssetsListScreen = this.f177277b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = AllAssetsListScreen.X;
                        return (e) ((joh.e) ((kph.a) allAssetsListScreen.W.getValue())).f176990r.get();
                    case 1:
                        KProperty[] kPropertyArr2 = AllAssetsListScreen.X;
                        AllAssetsListScreen allAssetsListScreen2 = this.f177277b;
                        return tki.g.a(allAssetsListScreen2, (e) allAssetsListScreen2.T.getValue(), v.k(allAssetsListScreen2.M, allAssetsListScreen2.N, allAssetsListScreen2.O, new RowLoadingDelegate(), new ListSubheaderLoadingDelegate(), allAssetsListScreen2.P, allAssetsListScreen2.Q, allAssetsListScreen2.R, allAssetsListScreen2.S), R$id.recyclerView, null, new koi.h(null, false, true, 1), null, 40);
                    default:
                        KProperty[] kPropertyArr3 = AllAssetsListScreen.X;
                        phm.a aVar = (phm.a) ue0.e.j(allAssetsListScreen.m2()).a().get(vnh.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", vnh.b.class, " is not found"));
                        }
                        joh.w wVar = ((joh.w) aVar2.b()).k;
                        g gVar = allAssetsListScreen.K;
                        NavBarWithToolbar navBarWithToolbar = allAssetsListScreen.d3().f174565c;
                        Intrinsics.checkNotNullExpressionValue(navBarWithToolbar, "navBarWithToolbar");
                        r rVar = new r(navBarWithToolbar, allAssetsListScreen.P, allAssetsListScreen.N, allAssetsListScreen.M, allAssetsListScreen.O, allAssetsListScreen.R, allAssetsListScreen.Q);
                        o5d.b bVar = new o5d.b(allAssetsListScreen.S);
                        gVar.getClass();
                        return new joh.e(wVar, gVar, rVar, bVar);
                }
            }
        });
        this.U = R$layout.screen_recycler_navbar_nextbutton;
        final int i2 = 1;
        this.V = w.y0(new Function0(this) { // from class: jph.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AllAssetsListScreen f177277b;

            {
                this.f177277b = this;
            }

            /* JADX WARN: Type inference failed for: r1v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                AllAssetsListScreen allAssetsListScreen = this.f177277b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = AllAssetsListScreen.X;
                        return (e) ((joh.e) ((kph.a) allAssetsListScreen.W.getValue())).f176990r.get();
                    case 1:
                        KProperty[] kPropertyArr2 = AllAssetsListScreen.X;
                        AllAssetsListScreen allAssetsListScreen2 = this.f177277b;
                        return tki.g.a(allAssetsListScreen2, (e) allAssetsListScreen2.T.getValue(), v.k(allAssetsListScreen2.M, allAssetsListScreen2.N, allAssetsListScreen2.O, new RowLoadingDelegate(), new ListSubheaderLoadingDelegate(), allAssetsListScreen2.P, allAssetsListScreen2.Q, allAssetsListScreen2.R, allAssetsListScreen2.S), R$id.recyclerView, null, new koi.h(null, false, true, 1), null, 40);
                    default:
                        KProperty[] kPropertyArr3 = AllAssetsListScreen.X;
                        phm.a aVar = (phm.a) ue0.e.j(allAssetsListScreen.m2()).a().get(vnh.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", vnh.b.class, " is not found"));
                        }
                        joh.w wVar = ((joh.w) aVar2.b()).k;
                        g gVar = allAssetsListScreen.K;
                        NavBarWithToolbar navBarWithToolbar = allAssetsListScreen.d3().f174565c;
                        Intrinsics.checkNotNullExpressionValue(navBarWithToolbar, "navBarWithToolbar");
                        r rVar = new r(navBarWithToolbar, allAssetsListScreen.P, allAssetsListScreen.N, allAssetsListScreen.M, allAssetsListScreen.O, allAssetsListScreen.R, allAssetsListScreen.Q);
                        o5d.b bVar = new o5d.b(allAssetsListScreen.S);
                        gVar.getClass();
                        return new joh.e(wVar, gVar, rVar, bVar);
                }
            }
        });
        final int i3 = 2;
        this.W = w.y0(new Function0(this) { // from class: jph.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AllAssetsListScreen f177277b;

            {
                this.f177277b = this;
            }

            /* JADX WARN: Type inference failed for: r1v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                AllAssetsListScreen allAssetsListScreen = this.f177277b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = AllAssetsListScreen.X;
                        return (e) ((joh.e) ((kph.a) allAssetsListScreen.W.getValue())).f176990r.get();
                    case 1:
                        KProperty[] kPropertyArr2 = AllAssetsListScreen.X;
                        AllAssetsListScreen allAssetsListScreen2 = this.f177277b;
                        return tki.g.a(allAssetsListScreen2, (e) allAssetsListScreen2.T.getValue(), v.k(allAssetsListScreen2.M, allAssetsListScreen2.N, allAssetsListScreen2.O, new RowLoadingDelegate(), new ListSubheaderLoadingDelegate(), allAssetsListScreen2.P, allAssetsListScreen2.Q, allAssetsListScreen2.R, allAssetsListScreen2.S), R$id.recyclerView, null, new koi.h(null, false, true, 1), null, 40);
                    default:
                        KProperty[] kPropertyArr3 = AllAssetsListScreen.X;
                        phm.a aVar = (phm.a) ue0.e.j(allAssetsListScreen.m2()).a().get(vnh.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", vnh.b.class, " is not found"));
                        }
                        joh.w wVar = ((joh.w) aVar2.b()).k;
                        g gVar = allAssetsListScreen.K;
                        NavBarWithToolbar navBarWithToolbar = allAssetsListScreen.d3().f174565c;
                        Intrinsics.checkNotNullExpressionValue(navBarWithToolbar, "navBarWithToolbar");
                        r rVar = new r(navBarWithToolbar, allAssetsListScreen.P, allAssetsListScreen.N, allAssetsListScreen.M, allAssetsListScreen.O, allAssetsListScreen.R, allAssetsListScreen.Q);
                        o5d.b bVar = new o5d.b(allAssetsListScreen.S);
                        gVar.getClass();
                        return new joh.e(wVar, gVar, rVar, bVar);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        jph.h uiState = (jph.h) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(uiState.f177284b, null, null, 14);
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        Intrinsics.checkNotNullExpressionValue(navBarWithToolbar, "navBarWithToolbar");
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        d3().f174565c.setToolbarTitle(textLocalisedClause);
        LargeActionButton goToButton = d3().f174564b;
        Intrinsics.checkNotNullExpressionValue(goToButton, "goToButton");
        goToButton.setVisibility(uiState.f177285c ? 0 : 8);
    }

    @Override // com.revolut.kompot.navigable.a
    public final boolean J2() {
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
        return (kph.a) this.W.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (jph.e) this.T.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        d3().d.setTag("AllAssetsListScreen");
        d3().f174565c.setTag("AllAssetsListScreen");
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        navBarWithToolbar.setSearchButtonActive(true);
        navBarWithToolbar.setHint(new TextLocalisedClause(R$string.screener_results_header_search_placeholder, null, null, 14));
        d3().f174564b.setText(new TextLocalisedClause(R$string.screener_action_save, null, null, 14));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(d3().f174565c.f59410q), new jph.c(this, null, 0), 3);
        ViewController.P2(this, rd0.e.b(d3().f174564b.o), new jph.c(this, null, 1), 3);
    }

    public final u d3() {
        ViewBinding value = this.L.getValue(this, X[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (u) value;
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
