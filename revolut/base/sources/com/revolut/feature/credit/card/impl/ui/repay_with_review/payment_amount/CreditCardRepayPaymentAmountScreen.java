package com.revolut.feature.credit.card.impl.ui.repay_with_review.payment_amount;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import bx4.c;
import cli.o;
import cli.q;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.CenteredAmountDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.BasicNavBar;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.feature.credit.card.impl.ui.repay_with_review.payment_amount.CreditCardRepayPaymentAmountScreen;
import com.revolut.feature.credit.card.impl.ui.repay_with_review.payment_amount.CreditCardRepayPaymentAmountScreenContract$InputData;
import com.revolut.feature.credit.core.R$string;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import ep4.b;
import java.util.List;
import jii.i;
import jm4.a3;
import jm4.b2;
import jm4.e2;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import no.m;
import qu4.e;
import qu4.f;
import qu4.g;
import qu4.l;
import qu4.n;
import te0.w;
import vc.s;
import vkm.z1;
import zhm.d0;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u00052\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/credit/card/impl/ui/repay_with_review/payment_amount/CreditCardRepayPaymentAmountScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lqu4/l;", "Ldli/a;", "Lqu4/n;", "Lbx4/c;", "Lno/m;", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CreditCardRepayPaymentAmountScreen extends ViewController<l> implements a, c, m {
    public static final /* synthetic */ KProperty[] W = {o0.f186429a.j(new h0(CreditCardRepayPaymentAmountScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerBasicNavbarActionFooterBinding;", 0))};
    public final /* synthetic */ b K;
    public final CreditCardRepayPaymentAmountScreenContract$InputData L;
    public final Object M;
    public final h N;
    public final int O;
    public final Object P;
    public final Object Q;
    public final z1 R;
    public final Object S;
    public final FullScreenStateDelegate T;
    public final Object U;
    public final Object V;

    public CreditCardRepayPaymentAmountScreen(CreditCardRepayPaymentAmountScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = b.f128075a;
        this.L = inputData;
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: qu4.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CreditCardRepayPaymentAmountScreen f249221b;

            {
                this.f249221b = this;
            }

            /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                CreditCardRepayPaymentAmountScreen creditCardRepayPaymentAmountScreen = this.f249221b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = CreditCardRepayPaymentAmountScreen.W;
                        qji.b bVarU2 = creditCardRepayPaymentAmountScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.card.impl.ui.repay_with_review.payment_amount.di.CreditCardRepayPaymentAmountScreenInjector");
                        e2 e2Var = (e2) bVarU2;
                        a3 a3Var = e2Var.f176055b;
                        e2 e2Var2 = e2Var.f176056c;
                        CreditCardRepayPaymentAmountScreenContract$InputData creditCardRepayPaymentAmountScreenContract$InputData = creditCardRepayPaymentAmountScreen.L;
                        creditCardRepayPaymentAmountScreenContract$InputData.getClass();
                        return new b2(a3Var, e2Var2, creditCardRepayPaymentAmountScreen, creditCardRepayPaymentAmountScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = CreditCardRepayPaymentAmountScreen.W;
                        return (m) ((b2) creditCardRepayPaymentAmountScreen.M.getValue()).i.get();
                    case 2:
                        KProperty[] kPropertyArr3 = CreditCardRepayPaymentAmountScreen.W;
                        qd0.b bVarN = ((b2) creditCardRepayPaymentAmountScreen.M.getValue()).f176001b.k.n();
                        vc.s.j(bVarN);
                        return new u80.d(((s80.b) bVarN).b());
                    case 3:
                        KProperty[] kPropertyArr4 = CreditCardRepayPaymentAmountScreen.W;
                        return new qm2.c(creditCardRepayPaymentAmountScreen, 10);
                    case 4:
                        return new CenteredAmountDelegate((Function2) creditCardRepayPaymentAmountScreen.S.getValue());
                    default:
                        KProperty[] kPropertyArr5 = CreditCardRepayPaymentAmountScreen.W;
                        CreditCardRepayPaymentAmountScreen creditCardRepayPaymentAmountScreen2 = this.f249221b;
                        return dli.f.a(creditCardRepayPaymentAmountScreen2, creditCardRepayPaymentAmountScreen2.R2(), d0.E0(zhm.v.k((CenteredAmountDelegate) creditCardRepayPaymentAmountScreen2.U.getValue(), creditCardRepayPaymentAmountScreen2.T), ((b2) creditCardRepayPaymentAmountScreen2.M.getValue()).c().Q()), creditCardRepayPaymentAmountScreen2.d3().d.getId(), null, null, null, 56);
                }
            }
        });
        this.N = s.t(this, e.f);
        this.O = R$layout.screen_recycler_basic_navbar_action_footer;
        final int i2 = 1;
        this.P = w.y0(new Function0(this) { // from class: qu4.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CreditCardRepayPaymentAmountScreen f249221b;

            {
                this.f249221b = this;
            }

            /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                CreditCardRepayPaymentAmountScreen creditCardRepayPaymentAmountScreen = this.f249221b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CreditCardRepayPaymentAmountScreen.W;
                        qji.b bVarU2 = creditCardRepayPaymentAmountScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.card.impl.ui.repay_with_review.payment_amount.di.CreditCardRepayPaymentAmountScreenInjector");
                        e2 e2Var = (e2) bVarU2;
                        a3 a3Var = e2Var.f176055b;
                        e2 e2Var2 = e2Var.f176056c;
                        CreditCardRepayPaymentAmountScreenContract$InputData creditCardRepayPaymentAmountScreenContract$InputData = creditCardRepayPaymentAmountScreen.L;
                        creditCardRepayPaymentAmountScreenContract$InputData.getClass();
                        return new b2(a3Var, e2Var2, creditCardRepayPaymentAmountScreen, creditCardRepayPaymentAmountScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = CreditCardRepayPaymentAmountScreen.W;
                        return (m) ((b2) creditCardRepayPaymentAmountScreen.M.getValue()).i.get();
                    case 2:
                        KProperty[] kPropertyArr3 = CreditCardRepayPaymentAmountScreen.W;
                        qd0.b bVarN = ((b2) creditCardRepayPaymentAmountScreen.M.getValue()).f176001b.k.n();
                        vc.s.j(bVarN);
                        return new u80.d(((s80.b) bVarN).b());
                    case 3:
                        KProperty[] kPropertyArr4 = CreditCardRepayPaymentAmountScreen.W;
                        return new qm2.c(creditCardRepayPaymentAmountScreen, 10);
                    case 4:
                        return new CenteredAmountDelegate((Function2) creditCardRepayPaymentAmountScreen.S.getValue());
                    default:
                        KProperty[] kPropertyArr5 = CreditCardRepayPaymentAmountScreen.W;
                        CreditCardRepayPaymentAmountScreen creditCardRepayPaymentAmountScreen2 = this.f249221b;
                        return dli.f.a(creditCardRepayPaymentAmountScreen2, creditCardRepayPaymentAmountScreen2.R2(), d0.E0(zhm.v.k((CenteredAmountDelegate) creditCardRepayPaymentAmountScreen2.U.getValue(), creditCardRepayPaymentAmountScreen2.T), ((b2) creditCardRepayPaymentAmountScreen2.M.getValue()).c().Q()), creditCardRepayPaymentAmountScreen2.d3().d.getId(), null, null, null, 56);
                }
            }
        });
        final int i3 = 2;
        this.Q = w.y0(new Function0(this) { // from class: qu4.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CreditCardRepayPaymentAmountScreen f249221b;

            {
                this.f249221b = this;
            }

            /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                CreditCardRepayPaymentAmountScreen creditCardRepayPaymentAmountScreen = this.f249221b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CreditCardRepayPaymentAmountScreen.W;
                        qji.b bVarU2 = creditCardRepayPaymentAmountScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.card.impl.ui.repay_with_review.payment_amount.di.CreditCardRepayPaymentAmountScreenInjector");
                        e2 e2Var = (e2) bVarU2;
                        a3 a3Var = e2Var.f176055b;
                        e2 e2Var2 = e2Var.f176056c;
                        CreditCardRepayPaymentAmountScreenContract$InputData creditCardRepayPaymentAmountScreenContract$InputData = creditCardRepayPaymentAmountScreen.L;
                        creditCardRepayPaymentAmountScreenContract$InputData.getClass();
                        return new b2(a3Var, e2Var2, creditCardRepayPaymentAmountScreen, creditCardRepayPaymentAmountScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = CreditCardRepayPaymentAmountScreen.W;
                        return (m) ((b2) creditCardRepayPaymentAmountScreen.M.getValue()).i.get();
                    case 2:
                        KProperty[] kPropertyArr3 = CreditCardRepayPaymentAmountScreen.W;
                        qd0.b bVarN = ((b2) creditCardRepayPaymentAmountScreen.M.getValue()).f176001b.k.n();
                        vc.s.j(bVarN);
                        return new u80.d(((s80.b) bVarN).b());
                    case 3:
                        KProperty[] kPropertyArr4 = CreditCardRepayPaymentAmountScreen.W;
                        return new qm2.c(creditCardRepayPaymentAmountScreen, 10);
                    case 4:
                        return new CenteredAmountDelegate((Function2) creditCardRepayPaymentAmountScreen.S.getValue());
                    default:
                        KProperty[] kPropertyArr5 = CreditCardRepayPaymentAmountScreen.W;
                        CreditCardRepayPaymentAmountScreen creditCardRepayPaymentAmountScreen2 = this.f249221b;
                        return dli.f.a(creditCardRepayPaymentAmountScreen2, creditCardRepayPaymentAmountScreen2.R2(), d0.E0(zhm.v.k((CenteredAmountDelegate) creditCardRepayPaymentAmountScreen2.U.getValue(), creditCardRepayPaymentAmountScreen2.T), ((b2) creditCardRepayPaymentAmountScreen2.M.getValue()).c().Q()), creditCardRepayPaymentAmountScreen2.d3().d.getId(), null, null, null, 56);
                }
            }
        });
        this.R = ta6.a.a(0);
        final int i5 = 3;
        this.S = w.y0(new Function0(this) { // from class: qu4.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CreditCardRepayPaymentAmountScreen f249221b;

            {
                this.f249221b = this;
            }

            /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i5;
                CreditCardRepayPaymentAmountScreen creditCardRepayPaymentAmountScreen = this.f249221b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CreditCardRepayPaymentAmountScreen.W;
                        qji.b bVarU2 = creditCardRepayPaymentAmountScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.card.impl.ui.repay_with_review.payment_amount.di.CreditCardRepayPaymentAmountScreenInjector");
                        e2 e2Var = (e2) bVarU2;
                        a3 a3Var = e2Var.f176055b;
                        e2 e2Var2 = e2Var.f176056c;
                        CreditCardRepayPaymentAmountScreenContract$InputData creditCardRepayPaymentAmountScreenContract$InputData = creditCardRepayPaymentAmountScreen.L;
                        creditCardRepayPaymentAmountScreenContract$InputData.getClass();
                        return new b2(a3Var, e2Var2, creditCardRepayPaymentAmountScreen, creditCardRepayPaymentAmountScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = CreditCardRepayPaymentAmountScreen.W;
                        return (m) ((b2) creditCardRepayPaymentAmountScreen.M.getValue()).i.get();
                    case 2:
                        KProperty[] kPropertyArr3 = CreditCardRepayPaymentAmountScreen.W;
                        qd0.b bVarN = ((b2) creditCardRepayPaymentAmountScreen.M.getValue()).f176001b.k.n();
                        vc.s.j(bVarN);
                        return new u80.d(((s80.b) bVarN).b());
                    case 3:
                        KProperty[] kPropertyArr4 = CreditCardRepayPaymentAmountScreen.W;
                        return new qm2.c(creditCardRepayPaymentAmountScreen, 10);
                    case 4:
                        return new CenteredAmountDelegate((Function2) creditCardRepayPaymentAmountScreen.S.getValue());
                    default:
                        KProperty[] kPropertyArr5 = CreditCardRepayPaymentAmountScreen.W;
                        CreditCardRepayPaymentAmountScreen creditCardRepayPaymentAmountScreen2 = this.f249221b;
                        return dli.f.a(creditCardRepayPaymentAmountScreen2, creditCardRepayPaymentAmountScreen2.R2(), d0.E0(zhm.v.k((CenteredAmountDelegate) creditCardRepayPaymentAmountScreen2.U.getValue(), creditCardRepayPaymentAmountScreen2.T), ((b2) creditCardRepayPaymentAmountScreen2.M.getValue()).c().Q()), creditCardRepayPaymentAmountScreen2.d3().d.getId(), null, null, null, 56);
                }
            }
        });
        this.T = new FullScreenStateDelegate();
        final int i6 = 4;
        this.U = w.y0(new Function0(this) { // from class: qu4.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CreditCardRepayPaymentAmountScreen f249221b;

            {
                this.f249221b = this;
            }

            /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i6;
                CreditCardRepayPaymentAmountScreen creditCardRepayPaymentAmountScreen = this.f249221b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CreditCardRepayPaymentAmountScreen.W;
                        qji.b bVarU2 = creditCardRepayPaymentAmountScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.card.impl.ui.repay_with_review.payment_amount.di.CreditCardRepayPaymentAmountScreenInjector");
                        e2 e2Var = (e2) bVarU2;
                        a3 a3Var = e2Var.f176055b;
                        e2 e2Var2 = e2Var.f176056c;
                        CreditCardRepayPaymentAmountScreenContract$InputData creditCardRepayPaymentAmountScreenContract$InputData = creditCardRepayPaymentAmountScreen.L;
                        creditCardRepayPaymentAmountScreenContract$InputData.getClass();
                        return new b2(a3Var, e2Var2, creditCardRepayPaymentAmountScreen, creditCardRepayPaymentAmountScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = CreditCardRepayPaymentAmountScreen.W;
                        return (m) ((b2) creditCardRepayPaymentAmountScreen.M.getValue()).i.get();
                    case 2:
                        KProperty[] kPropertyArr3 = CreditCardRepayPaymentAmountScreen.W;
                        qd0.b bVarN = ((b2) creditCardRepayPaymentAmountScreen.M.getValue()).f176001b.k.n();
                        vc.s.j(bVarN);
                        return new u80.d(((s80.b) bVarN).b());
                    case 3:
                        KProperty[] kPropertyArr4 = CreditCardRepayPaymentAmountScreen.W;
                        return new qm2.c(creditCardRepayPaymentAmountScreen, 10);
                    case 4:
                        return new CenteredAmountDelegate((Function2) creditCardRepayPaymentAmountScreen.S.getValue());
                    default:
                        KProperty[] kPropertyArr5 = CreditCardRepayPaymentAmountScreen.W;
                        CreditCardRepayPaymentAmountScreen creditCardRepayPaymentAmountScreen2 = this.f249221b;
                        return dli.f.a(creditCardRepayPaymentAmountScreen2, creditCardRepayPaymentAmountScreen2.R2(), d0.E0(zhm.v.k((CenteredAmountDelegate) creditCardRepayPaymentAmountScreen2.U.getValue(), creditCardRepayPaymentAmountScreen2.T), ((b2) creditCardRepayPaymentAmountScreen2.M.getValue()).c().Q()), creditCardRepayPaymentAmountScreen2.d3().d.getId(), null, null, null, 56);
                }
            }
        });
        final int i21 = 5;
        this.V = w.y0(new Function0(this) { // from class: qu4.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CreditCardRepayPaymentAmountScreen f249221b;

            {
                this.f249221b = this;
            }

            /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i21;
                CreditCardRepayPaymentAmountScreen creditCardRepayPaymentAmountScreen = this.f249221b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CreditCardRepayPaymentAmountScreen.W;
                        qji.b bVarU2 = creditCardRepayPaymentAmountScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.card.impl.ui.repay_with_review.payment_amount.di.CreditCardRepayPaymentAmountScreenInjector");
                        e2 e2Var = (e2) bVarU2;
                        a3 a3Var = e2Var.f176055b;
                        e2 e2Var2 = e2Var.f176056c;
                        CreditCardRepayPaymentAmountScreenContract$InputData creditCardRepayPaymentAmountScreenContract$InputData = creditCardRepayPaymentAmountScreen.L;
                        creditCardRepayPaymentAmountScreenContract$InputData.getClass();
                        return new b2(a3Var, e2Var2, creditCardRepayPaymentAmountScreen, creditCardRepayPaymentAmountScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = CreditCardRepayPaymentAmountScreen.W;
                        return (m) ((b2) creditCardRepayPaymentAmountScreen.M.getValue()).i.get();
                    case 2:
                        KProperty[] kPropertyArr3 = CreditCardRepayPaymentAmountScreen.W;
                        qd0.b bVarN = ((b2) creditCardRepayPaymentAmountScreen.M.getValue()).f176001b.k.n();
                        vc.s.j(bVarN);
                        return new u80.d(((s80.b) bVarN).b());
                    case 3:
                        KProperty[] kPropertyArr4 = CreditCardRepayPaymentAmountScreen.W;
                        return new qm2.c(creditCardRepayPaymentAmountScreen, 10);
                    case 4:
                        return new CenteredAmountDelegate((Function2) creditCardRepayPaymentAmountScreen.S.getValue());
                    default:
                        KProperty[] kPropertyArr5 = CreditCardRepayPaymentAmountScreen.W;
                        CreditCardRepayPaymentAmountScreen creditCardRepayPaymentAmountScreen2 = this.f249221b;
                        return dli.f.a(creditCardRepayPaymentAmountScreen2, creditCardRepayPaymentAmountScreen2.R2(), d0.E0(zhm.v.k((CenteredAmountDelegate) creditCardRepayPaymentAmountScreen2.U.getValue(), creditCardRepayPaymentAmountScreen2.T), ((b2) creditCardRepayPaymentAmountScreen2.M.getValue()).c().Q()), creditCardRepayPaymentAmountScreen2.d3().d.getId(), null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        n uiState = (n) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        d3().f174527b.setModel(uiState.f249232b);
    }

    @Override // no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getC0() {
        this.K.getClass();
        return b.f128076b;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (b2) this.M.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        BasicNavBar basicNavBar = d3().f174528c;
        basicNavBar.setTitle(new TextLocalisedClause(R$string.credit_card_repay_payment_amount_header_title, null, null, 14));
        basicNavBar.setTitleCentered(true);
        basicNavBar.setNavigationButtonImage(new ResourceImage(ofm.q.k(q2()), (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(d3().f174527b.f), new f(this, null, 0), 3);
        ViewController.P2(this, rd0.e.b(d3().f174527b.f58955g), new g(this, null, 0), 3);
        ViewController.P2(this, rd0.e.b(d3().f174527b.e), new f(this, null, 1), 3);
        ViewController.P2(this, rd0.e.b(d3().f174528c.f59211b), new g(this, null, 1), 3);
        ViewController.P2(this, this.R, new k50.b2(2, R2(), qu4.m.class, "onAmountChanged", "onAmountChanged(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 27), 3);
        ViewController.P2(this, rd0.e.b(this.T.f52371h.f121375b), new qu4.h(this, null), 3);
    }

    public final i d3() {
        ViewBinding value = this.N.getValue(this, W[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (i) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // bx4.c
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final qu4.m d() {
        return (qu4.m) this.P.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getZ() {
        return this.O;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.V.getValue();
    }
}
