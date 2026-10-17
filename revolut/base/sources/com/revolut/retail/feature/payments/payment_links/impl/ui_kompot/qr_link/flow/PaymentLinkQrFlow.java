package com.revolut.retail.feature.payments.payment_links.impl.ui_kompot.qr_link.flow;

import a0.d;
import aii.q;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.payments.payment_links.impl.ui_kompot.qr_link.flow.PaymentLinkQrFlow;
import czi.c;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import q7k.g;
import q7k.j;
import te0.w;
import ue0.e;
import yki.f;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/retail/feature/payments/payment_links/impl/ui_kompot/qr_link/flow/PaymentLinkQrFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Lyki/f;", "<init>", "()V", "feature_payments_payment_links_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PaymentLinkQrFlow extends ViewController<q> implements f {
    public final int K = R$layout.screen_transparent;
    public final Object L;
    public final Object M;
    public final Object N;

    public PaymentLinkQrFlow() {
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: h8k.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PaymentLinkQrFlow f150064b;

            {
                this.f150064b = this;
            }

            /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        PaymentLinkQrFlow paymentLinkQrFlow = this.f150064b;
                        return c.d(R$id.screen_transparent_container, 4, null, paymentLinkQrFlow, (b) paymentLinkQrFlow.N.getValue());
                    case 1:
                        phm.a aVar = (phm.a) e.j(this.f150064b.m2()).a().get(f7k.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(d.q("Api ", f7k.a.class, " is not found"));
                        }
                        j jVar = ((j) aVar2.b()).G;
                        g gVar = new g();
                        gVar.f242884a = e4m.b.b(new q7k.e(jVar, 1));
                        return gVar;
                    default:
                        return (b) ((g) this.f150064b.M.getValue()).f242884a.get();
                }
            }
        });
        final int i2 = 1;
        this.M = w.y0(new Function0(this) { // from class: h8k.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PaymentLinkQrFlow f150064b;

            {
                this.f150064b = this;
            }

            /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        PaymentLinkQrFlow paymentLinkQrFlow = this.f150064b;
                        return c.d(R$id.screen_transparent_container, 4, null, paymentLinkQrFlow, (b) paymentLinkQrFlow.N.getValue());
                    case 1:
                        phm.a aVar = (phm.a) e.j(this.f150064b.m2()).a().get(f7k.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(d.q("Api ", f7k.a.class, " is not found"));
                        }
                        j jVar = ((j) aVar2.b()).G;
                        g gVar = new g();
                        gVar.f242884a = e4m.b.b(new q7k.e(jVar, 1));
                        return gVar;
                    default:
                        return (b) ((g) this.f150064b.M.getValue()).f242884a.get();
                }
            }
        });
        final int i3 = 2;
        this.N = w.y0(new Function0(this) { // from class: h8k.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PaymentLinkQrFlow f150064b;

            {
                this.f150064b = this;
            }

            /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        PaymentLinkQrFlow paymentLinkQrFlow = this.f150064b;
                        return c.d(R$id.screen_transparent_container, 4, null, paymentLinkQrFlow, (b) paymentLinkQrFlow.N.getValue());
                    case 1:
                        phm.a aVar = (phm.a) e.j(this.f150064b.m2()).a().get(f7k.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(d.q("Api ", f7k.a.class, " is not found"));
                        }
                        j jVar = ((j) aVar2.b()).G;
                        g gVar = new g();
                        gVar.f242884a = e4m.b.b(new q7k.e(jVar, 1));
                        return gVar;
                    default:
                        return (b) ((g) this.f150064b.M.getValue()).f242884a.get();
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (g) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final qji.b R1() {
        return (g) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (h8k.b) this.N.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getP() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final yki.c k() {
        return (yki.c) this.L.getValue();
    }
}
