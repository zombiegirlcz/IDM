package com.revolut.feature.apm.bills.postal_check.impl.ui;

import com.revolut.feature.apm.bills.postal_check.impl.ui.PostalCheckFlowContract$Step;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes20.dex */
public final class a extends i implements Function2 {
    public int u;
    public final /* synthetic */ b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ PostalCheckFlowContract$Step.TermsAndConditions f61522w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, PostalCheckFlowContract$Step.TermsAndConditions termsAndConditions, Continuation continuation) {
        super(2, continuation);
        this.v = bVar;
        this.f61522w = termsAndConditions;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new a(this.v, this.f61522w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((a) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0037, code lost:
    
        if (com.revolut.feature.apm.bills.postal_check.impl.ui.b.I2(r2, r6, r5) == r0) goto L15;
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r5.u
            com.revolut.feature.apm.bills.postal_check.impl.ui.b r2 = r5.v
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L1e
            if (r1 == r4) goto L1a
            if (r1 != r3) goto L12
            yhm.o.b(r6)
            goto L3a
        L12:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L1a:
            yhm.o.b(r6)
            goto L2d
        L1e:
            yhm.o.b(r6)
            jr1.e r6 = r2.f61526s
            r5.u = r4
            r1 = 0
            java.lang.Object r6 = r6.b(r1, r5)
            if (r6 != r0) goto L2d
            goto L39
        L2d:
            com.revolut.feature.apm.bills.postal_check.impl.ui.PostalCheckFlowContract$Step$TermsAndConditions r6 = r5.f61522w
            java.lang.String r6 = r6.f61521b
            r5.u = r3
            java.lang.Object r6 = com.revolut.feature.apm.bills.postal_check.impl.ui.b.I2(r2, r6, r5)
            if (r6 != r0) goto L3a
        L39:
            return r0
        L3a:
            kotlin.Unit r6 = kotlin.Unit.f186387a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.apm.bills.postal_check.impl.ui.a.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
