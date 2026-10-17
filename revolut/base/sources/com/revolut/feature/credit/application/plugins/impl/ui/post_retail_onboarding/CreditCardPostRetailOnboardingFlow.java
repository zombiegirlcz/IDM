package com.revolut.feature.credit.application.plugins.impl.ui.post_retail_onboarding;

import aii.q;
import com.revolut.feature.credit.application.plugins.impl.ui.post_retail_onboarding.CreditCardPostRetailOnboardingFlow;
import com.revolut.feature.credit.application.plugins.impl.ui.post_retail_onboarding.CreditCardPostRetailOnboardingFlowContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import dw3.c1;
import dw3.g1;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import qji.b;
import te0.w;
import xki.e;
import yki.c;
import yki.f;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/post_retail_onboarding/CreditCardPostRetailOnboardingFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Lyki/f;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CreditCardPostRetailOnboardingFlow extends ViewController<q> implements f {
    public final CreditCardPostRetailOnboardingFlowContract$InputData K;
    public final Object L;
    public final Object M;
    public final Object N;

    public CreditCardPostRetailOnboardingFlow(CreditCardPostRetailOnboardingFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: qg4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CreditCardPostRetailOnboardingFlow f245646b;

            {
                this.f245646b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        CreditCardPostRetailOnboardingFlow creditCardPostRetailOnboardingFlow = this.f245646b;
                        phm.a aVar = (phm.a) ue0.e.j(creditCardPostRetailOnboardingFlow.m2()).a().get(dw3.e.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", dw3.e.class, " is not found"));
                        }
                        c1 c1Var = ((c1) ((dw3.e) aVar2.b())).m0;
                        CreditCardPostRetailOnboardingFlowContract$InputData creditCardPostRetailOnboardingFlowContract$InputData = creditCardPostRetailOnboardingFlow.K;
                        creditCardPostRetailOnboardingFlowContract$InputData.getClass();
                        return new g1(c1Var, creditCardPostRetailOnboardingFlowContract$InputData);
                    case 1:
                        return (b) ((g1) this.f245646b.L.getValue()).f118790c.get();
                    default:
                        CreditCardPostRetailOnboardingFlow creditCardPostRetailOnboardingFlow2 = this.f245646b;
                        return czi.c.d(0, 6, null, creditCardPostRetailOnboardingFlow2, (b) creditCardPostRetailOnboardingFlow2.M.getValue());
                }
            }
        });
        final int i2 = 1;
        this.M = w.y0(new Function0(this) { // from class: qg4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CreditCardPostRetailOnboardingFlow f245646b;

            {
                this.f245646b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        CreditCardPostRetailOnboardingFlow creditCardPostRetailOnboardingFlow = this.f245646b;
                        phm.a aVar = (phm.a) ue0.e.j(creditCardPostRetailOnboardingFlow.m2()).a().get(dw3.e.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", dw3.e.class, " is not found"));
                        }
                        c1 c1Var = ((c1) ((dw3.e) aVar2.b())).m0;
                        CreditCardPostRetailOnboardingFlowContract$InputData creditCardPostRetailOnboardingFlowContract$InputData = creditCardPostRetailOnboardingFlow.K;
                        creditCardPostRetailOnboardingFlowContract$InputData.getClass();
                        return new g1(c1Var, creditCardPostRetailOnboardingFlowContract$InputData);
                    case 1:
                        return (b) ((g1) this.f245646b.L.getValue()).f118790c.get();
                    default:
                        CreditCardPostRetailOnboardingFlow creditCardPostRetailOnboardingFlow2 = this.f245646b;
                        return czi.c.d(0, 6, null, creditCardPostRetailOnboardingFlow2, (b) creditCardPostRetailOnboardingFlow2.M.getValue());
                }
            }
        });
        final int i3 = 2;
        this.N = w.y0(new Function0(this) { // from class: qg4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CreditCardPostRetailOnboardingFlow f245646b;

            {
                this.f245646b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        CreditCardPostRetailOnboardingFlow creditCardPostRetailOnboardingFlow = this.f245646b;
                        phm.a aVar = (phm.a) ue0.e.j(creditCardPostRetailOnboardingFlow.m2()).a().get(dw3.e.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", dw3.e.class, " is not found"));
                        }
                        c1 c1Var = ((c1) ((dw3.e) aVar2.b())).m0;
                        CreditCardPostRetailOnboardingFlowContract$InputData creditCardPostRetailOnboardingFlowContract$InputData = creditCardPostRetailOnboardingFlow.K;
                        creditCardPostRetailOnboardingFlowContract$InputData.getClass();
                        return new g1(c1Var, creditCardPostRetailOnboardingFlowContract$InputData);
                    case 1:
                        return (b) ((g1) this.f245646b.L.getValue()).f118790c.get();
                    default:
                        CreditCardPostRetailOnboardingFlow creditCardPostRetailOnboardingFlow2 = this.f245646b;
                        return czi.c.d(0, 6, null, creditCardPostRetailOnboardingFlow2, (b) creditCardPostRetailOnboardingFlow2.M.getValue());
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (g1) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final b R1() {
        return (g1) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (qg4.b) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final c k() {
        return (c) this.N.getValue();
    }
}
