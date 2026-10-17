package com.revolut.retail.feature.payments.payment_links.impl.ui_kompot.flow;

import aii.q;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.payments.payment_links.api.navigation.PaymentLinksFeatureInputData;
import com.revolut.retail.feature.payments.payment_links.impl.ui_kompot.flow.PaymentLinksTransferFlow;
import e58.d;
import e8k.a;
import in0.g;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import q7k.k;
import qji.b;
import te0.w;
import xki.e;
import yki.c;
import yki.f;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/payments/payment_links/impl/ui_kompot/flow/PaymentLinksTransferFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Lyki/f;", "Lin0/g;", "feature_payments_payment_links_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PaymentLinksTransferFlow extends ViewController<q> implements f, g {
    public final Object K;
    public final Object L;
    public final Object M;

    public PaymentLinksTransferFlow(PaymentLinksFeatureInputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = w.y0(new d(this, inputData, 6));
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: e8k.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PaymentLinksTransferFlow f123746b;

            {
                this.f123746b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        return (a) ((k) this.f123746b.K.getValue()).d.get();
                    default:
                        PaymentLinksTransferFlow paymentLinksTransferFlow = this.f123746b;
                        return czi.c.d(0, 6, null, paymentLinksTransferFlow, (a) paymentLinksTransferFlow.L.getValue());
                }
            }
        });
        final int i2 = 1;
        this.M = w.y0(new Function0(this) { // from class: e8k.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PaymentLinksTransferFlow f123746b;

            {
                this.f123746b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        return (a) ((k) this.f123746b.K.getValue()).d.get();
                    default:
                        PaymentLinksTransferFlow paymentLinksTransferFlow = this.f123746b;
                        return czi.c.d(0, 6, null, paymentLinksTransferFlow, (a) paymentLinksTransferFlow.L.getValue());
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (k) this.K.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final b R1() {
        return (k) this.K.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (a) this.L.getValue();
    }

    @Override // in0.g
    public final boolean p0() {
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final c k() {
        return (c) this.M.getValue();
    }
}
