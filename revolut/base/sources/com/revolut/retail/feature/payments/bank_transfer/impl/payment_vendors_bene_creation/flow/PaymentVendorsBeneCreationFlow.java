package com.revolut.retail.feature.payments.bank_transfer.impl.payment_vendors_bene_creation.flow;

import a0.d;
import aii.q;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.payments.bank_transfer.impl.payment_vendors_bene_creation.flow.PaymentVendorsBeneCreationFlow;
import com.revolut.retail.feature.payments.bank_transfer.impl.payment_vendors_bene_creation.flow.PaymentVendorsBeneCreationFlowContract$InputData;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import p2k.h0;
import p2k.v;
import p2k.x;
import qji.b;
import te0.w;
import ue0.e;
import yki.c;
import yki.f;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/payments/bank_transfer/impl/payment_vendors_bene_creation/flow/PaymentVendorsBeneCreationFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Lyki/f;", "feature_payments_bank_transfer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PaymentVendorsBeneCreationFlow extends ViewController<q> implements f {
    public final PaymentVendorsBeneCreationFlowContract$InputData K;
    public final Object L;
    public final Object M;
    public final Object N;

    public PaymentVendorsBeneCreationFlow(PaymentVendorsBeneCreationFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: a3k.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PaymentVendorsBeneCreationFlow f1168b;

            {
                this.f1168b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        PaymentVendorsBeneCreationFlow paymentVendorsBeneCreationFlow = this.f1168b;
                        return czi.c.d(0, 6, null, paymentVendorsBeneCreationFlow, (b) paymentVendorsBeneCreationFlow.N.getValue());
                    case 1:
                        PaymentVendorsBeneCreationFlow paymentVendorsBeneCreationFlow2 = this.f1168b;
                        phm.a aVar = (phm.a) e.j(paymentVendorsBeneCreationFlow2.m2()).a().get(h0.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(d.q("Api ", h0.class, " is not found"));
                        }
                        x xVar = ((x) aVar2.b()).K;
                        PaymentVendorsBeneCreationFlowContract$InputData paymentVendorsBeneCreationFlowContract$InputData = paymentVendorsBeneCreationFlow2.K;
                        paymentVendorsBeneCreationFlowContract$InputData.getClass();
                        return new v(xVar, paymentVendorsBeneCreationFlow2, paymentVendorsBeneCreationFlowContract$InputData);
                    default:
                        return (b) ((v) this.f1168b.M.getValue()).e.get();
                }
            }
        });
        final int i2 = 1;
        this.M = w.y0(new Function0(this) { // from class: a3k.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PaymentVendorsBeneCreationFlow f1168b;

            {
                this.f1168b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        PaymentVendorsBeneCreationFlow paymentVendorsBeneCreationFlow = this.f1168b;
                        return czi.c.d(0, 6, null, paymentVendorsBeneCreationFlow, (b) paymentVendorsBeneCreationFlow.N.getValue());
                    case 1:
                        PaymentVendorsBeneCreationFlow paymentVendorsBeneCreationFlow2 = this.f1168b;
                        phm.a aVar = (phm.a) e.j(paymentVendorsBeneCreationFlow2.m2()).a().get(h0.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(d.q("Api ", h0.class, " is not found"));
                        }
                        x xVar = ((x) aVar2.b()).K;
                        PaymentVendorsBeneCreationFlowContract$InputData paymentVendorsBeneCreationFlowContract$InputData = paymentVendorsBeneCreationFlow2.K;
                        paymentVendorsBeneCreationFlowContract$InputData.getClass();
                        return new v(xVar, paymentVendorsBeneCreationFlow2, paymentVendorsBeneCreationFlowContract$InputData);
                    default:
                        return (b) ((v) this.f1168b.M.getValue()).e.get();
                }
            }
        });
        final int i3 = 2;
        this.N = w.y0(new Function0(this) { // from class: a3k.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PaymentVendorsBeneCreationFlow f1168b;

            {
                this.f1168b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        PaymentVendorsBeneCreationFlow paymentVendorsBeneCreationFlow = this.f1168b;
                        return czi.c.d(0, 6, null, paymentVendorsBeneCreationFlow, (b) paymentVendorsBeneCreationFlow.N.getValue());
                    case 1:
                        PaymentVendorsBeneCreationFlow paymentVendorsBeneCreationFlow2 = this.f1168b;
                        phm.a aVar = (phm.a) e.j(paymentVendorsBeneCreationFlow2.m2()).a().get(h0.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(d.q("Api ", h0.class, " is not found"));
                        }
                        x xVar = ((x) aVar2.b()).K;
                        PaymentVendorsBeneCreationFlowContract$InputData paymentVendorsBeneCreationFlowContract$InputData = paymentVendorsBeneCreationFlow2.K;
                        paymentVendorsBeneCreationFlowContract$InputData.getClass();
                        return new v(xVar, paymentVendorsBeneCreationFlow2, paymentVendorsBeneCreationFlowContract$InputData);
                    default:
                        return (b) ((v) this.f1168b.M.getValue()).e.get();
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (v) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final b R1() {
        return (v) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (a3k.b) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final c k() {
        return (c) this.L.getValue();
    }
}
