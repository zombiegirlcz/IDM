package kze;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes8.dex */
public final class g extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ i v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(i iVar, Continuation continuation) {
        super(1, continuation);
        this.v = iVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new g(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((g) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003e, code lost:
    
        if (nim.a.b(r7, r6) == r2) goto L15;
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            kze.i r0 = r6.v
            com.revolut.feature.topup_screen.impl.flows.topup_flows.cash_deposit.CashDepositTopupFlowContract$InputData r1 = r0.o
            fim.a r2 = fim.a.COROUTINE_SUSPENDED
            int r3 = r6.u
            r4 = 2
            r5 = 1
            if (r3 == 0) goto L20
            if (r3 == r5) goto L1c
            if (r3 != r4) goto L14
            yhm.o.b(r7)
            goto L41
        L14:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1c:
            yhm.o.b(r7)
            goto L2e
        L20:
            yhm.o.b(r7)
            java.lang.String r7 = r1.f90995b
            r6.u = r5
            java.lang.Object r7 = kze.i.I2(r0, r7, r6)
            if (r7 != r2) goto L2e
            goto L40
        L2e:
            fb3.c r7 = (fb3.c) r7
            kl.t1 r3 = r0.f191109p
            dj0.d r1 = r1.f90994a
            ufm.n r7 = r3.e(r1, r7)
            r6.u = r4
            java.lang.Object r7 = nim.a.b(r7, r6)
            if (r7 != r2) goto L41
        L40:
            return r2
        L41:
            kze.d$a r7 = kze.d.a.f191103a
            r0.C2(r7)
            kotlin.Unit r7 = kotlin.Unit.f186387a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kze.g.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
