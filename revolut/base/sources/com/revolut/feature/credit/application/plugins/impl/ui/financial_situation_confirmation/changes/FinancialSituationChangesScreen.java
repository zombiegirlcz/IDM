package com.revolut.feature.credit.application.plugins.impl.ui.financial_situation_confirmation.changes;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import aw0.o9;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.InputChecklistDelegate;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.credit.application.plugins.impl.ui.core.plugins.PluginScreenController;
import com.revolut.feature.credit.application.plugins.impl.ui.financial_situation_confirmation.changes.FinancialSituationChangesScreen;
import com.revolut.feature.credit.application.plugins.impl.ui.financial_situation_confirmation.changes.FinancialSituationChangesScreenContract$InputData;
import com.revolut.feature.credit.core.R$string;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import dw3.c1;
import dw3.h3;
import dw3.i3;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import sy3.c;
import te0.w;
import vc.s;
import xki.e;
import yb4.b;
import yb4.d;
import yb4.h;
import yb4.i;
import yb4.j;
import zhm.u;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/financial_situation_confirmation/changes/FinancialSituationChangesScreen;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/core/plugins/PluginScreenController;", "Lyb4/h;", "Ldli/a;", "Lyb4/i;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class FinancialSituationChangesScreen extends PluginScreenController<h> implements a {
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(FinancialSituationChangesScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};
    public final FinancialSituationChangesScreenContract$InputData L;
    public final int M;
    public final Object N;
    public final Object O;
    public final ao.h P;
    public final InputChecklistDelegate Q;
    public final Object R;

    public FinancialSituationChangesScreen(FinancialSituationChangesScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.L = inputData;
        this.M = R$layout.screen_recycler_navbar_nextbutton;
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: yb4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FinancialSituationChangesScreen f312183b;

            {
                this.f312183b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                FinancialSituationChangesScreen financialSituationChangesScreen = this.f312183b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = FinancialSituationChangesScreen.S;
                        qji.b bVarU2 = financialSituationChangesScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.application.plugins.impl.ui.financial_situation_confirmation.changes.di.FinancialSituationChangesScreenComponentInjector");
                        i3 i3Var = (i3) bVarU2;
                        c1 c1Var = i3Var.f118952c;
                        i3 i3Var2 = i3Var.d;
                        FinancialSituationChangesScreenContract$InputData financialSituationChangesScreenContract$InputData = financialSituationChangesScreen.L;
                        financialSituationChangesScreenContract$InputData.getClass();
                        return new h3(c1Var, i3Var2, financialSituationChangesScreen, financialSituationChangesScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = FinancialSituationChangesScreen.S;
                        return (j) ((h3) financialSituationChangesScreen.N.getValue()).f118872h.get();
                    default:
                        KProperty[] kPropertyArr3 = FinancialSituationChangesScreen.S;
                        FinancialSituationChangesScreen financialSituationChangesScreen2 = this.f312183b;
                        return dli.f.a(financialSituationChangesScreen2, (j) financialSituationChangesScreen2.O.getValue(), u.c(financialSituationChangesScreen2.Q), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: yb4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FinancialSituationChangesScreen f312183b;

            {
                this.f312183b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                FinancialSituationChangesScreen financialSituationChangesScreen = this.f312183b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = FinancialSituationChangesScreen.S;
                        qji.b bVarU2 = financialSituationChangesScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.application.plugins.impl.ui.financial_situation_confirmation.changes.di.FinancialSituationChangesScreenComponentInjector");
                        i3 i3Var = (i3) bVarU2;
                        c1 c1Var = i3Var.f118952c;
                        i3 i3Var2 = i3Var.d;
                        FinancialSituationChangesScreenContract$InputData financialSituationChangesScreenContract$InputData = financialSituationChangesScreen.L;
                        financialSituationChangesScreenContract$InputData.getClass();
                        return new h3(c1Var, i3Var2, financialSituationChangesScreen, financialSituationChangesScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = FinancialSituationChangesScreen.S;
                        return (j) ((h3) financialSituationChangesScreen.N.getValue()).f118872h.get();
                    default:
                        KProperty[] kPropertyArr3 = FinancialSituationChangesScreen.S;
                        FinancialSituationChangesScreen financialSituationChangesScreen2 = this.f312183b;
                        return dli.f.a(financialSituationChangesScreen2, (j) financialSituationChangesScreen2.O.getValue(), u.c(financialSituationChangesScreen2.Q), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        this.P = s.t(this, b.f);
        this.Q = new InputChecklistDelegate();
        final int i3 = 2;
        this.R = w.y0(new Function0(this) { // from class: yb4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FinancialSituationChangesScreen f312183b;

            {
                this.f312183b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                FinancialSituationChangesScreen financialSituationChangesScreen = this.f312183b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = FinancialSituationChangesScreen.S;
                        qji.b bVarU2 = financialSituationChangesScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.application.plugins.impl.ui.financial_situation_confirmation.changes.di.FinancialSituationChangesScreenComponentInjector");
                        i3 i3Var = (i3) bVarU2;
                        c1 c1Var = i3Var.f118952c;
                        i3 i3Var2 = i3Var.d;
                        FinancialSituationChangesScreenContract$InputData financialSituationChangesScreenContract$InputData = financialSituationChangesScreen.L;
                        financialSituationChangesScreenContract$InputData.getClass();
                        return new h3(c1Var, i3Var2, financialSituationChangesScreen, financialSituationChangesScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = FinancialSituationChangesScreen.S;
                        return (j) ((h3) financialSituationChangesScreen.N.getValue()).f118872h.get();
                    default:
                        KProperty[] kPropertyArr3 = FinancialSituationChangesScreen.S;
                        FinancialSituationChangesScreen financialSituationChangesScreen2 = this.f312183b;
                        return dli.f.a(financialSituationChangesScreen2, (j) financialSituationChangesScreen2.O.getValue(), u.c(financialSituationChangesScreen2.Q), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        i uiState = (i) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        d3().f174564b.setEnabled(uiState.f312188b);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (h3) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (j) this.O.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        int i = R$string.financial_situation_confirmation_changes_title;
        FinancialSituationChangesScreenContract$InputData financialSituationChangesScreenContract$InputData = this.L;
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(i, u.c(new TextClause(financialSituationChangesScreenContract$InputData.f67762a.f266606a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12));
        int i2 = R$string.financial_situation_confirmation_changes_title;
        c cVar = financialSituationChangesScreenContract$InputData.f67762a;
        navBarWithToolbar.setTitle(new TextLocalisedClause(i2, u.c(new TextClause(cVar.f266606a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12), null);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        d3().f174564b.setText(new TextLocalisedClause(R$string.financial_situation_confirmation_changes_button, u.c(new TextClause(cVar.f266607b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(d3().f174565c.f59410q), new yb4.c(this, null, 0), 3);
        ViewController.P2(this, rd0.e.b(d3().f174564b.o), new yb4.c(this, null, 1), 3);
        InputChecklistDelegate inputChecklistDelegate = this.Q;
        ViewController.P2(this, rd0.e.b(inputChecklistDelegate.f52518c), new d(this, null), 3);
        ViewController.P2(this, rd0.e.b(inputChecklistDelegate.e.f121375b), new yb4.e(this, null), 3);
    }

    public final jii.u d3() {
        ViewBinding value = this.P.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.u) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.M;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.R.getValue();
    }
}
