package com.revolut.feature.freelancer.impl.ui.acquiring_payment.details;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsNoteDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.ProgressStepVerticalDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.freelancer.impl.ui.acquiring_payment.details.FreelancerAcquiringPaymentDetailsScreen;
import com.revolut.feature.freelancer.impl.ui.acquiring_payment.details.FreelancerAcquiringPaymentDetailsScreenContract$InputData;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import efm.r;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
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
import uu6.b;
import uu6.f;
import uu6.g;
import uu6.i;
import uu6.j;
import uu6.k;
import uu6.l;
import uu6.m;
import uu6.n;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/freelancer/impl/ui/acquiring_payment/details/FreelancerAcquiringPaymentDetailsScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "", "Ltki/c;", "Luu6/n;", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class FreelancerAcquiringPaymentDetailsScreen extends ViewController<Object> implements c {
    public static final /* synthetic */ KProperty[] X = {o0.f186429a.j(new h0(FreelancerAcquiringPaymentDetailsScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final FreelancerAcquiringPaymentDetailsScreenContract$InputData K;
    public final int L;
    public final h M;
    public final CellDetailsChevronDelegate N;
    public final CellDetailsDelegate O;
    public final CellDetailsNoteDelegate P;
    public final FullScreenStateDelegate Q;
    public final ListSubheaderDelegate R;
    public final RowDelegate S;
    public final ProgressStepVerticalDelegate T;
    public final Object U;
    public final Object V;
    public final Object W;

    public FreelancerAcquiringPaymentDetailsScreen(FreelancerAcquiringPaymentDetailsScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbar;
        this.M = s.t(this, b.f);
        this.N = new CellDetailsChevronDelegate();
        this.O = new CellDetailsDelegate();
        this.P = new CellDetailsNoteDelegate();
        this.Q = new FullScreenStateDelegate();
        this.R = new ListSubheaderDelegate();
        this.S = new RowDelegate(null, null, 7);
        this.T = new ProgressStepVerticalDelegate();
        final int i = 0;
        this.U = w.y0(new Function0(this) { // from class: uu6.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FreelancerAcquiringPaymentDetailsScreen f283141b;

            {
                this.f283141b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                FreelancerAcquiringPaymentDetailsScreen freelancerAcquiringPaymentDetailsScreen = this.f283141b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = FreelancerAcquiringPaymentDetailsScreen.X;
                        qji.b bVarU2 = freelancerAcquiringPaymentDetailsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.freelancer.impl.ui.acquiring_payment.details.di.FreelancerAcquiringPaymentDetailsScreenInjector");
                        us6.m mVar = (us6.m) bVarU2;
                        us6.q qVar = mVar.f282623b;
                        us6.m mVar2 = mVar.f282624c;
                        FreelancerAcquiringPaymentDetailsScreenContract$InputData freelancerAcquiringPaymentDetailsScreenContract$InputData = freelancerAcquiringPaymentDetailsScreen.K;
                        freelancerAcquiringPaymentDetailsScreenContract$InputData.getClass();
                        return new us6.k(qVar, mVar2, freelancerAcquiringPaymentDetailsScreen, freelancerAcquiringPaymentDetailsScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = FreelancerAcquiringPaymentDetailsScreen.X;
                        return (i) ((us6.k) freelancerAcquiringPaymentDetailsScreen.U.getValue()).e.get();
                    default:
                        KProperty[] kPropertyArr3 = FreelancerAcquiringPaymentDetailsScreen.X;
                        FreelancerAcquiringPaymentDetailsScreen freelancerAcquiringPaymentDetailsScreen2 = this.f283141b;
                        return tki.g.a(freelancerAcquiringPaymentDetailsScreen2, freelancerAcquiringPaymentDetailsScreen2.d(), v.k(freelancerAcquiringPaymentDetailsScreen2.N, freelancerAcquiringPaymentDetailsScreen2.O, freelancerAcquiringPaymentDetailsScreen2.P, freelancerAcquiringPaymentDetailsScreen2.Q, freelancerAcquiringPaymentDetailsScreen2.R, freelancerAcquiringPaymentDetailsScreen2.S, new RowLoadingDelegate(), freelancerAcquiringPaymentDetailsScreen2.T), 0, null, null, null, 60);
                }
            }
        });
        final int i2 = 1;
        this.V = w.y0(new Function0(this) { // from class: uu6.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FreelancerAcquiringPaymentDetailsScreen f283141b;

            {
                this.f283141b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                FreelancerAcquiringPaymentDetailsScreen freelancerAcquiringPaymentDetailsScreen = this.f283141b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = FreelancerAcquiringPaymentDetailsScreen.X;
                        qji.b bVarU2 = freelancerAcquiringPaymentDetailsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.freelancer.impl.ui.acquiring_payment.details.di.FreelancerAcquiringPaymentDetailsScreenInjector");
                        us6.m mVar = (us6.m) bVarU2;
                        us6.q qVar = mVar.f282623b;
                        us6.m mVar2 = mVar.f282624c;
                        FreelancerAcquiringPaymentDetailsScreenContract$InputData freelancerAcquiringPaymentDetailsScreenContract$InputData = freelancerAcquiringPaymentDetailsScreen.K;
                        freelancerAcquiringPaymentDetailsScreenContract$InputData.getClass();
                        return new us6.k(qVar, mVar2, freelancerAcquiringPaymentDetailsScreen, freelancerAcquiringPaymentDetailsScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = FreelancerAcquiringPaymentDetailsScreen.X;
                        return (i) ((us6.k) freelancerAcquiringPaymentDetailsScreen.U.getValue()).e.get();
                    default:
                        KProperty[] kPropertyArr3 = FreelancerAcquiringPaymentDetailsScreen.X;
                        FreelancerAcquiringPaymentDetailsScreen freelancerAcquiringPaymentDetailsScreen2 = this.f283141b;
                        return tki.g.a(freelancerAcquiringPaymentDetailsScreen2, freelancerAcquiringPaymentDetailsScreen2.d(), v.k(freelancerAcquiringPaymentDetailsScreen2.N, freelancerAcquiringPaymentDetailsScreen2.O, freelancerAcquiringPaymentDetailsScreen2.P, freelancerAcquiringPaymentDetailsScreen2.Q, freelancerAcquiringPaymentDetailsScreen2.R, freelancerAcquiringPaymentDetailsScreen2.S, new RowLoadingDelegate(), freelancerAcquiringPaymentDetailsScreen2.T), 0, null, null, null, 60);
                }
            }
        });
        final int i3 = 2;
        this.W = w.y0(new Function0(this) { // from class: uu6.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FreelancerAcquiringPaymentDetailsScreen f283141b;

            {
                this.f283141b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                FreelancerAcquiringPaymentDetailsScreen freelancerAcquiringPaymentDetailsScreen = this.f283141b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = FreelancerAcquiringPaymentDetailsScreen.X;
                        qji.b bVarU2 = freelancerAcquiringPaymentDetailsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.freelancer.impl.ui.acquiring_payment.details.di.FreelancerAcquiringPaymentDetailsScreenInjector");
                        us6.m mVar = (us6.m) bVarU2;
                        us6.q qVar = mVar.f282623b;
                        us6.m mVar2 = mVar.f282624c;
                        FreelancerAcquiringPaymentDetailsScreenContract$InputData freelancerAcquiringPaymentDetailsScreenContract$InputData = freelancerAcquiringPaymentDetailsScreen.K;
                        freelancerAcquiringPaymentDetailsScreenContract$InputData.getClass();
                        return new us6.k(qVar, mVar2, freelancerAcquiringPaymentDetailsScreen, freelancerAcquiringPaymentDetailsScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = FreelancerAcquiringPaymentDetailsScreen.X;
                        return (i) ((us6.k) freelancerAcquiringPaymentDetailsScreen.U.getValue()).e.get();
                    default:
                        KProperty[] kPropertyArr3 = FreelancerAcquiringPaymentDetailsScreen.X;
                        FreelancerAcquiringPaymentDetailsScreen freelancerAcquiringPaymentDetailsScreen2 = this.f283141b;
                        return tki.g.a(freelancerAcquiringPaymentDetailsScreen2, freelancerAcquiringPaymentDetailsScreen2.d(), v.k(freelancerAcquiringPaymentDetailsScreen2.N, freelancerAcquiringPaymentDetailsScreen2.O, freelancerAcquiringPaymentDetailsScreen2.P, freelancerAcquiringPaymentDetailsScreen2.Q, freelancerAcquiringPaymentDetailsScreen2.R, freelancerAcquiringPaymentDetailsScreen2.S, new RowLoadingDelegate(), freelancerAcquiringPaymentDetailsScreen2.T), 0, null, null, null, 60);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        n uiState = (n) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        if (!(uiState instanceof j)) {
            if (uiState instanceof k) {
                navBarWithToolbar.setDescriptionVisible(false);
                navBarWithToolbar.setSecondDescriptionVisible(false);
                navBarWithToolbar.l0();
                return;
            } else {
                if (!(uiState instanceof m)) {
                    throw new NoWhenBranchMatchedException();
                }
                navBarWithToolbar.setDescriptionVisible(false);
                navBarWithToolbar.setSecondDescriptionVisible(false);
                navBarWithToolbar.I0(t3.PROFILE, false);
                return;
            }
        }
        l lVar = ((j) uiState).f283145b;
        MoneyClause moneyClause = lVar.f283148a;
        CompositeClause compositeClause = lVar.f283149b;
        navBarWithToolbar.setTitle(moneyClause, null);
        navBarWithToolbar.setToolbarTitle(compositeClause);
        navBarWithToolbar.setDescriptionText(compositeClause);
        navBarWithToolbar.setSecondDescriptionText(lVar.f283150c);
        navBarWithToolbar.setEndImage(d.L(lVar.d));
        navBarWithToolbar.setEndIconBadge(lVar.e);
        navBarWithToolbar.setDescriptionVisible(true);
        navBarWithToolbar.setSecondDescriptionVisible(true);
        navBarWithToolbar.l0();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (us6.k) this.U.getValue();
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
        Continuation continuation = null;
        ViewController.P2(this, rd0.e.b(d3().f174539b.f59410q), new uea.e(this, continuation, 22), 3);
        CellDetailsDelegate cellDetailsDelegate = this.O;
        ViewController.P2(this, h30.l.y(cellDetailsDelegate.d, cellDetailsDelegate.e, "merge(...)"), new uu6.c(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.P.f), new uu6.d(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.Q.f52371h.f121375b), new uu6.e(this, null), 3);
        ListSubheaderDelegate listSubheaderDelegate = this.R;
        r rVarMerge = r.merge(listSubheaderDelegate.f52707c, listSubheaderDelegate.f, listSubheaderDelegate.e);
        Intrinsics.checkNotNullExpressionValue(rVarMerge, "merge(...)");
        ViewController.P2(this, rd0.e.b(rVarMerge), new f(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.T.d), new up2.q(this, continuation, 6), 3);
        ViewController.P2(this, rd0.e.b(this.S.f53218h), new g(this, null), 3);
    }

    public final jii.m d3() {
        ViewBinding value = this.M.getValue(this, X[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.m) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final i d() {
        return (i) this.V.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (tki.a) this.W.getValue();
    }
}
