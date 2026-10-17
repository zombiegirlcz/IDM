package com.revolut.feature.credit.application.plugins.impl.ui.spinner;

import android.content.Context;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.viewbinding.ViewBinding;
import ao.h;
import aw3.l;
import cli.a0;
import cli.o;
import cli.q;
import cli.w;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.feature.credit.application.plugins.impl.R$layout;
import com.revolut.feature.credit.application.plugins.impl.ui.core.plugins.PluginScreenController;
import com.revolut.feature.credit.application.plugins.impl.ui.spinner.SpinnerScreen;
import com.revolut.feature.credit.application.plugins.impl.ui.spinner.SpinnerScreenContract$InputData;
import dw3.g9;
import dw3.h9;
import ii4.j0;
import ii4.n0;
import ii4.p0;
import jh.d;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import ty0.c;
import vc.s;
import xki.e;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/spinner/SpinnerScreen;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/core/plugins/PluginScreenController;", "Lii4/n0;", "Lcli/w;", "Lii4/p0;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SpinnerScreen extends PluginScreenController<n0> implements w {
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(SpinnerScreen.class, "binding", "getBinding()Lcom/revolut/feature/credit/application/plugins/impl/databinding/ScreenCreditSpinnerBinding;", 0))};
    public final SpinnerScreenContract$InputData L;
    public final int M;
    public final boolean N;
    public final Object O;
    public final Object P;
    public final h Q;
    public final Object R;

    public SpinnerScreen(SpinnerScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.L = inputData;
        this.M = R$layout.screen_credit_spinner;
        this.N = true;
        final int i = 0;
        this.O = te0.w.y0(new Function0(this) { // from class: ii4.i0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SpinnerScreen f161530b;

            {
                this.f161530b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                SpinnerScreen spinnerScreen = this.f161530b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = SpinnerScreen.S;
                        qji.b bVarU2 = spinnerScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.application.plugins.impl.ui.spinner.di.SpinnerScreenInjector");
                        g9 g9Var = (g9) ((ki4.a) bVarU2).b().mo3808a(spinnerScreen);
                        SpinnerScreenContract$InputData spinnerScreenContract$InputData = spinnerScreen.L;
                        switch (g9Var.f118834a) {
                            case 0:
                                spinnerScreenContract$InputData.getClass();
                                g9Var.d = spinnerScreenContract$InputData;
                                break;
                            case 1:
                                spinnerScreenContract$InputData.getClass();
                                g9Var.d = spinnerScreenContract$InputData;
                                break;
                            case 2:
                                spinnerScreenContract$InputData.getClass();
                                g9Var.d = spinnerScreenContract$InputData;
                                break;
                            default:
                                spinnerScreenContract$InputData.getClass();
                                g9Var.d = spinnerScreenContract$InputData;
                                break;
                        }
                        return (h9) g9Var.mo3783build();
                    case 1:
                        KProperty[] kPropertyArr2 = SpinnerScreen.S;
                        h9 h9Var = (h9) spinnerScreen.O.getValue();
                        switch (h9Var.f118922a) {
                            case 0:
                                return (o0) h9Var.f118926h.get();
                            case 1:
                                return (o0) h9Var.f118926h.get();
                            case 2:
                                return (o0) h9Var.f118926h.get();
                            default:
                                return (o0) h9Var.f118926h.get();
                        }
                    default:
                        KProperty[] kPropertyArr3 = SpinnerScreen.S;
                        return n14.e.a(spinnerScreen, (o0) spinnerScreen.P.getValue());
                }
            }
        });
        final int i2 = 1;
        this.P = te0.w.y0(new Function0(this) { // from class: ii4.i0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SpinnerScreen f161530b;

            {
                this.f161530b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                SpinnerScreen spinnerScreen = this.f161530b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = SpinnerScreen.S;
                        qji.b bVarU2 = spinnerScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.application.plugins.impl.ui.spinner.di.SpinnerScreenInjector");
                        g9 g9Var = (g9) ((ki4.a) bVarU2).b().mo3808a(spinnerScreen);
                        SpinnerScreenContract$InputData spinnerScreenContract$InputData = spinnerScreen.L;
                        switch (g9Var.f118834a) {
                            case 0:
                                spinnerScreenContract$InputData.getClass();
                                g9Var.d = spinnerScreenContract$InputData;
                                break;
                            case 1:
                                spinnerScreenContract$InputData.getClass();
                                g9Var.d = spinnerScreenContract$InputData;
                                break;
                            case 2:
                                spinnerScreenContract$InputData.getClass();
                                g9Var.d = spinnerScreenContract$InputData;
                                break;
                            default:
                                spinnerScreenContract$InputData.getClass();
                                g9Var.d = spinnerScreenContract$InputData;
                                break;
                        }
                        return (h9) g9Var.mo3783build();
                    case 1:
                        KProperty[] kPropertyArr2 = SpinnerScreen.S;
                        h9 h9Var = (h9) spinnerScreen.O.getValue();
                        switch (h9Var.f118922a) {
                            case 0:
                                return (o0) h9Var.f118926h.get();
                            case 1:
                                return (o0) h9Var.f118926h.get();
                            case 2:
                                return (o0) h9Var.f118926h.get();
                            default:
                                return (o0) h9Var.f118926h.get();
                        }
                    default:
                        KProperty[] kPropertyArr3 = SpinnerScreen.S;
                        return n14.e.a(spinnerScreen, (o0) spinnerScreen.P.getValue());
                }
            }
        });
        this.Q = s.t(this, j0.f);
        final int i3 = 2;
        this.R = te0.w.y0(new Function0(this) { // from class: ii4.i0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SpinnerScreen f161530b;

            {
                this.f161530b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                SpinnerScreen spinnerScreen = this.f161530b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = SpinnerScreen.S;
                        qji.b bVarU2 = spinnerScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.application.plugins.impl.ui.spinner.di.SpinnerScreenInjector");
                        g9 g9Var = (g9) ((ki4.a) bVarU2).b().mo3808a(spinnerScreen);
                        SpinnerScreenContract$InputData spinnerScreenContract$InputData = spinnerScreen.L;
                        switch (g9Var.f118834a) {
                            case 0:
                                spinnerScreenContract$InputData.getClass();
                                g9Var.d = spinnerScreenContract$InputData;
                                break;
                            case 1:
                                spinnerScreenContract$InputData.getClass();
                                g9Var.d = spinnerScreenContract$InputData;
                                break;
                            case 2:
                                spinnerScreenContract$InputData.getClass();
                                g9Var.d = spinnerScreenContract$InputData;
                                break;
                            default:
                                spinnerScreenContract$InputData.getClass();
                                g9Var.d = spinnerScreenContract$InputData;
                                break;
                        }
                        return (h9) g9Var.mo3783build();
                    case 1:
                        KProperty[] kPropertyArr2 = SpinnerScreen.S;
                        h9 h9Var = (h9) spinnerScreen.O.getValue();
                        switch (h9Var.f118922a) {
                            case 0:
                                return (o0) h9Var.f118926h.get();
                            case 1:
                                return (o0) h9Var.f118926h.get();
                            case 2:
                                return (o0) h9Var.f118926h.get();
                            default:
                                return (o0) h9Var.f118926h.get();
                        }
                    default:
                        KProperty[] kPropertyArr3 = SpinnerScreen.S;
                        return n14.e.a(spinnerScreen, (o0) spinnerScreen.P.getValue());
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        p0 uiState = (p0) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        AppCompatTextView creditSpinnerScreenTitleView = d3().f10702c;
        Intrinsics.checkNotNullExpressionValue(creditSpinnerScreenTitleView, "creditSpinnerScreenTitleView");
        Clause clause = uiState.f161542a;
        Context context = creditSpinnerScreenTitleView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        c.b(d.f(context).b0(), clause, creditSpinnerScreenTitleView, null, null, 12);
        AppCompatTextView creditSpinnerScreenSubtitleView = d3().f10701b;
        Intrinsics.checkNotNullExpressionValue(creditSpinnerScreenSubtitleView, "creditSpinnerScreenSubtitleView");
        Clause clause2 = uiState.f161543b;
        Context context2 = creditSpinnerScreenSubtitleView.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        c.b(d.f(context2).b0(), clause2, creditSpinnerScreenSubtitleView, null, null, 12);
        AppCompatTextView creditSpinnerScreenSubtitleView2 = d3().f10701b;
        Intrinsics.checkNotNullExpressionValue(creditSpinnerScreenSubtitleView2, "creditSpinnerScreenSubtitleView");
        creditSpinnerScreenSubtitleView2.setVisibility(clause2 != null ? 0 : 8);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (h9) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (ii4.o0) this.P.getValue();
    }

    public final l d3() {
        ViewBinding value = this.Q.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (l) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.M;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (a0) this.R.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.N);
    }
}
