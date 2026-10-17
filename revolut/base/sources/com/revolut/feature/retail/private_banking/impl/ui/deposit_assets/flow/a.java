package com.revolut.feature.retail.private_banking.impl.ui.deposit_assets.flow;

import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
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

    /* JADX WARN: Code restructure failed: missing block: B:27:0x006d, code lost:
    
        if (r8 == r2) goto L28;
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            com.revolut.feature.retail.private_banking.impl.ui.deposit_assets.flow.b r0 = r7.v
            yki.i r1 = r0.f82796r
            fim.a r2 = fim.a.COROUTINE_SUSPENDED
            int r3 = r7.u
            r4 = 2
            r5 = 1
            if (r3 == 0) goto L21
            if (r3 == r5) goto L1d
            if (r3 != r4) goto L15
            yhm.o.b(r8)
            goto L94
        L15:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1d:
            yhm.o.b(r8)
            goto L2f
        L21:
            yhm.o.b(r8)
            smd.s r8 = r0.f82794p
            r7.u = r5
            java.lang.Object r8 = r8.q(r7)
            if (r8 != r2) goto L2f
            goto L6f
        L2f:
            java.util.List r8 = (java.util.List) r8
            boolean r3 = r8.isEmpty()
            if (r3 == 0) goto L3b
            oki.h.D2(r1)
            goto L94
        L3b:
            int r3 = r8.size()
            if (r3 != r5) goto L85
            oki.h.D2(r1)
            r1 = 0
            java.lang.Object r8 = r8.get(r1)
            tcb.a r8 = (tcb.a) r8
            int[] r1 = ycb.e.f312605a
            int r8 = r8.ordinal()
            r8 = r1[r8]
            if (r8 == r5) goto L81
            if (r8 == r4) goto L76
            r1 = 3
            if (r8 != r1) goto L70
            r7.u = r4
            vh5.a r8 = r0.f82795q
            ycb.d r3 = new ycb.d
            r4 = 0
            r3.<init>(r0, r4)
            java.lang.Object r8 = vh5.a.b3(r8, r3, r7, r1)
            if (r8 != r2) goto L6b
            goto L6d
        L6b:
            kotlin.Unit r8 = kotlin.Unit.f186387a
        L6d:
            if (r8 != r2) goto L94
        L6f:
            return r2
        L70:
            kotlin.NoWhenBranchMatchedException r8 = new kotlin.NoWhenBranchMatchedException
            r8.<init>()
            throw r8
        L76:
            com.revolut.feature.trading.transfer.investments.api.navigation.NewTransferDestination r8 = new com.revolut.feature.trading.transfer.investments.api.navigation.NewTransferDestination
            u8f.d r1 = u8f.d.IN
            r8.<init>(r1)
            r0.C1(r8)
            goto L94
        L81:
            com.revolut.feature.retail.private_banking.impl.ui.deposit_assets.flow.b.I2(r0)
            goto L94
        L85:
            yki.i r1 = r0.f82796r
            com.revolut.feature.retail.private_banking.impl.ui.deposit_assets.flow.DepositAssetsFlowContract$Step$DepositAssets r2 = new com.revolut.feature.retail.private_banking.impl.ui.deposit_assets.flow.DepositAssetsFlowContract$Step$DepositAssets
            r2.<init>(r8)
            r5 = 0
            r6 = 12
            r3 = 0
            r4 = 0
            oki.h.t2(r0, r1, r2, r3, r4, r5, r6)
        L94:
            kotlin.Unit r8 = kotlin.Unit.f186387a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.retail.private_banking.impl.ui.deposit_assets.flow.a.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
