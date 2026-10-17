package qo9;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final class f extends gim.i implements Function1 {
    public com.revolut.feature.payments.air.widget.impl.ui.flow.a u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.payments.air.widget.impl.ui.flow.a f248080w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ x2j.b f248081x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(com.revolut.feature.payments.air.widget.impl.ui.flow.a aVar, x2j.b bVar, Continuation continuation) {
        super(1, continuation);
        this.f248080w = aVar;
        this.f248081x = bVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new f(this.f248080w, this.f248081x, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((f) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0049, code lost:
    
        if (r10 == r2) goto L15;
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            com.revolut.feature.payments.air.widget.impl.ui.flow.a r0 = r9.f248080w
            com.revolut.feature.payments.air.widget.impl.model.PaymentWidget r1 = r0.o
            fim.a r2 = fim.a.COROUTINE_SUSPENDED
            int r3 = r9.v
            x2j.b r4 = r9.f248081x
            r5 = 2
            r6 = 1
            if (r3 == 0) goto L24
            if (r3 == r6) goto L20
            if (r3 != r5) goto L18
            com.revolut.feature.payments.air.widget.impl.ui.flow.a r0 = r9.u
            yhm.o.b(r10)
            goto L4c
        L18:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L20:
            yhm.o.b(r10)
            goto L3d
        L24:
            yhm.o.b(r10)
            no9.a r10 = r0.f79133q
            java.lang.String r3 = r1.f79072a
            com.revolut.feature.payments.air.widget.impl.model.WidgetRecipient$ExistingBeneficiary r7 = new com.revolut.feature.payments.air.widget.impl.model.WidgetRecipient$ExistingBeneficiary
            f5j.a r8 = r4.f302597a
            java.lang.String r8 = r8.f132329a
            r7.<init>(r8)
            r9.v = r6
            java.lang.Object r10 = r10.a(r3, r7, r9)
            if (r10 != r2) goto L3d
            goto L4b
        L3d:
            com.revolut.feature.payments.air.widget.impl.ui.flow.b r10 = r0.f79134r
            f5j.a r3 = r4.f302597a
            r9.u = r0
            r9.v = r5
            java.lang.Object r10 = r10.a(r1, r3, r9)
            if (r10 != r2) goto L4c
        L4b:
            return r2
        L4c:
            r2 = r10
            com.revolut.feature.payments.air.widget.impl.ui.flow.AirPaymentTransferFlowContract$Step r2 = (com.revolut.feature.payments.air.widget.impl.ui.flow.AirPaymentTransferFlowContract$Step) r2
            yki.i r1 = r0.f79136t
            r5 = 0
            r6 = 12
            r3 = 0
            r4 = 0
            oki.h.t2(r0, r1, r2, r3, r4, r5, r6)
            kotlin.Unit r10 = kotlin.Unit.f186387a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: qo9.f.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
