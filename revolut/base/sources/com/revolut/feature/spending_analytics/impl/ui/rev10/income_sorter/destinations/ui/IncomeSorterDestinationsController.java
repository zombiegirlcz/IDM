package com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.destinations.ui;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderLoadingDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.destinations.ui.IncomeSorterDestinationsController;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import ppd.e0;
import te0.w;
import tki.c;
import vc.s;
import vpd.f;
import vpd.i;
import vpd.m;
import vpd.n;
import vpd.p;
import vpd.r;
import vpd.t;
import vpd.u;
import vpd.v;
import vpd.x;
import vpd.y;
import xki.e;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/spending_analytics/impl/ui/rev10/income_sorter/destinations/ui/IncomeSorterDestinationsController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lvpd/i;", "Ltki/c;", "Lvpd/p;", "feature_spending_analytics_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class IncomeSorterDestinationsController extends ViewController<i> implements c {
    public static final /* synthetic */ KProperty[] U = {o0.f186429a.j(new h0(IncomeSorterDestinationsController.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};
    public final int K;
    public final h L;
    public final Object M;
    public final Object N;
    public final FullScreenStateDelegate O;
    public final RowDelegate P;
    public final SelectableDelegate Q;
    public final ListSubheaderDelegate R;
    public final LargeActionButtonDelegate S;
    public final Object T;

    public IncomeSorterDestinationsController(IncomeSorterDestinationsContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = R$layout.screen_recycler_navbar_nextbutton;
        this.L = s.t(this, r.f);
        this.M = w.y0(new vd1.a(this, inputData, 25));
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: vpd.q

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ IncomeSorterDestinationsController f291185b;

            {
                this.f291185b = this;
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        KProperty[] kPropertyArr = IncomeSorterDestinationsController.U;
                        return (f) ((ppd.e0) this.f291185b.M.getValue()).f238400c.get();
                    default:
                        KProperty[] kPropertyArr2 = IncomeSorterDestinationsController.U;
                        IncomeSorterDestinationsController incomeSorterDestinationsController = this.f291185b;
                        return tki.g.a(incomeSorterDestinationsController, incomeSorterDestinationsController.d(), zhm.v.k(incomeSorterDestinationsController.O, new ListSubheaderLoadingDelegate(), new RowLoadingDelegate(), incomeSorterDestinationsController.P, incomeSorterDestinationsController.Q, incomeSorterDestinationsController.R, incomeSorterDestinationsController.S, new CellDetailsDelegate()), 0, null, null, null, 60);
                }
            }
        });
        this.O = new FullScreenStateDelegate();
        RowDelegate rowDelegate = new RowDelegate(null, null, 7);
        this.P = rowDelegate;
        this.Q = new SelectableDelegate(rowDelegate);
        this.R = new ListSubheaderDelegate();
        this.S = new LargeActionButtonDelegate();
        final int i2 = 1;
        this.T = w.y0(new Function0(this) { // from class: vpd.q

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ IncomeSorterDestinationsController f291185b;

            {
                this.f291185b = this;
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = IncomeSorterDestinationsController.U;
                        return (f) ((ppd.e0) this.f291185b.M.getValue()).f238400c.get();
                    default:
                        KProperty[] kPropertyArr2 = IncomeSorterDestinationsController.U;
                        IncomeSorterDestinationsController incomeSorterDestinationsController = this.f291185b;
                        return tki.g.a(incomeSorterDestinationsController, incomeSorterDestinationsController.d(), zhm.v.k(incomeSorterDestinationsController.O, new ListSubheaderLoadingDelegate(), new RowLoadingDelegate(), incomeSorterDestinationsController.P, incomeSorterDestinationsController.Q, incomeSorterDestinationsController.R, incomeSorterDestinationsController.S, new CellDetailsDelegate()), 0, null, null, null, 60);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        p uiState = (p) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        TextLocalisedClause textLocalisedClause = uiState.f291181b;
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setSecondDescriptionText(uiState.f291182c);
        LargeActionButton largeActionButton = d3().f174564b;
        vpd.o oVar2 = uiState.d;
        if (oVar2.equals(m.f291174a)) {
            largeActionButton.setVisibility(8);
        } else {
            if (!(oVar2 instanceof n)) {
                throw new NoWhenBranchMatchedException();
            }
            largeActionButton.setVisibility(0);
            n nVar = (n) oVar2;
            largeActionButton.setEnabled(nVar.f291176a);
            largeActionButton.setText(nVar.f291177b);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (e0) this.M.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        navBarWithToolbar.setSecondDescriptionVisible(true);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174565c.f59410q), null, new t(this, continuation, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, new v2e.h0(rd0.e.b(this.O.f52371h.f121375b), 14), null, new u(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.Q.r()), null, new v(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.P.f53218h), null, new vpd.w(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.S.d.f121375b), new x(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174564b.o), null, new t(this, continuation, 1), 3);
        ViewController.P2(this, rd0.e.b(this.R.d), new y(this, null), 3);
    }

    public final jii.u d3() {
        ViewBinding value = this.L.getValue(this, U[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.u) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final f d() {
        return (f) this.N.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (tki.a) this.T.getValue();
    }
}
