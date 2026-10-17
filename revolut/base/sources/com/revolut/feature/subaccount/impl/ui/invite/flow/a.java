package com.revolut.feature.subaccount.impl.ui.invite.flow;

import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes8.dex */
public final class a extends i implements Function1 {
    public int u;
    public final /* synthetic */ b v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, Continuation continuation) {
        super(1, continuation);
        this.v = bVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new a(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((a) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x007b, code lost:
    
        if (com.revolut.feature.subaccount.impl.ui.invite.flow.b.I2(r6, r13) == r0) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x008a, code lost:
    
        if (com.revolut.feature.subaccount.impl.ui.invite.flow.b.I2(r6, r13) == r0) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0071  */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r13.u
            r2 = 4
            r3 = 3
            r4 = 2
            r5 = 1
            com.revolut.feature.subaccount.impl.ui.invite.flow.b r6 = r13.v
            if (r1 == 0) goto L2a
            if (r1 == r5) goto L26
            if (r1 == r4) goto L22
            if (r1 == r3) goto L1d
            if (r1 != r2) goto L15
            goto L1d
        L15:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L1d:
            yhm.o.b(r14)
            goto L8d
        L22:
            yhm.o.b(r14)
            goto L57
        L26:
            yhm.o.b(r14)
            goto L3e
        L2a:
            yhm.o.b(r14)
            wsg.n r14 = r6.f89089p
            com.revolut.core.model.account.AccountId$Personal r1 = com.revolut.core.model.account.AccountId.Personal.f51414a
            ufm.i r14 = r14.x(r1)
            r13.u = r5
            java.lang.Object r14 = nim.a.b(r14, r13)
            if (r14 != r0) goto L3e
            goto L8c
        L3e:
            xi0.b r14 = (xi0.b) r14
            k8e.d r1 = r6.o
            pcd.v r1 = r1.f182135a
            xi0.b r1 = r1.f234901c
            boolean r14 = kotlin.jvm.internal.Intrinsics.f(r14, r1)
            if (r14 != 0) goto L84
            s99.i r14 = r6.f89092s
            r13.u = r4
            java.lang.Object r14 = r14.a(r13)
            if (r14 != r0) goto L57
            goto L8c
        L57:
            com.revolut.feature.onboarding.api.exchange_global_access.ExchangeGlobalAccessInteractor$Output r14 = (com.revolut.feature.onboarding.api.exchange_global_access.ExchangeGlobalAccessInteractor$Output) r14
            boolean r1 = r14 instanceof com.revolut.feature.onboarding.api.exchange_global_access.ExchangeGlobalAccessInteractor$Output.ShouldLaunch
            if (r1 == 0) goto L71
            yki.a r7 = r6.u
            com.revolut.feature.subaccount.impl.ui.invite.flow.VaultInviteFlowContract$Step$McyFlowStep r8 = new com.revolut.feature.subaccount.impl.ui.invite.flow.VaultInviteFlowContract$Step$McyFlowStep
            com.revolut.feature.onboarding.api.exchange_global_access.ExchangeGlobalAccessInteractor$Output$ShouldLaunch r14 = (com.revolut.feature.onboarding.api.exchange_global_access.ExchangeGlobalAccessInteractor$Output.ShouldLaunch) r14
            bla.c r14 = r14.f78169a
            r8.<init>(r14)
            r11 = 0
            r12 = 12
            r9 = 1
            r10 = 0
            oki.h.t2(r6, r7, r8, r9, r10, r11, r12)
            goto L8d
        L71:
            boolean r14 = r14 instanceof com.revolut.feature.onboarding.api.exchange_global_access.ExchangeGlobalAccessInteractor$Output.ShouldNotLaunch
            if (r14 == 0) goto L7e
            r13.u = r3
            java.lang.Object r14 = com.revolut.feature.subaccount.impl.ui.invite.flow.b.I2(r6, r13)
            if (r14 != r0) goto L8d
            goto L8c
        L7e:
            kotlin.NoWhenBranchMatchedException r14 = new kotlin.NoWhenBranchMatchedException
            r14.<init>()
            throw r14
        L84:
            r13.u = r2
            java.lang.Object r14 = com.revolut.feature.subaccount.impl.ui.invite.flow.b.I2(r6, r13)
            if (r14 != r0) goto L8d
        L8c:
            return r0
        L8d:
            kotlin.Unit r14 = kotlin.Unit.f186387a
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.subaccount.impl.ui.invite.flow.a.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
