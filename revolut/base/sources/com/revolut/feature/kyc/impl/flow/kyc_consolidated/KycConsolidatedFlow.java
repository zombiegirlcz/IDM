package com.revolut.feature.kyc.impl.flow.kyc_consolidated;

import aii.q;
import com.revolut.feature.kyc.impl.flow.kyc_consolidated.KycConsolidatedFlow;
import com.revolut.feature.kyc.impl.flow.kyc_consolidated.KycConsolidatedFlowContract$InputData;
import com.revolut.kompot.R$id;
import com.revolut.kompot.navigable.vc.ViewController;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import ta9.m;
import te0.w;
import xki.e;
import zu8.c0;
import zu8.d0;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/kyc/impl/flow/kyc_consolidated/KycConsolidatedFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Luki/c;", "feature_kyc_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class KycConsolidatedFlow extends ViewController<q> implements uki.c {
    public final KycConsolidatedFlowContract$InputData K;
    public final Object L;
    public final Object M;
    public final Object N;

    public KycConsolidatedFlow(KycConsolidatedFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: tv8.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ KycConsolidatedFlow f274732b;

            {
                this.f274732b = this;
            }

            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        KycConsolidatedFlow kycConsolidatedFlow = this.f274732b;
                        phm.a aVar = (phm.a) ue0.e.j(kycConsolidatedFlow.m2()).a().get(c0.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", c0.class, " is not found"));
                        }
                        c0 c0Var = ((c0) aVar2.b()).v;
                        KycConsolidatedFlowContract$InputData kycConsolidatedFlowContract$InputData = kycConsolidatedFlow.K;
                        kycConsolidatedFlowContract$InputData.getClass();
                        phm.a aVar3 = (phm.a) ue0.e.j(kycConsolidatedFlow.m2()).a().get(m.class);
                        b60.a aVar4 = aVar3 != null ? (b60.a) aVar3.get() : null;
                        if (aVar4 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", m.class, " is not found"));
                        }
                        q89.e eVarA = ((m) aVar4.b()).a();
                        eVarA.getClass();
                        return new d0(c0Var, kycConsolidatedFlowContract$InputData, eVarA);
                    case 1:
                        return (b) ((d0) this.f274732b.L.getValue()).f.get();
                    default:
                        KycConsolidatedFlow kycConsolidatedFlow2 = this.f274732b;
                        return czi.c.a(R$id.container, (b) kycConsolidatedFlow2.M.getValue(), kycConsolidatedFlow2);
                }
            }
        });
        final int i2 = 1;
        this.M = w.y0(new Function0(this) { // from class: tv8.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ KycConsolidatedFlow f274732b;

            {
                this.f274732b = this;
            }

            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        KycConsolidatedFlow kycConsolidatedFlow = this.f274732b;
                        phm.a aVar = (phm.a) ue0.e.j(kycConsolidatedFlow.m2()).a().get(c0.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", c0.class, " is not found"));
                        }
                        c0 c0Var = ((c0) aVar2.b()).v;
                        KycConsolidatedFlowContract$InputData kycConsolidatedFlowContract$InputData = kycConsolidatedFlow.K;
                        kycConsolidatedFlowContract$InputData.getClass();
                        phm.a aVar3 = (phm.a) ue0.e.j(kycConsolidatedFlow.m2()).a().get(m.class);
                        b60.a aVar4 = aVar3 != null ? (b60.a) aVar3.get() : null;
                        if (aVar4 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", m.class, " is not found"));
                        }
                        q89.e eVarA = ((m) aVar4.b()).a();
                        eVarA.getClass();
                        return new d0(c0Var, kycConsolidatedFlowContract$InputData, eVarA);
                    case 1:
                        return (b) ((d0) this.f274732b.L.getValue()).f.get();
                    default:
                        KycConsolidatedFlow kycConsolidatedFlow2 = this.f274732b;
                        return czi.c.a(R$id.container, (b) kycConsolidatedFlow2.M.getValue(), kycConsolidatedFlow2);
                }
            }
        });
        final int i3 = 2;
        this.N = w.y0(new Function0(this) { // from class: tv8.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ KycConsolidatedFlow f274732b;

            {
                this.f274732b = this;
            }

            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        KycConsolidatedFlow kycConsolidatedFlow = this.f274732b;
                        phm.a aVar = (phm.a) ue0.e.j(kycConsolidatedFlow.m2()).a().get(c0.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", c0.class, " is not found"));
                        }
                        c0 c0Var = ((c0) aVar2.b()).v;
                        KycConsolidatedFlowContract$InputData kycConsolidatedFlowContract$InputData = kycConsolidatedFlow.K;
                        kycConsolidatedFlowContract$InputData.getClass();
                        phm.a aVar3 = (phm.a) ue0.e.j(kycConsolidatedFlow.m2()).a().get(m.class);
                        b60.a aVar4 = aVar3 != null ? (b60.a) aVar3.get() : null;
                        if (aVar4 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", m.class, " is not found"));
                        }
                        q89.e eVarA = ((m) aVar4.b()).a();
                        eVarA.getClass();
                        return new d0(c0Var, kycConsolidatedFlowContract$InputData, eVarA);
                    case 1:
                        return (b) ((d0) this.f274732b.L.getValue()).f.get();
                    default:
                        KycConsolidatedFlow kycConsolidatedFlow2 = this.f274732b;
                        return czi.c.a(R$id.container, (b) kycConsolidatedFlow2.M.getValue(), kycConsolidatedFlow2);
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (d0) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final qji.b R1() {
        return (d0) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (tv8.b) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (uki.a) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final yki.c k() {
        return (uki.a) this.N.getValue();
    }
}
