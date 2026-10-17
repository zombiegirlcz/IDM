package com.revolut.feature.credit.card.impl.ui.statement.details.accrued_interest;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.credit.card.impl.ui.statement.details.accrued_interest.CreditCardAccruedInterestsScreen;
import com.revolut.feature.credit.card.impl.ui.statement.details.accrued_interest.CreditCardAccruedInterestsScreenContract$InputData;
import com.revolut.feature.credit.core.R$string;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import ep4.b;
import gu7.v1;
import gv4.c;
import gv4.d;
import gv4.g;
import gv4.i;
import jm4.a3;
import jm4.g0;
import jm4.z0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import no.m;
import te0.w;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/credit/card/impl/ui/statement/details/accrued_interest/CreditCardAccruedInterestsScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lgv4/g;", "Ldli/a;", "Lgv4/i;", "Lno/m;", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CreditCardAccruedInterestsScreen extends ViewController<g> implements dli.a, m {
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(CreditCardAccruedInterestsScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarFooterNextbuttonBinding;", 0))};
    public final /* synthetic */ b K;
    public final CreditCardAccruedInterestsScreenContract$InputData L;
    public final int M;
    public final Object N;
    public final Object O;
    public final h P;
    public final Object Q;
    public final Object R;

    public CreditCardAccruedInterestsScreen(CreditCardAccruedInterestsScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = b.f128075a;
        this.L = inputData;
        this.M = R$layout.screen_recycler_navbar_footer_nextbutton;
        this.N = w.y0(new v1(26));
        final int i = 0;
        this.O = w.y0(new Function0(this) { // from class: gv4.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CreditCardAccruedInterestsScreen f147049b;

            {
                this.f147049b = this;
            }

            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                CreditCardAccruedInterestsScreen creditCardAccruedInterestsScreen = this.f147049b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = CreditCardAccruedInterestsScreen.S;
                        CreditCardAccruedInterestsScreen creditCardAccruedInterestsScreen2 = this.f147049b;
                        return dli.f.a(creditCardAccruedInterestsScreen2, (h) creditCardAccruedInterestsScreen2.R.getValue(), v.k(new FullScreenStateDelegate(), (CellDetailsDelegate) creditCardAccruedInterestsScreen2.N.getValue(), new TextDelegate(), new RowDelegate(null, null, 7), new RowLoadingDelegate()), R$id.screenRecyclerNavbarFooterNextbutton_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = CreditCardAccruedInterestsScreen.S;
                        qji.b bVarU2 = creditCardAccruedInterestsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.card.impl.ui.statement.details.accrued_interest.di.CreditCardAccruedInterestsScreenInjector");
                        z0 z0Var = (z0) bVarU2;
                        a3 a3Var = z0Var.f176463b;
                        z0 z0Var2 = z0Var.f176464c;
                        CreditCardAccruedInterestsScreenContract$InputData creditCardAccruedInterestsScreenContract$InputData = creditCardAccruedInterestsScreen.L;
                        creditCardAccruedInterestsScreenContract$InputData.getClass();
                        return new g0(a3Var, z0Var2, creditCardAccruedInterestsScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = CreditCardAccruedInterestsScreen.S;
                        return (h) ((g0) creditCardAccruedInterestsScreen.Q.getValue()).f176082b.get();
                }
            }
        });
        this.P = s.t(this, c.f);
        final int i2 = 1;
        this.Q = w.y0(new Function0(this) { // from class: gv4.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CreditCardAccruedInterestsScreen f147049b;

            {
                this.f147049b = this;
            }

            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                CreditCardAccruedInterestsScreen creditCardAccruedInterestsScreen = this.f147049b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CreditCardAccruedInterestsScreen.S;
                        CreditCardAccruedInterestsScreen creditCardAccruedInterestsScreen2 = this.f147049b;
                        return dli.f.a(creditCardAccruedInterestsScreen2, (h) creditCardAccruedInterestsScreen2.R.getValue(), v.k(new FullScreenStateDelegate(), (CellDetailsDelegate) creditCardAccruedInterestsScreen2.N.getValue(), new TextDelegate(), new RowDelegate(null, null, 7), new RowLoadingDelegate()), R$id.screenRecyclerNavbarFooterNextbutton_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = CreditCardAccruedInterestsScreen.S;
                        qji.b bVarU2 = creditCardAccruedInterestsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.card.impl.ui.statement.details.accrued_interest.di.CreditCardAccruedInterestsScreenInjector");
                        z0 z0Var = (z0) bVarU2;
                        a3 a3Var = z0Var.f176463b;
                        z0 z0Var2 = z0Var.f176464c;
                        CreditCardAccruedInterestsScreenContract$InputData creditCardAccruedInterestsScreenContract$InputData = creditCardAccruedInterestsScreen.L;
                        creditCardAccruedInterestsScreenContract$InputData.getClass();
                        return new g0(a3Var, z0Var2, creditCardAccruedInterestsScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = CreditCardAccruedInterestsScreen.S;
                        return (h) ((g0) creditCardAccruedInterestsScreen.Q.getValue()).f176082b.get();
                }
            }
        });
        final int i3 = 2;
        this.R = w.y0(new Function0(this) { // from class: gv4.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CreditCardAccruedInterestsScreen f147049b;

            {
                this.f147049b = this;
            }

            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                CreditCardAccruedInterestsScreen creditCardAccruedInterestsScreen = this.f147049b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CreditCardAccruedInterestsScreen.S;
                        CreditCardAccruedInterestsScreen creditCardAccruedInterestsScreen2 = this.f147049b;
                        return dli.f.a(creditCardAccruedInterestsScreen2, (h) creditCardAccruedInterestsScreen2.R.getValue(), v.k(new FullScreenStateDelegate(), (CellDetailsDelegate) creditCardAccruedInterestsScreen2.N.getValue(), new TextDelegate(), new RowDelegate(null, null, 7), new RowLoadingDelegate()), R$id.screenRecyclerNavbarFooterNextbutton_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = CreditCardAccruedInterestsScreen.S;
                        qji.b bVarU2 = creditCardAccruedInterestsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.card.impl.ui.statement.details.accrued_interest.di.CreditCardAccruedInterestsScreenInjector");
                        z0 z0Var = (z0) bVarU2;
                        a3 a3Var = z0Var.f176463b;
                        z0 z0Var2 = z0Var.f176464c;
                        CreditCardAccruedInterestsScreenContract$InputData creditCardAccruedInterestsScreenContract$InputData = creditCardAccruedInterestsScreen.L;
                        creditCardAccruedInterestsScreenContract$InputData.getClass();
                        return new g0(a3Var, z0Var2, creditCardAccruedInterestsScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = CreditCardAccruedInterestsScreen.S;
                        return (h) ((g0) creditCardAccruedInterestsScreen.Q.getValue()).f176082b.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        i uiState = (i) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        NavBarWithToolbar navBarWithToolbar = d3().e;
        TextLocalisedClause textLocalisedClause = uiState.f147053a;
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setSecondDescriptionText(uiState.f147054b);
    }

    @Override // no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getQ() {
        this.K.getClass();
        return b.f128076b;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (g0) this.Q.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (gv4.h) this.R.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().e;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        navBarWithToolbar.setSecondDescriptionVisible(true);
        d3().f174557b.setText(new TextLocalisedClause(R$string.credit_card_statement_accrued_interests_button_pay, null, null, 14));
    }

    /* JADX WARN: Type inference failed for: r5v9, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(d3().e.f59410q), new d(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174557b.o), null, new d(this, null, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((CellDetailsDelegate) this.N.getValue()).f), null, new gv4.e(this, null), 3);
    }

    public final jii.s d3() {
        ViewBinding value = this.P.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.s) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getU() {
        return this.M;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.O.getValue();
    }
}
