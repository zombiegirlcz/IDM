package com.revolut.feature.pay_later.impl.ui.paymentoptions.flow;

import aii.q;
import com.revolut.feature.pay_later.impl.ui.paymentoptions.flow.PaymentOptionsFlow;
import com.revolut.feature.pay_later.impl.ui.paymentoptions.flow.PaymentOptionsFlowContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import czi.c;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import qji.b;
import te0.w;
import xki.e;
import yki.f;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/pay_later/impl/ui/paymentoptions/flow/PaymentOptionsFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Lyki/f;", "feature_pay_later_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PaymentOptionsFlow extends ViewController<q> implements f {
    public final PaymentOptionsFlowContract$InputData K;
    public final Object L;
    public final Object M;
    public final Object N;

    public PaymentOptionsFlow(PaymentOptionsFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: yj9.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PaymentOptionsFlow f314443b;

            {
                this.f314443b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        PaymentOptionsFlow paymentOptionsFlow = this.f314443b;
                        return c.d(0, 6, null, paymentOptionsFlow, (b) paymentOptionsFlow.N.getValue());
                    case 1:
                        PaymentOptionsFlow paymentOptionsFlow2 = this.f314443b;
                        oi9.f fVar = s.n(paymentOptionsFlow2.m2()).v;
                        PaymentOptionsFlowContract$InputData paymentOptionsFlowContract$InputData = paymentOptionsFlow2.K;
                        paymentOptionsFlowContract$InputData.getClass();
                        return new oi9.s(fVar, paymentOptionsFlowContract$InputData);
                    default:
                        return (b) ((oi9.s) this.f314443b.M.getValue()).d.get();
                }
            }
        });
        final int i2 = 1;
        this.M = w.y0(new Function0(this) { // from class: yj9.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PaymentOptionsFlow f314443b;

            {
                this.f314443b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        PaymentOptionsFlow paymentOptionsFlow = this.f314443b;
                        return c.d(0, 6, null, paymentOptionsFlow, (b) paymentOptionsFlow.N.getValue());
                    case 1:
                        PaymentOptionsFlow paymentOptionsFlow2 = this.f314443b;
                        oi9.f fVar = s.n(paymentOptionsFlow2.m2()).v;
                        PaymentOptionsFlowContract$InputData paymentOptionsFlowContract$InputData = paymentOptionsFlow2.K;
                        paymentOptionsFlowContract$InputData.getClass();
                        return new oi9.s(fVar, paymentOptionsFlowContract$InputData);
                    default:
                        return (b) ((oi9.s) this.f314443b.M.getValue()).d.get();
                }
            }
        });
        final int i3 = 2;
        this.N = w.y0(new Function0(this) { // from class: yj9.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PaymentOptionsFlow f314443b;

            {
                this.f314443b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        PaymentOptionsFlow paymentOptionsFlow = this.f314443b;
                        return c.d(0, 6, null, paymentOptionsFlow, (b) paymentOptionsFlow.N.getValue());
                    case 1:
                        PaymentOptionsFlow paymentOptionsFlow2 = this.f314443b;
                        oi9.f fVar = s.n(paymentOptionsFlow2.m2()).v;
                        PaymentOptionsFlowContract$InputData paymentOptionsFlowContract$InputData = paymentOptionsFlow2.K;
                        paymentOptionsFlowContract$InputData.getClass();
                        return new oi9.s(fVar, paymentOptionsFlowContract$InputData);
                    default:
                        return (b) ((oi9.s) this.f314443b.M.getValue()).d.get();
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (oi9.s) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final b R1() {
        return (oi9.s) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (yj9.b) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final yki.c k() {
        return (yki.c) this.L.getValue();
    }
}
