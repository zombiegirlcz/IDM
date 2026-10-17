package com.revolut.feature.kyc.impl.egov_kyc.flow;

import com.revolut.feature.kyc.impl.egov_kyc.flow.EgovKycFlow;
import com.revolut.feature.kyc.impl.egov_kyc.flow.EgovKycFlowContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import czi.c;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import qji.b;
import ss8.d;
import te0.w;
import ue0.e;
import yki.f;
import zu8.c0;
import zu8.k;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/kyc/impl/egov_kyc/flow/EgovKycFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lss8/d;", "Lyki/f;", "feature_kyc_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class EgovKycFlow extends ViewController<d> implements f {
    public final EgovKycFlowContract$InputData K;
    public final Object L;
    public final Object M;
    public final Object N;

    public EgovKycFlow(EgovKycFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: fv8.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EgovKycFlow f138384b;

            {
                this.f138384b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        EgovKycFlow egovKycFlow = this.f138384b;
                        phm.a aVar = (phm.a) e.j(egovKycFlow.m2()).a().get(c0.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", c0.class, " is not found"));
                        }
                        c0 c0Var = ((c0) aVar2.b()).v;
                        EgovKycFlowContract$InputData egovKycFlowContract$InputData = egovKycFlow.K;
                        egovKycFlowContract$InputData.getClass();
                        return new k(c0Var, egovKycFlowContract$InputData);
                    case 1:
                        return (b) ((k) this.f138384b.L.getValue()).d.get();
                    default:
                        EgovKycFlow egovKycFlow2 = this.f138384b;
                        return c.d(0, 6, null, egovKycFlow2, (b) egovKycFlow2.M.getValue());
                }
            }
        });
        final int i2 = 1;
        this.M = w.y0(new Function0(this) { // from class: fv8.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EgovKycFlow f138384b;

            {
                this.f138384b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        EgovKycFlow egovKycFlow = this.f138384b;
                        phm.a aVar = (phm.a) e.j(egovKycFlow.m2()).a().get(c0.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", c0.class, " is not found"));
                        }
                        c0 c0Var = ((c0) aVar2.b()).v;
                        EgovKycFlowContract$InputData egovKycFlowContract$InputData = egovKycFlow.K;
                        egovKycFlowContract$InputData.getClass();
                        return new k(c0Var, egovKycFlowContract$InputData);
                    case 1:
                        return (b) ((k) this.f138384b.L.getValue()).d.get();
                    default:
                        EgovKycFlow egovKycFlow2 = this.f138384b;
                        return c.d(0, 6, null, egovKycFlow2, (b) egovKycFlow2.M.getValue());
                }
            }
        });
        final int i3 = 2;
        this.N = w.y0(new Function0(this) { // from class: fv8.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EgovKycFlow f138384b;

            {
                this.f138384b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        EgovKycFlow egovKycFlow = this.f138384b;
                        phm.a aVar = (phm.a) e.j(egovKycFlow.m2()).a().get(c0.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", c0.class, " is not found"));
                        }
                        c0 c0Var = ((c0) aVar2.b()).v;
                        EgovKycFlowContract$InputData egovKycFlowContract$InputData = egovKycFlow.K;
                        egovKycFlowContract$InputData.getClass();
                        return new k(c0Var, egovKycFlowContract$InputData);
                    case 1:
                        return (b) ((k) this.f138384b.L.getValue()).d.get();
                    default:
                        EgovKycFlow egovKycFlow2 = this.f138384b;
                        return c.d(0, 6, null, egovKycFlow2, (b) egovKycFlow2.M.getValue());
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (k) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final b R1() {
        return (k) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (fv8.b) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final yki.c k() {
        return (yki.c) this.N.getValue();
    }
}
