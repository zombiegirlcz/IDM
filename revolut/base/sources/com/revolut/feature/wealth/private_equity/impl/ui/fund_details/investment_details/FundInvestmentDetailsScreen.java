package com.revolut.feature.wealth.private_equity.impl.ui.fund_details.investment_details;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import aw0.i;
import cli.o;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsLoadingDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.views.buttons.ActionFooterView;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.wealth.private_equity.impl.ui.fund_details.investment_details.FundInvestmentDetailsScreen;
import com.revolut.feature.wealth.private_equity.impl.ui.fund_details.investment_details.FundInvestmentDetailsScreenContract$InputData;
import com.revolut.feature.wealth.private_equity.impl.ui.fund_details.investment_details.a;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import egh.f;
import egh.k;
import egh.l;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import tx0.j0;
import tx0.t3;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/wealth/private_equity/impl/ui/fund_details/investment_details/FundInvestmentDetailsScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ltki/c;", "Legh/l;", "feature_wealth_private_equity_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class FundInvestmentDetailsScreen extends ViewController<q> implements tki.c {
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(FundInvestmentDetailsScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarActionFooterBinding;", 0))};
    public final FundInvestmentDetailsScreenContract$InputData K;
    public final h L;
    public final int M;
    public final Object N;
    public final CellDetailsActionDelegate O;
    public final CellDetailsDelegate P;
    public final Object Q;
    public final Object R;

    public FundInvestmentDetailsScreen(FundInvestmentDetailsScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = s.t(this, egh.b.f);
        this.M = R$layout.screen_recycler_navbar_action_footer;
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: egh.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FundInvestmentDetailsScreen f125643b;

            {
                this.f125643b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                FundInvestmentDetailsScreen fundInvestmentDetailsScreen = this.f125643b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = FundInvestmentDetailsScreen.S;
                        return (k) ((ufh.d) ((fgh.a) fundInvestmentDetailsScreen.R.getValue())).d.get();
                    case 1:
                        KProperty[] kPropertyArr2 = FundInvestmentDetailsScreen.S;
                        FundInvestmentDetailsScreen fundInvestmentDetailsScreen2 = this.f125643b;
                        return tki.g.a(fundInvestmentDetailsScreen2, (k) fundInvestmentDetailsScreen2.N.getValue(), v.k(fundInvestmentDetailsScreen2.O, fundInvestmentDetailsScreen2.P, new CellDetailsLoadingDelegate(), new FullScreenStateDelegate()), R$id.screenRecyclerNavbarActionFooter_recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr3 = FundInvestmentDetailsScreen.S;
                        phm.a aVar = (phm.a) ue0.e.j(fundInvestmentDetailsScreen.m2()).a().get(ufh.i.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", ufh.i.class, " is not found"));
                        }
                        ufh.i iVar = ((ufh.i) aVar2.b()).f279862s;
                        FundInvestmentDetailsScreenContract$InputData fundInvestmentDetailsScreenContract$InputData = fundInvestmentDetailsScreen.K;
                        fundInvestmentDetailsScreenContract$InputData.getClass();
                        return new ufh.d(iVar, fundInvestmentDetailsScreenContract$InputData);
                }
            }
        });
        this.O = new CellDetailsActionDelegate();
        this.P = new CellDetailsDelegate();
        final int i2 = 1;
        this.Q = w.y0(new Function0(this) { // from class: egh.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FundInvestmentDetailsScreen f125643b;

            {
                this.f125643b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                FundInvestmentDetailsScreen fundInvestmentDetailsScreen = this.f125643b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = FundInvestmentDetailsScreen.S;
                        return (k) ((ufh.d) ((fgh.a) fundInvestmentDetailsScreen.R.getValue())).d.get();
                    case 1:
                        KProperty[] kPropertyArr2 = FundInvestmentDetailsScreen.S;
                        FundInvestmentDetailsScreen fundInvestmentDetailsScreen2 = this.f125643b;
                        return tki.g.a(fundInvestmentDetailsScreen2, (k) fundInvestmentDetailsScreen2.N.getValue(), v.k(fundInvestmentDetailsScreen2.O, fundInvestmentDetailsScreen2.P, new CellDetailsLoadingDelegate(), new FullScreenStateDelegate()), R$id.screenRecyclerNavbarActionFooter_recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr3 = FundInvestmentDetailsScreen.S;
                        phm.a aVar = (phm.a) ue0.e.j(fundInvestmentDetailsScreen.m2()).a().get(ufh.i.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", ufh.i.class, " is not found"));
                        }
                        ufh.i iVar = ((ufh.i) aVar2.b()).f279862s;
                        FundInvestmentDetailsScreenContract$InputData fundInvestmentDetailsScreenContract$InputData = fundInvestmentDetailsScreen.K;
                        fundInvestmentDetailsScreenContract$InputData.getClass();
                        return new ufh.d(iVar, fundInvestmentDetailsScreenContract$InputData);
                }
            }
        });
        final int i3 = 2;
        this.R = w.y0(new Function0(this) { // from class: egh.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FundInvestmentDetailsScreen f125643b;

            {
                this.f125643b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                FundInvestmentDetailsScreen fundInvestmentDetailsScreen = this.f125643b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = FundInvestmentDetailsScreen.S;
                        return (k) ((ufh.d) ((fgh.a) fundInvestmentDetailsScreen.R.getValue())).d.get();
                    case 1:
                        KProperty[] kPropertyArr2 = FundInvestmentDetailsScreen.S;
                        FundInvestmentDetailsScreen fundInvestmentDetailsScreen2 = this.f125643b;
                        return tki.g.a(fundInvestmentDetailsScreen2, (k) fundInvestmentDetailsScreen2.N.getValue(), v.k(fundInvestmentDetailsScreen2.O, fundInvestmentDetailsScreen2.P, new CellDetailsLoadingDelegate(), new FullScreenStateDelegate()), R$id.screenRecyclerNavbarActionFooter_recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr3 = FundInvestmentDetailsScreen.S;
                        phm.a aVar = (phm.a) ue0.e.j(fundInvestmentDetailsScreen.m2()).a().get(ufh.i.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", ufh.i.class, " is not found"));
                        }
                        ufh.i iVar = ((ufh.i) aVar2.b()).f279862s;
                        FundInvestmentDetailsScreenContract$InputData fundInvestmentDetailsScreenContract$InputData = fundInvestmentDetailsScreen.K;
                        fundInvestmentDetailsScreenContract$InputData.getClass();
                        return new ufh.d(iVar, fundInvestmentDetailsScreenContract$InputData);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        l uiState = (l) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        NavBarWithToolbar navBarWithToolbar = d3().f174534c;
        a aVar = uiState.f125654a;
        i iVar = uiState.f125655b;
        if (aVar != null) {
            if (aVar.equals(a.b.f95816a)) {
                t3 t3Var = t3.DEFAULT;
                NavBarWithToolbar.Companion companion = NavBarWithToolbar.INSTANCE;
                navBarWithToolbar.I0(t3Var, false);
            } else {
                if (!(aVar instanceof a.C0590a)) {
                    throw new NoWhenBranchMatchedException();
                }
                navBarWithToolbar.l0();
                a.C0590a c0590a = (a.C0590a) aVar;
                Clause clause = c0590a.f95814b;
                Clause clause2 = c0590a.f95813a;
                navBarWithToolbar.setTitleVisible(clause2 != null);
                if (clause2 != null) {
                    navBarWithToolbar.setTitle(clause2, null);
                    navBarWithToolbar.setToolbarTitle(clause2);
                }
                navBarWithToolbar.setDescriptionVisible(clause != null);
                if (clause != null) {
                    navBarWithToolbar.setDescriptionText(clause);
                }
                navBarWithToolbar.setEndImage(c0590a.f95815c);
            }
        }
        boolean z = iVar != null;
        ActionFooterView screenRecyclerNavbarActionFooterActionFooterView = d3().f174533b;
        Intrinsics.checkNotNullExpressionValue(screenRecyclerNavbarActionFooterActionFooterView, "screenRecyclerNavbarActionFooterActionFooterView");
        screenRecyclerNavbarActionFooterActionFooterView.setVisibility(z ? 0 : 8);
        if (z) {
            d3().f174533b.setModel(iVar);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (fgh.a) this.R.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (k) this.N.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174534c;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        navBarWithToolbar.setTitleAutoSize(false);
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(d3().f174534c.f59410q), new ec8.c(this, null, 6), 3);
        ViewController.P2(this, new dmj.k(h30.l.y(d3().f174533b.f, d3().f174533b.f58955g, "merge(...)"), 23), new f(this, null, 0), 3);
        ViewController.P2(this, new dmj.k(h30.l.y(this.O.d, this.P.d, "merge(...)"), 24), new f(this, null, 1), 3);
    }

    public final jii.k d3() {
        ViewBinding value = this.L.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.k) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getM() {
        return this.M;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (tki.a) this.Q.getValue();
    }
}
