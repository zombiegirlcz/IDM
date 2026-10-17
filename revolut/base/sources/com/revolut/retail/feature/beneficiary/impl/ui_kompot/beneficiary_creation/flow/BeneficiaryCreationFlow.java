package com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.flow;

import b3j.s;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.beneficiary.api.navigation.BeneficiaryCreationKompotInputData;
import com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.flow.BeneficiaryCreationFlow;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import te0.w;
import u1.g;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/beneficiary/impl/ui_kompot/beneficiary_creation/flow/BeneficiaryCreationFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lx2j/b;", "Lyki/f;", "feature_beneficiary_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class BeneficiaryCreationFlow extends ViewController<x2j.b> implements yki.f {
    public final Object K;
    public final Object L;
    public final Object M;

    public BeneficiaryCreationFlow(BeneficiaryCreationKompotInputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        final int i = 0;
        this.K = w.y0(new Function0(this) { // from class: u4j.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BeneficiaryCreationFlow f277368b;

            {
                this.f277368b = this;
            }

            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        BeneficiaryCreationFlow beneficiaryCreationFlow = this.f277368b;
                        return czi.c.d(0, 6, null, beneficiaryCreationFlow, (b) beneficiaryCreationFlow.M.getValue());
                    default:
                        return (b) ((s) this.f277368b.L.getValue()).f.get();
                }
            }
        });
        this.L = w.y0(new g(this, inputData, 13));
        final int i2 = 1;
        this.M = w.y0(new Function0(this) { // from class: u4j.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BeneficiaryCreationFlow f277368b;

            {
                this.f277368b = this;
            }

            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        BeneficiaryCreationFlow beneficiaryCreationFlow = this.f277368b;
                        return czi.c.d(0, 6, null, beneficiaryCreationFlow, (b) beneficiaryCreationFlow.M.getValue());
                    default:
                        return (b) ((s) this.f277368b.L.getValue()).f.get();
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (s) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final qji.b R1() {
        return (s) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (u4j.b) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final yki.c k() {
        return (yki.c) this.K.getValue();
    }
}
