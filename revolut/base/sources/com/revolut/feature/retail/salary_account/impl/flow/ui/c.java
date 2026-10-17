package com.revolut.feature.retail.salary_account.impl.flow.ui;

import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes6.dex */
public final class c extends i implements Function2 {
    public int u;
    public final /* synthetic */ d v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, Continuation continuation) {
        super(2, continuation);
        this.v = dVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new c(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0052, code lost:
    
        if (com.revolut.feature.retail.salary_account.impl.flow.ui.d.I2(r2, r9) == r0) goto L25;
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r9.u
            com.revolut.feature.retail.salary_account.impl.flow.ui.d r2 = r9.v
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L1e
            if (r1 == r4) goto L1a
            if (r1 != r3) goto L12
            yhm.o.b(r10)
            goto L6e
        L12:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L1a:
            yhm.o.b(r10)
            goto L2c
        L1e:
            yhm.o.b(r10)
            rfb.b r10 = r2.f82980q
            r9.u = r4
            java.lang.Enum r10 = r10.c(r9)
            if (r10 != r0) goto L2c
            goto L54
        L2c:
            rfb.f r10 = (rfb.f) r10
            int[] r1 = bgb.l.f15173a
            int r10 = r10.ordinal()
            r10 = r1[r10]
            if (r10 == r4) goto L62
            if (r10 == r3) goto L55
            r1 = 3
            if (r10 == r1) goto L4c
            r0 = 4
            if (r10 != r0) goto L46
            yki.i r10 = r2.u
            oki.h.D2(r10)
            goto L6e
        L46:
            kotlin.NoWhenBranchMatchedException r10 = new kotlin.NoWhenBranchMatchedException
            r10.<init>()
            throw r10
        L4c:
            r9.u = r3
            java.lang.Object r10 = com.revolut.feature.retail.salary_account.impl.flow.ui.d.I2(r2, r9)
            if (r10 != r0) goto L6e
        L54:
            return r0
        L55:
            yki.i r3 = r2.u
            r7 = 0
            r8 = 12
            com.revolut.feature.retail.salary_account.impl.flow.ui.SalaryAccountFlowContract$Step$SalaryHub r4 = com.revolut.feature.retail.salary_account.impl.flow.ui.SalaryAccountFlowContract$Step.SalaryHub.f82972a
            r5 = 0
            r6 = 0
            oki.h.t2(r2, r3, r4, r5, r6, r7, r8)
            goto L6e
        L62:
            yki.i r3 = r2.u
            r7 = 0
            r8 = 12
            com.revolut.feature.retail.salary_account.impl.flow.ui.SalaryAccountFlowContract$Step$SalaryHubV3 r4 = com.revolut.feature.retail.salary_account.impl.flow.ui.SalaryAccountFlowContract$Step.SalaryHubV3.f82973a
            r5 = 0
            r6 = 0
            oki.h.t2(r2, r3, r4, r5, r6, r7, r8)
        L6e:
            kotlin.Unit r10 = kotlin.Unit.f186387a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.retail.salary_account.impl.flow.ui.c.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
