package com.revolut.feature.revolutpay.impl.ui.flow.payment_breakdown;

import a0.d;
import aii.q;
import com.revolut.feature.revolutpay.api.shared.navigation.PaymentBreakdownControllerDescriptor$InputData;
import com.revolut.feature.revolutpay.impl.ui.flow.payment_breakdown.PaymentBreakdownFlow;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import czi.c;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import p7c.l;
import p7c.r;
import qji.b;
import te0.w;
import ue0.e;
import yki.f;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/revolutpay/impl/ui/flow/payment_breakdown/PaymentBreakdownFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Lyki/f;", "feature_revolut_pay_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PaymentBreakdownFlow extends ViewController<q> implements f {
    public final PaymentBreakdownControllerDescriptor$InputData K;
    public final int L;
    public final Object M;
    public final Object N;
    public final Object O;

    public PaymentBreakdownFlow(PaymentBreakdownControllerDescriptor$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_transparent;
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: y8c.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PaymentBreakdownFlow f311652b;

            {
                this.f311652b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        PaymentBreakdownFlow paymentBreakdownFlow = this.f311652b;
                        return c.d(R$id.screen_transparent_container, 4, null, paymentBreakdownFlow, (b) paymentBreakdownFlow.O.getValue());
                    case 1:
                        PaymentBreakdownFlow paymentBreakdownFlow2 = this.f311652b;
                        phm.a aVar = (phm.a) e.j(paymentBreakdownFlow2.m2()).a().get(r.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(d.q("Api ", r.class, " is not found"));
                        }
                        r rVar = ((r) aVar2.b()).D;
                        PaymentBreakdownControllerDescriptor$InputData paymentBreakdownControllerDescriptor$InputData = paymentBreakdownFlow2.K;
                        paymentBreakdownControllerDescriptor$InputData.getClass();
                        return new l(rVar, paymentBreakdownControllerDescriptor$InputData);
                    default:
                        return (b) ((l) this.f311652b.N.getValue()).d.get();
                }
            }
        });
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: y8c.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PaymentBreakdownFlow f311652b;

            {
                this.f311652b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        PaymentBreakdownFlow paymentBreakdownFlow = this.f311652b;
                        return c.d(R$id.screen_transparent_container, 4, null, paymentBreakdownFlow, (b) paymentBreakdownFlow.O.getValue());
                    case 1:
                        PaymentBreakdownFlow paymentBreakdownFlow2 = this.f311652b;
                        phm.a aVar = (phm.a) e.j(paymentBreakdownFlow2.m2()).a().get(r.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(d.q("Api ", r.class, " is not found"));
                        }
                        r rVar = ((r) aVar2.b()).D;
                        PaymentBreakdownControllerDescriptor$InputData paymentBreakdownControllerDescriptor$InputData = paymentBreakdownFlow2.K;
                        paymentBreakdownControllerDescriptor$InputData.getClass();
                        return new l(rVar, paymentBreakdownControllerDescriptor$InputData);
                    default:
                        return (b) ((l) this.f311652b.N.getValue()).d.get();
                }
            }
        });
        final int i3 = 2;
        this.O = w.y0(new Function0(this) { // from class: y8c.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PaymentBreakdownFlow f311652b;

            {
                this.f311652b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        PaymentBreakdownFlow paymentBreakdownFlow = this.f311652b;
                        return c.d(R$id.screen_transparent_container, 4, null, paymentBreakdownFlow, (b) paymentBreakdownFlow.O.getValue());
                    case 1:
                        PaymentBreakdownFlow paymentBreakdownFlow2 = this.f311652b;
                        phm.a aVar = (phm.a) e.j(paymentBreakdownFlow2.m2()).a().get(r.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(d.q("Api ", r.class, " is not found"));
                        }
                        r rVar = ((r) aVar2.b()).D;
                        PaymentBreakdownControllerDescriptor$InputData paymentBreakdownControllerDescriptor$InputData = paymentBreakdownFlow2.K;
                        paymentBreakdownControllerDescriptor$InputData.getClass();
                        return new l(rVar, paymentBreakdownControllerDescriptor$InputData);
                    default:
                        return (b) ((l) this.f311652b.N.getValue()).d.get();
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (l) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final b R1() {
        return (l) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (y8c.b) this.O.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getP() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final yki.c k() {
        return (yki.c) this.M.getValue();
    }
}
