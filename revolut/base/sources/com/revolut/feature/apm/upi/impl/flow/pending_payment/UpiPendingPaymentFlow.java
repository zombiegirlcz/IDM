package com.revolut.feature.apm.upi.impl.flow.pending_payment;

import aii.q;
import com.revolut.feature.apm.upi.impl.flow.pending_payment.UpiPendingPaymentFlow;
import com.revolut.feature.apm.upi.impl.flow.pending_payment.UpiPendingPaymentFlowContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import if2.k;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import qji.b;
import te0.w;
import xki.e;
import yki.c;
import yki.f;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/apm/upi/impl/flow/pending_payment/UpiPendingPaymentFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Lyki/f;", "feature_apm_upi_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class UpiPendingPaymentFlow extends ViewController<q> implements f {
    public final UpiPendingPaymentFlowContract$InputData K;
    public final Object L;
    public final Object M;
    public final Object N;

    public UpiPendingPaymentFlow(UpiPendingPaymentFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: yf2.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ UpiPendingPaymentFlow f313150b;

            {
                this.f313150b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        return (b) ((k) this.f313150b.M.getValue()).d.get();
                    case 1:
                        UpiPendingPaymentFlow upiPendingPaymentFlow = this.f313150b;
                        phm.a aVar = (phm.a) ue0.e.j(upiPendingPaymentFlow.m2()).a().get(if2.f.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", if2.f.class, " is not found"));
                        }
                        if2.f fVar = ((if2.f) aVar2.b()).f160865w;
                        UpiPendingPaymentFlowContract$InputData upiPendingPaymentFlowContract$InputData = upiPendingPaymentFlow.K;
                        upiPendingPaymentFlowContract$InputData.getClass();
                        return new k(fVar, upiPendingPaymentFlowContract$InputData);
                    default:
                        UpiPendingPaymentFlow upiPendingPaymentFlow2 = this.f313150b;
                        return czi.c.d(0, 6, null, upiPendingPaymentFlow2, (b) upiPendingPaymentFlow2.L.getValue());
                }
            }
        });
        final int i2 = 1;
        this.M = w.y0(new Function0(this) { // from class: yf2.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ UpiPendingPaymentFlow f313150b;

            {
                this.f313150b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        return (b) ((k) this.f313150b.M.getValue()).d.get();
                    case 1:
                        UpiPendingPaymentFlow upiPendingPaymentFlow = this.f313150b;
                        phm.a aVar = (phm.a) ue0.e.j(upiPendingPaymentFlow.m2()).a().get(if2.f.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", if2.f.class, " is not found"));
                        }
                        if2.f fVar = ((if2.f) aVar2.b()).f160865w;
                        UpiPendingPaymentFlowContract$InputData upiPendingPaymentFlowContract$InputData = upiPendingPaymentFlow.K;
                        upiPendingPaymentFlowContract$InputData.getClass();
                        return new k(fVar, upiPendingPaymentFlowContract$InputData);
                    default:
                        UpiPendingPaymentFlow upiPendingPaymentFlow2 = this.f313150b;
                        return czi.c.d(0, 6, null, upiPendingPaymentFlow2, (b) upiPendingPaymentFlow2.L.getValue());
                }
            }
        });
        final int i3 = 2;
        this.N = w.y0(new Function0(this) { // from class: yf2.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ UpiPendingPaymentFlow f313150b;

            {
                this.f313150b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        return (b) ((k) this.f313150b.M.getValue()).d.get();
                    case 1:
                        UpiPendingPaymentFlow upiPendingPaymentFlow = this.f313150b;
                        phm.a aVar = (phm.a) ue0.e.j(upiPendingPaymentFlow.m2()).a().get(if2.f.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", if2.f.class, " is not found"));
                        }
                        if2.f fVar = ((if2.f) aVar2.b()).f160865w;
                        UpiPendingPaymentFlowContract$InputData upiPendingPaymentFlowContract$InputData = upiPendingPaymentFlow.K;
                        upiPendingPaymentFlowContract$InputData.getClass();
                        return new k(fVar, upiPendingPaymentFlowContract$InputData);
                    default:
                        UpiPendingPaymentFlow upiPendingPaymentFlow2 = this.f313150b;
                        return czi.c.d(0, 6, null, upiPendingPaymentFlow2, (b) upiPendingPaymentFlow2.L.getValue());
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (k) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final b R1() {
        return (k) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (yf2.b) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final c k() {
        return (c) this.N.getValue();
    }
}
