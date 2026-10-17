package com.revolut.feature.credit.application.plugins.impl.ui.financial_situation_confirmation.details;

import ac4.b;
import ac4.d;
import ac4.e;
import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import aw0.o9;
import bx4.c;
import cli.o;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.credit.application.plugins.impl.ui.core.plugins.PluginScreenController;
import com.revolut.feature.credit.application.plugins.impl.ui.financial_situation_confirmation.details.FinancialSituationDetailsScreen;
import com.revolut.feature.credit.application.plugins.impl.ui.financial_situation_confirmation.details.FinancialSituationDetailsScreenContract$InputData;
import com.revolut.feature.credit.core.R$string;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import dw3.c1;
import dw3.i3;
import dw3.j3;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import sy3.f;
import te0.w;
import vc.s;
import zhm.u;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/financial_situation_confirmation/details/FinancialSituationDetailsScreen;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/core/plugins/PluginScreenController;", "Laii/q;", "Ldli/a;", "Lac4/e;", "Lbx4/c;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class FinancialSituationDetailsScreen extends PluginScreenController<q> implements a, c {
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(FinancialSituationDetailsScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};
    public final FinancialSituationDetailsScreenContract$InputData L;
    public final int M;
    public final Object N;
    public final Object O;
    public final h P;
    public final Object Q;

    public FinancialSituationDetailsScreen(FinancialSituationDetailsScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.L = inputData;
        this.M = R$layout.screen_recycler_navbar_nextbutton;
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: ac4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FinancialSituationDetailsScreen f3027b;

            {
                this.f3027b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                FinancialSituationDetailsScreen financialSituationDetailsScreen = this.f3027b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = FinancialSituationDetailsScreen.R;
                        qji.b bVarU2 = financialSituationDetailsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.application.plugins.impl.ui.financial_situation_confirmation.details.di.FinancialSituationDetailsScreenComponentInjector");
                        i3 i3Var = (i3) bVarU2;
                        c1 c1Var = i3Var.f118952c;
                        i3 i3Var2 = i3Var.d;
                        FinancialSituationDetailsScreenContract$InputData financialSituationDetailsScreenContract$InputData = financialSituationDetailsScreen.L;
                        financialSituationDetailsScreenContract$InputData.getClass();
                        return new j3(c1Var, i3Var2, financialSituationDetailsScreen, financialSituationDetailsScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = FinancialSituationDetailsScreen.R;
                        return (d) ((j3) financialSituationDetailsScreen.N.getValue()).f119030j.get();
                    default:
                        KProperty[] kPropertyArr3 = FinancialSituationDetailsScreen.R;
                        FinancialSituationDetailsScreen financialSituationDetailsScreen2 = this.f3027b;
                        return dli.f.a(financialSituationDetailsScreen2, (d) financialSituationDetailsScreen2.O.getValue(), ((j3) financialSituationDetailsScreen2.N.getValue()).c().Q(), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: ac4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FinancialSituationDetailsScreen f3027b;

            {
                this.f3027b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                FinancialSituationDetailsScreen financialSituationDetailsScreen = this.f3027b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = FinancialSituationDetailsScreen.R;
                        qji.b bVarU2 = financialSituationDetailsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.application.plugins.impl.ui.financial_situation_confirmation.details.di.FinancialSituationDetailsScreenComponentInjector");
                        i3 i3Var = (i3) bVarU2;
                        c1 c1Var = i3Var.f118952c;
                        i3 i3Var2 = i3Var.d;
                        FinancialSituationDetailsScreenContract$InputData financialSituationDetailsScreenContract$InputData = financialSituationDetailsScreen.L;
                        financialSituationDetailsScreenContract$InputData.getClass();
                        return new j3(c1Var, i3Var2, financialSituationDetailsScreen, financialSituationDetailsScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = FinancialSituationDetailsScreen.R;
                        return (d) ((j3) financialSituationDetailsScreen.N.getValue()).f119030j.get();
                    default:
                        KProperty[] kPropertyArr3 = FinancialSituationDetailsScreen.R;
                        FinancialSituationDetailsScreen financialSituationDetailsScreen2 = this.f3027b;
                        return dli.f.a(financialSituationDetailsScreen2, (d) financialSituationDetailsScreen2.O.getValue(), ((j3) financialSituationDetailsScreen2.N.getValue()).c().Q(), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        this.P = s.t(this, b.f);
        final int i3 = 2;
        this.Q = w.y0(new Function0(this) { // from class: ac4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FinancialSituationDetailsScreen f3027b;

            {
                this.f3027b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                FinancialSituationDetailsScreen financialSituationDetailsScreen = this.f3027b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = FinancialSituationDetailsScreen.R;
                        qji.b bVarU2 = financialSituationDetailsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.application.plugins.impl.ui.financial_situation_confirmation.details.di.FinancialSituationDetailsScreenComponentInjector");
                        i3 i3Var = (i3) bVarU2;
                        c1 c1Var = i3Var.f118952c;
                        i3 i3Var2 = i3Var.d;
                        FinancialSituationDetailsScreenContract$InputData financialSituationDetailsScreenContract$InputData = financialSituationDetailsScreen.L;
                        financialSituationDetailsScreenContract$InputData.getClass();
                        return new j3(c1Var, i3Var2, financialSituationDetailsScreen, financialSituationDetailsScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = FinancialSituationDetailsScreen.R;
                        return (d) ((j3) financialSituationDetailsScreen.N.getValue()).f119030j.get();
                    default:
                        KProperty[] kPropertyArr3 = FinancialSituationDetailsScreen.R;
                        FinancialSituationDetailsScreen financialSituationDetailsScreen2 = this.f3027b;
                        return dli.f.a(financialSituationDetailsScreen2, (d) financialSituationDetailsScreen2.O.getValue(), ((j3) financialSituationDetailsScreen2.N.getValue()).c().Q(), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, cli.q qVar) {
        a.z0((e) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (j3) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (d) this.O.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        int i = R$string.financial_situation_confirmation_details_title;
        FinancialSituationDetailsScreenContract$InputData financialSituationDetailsScreenContract$InputData = this.L;
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(i, u.c(new TextClause(financialSituationDetailsScreenContract$InputData.f67763a.f266614a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12));
        int i2 = R$string.financial_situation_confirmation_details_title;
        f fVar = financialSituationDetailsScreenContract$InputData.f67763a;
        navBarWithToolbar.setTitle(new TextLocalisedClause(i2, u.c(new TextClause(fVar.f266614a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12), null);
        navBarWithToolbar.setSecondDescriptionText(new TextLocalisedClause(R$string.financial_situation_confirmation_details_description, u.c(new TextClause(fVar.f266615b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12));
        navBarWithToolbar.setSecondDescriptionVisible(true);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        d3().f174564b.setText(new TextLocalisedClause(R$string.financial_situation_confirmation_details_button, u.c(new TextClause(fVar.f266616c, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(d3().f174565c.f59410q), new ac4.c(this, null, 0), 3);
        ViewController.P2(this, rd0.e.b(d3().f174564b.o), new ac4.c(this, null, 1), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // bx4.c
    public final ax4.d d() {
        return (d) this.O.getValue();
    }

    public final jii.u d3() {
        ViewBinding value = this.P.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.u) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getF0() {
        return this.M;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.Q.getValue();
    }
}
