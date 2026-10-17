package com.revolut.feature.user_declarations.shared.flows.income.screen;

import android.os.Parcelable;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.ActionsDelegate;
import com.revolut.core.ui_kit.delegates.CenteredAmountDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.feature.user_declarations.shared.flows.income.screen.IncomeScreen;
import com.revolut.feature.user_declarations.shared.flows.income.screen.IncomeScreenContract$InputData;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import grl.k9;
import jii.u;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import nng.g;
import nng.p;
import no.m;
import te0.w;
import tx0.j0;
import vc.s;
import xif.k;
import xki.e;
import xng.c;
import xng.d;
import xng.f;
import xng.j;
import zhm.v;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00050\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/user_declarations/shared/flows/income/screen/IncomeScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lcom/revolut/feature/user_declarations/shared/flows/income/screen/a;", "Lno/m;", "Ldli/a;", "Lxng/k;", "feature_user_declarations_shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class IncomeScreen extends ViewController<a> implements m, dli.a {
    public static final /* synthetic */ KProperty[] V = {o0.f186429a.j(new h0(IncomeScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};
    public final IncomeScreenContract$InputData K;
    public final h L;
    public final ActionsDelegate M;
    public final CenteredAmountDelegate N;
    public final FullScreenStateDelegate O;
    public final k9 P;
    public final Object Q;
    public final Object R;
    public final Object S;
    public final int T;
    public final boolean U;

    public IncomeScreen(IncomeScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = s.t(this, xng.b.f);
        this.M = new ActionsDelegate();
        this.N = new CenteredAmountDelegate(new k(this, 11));
        this.O = new FullScreenStateDelegate();
        k9 value = k9.Onboarding;
        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
        Intrinsics.checkNotNullParameter(value, "value");
        this.P = value;
        final int i = 0;
        this.Q = w.y0(new Function0(this) { // from class: xng.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ IncomeScreen f307486b;

            {
                this.f307486b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                IncomeScreen incomeScreen = this.f307486b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = IncomeScreen.V;
                        qji.b bVarU2 = incomeScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.user_declarations.shared.flows.income.screen.di.IncomeScreenInjector");
                        nng.f fVar = (nng.f) bVarU2;
                        p pVar = fVar.f217645b;
                        nng.f fVar2 = fVar.f217646c;
                        IncomeScreenContract$InputData incomeScreenContract$InputData = incomeScreen.K;
                        incomeScreenContract$InputData.getClass();
                        return new nng.g(pVar, fVar2, incomeScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = IncomeScreen.V;
                        return (j) ((nng.g) incomeScreen.Q.getValue()).e.get();
                    default:
                        KProperty[] kPropertyArr3 = IncomeScreen.V;
                        IncomeScreen incomeScreen2 = this.f307486b;
                        return dli.f.a(incomeScreen2, incomeScreen2.R2(), v.k(incomeScreen2.M, incomeScreen2.N, incomeScreen2.O, new ListSubheaderDelegate(), new RowLoadingDelegate()), 0, null, null, null, 60);
                }
            }
        });
        final int i2 = 1;
        this.R = w.y0(new Function0(this) { // from class: xng.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ IncomeScreen f307486b;

            {
                this.f307486b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                IncomeScreen incomeScreen = this.f307486b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = IncomeScreen.V;
                        qji.b bVarU2 = incomeScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.user_declarations.shared.flows.income.screen.di.IncomeScreenInjector");
                        nng.f fVar = (nng.f) bVarU2;
                        p pVar = fVar.f217645b;
                        nng.f fVar2 = fVar.f217646c;
                        IncomeScreenContract$InputData incomeScreenContract$InputData = incomeScreen.K;
                        incomeScreenContract$InputData.getClass();
                        return new nng.g(pVar, fVar2, incomeScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = IncomeScreen.V;
                        return (j) ((nng.g) incomeScreen.Q.getValue()).e.get();
                    default:
                        KProperty[] kPropertyArr3 = IncomeScreen.V;
                        IncomeScreen incomeScreen2 = this.f307486b;
                        return dli.f.a(incomeScreen2, incomeScreen2.R2(), v.k(incomeScreen2.M, incomeScreen2.N, incomeScreen2.O, new ListSubheaderDelegate(), new RowLoadingDelegate()), 0, null, null, null, 60);
                }
            }
        });
        final int i3 = 2;
        this.S = w.y0(new Function0(this) { // from class: xng.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ IncomeScreen f307486b;

            {
                this.f307486b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                IncomeScreen incomeScreen = this.f307486b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = IncomeScreen.V;
                        qji.b bVarU2 = incomeScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.user_declarations.shared.flows.income.screen.di.IncomeScreenInjector");
                        nng.f fVar = (nng.f) bVarU2;
                        p pVar = fVar.f217645b;
                        nng.f fVar2 = fVar.f217646c;
                        IncomeScreenContract$InputData incomeScreenContract$InputData = incomeScreen.K;
                        incomeScreenContract$InputData.getClass();
                        return new nng.g(pVar, fVar2, incomeScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = IncomeScreen.V;
                        return (j) ((nng.g) incomeScreen.Q.getValue()).e.get();
                    default:
                        KProperty[] kPropertyArr3 = IncomeScreen.V;
                        IncomeScreen incomeScreen2 = this.f307486b;
                        return dli.f.a(incomeScreen2, incomeScreen2.R2(), v.k(incomeScreen2.M, incomeScreen2.N, incomeScreen2.O, new ListSubheaderDelegate(), new RowLoadingDelegate()), 0, null, null, null, 60);
                }
            }
        });
        this.T = R$layout.screen_recycler_navbar_nextbutton;
        this.U = true;
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        xng.k uiState = (xng.k) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        LargeActionButton largeActionButton = d3().f174564b;
        largeActionButton.setText(uiState.e);
        largeActionButton.setVisibility(uiState.f ? 0 : 8);
        largeActionButton.setEnabled(uiState.f307501g);
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE);
        Image image = uiState.d;
        Clause clause = uiState.f307500c;
        navBarWithToolbar.setNavigationButtonImage(image);
        Clause clause2 = uiState.f307498a;
        navBarWithToolbar.setTitle(clause2, null);
        navBarWithToolbar.setToolbarTitle(clause2);
        Clause clause3 = uiState.f307499b;
        navBarWithToolbar.setDescriptionText(clause3);
        navBarWithToolbar.setDescriptionVisible(clause3 != null);
        navBarWithToolbar.setSecondDescriptionText(clause);
        navBarWithToolbar.setSecondDescriptionVisible(clause != null);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController, com.revolut.kompot.navigable.a
    public final boolean F2() {
        return false;
    }

    @Override // no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getO() {
        return new AnalyticsProduct.Retail(this.P);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (g) this.Q.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        LargeActionButton goToButton = d3().f174564b;
        Intrinsics.checkNotNullExpressionValue(goToButton, "goToButton");
        goToButton.setVisibility(8);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        ViewController.P2(this, rd0.e.b(d3().f174564b.o), new f(this, continuation, 1), 3);
        ViewController.P2(this, rd0.e.b(d3().f174565c.f59410q), new f(this, continuation, 0), 3);
        ViewController.P2(this, rd0.e.b(d3().f174565c.p0()), new c(this, continuation, 1), 3);
        ViewController.P2(this, rd0.e.b(this.M.f51611c.f121375b), new c(this, continuation, 0), 3);
        ViewController.P2(this, rd0.e.b(this.O.f52371h.f121375b), new xng.e(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.N.f51968m.f121375b), new d(this, null), 3);
    }

    public final u d3() {
        ViewBinding value = this.L.getValue(this, V[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (u) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final j d() {
        return (j) this.R.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getM() {
        return this.T;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.S.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.U);
    }
}
