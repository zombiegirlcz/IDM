package com.revolut.feature.payments.profile.impl.ui_kompot.lazy_flow;

import a0.d;
import aii.q;
import com.revolut.feature.payments.profile.impl.ui_kompot.lazy_flow.PaymentProfileLazyFlow;
import com.revolut.feature.payments.profile.impl.ui_kompot.lazy_flow.PaymentProfileLazyFlowContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import ow9.g;
import ow9.l;
import te0.w;
import ue0.e;
import yki.c;
import yki.f;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/payments/profile/impl/ui_kompot/lazy_flow/PaymentProfileLazyFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Lyki/f;", "retail_feature_payments_profile_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PaymentProfileLazyFlow extends ViewController<q> implements f {
    public final PaymentProfileLazyFlowContract$InputData K;
    public final Object L;
    public final Object M;

    public PaymentProfileLazyFlow(PaymentProfileLazyFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: xw9.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PaymentProfileLazyFlow f309335b;

            {
                this.f309335b = this;
            }

            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        PaymentProfileLazyFlow paymentProfileLazyFlow = this.f309335b;
                        phm.a aVar = (phm.a) e.j(paymentProfileLazyFlow.m2()).a().get(l.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(d.q("Api ", l.class, " is not found"));
                        }
                        ow9.e eVar = ((ow9.e) aVar2.b()).z;
                        PaymentProfileLazyFlowContract$InputData paymentProfileLazyFlowContract$InputData = paymentProfileLazyFlow.K;
                        paymentProfileLazyFlowContract$InputData.getClass();
                        return new g(eVar, paymentProfileLazyFlowContract$InputData);
                    default:
                        PaymentProfileLazyFlow paymentProfileLazyFlow2 = this.f309335b;
                        return czi.c.d(0, 6, null, paymentProfileLazyFlow2, (b) ((g) paymentProfileLazyFlow2.L.getValue()).f230376b.get());
                }
            }
        });
        final int i2 = 1;
        this.M = w.y0(new Function0(this) { // from class: xw9.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PaymentProfileLazyFlow f309335b;

            {
                this.f309335b = this;
            }

            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        PaymentProfileLazyFlow paymentProfileLazyFlow = this.f309335b;
                        phm.a aVar = (phm.a) e.j(paymentProfileLazyFlow.m2()).a().get(l.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(d.q("Api ", l.class, " is not found"));
                        }
                        ow9.e eVar = ((ow9.e) aVar2.b()).z;
                        PaymentProfileLazyFlowContract$InputData paymentProfileLazyFlowContract$InputData = paymentProfileLazyFlow.K;
                        paymentProfileLazyFlowContract$InputData.getClass();
                        return new g(eVar, paymentProfileLazyFlowContract$InputData);
                    default:
                        PaymentProfileLazyFlow paymentProfileLazyFlow2 = this.f309335b;
                        return czi.c.d(0, 6, null, paymentProfileLazyFlow2, (b) ((g) paymentProfileLazyFlow2.L.getValue()).f230376b.get());
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (g) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final qji.b R1() {
        return (g) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b h3() {
        return (xw9.b) ((g) this.L.getValue()).f230376b.get();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final c k() {
        return (c) this.M.getValue();
    }
}
