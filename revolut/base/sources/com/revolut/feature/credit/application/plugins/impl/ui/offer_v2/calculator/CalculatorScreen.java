package com.revolut.feature.credit.application.plugins.impl.ui.offer_v2.calculator;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.internal.views.tag.TagViewData;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.buttons.TwinVerticalButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.feature.credit.application.plugins.impl.R$id;
import com.revolut.feature.credit.application.plugins.impl.R$layout;
import com.revolut.feature.credit.application.plugins.impl.ui.core.plugins.PluginScreenController;
import com.revolut.feature.credit.application.plugins.impl.ui.offer_v2.calculator.CalculatorScreen;
import com.revolut.feature.credit.application.plugins.impl.ui.offer_v2.calculator.CalculatorScreenContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.offer_v2.calculator.a;
import com.revolut.kompot.view.ControllerContainerLinearLayout;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import com.revolut.rxdiffadapter.AsyncDiffRecyclerView;
import dw3.w8;
import dw3.x8;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import naf.j;
import nf4.d;
import nf4.k;
import te0.w;
import tx0.j0;
import vc.s;
import xki.e;
import yp0.y;
import zhm.d0;
import zhm.u;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u00052\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/offer_v2/calculator/CalculatorScreen;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/core/plugins/PluginScreenController;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/offer_v2/calculator/a;", "Ldli/a;", "Lnf4/k;", "Lbx4/c;", "La84/b;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CalculatorScreen extends PluginScreenController<a> implements dli.a, bx4.c, a84.b {
    public static final /* synthetic */ KProperty[] V = {o0.f186429a.j(new h0(CalculatorScreen.class, "binding", "getBinding()Lcom/revolut/feature/credit/application/plugins/impl/databinding/ScreenCalculatorBinding;", 0))};
    public final CalculatorScreenContract$InputData L;
    public final int M;
    public final Object N;
    public final Object O;
    public final h P;
    public final Object Q;
    public final Object R;
    public final Object S;
    public final Object T;
    public final FullScreenStateDelegate U;

    public CalculatorScreen(CalculatorScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.L = inputData;
        this.M = R$layout.screen_calculator;
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: nf4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CalculatorScreen f214804b;

            {
                this.f214804b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v31, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v36, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                CalculatorScreen calculatorScreen = this.f214804b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = CalculatorScreen.V;
                        qji.b bVarU2 = calculatorScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.application.plugins.impl.ui.offer_v2.calculator.di.CalculatorScreenInjector");
                        w8 w8Var = (w8) ((of4.a) bVarU2).b().mo3808a(calculatorScreen);
                        CalculatorScreenContract$InputData calculatorScreenContract$InputData = calculatorScreen.L;
                        switch (w8Var.f120091a) {
                            case 0:
                                calculatorScreenContract$InputData.getClass();
                                w8Var.d = calculatorScreenContract$InputData;
                                break;
                            case 1:
                                calculatorScreenContract$InputData.getClass();
                                w8Var.d = calculatorScreenContract$InputData;
                                break;
                            default:
                                calculatorScreenContract$InputData.getClass();
                                w8Var.d = calculatorScreenContract$InputData;
                                break;
                        }
                        return (x8) w8Var.mo3783build();
                    case 1:
                        KProperty[] kPropertyArr2 = CalculatorScreen.V;
                        x8 x8Var = (x8) calculatorScreen.N.getValue();
                        switch (x8Var.f120174a) {
                            case 0:
                                return (j) x8Var.f120182n.get();
                            case 1:
                                return (j) x8Var.f120182n.get();
                            default:
                                return (j) x8Var.f120182n.get();
                        }
                    case 2:
                        KProperty[] kPropertyArr3 = CalculatorScreen.V;
                        return d0.E0(u.c(calculatorScreen.U), ((x8) calculatorScreen.N.getValue()).c().Q());
                    case 3:
                        KProperty[] kPropertyArr4 = CalculatorScreen.V;
                        return ((x8) calculatorScreen.N.getValue()).b();
                    case 4:
                        KProperty[] kPropertyArr5 = CalculatorScreen.V;
                        CalculatorScreen calculatorScreen2 = this.f214804b;
                        return dli.f.a(calculatorScreen2, calculatorScreen2.d(), (List) calculatorScreen2.Q.getValue(), R$id.calculatorScreen_recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr6 = CalculatorScreen.V;
                        koi.c cVar = new koi.c(0);
                        cVar.b((List) calculatorScreen.Q.getValue());
                        return new koi.h(cVar, false, false, 6);
                }
            }
        });
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: nf4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CalculatorScreen f214804b;

            {
                this.f214804b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v31, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v36, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                CalculatorScreen calculatorScreen = this.f214804b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CalculatorScreen.V;
                        qji.b bVarU2 = calculatorScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.application.plugins.impl.ui.offer_v2.calculator.di.CalculatorScreenInjector");
                        w8 w8Var = (w8) ((of4.a) bVarU2).b().mo3808a(calculatorScreen);
                        CalculatorScreenContract$InputData calculatorScreenContract$InputData = calculatorScreen.L;
                        switch (w8Var.f120091a) {
                            case 0:
                                calculatorScreenContract$InputData.getClass();
                                w8Var.d = calculatorScreenContract$InputData;
                                break;
                            case 1:
                                calculatorScreenContract$InputData.getClass();
                                w8Var.d = calculatorScreenContract$InputData;
                                break;
                            default:
                                calculatorScreenContract$InputData.getClass();
                                w8Var.d = calculatorScreenContract$InputData;
                                break;
                        }
                        return (x8) w8Var.mo3783build();
                    case 1:
                        KProperty[] kPropertyArr2 = CalculatorScreen.V;
                        x8 x8Var = (x8) calculatorScreen.N.getValue();
                        switch (x8Var.f120174a) {
                            case 0:
                                return (j) x8Var.f120182n.get();
                            case 1:
                                return (j) x8Var.f120182n.get();
                            default:
                                return (j) x8Var.f120182n.get();
                        }
                    case 2:
                        KProperty[] kPropertyArr3 = CalculatorScreen.V;
                        return d0.E0(u.c(calculatorScreen.U), ((x8) calculatorScreen.N.getValue()).c().Q());
                    case 3:
                        KProperty[] kPropertyArr4 = CalculatorScreen.V;
                        return ((x8) calculatorScreen.N.getValue()).b();
                    case 4:
                        KProperty[] kPropertyArr5 = CalculatorScreen.V;
                        CalculatorScreen calculatorScreen2 = this.f214804b;
                        return dli.f.a(calculatorScreen2, calculatorScreen2.d(), (List) calculatorScreen2.Q.getValue(), R$id.calculatorScreen_recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr6 = CalculatorScreen.V;
                        koi.c cVar = new koi.c(0);
                        cVar.b((List) calculatorScreen.Q.getValue());
                        return new koi.h(cVar, false, false, 6);
                }
            }
        });
        this.P = s.t(this, nf4.b.f);
        final int i3 = 2;
        this.Q = w.y0(new Function0(this) { // from class: nf4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CalculatorScreen f214804b;

            {
                this.f214804b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v31, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v36, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                CalculatorScreen calculatorScreen = this.f214804b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CalculatorScreen.V;
                        qji.b bVarU2 = calculatorScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.application.plugins.impl.ui.offer_v2.calculator.di.CalculatorScreenInjector");
                        w8 w8Var = (w8) ((of4.a) bVarU2).b().mo3808a(calculatorScreen);
                        CalculatorScreenContract$InputData calculatorScreenContract$InputData = calculatorScreen.L;
                        switch (w8Var.f120091a) {
                            case 0:
                                calculatorScreenContract$InputData.getClass();
                                w8Var.d = calculatorScreenContract$InputData;
                                break;
                            case 1:
                                calculatorScreenContract$InputData.getClass();
                                w8Var.d = calculatorScreenContract$InputData;
                                break;
                            default:
                                calculatorScreenContract$InputData.getClass();
                                w8Var.d = calculatorScreenContract$InputData;
                                break;
                        }
                        return (x8) w8Var.mo3783build();
                    case 1:
                        KProperty[] kPropertyArr2 = CalculatorScreen.V;
                        x8 x8Var = (x8) calculatorScreen.N.getValue();
                        switch (x8Var.f120174a) {
                            case 0:
                                return (j) x8Var.f120182n.get();
                            case 1:
                                return (j) x8Var.f120182n.get();
                            default:
                                return (j) x8Var.f120182n.get();
                        }
                    case 2:
                        KProperty[] kPropertyArr3 = CalculatorScreen.V;
                        return d0.E0(u.c(calculatorScreen.U), ((x8) calculatorScreen.N.getValue()).c().Q());
                    case 3:
                        KProperty[] kPropertyArr4 = CalculatorScreen.V;
                        return ((x8) calculatorScreen.N.getValue()).b();
                    case 4:
                        KProperty[] kPropertyArr5 = CalculatorScreen.V;
                        CalculatorScreen calculatorScreen2 = this.f214804b;
                        return dli.f.a(calculatorScreen2, calculatorScreen2.d(), (List) calculatorScreen2.Q.getValue(), R$id.calculatorScreen_recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr6 = CalculatorScreen.V;
                        koi.c cVar = new koi.c(0);
                        cVar.b((List) calculatorScreen.Q.getValue());
                        return new koi.h(cVar, false, false, 6);
                }
            }
        });
        final int i5 = 3;
        this.R = w.y0(new Function0(this) { // from class: nf4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CalculatorScreen f214804b;

            {
                this.f214804b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v31, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v36, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i5;
                CalculatorScreen calculatorScreen = this.f214804b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CalculatorScreen.V;
                        qji.b bVarU2 = calculatorScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.application.plugins.impl.ui.offer_v2.calculator.di.CalculatorScreenInjector");
                        w8 w8Var = (w8) ((of4.a) bVarU2).b().mo3808a(calculatorScreen);
                        CalculatorScreenContract$InputData calculatorScreenContract$InputData = calculatorScreen.L;
                        switch (w8Var.f120091a) {
                            case 0:
                                calculatorScreenContract$InputData.getClass();
                                w8Var.d = calculatorScreenContract$InputData;
                                break;
                            case 1:
                                calculatorScreenContract$InputData.getClass();
                                w8Var.d = calculatorScreenContract$InputData;
                                break;
                            default:
                                calculatorScreenContract$InputData.getClass();
                                w8Var.d = calculatorScreenContract$InputData;
                                break;
                        }
                        return (x8) w8Var.mo3783build();
                    case 1:
                        KProperty[] kPropertyArr2 = CalculatorScreen.V;
                        x8 x8Var = (x8) calculatorScreen.N.getValue();
                        switch (x8Var.f120174a) {
                            case 0:
                                return (j) x8Var.f120182n.get();
                            case 1:
                                return (j) x8Var.f120182n.get();
                            default:
                                return (j) x8Var.f120182n.get();
                        }
                    case 2:
                        KProperty[] kPropertyArr3 = CalculatorScreen.V;
                        return d0.E0(u.c(calculatorScreen.U), ((x8) calculatorScreen.N.getValue()).c().Q());
                    case 3:
                        KProperty[] kPropertyArr4 = CalculatorScreen.V;
                        return ((x8) calculatorScreen.N.getValue()).b();
                    case 4:
                        KProperty[] kPropertyArr5 = CalculatorScreen.V;
                        CalculatorScreen calculatorScreen2 = this.f214804b;
                        return dli.f.a(calculatorScreen2, calculatorScreen2.d(), (List) calculatorScreen2.Q.getValue(), R$id.calculatorScreen_recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr6 = CalculatorScreen.V;
                        koi.c cVar = new koi.c(0);
                        cVar.b((List) calculatorScreen.Q.getValue());
                        return new koi.h(cVar, false, false, 6);
                }
            }
        });
        final int i6 = 4;
        this.S = w.y0(new Function0(this) { // from class: nf4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CalculatorScreen f214804b;

            {
                this.f214804b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v31, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v36, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i6;
                CalculatorScreen calculatorScreen = this.f214804b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CalculatorScreen.V;
                        qji.b bVarU2 = calculatorScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.application.plugins.impl.ui.offer_v2.calculator.di.CalculatorScreenInjector");
                        w8 w8Var = (w8) ((of4.a) bVarU2).b().mo3808a(calculatorScreen);
                        CalculatorScreenContract$InputData calculatorScreenContract$InputData = calculatorScreen.L;
                        switch (w8Var.f120091a) {
                            case 0:
                                calculatorScreenContract$InputData.getClass();
                                w8Var.d = calculatorScreenContract$InputData;
                                break;
                            case 1:
                                calculatorScreenContract$InputData.getClass();
                                w8Var.d = calculatorScreenContract$InputData;
                                break;
                            default:
                                calculatorScreenContract$InputData.getClass();
                                w8Var.d = calculatorScreenContract$InputData;
                                break;
                        }
                        return (x8) w8Var.mo3783build();
                    case 1:
                        KProperty[] kPropertyArr2 = CalculatorScreen.V;
                        x8 x8Var = (x8) calculatorScreen.N.getValue();
                        switch (x8Var.f120174a) {
                            case 0:
                                return (j) x8Var.f120182n.get();
                            case 1:
                                return (j) x8Var.f120182n.get();
                            default:
                                return (j) x8Var.f120182n.get();
                        }
                    case 2:
                        KProperty[] kPropertyArr3 = CalculatorScreen.V;
                        return d0.E0(u.c(calculatorScreen.U), ((x8) calculatorScreen.N.getValue()).c().Q());
                    case 3:
                        KProperty[] kPropertyArr4 = CalculatorScreen.V;
                        return ((x8) calculatorScreen.N.getValue()).b();
                    case 4:
                        KProperty[] kPropertyArr5 = CalculatorScreen.V;
                        CalculatorScreen calculatorScreen2 = this.f214804b;
                        return dli.f.a(calculatorScreen2, calculatorScreen2.d(), (List) calculatorScreen2.Q.getValue(), R$id.calculatorScreen_recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr6 = CalculatorScreen.V;
                        koi.c cVar = new koi.c(0);
                        cVar.b((List) calculatorScreen.Q.getValue());
                        return new koi.h(cVar, false, false, 6);
                }
            }
        });
        final int i21 = 5;
        this.T = w.y0(new Function0(this) { // from class: nf4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CalculatorScreen f214804b;

            {
                this.f214804b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v31, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v36, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i21;
                CalculatorScreen calculatorScreen = this.f214804b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CalculatorScreen.V;
                        qji.b bVarU2 = calculatorScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.application.plugins.impl.ui.offer_v2.calculator.di.CalculatorScreenInjector");
                        w8 w8Var = (w8) ((of4.a) bVarU2).b().mo3808a(calculatorScreen);
                        CalculatorScreenContract$InputData calculatorScreenContract$InputData = calculatorScreen.L;
                        switch (w8Var.f120091a) {
                            case 0:
                                calculatorScreenContract$InputData.getClass();
                                w8Var.d = calculatorScreenContract$InputData;
                                break;
                            case 1:
                                calculatorScreenContract$InputData.getClass();
                                w8Var.d = calculatorScreenContract$InputData;
                                break;
                            default:
                                calculatorScreenContract$InputData.getClass();
                                w8Var.d = calculatorScreenContract$InputData;
                                break;
                        }
                        return (x8) w8Var.mo3783build();
                    case 1:
                        KProperty[] kPropertyArr2 = CalculatorScreen.V;
                        x8 x8Var = (x8) calculatorScreen.N.getValue();
                        switch (x8Var.f120174a) {
                            case 0:
                                return (j) x8Var.f120182n.get();
                            case 1:
                                return (j) x8Var.f120182n.get();
                            default:
                                return (j) x8Var.f120182n.get();
                        }
                    case 2:
                        KProperty[] kPropertyArr3 = CalculatorScreen.V;
                        return d0.E0(u.c(calculatorScreen.U), ((x8) calculatorScreen.N.getValue()).c().Q());
                    case 3:
                        KProperty[] kPropertyArr4 = CalculatorScreen.V;
                        return ((x8) calculatorScreen.N.getValue()).b();
                    case 4:
                        KProperty[] kPropertyArr5 = CalculatorScreen.V;
                        CalculatorScreen calculatorScreen2 = this.f214804b;
                        return dli.f.a(calculatorScreen2, calculatorScreen2.d(), (List) calculatorScreen2.Q.getValue(), R$id.calculatorScreen_recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr6 = CalculatorScreen.V;
                        koi.c cVar = new koi.c(0);
                        cVar.b((List) calculatorScreen.Q.getValue());
                        return new koi.h(cVar, false, false, 6);
                }
            }
        });
        this.U = new FullScreenStateDelegate();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // cli.w
    public final void B(o oVar, q qVar) {
        k uiState = (k) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a84.a aVar = (a84.a) this.R.getValue();
        boolean zIsEmpty = uiState.f214818j.isEmpty();
        boolean z = uiState.f214816g;
        Image image = uiState.e;
        Clause clause = uiState.d;
        Clause clause2 = uiState.f214814b;
        TextLocalisedClause textLocalisedClause = uiState.f214813a;
        aVar.Q(zIsEmpty, uiState.f);
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        koi.h hVar = (koi.h) this.T.getValue();
        List list = uiState.f214818j;
        hVar.c(list);
        ControllerContainerLinearLayout calculatorScreenFooterContainer = d3().f10668c;
        Intrinsics.checkNotNullExpressionValue(calculatorScreenFooterContainer, "calculatorScreenFooterContainer");
        calculatorScreenFooterContainer.setVisibility(!list.isEmpty() ? 0 : 8);
        NavBarWithToolbar calculatorScreenNavBarWithToolbar = d3().e;
        Intrinsics.checkNotNullExpressionValue(calculatorScreenNavBarWithToolbar, "calculatorScreenNavBarWithToolbar");
        calculatorScreenNavBarWithToolbar.setTitle(textLocalisedClause, null);
        calculatorScreenNavBarWithToolbar.setToolbarTitle(textLocalisedClause);
        calculatorScreenNavBarWithToolbar.setSecondDescriptionText(clause2);
        calculatorScreenNavBarWithToolbar.setSecondDescriptionVisible(clause2 != null);
        TagViewData tagViewData = uiState.f214815c;
        if (tagViewData != null) {
            calculatorScreenNavBarWithToolbar.setMenuTagContent(tagViewData);
        }
        calculatorScreenNavBarWithToolbar.setHeaderTitleMode(j0.MULTILINE_LARGE);
        calculatorScreenNavBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(uiState.f214817h));
        TwinVerticalButton twinVerticalButtonE = E();
        twinVerticalButtonE.setMainButtonText(clause);
        twinVerticalButtonE.setMainButtonIcon(image);
        twinVerticalButtonE.setMainButtonEnabled(z);
        twinVerticalButtonE.setSecondaryButtonVisible(uiState.k);
        twinVerticalButtonE.setSecondaryButtonText(uiState.f214819l);
        twinVerticalButtonE.setSecondaryButtonStyle(LargeActionButton.ButtonStyle.f58726b);
        LargeActionButton calculatorScreenLargeButton = d3().d;
        Intrinsics.checkNotNullExpressionValue(calculatorScreenLargeButton, "calculatorScreenLargeButton");
        calculatorScreenLargeButton.setText(clause);
        calculatorScreenLargeButton.setIcon(image);
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
        ((c) d()).C2(a.C0474a.f68124a);
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (x8) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        y.b((ScreenContentRecyclerView) h(), new n7h.c(this, 23));
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
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(calculatorScreenNavBarWithToolbar.f59410q), null, new nf4.c(this, continuation, 0), 3);
        NavBarWithToolbar calculatorScreenNavBarWithToolbar2 = d3().e;
        Intrinsics.checkNotNullExpressionValue(calculatorScreenNavBarWithToolbar2, "calculatorScreenNavBarWithToolbar");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(calculatorScreenNavBarWithToolbar2.x0()), null, new j(this, continuation, 6), 3);
        LargeActionButton calculatorScreenLargeButton = d3().d;
        Intrinsics.checkNotNullExpressionValue(calculatorScreenLargeButton, "calculatorScreenLargeButton");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(calculatorScreenLargeButton.o), null, new nf4.c(this, continuation, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.U.f52371h.f121375b), null, new d(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(E().p0()), null, new nf4.c(this, continuation, 2), 3);
    }

    public final aw3.a d3() {
        ViewBinding value = this.P.getValue(this, V[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (aw3.a) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // bx4.c
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final nf4.j d() {
        return (nf4.j) this.O.getValue();
    }

    @Override // a84.b
    public final void f1() {
        ((c) d()).C2(a.b.f68125a);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
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
