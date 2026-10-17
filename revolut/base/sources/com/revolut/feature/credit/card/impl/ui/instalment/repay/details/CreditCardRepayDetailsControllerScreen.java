package com.revolut.feature.credit.card.impl.ui.instalment.repay.details;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CounterTextDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.ProgressStepVerticalDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.credit.card.impl.ui.instalment.repay.details.CreditCardRepayDetailsControllerScreen;
import com.revolut.feature.credit.card.impl.ui.instalment.repay.details.CreditCardRepayDetailsControllerScreenContract$InputData;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import jii.u;
import jm4.j4;
import jm4.k4;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import no.m;
import rr0.f;
import te0.w;
import tx0.t3;
import vc.s;
import woc.p;
import xki.e;
import xo8.a0;
import xs4.g;
import xs4.i;
import xs4.j;
import xs4.k;
import zhm.v;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/credit/card/impl/ui/instalment/repay/details/CreditCardRepayDetailsControllerScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lxs4/g;", "Ldli/a;", "Lxs4/k;", "Lno/m;", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CreditCardRepayDetailsControllerScreen extends ViewController<g> implements dli.a, m {
    public static final /* synthetic */ KProperty[] X = {o0.f186429a.j(new h0(CreditCardRepayDetailsControllerScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};
    public final /* synthetic */ ep4.b K;
    public final CreditCardRepayDetailsControllerScreenContract$InputData L;
    public final int M;
    public final Object N;
    public final h O;
    public final Object P;
    public final Object Q;
    public final Object R;
    public final Object S;
    public final Object T;
    public final Object U;
    public final Object V;
    public final Object W;

    public CreditCardRepayDetailsControllerScreen(CreditCardRepayDetailsControllerScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = ep4.b.f128075a;
        this.L = inputData;
        this.M = R$layout.screen_recycler_navbar_nextbutton;
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: xs4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CreditCardRepayDetailsControllerScreen f308391b;

            {
                this.f308391b = this;
            }

            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v35, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                CreditCardRepayDetailsControllerScreen creditCardRepayDetailsControllerScreen = this.f308391b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = CreditCardRepayDetailsControllerScreen.X;
                        CreditCardRepayDetailsControllerScreen creditCardRepayDetailsControllerScreen2 = this.f308391b;
                        return dli.f.a(creditCardRepayDetailsControllerScreen2, (h) creditCardRepayDetailsControllerScreen2.W.getValue(), v.k(new ListSubheaderDelegate(), new CounterTextDelegate(), new RowLoadingDelegate(), (FullScreenStateDelegate) creditCardRepayDetailsControllerScreen2.S.getValue(), (ProgressStepVerticalDelegate) creditCardRepayDetailsControllerScreen2.Q.getValue(), (CellDetailsDelegate) creditCardRepayDetailsControllerScreen2.R.getValue()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = CreditCardRepayDetailsControllerScreen.X;
                        k4 k4Var = (k4) creditCardRepayDetailsControllerScreen.V.getValue();
                        switch (k4Var.f176174a) {
                            case 0:
                                return (j60.a) k4Var.e.get();
                            default:
                                return (j60.a) k4Var.e.get();
                        }
                    case 2:
                        KProperty[] kPropertyArr3 = CreditCardRepayDetailsControllerScreen.X;
                        return creditCardRepayDetailsControllerScreen.d3().f174564b.A.V();
                    case 3:
                        KProperty[] kPropertyArr4 = CreditCardRepayDetailsControllerScreen.X;
                        qji.b bVarU2 = creditCardRepayDetailsControllerScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.card.impl.ui.instalment.repay.details.di.CreditCardRepayDetailsControllerScreenInjector");
                        j4 j4Var = (j4) ((ys4.a) bVarU2).b().mo3808a(creditCardRepayDetailsControllerScreen);
                        CreditCardRepayDetailsControllerScreenContract$InputData creditCardRepayDetailsControllerScreenContract$InputData = creditCardRepayDetailsControllerScreen.L;
                        switch (j4Var.f176158a) {
                            case 0:
                                creditCardRepayDetailsControllerScreenContract$InputData.getClass();
                                j4Var.d = creditCardRepayDetailsControllerScreenContract$InputData;
                                break;
                            default:
                                creditCardRepayDetailsControllerScreenContract$InputData.getClass();
                                j4Var.d = creditCardRepayDetailsControllerScreenContract$InputData;
                                break;
                        }
                        return (k4) j4Var.mo3783build();
                    default:
                        KProperty[] kPropertyArr5 = CreditCardRepayDetailsControllerScreen.X;
                        k4 k4Var2 = (k4) creditCardRepayDetailsControllerScreen.V.getValue();
                        switch (k4Var2.f176174a) {
                            case 0:
                                return (h) k4Var2.f176178h.get();
                            default:
                                return (h) k4Var2.f176178h.get();
                        }
                }
            }
        });
        this.O = s.t(this, xs4.b.f);
        final int i2 = 1;
        this.P = w.y0(new Function0(this) { // from class: xs4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CreditCardRepayDetailsControllerScreen f308391b;

            {
                this.f308391b = this;
            }

            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v35, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                CreditCardRepayDetailsControllerScreen creditCardRepayDetailsControllerScreen = this.f308391b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CreditCardRepayDetailsControllerScreen.X;
                        CreditCardRepayDetailsControllerScreen creditCardRepayDetailsControllerScreen2 = this.f308391b;
                        return dli.f.a(creditCardRepayDetailsControllerScreen2, (h) creditCardRepayDetailsControllerScreen2.W.getValue(), v.k(new ListSubheaderDelegate(), new CounterTextDelegate(), new RowLoadingDelegate(), (FullScreenStateDelegate) creditCardRepayDetailsControllerScreen2.S.getValue(), (ProgressStepVerticalDelegate) creditCardRepayDetailsControllerScreen2.Q.getValue(), (CellDetailsDelegate) creditCardRepayDetailsControllerScreen2.R.getValue()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = CreditCardRepayDetailsControllerScreen.X;
                        k4 k4Var = (k4) creditCardRepayDetailsControllerScreen.V.getValue();
                        switch (k4Var.f176174a) {
                            case 0:
                                return (j60.a) k4Var.e.get();
                            default:
                                return (j60.a) k4Var.e.get();
                        }
                    case 2:
                        KProperty[] kPropertyArr3 = CreditCardRepayDetailsControllerScreen.X;
                        return creditCardRepayDetailsControllerScreen.d3().f174564b.A.V();
                    case 3:
                        KProperty[] kPropertyArr4 = CreditCardRepayDetailsControllerScreen.X;
                        qji.b bVarU2 = creditCardRepayDetailsControllerScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.card.impl.ui.instalment.repay.details.di.CreditCardRepayDetailsControllerScreenInjector");
                        j4 j4Var = (j4) ((ys4.a) bVarU2).b().mo3808a(creditCardRepayDetailsControllerScreen);
                        CreditCardRepayDetailsControllerScreenContract$InputData creditCardRepayDetailsControllerScreenContract$InputData = creditCardRepayDetailsControllerScreen.L;
                        switch (j4Var.f176158a) {
                            case 0:
                                creditCardRepayDetailsControllerScreenContract$InputData.getClass();
                                j4Var.d = creditCardRepayDetailsControllerScreenContract$InputData;
                                break;
                            default:
                                creditCardRepayDetailsControllerScreenContract$InputData.getClass();
                                j4Var.d = creditCardRepayDetailsControllerScreenContract$InputData;
                                break;
                        }
                        return (k4) j4Var.mo3783build();
                    default:
                        KProperty[] kPropertyArr5 = CreditCardRepayDetailsControllerScreen.X;
                        k4 k4Var2 = (k4) creditCardRepayDetailsControllerScreen.V.getValue();
                        switch (k4Var2.f176174a) {
                            case 0:
                                return (h) k4Var2.f176178h.get();
                            default:
                                return (h) k4Var2.f176178h.get();
                        }
                }
            }
        });
        this.Q = w.y0(new xkf.c(26));
        this.R = w.y0(new xkf.c(27));
        this.S = w.y0(new xkf.c(28));
        this.T = w.y0(new xkf.c(29));
        final int i3 = 2;
        this.U = w.y0(new Function0(this) { // from class: xs4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CreditCardRepayDetailsControllerScreen f308391b;

            {
                this.f308391b = this;
            }

            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v35, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                CreditCardRepayDetailsControllerScreen creditCardRepayDetailsControllerScreen = this.f308391b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CreditCardRepayDetailsControllerScreen.X;
                        CreditCardRepayDetailsControllerScreen creditCardRepayDetailsControllerScreen2 = this.f308391b;
                        return dli.f.a(creditCardRepayDetailsControllerScreen2, (h) creditCardRepayDetailsControllerScreen2.W.getValue(), v.k(new ListSubheaderDelegate(), new CounterTextDelegate(), new RowLoadingDelegate(), (FullScreenStateDelegate) creditCardRepayDetailsControllerScreen2.S.getValue(), (ProgressStepVerticalDelegate) creditCardRepayDetailsControllerScreen2.Q.getValue(), (CellDetailsDelegate) creditCardRepayDetailsControllerScreen2.R.getValue()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = CreditCardRepayDetailsControllerScreen.X;
                        k4 k4Var = (k4) creditCardRepayDetailsControllerScreen.V.getValue();
                        switch (k4Var.f176174a) {
                            case 0:
                                return (j60.a) k4Var.e.get();
                            default:
                                return (j60.a) k4Var.e.get();
                        }
                    case 2:
                        KProperty[] kPropertyArr3 = CreditCardRepayDetailsControllerScreen.X;
                        return creditCardRepayDetailsControllerScreen.d3().f174564b.A.V();
                    case 3:
                        KProperty[] kPropertyArr4 = CreditCardRepayDetailsControllerScreen.X;
                        qji.b bVarU2 = creditCardRepayDetailsControllerScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.card.impl.ui.instalment.repay.details.di.CreditCardRepayDetailsControllerScreenInjector");
                        j4 j4Var = (j4) ((ys4.a) bVarU2).b().mo3808a(creditCardRepayDetailsControllerScreen);
                        CreditCardRepayDetailsControllerScreenContract$InputData creditCardRepayDetailsControllerScreenContract$InputData = creditCardRepayDetailsControllerScreen.L;
                        switch (j4Var.f176158a) {
                            case 0:
                                creditCardRepayDetailsControllerScreenContract$InputData.getClass();
                                j4Var.d = creditCardRepayDetailsControllerScreenContract$InputData;
                                break;
                            default:
                                creditCardRepayDetailsControllerScreenContract$InputData.getClass();
                                j4Var.d = creditCardRepayDetailsControllerScreenContract$InputData;
                                break;
                        }
                        return (k4) j4Var.mo3783build();
                    default:
                        KProperty[] kPropertyArr5 = CreditCardRepayDetailsControllerScreen.X;
                        k4 k4Var2 = (k4) creditCardRepayDetailsControllerScreen.V.getValue();
                        switch (k4Var2.f176174a) {
                            case 0:
                                return (h) k4Var2.f176178h.get();
                            default:
                                return (h) k4Var2.f176178h.get();
                        }
                }
            }
        });
        final int i5 = 3;
        this.V = w.y0(new Function0(this) { // from class: xs4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CreditCardRepayDetailsControllerScreen f308391b;

            {
                this.f308391b = this;
            }

            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v35, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i5;
                CreditCardRepayDetailsControllerScreen creditCardRepayDetailsControllerScreen = this.f308391b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CreditCardRepayDetailsControllerScreen.X;
                        CreditCardRepayDetailsControllerScreen creditCardRepayDetailsControllerScreen2 = this.f308391b;
                        return dli.f.a(creditCardRepayDetailsControllerScreen2, (h) creditCardRepayDetailsControllerScreen2.W.getValue(), v.k(new ListSubheaderDelegate(), new CounterTextDelegate(), new RowLoadingDelegate(), (FullScreenStateDelegate) creditCardRepayDetailsControllerScreen2.S.getValue(), (ProgressStepVerticalDelegate) creditCardRepayDetailsControllerScreen2.Q.getValue(), (CellDetailsDelegate) creditCardRepayDetailsControllerScreen2.R.getValue()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = CreditCardRepayDetailsControllerScreen.X;
                        k4 k4Var = (k4) creditCardRepayDetailsControllerScreen.V.getValue();
                        switch (k4Var.f176174a) {
                            case 0:
                                return (j60.a) k4Var.e.get();
                            default:
                                return (j60.a) k4Var.e.get();
                        }
                    case 2:
                        KProperty[] kPropertyArr3 = CreditCardRepayDetailsControllerScreen.X;
                        return creditCardRepayDetailsControllerScreen.d3().f174564b.A.V();
                    case 3:
                        KProperty[] kPropertyArr4 = CreditCardRepayDetailsControllerScreen.X;
                        qji.b bVarU2 = creditCardRepayDetailsControllerScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.card.impl.ui.instalment.repay.details.di.CreditCardRepayDetailsControllerScreenInjector");
                        j4 j4Var = (j4) ((ys4.a) bVarU2).b().mo3808a(creditCardRepayDetailsControllerScreen);
                        CreditCardRepayDetailsControllerScreenContract$InputData creditCardRepayDetailsControllerScreenContract$InputData = creditCardRepayDetailsControllerScreen.L;
                        switch (j4Var.f176158a) {
                            case 0:
                                creditCardRepayDetailsControllerScreenContract$InputData.getClass();
                                j4Var.d = creditCardRepayDetailsControllerScreenContract$InputData;
                                break;
                            default:
                                creditCardRepayDetailsControllerScreenContract$InputData.getClass();
                                j4Var.d = creditCardRepayDetailsControllerScreenContract$InputData;
                                break;
                        }
                        return (k4) j4Var.mo3783build();
                    default:
                        KProperty[] kPropertyArr5 = CreditCardRepayDetailsControllerScreen.X;
                        k4 k4Var2 = (k4) creditCardRepayDetailsControllerScreen.V.getValue();
                        switch (k4Var2.f176174a) {
                            case 0:
                                return (h) k4Var2.f176178h.get();
                            default:
                                return (h) k4Var2.f176178h.get();
                        }
                }
            }
        });
        final int i6 = 4;
        this.W = w.y0(new Function0(this) { // from class: xs4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CreditCardRepayDetailsControllerScreen f308391b;

            {
                this.f308391b = this;
            }

            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v35, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i6;
                CreditCardRepayDetailsControllerScreen creditCardRepayDetailsControllerScreen = this.f308391b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CreditCardRepayDetailsControllerScreen.X;
                        CreditCardRepayDetailsControllerScreen creditCardRepayDetailsControllerScreen2 = this.f308391b;
                        return dli.f.a(creditCardRepayDetailsControllerScreen2, (h) creditCardRepayDetailsControllerScreen2.W.getValue(), v.k(new ListSubheaderDelegate(), new CounterTextDelegate(), new RowLoadingDelegate(), (FullScreenStateDelegate) creditCardRepayDetailsControllerScreen2.S.getValue(), (ProgressStepVerticalDelegate) creditCardRepayDetailsControllerScreen2.Q.getValue(), (CellDetailsDelegate) creditCardRepayDetailsControllerScreen2.R.getValue()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = CreditCardRepayDetailsControllerScreen.X;
                        k4 k4Var = (k4) creditCardRepayDetailsControllerScreen.V.getValue();
                        switch (k4Var.f176174a) {
                            case 0:
                                return (j60.a) k4Var.e.get();
                            default:
                                return (j60.a) k4Var.e.get();
                        }
                    case 2:
                        KProperty[] kPropertyArr3 = CreditCardRepayDetailsControllerScreen.X;
                        return creditCardRepayDetailsControllerScreen.d3().f174564b.A.V();
                    case 3:
                        KProperty[] kPropertyArr4 = CreditCardRepayDetailsControllerScreen.X;
                        qji.b bVarU2 = creditCardRepayDetailsControllerScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.card.impl.ui.instalment.repay.details.di.CreditCardRepayDetailsControllerScreenInjector");
                        j4 j4Var = (j4) ((ys4.a) bVarU2).b().mo3808a(creditCardRepayDetailsControllerScreen);
                        CreditCardRepayDetailsControllerScreenContract$InputData creditCardRepayDetailsControllerScreenContract$InputData = creditCardRepayDetailsControllerScreen.L;
                        switch (j4Var.f176158a) {
                            case 0:
                                creditCardRepayDetailsControllerScreenContract$InputData.getClass();
                                j4Var.d = creditCardRepayDetailsControllerScreenContract$InputData;
                                break;
                            default:
                                creditCardRepayDetailsControllerScreenContract$InputData.getClass();
                                j4Var.d = creditCardRepayDetailsControllerScreenContract$InputData;
                                break;
                        }
                        return (k4) j4Var.mo3783build();
                    default:
                        KProperty[] kPropertyArr5 = CreditCardRepayDetailsControllerScreen.X;
                        k4 k4Var2 = (k4) creditCardRepayDetailsControllerScreen.V.getValue();
                        switch (k4Var2.f176174a) {
                            case 0:
                                return (h) k4Var2.f176178h.get();
                            default:
                                return (h) k4Var2.f176178h.get();
                        }
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // cli.w
    public final void B(o oVar, q qVar) {
        k uiState = (k) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        j jVar = uiState.f308403a;
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        boolean z = jVar.d;
        TextLocalisedClause textLocalisedClause = jVar.f308400a;
        if (z) {
            t3 t3Var = t3.TWO_LINES;
            NavBarWithToolbar.Companion companion = NavBarWithToolbar.INSTANCE;
            navBarWithToolbar.I0(t3Var, false);
        } else {
            navBarWithToolbar.l0();
            navBarWithToolbar.setTitle(textLocalisedClause, null);
            navBarWithToolbar.setToolbarTitle(textLocalisedClause);
            navBarWithToolbar.setNavigationButtonImage(jVar.f308402c);
            navBarWithToolbar.setSecondDescriptionVisible(true);
            navBarWithToolbar.setSecondDescriptionText(jVar.f308401b);
        }
        i iVar = uiState.f308405c;
        LargeActionButton largeActionButton = d3().f174564b;
        w01.k.e(largeActionButton, iVar.f308399c);
        ((f) ((sy0.b) this.U.getValue())).b(iVar.f308398b);
        largeActionButton.setText(iVar.f308397a);
    }

    @Override // no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getN() {
        this.K.getClass();
        return ep4.b.f128076b;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (k4) this.V.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (xs4.h) this.W.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ((j60.a) this.P.getValue()).d(v.k((CellDetailsDelegate) this.R.getValue(), (LargeActionButtonDelegate) this.T.getValue()));
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r13v9, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, new ss4.h(vkm.q.J(new a0(rd0.e.b(d3().f174564b.o), 6), new a0(rd0.e.b(d3().f174565c.f59410q), 7), rd0.e.b(((FullScreenStateDelegate) this.S.getValue()).f52371h.f121375b), rd0.e.b(((ProgressStepVerticalDelegate) this.Q.getValue()).d), rd0.e.b(((LargeActionButtonDelegate) this.T.getValue()).d.f121375b)), yx4.b.Companion, 6), null, new p(2, (xs4.h) this.W.getValue(), xs4.h.class, "onItemClick", "onItemClick(Lcom/revolut/feature/credit/core/ui/ClickWrapper;)V", 4, 13), 3);
    }

    public final u d3() {
        ViewBinding value = this.O.getValue(this, X[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (u) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.M;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.N.getValue();
    }
}
