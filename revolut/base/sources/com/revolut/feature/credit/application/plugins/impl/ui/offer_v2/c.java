package com.revolut.feature.credit.application.plugins.impl.ui.offer_v2;

import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes22.dex */
public final class c extends i implements Function1 {
    public int u;
    public final /* synthetic */ g v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(g gVar, Continuation continuation) {
        super(1, continuation);
        this.v = gVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new c(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((c) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0055, code lost:
    
        if (kotlin.Unit.f186387a == r2) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0090, code lost:
    
        if (c84.t.N2(r0, (it3.d) r10, r9, 2) != r2) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0088 A[PHI: r10
      0x0088: PHI (r10v15 java.lang.Object) = (r10v14 java.lang.Object), (r10v0 java.lang.Object) binds: [B:29:0x0085, B:12:0x0026] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) throws java.lang.Throwable {
        /*
            r9 = this;
            com.revolut.feature.credit.application.plugins.impl.ui.offer_v2.g r0 = r9.v
            mf4.e r1 = r0.f68151q
            fim.a r2 = fim.a.COROUTINE_SUSPENDED
            int r3 = r9.u
            r4 = 5
            r5 = 4
            r6 = 3
            r7 = 2
            r8 = 1
            if (r3 == 0) goto L36
            if (r3 == r8) goto L32
            if (r3 == r7) goto L2e
            if (r3 == r6) goto L2a
            if (r3 == r5) goto L26
            if (r3 != r4) goto L1e
            yhm.o.b(r10)
            goto L93
        L1e:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L26:
            yhm.o.b(r10)
            goto L88
        L2a:
            yhm.o.b(r10)
            goto L7d
        L2e:
            yhm.o.b(r10)
            goto L58
        L32:
            yhm.o.b(r10)
            goto L45
        L36:
            yhm.o.b(r10)
            r9.u = r8
            r10 = r1
            mf4.a0 r10 = (mf4.a0) r10
            java.lang.Object r10 = r10.m(r9)
            if (r10 != r2) goto L45
            goto L92
        L45:
            cv3.b0 r10 = (cv3.b0) r10
            cv3.a r10 = r10.f109239c
            if (r10 == 0) goto L6f
            r9.u = r7
            mf4.a0 r1 = (mf4.a0) r1
            cv3.b0 r10 = r1.f204837h
            r1.f204836g = r10
            kotlin.Unit r10 = kotlin.Unit.f186387a
            if (r10 != r2) goto L58
            goto L92
        L58:
            yki.a r1 = r0.v
            com.revolut.feature.credit.application.plugins.impl.ui.offer_v2.OfferV2FlowContract$Step$Calculator r2 = new com.revolut.feature.credit.application.plugins.impl.ui.offer_v2.OfferV2FlowContract$Step$Calculator
            cv3.y r10 = cv3.y.EDIT_CREDITS_TO_REFINANCE_AND_CALCULATOR
            java.lang.String r10 = r10.b()
            r3 = 6
            r2.<init>(r10, r3)
            r5 = 0
            r6 = 12
            r3 = 1
            r4 = 0
            oki.h.t2(r0, r1, r2, r3, r4, r5, r6)
            goto L93
        L6f:
            r9.u = r6
            r10 = r1
            mf4.a0 r10 = (mf4.a0) r10
            cv3.b0 r3 = r10.f204837h
            r10.f = r3
            kotlin.Unit r10 = kotlin.Unit.f186387a
            if (r10 != r2) goto L7d
            goto L92
        L7d:
            r9.u = r5
            mf4.a0 r1 = (mf4.a0) r1
            java.lang.Object r10 = r1.s(r9)
            if (r10 != r2) goto L88
            goto L92
        L88:
            it3.d r10 = (it3.d) r10
            r9.u = r4
            java.lang.Object r10 = c84.t.N2(r0, r10, r9, r7)
            if (r10 != r2) goto L93
        L92:
            return r2
        L93:
            kotlin.Unit r10 = kotlin.Unit.f186387a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.credit.application.plugins.impl.ui.offer_v2.c.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
