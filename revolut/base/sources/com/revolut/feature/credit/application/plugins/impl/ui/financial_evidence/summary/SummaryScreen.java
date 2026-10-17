package com.revolut.feature.credit.application.plugins.impl.ui.financial_evidence.summary;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.SwipeToActionDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.credit.application.plugins.impl.ui.core.plugins.PluginScreenController;
import com.revolut.feature.credit.application.plugins.impl.ui.financial_evidence.summary.SummaryScreen;
import com.revolut.feature.credit.application.plugins.impl.ui.financial_evidence.summary.SummaryScreenContract$InputData;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import dw3.c1;
import dw3.l8;
import dw3.x2;
import java.util.List;
import jii.x;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import tb4.k;
import tb4.m;
import tb4.n;
import te0.w;
import tx0.j0;
import vc.s;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/financial_evidence/summary/SummaryScreen;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/core/plugins/PluginScreenController;", "Ltb4/m;", "Ldli/a;", "Ltb4/o;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SummaryScreen extends PluginScreenController<m> implements dli.a {
    public static final /* synthetic */ KProperty[] T = {o0.f186429a.j(new h0(SummaryScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarTwoButtonsBinding;", 0))};
    public final SummaryScreenContract$InputData L;
    public final int M;
    public final Object N;
    public final Object O;
    public final ao.h P;
    public final RowDelegate Q;
    public final SwipeToActionDelegate R;
    public final Object S;

    public SummaryScreen(SummaryScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.L = inputData;
        this.M = R$layout.screen_recycler_navbar_two_buttons;
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: tb4.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SummaryScreen f269441b;

            {
                this.f269441b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                SummaryScreen summaryScreen = this.f269441b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = SummaryScreen.T;
                        qji.b bVarU2 = summaryScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.application.plugins.impl.ui.financial_evidence.summary.di.SummaryScreenInjector");
                        x2 x2Var = (x2) bVarU2;
                        c1 c1Var = x2Var.f120130c;
                        x2 x2Var2 = x2Var.d;
                        SummaryScreenContract$InputData summaryScreenContract$InputData = summaryScreen.L;
                        summaryScreenContract$InputData.getClass();
                        return new l8(c1Var, x2Var2, summaryScreen, summaryScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = SummaryScreen.T;
                        return (n) ((l8) summaryScreen.N.getValue()).f119223h.get();
                    default:
                        KProperty[] kPropertyArr3 = SummaryScreen.T;
                        SummaryScreen summaryScreen2 = this.f269441b;
                        return dli.f.a(summaryScreen2, summaryScreen2.R2(), zhm.v.k(summaryScreen2.Q, summaryScreen2.R, new ListSubheaderDelegate(), new FullScreenStateDelegate(), new RowLoadingDelegate()), R$id.screenRecyclerNavbarTwoButtons_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: tb4.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SummaryScreen f269441b;

            {
                this.f269441b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                SummaryScreen summaryScreen = this.f269441b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = SummaryScreen.T;
                        qji.b bVarU2 = summaryScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.application.plugins.impl.ui.financial_evidence.summary.di.SummaryScreenInjector");
                        x2 x2Var = (x2) bVarU2;
                        c1 c1Var = x2Var.f120130c;
                        x2 x2Var2 = x2Var.d;
                        SummaryScreenContract$InputData summaryScreenContract$InputData = summaryScreen.L;
                        summaryScreenContract$InputData.getClass();
                        return new l8(c1Var, x2Var2, summaryScreen, summaryScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = SummaryScreen.T;
                        return (n) ((l8) summaryScreen.N.getValue()).f119223h.get();
                    default:
                        KProperty[] kPropertyArr3 = SummaryScreen.T;
                        SummaryScreen summaryScreen2 = this.f269441b;
                        return dli.f.a(summaryScreen2, summaryScreen2.R2(), zhm.v.k(summaryScreen2.Q, summaryScreen2.R, new ListSubheaderDelegate(), new FullScreenStateDelegate(), new RowLoadingDelegate()), R$id.screenRecyclerNavbarTwoButtons_recyclerView, null, null, null, 56);
                }
            }
        });
        this.P = s.t(this, tb4.d.f);
        RowDelegate rowDelegate = new RowDelegate(null, null, 7);
        this.Q = rowDelegate;
        this.R = new SwipeToActionDelegate(rowDelegate, false);
        final int i3 = 2;
        this.S = w.y0(new Function0(this) { // from class: tb4.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SummaryScreen f269441b;

            {
                this.f269441b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                SummaryScreen summaryScreen = this.f269441b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = SummaryScreen.T;
                        qji.b bVarU2 = summaryScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.application.plugins.impl.ui.financial_evidence.summary.di.SummaryScreenInjector");
                        x2 x2Var = (x2) bVarU2;
                        c1 c1Var = x2Var.f120130c;
                        x2 x2Var2 = x2Var.d;
                        SummaryScreenContract$InputData summaryScreenContract$InputData = summaryScreen.L;
                        summaryScreenContract$InputData.getClass();
                        return new l8(c1Var, x2Var2, summaryScreen, summaryScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = SummaryScreen.T;
                        return (n) ((l8) summaryScreen.N.getValue()).f119223h.get();
                    default:
                        KProperty[] kPropertyArr3 = SummaryScreen.T;
                        SummaryScreen summaryScreen2 = this.f269441b;
                        return dli.f.a(summaryScreen2, summaryScreen2.R2(), zhm.v.k(summaryScreen2.Q, summaryScreen2.R, new ListSubheaderDelegate(), new FullScreenStateDelegate(), new RowLoadingDelegate()), R$id.screenRecyclerNavbarTwoButtons_recyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        tb4.o uiState = (tb4.o) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        NavBarWithToolbar screenRecyclerNavbarTwoButtonsNavBarWithToolbar = d3().f174574c;
        Intrinsics.checkNotNullExpressionValue(screenRecyclerNavbarTwoButtonsNavBarWithToolbar, "screenRecyclerNavbarTwoButtonsNavBarWithToolbar");
        TextLocalisedClause textLocalisedClause = uiState.f269448b;
        screenRecyclerNavbarTwoButtonsNavBarWithToolbar.setTitle(textLocalisedClause, null);
        d3().f174574c.setToolbarTitle(textLocalisedClause);
        d3().f174574c.setSecondDescriptionText(uiState.f269449c);
        d3().f174573b.setText(uiState.d);
        d3().f174573b.setEnabled(uiState.f);
        LargeActionButton largeActionButton = d3().e;
        Clause clause = uiState.e;
        largeActionButton.setText(clause);
        LargeActionButton screenRecyclerNavbarTwoButtonsSecondButton = d3().e;
        Intrinsics.checkNotNullExpressionValue(screenRecyclerNavbarTwoButtonsSecondButton, "screenRecyclerNavbarTwoButtonsSecondButton");
        screenRecyclerNavbarTwoButtonsSecondButton.setVisibility(clause != null ? 0 : 8);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController, com.revolut.kompot.navigable.a
    public final boolean F2() {
        ((h) R2()).C2(k.f269445a);
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (l8) this.N.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        d3().f174574c.setNavigationButtonImage(new ResourceImage(R$drawable.uikit_icn_24_cross, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254));
        d3().f174574c.setHeaderTitleMode(j0.MULTILINE);
        d3().f174574c.setSecondDescriptionVisible(true);
        d3().e.o(LargeActionButton.ButtonStyle.f58726b);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174574c.f59410q), null, new tb4.e(this, continuation, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174573b.o), null, new tb4.e(this, continuation, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().e.o), null, new tb4.e(this, continuation, 2), 3);
        RowDelegate rowDelegate = this.Q;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(rowDelegate.k), null, new tb4.f(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(rowDelegate.f53218h), null, new tb4.g(this, null), 3);
    }

    public final x d3() {
        ViewBinding value = this.P.getValue(this, T[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (x) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final n R2() {
        return (n) this.O.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getM() {
        return this.M;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.S.getValue();
    }
}
