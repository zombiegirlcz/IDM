package com.revolut.feature.retail.cfd.impl.screens.cash_balance;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsLoadingDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.VaultsProgressDelegate;
import com.revolut.core.ui_kit.delegates.VaultsProgressLoadingDelegate;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.retail.cfd.impl.screens.cash_balance.CfdCashBalanceController;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import dli.c;
import g2e.t;
import h3b.b;
import h3b.f;
import h3b.n;
import h3b.p;
import jii.k;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import m2b.g;
import te0.w;
import tx0.t3;
import vc.s;
import wp5.y;
import xki.e;
import zhm.u;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/retail/cfd/impl/screens/cash_balance/CfdCashBalanceController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lh3b/q;", "feature_retail_cfd_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CfdCashBalanceController extends ViewController<q> implements a {
    public static final /* synthetic */ KProperty[] Y = {o0.f186429a.j(new h0(CfdCashBalanceController.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarActionFooterBinding;", 0))};
    public final int K;
    public final boolean L;
    public final h M;
    public final Object N;
    public final Object O;
    public final CellDetailsDelegate P;
    public final LargeActionButtonDelegate Q;
    public final ListSubheaderDelegate R;
    public final RowDelegate S;
    public final VaultsProgressDelegate T;
    public final VaultsProgressLoadingDelegate U;
    public final Object V;
    public final avk.h W;
    public final t X;

    public CfdCashBalanceController(CfdCashBalanceControllerContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = R$layout.screen_recycler_navbar_action_footer;
        this.L = true;
        this.M = s.t(this, b.f);
        this.N = w.y0(new h1k.a(this, inputData, 5));
        final int i = 0;
        this.O = w.y0(new Function0(this) { // from class: h3b.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CfdCashBalanceController f149076b;

            {
                this.f149076b = this;
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        KProperty[] kPropertyArr = CfdCashBalanceController.Y;
                        return (k) ((m2b.g) this.f149076b.N.getValue()).f201833s.get();
                    default:
                        KProperty[] kPropertyArr2 = CfdCashBalanceController.Y;
                        CfdCashBalanceController cfdCashBalanceController = this.f149076b;
                        return dli.f.a(cfdCashBalanceController, cfdCashBalanceController.R2(), zhm.v.k(cfdCashBalanceController.P, new CellDetailsLoadingDelegate(), new FullScreenStateDelegate(), cfdCashBalanceController.R, cfdCashBalanceController.S, new RowLoadingDelegate(), cfdCashBalanceController.T, cfdCashBalanceController.U), R$id.screenRecyclerNavbarActionFooter_recyclerView, null, null, null, 56);
                }
            }
        });
        this.P = new CellDetailsDelegate();
        this.Q = new LargeActionButtonDelegate();
        this.R = new ListSubheaderDelegate();
        this.S = new RowDelegate(null, null, 7);
        this.T = new VaultsProgressDelegate();
        this.U = new VaultsProgressLoadingDelegate();
        final int i2 = 1;
        this.V = w.y0(new Function0(this) { // from class: h3b.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CfdCashBalanceController f149076b;

            {
                this.f149076b = this;
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = CfdCashBalanceController.Y;
                        return (k) ((m2b.g) this.f149076b.N.getValue()).f201833s.get();
                    default:
                        KProperty[] kPropertyArr2 = CfdCashBalanceController.Y;
                        CfdCashBalanceController cfdCashBalanceController = this.f149076b;
                        return dli.f.a(cfdCashBalanceController, cfdCashBalanceController.R2(), zhm.v.k(cfdCashBalanceController.P, new CellDetailsLoadingDelegate(), new FullScreenStateDelegate(), cfdCashBalanceController.R, cfdCashBalanceController.S, new RowLoadingDelegate(), cfdCashBalanceController.T, cfdCashBalanceController.U), R$id.screenRecyclerNavbarActionFooter_recyclerView, null, null, null, 56);
                }
            }
        });
        this.W = new avk.h(this);
        this.X = new t(this);
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        h3b.q uiState = (h3b.q) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        NavBarWithToolbar navBarWithToolbar = d3().f174534c;
        p pVar = uiState.f149092a;
        if (pVar instanceof n) {
            navBarWithToolbar.l0();
            n nVar = (n) pVar;
            navBarWithToolbar.setTitle(nVar.f149088a, null);
            navBarWithToolbar.setDescriptionText(nVar.f149089b);
            navBarWithToolbar.setEndIconImage(nVar.f149090c);
        } else {
            if (!Intrinsics.f(pVar, h3b.o.f149091a)) {
                throw new NoWhenBranchMatchedException();
            }
            t3 t3Var = t3.DEFAULT;
            NavBarWithToolbar.Companion companion = NavBarWithToolbar.INSTANCE;
            navBarWithToolbar.I0(t3Var, false);
        }
        d3().f174533b.setModel(uiState.f149093b);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (g) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174534c;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        navBarWithToolbar.setDescriptionVisible(true);
        ((j60.a) ((g) this.N.getValue()).f201825h.get()).d(u.c(this.Q));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174534c.f59410q), null, new gqh.o(this, continuation, 14), 3);
        com.revolut.kompot.navigable.a.g2(this, new h23.b(y.x(d3().f174533b.f, d3().f174533b.f58955g, "mergeWith(...)"), 5), null, new f(this, continuation, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, new h23.b(rd0.e.b(this.P.d), 6), null, new f(this, continuation, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, new h23.b(rd0.e.b(this.Q.d.f121375b), 4), null, new h3b.g(this, null), 3);
    }

    public final k d3() {
        ViewBinding value = this.M.getValue(this, Y[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (k) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final h3b.k R2() {
        return (h3b.k) this.O.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (c) this.V.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.L);
    }
}
