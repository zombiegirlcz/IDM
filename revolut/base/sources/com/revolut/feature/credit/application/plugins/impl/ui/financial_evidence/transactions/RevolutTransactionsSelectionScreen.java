package com.revolut.feature.credit.application.plugins.impl.ui.financial_evidence.transactions;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.credit.application.plugins.impl.ui.core.plugins.PluginScreenController;
import com.revolut.feature.credit.application.plugins.impl.ui.financial_evidence.transactions.RevolutTransactionsSelectionScreen;
import com.revolut.feature.credit.application.plugins.impl.ui.financial_evidence.transactions.RevolutTransactionsSelectionScreenContract$InputData;
import com.revolut.kompot.common.R$layout;
import dli.a;
import dw3.c1;
import dw3.u5;
import jii.u;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import tx0.j0;
import vb4.b;
import vb4.c;
import vb4.d;
import vb4.l;
import vb4.m;
import vb4.n;
import vc.s;
import w01.k;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/financial_evidence/transactions/RevolutTransactionsSelectionScreen;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/core/plugins/PluginScreenController;", "Lvb4/l;", "Ldli/a;", "Lvb4/n;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class RevolutTransactionsSelectionScreen extends PluginScreenController<l> implements a {
    public static final /* synthetic */ KProperty[] T = {o0.f186429a.j(new h0(RevolutTransactionsSelectionScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};
    public final RevolutTransactionsSelectionScreenContract$InputData L;
    public final int M;
    public final Object N;
    public final Object O;
    public final h P;
    public final SelectableDelegate Q;
    public final FullScreenStateDelegate R;
    public final Object S;

    public RevolutTransactionsSelectionScreen(RevolutTransactionsSelectionScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.L = inputData;
        this.M = R$layout.screen_recycler_navbar_nextbutton;
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: vb4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RevolutTransactionsSelectionScreen f287401b;

            {
                this.f287401b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                RevolutTransactionsSelectionScreen revolutTransactionsSelectionScreen = this.f287401b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = RevolutTransactionsSelectionScreen.T;
                        qji.b bVarU2 = revolutTransactionsSelectionScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.application.plugins.impl.ui.financial_evidence.transactions.di.RevolutTransactionsSelectionScreenInjector");
                        dw3.q qVar = (dw3.q) bVarU2;
                        c1 c1Var = qVar.f119541c;
                        dw3.q qVar2 = qVar.d;
                        RevolutTransactionsSelectionScreenContract$InputData revolutTransactionsSelectionScreenContract$InputData = revolutTransactionsSelectionScreen.L;
                        revolutTransactionsSelectionScreenContract$InputData.getClass();
                        return new u5(c1Var, qVar2, revolutTransactionsSelectionScreen, revolutTransactionsSelectionScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = RevolutTransactionsSelectionScreen.T;
                        return (m) ((u5) revolutTransactionsSelectionScreen.N.getValue()).i.get();
                    default:
                        KProperty[] kPropertyArr3 = RevolutTransactionsSelectionScreen.T;
                        RevolutTransactionsSelectionScreen revolutTransactionsSelectionScreen2 = this.f287401b;
                        return dli.f.a(revolutTransactionsSelectionScreen2, (m) revolutTransactionsSelectionScreen2.O.getValue(), v.k(revolutTransactionsSelectionScreen2.Q, revolutTransactionsSelectionScreen2.R, new RowLoadingDelegate(), new ListSubheaderDelegate()), 0, null, null, null, 60);
                }
            }
        });
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: vb4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RevolutTransactionsSelectionScreen f287401b;

            {
                this.f287401b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                RevolutTransactionsSelectionScreen revolutTransactionsSelectionScreen = this.f287401b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = RevolutTransactionsSelectionScreen.T;
                        qji.b bVarU2 = revolutTransactionsSelectionScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.application.plugins.impl.ui.financial_evidence.transactions.di.RevolutTransactionsSelectionScreenInjector");
                        dw3.q qVar = (dw3.q) bVarU2;
                        c1 c1Var = qVar.f119541c;
                        dw3.q qVar2 = qVar.d;
                        RevolutTransactionsSelectionScreenContract$InputData revolutTransactionsSelectionScreenContract$InputData = revolutTransactionsSelectionScreen.L;
                        revolutTransactionsSelectionScreenContract$InputData.getClass();
                        return new u5(c1Var, qVar2, revolutTransactionsSelectionScreen, revolutTransactionsSelectionScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = RevolutTransactionsSelectionScreen.T;
                        return (m) ((u5) revolutTransactionsSelectionScreen.N.getValue()).i.get();
                    default:
                        KProperty[] kPropertyArr3 = RevolutTransactionsSelectionScreen.T;
                        RevolutTransactionsSelectionScreen revolutTransactionsSelectionScreen2 = this.f287401b;
                        return dli.f.a(revolutTransactionsSelectionScreen2, (m) revolutTransactionsSelectionScreen2.O.getValue(), v.k(revolutTransactionsSelectionScreen2.Q, revolutTransactionsSelectionScreen2.R, new RowLoadingDelegate(), new ListSubheaderDelegate()), 0, null, null, null, 60);
                }
            }
        });
        this.P = s.t(this, b.f);
        this.Q = new SelectableDelegate(new RowDelegate(null, null, 7));
        this.R = new FullScreenStateDelegate();
        final int i3 = 2;
        this.S = w.y0(new Function0(this) { // from class: vb4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RevolutTransactionsSelectionScreen f287401b;

            {
                this.f287401b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                RevolutTransactionsSelectionScreen revolutTransactionsSelectionScreen = this.f287401b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = RevolutTransactionsSelectionScreen.T;
                        qji.b bVarU2 = revolutTransactionsSelectionScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.application.plugins.impl.ui.financial_evidence.transactions.di.RevolutTransactionsSelectionScreenInjector");
                        dw3.q qVar = (dw3.q) bVarU2;
                        c1 c1Var = qVar.f119541c;
                        dw3.q qVar2 = qVar.d;
                        RevolutTransactionsSelectionScreenContract$InputData revolutTransactionsSelectionScreenContract$InputData = revolutTransactionsSelectionScreen.L;
                        revolutTransactionsSelectionScreenContract$InputData.getClass();
                        return new u5(c1Var, qVar2, revolutTransactionsSelectionScreen, revolutTransactionsSelectionScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = RevolutTransactionsSelectionScreen.T;
                        return (m) ((u5) revolutTransactionsSelectionScreen.N.getValue()).i.get();
                    default:
                        KProperty[] kPropertyArr3 = RevolutTransactionsSelectionScreen.T;
                        RevolutTransactionsSelectionScreen revolutTransactionsSelectionScreen2 = this.f287401b;
                        return dli.f.a(revolutTransactionsSelectionScreen2, (m) revolutTransactionsSelectionScreen2.O.getValue(), v.k(revolutTransactionsSelectionScreen2.Q, revolutTransactionsSelectionScreen2.R, new RowLoadingDelegate(), new ListSubheaderDelegate()), 0, null, null, null, 60);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        n uiState = (n) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        Intrinsics.checkNotNullExpressionValue(navBarWithToolbar, "navBarWithToolbar");
        navBarWithToolbar.setTitle(uiState.f287411b, null);
        NavBarWithToolbar navBarWithToolbar2 = d3().f174565c;
        Clause clause = uiState.f287412c;
        navBarWithToolbar2.setSecondDescriptionText(clause);
        d3().f174565c.setSecondDescriptionVisible(clause != null);
        d3().f174565c.setHint(uiState.d);
        if (!uiState.f) {
            LargeActionButton goToButton = d3().f174564b;
            Intrinsics.checkNotNullExpressionValue(goToButton, "goToButton");
            k.a(goToButton);
        } else {
            d3().f174564b.setText(uiState.e);
            LargeActionButton goToButton2 = d3().f174564b;
            Intrinsics.checkNotNullExpressionValue(goToButton2, "goToButton");
            k.d(goToButton2);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (u5) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (m) this.O.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        d3().f174565c.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        d3().f174565c.setHeaderTitleMode(j0.MULTILINE);
        d3().f174565c.setSearchButtonActive(true);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174565c.f59410q), null, new c(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174565c.f59409p.f57337m), null, new v44.e(this, null, 16), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.Q.r()), null, new d(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.R.f52371h.f121375b), null, new vb4.e(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174564b.o), null, new c(this, null, 1), 3);
    }

    public final u d3() {
        ViewBinding value = this.P.getValue(this, T[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (u) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getU() {
        return this.M;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.S.getValue();
    }
}
