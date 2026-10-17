package com.revolut.feature.credit.application.plugins.impl.ui.email_verification;

import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes22.dex */
public final class a extends i implements Function2 {
    public int u;
    public final /* synthetic */ c v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(c cVar, Continuation continuation) {
        super(2, continuation);
        this.v = cVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new a(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((a) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0043, code lost:
    
        if (com.revolut.feature.credit.application.plugins.impl.ui.email_verification.c.Q2(r5, r13, r12) == r0) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0073, code lost:
    
        if (com.revolut.feature.credit.application.plugins.impl.ui.email_verification.c.Q2(r5, r13, r12) == r0) goto L29;
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r12.u
            r2 = 3
            r3 = 2
            r4 = 1
            com.revolut.feature.credit.application.plugins.impl.ui.email_verification.c r5 = r12.v
            if (r1 == 0) goto L22
            if (r1 == r4) goto L1e
            if (r1 == r3) goto L1a
            if (r1 != r2) goto L12
            goto L1a
        L12:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L1a:
            yhm.o.b(r13)
            goto L76
        L1e:
            yhm.o.b(r13)
            goto L2e
        L22:
            yhm.o.b(r13)
            r12.u = r4
            java.lang.Object r13 = com.revolut.feature.credit.application.plugins.impl.ui.email_verification.c.P2(r5, r12)
            if (r13 != r0) goto L2e
            goto L75
        L2e:
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r13 = r13.booleanValue()
            r1 = 0
            if (r13 == 0) goto L46
            pa4.f r13 = new pa4.f
            r2 = 0
            r13.<init>(r5, r1, r2)
            r12.u = r3
            java.lang.Object r13 = com.revolut.feature.credit.application.plugins.impl.ui.email_verification.c.Q2(r5, r13, r12)
            if (r13 != r0) goto L76
            goto L75
        L46:
            yki.a r13 = r5.A
            com.revolut.kompot.navigable.flow.FlowStep r13 = r13.d()
            com.revolut.feature.credit.application.plugins.impl.ui.email_verification.EmailVerificationFlowContract$Step r13 = (com.revolut.feature.credit.application.plugins.impl.ui.email_verification.EmailVerificationFlowContract$Step) r13
            boolean r3 = r13 instanceof com.revolut.feature.credit.application.plugins.impl.ui.email_verification.EmailVerificationFlowContract$Step.Initial
            if (r3 == 0) goto L5f
            yki.a r6 = r5.A
            r10 = 0
            r11 = 12
            com.revolut.feature.credit.application.plugins.impl.ui.email_verification.EmailVerificationFlowContract$Step$VerifyEmail r7 = com.revolut.feature.credit.application.plugins.impl.ui.email_verification.EmailVerificationFlowContract$Step.VerifyEmail.f67627a
            r8 = 0
            r9 = 0
            oki.h.t2(r5, r6, r7, r8, r9, r10, r11)
            goto L76
        L5f:
            boolean r13 = r13 instanceof com.revolut.feature.credit.application.plugins.impl.ui.email_verification.EmailVerificationFlowContract$Step.VerifyInProgress
            if (r13 == 0) goto L76
            java.lang.String r13 = r5.f67637y
            if (r13 == 0) goto L76
            pa4.f r13 = new pa4.f
            r3 = 2
            r13.<init>(r5, r1, r3)
            r12.u = r2
            java.lang.Object r13 = com.revolut.feature.credit.application.plugins.impl.ui.email_verification.c.Q2(r5, r13, r12)
            if (r13 != r0) goto L76
        L75:
            return r0
        L76:
            kotlin.Unit r13 = kotlin.Unit.f186387a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.credit.application.plugins.impl.ui.email_verification.a.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
