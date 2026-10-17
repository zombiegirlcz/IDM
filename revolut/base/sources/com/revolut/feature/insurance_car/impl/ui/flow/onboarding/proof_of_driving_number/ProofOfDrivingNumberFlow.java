package com.revolut.feature.insurance_car.impl.ui.flow.onboarding.proof_of_driving_number;

import com.revolut.feature.insurance_car.impl.ui.flow.onboarding.proof_of_driving_number.ProofOfDrivingNumberFlow;
import com.revolut.kompot.navigable.vc.ViewController;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import ql7.e1;
import te0.w;
import xki.e;
import yki.c;
import yki.f;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/insurance_car/impl/ui/flow/onboarding/proof_of_driving_number/ProofOfDrivingNumberFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lcom/revolut/feature/insurance_car/impl/ui/flow/onboarding/proof_of_driving_number/a;", "Lyki/f;", "feature_insurance_car_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ProofOfDrivingNumberFlow extends ViewController<a> implements f {
    public final Object K;
    public final Object L;
    public final Object M;

    public ProofOfDrivingNumberFlow(ProofOfDrivingNumberFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        final int i = 0;
        this.K = w.y0(new Function0(this) { // from class: om7.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ProofOfDrivingNumberFlow f226769b;

            {
                this.f226769b = this;
            }

            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        ProofOfDrivingNumberFlow proofOfDrivingNumberFlow = this.f226769b;
                        return czi.c.d(0, 6, null, proofOfDrivingNumberFlow, (b) proofOfDrivingNumberFlow.M.getValue());
                    default:
                        return (b) ((e1) this.f226769b.L.getValue()).d.get();
                }
            }
        });
        this.L = w.y0(new oa2.b(this, inputData, 21));
        final int i2 = 1;
        this.M = w.y0(new Function0(this) { // from class: om7.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ProofOfDrivingNumberFlow f226769b;

            {
                this.f226769b = this;
            }

            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        ProofOfDrivingNumberFlow proofOfDrivingNumberFlow = this.f226769b;
                        return czi.c.d(0, 6, null, proofOfDrivingNumberFlow, (b) proofOfDrivingNumberFlow.M.getValue());
                    default:
                        return (b) ((e1) this.f226769b.L.getValue()).d.get();
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (e1) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final qji.b R1() {
        return (e1) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (om7.b) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final c k() {
        return (c) this.K.getValue();
    }
}
