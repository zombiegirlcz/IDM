package com.revolut.feature.credit.application.plugins.impl.ui.financial_evidence.flow;

import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import xu3.n0;

/* JADX INFO: loaded from: classes22.dex */
public final class d extends i implements Function1 {
    public n0 u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ e f67729w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, Continuation continuation) {
        super(1, continuation);
        this.f67729w = eVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new d(this.f67729w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((d) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007c  */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) throws java.lang.Throwable {
        /*
            r9 = this;
            com.revolut.feature.credit.application.plugins.impl.ui.financial_evidence.flow.e r0 = r9.f67729w
            sb4.c r1 = r0.f67730p
            fim.a r2 = fim.a.COROUTINE_SUSPENDED
            int r3 = r9.v
            r4 = 0
            r5 = 2
            r6 = 1
            if (r3 == 0) goto L23
            if (r3 == r6) goto L1f
            if (r3 != r5) goto L17
            xu3.n0 r1 = r9.u
            yhm.o.b(r10)
            goto L60
        L17:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L1f:
            yhm.o.b(r10)
            goto L46
        L23:
            yhm.o.b(r10)
            r9.v = r6
            hx3.a r10 = r1.f261499a
            ft3.h1 r3 = r1.c()
            hx3.g r10 = (hx3.g) r10
            j34.g r10 = r10.f156379a
            r10.getClass()
            j34.c r7 = new j34.c
            r8 = 0
            r7.<init>(r10, r3, r4, r8)
            skm.p0 r10 = skm.p0.f264001a
            elm.f r10 = elm.f.f127540b
            java.lang.Object r10 = skm.e0.J(r10, r7, r9)
            if (r10 != r2) goto L46
            goto L5e
        L46:
            xu3.n0 r10 = (xu3.n0) r10
            xu3.m0 r3 = r10.e
            xu3.h0 r3 = r3.f7()
            if (r3 == 0) goto L61
            boolean r3 = r3.f308904a
            if (r3 != r6) goto L61
            r9.u = r10
            r9.v = r5
            java.lang.Object r1 = r1.a(r9)
            if (r1 != r2) goto L5f
        L5e:
            return r2
        L5f:
            r1 = r10
        L60:
            r10 = r1
        L61:
            qki.d r1 = r0.f67732r
            s78.d r2 = new s78.d
            r3 = 22
            r2.<init>(r10, r3)
            r0.H2(r1, r2)
            xu3.m r1 = r10.f308933a
            r2 = r1
            yki.a r1 = r0.f67733s
            if (r2 != 0) goto L7c
            com.revolut.feature.credit.application.plugins.impl.ui.financial_evidence.flow.FinancialEvidenceFlowContract$Step$Summary r2 = new com.revolut.feature.credit.application.plugins.impl.ui.financial_evidence.flow.FinancialEvidenceFlowContract$Step$Summary
            xu3.m0 r10 = r10.e
            r2.<init>(r10, r4)
            goto L82
        L7c:
            com.revolut.feature.credit.application.plugins.impl.ui.financial_evidence.flow.FinancialEvidenceFlowContract$Step$EvidenceHolderSelection r10 = new com.revolut.feature.credit.application.plugins.impl.ui.financial_evidence.flow.FinancialEvidenceFlowContract$Step$EvidenceHolderSelection
            r10.<init>(r2)
            r2 = r10
        L82:
            com.revolut.kompot.navigable.TransitionAnimation$FADE r4 = com.revolut.kompot.navigable.TransitionAnimation.FADE.f98392a
            r5 = 0
            r6 = 8
            r3 = 0
            oki.h.t2(r0, r1, r2, r3, r4, r5, r6)
            kotlin.Unit r10 = kotlin.Unit.f186387a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.credit.application.plugins.impl.ui.financial_evidence.flow.d.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
