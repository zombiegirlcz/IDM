package com.revolut.feature.pay_bills_taxes.impl.ui_routing.flow;

import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes5.dex */
public final class a extends i implements Function2 {
    public int u;
    public final /* synthetic */ b v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, Continuation continuation) {
        super(2, continuation);
        this.v = bVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new a(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((a) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006d  */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r5) {
        /*
            r4 = this;
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r4.u
            com.revolut.feature.pay_bills_taxes.impl.ui_routing.flow.b r2 = r4.v
            r3 = 1
            if (r1 == 0) goto L17
            if (r1 != r3) goto Lf
            yhm.o.b(r5)
            goto L2a
        Lf:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L17:
            yhm.o.b(r5)
            ang.f r5 = r2.f78802q
            r1 = 0
            efm.d0 r5 = r5.f(r1)
            r4.u = r3
            java.lang.Object r5 = nim.a.b(r5, r4)
            if (r5 != r0) goto L2a
            return r0
        L2a:
            java.lang.String r0 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r0)
            do3.n r5 = (do3.n) r5
            wi0.b r5 = do3.q.y(r5)
            vo1.c r0 = r2.f78801p
            fp1.d r0 = (fp1.d) r0
            boolean r0 = r0.a()
            yki.i r1 = r2.f78803r
            if (r0 == 0) goto L56
            wi0.a r3 = wi0.b.Companion
            r3.getClass()
            wi0.b r3 = wi0.b.Y1
            boolean r3 = r5.equals(r3)
            if (r3 == 0) goto L56
            com.revolut.feature.pay_bills_taxes.impl.ui_routing.flow.BillsRoutingFlowContract$Step$BillsCatalogue r5 = new com.revolut.feature.pay_bills_taxes.impl.ui_routing.flow.BillsRoutingFlowContract$Step$BillsCatalogue
            xo1.g r0 = xo1.g.TAPI
            r5.<init>(r0)
            goto L6f
        L56:
            if (r0 == 0) goto L6d
            wi0.a r0 = wi0.b.Companion
            r0.getClass()
            wi0.b r0 = wi0.b.O
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L6d
            com.revolut.feature.pay_bills_taxes.impl.ui_routing.flow.BillsRoutingFlowContract$Step$BillsCatalogue r5 = new com.revolut.feature.pay_bills_taxes.impl.ui_routing.flow.BillsRoutingFlowContract$Step$BillsCatalogue
            xo1.g r0 = xo1.g.TAPI_CO
            r5.<init>(r0)
            goto L6f
        L6d:
            com.revolut.feature.pay_bills_taxes.impl.ui_routing.flow.BillsRoutingFlowContract$Step$PayBillsAndTaxes r5 = com.revolut.feature.pay_bills_taxes.impl.ui_routing.flow.BillsRoutingFlowContract$Step.PayBillsAndTaxes.f78800a
        L6f:
            r0 = 0
            r3 = 6
            oki.h.u2(r2, r1, r5, r0, r3)
            kotlin.Unit r5 = kotlin.Unit.f186387a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.pay_bills_taxes.impl.ui_routing.flow.a.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
