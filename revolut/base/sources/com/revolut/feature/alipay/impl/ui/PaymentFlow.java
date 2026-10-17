package com.revolut.feature.alipay.impl.ui;

import aii.q;
import com.revolut.feature.alipay.impl.ui.PaymentFlow;
import com.revolut.feature.alipay.impl.ui.PaymentFlowContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import ok1.l;
import qji.b;
import te0.w;
import xki.e;
import yki.c;
import yki.f;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/alipay/impl/ui/PaymentFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Lyki/f;", "feature_alipay_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PaymentFlow extends ViewController<q> implements f {
    public final PaymentFlowContract$InputData K;
    public final Object L;
    public final Object M;
    public final Object N;

    public PaymentFlow() {
        this(0);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (l) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final b R1() {
        return (l) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (sk1.b) this.N.getValue();
    }

    public PaymentFlow(PaymentFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: sk1.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PaymentFlow f263752b;

            {
                this.f263752b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        PaymentFlow paymentFlow = this.f263752b;
                        return czi.c.d(0, 6, null, paymentFlow, (b) paymentFlow.N.getValue());
                    case 1:
                        PaymentFlow paymentFlow2 = this.f263752b;
                        phm.a aVar = (phm.a) ue0.e.j(paymentFlow2.m2()).a().get(ok1.d.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", ok1.d.class, " is not found"));
                        }
                        ok1.d dVar = ((ok1.d) aVar2.b()).f225863h;
                        PaymentFlowContract$InputData paymentFlowContract$InputData = paymentFlow2.K;
                        paymentFlowContract$InputData.getClass();
                        return new l(dVar, paymentFlowContract$InputData);
                    default:
                        return (b) ((l) this.f263752b.M.getValue()).f225887c.get();
                }
            }
        });
        final int i2 = 1;
        this.M = w.y0(new Function0(this) { // from class: sk1.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PaymentFlow f263752b;

            {
                this.f263752b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        PaymentFlow paymentFlow = this.f263752b;
                        return czi.c.d(0, 6, null, paymentFlow, (b) paymentFlow.N.getValue());
                    case 1:
                        PaymentFlow paymentFlow2 = this.f263752b;
                        phm.a aVar = (phm.a) ue0.e.j(paymentFlow2.m2()).a().get(ok1.d.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", ok1.d.class, " is not found"));
                        }
                        ok1.d dVar = ((ok1.d) aVar2.b()).f225863h;
                        PaymentFlowContract$InputData paymentFlowContract$InputData = paymentFlow2.K;
                        paymentFlowContract$InputData.getClass();
                        return new l(dVar, paymentFlowContract$InputData);
                    default:
                        return (b) ((l) this.f263752b.M.getValue()).f225887c.get();
                }
            }
        });
        final int i3 = 2;
        this.N = w.y0(new Function0(this) { // from class: sk1.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PaymentFlow f263752b;

            {
                this.f263752b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        PaymentFlow paymentFlow = this.f263752b;
                        return czi.c.d(0, 6, null, paymentFlow, (b) paymentFlow.N.getValue());
                    case 1:
                        PaymentFlow paymentFlow2 = this.f263752b;
                        phm.a aVar = (phm.a) ue0.e.j(paymentFlow2.m2()).a().get(ok1.d.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", ok1.d.class, " is not found"));
                        }
                        ok1.d dVar = ((ok1.d) aVar2.b()).f225863h;
                        PaymentFlowContract$InputData paymentFlowContract$InputData = paymentFlow2.K;
                        paymentFlowContract$InputData.getClass();
                        return new l(dVar, paymentFlowContract$InputData);
                    default:
                        return (b) ((l) this.f263752b.M.getValue()).f225887c.get();
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final c k() {
        return (c) this.L.getValue();
    }

    public /* synthetic */ PaymentFlow(int i) {
        this(new PaymentFlowContract$InputData(null));
    }
}
