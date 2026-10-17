package dce;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes8.dex */
public final class q0 extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ qua.p v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot.c f112890w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot.c cVar, Continuation continuation, qua.p pVar) {
        super(2, continuation);
        this.v = pVar;
        this.f112890w = cVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new q0(this.f112890w, continuation, this.v);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((q0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0052, code lost:
    
        if (r2 == r1) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x009b, code lost:
    
        if (r2 == r1) goto L30;
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            r19 = this;
            r0 = r19
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.u
            qua.p r7 = r0.v
            java.lang.String r3 = "UPI_ID"
            r4 = 2
            r5 = 1
            com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot.c r9 = r0.f112890w
            if (r2 == 0) goto L29
            if (r2 == r5) goto L23
            if (r2 != r4) goto L1b
            yhm.o.b(r20)
            r2 = r20
            goto L9e
        L1b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L23:
            yhm.o.b(r20)
            r2 = r20
            goto L55
        L29:
            yhm.o.b(r20)
            rua.d r2 = r7.D
            r6 = 0
            if (r2 == 0) goto L34
            java.util.Map r2 = r2.f257509b
            goto L35
        L34:
            r2 = r6
        L35:
            java.lang.String r8 = r7.f249318c
            if (r2 == 0) goto Lb0
            if (r8 == 0) goto Lb0
            boolean r10 = r2.containsKey(r3)
            r11 = 3
            if (r10 == 0) goto L7d
            co9.b r2 = r9.J
            kotlinx.coroutines.flow.Flow r2 = r2.d(r8)
            jhi.b r2 = mo3.a.g(r2, r6, r6, r11)
            r0.u = r5
            java.lang.Object r2 = vkm.q.x(r2, r0)
            if (r2 != r1) goto L55
            goto L9d
        L55:
            r11 = r2
            com.revolut.feature.payment.counterparty.models.PaymentCounterpartyInfo r11 = (com.revolut.feature.payment.counterparty.models.PaymentCounterpartyInfo) r11
            com.revolut.feature.apm.upi.api.UpiFeatureConfig$Destination$Transfer r1 = new com.revolut.feature.apm.upi.api.UpiFeatureConfig$Destination$Transfer
            com.revolut.feature.apm.upi.api.UpiFeatureConfig$Destination$Transfer$InputData$ToAlias r4 = new com.revolut.feature.apm.upi.api.UpiFeatureConfig$Destination$Transfer$InputData$ToAlias
            java.lang.String r2 = r11.a(r3)
            if (r2 != 0) goto L64
            java.lang.String r2 = ""
        L64:
            r12 = r2
            r17 = 0
            r18 = 252(0xfc, float:3.53E-43)
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r10 = r4
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18)
            r6 = 0
            r8 = 6
            r5 = 0
            r3 = r1
            r3.<init>(r4, r5, r6, r7, r8)
            r9.C1(r3)
            goto Lb0
        L7d:
            java.lang.String r3 = "ACCOUNT_NUMBER"
            boolean r2 = r2.containsKey(r3)
            if (r2 == 0) goto Lb0
            d3j.b r2 = r9.C
            w4l.h r3 = w4l.h.f294642c
            efm.r r2 = r2.j(r8, r3)
            vkm.d r2 = rd0.e.b(r2)
            jhi.b r2 = mo3.a.g(r2, r6, r6, r11)
            r0.u = r4
            java.lang.Object r2 = vkm.q.x(r2, r0)
            if (r2 != r1) goto L9e
        L9d:
            return r1
        L9e:
            f5j.a r2 = (f5j.a) r2
            com.revolut.feature.apm.upi.api.UpiFeatureConfig$Destination$Transfer r3 = new com.revolut.feature.apm.upi.api.UpiFeatureConfig$Destination$Transfer
            com.revolut.feature.apm.upi.api.UpiFeatureConfig$Destination$Transfer$InputData$ToBeneficiary r4 = new com.revolut.feature.apm.upi.api.UpiFeatureConfig$Destination$Transfer$InputData$ToBeneficiary
            r4.<init>(r2)
            r6 = 0
            r8 = 6
            r5 = 0
            r3.<init>(r4, r5, r6, r7, r8)
            r9.C1(r3)
        Lb0:
            kotlin.Unit r1 = kotlin.Unit.f186387a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: dce.q0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
