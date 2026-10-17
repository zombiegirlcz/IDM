package com.revolut.feature.credit.card.impl.ui.credit_limit_decrease.amount;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.CenteredAmountDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.credit.card.impl.ui.credit_limit_decrease.amount.CreditCardLimitDecreaseAmountScreen;
import com.revolut.feature.credit.core.R$string;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import dli.a;
import ep4.b;
import jm4.t3;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import no.m;
import te0.w;
import tq4.c;
import tq4.e;
import tq4.f;
import tq4.g;
import vc.s;
import zhm.u;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/credit/card/impl/ui/credit_limit_decrease/amount/CreditCardLimitDecreaseAmountScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Ltq4/e;", "Ldli/a;", "Ltq4/f;", "Lno/m;", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CreditCardLimitDecreaseAmountScreen extends ViewController<e> implements a, m {
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(CreditCardLimitDecreaseAmountScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};
    public final /* synthetic */ b K;
    public final int L;
    public final Object M;
    public final Object N;
    public final Object O;
    public final h P;
    public final Object Q;
    public final Object R;

    public CreditCardLimitDecreaseAmountScreen(CreditCardLimitDecreaseAmountScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = b.f128075a;
        this.L = R$layout.screen_recycler_navbar_nextbutton;
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: tq4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CreditCardLimitDecreaseAmountScreen f273519b;

            {
                this.f273519b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                qd0.b bVarN;
                int i2 = i;
                CreditCardLimitDecreaseAmountScreen creditCardLimitDecreaseAmountScreen = this.f273519b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = CreditCardLimitDecreaseAmountScreen.S;
                        t3 t3Var = (t3) creditCardLimitDecreaseAmountScreen.Q.getValue();
                        switch (t3Var.f176368a) {
                            case 0:
                                bVarN = t3Var.f176370c.k.n();
                                s.j(bVarN);
                                break;
                            default:
                                bVarN = t3Var.f176370c.k.n();
                                s.j(bVarN);
                                break;
                        }
                        return new u80.d(((s80.b) bVarN).b());
                    case 1:
                        KProperty[] kPropertyArr2 = CreditCardLimitDecreaseAmountScreen.S;
                        return new CenteredAmountDelegate(new tp8.l(creditCardLimitDecreaseAmountScreen, 4));
                    case 2:
                        KProperty[] kPropertyArr3 = CreditCardLimitDecreaseAmountScreen.S;
                        CreditCardLimitDecreaseAmountScreen creditCardLimitDecreaseAmountScreen2 = this.f273519b;
                        return dli.f.a(creditCardLimitDecreaseAmountScreen2, (g) creditCardLimitDecreaseAmountScreen2.R.getValue(), u.c((CenteredAmountDelegate) creditCardLimitDecreaseAmountScreen2.N.getValue()), R$id.recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr4 = CreditCardLimitDecreaseAmountScreen.S;
                        t3 t3Var2 = (t3) creditCardLimitDecreaseAmountScreen.Q.getValue();
                        switch (t3Var2.f176368a) {
                            case 0:
                                return (g) t3Var2.e.get();
                            default:
                                return (g) t3Var2.e.get();
                        }
                }
            }
        });
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: tq4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CreditCardLimitDecreaseAmountScreen f273519b;

            {
                this.f273519b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                qd0.b bVarN;
                int i22 = i2;
                CreditCardLimitDecreaseAmountScreen creditCardLimitDecreaseAmountScreen = this.f273519b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CreditCardLimitDecreaseAmountScreen.S;
                        t3 t3Var = (t3) creditCardLimitDecreaseAmountScreen.Q.getValue();
                        switch (t3Var.f176368a) {
                            case 0:
                                bVarN = t3Var.f176370c.k.n();
                                s.j(bVarN);
                                break;
                            default:
                                bVarN = t3Var.f176370c.k.n();
                                s.j(bVarN);
                                break;
                        }
                        return new u80.d(((s80.b) bVarN).b());
                    case 1:
                        KProperty[] kPropertyArr2 = CreditCardLimitDecreaseAmountScreen.S;
                        return new CenteredAmountDelegate(new tp8.l(creditCardLimitDecreaseAmountScreen, 4));
                    case 2:
                        KProperty[] kPropertyArr3 = CreditCardLimitDecreaseAmountScreen.S;
                        CreditCardLimitDecreaseAmountScreen creditCardLimitDecreaseAmountScreen2 = this.f273519b;
                        return dli.f.a(creditCardLimitDecreaseAmountScreen2, (g) creditCardLimitDecreaseAmountScreen2.R.getValue(), u.c((CenteredAmountDelegate) creditCardLimitDecreaseAmountScreen2.N.getValue()), R$id.recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr4 = CreditCardLimitDecreaseAmountScreen.S;
                        t3 t3Var2 = (t3) creditCardLimitDecreaseAmountScreen.Q.getValue();
                        switch (t3Var2.f176368a) {
                            case 0:
                                return (g) t3Var2.e.get();
                            default:
                                return (g) t3Var2.e.get();
                        }
                }
            }
        });
        final int i3 = 2;
        this.O = w.y0(new Function0(this) { // from class: tq4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CreditCardLimitDecreaseAmountScreen f273519b;

            {
                this.f273519b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                qd0.b bVarN;
                int i22 = i3;
                CreditCardLimitDecreaseAmountScreen creditCardLimitDecreaseAmountScreen = this.f273519b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CreditCardLimitDecreaseAmountScreen.S;
                        t3 t3Var = (t3) creditCardLimitDecreaseAmountScreen.Q.getValue();
                        switch (t3Var.f176368a) {
                            case 0:
                                bVarN = t3Var.f176370c.k.n();
                                s.j(bVarN);
                                break;
                            default:
                                bVarN = t3Var.f176370c.k.n();
                                s.j(bVarN);
                                break;
                        }
                        return new u80.d(((s80.b) bVarN).b());
                    case 1:
                        KProperty[] kPropertyArr2 = CreditCardLimitDecreaseAmountScreen.S;
                        return new CenteredAmountDelegate(new tp8.l(creditCardLimitDecreaseAmountScreen, 4));
                    case 2:
                        KProperty[] kPropertyArr3 = CreditCardLimitDecreaseAmountScreen.S;
                        CreditCardLimitDecreaseAmountScreen creditCardLimitDecreaseAmountScreen2 = this.f273519b;
                        return dli.f.a(creditCardLimitDecreaseAmountScreen2, (g) creditCardLimitDecreaseAmountScreen2.R.getValue(), u.c((CenteredAmountDelegate) creditCardLimitDecreaseAmountScreen2.N.getValue()), R$id.recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr4 = CreditCardLimitDecreaseAmountScreen.S;
                        t3 t3Var2 = (t3) creditCardLimitDecreaseAmountScreen.Q.getValue();
                        switch (t3Var2.f176368a) {
                            case 0:
                                return (g) t3Var2.e.get();
                            default:
                                return (g) t3Var2.e.get();
                        }
                }
            }
        });
        this.P = s.t(this, tq4.b.f);
        this.Q = w.y0(new tml.a(this, inputData, 5));
        final int i5 = 3;
        this.R = w.y0(new Function0(this) { // from class: tq4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CreditCardLimitDecreaseAmountScreen f273519b;

            {
                this.f273519b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                qd0.b bVarN;
                int i22 = i5;
                CreditCardLimitDecreaseAmountScreen creditCardLimitDecreaseAmountScreen = this.f273519b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CreditCardLimitDecreaseAmountScreen.S;
                        t3 t3Var = (t3) creditCardLimitDecreaseAmountScreen.Q.getValue();
                        switch (t3Var.f176368a) {
                            case 0:
                                bVarN = t3Var.f176370c.k.n();
                                s.j(bVarN);
                                break;
                            default:
                                bVarN = t3Var.f176370c.k.n();
                                s.j(bVarN);
                                break;
                        }
                        return new u80.d(((s80.b) bVarN).b());
                    case 1:
                        KProperty[] kPropertyArr2 = CreditCardLimitDecreaseAmountScreen.S;
                        return new CenteredAmountDelegate(new tp8.l(creditCardLimitDecreaseAmountScreen, 4));
                    case 2:
                        KProperty[] kPropertyArr3 = CreditCardLimitDecreaseAmountScreen.S;
                        CreditCardLimitDecreaseAmountScreen creditCardLimitDecreaseAmountScreen2 = this.f273519b;
                        return dli.f.a(creditCardLimitDecreaseAmountScreen2, (g) creditCardLimitDecreaseAmountScreen2.R.getValue(), u.c((CenteredAmountDelegate) creditCardLimitDecreaseAmountScreen2.N.getValue()), R$id.recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr4 = CreditCardLimitDecreaseAmountScreen.S;
                        t3 t3Var2 = (t3) creditCardLimitDecreaseAmountScreen.Q.getValue();
                        switch (t3Var2.f176368a) {
                            case 0:
                                return (g) t3Var2.e.get();
                            default:
                                return (g) t3Var2.e.get();
                        }
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        f uiState = (f) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        d3().f174564b.setEnabled(uiState.f273525b);
    }

    @Override // no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getP() {
        this.K.getClass();
        return b.f128076b;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (t3) this.Q.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (g) this.R.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ScreenContentRecyclerView screenContentRecyclerView = d3().d;
        screenContentRecyclerView.setNestedScrollingEnabled(false);
        screenContentRecyclerView.setOverScrollMode(2);
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.credit_card_limit_decrease_change_limit_title, null, null, 14));
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.credit_card_limit_decrease_change_limit_title, null, null, 14), null);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        navBarWithToolbar.j0(false);
        d3().f174564b.setText(new TextLocalisedClause(R$string.credit_card_limit_decrease_change_limit_action, null, null, 14));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(d3().f174565c.f59410q), new c(this, null, 0), 3);
        ViewController.P2(this, rd0.e.b(d3().f174564b.o), new c(this, null, 1), 3);
    }

    public final jii.u d3() {
        ViewBinding value = this.P.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.u) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.O.getValue();
    }
}
