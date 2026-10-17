package com.revolut.feature.credit.card.impl.ui.instalment.repay.choose_amount;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.CenteredAmountDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.credit.card.impl.ui.instalment.repay.choose_amount.CreditCardInstalmentRepayChooseAmountScreen;
import com.revolut.feature.credit.card.impl.ui.instalment.repay.choose_amount.CreditCardInstalmentRepayChooseAmountScreenContract$InputData;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import dli.a;
import dli.c;
import ep4.b;
import jm4.a3;
import jm4.g1;
import jm4.y1;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import ryj.f;
import sq5.j;
import ss4.m;
import ss4.n;
import ss4.p;
import te0.w;
import tx0.t3;
import vc.s;
import vkm.t0;
import w01.k;
import xki.e;
import zhm.u;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/credit/card/impl/ui/instalment/repay/choose_amount/CreditCardInstalmentRepayChooseAmountScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lss4/m;", "Ldli/a;", "Lss4/q;", "Lno/m;", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CreditCardInstalmentRepayChooseAmountScreen extends ViewController<m> implements a, no.m {
    public static final /* synthetic */ KProperty[] X = {o0.f186429a.j(new h0(CreditCardInstalmentRepayChooseAmountScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};
    public final /* synthetic */ b K;
    public final CreditCardInstalmentRepayChooseAmountScreenContract$InputData L;
    public final int M;
    public final boolean N;
    public final Object O;
    public final Object P;
    public final Object Q;
    public final Object R;
    public final Object S;
    public final Object T;
    public final h U;
    public final Object V;
    public final Object W;

    public CreditCardInstalmentRepayChooseAmountScreen(CreditCardInstalmentRepayChooseAmountScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = b.f128075a;
        this.L = inputData;
        this.M = R$layout.screen_recycler_navbar_nextbutton;
        this.N = true;
        final int i = 0;
        this.O = w.y0(new Function0(this) { // from class: ss4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CreditCardInstalmentRepayChooseAmountScreen f265265b;

            {
                this.f265265b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                CreditCardInstalmentRepayChooseAmountScreen creditCardInstalmentRepayChooseAmountScreen = this.f265265b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = CreditCardInstalmentRepayChooseAmountScreen.X;
                        qd0.b bVarN = ((g1) creditCardInstalmentRepayChooseAmountScreen.V.getValue()).f176084b.k.n();
                        vc.s.j(bVarN);
                        return new u80.d(((s80.b) bVarN).b());
                    case 1:
                        KProperty[] kPropertyArr2 = CreditCardInstalmentRepayChooseAmountScreen.X;
                        return (j60.a) ((g1) creditCardInstalmentRepayChooseAmountScreen.V.getValue()).e.get();
                    case 2:
                        KProperty[] kPropertyArr3 = CreditCardInstalmentRepayChooseAmountScreen.X;
                        return new CenteredAmountDelegate(new scl.h(creditCardInstalmentRepayChooseAmountScreen, 25));
                    case 3:
                        KProperty[] kPropertyArr4 = CreditCardInstalmentRepayChooseAmountScreen.X;
                        CreditCardInstalmentRepayChooseAmountScreen creditCardInstalmentRepayChooseAmountScreen2 = this.f265265b;
                        return dli.f.a(creditCardInstalmentRepayChooseAmountScreen2, (n) creditCardInstalmentRepayChooseAmountScreen2.W.getValue(), zhm.v.k(new RowLoadingDelegate(), (FullScreenStateDelegate) creditCardInstalmentRepayChooseAmountScreen2.P.getValue(), (CenteredAmountDelegate) creditCardInstalmentRepayChooseAmountScreen2.S.getValue()), R$id.recyclerView, null, null, null, 56);
                    case 4:
                        KProperty[] kPropertyArr5 = CreditCardInstalmentRepayChooseAmountScreen.X;
                        qji.b bVarU2 = creditCardInstalmentRepayChooseAmountScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.card.impl.ui.instalment.repay.choose_amount.di.CreditCardInstalmentRepayChooseAmountScreenInjector");
                        y1 y1Var = (y1) bVarU2;
                        a3 a3Var = y1Var.f176446b;
                        y1 y1Var2 = y1Var.f176447c;
                        CreditCardInstalmentRepayChooseAmountScreenContract$InputData creditCardInstalmentRepayChooseAmountScreenContract$InputData = creditCardInstalmentRepayChooseAmountScreen.L;
                        creditCardInstalmentRepayChooseAmountScreenContract$InputData.getClass();
                        return new g1(a3Var, y1Var2, creditCardInstalmentRepayChooseAmountScreen, creditCardInstalmentRepayChooseAmountScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr6 = CreditCardInstalmentRepayChooseAmountScreen.X;
                        return (n) ((g1) creditCardInstalmentRepayChooseAmountScreen.V.getValue()).f176087h.get();
                }
            }
        });
        this.P = w.y0(new j(7));
        this.Q = w.y0(new j(8));
        final int i2 = 1;
        this.R = w.y0(new Function0(this) { // from class: ss4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CreditCardInstalmentRepayChooseAmountScreen f265265b;

            {
                this.f265265b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                CreditCardInstalmentRepayChooseAmountScreen creditCardInstalmentRepayChooseAmountScreen = this.f265265b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CreditCardInstalmentRepayChooseAmountScreen.X;
                        qd0.b bVarN = ((g1) creditCardInstalmentRepayChooseAmountScreen.V.getValue()).f176084b.k.n();
                        vc.s.j(bVarN);
                        return new u80.d(((s80.b) bVarN).b());
                    case 1:
                        KProperty[] kPropertyArr2 = CreditCardInstalmentRepayChooseAmountScreen.X;
                        return (j60.a) ((g1) creditCardInstalmentRepayChooseAmountScreen.V.getValue()).e.get();
                    case 2:
                        KProperty[] kPropertyArr3 = CreditCardInstalmentRepayChooseAmountScreen.X;
                        return new CenteredAmountDelegate(new scl.h(creditCardInstalmentRepayChooseAmountScreen, 25));
                    case 3:
                        KProperty[] kPropertyArr4 = CreditCardInstalmentRepayChooseAmountScreen.X;
                        CreditCardInstalmentRepayChooseAmountScreen creditCardInstalmentRepayChooseAmountScreen2 = this.f265265b;
                        return dli.f.a(creditCardInstalmentRepayChooseAmountScreen2, (n) creditCardInstalmentRepayChooseAmountScreen2.W.getValue(), zhm.v.k(new RowLoadingDelegate(), (FullScreenStateDelegate) creditCardInstalmentRepayChooseAmountScreen2.P.getValue(), (CenteredAmountDelegate) creditCardInstalmentRepayChooseAmountScreen2.S.getValue()), R$id.recyclerView, null, null, null, 56);
                    case 4:
                        KProperty[] kPropertyArr5 = CreditCardInstalmentRepayChooseAmountScreen.X;
                        qji.b bVarU2 = creditCardInstalmentRepayChooseAmountScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.card.impl.ui.instalment.repay.choose_amount.di.CreditCardInstalmentRepayChooseAmountScreenInjector");
                        y1 y1Var = (y1) bVarU2;
                        a3 a3Var = y1Var.f176446b;
                        y1 y1Var2 = y1Var.f176447c;
                        CreditCardInstalmentRepayChooseAmountScreenContract$InputData creditCardInstalmentRepayChooseAmountScreenContract$InputData = creditCardInstalmentRepayChooseAmountScreen.L;
                        creditCardInstalmentRepayChooseAmountScreenContract$InputData.getClass();
                        return new g1(a3Var, y1Var2, creditCardInstalmentRepayChooseAmountScreen, creditCardInstalmentRepayChooseAmountScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr6 = CreditCardInstalmentRepayChooseAmountScreen.X;
                        return (n) ((g1) creditCardInstalmentRepayChooseAmountScreen.V.getValue()).f176087h.get();
                }
            }
        });
        final int i3 = 2;
        this.S = w.y0(new Function0(this) { // from class: ss4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CreditCardInstalmentRepayChooseAmountScreen f265265b;

            {
                this.f265265b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                CreditCardInstalmentRepayChooseAmountScreen creditCardInstalmentRepayChooseAmountScreen = this.f265265b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CreditCardInstalmentRepayChooseAmountScreen.X;
                        qd0.b bVarN = ((g1) creditCardInstalmentRepayChooseAmountScreen.V.getValue()).f176084b.k.n();
                        vc.s.j(bVarN);
                        return new u80.d(((s80.b) bVarN).b());
                    case 1:
                        KProperty[] kPropertyArr2 = CreditCardInstalmentRepayChooseAmountScreen.X;
                        return (j60.a) ((g1) creditCardInstalmentRepayChooseAmountScreen.V.getValue()).e.get();
                    case 2:
                        KProperty[] kPropertyArr3 = CreditCardInstalmentRepayChooseAmountScreen.X;
                        return new CenteredAmountDelegate(new scl.h(creditCardInstalmentRepayChooseAmountScreen, 25));
                    case 3:
                        KProperty[] kPropertyArr4 = CreditCardInstalmentRepayChooseAmountScreen.X;
                        CreditCardInstalmentRepayChooseAmountScreen creditCardInstalmentRepayChooseAmountScreen2 = this.f265265b;
                        return dli.f.a(creditCardInstalmentRepayChooseAmountScreen2, (n) creditCardInstalmentRepayChooseAmountScreen2.W.getValue(), zhm.v.k(new RowLoadingDelegate(), (FullScreenStateDelegate) creditCardInstalmentRepayChooseAmountScreen2.P.getValue(), (CenteredAmountDelegate) creditCardInstalmentRepayChooseAmountScreen2.S.getValue()), R$id.recyclerView, null, null, null, 56);
                    case 4:
                        KProperty[] kPropertyArr5 = CreditCardInstalmentRepayChooseAmountScreen.X;
                        qji.b bVarU2 = creditCardInstalmentRepayChooseAmountScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.card.impl.ui.instalment.repay.choose_amount.di.CreditCardInstalmentRepayChooseAmountScreenInjector");
                        y1 y1Var = (y1) bVarU2;
                        a3 a3Var = y1Var.f176446b;
                        y1 y1Var2 = y1Var.f176447c;
                        CreditCardInstalmentRepayChooseAmountScreenContract$InputData creditCardInstalmentRepayChooseAmountScreenContract$InputData = creditCardInstalmentRepayChooseAmountScreen.L;
                        creditCardInstalmentRepayChooseAmountScreenContract$InputData.getClass();
                        return new g1(a3Var, y1Var2, creditCardInstalmentRepayChooseAmountScreen, creditCardInstalmentRepayChooseAmountScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr6 = CreditCardInstalmentRepayChooseAmountScreen.X;
                        return (n) ((g1) creditCardInstalmentRepayChooseAmountScreen.V.getValue()).f176087h.get();
                }
            }
        });
        final int i5 = 3;
        this.T = w.y0(new Function0(this) { // from class: ss4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CreditCardInstalmentRepayChooseAmountScreen f265265b;

            {
                this.f265265b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i5;
                CreditCardInstalmentRepayChooseAmountScreen creditCardInstalmentRepayChooseAmountScreen = this.f265265b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CreditCardInstalmentRepayChooseAmountScreen.X;
                        qd0.b bVarN = ((g1) creditCardInstalmentRepayChooseAmountScreen.V.getValue()).f176084b.k.n();
                        vc.s.j(bVarN);
                        return new u80.d(((s80.b) bVarN).b());
                    case 1:
                        KProperty[] kPropertyArr2 = CreditCardInstalmentRepayChooseAmountScreen.X;
                        return (j60.a) ((g1) creditCardInstalmentRepayChooseAmountScreen.V.getValue()).e.get();
                    case 2:
                        KProperty[] kPropertyArr3 = CreditCardInstalmentRepayChooseAmountScreen.X;
                        return new CenteredAmountDelegate(new scl.h(creditCardInstalmentRepayChooseAmountScreen, 25));
                    case 3:
                        KProperty[] kPropertyArr4 = CreditCardInstalmentRepayChooseAmountScreen.X;
                        CreditCardInstalmentRepayChooseAmountScreen creditCardInstalmentRepayChooseAmountScreen2 = this.f265265b;
                        return dli.f.a(creditCardInstalmentRepayChooseAmountScreen2, (n) creditCardInstalmentRepayChooseAmountScreen2.W.getValue(), zhm.v.k(new RowLoadingDelegate(), (FullScreenStateDelegate) creditCardInstalmentRepayChooseAmountScreen2.P.getValue(), (CenteredAmountDelegate) creditCardInstalmentRepayChooseAmountScreen2.S.getValue()), R$id.recyclerView, null, null, null, 56);
                    case 4:
                        KProperty[] kPropertyArr5 = CreditCardInstalmentRepayChooseAmountScreen.X;
                        qji.b bVarU2 = creditCardInstalmentRepayChooseAmountScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.card.impl.ui.instalment.repay.choose_amount.di.CreditCardInstalmentRepayChooseAmountScreenInjector");
                        y1 y1Var = (y1) bVarU2;
                        a3 a3Var = y1Var.f176446b;
                        y1 y1Var2 = y1Var.f176447c;
                        CreditCardInstalmentRepayChooseAmountScreenContract$InputData creditCardInstalmentRepayChooseAmountScreenContract$InputData = creditCardInstalmentRepayChooseAmountScreen.L;
                        creditCardInstalmentRepayChooseAmountScreenContract$InputData.getClass();
                        return new g1(a3Var, y1Var2, creditCardInstalmentRepayChooseAmountScreen, creditCardInstalmentRepayChooseAmountScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr6 = CreditCardInstalmentRepayChooseAmountScreen.X;
                        return (n) ((g1) creditCardInstalmentRepayChooseAmountScreen.V.getValue()).f176087h.get();
                }
            }
        });
        this.U = s.t(this, ss4.b.f);
        final int i6 = 4;
        this.V = w.y0(new Function0(this) { // from class: ss4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CreditCardInstalmentRepayChooseAmountScreen f265265b;

            {
                this.f265265b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i6;
                CreditCardInstalmentRepayChooseAmountScreen creditCardInstalmentRepayChooseAmountScreen = this.f265265b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CreditCardInstalmentRepayChooseAmountScreen.X;
                        qd0.b bVarN = ((g1) creditCardInstalmentRepayChooseAmountScreen.V.getValue()).f176084b.k.n();
                        vc.s.j(bVarN);
                        return new u80.d(((s80.b) bVarN).b());
                    case 1:
                        KProperty[] kPropertyArr2 = CreditCardInstalmentRepayChooseAmountScreen.X;
                        return (j60.a) ((g1) creditCardInstalmentRepayChooseAmountScreen.V.getValue()).e.get();
                    case 2:
                        KProperty[] kPropertyArr3 = CreditCardInstalmentRepayChooseAmountScreen.X;
                        return new CenteredAmountDelegate(new scl.h(creditCardInstalmentRepayChooseAmountScreen, 25));
                    case 3:
                        KProperty[] kPropertyArr4 = CreditCardInstalmentRepayChooseAmountScreen.X;
                        CreditCardInstalmentRepayChooseAmountScreen creditCardInstalmentRepayChooseAmountScreen2 = this.f265265b;
                        return dli.f.a(creditCardInstalmentRepayChooseAmountScreen2, (n) creditCardInstalmentRepayChooseAmountScreen2.W.getValue(), zhm.v.k(new RowLoadingDelegate(), (FullScreenStateDelegate) creditCardInstalmentRepayChooseAmountScreen2.P.getValue(), (CenteredAmountDelegate) creditCardInstalmentRepayChooseAmountScreen2.S.getValue()), R$id.recyclerView, null, null, null, 56);
                    case 4:
                        KProperty[] kPropertyArr5 = CreditCardInstalmentRepayChooseAmountScreen.X;
                        qji.b bVarU2 = creditCardInstalmentRepayChooseAmountScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.card.impl.ui.instalment.repay.choose_amount.di.CreditCardInstalmentRepayChooseAmountScreenInjector");
                        y1 y1Var = (y1) bVarU2;
                        a3 a3Var = y1Var.f176446b;
                        y1 y1Var2 = y1Var.f176447c;
                        CreditCardInstalmentRepayChooseAmountScreenContract$InputData creditCardInstalmentRepayChooseAmountScreenContract$InputData = creditCardInstalmentRepayChooseAmountScreen.L;
                        creditCardInstalmentRepayChooseAmountScreenContract$InputData.getClass();
                        return new g1(a3Var, y1Var2, creditCardInstalmentRepayChooseAmountScreen, creditCardInstalmentRepayChooseAmountScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr6 = CreditCardInstalmentRepayChooseAmountScreen.X;
                        return (n) ((g1) creditCardInstalmentRepayChooseAmountScreen.V.getValue()).f176087h.get();
                }
            }
        });
        final int i21 = 5;
        this.W = w.y0(new Function0(this) { // from class: ss4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CreditCardInstalmentRepayChooseAmountScreen f265265b;

            {
                this.f265265b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i21;
                CreditCardInstalmentRepayChooseAmountScreen creditCardInstalmentRepayChooseAmountScreen = this.f265265b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CreditCardInstalmentRepayChooseAmountScreen.X;
                        qd0.b bVarN = ((g1) creditCardInstalmentRepayChooseAmountScreen.V.getValue()).f176084b.k.n();
                        vc.s.j(bVarN);
                        return new u80.d(((s80.b) bVarN).b());
                    case 1:
                        KProperty[] kPropertyArr2 = CreditCardInstalmentRepayChooseAmountScreen.X;
                        return (j60.a) ((g1) creditCardInstalmentRepayChooseAmountScreen.V.getValue()).e.get();
                    case 2:
                        KProperty[] kPropertyArr3 = CreditCardInstalmentRepayChooseAmountScreen.X;
                        return new CenteredAmountDelegate(new scl.h(creditCardInstalmentRepayChooseAmountScreen, 25));
                    case 3:
                        KProperty[] kPropertyArr4 = CreditCardInstalmentRepayChooseAmountScreen.X;
                        CreditCardInstalmentRepayChooseAmountScreen creditCardInstalmentRepayChooseAmountScreen2 = this.f265265b;
                        return dli.f.a(creditCardInstalmentRepayChooseAmountScreen2, (n) creditCardInstalmentRepayChooseAmountScreen2.W.getValue(), zhm.v.k(new RowLoadingDelegate(), (FullScreenStateDelegate) creditCardInstalmentRepayChooseAmountScreen2.P.getValue(), (CenteredAmountDelegate) creditCardInstalmentRepayChooseAmountScreen2.S.getValue()), R$id.recyclerView, null, null, null, 56);
                    case 4:
                        KProperty[] kPropertyArr5 = CreditCardInstalmentRepayChooseAmountScreen.X;
                        qji.b bVarU2 = creditCardInstalmentRepayChooseAmountScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.card.impl.ui.instalment.repay.choose_amount.di.CreditCardInstalmentRepayChooseAmountScreenInjector");
                        y1 y1Var = (y1) bVarU2;
                        a3 a3Var = y1Var.f176446b;
                        y1 y1Var2 = y1Var.f176447c;
                        CreditCardInstalmentRepayChooseAmountScreenContract$InputData creditCardInstalmentRepayChooseAmountScreenContract$InputData = creditCardInstalmentRepayChooseAmountScreen.L;
                        creditCardInstalmentRepayChooseAmountScreenContract$InputData.getClass();
                        return new g1(a3Var, y1Var2, creditCardInstalmentRepayChooseAmountScreen, creditCardInstalmentRepayChooseAmountScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr6 = CreditCardInstalmentRepayChooseAmountScreen.X;
                        return (n) ((g1) creditCardInstalmentRepayChooseAmountScreen.V.getValue()).f176087h.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        ss4.q uiState = (ss4.q) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        p pVar = uiState.f265293a;
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        TextLocalisedClause textLocalisedClause = pVar.f265290a;
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setNavigationButtonImage(pVar.f265291b);
        if (pVar.f265292c) {
            navBarWithToolbar.I0(t3.DEFAULT, false);
        } else {
            navBarWithToolbar.l0();
        }
        ss4.o oVar2 = uiState.f265295c;
        LargeActionButton largeActionButton = d3().f174564b;
        k.e(largeActionButton, oVar2.f265289c);
        largeActionButton.setEnabled(oVar2.f265288b);
        largeActionButton.setText(oVar2.f265287a);
    }

    @Override // no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getN() {
        this.K.getClass();
        return b.f128076b;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (g1) this.V.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (n) this.W.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: T2 */
    public final Boolean getG() {
        return Boolean.valueOf(this.N);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        ((j60.a) this.R.getValue()).d(u.c((LargeActionButtonDelegate) this.Q.getValue()));
        ScreenContentRecyclerView screenContentRecyclerView = d3().d;
        screenContentRecyclerView.setNestedScrollingEnabled(false);
        screenContentRecyclerView.setOverScrollMode(2);
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        Intrinsics.checkNotNullExpressionValue(navBarWithToolbar, "navBarWithToolbar");
        NavBarWithToolbar.Companion companion = NavBarWithToolbar.INSTANCE;
        navBarWithToolbar.j0(false);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v14, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        ?? r110 = this.S;
        ViewController.P2(this, new ss4.h(vkm.q.J(new ryj.w(rd0.e.b(((CenteredAmountDelegate) r110.getValue()).d.f121375b), 20), new ryj.w(rd0.e.b(d3().f174565c.f59410q), 21), new ryj.w(rd0.e.b(d3().f174564b.o), 22), rd0.e.b(((FullScreenStateDelegate) this.P.getValue()).f52371h.f121375b), new t0(new ryj.w(rd0.e.b(((CenteredAmountDelegate) r110.getValue()).f.f121375b), 23), 1), rd0.e.b(((LargeActionButtonDelegate) this.Q.getValue()).d.f121375b)), yx4.b.Companion, 0), new f(2, (n) this.W.getValue(), n.class, "onItemClick", "onItemClick(Lcom/revolut/feature/credit/core/ui/ClickWrapper;)V", 4, 9), 3);
    }

    public final jii.u d3() {
        ViewBinding value = this.U.getValue(this, X[0]);
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
        return (c) this.T.getValue();
    }
}
