package com.revolut.feature.credit.application.plugins.impl.ui.offer_v2.repayment_day;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import bx4.c;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.GridSingleChoiceDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.credit.application.plugins.impl.ui.core.plugins.PluginScreenController;
import com.revolut.feature.credit.application.plugins.impl.ui.offer_v2.repayment_day.ChangeRepaymentDayScreen;
import com.revolut.feature.credit.application.plugins.impl.ui.offer_v2.repayment_day.ChangeRepaymentDayScreenContract$InputData;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import dw3.c1;
import dw3.d0;
import dw3.q4;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import te0.w;
import tx0.j0;
import vc.s;
import xki.e;
import yf4.b;
import yf4.d;
import yf4.f;
import yf4.g;
import zhm.u;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00062\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005:\u0001\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/offer_v2/repayment_day/ChangeRepaymentDayScreen;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/core/plugins/PluginScreenController;", "Lyf4/f;", "Ldli/a;", "Lyf4/h;", "Lbx4/c;", "Companion", "a", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ChangeRepaymentDayScreen extends PluginScreenController<f> implements a, c {
    public final ChangeRepaymentDayScreenContract$InputData L;
    public final int M;
    public final Object N;
    public final Object O;
    public final h P;
    public final GridSingleChoiceDelegate Q;
    public final Object R;
    public rr0.f S;
    public static final /* synthetic */ KProperty[] T = {o0.f186429a.j(new h0(ChangeRepaymentDayScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarFooterNextbuttonBinding;", 0))};

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: com.revolut.feature.credit.application.plugins.impl.ui.offer_v2.repayment_day.ChangeRepaymentDayScreen$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    public ChangeRepaymentDayScreen(ChangeRepaymentDayScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.L = inputData;
        this.M = R$layout.screen_recycler_navbar_footer_nextbutton;
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: yf4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ChangeRepaymentDayScreen f313171b;

            {
                this.f313171b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                ChangeRepaymentDayScreen changeRepaymentDayScreen = this.f313171b;
                switch (i2) {
                    case 0:
                        ChangeRepaymentDayScreen.Companion companion = ChangeRepaymentDayScreen.INSTANCE;
                        qji.b bVarU2 = changeRepaymentDayScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.application.plugins.impl.ui.offer_v2.repayment_day.di.ChangeRepaymentDayScreenInjector");
                        q4 q4Var = (q4) bVarU2;
                        c1 c1Var = q4Var.f119568c;
                        q4 q4Var2 = q4Var.d;
                        ChangeRepaymentDayScreenContract$InputData changeRepaymentDayScreenContract$InputData = changeRepaymentDayScreen.L;
                        changeRepaymentDayScreenContract$InputData.getClass();
                        return new d0(c1Var, q4Var2, changeRepaymentDayScreen, changeRepaymentDayScreenContract$InputData);
                    case 1:
                        ChangeRepaymentDayScreen.Companion companion2 = ChangeRepaymentDayScreen.INSTANCE;
                        return (g) ((d0) changeRepaymentDayScreen.N.getValue()).f118533j.get();
                    default:
                        ChangeRepaymentDayScreen.Companion companion3 = ChangeRepaymentDayScreen.INSTANCE;
                        ChangeRepaymentDayScreen changeRepaymentDayScreen2 = this.f313171b;
                        return dli.f.a(changeRepaymentDayScreen2, changeRepaymentDayScreen2.d(), zhm.d0.E0(u.c(changeRepaymentDayScreen2.Q), ((d0) changeRepaymentDayScreen2.N.getValue()).c().Q()), R$id.screenRecyclerNavbarFooterNextbutton_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: yf4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ChangeRepaymentDayScreen f313171b;

            {
                this.f313171b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                ChangeRepaymentDayScreen changeRepaymentDayScreen = this.f313171b;
                switch (i22) {
                    case 0:
                        ChangeRepaymentDayScreen.Companion companion = ChangeRepaymentDayScreen.INSTANCE;
                        qji.b bVarU2 = changeRepaymentDayScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.application.plugins.impl.ui.offer_v2.repayment_day.di.ChangeRepaymentDayScreenInjector");
                        q4 q4Var = (q4) bVarU2;
                        c1 c1Var = q4Var.f119568c;
                        q4 q4Var2 = q4Var.d;
                        ChangeRepaymentDayScreenContract$InputData changeRepaymentDayScreenContract$InputData = changeRepaymentDayScreen.L;
                        changeRepaymentDayScreenContract$InputData.getClass();
                        return new d0(c1Var, q4Var2, changeRepaymentDayScreen, changeRepaymentDayScreenContract$InputData);
                    case 1:
                        ChangeRepaymentDayScreen.Companion companion2 = ChangeRepaymentDayScreen.INSTANCE;
                        return (g) ((d0) changeRepaymentDayScreen.N.getValue()).f118533j.get();
                    default:
                        ChangeRepaymentDayScreen.Companion companion3 = ChangeRepaymentDayScreen.INSTANCE;
                        ChangeRepaymentDayScreen changeRepaymentDayScreen2 = this.f313171b;
                        return dli.f.a(changeRepaymentDayScreen2, changeRepaymentDayScreen2.d(), zhm.d0.E0(u.c(changeRepaymentDayScreen2.Q), ((d0) changeRepaymentDayScreen2.N.getValue()).c().Q()), R$id.screenRecyclerNavbarFooterNextbutton_recyclerView, null, null, null, 56);
                }
            }
        });
        this.P = s.t(this, b.f);
        this.Q = new GridSingleChoiceDelegate();
        final int i3 = 2;
        this.R = w.y0(new Function0(this) { // from class: yf4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ChangeRepaymentDayScreen f313171b;

            {
                this.f313171b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                ChangeRepaymentDayScreen changeRepaymentDayScreen = this.f313171b;
                switch (i22) {
                    case 0:
                        ChangeRepaymentDayScreen.Companion companion = ChangeRepaymentDayScreen.INSTANCE;
                        qji.b bVarU2 = changeRepaymentDayScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.application.plugins.impl.ui.offer_v2.repayment_day.di.ChangeRepaymentDayScreenInjector");
                        q4 q4Var = (q4) bVarU2;
                        c1 c1Var = q4Var.f119568c;
                        q4 q4Var2 = q4Var.d;
                        ChangeRepaymentDayScreenContract$InputData changeRepaymentDayScreenContract$InputData = changeRepaymentDayScreen.L;
                        changeRepaymentDayScreenContract$InputData.getClass();
                        return new d0(c1Var, q4Var2, changeRepaymentDayScreen, changeRepaymentDayScreenContract$InputData);
                    case 1:
                        ChangeRepaymentDayScreen.Companion companion2 = ChangeRepaymentDayScreen.INSTANCE;
                        return (g) ((d0) changeRepaymentDayScreen.N.getValue()).f118533j.get();
                    default:
                        ChangeRepaymentDayScreen.Companion companion3 = ChangeRepaymentDayScreen.INSTANCE;
                        ChangeRepaymentDayScreen changeRepaymentDayScreen2 = this.f313171b;
                        return dli.f.a(changeRepaymentDayScreen2, changeRepaymentDayScreen2.d(), zhm.d0.E0(u.c(changeRepaymentDayScreen2.Q), ((d0) changeRepaymentDayScreen2.N.getValue()).c().Q()), R$id.screenRecyclerNavbarFooterNextbutton_recyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        yf4.h uiState = (yf4.h) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        NavBarWithToolbar screenRecyclerNavbarFooterNextbuttonToolbar = d3().e;
        Intrinsics.checkNotNullExpressionValue(screenRecyclerNavbarFooterNextbuttonToolbar, "screenRecyclerNavbarFooterNextbuttonToolbar");
        TextLocalisedClause textLocalisedClause = uiState.f313176a;
        screenRecyclerNavbarFooterNextbuttonToolbar.setTitle(textLocalisedClause, null);
        screenRecyclerNavbarFooterNextbuttonToolbar.setToolbarTitle(textLocalisedClause);
        screenRecyclerNavbarFooterNextbuttonToolbar.setSecondDescriptionText(uiState.f313177b);
        screenRecyclerNavbarFooterNextbuttonToolbar.setSecondDescriptionVisible(true);
        LargeActionButton screenRecyclerNavbarFooterNextbuttonButton = d3().f174557b;
        Intrinsics.checkNotNullExpressionValue(screenRecyclerNavbarFooterNextbuttonButton, "screenRecyclerNavbarFooterNextbuttonButton");
        screenRecyclerNavbarFooterNextbuttonButton.setText(uiState.f313178c);
        rr0.f fVar = this.S;
        if (fVar == null) {
            Intrinsics.r("largeActionButtonLoadingController");
            throw null;
        }
        fVar.b(uiState.e);
        screenRecyclerNavbarFooterNextbuttonButton.setEnabled(uiState.f);
        d3().f174558c.setContent(uiState.d);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (d0) this.N.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar screenRecyclerNavbarFooterNextbuttonToolbar = d3().e;
        Intrinsics.checkNotNullExpressionValue(screenRecyclerNavbarFooterNextbuttonToolbar, "screenRecyclerNavbarFooterNextbuttonToolbar");
        screenRecyclerNavbarFooterNextbuttonToolbar.setHeaderTitleMode(j0.MULTILINE_LARGE);
        screenRecyclerNavbarFooterNextbuttonToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_cross));
        LargeActionButton screenRecyclerNavbarFooterNextbuttonButton = d3().f174557b;
        Intrinsics.checkNotNullExpressionValue(screenRecyclerNavbarFooterNextbuttonButton, "screenRecyclerNavbarFooterNextbuttonButton");
        this.S = screenRecyclerNavbarFooterNextbuttonButton.A.V();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar screenRecyclerNavbarFooterNextbuttonToolbar = d3().e;
        Intrinsics.checkNotNullExpressionValue(screenRecyclerNavbarFooterNextbuttonToolbar, "screenRecyclerNavbarFooterNextbuttonToolbar");
        ViewController.P2(this, rd0.e.b(screenRecyclerNavbarFooterNextbuttonToolbar.f59410q), new yf4.c(this, null, 0), 3);
        NavBarWithToolbar screenRecyclerNavbarFooterNextbuttonToolbar2 = d3().e;
        Intrinsics.checkNotNullExpressionValue(screenRecyclerNavbarFooterNextbuttonToolbar2, "screenRecyclerNavbarFooterNextbuttonToolbar");
        ViewController.P2(this, rd0.e.b(screenRecyclerNavbarFooterNextbuttonToolbar2.x0()), new d(this, null, 0), 3);
        ViewController.P2(this, rd0.e.b(this.Q.f52390g.f121375b), new d(this, null, 1), 3);
        LargeActionButton screenRecyclerNavbarFooterNextbuttonButton = d3().f174557b;
        Intrinsics.checkNotNullExpressionValue(screenRecyclerNavbarFooterNextbuttonButton, "screenRecyclerNavbarFooterNextbuttonButton");
        ViewController.P2(this, rd0.e.b(screenRecyclerNavbarFooterNextbuttonButton.o), new yf4.c(this, null, 1), 3);
    }

    public final jii.s d3() {
        ViewBinding value = this.P.getValue(this, T[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.s) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // bx4.c
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final g d() {
        return (g) this.O.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getO() {
        return this.M;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.R.getValue();
    }
}
