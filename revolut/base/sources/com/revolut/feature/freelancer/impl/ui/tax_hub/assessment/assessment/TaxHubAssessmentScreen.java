package com.revolut.feature.freelancer.impl.ui.tax_hub.assessment.assessment;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.freelancer.impl.ui.tax_hub.assessment.assessment.TaxHubAssessmentScreen;
import com.revolut.feature.freelancer.impl.ui.tax_hub.assessment.assessment.TaxHubAssessmentScreenContract$InputData;
import com.revolut.kompot.common.R$id;
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
import te0.w;
import tx0.j0;
import tx0.t3;
import vc.s;
import z27.k;
import z27.l;
import z27.n;
import z27.p;
import z27.r;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/freelancer/impl/ui/tax_hub/assessment/assessment/TaxHubAssessmentScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lz27/k;", "Ltki/c;", "Lz27/r;", "Lno/k;", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TaxHubAssessmentScreen extends ViewController<k> implements tki.c, no.k {
    public static final /* synthetic */ KProperty[] T = {o0.f186429a.j(new h0(TaxHubAssessmentScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarFooterNextbuttonBinding;", 0))};
    public final TaxHubAssessmentScreenContract$InputData K;
    public final int L;
    public final h M;
    public final FullScreenStateDelegate N;
    public final RowDelegate O;
    public AnalyticsContext P;
    public final Object Q;
    public final Object R;
    public final Object S;

    public TaxHubAssessmentScreen(TaxHubAssessmentScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbar_footer_nextbutton;
        this.M = s.t(this, z27.b.f);
        this.N = new FullScreenStateDelegate();
        this.O = new RowDelegate(null, null, 7);
        final int i = 0;
        this.Q = w.y0(new Function0(this) { // from class: z27.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TaxHubAssessmentScreen f318975b;

            {
                this.f318975b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                TaxHubAssessmentScreen taxHubAssessmentScreen = this.f318975b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = TaxHubAssessmentScreen.T;
                        qji.b bVarU2 = taxHubAssessmentScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.freelancer.impl.ui.tax_hub.assessment.assessment.di.TaxHubAssessmentScreenInjector");
                        bt6.j jVar = (bt6.j) bVarU2;
                        bt6.b bVar = jVar.f18354b;
                        bt6.j jVar2 = jVar.f18355c;
                        TaxHubAssessmentScreenContract$InputData taxHubAssessmentScreenContract$InputData = taxHubAssessmentScreen.K;
                        taxHubAssessmentScreenContract$InputData.getClass();
                        return new bt6.k(bVar, jVar2, taxHubAssessmentScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = TaxHubAssessmentScreen.T;
                        return (l) ((bt6.k) taxHubAssessmentScreen.Q.getValue()).d.get();
                    default:
                        KProperty[] kPropertyArr3 = TaxHubAssessmentScreen.T;
                        TaxHubAssessmentScreen taxHubAssessmentScreen2 = this.f318975b;
                        return tki.g.a(taxHubAssessmentScreen2, taxHubAssessmentScreen2.d(), zhm.v.k(taxHubAssessmentScreen2.N, taxHubAssessmentScreen2.O, new RowLoadingDelegate()), R$id.screenRecyclerNavbarFooterNextbutton_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.R = w.y0(new Function0(this) { // from class: z27.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TaxHubAssessmentScreen f318975b;

            {
                this.f318975b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                TaxHubAssessmentScreen taxHubAssessmentScreen = this.f318975b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = TaxHubAssessmentScreen.T;
                        qji.b bVarU2 = taxHubAssessmentScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.freelancer.impl.ui.tax_hub.assessment.assessment.di.TaxHubAssessmentScreenInjector");
                        bt6.j jVar = (bt6.j) bVarU2;
                        bt6.b bVar = jVar.f18354b;
                        bt6.j jVar2 = jVar.f18355c;
                        TaxHubAssessmentScreenContract$InputData taxHubAssessmentScreenContract$InputData = taxHubAssessmentScreen.K;
                        taxHubAssessmentScreenContract$InputData.getClass();
                        return new bt6.k(bVar, jVar2, taxHubAssessmentScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = TaxHubAssessmentScreen.T;
                        return (l) ((bt6.k) taxHubAssessmentScreen.Q.getValue()).d.get();
                    default:
                        KProperty[] kPropertyArr3 = TaxHubAssessmentScreen.T;
                        TaxHubAssessmentScreen taxHubAssessmentScreen2 = this.f318975b;
                        return tki.g.a(taxHubAssessmentScreen2, taxHubAssessmentScreen2.d(), zhm.v.k(taxHubAssessmentScreen2.N, taxHubAssessmentScreen2.O, new RowLoadingDelegate()), R$id.screenRecyclerNavbarFooterNextbutton_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i3 = 2;
        this.S = w.y0(new Function0(this) { // from class: z27.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TaxHubAssessmentScreen f318975b;

            {
                this.f318975b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                TaxHubAssessmentScreen taxHubAssessmentScreen = this.f318975b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = TaxHubAssessmentScreen.T;
                        qji.b bVarU2 = taxHubAssessmentScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.freelancer.impl.ui.tax_hub.assessment.assessment.di.TaxHubAssessmentScreenInjector");
                        bt6.j jVar = (bt6.j) bVarU2;
                        bt6.b bVar = jVar.f18354b;
                        bt6.j jVar2 = jVar.f18355c;
                        TaxHubAssessmentScreenContract$InputData taxHubAssessmentScreenContract$InputData = taxHubAssessmentScreen.K;
                        taxHubAssessmentScreenContract$InputData.getClass();
                        return new bt6.k(bVar, jVar2, taxHubAssessmentScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = TaxHubAssessmentScreen.T;
                        return (l) ((bt6.k) taxHubAssessmentScreen.Q.getValue()).d.get();
                    default:
                        KProperty[] kPropertyArr3 = TaxHubAssessmentScreen.T;
                        TaxHubAssessmentScreen taxHubAssessmentScreen2 = this.f318975b;
                        return tki.g.a(taxHubAssessmentScreen2, taxHubAssessmentScreen2.d(), zhm.v.k(taxHubAssessmentScreen2.N, taxHubAssessmentScreen2.O, new RowLoadingDelegate()), R$id.screenRecyclerNavbarFooterNextbutton_recyclerView, null, null, null, 56);
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
        z27.q qVar2 = uiState.f318993a;
        if (qVar2 instanceof n) {
            navBarWithToolbar.l0();
            n nVar = (n) qVar2;
            TextLocalisedClause textLocalisedClause = nVar.f318988a;
            navBarWithToolbar.setTitle(textLocalisedClause, null);
            navBarWithToolbar.setToolbarTitle(textLocalisedClause);
            navBarWithToolbar.setSecondDescriptionText(nVar.f318989b);
            navBarWithToolbar.setSecondDescriptionVisible(true);
            navBarWithToolbar.setMenuItems(nVar.f318990c);
        } else if (Intrinsics.f(qVar2, z27.o.f318991a)) {
            navBarWithToolbar.l0();
        } else {
            if (!Intrinsics.f(qVar2, p.f318992a)) {
                throw new NoWhenBranchMatchedException();
            }
            t3 t3Var = t3.TWO_LINES;
            NavBarWithToolbar.Companion companion = NavBarWithToolbar.INSTANCE;
            navBarWithToolbar.I0(t3Var, false);
        }
        d3().f174558c.setTextClause(uiState.f318994b.f318987a);
    }

    @Override // no.k
    public final void K1(AnalyticsContext analyticsContext) {
        this.P = analyticsContext;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (bt6.k) this.Q.getValue();
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
        ((bt6.k) this.Q.getValue()).getClass();
        this.P = new AnalyticsContext(x47.a.a(this.K.f74236b));
        d3().e.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        d3().e.setHeaderTitleMode(j0.MULTILINE_LARGE);
        LargeActionButton screenRecyclerNavbarFooterNextbuttonButton = d3().f174557b;
        Intrinsics.checkNotNullExpressionValue(screenRecyclerNavbarFooterNextbuttonButton, "screenRecyclerNavbarFooterNextbuttonButton");
        screenRecyclerNavbarFooterNextbuttonButton.setVisibility(8);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        ViewController.P2(this, rd0.e.b(d3().e.f59410q), new yl6.b(this, continuation, 26), 3);
        ViewController.P2(this, rd0.e.b(d3().e.o.f57403b), new yy6.f(this, continuation, 5), 3);
        ViewController.P2(this, rd0.e.b(this.N.f52371h.f121375b), new z27.c(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.O.f53218h), new z27.d(this, null), 3);
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
    public final int getN() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (tki.a) this.S.getValue();
    }
}
