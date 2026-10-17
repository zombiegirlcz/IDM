package com.revolut.biometric_verification.impl.ui.step.active_liveness.flow.submit_confirmation;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import com.revolut.biometric_verification.impl.R$layout;
import com.revolut.biometric_verification.impl.ui.step.active_liveness.flow.submit_confirmation.SubmitConfirmationScreen;
import com.revolut.camerakit.revolut.ui.R$string;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.buttons.TwinHorizontalButton;
import com.revolut.kompot.navigable.vc.ViewController;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import mc9.n;
import ms.b;
import ms.c;
import ms.k;
import ms.l;
import p12.o;
import pki.a;
import rz.f;
import te0.w;
import vc.s;
import vkm.q;
import xki.e;
import zhm.u;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/revolut/biometric_verification/impl/ui/step/active_liveness/flow/submit_confirmation/SubmitConfirmationScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lms/k;", "biometric_verification_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SubmitConfirmationScreen extends ViewController<k> {
    public static final /* synthetic */ KProperty[] Q = {o0.f186429a.j(new h0(SubmitConfirmationScreen.class, "binding", "getBinding()Lcom/revolut/biometric_verification/impl/databinding/ScreenSubmitConfirmationBinding;", 0))};
    public final SubmitConfirmationScreenContract$InputData K;
    public final int L;
    public final Object M;
    public final Object N;
    public final c O;
    public final h P;

    public SubmitConfirmationScreen(SubmitConfirmationScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_submit_confirmation;
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: ms.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SubmitConfirmationScreen f208167b;

            {
                this.f208167b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                SubmitConfirmationScreen submitConfirmationScreen = this.f208167b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = SubmitConfirmationScreen.Q;
                        qji.b bVarU2 = submitConfirmationScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.biometric_verification.impl.ui.step.active_liveness.flow.submit_confirmation.di.SubmitConfirmationScreenInjector");
                        pr.h0 h0Var = new pr.h0();
                        h0Var.f238848a = e4m.b.b(new o(15));
                        return h0Var;
                    default:
                        KProperty[] kPropertyArr2 = SubmitConfirmationScreen.Q;
                        return (l) ((pr.h0) submitConfirmationScreen.M.getValue()).f238848a.get();
                }
            }
        });
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: ms.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SubmitConfirmationScreen f208167b;

            {
                this.f208167b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                SubmitConfirmationScreen submitConfirmationScreen = this.f208167b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = SubmitConfirmationScreen.Q;
                        qji.b bVarU2 = submitConfirmationScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.biometric_verification.impl.ui.step.active_liveness.flow.submit_confirmation.di.SubmitConfirmationScreenInjector");
                        pr.h0 h0Var = new pr.h0();
                        h0Var.f238848a = e4m.b.b(new o(15));
                        return h0Var;
                    default:
                        KProperty[] kPropertyArr2 = SubmitConfirmationScreen.Q;
                        return (l) ((pr.h0) submitConfirmationScreen.M.getValue()).f238848a.get();
                }
            }
        });
        this.O = new c();
        this.P = s.t(this, b.f);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (pr.h0) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (l) this.N.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        d3().f218499b.setHint(new f(new rz.k(new rz.h(R$string.selfie_active_liveness_confirmation_title), null), new rz.k(new rz.h(R$string.selfie_active_liveness_confirmation_description, u.c(this.K.f50512a)), null), null, 8));
        TwinHorizontalButton twinHorizontalButton = d3().f218500c;
        twinHorizontalButton.setPrimaryButtonStyle(LargeActionButton.ButtonStyle.f58726b);
        twinHorizontalButton.setPrimaryButtonText(new TextLocalisedClause(R$string.selfie_active_liveness_confirmation_secondary_button_title, null, null, 14));
        twinHorizontalButton.setPrimaryButtonLoadingTag("RETAKE_BUTTON_LOADING_TAG");
        twinHorizontalButton.setSecondaryButtonStyle(LargeActionButton.ButtonStyle.f58725a);
        twinHorizontalButton.setSecondaryButtonText(new TextLocalisedClause(R$string.selfie_active_liveness_confirmation_primary_button_title, null, null, 14));
        twinHorizontalButton.setSecondaryButtonLoadingTag("SUBMIT_BUTTON_LOADING_TAG");
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, q.J(new mmh.e(rd0.e.b(d3().f218500c.c()), 5), new mmh.e(rd0.e.b(d3().f218500c.d()), 6)), new n(2, (l) this.N.getValue(), l.class, "onEvent", "onEvent(Lcom/revolut/biometric_verification/impl/ui/step/active_liveness/flow/submit_confirmation/SubmitConfirmationScreenContract$Event;)V", 4, 12), 3);
    }

    public final nr.f d3() {
        ViewBinding value = this.P.getValue(this, Q[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (nr.f) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getN() {
        return this.L;
    }

    @Override // oki.f
    public final a k() {
        return this.O;
    }
}
