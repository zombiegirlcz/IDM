package com.revolut.feature.payments.air.widget.impl.ui.flow;

import aii.q;
import com.revolut.feature.payments.air.widget.impl.model.PaymentWidget;
import com.revolut.feature.payments.air.widget.impl.ui.chat.ResolvedRecipient;
import com.revolut.feature.payments.air.widget.impl.ui.flow.AirPaymentTransferFlow;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import qo9.c;
import te0.w;
import xki.e;
import yki.f;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/payments/air/widget/impl/ui/flow/AirPaymentTransferFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Lyki/f;", "feature_payments_air_widget_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AirPaymentTransferFlow extends ViewController<q> implements f {
    public final PaymentWidget K;
    public final ResolvedRecipient L;
    public final int M;
    public final Object N;
    public final Object O;
    public final Object P;

    public AirPaymentTransferFlow(PaymentWidget widget, ResolvedRecipient resolvedRecipient) {
        Intrinsics.checkNotNullParameter(widget, "widget");
        Intrinsics.checkNotNullParameter(resolvedRecipient, "resolvedRecipient");
        this.K = widget;
        this.L = resolvedRecipient;
        this.M = R$layout.screen_transparent;
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: qo9.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AirPaymentTransferFlow f248077b;

            {
                this.f248077b = this;
            }

            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        AirPaymentTransferFlow airPaymentTransferFlow = this.f248077b;
                        phm.a aVar = (phm.a) ue0.e.j(airPaymentTransferFlow.m2()).a().get(jo9.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", jo9.b.class, " is not found"));
                        }
                        mo9.b bVar = ((mo9.b) ((mo9.c) aVar2.b())).o;
                        PaymentWidget paymentWidget = airPaymentTransferFlow.K;
                        paymentWidget.getClass();
                        ResolvedRecipient resolvedRecipient2 = airPaymentTransferFlow.L;
                        resolvedRecipient2.getClass();
                        return new mo9.a(bVar, airPaymentTransferFlow, paymentWidget, resolvedRecipient2);
                    case 1:
                        return (c) ((mo9.a) this.f248077b.N.getValue()).f207574l.get();
                    default:
                        AirPaymentTransferFlow airPaymentTransferFlow2 = this.f248077b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, airPaymentTransferFlow2, (c) airPaymentTransferFlow2.O.getValue());
                }
            }
        });
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: qo9.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AirPaymentTransferFlow f248077b;

            {
                this.f248077b = this;
            }

            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        AirPaymentTransferFlow airPaymentTransferFlow = this.f248077b;
                        phm.a aVar = (phm.a) ue0.e.j(airPaymentTransferFlow.m2()).a().get(jo9.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", jo9.b.class, " is not found"));
                        }
                        mo9.b bVar = ((mo9.b) ((mo9.c) aVar2.b())).o;
                        PaymentWidget paymentWidget = airPaymentTransferFlow.K;
                        paymentWidget.getClass();
                        ResolvedRecipient resolvedRecipient2 = airPaymentTransferFlow.L;
                        resolvedRecipient2.getClass();
                        return new mo9.a(bVar, airPaymentTransferFlow, paymentWidget, resolvedRecipient2);
                    case 1:
                        return (c) ((mo9.a) this.f248077b.N.getValue()).f207574l.get();
                    default:
                        AirPaymentTransferFlow airPaymentTransferFlow2 = this.f248077b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, airPaymentTransferFlow2, (c) airPaymentTransferFlow2.O.getValue());
                }
            }
        });
        final int i3 = 2;
        this.P = w.y0(new Function0(this) { // from class: qo9.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AirPaymentTransferFlow f248077b;

            {
                this.f248077b = this;
            }

            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        AirPaymentTransferFlow airPaymentTransferFlow = this.f248077b;
                        phm.a aVar = (phm.a) ue0.e.j(airPaymentTransferFlow.m2()).a().get(jo9.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", jo9.b.class, " is not found"));
                        }
                        mo9.b bVar = ((mo9.b) ((mo9.c) aVar2.b())).o;
                        PaymentWidget paymentWidget = airPaymentTransferFlow.K;
                        paymentWidget.getClass();
                        ResolvedRecipient resolvedRecipient2 = airPaymentTransferFlow.L;
                        resolvedRecipient2.getClass();
                        return new mo9.a(bVar, airPaymentTransferFlow, paymentWidget, resolvedRecipient2);
                    case 1:
                        return (c) ((mo9.a) this.f248077b.N.getValue()).f207574l.get();
                    default:
                        AirPaymentTransferFlow airPaymentTransferFlow2 = this.f248077b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, airPaymentTransferFlow2, (c) airPaymentTransferFlow2.O.getValue());
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (mo9.a) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final qji.b R1() {
        return (mo9.a) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (c) this.O.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getO() {
        return this.M;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final yki.c k() {
        return (yki.c) this.P.getValue();
    }
}
