package com.revolut.feature.apm.bills.boleto.impl.finder.onboarding;

import com.revolut.feature.apm.bills.boleto.impl.finder.onboarding.BoletoFinderOnboardingFlow;
import com.revolut.feature.apm.bills.boleto.impl.finder.onboarding.BoletoFinderOnboardingFlowContract$InputData;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import qji.b;
import sm1.h;
import te0.w;
import ue0.e;
import yki.c;
import yki.f;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/apm/bills/boleto/impl/finder/onboarding/BoletoFinderOnboardingFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lpm1/a;", "Lyki/f;", "feature_apm_bills_boleto_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class BoletoFinderOnboardingFlow extends ViewController<pm1.a> implements f {
    public final BoletoFinderOnboardingFlowContract$InputData K;
    public final int L;
    public final Object M;
    public final Object N;
    public final Object O;

    public BoletoFinderOnboardingFlow(BoletoFinderOnboardingFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_transparent;
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: an1.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BoletoFinderOnboardingFlow f6547b;

            {
                this.f6547b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        BoletoFinderOnboardingFlow boletoFinderOnboardingFlow = this.f6547b;
                        phm.a aVar = (phm.a) e.j(boletoFinderOnboardingFlow.m2()).a().get(sm1.d.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", sm1.d.class, " is not found"));
                        }
                        sm1.d dVar = ((sm1.d) aVar2.b()).k;
                        BoletoFinderOnboardingFlowContract$InputData boletoFinderOnboardingFlowContract$InputData = boletoFinderOnboardingFlow.K;
                        boletoFinderOnboardingFlowContract$InputData.getClass();
                        return new h(dVar, boletoFinderOnboardingFlowContract$InputData);
                    case 1:
                        return (b) ((h) this.f6547b.M.getValue()).f264328b.get();
                    default:
                        int i2 = R$id.screen_transparent_container;
                        BoletoFinderOnboardingFlow boletoFinderOnboardingFlow2 = this.f6547b;
                        return czi.c.d(i2, 4, null, boletoFinderOnboardingFlow2, (b) boletoFinderOnboardingFlow2.N.getValue());
                }
            }
        });
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: an1.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BoletoFinderOnboardingFlow f6547b;

            {
                this.f6547b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        BoletoFinderOnboardingFlow boletoFinderOnboardingFlow = this.f6547b;
                        phm.a aVar = (phm.a) e.j(boletoFinderOnboardingFlow.m2()).a().get(sm1.d.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", sm1.d.class, " is not found"));
                        }
                        sm1.d dVar = ((sm1.d) aVar2.b()).k;
                        BoletoFinderOnboardingFlowContract$InputData boletoFinderOnboardingFlowContract$InputData = boletoFinderOnboardingFlow.K;
                        boletoFinderOnboardingFlowContract$InputData.getClass();
                        return new h(dVar, boletoFinderOnboardingFlowContract$InputData);
                    case 1:
                        return (b) ((h) this.f6547b.M.getValue()).f264328b.get();
                    default:
                        int i22 = R$id.screen_transparent_container;
                        BoletoFinderOnboardingFlow boletoFinderOnboardingFlow2 = this.f6547b;
                        return czi.c.d(i22, 4, null, boletoFinderOnboardingFlow2, (b) boletoFinderOnboardingFlow2.N.getValue());
                }
            }
        });
        final int i3 = 2;
        this.O = w.y0(new Function0(this) { // from class: an1.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BoletoFinderOnboardingFlow f6547b;

            {
                this.f6547b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        BoletoFinderOnboardingFlow boletoFinderOnboardingFlow = this.f6547b;
                        phm.a aVar = (phm.a) e.j(boletoFinderOnboardingFlow.m2()).a().get(sm1.d.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", sm1.d.class, " is not found"));
                        }
                        sm1.d dVar = ((sm1.d) aVar2.b()).k;
                        BoletoFinderOnboardingFlowContract$InputData boletoFinderOnboardingFlowContract$InputData = boletoFinderOnboardingFlow.K;
                        boletoFinderOnboardingFlowContract$InputData.getClass();
                        return new h(dVar, boletoFinderOnboardingFlowContract$InputData);
                    case 1:
                        return (b) ((h) this.f6547b.M.getValue()).f264328b.get();
                    default:
                        int i22 = R$id.screen_transparent_container;
                        BoletoFinderOnboardingFlow boletoFinderOnboardingFlow2 = this.f6547b;
                        return czi.c.d(i22, 4, null, boletoFinderOnboardingFlow2, (b) boletoFinderOnboardingFlow2.N.getValue());
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (h) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final b R1() {
        return (h) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (an1.b) this.N.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final c k() {
        return (c) this.O.getValue();
    }
}
