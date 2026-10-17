package com.revolut.feature.revolutpay.order_tracking.impl.ui.add_shipping_tracking;

import com.revolut.feature.revolutpay.order_tracking.models.delivery.DeliveryCarrier;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final class a extends i implements Function1 {
    public int u;
    public final /* synthetic */ b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ DeliveryCarrier f84607w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, DeliveryCarrier deliveryCarrier, Continuation continuation) {
        super(1, continuation);
        this.v = bVar;
        this.f84607w = deliveryCarrier;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new a(this.v, this.f84607w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((a) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0060, code lost:
    
        if (r2 == r4) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00a8, code lost:
    
        if (r2 == r4) goto L24;
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) throws java.lang.Throwable {
        /*
            r18 = this;
            r0 = r18
            com.revolut.feature.revolutpay.order_tracking.impl.ui.add_shipping_tracking.b r1 = r0.v
            cli.y r2 = r1.f84609q
            tul.b r3 = r1.o
            fim.a r4 = fim.a.COROUTINE_SUSPENDED
            int r5 = r0.u
            java.lang.String r6 = "Required value was null."
            r7 = 2
            r8 = 1
            if (r5 == 0) goto L2b
            if (r5 == r8) goto L25
            if (r5 != r7) goto L1d
            yhm.o.b(r19)
            r2 = r19
            goto Lab
        L1d:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L25:
            yhm.o.b(r19)
            r2 = r19
            goto L63
        L2b:
            yhm.o.b(r19)
            com.revolut.feature.revolutpay.order_tracking.impl.ui.add_shipping_tracking.AddShippingTrackingScreenContract$InputData r5 = r1.f84608p
            com.revolut.feature.revolutpay.order_tracking.impl.ui.add_shipping_tracking.AddShippingTrackingScreenContract$TrackingRequest r5 = r5.f84602a
            boolean r9 = r5 instanceof com.revolut.feature.revolutpay.order_tracking.impl.ui.add_shipping_tracking.AddShippingTrackingScreenContract$TrackingRequest.Add
            com.revolut.feature.revolutpay.order_tracking.models.delivery.DeliveryCarrier r10 = r0.f84607w
            if (r9 == 0) goto L76
            com.revolut.feature.revolutpay.order_tracking.impl.ui.add_shipping_tracking.AddShippingTrackingScreenContract$TrackingRequest$Add r5 = (com.revolut.feature.revolutpay.order_tracking.impl.ui.add_shipping_tracking.AddShippingTrackingScreenContract$TrackingRequest.Add) r5
            java.lang.String r13 = r5.f84604a
            java.lang.String r15 = r10.f84654a
            r0.u = r8
            java.lang.Object r2 = r2.f22677a
            vkm.j2 r2 = (vkm.j2) r2
            java.lang.Object r2 = r2.getValue()
            zac.f r2 = (zac.f) r2
            java.lang.String r14 = r2.f320648a
            java.lang.Object r2 = r3.f274637b
            r12 = r2
            qac.i r12 = (qac.i) r12
            mp6.j r11 = new mp6.j
            r16 = 0
            r11.<init>(r12, r13, r14, r15, r16)
            skm.p0 r2 = skm.p0.f264001a
            elm.f r2 = elm.f.f127540b
            java.lang.Object r2 = skm.e0.J(r2, r11, r0)
            if (r2 != r4) goto L63
            goto Laa
        L63:
            com.revolut.feature.revolutpay.order_tracking.models.delivery.Delivery r2 = (com.revolut.feature.revolutpay.order_tracking.models.delivery.Delivery) r2
            zac.g r3 = new zac.g
            if (r2 == 0) goto L70
            r3.<init>(r2)
            r1.C2(r3)
            goto Lb7
        L70:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            r1.<init>(r6)
            throw r1
        L76:
            boolean r8 = r5 instanceof com.revolut.feature.revolutpay.order_tracking.impl.ui.add_shipping_tracking.AddShippingTrackingScreenContract$TrackingRequest.Edit
            if (r8 == 0) goto Lc0
            com.revolut.feature.revolutpay.order_tracking.impl.ui.add_shipping_tracking.AddShippingTrackingScreenContract$TrackingRequest$Edit r5 = (com.revolut.feature.revolutpay.order_tracking.impl.ui.add_shipping_tracking.AddShippingTrackingScreenContract$TrackingRequest.Edit) r5
            com.revolut.feature.revolutpay.order_tracking.models.delivery.Delivery r8 = r5.f84606b
            java.lang.String r13 = r8.f84640a
            java.lang.String r14 = r5.f84605a
            java.lang.String r5 = r10.f84654a
            r0.u = r7
            java.lang.Object r2 = r2.f22677a
            vkm.j2 r2 = (vkm.j2) r2
            java.lang.Object r2 = r2.getValue()
            zac.f r2 = (zac.f) r2
            java.lang.String r15 = r2.f320648a
            java.lang.Object r2 = r3.f274637b
            r12 = r2
            qac.i r12 = (qac.i) r12
            pn2.c r11 = new pn2.c
            r17 = 0
            r16 = r5
            r11.<init>(r12, r13, r14, r15, r16, r17)
            skm.p0 r2 = skm.p0.f264001a
            elm.f r2 = elm.f.f127540b
            java.lang.Object r2 = skm.e0.J(r2, r11, r0)
            if (r2 != r4) goto Lab
        Laa:
            return r4
        Lab:
            com.revolut.feature.revolutpay.order_tracking.models.delivery.Delivery r2 = (com.revolut.feature.revolutpay.order_tracking.models.delivery.Delivery) r2
            zac.i r3 = new zac.i
            if (r2 == 0) goto Lba
            r3.<init>(r2)
            r1.C2(r3)
        Lb7:
            kotlin.Unit r1 = kotlin.Unit.f186387a
            return r1
        Lba:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            r1.<init>(r6)
            throw r1
        Lc0:
            kotlin.NoWhenBranchMatchedException r1 = new kotlin.NoWhenBranchMatchedException
            r1.<init>()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.revolutpay.order_tracking.impl.ui.add_shipping_tracking.a.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
