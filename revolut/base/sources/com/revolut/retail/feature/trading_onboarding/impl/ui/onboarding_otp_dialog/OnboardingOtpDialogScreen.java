package com.revolut.retail.feature.trading_onboarding.impl.ui.onboarding_otp_dialog;

import aii.q;
import cli.a0;
import cli.l;
import cli.o;
import cli.w;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.trading_onboarding.impl.ui.onboarding_otp_dialog.OnboardingOtpDialogScreen;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kyk.k;
import ltf.b;
import m0l.c;
import n14.e;
import pki.a;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/trading_onboarding/impl/ui/onboarding_otp_dialog/OnboardingOtpDialogScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Lcli/w;", "Lcli/l;", "feature_trading_onboarding_revamp_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class OnboardingOtpDialogScreen extends ViewController<q> implements w {
    public final int K;
    public final Object L;
    public final Object M;
    public final Object N;

    public OnboardingOtpDialogScreen(OnboardingOtpDialogScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = R$layout.screen_transparent;
        final int i = 0;
        this.L = te0.w.y0(new Function0(this) { // from class: m0l.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OnboardingOtpDialogScreen f201166b;

            {
                this.f201166b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        return (c) ((k) this.f201166b.N.getValue()).f190954b.get();
                    default:
                        OnboardingOtpDialogScreen onboardingOtpDialogScreen = this.f201166b;
                        return e.a(onboardingOtpDialogScreen, (c) onboardingOtpDialogScreen.L.getValue());
                }
            }
        });
        final int i2 = 1;
        this.M = te0.w.y0(new Function0(this) { // from class: m0l.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OnboardingOtpDialogScreen f201166b;

            {
                this.f201166b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        return (c) ((k) this.f201166b.N.getValue()).f190954b.get();
                    default:
                        OnboardingOtpDialogScreen onboardingOtpDialogScreen = this.f201166b;
                        return e.a(onboardingOtpDialogScreen, (c) onboardingOtpDialogScreen.L.getValue());
                }
            }
        });
        this.N = te0.w.y0(new b(this, inputData, 10));
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        l uiState = (l) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (k) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (c) this.L.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final a k() {
        return (a0) this.M.getValue();
    }
}
