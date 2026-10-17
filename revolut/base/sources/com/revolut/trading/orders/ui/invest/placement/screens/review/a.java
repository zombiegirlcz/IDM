package com.revolut.trading.orders.ui.invest.placement.screens.review;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes12.dex */
public final class a extends gim.i implements Function2 {
    public o u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ o f106974w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(o oVar, Continuation continuation) {
        super(2, continuation);
        this.f106974w = oVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new a(this.f106974w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((a) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0039, code lost:
    
        if (com.revolut.trading.orders.ui.invest.placement.screens.review.o.L2(r1, (nel.n) r5, r4) == r0) goto L15;
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r5) {
        /*
            r4 = this;
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r4.v
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1e
            if (r1 == r3) goto L18
            if (r1 != r2) goto L10
            yhm.o.b(r5)
            goto L3c
        L10:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L18:
            com.revolut.trading.orders.ui.invest.placement.screens.review.o r1 = r4.u
            yhm.o.b(r5)
            goto L2e
        L1e:
            yhm.o.b(r5)
            com.revolut.trading.orders.ui.invest.placement.screens.review.o r1 = r4.f106974w
            r4.u = r1
            r4.v = r3
            java.lang.Object r5 = com.revolut.trading.orders.ui.invest.placement.screens.review.o.I2(r1, r4)
            if (r5 != r0) goto L2e
            goto L3b
        L2e:
            nel.n r5 = (nel.n) r5
            r3 = 0
            r4.u = r3
            r4.v = r2
            java.lang.Object r5 = com.revolut.trading.orders.ui.invest.placement.screens.review.o.L2(r1, r5, r4)
            if (r5 != r0) goto L3c
        L3b:
            return r0
        L3c:
            kotlin.Unit r5 = kotlin.Unit.f186387a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.trading.orders.ui.invest.placement.screens.review.a.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
