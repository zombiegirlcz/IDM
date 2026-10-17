package com.revolut.feature.freelancer.impl.ui.tax_hub.payment.assessment;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.freelancer.impl.ui.tax_hub.payment.assessment.TaxHubPaymentAssessmentScreen;
import com.revolut.feature.freelancer.impl.ui.tax_hub.payment.assessment.TaxHubPaymentAssessmentScreenContract$InputData;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import k37.d;
import k37.k;
import k37.l;
import k37.m;
import k37.n;
import k37.p;
import k37.r;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import tki.c;
import tx0.j0;
import tx0.t3;
import vc.s;
import xki.e;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/freelancer/impl/ui/tax_hub/payment/assessment/TaxHubPaymentAssessmentScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lk37/k;", "Ltki/c;", "Lk37/r;", "Lno/k;", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TaxHubPaymentAssessmentScreen extends ViewController<k> implements c, no.k {
    public static final /* synthetic */ KProperty[] T = {o0.f186429a.j(new h0(TaxHubPaymentAssessmentScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarFooterNextbuttonBinding;", 0))};
    public final TaxHubPaymentAssessmentScreenContract$InputData K;
    public final int L;
    public final h M;
    public final FullScreenStateDelegate N;
    public final RowDelegate O;
    public AnalyticsContext P;
    public final Object Q;
    public final Object R;
    public final Object S;

    public TaxHubPaymentAssessmentScreen(TaxHubPaymentAssessmentScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbar_footer_nextbutton;
        this.M = s.t(this, k37.b.f);
        this.N = new FullScreenStateDelegate();
        this.O = new RowDelegate(null, null, 7);
        final int i = 0;
        this.Q = w.y0(new Function0(this) { // from class: k37.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TaxHubPaymentAssessmentScreen f180623b;

            {
                this.f180623b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                TaxHubPaymentAssessmentScreen taxHubPaymentAssessmentScreen = this.f180623b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = TaxHubPaymentAssessmentScreen.T;
                        qji.b bVarU2 = taxHubPaymentAssessmentScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.freelancer.impl.ui.tax_hub.payment.assessment.di.TaxHubPaymentAssessmentScreenInjector");
                        bt6.n nVar = (bt6.n) bVarU2;
                        bt6.b bVar = nVar.f18367b;
                        bt6.n nVar2 = nVar.f18368c;
                        TaxHubPaymentAssessmentScreenContract$InputData taxHubPaymentAssessmentScreenContract$InputData = taxHubPaymentAssessmentScreen.K;
                        taxHubPaymentAssessmentScreenContract$InputData.getClass();
                        return new bt6.m(bVar, nVar2, taxHubPaymentAssessmentScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = TaxHubPaymentAssessmentScreen.T;
                        return (l) ((bt6.m) taxHubPaymentAssessmentScreen.Q.getValue()).f18365c.get();
                    default:
                        KProperty[] kPropertyArr3 = TaxHubPaymentAssessmentScreen.T;
                        TaxHubPaymentAssessmentScreen taxHubPaymentAssessmentScreen2 = this.f180623b;
                        return tki.g.a(taxHubPaymentAssessmentScreen2, taxHubPaymentAssessmentScreen2.d(), zhm.v.k(taxHubPaymentAssessmentScreen2.N, new ListSubheaderDelegate(), taxHubPaymentAssessmentScreen2.O, new RowLoadingDelegate()), R$id.screenRecyclerNavbarFooterNextbutton_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.R = w.y0(new Function0(this) { // from class: k37.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TaxHubPaymentAssessmentScreen f180623b;

            {
                this.f180623b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                TaxHubPaymentAssessmentScreen taxHubPaymentAssessmentScreen = this.f180623b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = TaxHubPaymentAssessmentScreen.T;
                        qji.b bVarU2 = taxHubPaymentAssessmentScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.freelancer.impl.ui.tax_hub.payment.assessment.di.TaxHubPaymentAssessmentScreenInjector");
                        bt6.n nVar = (bt6.n) bVarU2;
                        bt6.b bVar = nVar.f18367b;
                        bt6.n nVar2 = nVar.f18368c;
                        TaxHubPaymentAssessmentScreenContract$InputData taxHubPaymentAssessmentScreenContract$InputData = taxHubPaymentAssessmentScreen.K;
                        taxHubPaymentAssessmentScreenContract$InputData.getClass();
                        return new bt6.m(bVar, nVar2, taxHubPaymentAssessmentScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = TaxHubPaymentAssessmentScreen.T;
                        return (l) ((bt6.m) taxHubPaymentAssessmentScreen.Q.getValue()).f18365c.get();
                    default:
                        KProperty[] kPropertyArr3 = TaxHubPaymentAssessmentScreen.T;
                        TaxHubPaymentAssessmentScreen taxHubPaymentAssessmentScreen2 = this.f180623b;
                        return tki.g.a(taxHubPaymentAssessmentScreen2, taxHubPaymentAssessmentScreen2.d(), zhm.v.k(taxHubPaymentAssessmentScreen2.N, new ListSubheaderDelegate(), taxHubPaymentAssessmentScreen2.O, new RowLoadingDelegate()), R$id.screenRecyclerNavbarFooterNextbutton_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i3 = 2;
        this.S = w.y0(new Function0(this) { // from class: k37.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TaxHubPaymentAssessmentScreen f180623b;

            {
                this.f180623b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                TaxHubPaymentAssessmentScreen taxHubPaymentAssessmentScreen = this.f180623b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = TaxHubPaymentAssessmentScreen.T;
                        qji.b bVarU2 = taxHubPaymentAssessmentScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.freelancer.impl.ui.tax_hub.payment.assessment.di.TaxHubPaymentAssessmentScreenInjector");
                        bt6.n nVar = (bt6.n) bVarU2;
                        bt6.b bVar = nVar.f18367b;
                        bt6.n nVar2 = nVar.f18368c;
                        TaxHubPaymentAssessmentScreenContract$InputData taxHubPaymentAssessmentScreenContract$InputData = taxHubPaymentAssessmentScreen.K;
                        taxHubPaymentAssessmentScreenContract$InputData.getClass();
                        return new bt6.m(bVar, nVar2, taxHubPaymentAssessmentScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = TaxHubPaymentAssessmentScreen.T;
                        return (l) ((bt6.m) taxHubPaymentAssessmentScreen.Q.getValue()).f18365c.get();
                    default:
                        KProperty[] kPropertyArr3 = TaxHubPaymentAssessmentScreen.T;
                        TaxHubPaymentAssessmentScreen taxHubPaymentAssessmentScreen2 = this.f180623b;
                        return tki.g.a(taxHubPaymentAssessmentScreen2, taxHubPaymentAssessmentScreen2.d(), zhm.v.k(taxHubPaymentAssessmentScreen2.N, new ListSubheaderDelegate(), taxHubPaymentAssessmentScreen2.O, new RowLoadingDelegate()), R$id.screenRecyclerNavbarFooterNextbutton_recyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        r uiState = (r) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        NavBarWithToolbar navBarWithToolbar = d3().e;
        k37.q qVar2 = uiState.f180641a;
        m mVar = uiState.f180642b;
        if (qVar2 instanceof n) {
            navBarWithToolbar.l0();
            n nVar = (n) qVar2;
            TextLocalisedClause textLocalisedClause = nVar.f180637a;
            navBarWithToolbar.setTitle(textLocalisedClause, null);
            navBarWithToolbar.setToolbarTitle(textLocalisedClause);
            navBarWithToolbar.setSecondDescriptionText(nVar.f180638b);
            navBarWithToolbar.setSecondDescriptionVisible(true);
        } else if (Intrinsics.f(qVar2, k37.o.f180639a)) {
            navBarWithToolbar.l0();
        } else {
            if (!Intrinsics.f(qVar2, p.f180640a)) {
                throw new NoWhenBranchMatchedException();
            }
            t3 t3Var = t3.TWO_LINES;
            NavBarWithToolbar.Companion companion = NavBarWithToolbar.INSTANCE;
            navBarWithToolbar.I0(t3Var, false);
        }
        d3().f174558c.setTextClause(mVar.f180636c);
        LargeActionButton largeActionButton = d3().f174557b;
        largeActionButton.setText(mVar.f180634a);
        largeActionButton.setEnabled(mVar.f180635b);
        largeActionButton.setAnalyticsContext(this.P);
    }

    @Override // no.k
    public final void K1(AnalyticsContext analyticsContext) {
        this.P = analyticsContext;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (bt6.m) this.Q.getValue();
    }

    @Override // no.k
    /* JADX INFO: renamed from: R, reason: from getter */
    public final AnalyticsContext getP() {
        return this.P;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ((bt6.m) this.Q.getValue()).getClass();
        this.P = new AnalyticsContext(x47.a.a(this.K.f74301a));
        d3().e.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        d3().e.setHeaderTitleMode(j0.MULTILINE_LARGE);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        ViewController.P2(this, rd0.e.b(d3().e.f59410q), new k37.c(this, continuation, 0), 3);
        ViewController.P2(this, rd0.e.b(d3().f174558c.f58608l), new d(this, null, 0), 3);
        ViewController.P2(this, rd0.e.b(d3().f174557b.o), new k37.c(this, continuation, 1), 3);
        ViewController.P2(this, rd0.e.b(this.N.f52371h.f121375b), new k37.e(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.O.f53226s), new d(this, null, 1), 3);
    }

    public final jii.s d3() {
        ViewBinding value = this.M.getValue(this, T[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.s) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final l d() {
        return (l) this.R.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (tki.a) this.S.getValue();
    }
}
