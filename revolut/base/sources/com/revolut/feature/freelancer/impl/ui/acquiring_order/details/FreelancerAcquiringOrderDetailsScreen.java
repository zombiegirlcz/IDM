package com.revolut.feature.freelancer.impl.ui.acquiring_order.details;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.delegates.ActionsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsNoteDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsStandaloneNoteDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.freelancer.impl.ui.acquiring_order.details.FreelancerAcquiringOrderDetailsScreen;
import com.revolut.feature.freelancer.impl.ui.acquiring_order.details.FreelancerAcquiringOrderDetailsScreenContract$InputData;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import fu6.b;
import fu6.g;
import fu6.j;
import fu6.k;
import fu6.l;
import fu6.m;
import fu6.n;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import nz8.d;
import te0.w;
import tki.c;
import tx0.j0;
import tx0.t3;
import us6.f;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/freelancer/impl/ui/acquiring_order/details/FreelancerAcquiringOrderDetailsScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ltki/c;", "Lfu6/o;", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class FreelancerAcquiringOrderDetailsScreen extends ViewController<q> implements c {
    public static final /* synthetic */ KProperty[] W = {o0.f186429a.j(new h0(FreelancerAcquiringOrderDetailsScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final FreelancerAcquiringOrderDetailsScreenContract$InputData K;
    public final int L;
    public final h M;
    public final ActionsDelegate N;
    public final CellDetailsDelegate O;
    public final CellDetailsNoteDelegate P;
    public final CellDetailsStandaloneNoteDelegate Q;
    public final FullScreenStateDelegate R;
    public final RowDelegate S;
    public final Object T;
    public final Object U;
    public final Object V;

    public FreelancerAcquiringOrderDetailsScreen(FreelancerAcquiringOrderDetailsScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbar;
        this.M = s.t(this, b.f);
        this.N = new ActionsDelegate();
        this.O = new CellDetailsDelegate();
        this.P = new CellDetailsNoteDelegate();
        this.Q = new CellDetailsStandaloneNoteDelegate();
        this.R = new FullScreenStateDelegate();
        this.S = new RowDelegate(null, null, 7);
        final int i = 0;
        this.T = w.y0(new Function0(this) { // from class: fu6.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FreelancerAcquiringOrderDetailsScreen f138085b;

            {
                this.f138085b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                FreelancerAcquiringOrderDetailsScreen freelancerAcquiringOrderDetailsScreen = this.f138085b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = FreelancerAcquiringOrderDetailsScreen.W;
                        qji.b bVarU2 = freelancerAcquiringOrderDetailsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.freelancer.impl.ui.acquiring_order.details.di.FreelancerAcquiringOrderDetailsScreenInjector");
                        us6.h hVar = (us6.h) bVarU2;
                        us6.q qVar = hVar.f282559b;
                        us6.h hVar2 = hVar.f282560c;
                        FreelancerAcquiringOrderDetailsScreenContract$InputData freelancerAcquiringOrderDetailsScreenContract$InputData = freelancerAcquiringOrderDetailsScreen.K;
                        freelancerAcquiringOrderDetailsScreenContract$InputData.getClass();
                        return new us6.f(qVar, hVar2, freelancerAcquiringOrderDetailsScreen, freelancerAcquiringOrderDetailsScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = FreelancerAcquiringOrderDetailsScreen.W;
                        return (j) ((us6.f) freelancerAcquiringOrderDetailsScreen.T.getValue()).d.get();
                    default:
                        KProperty[] kPropertyArr3 = FreelancerAcquiringOrderDetailsScreen.W;
                        FreelancerAcquiringOrderDetailsScreen freelancerAcquiringOrderDetailsScreen2 = this.f138085b;
                        return tki.g.a(freelancerAcquiringOrderDetailsScreen2, freelancerAcquiringOrderDetailsScreen2.R2(), v.k(freelancerAcquiringOrderDetailsScreen2.N, freelancerAcquiringOrderDetailsScreen2.O, freelancerAcquiringOrderDetailsScreen2.P, freelancerAcquiringOrderDetailsScreen2.Q, freelancerAcquiringOrderDetailsScreen2.R, new ListSubheaderDelegate(), freelancerAcquiringOrderDetailsScreen2.S, new RowLoadingDelegate()), 0, null, null, null, 60);
                }
            }
        });
        final int i2 = 1;
        this.U = w.y0(new Function0(this) { // from class: fu6.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FreelancerAcquiringOrderDetailsScreen f138085b;

            {
                this.f138085b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                FreelancerAcquiringOrderDetailsScreen freelancerAcquiringOrderDetailsScreen = this.f138085b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = FreelancerAcquiringOrderDetailsScreen.W;
                        qji.b bVarU2 = freelancerAcquiringOrderDetailsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.freelancer.impl.ui.acquiring_order.details.di.FreelancerAcquiringOrderDetailsScreenInjector");
                        us6.h hVar = (us6.h) bVarU2;
                        us6.q qVar = hVar.f282559b;
                        us6.h hVar2 = hVar.f282560c;
                        FreelancerAcquiringOrderDetailsScreenContract$InputData freelancerAcquiringOrderDetailsScreenContract$InputData = freelancerAcquiringOrderDetailsScreen.K;
                        freelancerAcquiringOrderDetailsScreenContract$InputData.getClass();
                        return new us6.f(qVar, hVar2, freelancerAcquiringOrderDetailsScreen, freelancerAcquiringOrderDetailsScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = FreelancerAcquiringOrderDetailsScreen.W;
                        return (j) ((us6.f) freelancerAcquiringOrderDetailsScreen.T.getValue()).d.get();
                    default:
                        KProperty[] kPropertyArr3 = FreelancerAcquiringOrderDetailsScreen.W;
                        FreelancerAcquiringOrderDetailsScreen freelancerAcquiringOrderDetailsScreen2 = this.f138085b;
                        return tki.g.a(freelancerAcquiringOrderDetailsScreen2, freelancerAcquiringOrderDetailsScreen2.R2(), v.k(freelancerAcquiringOrderDetailsScreen2.N, freelancerAcquiringOrderDetailsScreen2.O, freelancerAcquiringOrderDetailsScreen2.P, freelancerAcquiringOrderDetailsScreen2.Q, freelancerAcquiringOrderDetailsScreen2.R, new ListSubheaderDelegate(), freelancerAcquiringOrderDetailsScreen2.S, new RowLoadingDelegate()), 0, null, null, null, 60);
                }
            }
        });
        final int i3 = 2;
        this.V = w.y0(new Function0(this) { // from class: fu6.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FreelancerAcquiringOrderDetailsScreen f138085b;

            {
                this.f138085b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                FreelancerAcquiringOrderDetailsScreen freelancerAcquiringOrderDetailsScreen = this.f138085b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = FreelancerAcquiringOrderDetailsScreen.W;
                        qji.b bVarU2 = freelancerAcquiringOrderDetailsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.freelancer.impl.ui.acquiring_order.details.di.FreelancerAcquiringOrderDetailsScreenInjector");
                        us6.h hVar = (us6.h) bVarU2;
                        us6.q qVar = hVar.f282559b;
                        us6.h hVar2 = hVar.f282560c;
                        FreelancerAcquiringOrderDetailsScreenContract$InputData freelancerAcquiringOrderDetailsScreenContract$InputData = freelancerAcquiringOrderDetailsScreen.K;
                        freelancerAcquiringOrderDetailsScreenContract$InputData.getClass();
                        return new us6.f(qVar, hVar2, freelancerAcquiringOrderDetailsScreen, freelancerAcquiringOrderDetailsScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = FreelancerAcquiringOrderDetailsScreen.W;
                        return (j) ((us6.f) freelancerAcquiringOrderDetailsScreen.T.getValue()).d.get();
                    default:
                        KProperty[] kPropertyArr3 = FreelancerAcquiringOrderDetailsScreen.W;
                        FreelancerAcquiringOrderDetailsScreen freelancerAcquiringOrderDetailsScreen2 = this.f138085b;
                        return tki.g.a(freelancerAcquiringOrderDetailsScreen2, freelancerAcquiringOrderDetailsScreen2.R2(), v.k(freelancerAcquiringOrderDetailsScreen2.N, freelancerAcquiringOrderDetailsScreen2.O, freelancerAcquiringOrderDetailsScreen2.P, freelancerAcquiringOrderDetailsScreen2.Q, freelancerAcquiringOrderDetailsScreen2.R, new ListSubheaderDelegate(), freelancerAcquiringOrderDetailsScreen2.S, new RowLoadingDelegate()), 0, null, null, null, 60);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        fu6.o uiState = (fu6.o) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        if (!(uiState instanceof k)) {
            if (uiState instanceof l) {
                navBarWithToolbar.setDescriptionVisible(false);
                navBarWithToolbar.setSecondDescriptionVisible(false);
                navBarWithToolbar.l0();
                return;
            } else {
                if (!(uiState instanceof n)) {
                    throw new NoWhenBranchMatchedException();
                }
                navBarWithToolbar.setDescriptionVisible(false);
                navBarWithToolbar.setSecondDescriptionVisible(false);
                navBarWithToolbar.I0(t3.PROFILE, false);
                return;
            }
        }
        m mVar = ((k) uiState).f138091b;
        MoneyClause moneyClause = mVar.f138094a;
        TextClause textClause = mVar.f138095b;
        navBarWithToolbar.setTitle(moneyClause, null);
        navBarWithToolbar.setToolbarTitle(textClause);
        navBarWithToolbar.setDescriptionText(textClause);
        navBarWithToolbar.setSecondDescriptionText(mVar.f138096c);
        navBarWithToolbar.setEndImage(d.L(mVar.d));
        navBarWithToolbar.setEndIconBadge(mVar.e);
        navBarWithToolbar.setDescriptionVisible(true);
        navBarWithToolbar.setSecondDescriptionVisible(true);
        navBarWithToolbar.l0();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (f) this.T.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(this.N.f51611c.f121375b), new fu6.c(this, null), 3);
        ViewController.P2(this, rd0.e.b(d3().f174539b.f59410q), new ft.d(this, null, 4), 3);
        CellDetailsDelegate cellDetailsDelegate = this.O;
        ViewController.P2(this, h30.l.y(cellDetailsDelegate.f, cellDetailsDelegate.e, "merge(...)"), new fu6.d(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.Q.d), new fu6.e(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.R.f52371h.f121375b), new fu6.f(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.S.f53218h), new g(this, null), 3);
    }

    public final jii.m d3() {
        ViewBinding value = this.M.getValue(this, W[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.m) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final j R2() {
        return (j) this.U.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getQ() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (tki.a) this.V.getValue();
    }
}
