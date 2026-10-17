package com.revolut.feature.revolutpay.shared.ui.terminal_payment;

import android.content.Context;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.a0;
import cli.o;
import cli.q;
import cli.w;
import com.airbnb.lottie.LottieAnimationView;
import com.revolut.core.ui_kit_core.displayers.image.models.LottieImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.revolutpay.shared.R$layout;
import com.revolut.feature.revolutpay.shared.ui.terminal_payment.TerminalPaymentScreen;
import com.revolut.kompot.navigable.vc.ViewController;
import d7.m0;
import ip0.g0;
import jec.b;
import jec.d;
import jec.k;
import jec.l;
import kli.a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import p7c.q0;
import vc.s;
import xki.e;
import yy0.f;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/revolutpay/shared/ui/terminal_payment/TerminalPaymentScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Ljec/d;", "Lcli/w;", "Ljec/l;", "feature_revolut_pay_shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TerminalPaymentScreen extends ViewController<d> implements w {
    public static final /* synthetic */ KProperty[] Q = {o0.f186429a.j(new h0(TerminalPaymentScreen.class, "binding", "getBinding()Lcom/revolut/feature/revolutpay/shared/databinding/ScreenTerminalPaymentBinding;", 0))};
    public final TerminalPaymentScreenContract$InputData K;
    public final Object L;
    public final int M;
    public final Object N;
    public final Object O;
    public final h P;

    public TerminalPaymentScreen(TerminalPaymentScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        final int i = 0;
        this.L = te0.w.y0(new Function0(this) { // from class: jec.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TerminalPaymentScreen f173257b;

            {
                this.f173257b = this;
            }

            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                TerminalPaymentScreen terminalPaymentScreen = this.f173257b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = TerminalPaymentScreen.Q;
                        q0 q0Var = (q0) terminalPaymentScreen.O.getValue();
                        switch (q0Var.f233665a) {
                            case 0:
                                return (k) q0Var.f233667c.get();
                            default:
                                return (k) q0Var.f233667c.get();
                        }
                    case 1:
                        KProperty[] kPropertyArr2 = TerminalPaymentScreen.Q;
                        return n14.e.a(terminalPaymentScreen, (k) terminalPaymentScreen.L.getValue());
                    default:
                        KProperty[] kPropertyArr3 = TerminalPaymentScreen.Q;
                        qji.b bVarU2 = terminalPaymentScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.revolutpay.shared.ui.terminal_payment.di.TerminalPaymentScreenInjector");
                        return (q0) ((kec.a) ((kec.b) bVarU2).s().mo3808a(terminalPaymentScreen)).H(terminalPaymentScreen.K).mo3783build();
                }
            }
        });
        this.M = R$layout.screen_terminal_payment;
        final int i2 = 1;
        this.N = te0.w.y0(new Function0(this) { // from class: jec.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TerminalPaymentScreen f173257b;

            {
                this.f173257b = this;
            }

            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                TerminalPaymentScreen terminalPaymentScreen = this.f173257b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = TerminalPaymentScreen.Q;
                        q0 q0Var = (q0) terminalPaymentScreen.O.getValue();
                        switch (q0Var.f233665a) {
                            case 0:
                                return (k) q0Var.f233667c.get();
                            default:
                                return (k) q0Var.f233667c.get();
                        }
                    case 1:
                        KProperty[] kPropertyArr2 = TerminalPaymentScreen.Q;
                        return n14.e.a(terminalPaymentScreen, (k) terminalPaymentScreen.L.getValue());
                    default:
                        KProperty[] kPropertyArr3 = TerminalPaymentScreen.Q;
                        qji.b bVarU2 = terminalPaymentScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.revolutpay.shared.ui.terminal_payment.di.TerminalPaymentScreenInjector");
                        return (q0) ((kec.a) ((kec.b) bVarU2).s().mo3808a(terminalPaymentScreen)).H(terminalPaymentScreen.K).mo3783build();
                }
            }
        });
        final int i3 = 2;
        this.O = te0.w.y0(new Function0(this) { // from class: jec.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TerminalPaymentScreen f173257b;

            {
                this.f173257b = this;
            }

            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                TerminalPaymentScreen terminalPaymentScreen = this.f173257b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = TerminalPaymentScreen.Q;
                        q0 q0Var = (q0) terminalPaymentScreen.O.getValue();
                        switch (q0Var.f233665a) {
                            case 0:
                                return (k) q0Var.f233667c.get();
                            default:
                                return (k) q0Var.f233667c.get();
                        }
                    case 1:
                        KProperty[] kPropertyArr2 = TerminalPaymentScreen.Q;
                        return n14.e.a(terminalPaymentScreen, (k) terminalPaymentScreen.L.getValue());
                    default:
                        KProperty[] kPropertyArr3 = TerminalPaymentScreen.Q;
                        qji.b bVarU2 = terminalPaymentScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.revolutpay.shared.ui.terminal_payment.di.TerminalPaymentScreenInjector");
                        return (q0) ((kec.a) ((kec.b) bVarU2).s().mo3808a(terminalPaymentScreen)).H(terminalPaymentScreen.K).mo3783build();
                }
            }
        });
        this.P = s.t(this, b.f);
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        l uiState = (l) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        f fVarQ = jh.d.f(m2()).Q();
        LottieImage lottieImage = uiState.f173265a;
        LottieAnimationView terminalPaymentScreenAnimationView = d3().f296403b;
        Intrinsics.checkNotNullExpressionValue(terminalPaymentScreenAnimationView, "terminalPaymentScreenAnimationView");
        f.e(fVarQ, lottieImage, terminalPaymentScreenAnimationView, null, null, 12);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (q0) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (k) this.L.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        LottieAnimationView lottieAnimationView = d3().f296403b;
        lottieAnimationView.enableMergePathsForKitKatAndAbove(true);
        lottieAnimationView.setRenderMode(m0.HARDWARE);
        Context context = lottieAnimationView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        lottieAnimationView.setBackgroundColor(a.s(R$attr.uikit_windowBackground, context));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        d3().f296402a.setOnClickListener(new g0(this, 8));
    }

    public final wcc.e d3() {
        ViewBinding value = this.P.getValue(this, Q[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (wcc.e) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.M;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (a0) this.N.getValue();
    }
}
