package com.revolut.feature.credit.application.plugins.impl.ui.credit_health.content;

import android.os.Parcelable;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import aw3.k;
import bx4.c;
import cli.o;
import cli.q;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.buttons.TwinVerticalButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.credit.application.plugins.impl.R$id;
import com.revolut.feature.credit.application.plugins.impl.R$layout;
import com.revolut.feature.credit.application.plugins.impl.ui.core.plugins.PluginScreenController;
import com.revolut.feature.credit.application.plugins.impl.ui.credit_health.content.CreditHealthContentScreen;
import com.revolut.feature.credit.application.plugins.impl.ui.credit_health.content.CreditHealthContentScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import dw3.c1;
import dw3.i1;
import dw3.j1;
import grl.k9;
import j84.b;
import j84.d;
import j84.g;
import j84.i;
import j84.j;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import no.m;
import te0.w;
import tx0.j0;
import vc.s;
import xki.e;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u00052\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/credit_health/content/CreditHealthContentScreen;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/core/plugins/PluginScreenController;", "Lj84/g;", "Ldli/a;", "Lj84/i;", "Lbx4/c;", "Lno/m;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CreditHealthContentScreen extends PluginScreenController<g> implements a, c, m {
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(CreditHealthContentScreen.class, "binding", "getBinding()Lcom/revolut/feature/credit/application/plugins/impl/databinding/ScreenCreditRecyclerNavbarTwinbuttonsBinding;", 0))};
    public final CreditHealthContentScreenContract$InputData L;
    public final AnalyticsProduct.Retail M;
    public final int N;
    public final Object O;
    public final Object P;
    public final h Q;
    public final Object R;

    public CreditHealthContentScreen(CreditHealthContentScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.L = inputData;
        k9 k9Var = k9.Credit;
        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
        this.M = com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var);
        this.N = R$layout.screen_credit_recycler_navbar_twinbuttons;
        final int i = 0;
        this.O = w.y0(new Function0(this) { // from class: j84.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CreditHealthContentScreen f172120b;

            {
                this.f172120b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                CreditHealthContentScreen creditHealthContentScreen = this.f172120b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = CreditHealthContentScreen.S;
                        qji.b bVarU2 = creditHealthContentScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.application.plugins.impl.ui.credit_health.content.di.CreditHealthContentScreenInjector");
                        j1 j1Var = (j1) bVarU2;
                        c1 c1Var = j1Var.f119014b;
                        j1 j1Var2 = j1Var.f119015c;
                        CreditHealthContentScreenContract$InputData creditHealthContentScreenContract$InputData = creditHealthContentScreen.L;
                        creditHealthContentScreenContract$InputData.getClass();
                        return new i1(c1Var, j1Var2, creditHealthContentScreen, creditHealthContentScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = CreditHealthContentScreen.S;
                        return (h) ((i1) creditHealthContentScreen.O.getValue()).f.get();
                    default:
                        KProperty[] kPropertyArr3 = CreditHealthContentScreen.S;
                        CreditHealthContentScreen creditHealthContentScreen2 = this.f172120b;
                        return dli.f.a(creditHealthContentScreen2, creditHealthContentScreen2.d(), ((i1) creditHealthContentScreen2.O.getValue()).c().Q(), R$id.creditApplication_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.P = w.y0(new Function0(this) { // from class: j84.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CreditHealthContentScreen f172120b;

            {
                this.f172120b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                CreditHealthContentScreen creditHealthContentScreen = this.f172120b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CreditHealthContentScreen.S;
                        qji.b bVarU2 = creditHealthContentScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.application.plugins.impl.ui.credit_health.content.di.CreditHealthContentScreenInjector");
                        j1 j1Var = (j1) bVarU2;
                        c1 c1Var = j1Var.f119014b;
                        j1 j1Var2 = j1Var.f119015c;
                        CreditHealthContentScreenContract$InputData creditHealthContentScreenContract$InputData = creditHealthContentScreen.L;
                        creditHealthContentScreenContract$InputData.getClass();
                        return new i1(c1Var, j1Var2, creditHealthContentScreen, creditHealthContentScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = CreditHealthContentScreen.S;
                        return (h) ((i1) creditHealthContentScreen.O.getValue()).f.get();
                    default:
                        KProperty[] kPropertyArr3 = CreditHealthContentScreen.S;
                        CreditHealthContentScreen creditHealthContentScreen2 = this.f172120b;
                        return dli.f.a(creditHealthContentScreen2, creditHealthContentScreen2.d(), ((i1) creditHealthContentScreen2.O.getValue()).c().Q(), R$id.creditApplication_recyclerView, null, null, null, 56);
                }
            }
        });
        this.Q = s.t(this, b.f);
        final int i3 = 2;
        this.R = w.y0(new Function0(this) { // from class: j84.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CreditHealthContentScreen f172120b;

            {
                this.f172120b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                CreditHealthContentScreen creditHealthContentScreen = this.f172120b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CreditHealthContentScreen.S;
                        qji.b bVarU2 = creditHealthContentScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.application.plugins.impl.ui.credit_health.content.di.CreditHealthContentScreenInjector");
                        j1 j1Var = (j1) bVarU2;
                        c1 c1Var = j1Var.f119014b;
                        j1 j1Var2 = j1Var.f119015c;
                        CreditHealthContentScreenContract$InputData creditHealthContentScreenContract$InputData = creditHealthContentScreen.L;
                        creditHealthContentScreenContract$InputData.getClass();
                        return new i1(c1Var, j1Var2, creditHealthContentScreen, creditHealthContentScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = CreditHealthContentScreen.S;
                        return (h) ((i1) creditHealthContentScreen.O.getValue()).f.get();
                    default:
                        KProperty[] kPropertyArr3 = CreditHealthContentScreen.S;
                        CreditHealthContentScreen creditHealthContentScreen2 = this.f172120b;
                        return dli.f.a(creditHealthContentScreen2, creditHealthContentScreen2.d(), ((i1) creditHealthContentScreen2.O.getValue()).c().Q(), R$id.creditApplication_recyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        i uiState = (i) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        KProperty[] kPropertyArr = S;
        KProperty kProperty = kPropertyArr[0];
        h hVar = this.Q;
        ViewBinding value = hVar.getValue(this, kProperty);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        NavBarWithToolbar creditApplicationNavBarWithToolbar = ((k) value).f10698b;
        Intrinsics.checkNotNullExpressionValue(creditApplicationNavBarWithToolbar, "creditApplicationNavBarWithToolbar");
        TextLocalisedClause textLocalisedClause = uiState.f172125b;
        creditApplicationNavBarWithToolbar.setTitle(textLocalisedClause, null);
        creditApplicationNavBarWithToolbar.setToolbarTitle(textLocalisedClause);
        Clause clause = uiState.f172126c;
        creditApplicationNavBarWithToolbar.setSecondDescriptionText(clause);
        creditApplicationNavBarWithToolbar.setSecondDescriptionVisible(clause != null);
        ViewBinding value2 = hVar.getValue(this, kPropertyArr[0]);
        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
        TwinVerticalButton creditApplicationTwinVerticalButton = ((k) value2).d;
        Intrinsics.checkNotNullExpressionValue(creditApplicationTwinVerticalButton, "creditApplicationTwinVerticalButton");
        creditApplicationTwinVerticalButton.setMainButtonText(uiState.d);
        Clause clause2 = uiState.e;
        creditApplicationTwinVerticalButton.setSecondaryButtonVisible(clause2 != null);
        creditApplicationTwinVerticalButton.setSecondaryButtonStyle(LargeActionButton.ButtonStyle.f58726b);
        creditApplicationTwinVerticalButton.setSecondaryButtonText(clause2);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController, com.revolut.kompot.navigable.a
    public final boolean F2() {
        ((j) d()).C2(d.f172121a);
        return true;
    }

    @Override // no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getN() {
        return this.M;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (i1) this.O.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        KProperty[] kPropertyArr = S;
        KProperty kProperty = kPropertyArr[0];
        h hVar = this.Q;
        ViewBinding value = hVar.getValue(this, kProperty);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        NavBarWithToolbar creditApplicationNavBarWithToolbar = ((k) value).f10698b;
        Intrinsics.checkNotNullExpressionValue(creditApplicationNavBarWithToolbar, "creditApplicationNavBarWithToolbar");
        creditApplicationNavBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        creditApplicationNavBarWithToolbar.setHeaderTitleMode(j0.MULTILINE);
        ViewBinding value2 = hVar.getValue(this, kPropertyArr[0]);
        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
        TwinVerticalButton creditApplicationTwinVerticalButton = ((k) value2).d;
        Intrinsics.checkNotNullExpressionValue(creditApplicationTwinVerticalButton, "creditApplicationTwinVerticalButton");
        creditApplicationTwinVerticalButton.setCollapsible(false);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        KProperty[] kPropertyArr = S;
        KProperty kProperty = kPropertyArr[0];
        h hVar = this.Q;
        ViewBinding value = hVar.getValue(this, kProperty);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        NavBarWithToolbar creditApplicationNavBarWithToolbar = ((k) value).f10698b;
        Intrinsics.checkNotNullExpressionValue(creditApplicationNavBarWithToolbar, "creditApplicationNavBarWithToolbar");
        ViewController.P2(this, rd0.e.b(creditApplicationNavBarWithToolbar.f59410q), new j84.c(this, null, 0), 3);
        ViewBinding value2 = hVar.getValue(this, kPropertyArr[0]);
        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
        TwinVerticalButton creditApplicationTwinVerticalButton = ((k) value2).d;
        Intrinsics.checkNotNullExpressionValue(creditApplicationTwinVerticalButton, "creditApplicationTwinVerticalButton");
        ViewController.P2(this, rd0.e.b(creditApplicationTwinVerticalButton.o0()), new j84.c(this, null, 1), 3);
        ViewBinding value3 = hVar.getValue(this, kPropertyArr[0]);
        Intrinsics.checkNotNullExpressionValue(value3, "getValue(...)");
        TwinVerticalButton creditApplicationTwinVerticalButton2 = ((k) value3).d;
        Intrinsics.checkNotNullExpressionValue(creditApplicationTwinVerticalButton2, "creditApplicationTwinVerticalButton");
        ViewController.P2(this, rd0.e.b(creditApplicationTwinVerticalButton2.p0()), new j84.c(this, null, 2), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // bx4.c
    /* JADX INFO: renamed from: d3, reason: merged with bridge method [inline-methods] */
    public final j84.h d() {
        return (j84.h) this.P.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.N;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.R.getValue();
    }
}
