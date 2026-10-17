package com.revolut.feature.wealth.private_equity.impl.ui.fund_details.fund_highlights;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import c65.i;
import cbh.g;
import cgh.d;
import cgh.n;
import cgh.p;
import cli.o;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsLoadingDelegate;
import com.revolut.core.ui_kit.delegates.FooterTextDelegate;
import com.revolut.core.ui_kit.delegates.FooterTextLoadingDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateLoadingDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderLoadingDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextLoadingDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.wealth.private_equity.impl.ui.fund_details.fund_highlights.FundHighlightsScreen;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import d1h.j;
import efm.r;
import jii.m;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import pki.b;
import te0.w;
import ufh.c;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/wealth/private_equity/impl/ui/fund_details/fund_highlights/FundHighlightsScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lcgh/p;", "Ld1h/j;", "feature_wealth_private_equity_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class FundHighlightsScreen extends ViewController<q> implements dli.a, j {
    public static final /* synthetic */ KProperty[] V = {o0.f186429a.j(new h0(FundHighlightsScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final h K;
    public final Object L;
    public final int M;
    public final CellDetailsActionDelegate N;
    public final CellDetailsDelegate O;
    public final RowDelegate P;
    public final TextDelegate Q;
    public final FooterTextDelegate R;
    public final FullScreenStateDelegate S;
    public final Object T;
    public final Object U;

    public FundHighlightsScreen(n inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = s.t(this, d.f);
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: cgh.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FundHighlightsScreen f23969b;

            {
                this.f23969b = this;
            }

            /* JADX WARN: Type inference failed for: r1v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        KProperty[] kPropertyArr = FundHighlightsScreen.V;
                        return (o) ((ufh.c) this.f23969b.U.getValue()).f279833g.get();
                    default:
                        KProperty[] kPropertyArr2 = FundHighlightsScreen.V;
                        FundHighlightsScreen fundHighlightsScreen = this.f23969b;
                        return dli.f.a(fundHighlightsScreen, (o) fundHighlightsScreen.L.getValue(), v.k(new PlainTextDelegate(), new PlainTextLoadingDelegate(), fundHighlightsScreen.P, new RowLoadingDelegate(), fundHighlightsScreen.N, fundHighlightsScreen.O, new CellDetailsLoadingDelegate(), new ListSubheaderDelegate(), new ListSubheaderLoadingDelegate(), new FullScreenStateLoadingDelegate(), fundHighlightsScreen.S, fundHighlightsScreen.Q, fundHighlightsScreen.R, new FooterTextLoadingDelegate()), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        this.M = R$layout.screen_recycler_navbar;
        this.N = new CellDetailsActionDelegate();
        this.O = new CellDetailsDelegate();
        this.P = new RowDelegate(null, null, 7);
        this.Q = new TextDelegate();
        this.R = new FooterTextDelegate();
        this.S = new FullScreenStateDelegate();
        final int i2 = 1;
        this.T = w.y0(new Function0(this) { // from class: cgh.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FundHighlightsScreen f23969b;

            {
                this.f23969b = this;
            }

            /* JADX WARN: Type inference failed for: r1v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = FundHighlightsScreen.V;
                        return (o) ((ufh.c) this.f23969b.U.getValue()).f279833g.get();
                    default:
                        KProperty[] kPropertyArr2 = FundHighlightsScreen.V;
                        FundHighlightsScreen fundHighlightsScreen = this.f23969b;
                        return dli.f.a(fundHighlightsScreen, (o) fundHighlightsScreen.L.getValue(), v.k(new PlainTextDelegate(), new PlainTextLoadingDelegate(), fundHighlightsScreen.P, new RowLoadingDelegate(), fundHighlightsScreen.N, fundHighlightsScreen.O, new CellDetailsLoadingDelegate(), new ListSubheaderDelegate(), new ListSubheaderLoadingDelegate(), new FullScreenStateLoadingDelegate(), fundHighlightsScreen.S, fundHighlightsScreen.Q, fundHighlightsScreen.R, new FooterTextLoadingDelegate()), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        this.U = w.y0(new cf6.a(this, inputData, 4));
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        p uiState = (p) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        TextLocalisedClause textLocalisedClause = uiState.f23981a;
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
    }

    @Override // d1h.j
    /* JADX INFO: renamed from: H0, reason: from getter */
    public final FooterTextDelegate getV() {
        return this.R;
    }

    @Override // d1h.j
    /* JADX INFO: renamed from: Q, reason: from getter */
    public final FullScreenStateDelegate getW() {
        return this.S;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (c) this.U.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final b d() {
        return (cgh.o) this.L.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        d3().f174539b.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(d3().f174539b.f59410q), new i(this, null, 14), 3);
        r rVarMerge = r.merge(this.O.d, this.N.d, this.P.f53218h);
        Intrinsics.checkNotNullExpressionValue(rVarMerge, "merge(...)");
        ViewController.P2(this, new cbf.c(rd0.e.b(rVarMerge), 6), new g(this, null, 13), 3);
    }

    public final m d3() {
        ViewBinding value = this.K.getValue(this, V[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (m) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getX() {
        return this.M;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.T.getValue();
    }
}
