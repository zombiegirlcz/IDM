package com.revolut.feature.revolut_x_balances.impl.fiat;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.delegates.AppTipDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsLoadingDelegate;
import com.revolut.core.ui_kit.delegates.FixedTabsDelegate;
import com.revolut.core.ui_kit.delegates.FixedTabsLoadingDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.HeaderDelegate;
import com.revolut.core.ui_kit.delegates.HeaderLoadingDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.SwipeToActionDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.CurrencyClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.revolut_x_balances.api.fiat.navigation.RevolutXFiatBalancesDetailsController$InputData;
import com.revolut.feature.revolut_x_balances.impl.fiat.RevolutXFiatBalancesDetailsScreen;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import jii.m;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import nz8.d;
import pt5.r;
import te0.w;
import vc.s;
import xsf.c;
import y4c.e;
import y4c.f;
import y4c.g;
import z4c.b;
import zhm.v;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u00052\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/revolut_x_balances/impl/fiat/RevolutXFiatBalancesDetailsScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Ly4c/g;", "Lpt5/r;", "Lz4c/b;", "feature_retail_revolut_x_balances_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class RevolutXFiatBalancesDetailsScreen extends ViewController<q> implements dli.a, r, b {
    public static final /* synthetic */ KProperty[] V = {o0.f186429a.j(new h0(RevolutXFiatBalancesDetailsScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final h K;
    public final RowDelegate L;
    public final ListSubheaderDelegate M;
    public final Object N;
    public final AppTipDelegate O;
    public final Object P;
    public final CellDetailsDelegate Q;
    public final Object R;
    public final Object S;
    public final Object T;
    public final int U;

    public RevolutXFiatBalancesDetailsScreen(RevolutXFiatBalancesDetailsController$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = s.t(this, y4c.b.f);
        this.L = new RowDelegate(null, null, 7);
        this.M = new ListSubheaderDelegate();
        this.N = w.y0(new c(27));
        this.O = new AppTipDelegate();
        final int i = 0;
        this.P = w.y0(new Function0(this) { // from class: y4c.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RevolutXFiatBalancesDetailsScreen f310860b;

            {
                this.f310860b = this;
            }

            /* JADX WARN: Type inference failed for: r13v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r15v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                RevolutXFiatBalancesDetailsScreen revolutXFiatBalancesDetailsScreen = this.f310860b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = RevolutXFiatBalancesDetailsScreen.V;
                        return new SwipeToActionDelegate(revolutXFiatBalancesDetailsScreen.L, true);
                    case 1:
                        KProperty[] kPropertyArr2 = RevolutXFiatBalancesDetailsScreen.V;
                        return (f) ((x4c.c) revolutXFiatBalancesDetailsScreen.S.getValue()).f302860j.get();
                    default:
                        KProperty[] kPropertyArr3 = RevolutXFiatBalancesDetailsScreen.V;
                        RevolutXFiatBalancesDetailsScreen revolutXFiatBalancesDetailsScreen2 = this.f310860b;
                        return dli.f.a(revolutXFiatBalancesDetailsScreen2, (f) revolutXFiatBalancesDetailsScreen2.R.getValue(), v.k(revolutXFiatBalancesDetailsScreen2.Q, new CellDetailsLoadingDelegate(), new HeaderLoadingDelegate(), new HeaderDelegate(), new FullScreenStateDelegate(), revolutXFiatBalancesDetailsScreen2.L, new RowLoadingDelegate(), revolutXFiatBalancesDetailsScreen2.M, new FixedTabsLoadingDelegate(), (FixedTabsDelegate) revolutXFiatBalancesDetailsScreen2.N.getValue(), revolutXFiatBalancesDetailsScreen2.O, (SwipeToActionDelegate) revolutXFiatBalancesDetailsScreen2.P.getValue(), new TextDelegate()), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        this.Q = new CellDetailsDelegate();
        final int i2 = 1;
        this.R = w.y0(new Function0(this) { // from class: y4c.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RevolutXFiatBalancesDetailsScreen f310860b;

            {
                this.f310860b = this;
            }

            /* JADX WARN: Type inference failed for: r13v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r15v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                RevolutXFiatBalancesDetailsScreen revolutXFiatBalancesDetailsScreen = this.f310860b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = RevolutXFiatBalancesDetailsScreen.V;
                        return new SwipeToActionDelegate(revolutXFiatBalancesDetailsScreen.L, true);
                    case 1:
                        KProperty[] kPropertyArr2 = RevolutXFiatBalancesDetailsScreen.V;
                        return (f) ((x4c.c) revolutXFiatBalancesDetailsScreen.S.getValue()).f302860j.get();
                    default:
                        KProperty[] kPropertyArr3 = RevolutXFiatBalancesDetailsScreen.V;
                        RevolutXFiatBalancesDetailsScreen revolutXFiatBalancesDetailsScreen2 = this.f310860b;
                        return dli.f.a(revolutXFiatBalancesDetailsScreen2, (f) revolutXFiatBalancesDetailsScreen2.R.getValue(), v.k(revolutXFiatBalancesDetailsScreen2.Q, new CellDetailsLoadingDelegate(), new HeaderLoadingDelegate(), new HeaderDelegate(), new FullScreenStateDelegate(), revolutXFiatBalancesDetailsScreen2.L, new RowLoadingDelegate(), revolutXFiatBalancesDetailsScreen2.M, new FixedTabsLoadingDelegate(), (FixedTabsDelegate) revolutXFiatBalancesDetailsScreen2.N.getValue(), revolutXFiatBalancesDetailsScreen2.O, (SwipeToActionDelegate) revolutXFiatBalancesDetailsScreen2.P.getValue(), new TextDelegate()), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        this.S = w.y0(new y1a.a(this, inputData, 3));
        final int i3 = 2;
        this.T = w.y0(new Function0(this) { // from class: y4c.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RevolutXFiatBalancesDetailsScreen f310860b;

            {
                this.f310860b = this;
            }

            /* JADX WARN: Type inference failed for: r13v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r15v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                RevolutXFiatBalancesDetailsScreen revolutXFiatBalancesDetailsScreen = this.f310860b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = RevolutXFiatBalancesDetailsScreen.V;
                        return new SwipeToActionDelegate(revolutXFiatBalancesDetailsScreen.L, true);
                    case 1:
                        KProperty[] kPropertyArr2 = RevolutXFiatBalancesDetailsScreen.V;
                        return (f) ((x4c.c) revolutXFiatBalancesDetailsScreen.S.getValue()).f302860j.get();
                    default:
                        KProperty[] kPropertyArr3 = RevolutXFiatBalancesDetailsScreen.V;
                        RevolutXFiatBalancesDetailsScreen revolutXFiatBalancesDetailsScreen2 = this.f310860b;
                        return dli.f.a(revolutXFiatBalancesDetailsScreen2, (f) revolutXFiatBalancesDetailsScreen2.R.getValue(), v.k(revolutXFiatBalancesDetailsScreen2.Q, new CellDetailsLoadingDelegate(), new HeaderLoadingDelegate(), new HeaderDelegate(), new FullScreenStateDelegate(), revolutXFiatBalancesDetailsScreen2.L, new RowLoadingDelegate(), revolutXFiatBalancesDetailsScreen2.M, new FixedTabsLoadingDelegate(), (FixedTabsDelegate) revolutXFiatBalancesDetailsScreen2.N.getValue(), revolutXFiatBalancesDetailsScreen2.O, (SwipeToActionDelegate) revolutXFiatBalancesDetailsScreen2.P.getValue(), new TextDelegate()), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        this.U = R$layout.screen_recycler_navbar;
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        g uiState = (g) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        e eVar = uiState.f310868b;
        CurrencyClause currencyClause = eVar.f310864a;
        CurrencyClause currencyClause2 = eVar.f310865b;
        NavBarWithToolbar.setToolbar$default(navBarWithToolbar, currencyClause, currencyClause2, null, 4, null);
        navBarWithToolbar.setTitle(currencyClause, null);
        navBarWithToolbar.setDescriptionText(currencyClause2);
        navBarWithToolbar.setEndImage(d.L(eVar.f310866c));
        navBarWithToolbar.setTopActions(eVar.d);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (x4c.c) this.S.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (f) this.R.getValue();
    }

    @Override // pt5.r
    public final efm.r S() {
        efm.r rVarEmpty = efm.r.empty();
        Intrinsics.checkNotNullExpressionValue(rVarEmpty, "empty(...)");
        return rVarEmpty;
    }

    @Override // pt5.r
    public final efm.r T() {
        return this.L.f53218h;
    }

    @Override // pt5.r
    public final efm.r U() {
        return this.M.f52707c;
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ScreenContentRecyclerView recyclerView = d3().f174540c;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "recyclerView");
        Intrinsics.checkNotNullParameter(recyclerView, "<this>");
        yp0.w wVar = new yp0.w();
        wVar.setSupportsChangeAnimations(false);
        recyclerView.setItemAnimator(wVar);
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        navBarWithToolbar.setDescriptionVisible(true);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174539b.f59410q), null, new xni.h(this, null, 25), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.Q.d), null, new y4c.c(this, null), 3);
    }

    public final m d3() {
        ViewBinding value = this.K.getValue(this, V[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (m) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.U;
    }

    @Override // pt5.r
    public final efm.r h0() {
        efm.r rVarEmpty = efm.r.empty();
        Intrinsics.checkNotNullExpressionValue(rVarEmpty, "empty(...)");
        return rVarEmpty;
    }

    @Override // pt5.r
    public final efm.r i0() {
        efm.r rVarEmpty = efm.r.empty();
        Intrinsics.checkNotNullExpressionValue(rVarEmpty, "empty(...)");
        return rVarEmpty;
    }

    @Override // pt5.r
    public final efm.r j1() {
        efm.r rVarEmpty = efm.r.empty();
        Intrinsics.checkNotNullExpressionValue(rVarEmpty, "empty(...)");
        return rVarEmpty;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.T.getValue();
    }
}
