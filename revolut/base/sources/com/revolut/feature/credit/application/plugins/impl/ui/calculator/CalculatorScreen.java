package com.revolut.feature.credit.application.plugins.impl.ui.calculator;

import a84.b;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import ao.h;
import bx4.c;
import c64.b0;
import c64.i;
import c64.j;
import c64.l;
import c64.m;
import c64.p;
import c64.x;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.internal.views.tag.TagViewData;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.buttons.TwinVerticalButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.credit.application.plugins.impl.R$id;
import com.revolut.feature.credit.application.plugins.impl.R$layout;
import com.revolut.feature.credit.application.plugins.impl.ui.calculator.CalculatorScreen;
import com.revolut.feature.credit.application.plugins.impl.ui.calculator.CalculatorScreenContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.core.plugins.PluginScreenController;
import com.revolut.kompot.view.ControllerContainerLinearLayout;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import com.revolut.rxdiffadapter.AsyncDiffRecyclerView;
import dli.a;
import dw3.e8;
import dw3.f8;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import rr0.f;
import te0.w;
import tx0.j0;
import vc.s;
import xki.e;
import yp0.y;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u00052\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/calculator/CalculatorScreen;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/core/plugins/PluginScreenController;", "Lc64/l;", "Ldli/a;", "Lc64/p;", "Lbx4/c;", "La84/b;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CalculatorScreen extends PluginScreenController<l> implements a, c, b {
    public static final /* synthetic */ KProperty[] W = {o0.f186429a.j(new h0(CalculatorScreen.class, "binding", "getBinding()Lcom/revolut/feature/credit/application/plugins/impl/databinding/ScreenCalculatorBinding;", 0))};
    public final CalculatorScreenContract$InputData L;
    public final int M;
    public final Object N;
    public final Object O;
    public final FullScreenStateDelegate P;
    public final Object Q;
    public final Object R;
    public final Object S;
    public final Object T;
    public f U;
    public final h V;

    public CalculatorScreen(CalculatorScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.L = inputData;
        this.M = R$layout.screen_calculator;
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: c64.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CalculatorScreen f21629b;

            {
                this.f21629b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v31, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v36, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                CalculatorScreen calculatorScreen = this.f21629b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = CalculatorScreen.W;
                        qji.b bVarU2 = calculatorScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.application.plugins.impl.ui.calculator.di.CalculatorScreenInjector");
                        e8 e8Var = (e8) ((d64.c) bVarU2).b().mo3808a(calculatorScreen);
                        CalculatorScreenContract$InputData calculatorScreenContract$InputData = calculatorScreen.L;
                        switch (e8Var.f118668a) {
                            case 0:
                                calculatorScreenContract$InputData.getClass();
                                e8Var.d = calculatorScreenContract$InputData;
                                break;
                            case 1:
                                calculatorScreenContract$InputData.getClass();
                                e8Var.d = calculatorScreenContract$InputData;
                                break;
                            default:
                                calculatorScreenContract$InputData.getClass();
                                e8Var.d = calculatorScreenContract$InputData;
                                break;
                        }
                        return (f8) e8Var.mo3783build();
                    case 1:
                        KProperty[] kPropertyArr2 = CalculatorScreen.W;
                        f8 f8Var = (f8) calculatorScreen.N.getValue();
                        switch (f8Var.f118761a) {
                            case 0:
                                return (o) f8Var.f118771q.get();
                            case 1:
                                return (o) f8Var.f118771q.get();
                            default:
                                return (o) f8Var.f118771q.get();
                        }
                    case 2:
                        KProperty[] kPropertyArr3 = CalculatorScreen.W;
                        return zhm.d0.E0(zhm.u.c(calculatorScreen.P), ((f8) calculatorScreen.N.getValue()).c().Q());
                    case 3:
                        KProperty[] kPropertyArr4 = CalculatorScreen.W;
                        return ((f8) calculatorScreen.N.getValue()).b();
                    case 4:
                        KProperty[] kPropertyArr5 = CalculatorScreen.W;
                        CalculatorScreen calculatorScreen2 = this.f21629b;
                        return dli.f.a(calculatorScreen2, calculatorScreen2.d(), (List) calculatorScreen2.Q.getValue(), R$id.calculatorScreen_recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr6 = CalculatorScreen.W;
                        koi.c cVar = new koi.c(0);
                        cVar.b((List) calculatorScreen.Q.getValue());
                        return new koi.h(cVar, false, false, 6);
                }
            }
        });
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: c64.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CalculatorScreen f21629b;

            {
                this.f21629b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v31, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v36, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                CalculatorScreen calculatorScreen = this.f21629b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CalculatorScreen.W;
                        qji.b bVarU2 = calculatorScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.application.plugins.impl.ui.calculator.di.CalculatorScreenInjector");
                        e8 e8Var = (e8) ((d64.c) bVarU2).b().mo3808a(calculatorScreen);
                        CalculatorScreenContract$InputData calculatorScreenContract$InputData = calculatorScreen.L;
                        switch (e8Var.f118668a) {
                            case 0:
                                calculatorScreenContract$InputData.getClass();
                                e8Var.d = calculatorScreenContract$InputData;
                                break;
                            case 1:
                                calculatorScreenContract$InputData.getClass();
                                e8Var.d = calculatorScreenContract$InputData;
                                break;
                            default:
                                calculatorScreenContract$InputData.getClass();
                                e8Var.d = calculatorScreenContract$InputData;
                                break;
                        }
                        return (f8) e8Var.mo3783build();
                    case 1:
                        KProperty[] kPropertyArr2 = CalculatorScreen.W;
                        f8 f8Var = (f8) calculatorScreen.N.getValue();
                        switch (f8Var.f118761a) {
                            case 0:
                                return (o) f8Var.f118771q.get();
                            case 1:
                                return (o) f8Var.f118771q.get();
                            default:
                                return (o) f8Var.f118771q.get();
                        }
                    case 2:
                        KProperty[] kPropertyArr3 = CalculatorScreen.W;
                        return zhm.d0.E0(zhm.u.c(calculatorScreen.P), ((f8) calculatorScreen.N.getValue()).c().Q());
                    case 3:
                        KProperty[] kPropertyArr4 = CalculatorScreen.W;
                        return ((f8) calculatorScreen.N.getValue()).b();
                    case 4:
                        KProperty[] kPropertyArr5 = CalculatorScreen.W;
                        CalculatorScreen calculatorScreen2 = this.f21629b;
                        return dli.f.a(calculatorScreen2, calculatorScreen2.d(), (List) calculatorScreen2.Q.getValue(), R$id.calculatorScreen_recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr6 = CalculatorScreen.W;
                        koi.c cVar = new koi.c(0);
                        cVar.b((List) calculatorScreen.Q.getValue());
                        return new koi.h(cVar, false, false, 6);
                }
            }
        });
        this.P = new FullScreenStateDelegate();
        final int i3 = 2;
        this.Q = w.y0(new Function0(this) { // from class: c64.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CalculatorScreen f21629b;

            {
                this.f21629b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v31, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v36, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                CalculatorScreen calculatorScreen = this.f21629b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CalculatorScreen.W;
                        qji.b bVarU2 = calculatorScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.application.plugins.impl.ui.calculator.di.CalculatorScreenInjector");
                        e8 e8Var = (e8) ((d64.c) bVarU2).b().mo3808a(calculatorScreen);
                        CalculatorScreenContract$InputData calculatorScreenContract$InputData = calculatorScreen.L;
                        switch (e8Var.f118668a) {
                            case 0:
                                calculatorScreenContract$InputData.getClass();
                                e8Var.d = calculatorScreenContract$InputData;
                                break;
                            case 1:
                                calculatorScreenContract$InputData.getClass();
                                e8Var.d = calculatorScreenContract$InputData;
                                break;
                            default:
                                calculatorScreenContract$InputData.getClass();
                                e8Var.d = calculatorScreenContract$InputData;
                                break;
                        }
                        return (f8) e8Var.mo3783build();
                    case 1:
                        KProperty[] kPropertyArr2 = CalculatorScreen.W;
                        f8 f8Var = (f8) calculatorScreen.N.getValue();
                        switch (f8Var.f118761a) {
                            case 0:
                                return (o) f8Var.f118771q.get();
                            case 1:
                                return (o) f8Var.f118771q.get();
                            default:
                                return (o) f8Var.f118771q.get();
                        }
                    case 2:
                        KProperty[] kPropertyArr3 = CalculatorScreen.W;
                        return zhm.d0.E0(zhm.u.c(calculatorScreen.P), ((f8) calculatorScreen.N.getValue()).c().Q());
                    case 3:
                        KProperty[] kPropertyArr4 = CalculatorScreen.W;
                        return ((f8) calculatorScreen.N.getValue()).b();
                    case 4:
                        KProperty[] kPropertyArr5 = CalculatorScreen.W;
                        CalculatorScreen calculatorScreen2 = this.f21629b;
                        return dli.f.a(calculatorScreen2, calculatorScreen2.d(), (List) calculatorScreen2.Q.getValue(), R$id.calculatorScreen_recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr6 = CalculatorScreen.W;
                        koi.c cVar = new koi.c(0);
                        cVar.b((List) calculatorScreen.Q.getValue());
                        return new koi.h(cVar, false, false, 6);
                }
            }
        });
        final int i5 = 3;
        this.R = w.y0(new Function0(this) { // from class: c64.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CalculatorScreen f21629b;

            {
                this.f21629b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v31, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v36, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i5;
                CalculatorScreen calculatorScreen = this.f21629b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CalculatorScreen.W;
                        qji.b bVarU2 = calculatorScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.application.plugins.impl.ui.calculator.di.CalculatorScreenInjector");
                        e8 e8Var = (e8) ((d64.c) bVarU2).b().mo3808a(calculatorScreen);
                        CalculatorScreenContract$InputData calculatorScreenContract$InputData = calculatorScreen.L;
                        switch (e8Var.f118668a) {
                            case 0:
                                calculatorScreenContract$InputData.getClass();
                                e8Var.d = calculatorScreenContract$InputData;
                                break;
                            case 1:
                                calculatorScreenContract$InputData.getClass();
                                e8Var.d = calculatorScreenContract$InputData;
                                break;
                            default:
                                calculatorScreenContract$InputData.getClass();
                                e8Var.d = calculatorScreenContract$InputData;
                                break;
                        }
                        return (f8) e8Var.mo3783build();
                    case 1:
                        KProperty[] kPropertyArr2 = CalculatorScreen.W;
                        f8 f8Var = (f8) calculatorScreen.N.getValue();
                        switch (f8Var.f118761a) {
                            case 0:
                                return (o) f8Var.f118771q.get();
                            case 1:
                                return (o) f8Var.f118771q.get();
                            default:
                                return (o) f8Var.f118771q.get();
                        }
                    case 2:
                        KProperty[] kPropertyArr3 = CalculatorScreen.W;
                        return zhm.d0.E0(zhm.u.c(calculatorScreen.P), ((f8) calculatorScreen.N.getValue()).c().Q());
                    case 3:
                        KProperty[] kPropertyArr4 = CalculatorScreen.W;
                        return ((f8) calculatorScreen.N.getValue()).b();
                    case 4:
                        KProperty[] kPropertyArr5 = CalculatorScreen.W;
                        CalculatorScreen calculatorScreen2 = this.f21629b;
                        return dli.f.a(calculatorScreen2, calculatorScreen2.d(), (List) calculatorScreen2.Q.getValue(), R$id.calculatorScreen_recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr6 = CalculatorScreen.W;
                        koi.c cVar = new koi.c(0);
                        cVar.b((List) calculatorScreen.Q.getValue());
                        return new koi.h(cVar, false, false, 6);
                }
            }
        });
        final int i6 = 4;
        this.S = w.y0(new Function0(this) { // from class: c64.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CalculatorScreen f21629b;

            {
                this.f21629b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v31, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v36, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i6;
                CalculatorScreen calculatorScreen = this.f21629b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CalculatorScreen.W;
                        qji.b bVarU2 = calculatorScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.application.plugins.impl.ui.calculator.di.CalculatorScreenInjector");
                        e8 e8Var = (e8) ((d64.c) bVarU2).b().mo3808a(calculatorScreen);
                        CalculatorScreenContract$InputData calculatorScreenContract$InputData = calculatorScreen.L;
                        switch (e8Var.f118668a) {
                            case 0:
                                calculatorScreenContract$InputData.getClass();
                                e8Var.d = calculatorScreenContract$InputData;
                                break;
                            case 1:
                                calculatorScreenContract$InputData.getClass();
                                e8Var.d = calculatorScreenContract$InputData;
                                break;
                            default:
                                calculatorScreenContract$InputData.getClass();
                                e8Var.d = calculatorScreenContract$InputData;
                                break;
                        }
                        return (f8) e8Var.mo3783build();
                    case 1:
                        KProperty[] kPropertyArr2 = CalculatorScreen.W;
                        f8 f8Var = (f8) calculatorScreen.N.getValue();
                        switch (f8Var.f118761a) {
                            case 0:
                                return (o) f8Var.f118771q.get();
                            case 1:
                                return (o) f8Var.f118771q.get();
                            default:
                                return (o) f8Var.f118771q.get();
                        }
                    case 2:
                        KProperty[] kPropertyArr3 = CalculatorScreen.W;
                        return zhm.d0.E0(zhm.u.c(calculatorScreen.P), ((f8) calculatorScreen.N.getValue()).c().Q());
                    case 3:
                        KProperty[] kPropertyArr4 = CalculatorScreen.W;
                        return ((f8) calculatorScreen.N.getValue()).b();
                    case 4:
                        KProperty[] kPropertyArr5 = CalculatorScreen.W;
                        CalculatorScreen calculatorScreen2 = this.f21629b;
                        return dli.f.a(calculatorScreen2, calculatorScreen2.d(), (List) calculatorScreen2.Q.getValue(), R$id.calculatorScreen_recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr6 = CalculatorScreen.W;
                        koi.c cVar = new koi.c(0);
                        cVar.b((List) calculatorScreen.Q.getValue());
                        return new koi.h(cVar, false, false, 6);
                }
            }
        });
        final int i21 = 5;
        this.T = w.y0(new Function0(this) { // from class: c64.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CalculatorScreen f21629b;

            {
                this.f21629b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v31, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v36, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i21;
                CalculatorScreen calculatorScreen = this.f21629b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CalculatorScreen.W;
                        qji.b bVarU2 = calculatorScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.application.plugins.impl.ui.calculator.di.CalculatorScreenInjector");
                        e8 e8Var = (e8) ((d64.c) bVarU2).b().mo3808a(calculatorScreen);
                        CalculatorScreenContract$InputData calculatorScreenContract$InputData = calculatorScreen.L;
                        switch (e8Var.f118668a) {
                            case 0:
                                calculatorScreenContract$InputData.getClass();
                                e8Var.d = calculatorScreenContract$InputData;
                                break;
                            case 1:
                                calculatorScreenContract$InputData.getClass();
                                e8Var.d = calculatorScreenContract$InputData;
                                break;
                            default:
                                calculatorScreenContract$InputData.getClass();
                                e8Var.d = calculatorScreenContract$InputData;
                                break;
                        }
                        return (f8) e8Var.mo3783build();
                    case 1:
                        KProperty[] kPropertyArr2 = CalculatorScreen.W;
                        f8 f8Var = (f8) calculatorScreen.N.getValue();
                        switch (f8Var.f118761a) {
                            case 0:
                                return (o) f8Var.f118771q.get();
                            case 1:
                                return (o) f8Var.f118771q.get();
                            default:
                                return (o) f8Var.f118771q.get();
                        }
                    case 2:
                        KProperty[] kPropertyArr3 = CalculatorScreen.W;
                        return zhm.d0.E0(zhm.u.c(calculatorScreen.P), ((f8) calculatorScreen.N.getValue()).c().Q());
                    case 3:
                        KProperty[] kPropertyArr4 = CalculatorScreen.W;
                        return ((f8) calculatorScreen.N.getValue()).b();
                    case 4:
                        KProperty[] kPropertyArr5 = CalculatorScreen.W;
                        CalculatorScreen calculatorScreen2 = this.f21629b;
                        return dli.f.a(calculatorScreen2, calculatorScreen2.d(), (List) calculatorScreen2.Q.getValue(), R$id.calculatorScreen_recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr6 = CalculatorScreen.W;
                        koi.c cVar = new koi.c(0);
                        cVar.b((List) calculatorScreen.Q.getValue());
                        return new koi.h(cVar, false, false, 6);
                }
            }
        });
        this.V = s.t(this, c64.h.f);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // cli.w
    public final void B(o oVar, q qVar) {
        p uiState = (p) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a84.a aVar = (a84.a) this.R.getValue();
        boolean zIsEmpty = uiState.f21641j.isEmpty();
        boolean z = uiState.f21639g;
        Clause clause = uiState.e;
        Clause clause2 = uiState.f21638c;
        TextLocalisedClause textLocalisedClause = uiState.f21637b;
        aVar.Q(zIsEmpty, uiState.f);
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        koi.h hVar = (koi.h) this.T.getValue();
        List list = uiState.f21641j;
        hVar.c(list);
        ControllerContainerLinearLayout calculatorScreenFooterContainer = d3().f10668c;
        Intrinsics.checkNotNullExpressionValue(calculatorScreenFooterContainer, "calculatorScreenFooterContainer");
        calculatorScreenFooterContainer.setVisibility(!list.isEmpty() ? 0 : 8);
        f fVar = this.U;
        if (fVar == null) {
            Intrinsics.r("mainButtonLoadingController");
            throw null;
        }
        fVar.c(uiState.f21640h);
        NavBarWithToolbar calculatorScreenNavBarWithToolbar = d3().e;
        Intrinsics.checkNotNullExpressionValue(calculatorScreenNavBarWithToolbar, "calculatorScreenNavBarWithToolbar");
        calculatorScreenNavBarWithToolbar.setTitle(textLocalisedClause, null);
        calculatorScreenNavBarWithToolbar.setToolbarTitle(textLocalisedClause);
        calculatorScreenNavBarWithToolbar.setHeaderTitleMode(j0.MULTILINE_LARGE);
        if (clause2 != null) {
            calculatorScreenNavBarWithToolbar.setSecondDescriptionText(clause2);
        }
        calculatorScreenNavBarWithToolbar.setSecondDescriptionVisible(clause2 != null);
        TagViewData tagViewData = uiState.d;
        if (tagViewData != null) {
            calculatorScreenNavBarWithToolbar.setMenuTagContent(tagViewData);
        }
        calculatorScreenNavBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(uiState.f21636a));
        TwinVerticalButton twinVerticalButtonE = E();
        twinVerticalButtonE.setMainButtonText(clause);
        twinVerticalButtonE.setMainButtonEnabled(z);
        LargeActionButton calculatorScreenLargeButton = d3().d;
        Intrinsics.checkNotNullExpressionValue(calculatorScreenLargeButton, "calculatorScreenLargeButton");
        calculatorScreenLargeButton.setText(clause);
        calculatorScreenLargeButton.setEnabled(z);
    }

    @Override // a84.b
    public final TwinVerticalButton E() {
        TwinVerticalButton calculatorScreenTwinVerticalButton = d3().f10669g;
        Intrinsics.checkNotNullExpressionValue(calculatorScreenTwinVerticalButton, "calculatorScreenTwinVerticalButton");
        return calculatorScreenTwinVerticalButton;
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController, com.revolut.kompot.navigable.a
    public final boolean F2() {
        b0 b0Var = (b0) d();
        b0Var.getClass();
        b0Var.n2(new x(b0Var, null), new whi.b(6));
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (f8) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar calculatorScreenNavBarWithToolbar = d3().e;
        Intrinsics.checkNotNullExpressionValue(calculatorScreenNavBarWithToolbar, "calculatorScreenNavBarWithToolbar");
        calculatorScreenNavBarWithToolbar.setDescriptionVisible(false);
        h().setTag(com.revolut.core.ui_kit.R$id.uikit_main_scrollable_view, "MAIN_SCROLLABLE_TAG");
        this.U = E().l0();
        AsyncDiffRecyclerView calculatorScreenBottomRecyclerView = d3().f10667b;
        Intrinsics.checkNotNullExpressionValue(calculatorScreenBottomRecyclerView, "calculatorScreenBottomRecyclerView");
        y.h(calculatorScreenBottomRecyclerView, (koi.h) this.T.getValue(), new LinearLayoutManager(calculatorScreenBottomRecyclerView.getContext()));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar calculatorScreenNavBarWithToolbar = d3().e;
        Intrinsics.checkNotNullExpressionValue(calculatorScreenNavBarWithToolbar, "calculatorScreenNavBarWithToolbar");
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(calculatorScreenNavBarWithToolbar.f59410q), null, new i(this, continuation, 0), 3);
        LargeActionButton calculatorScreenLargeButton = d3().d;
        Intrinsics.checkNotNullExpressionValue(calculatorScreenLargeButton, "calculatorScreenLargeButton");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(calculatorScreenLargeButton.o), null, new i(this, continuation, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.P.f52371h.f121375b), null, new j(this, null), 3);
    }

    public final aw3.a d3() {
        ViewBinding value = this.V.getValue(this, W[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (aw3.a) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // bx4.c
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final c64.o d() {
        return (c64.o) this.O.getValue();
    }

    @Override // a84.b
    public final void f1() {
        b0 b0Var = (b0) d();
        eu3.c cVarC = b0Var.J2().c();
        if (cVarC != null) {
            b0Var.C2(new m(new eu3.e(cVarC, b0Var.J2().f21632c)));
        }
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getM() {
        return this.M;
    }

    @Override // a84.b
    public final RecyclerView h() {
        ScreenContentRecyclerView calculatorScreenRecyclerView = d3().f;
        Intrinsics.checkNotNullExpressionValue(calculatorScreenRecyclerView, "calculatorScreenRecyclerView");
        return calculatorScreenRecyclerView;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.S.getValue();
    }

    @Override // a84.b
    public final void o1() {
        NavBarWithToolbar calculatorScreenNavBarWithToolbar = d3().e;
        Intrinsics.checkNotNullExpressionValue(calculatorScreenNavBarWithToolbar, "calculatorScreenNavBarWithToolbar");
        calculatorScreenNavBarWithToolbar.setExpanded(false, true);
    }
}
