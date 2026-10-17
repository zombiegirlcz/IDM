package t99;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final class f extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ com.revolut.feature.onboarding.impl.exchange_global_access.flow.a v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(com.revolut.feature.onboarding.impl.exchange_global_access.flow.a aVar, Continuation continuation) {
        super(1, continuation);
        this.v = aVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new f(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((f) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0049, code lost:
    
        if (r6.l(true, r5) == r0) goto L19;
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
            r2 = 2
            com.revolut.feature.onboarding.impl.exchange_global_access.flow.a r3 = r5.v
            r4 = 1
            if (r1 == 0) goto L1e
            if (r1 == r4) goto L1a
            if (r1 != r2) goto L12
            yhm.o.b(r6)
            goto L4c
        L12:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L1a:
            yhm.o.b(r6)
            goto L31
        L1e:
            yhm.o.b(r6)
            ang.f r6 = r3.f78268s
            r1 = 0
            efm.d0 r6 = r6.f(r1)
            r5.u = r4
            java.lang.Object r6 = nim.a.b(r6, r5)
            if (r6 != r0) goto L31
            goto L4b
        L31:
            do3.n r6 = (do3.n) r6
            boolean r6 = te0.w.V(r6)
            if (r6 != 0) goto L41
            com.revolut.feature.onboarding.api.exchange_global_access.ExchangeGlobalAccessOutput$FeatureAvailable r6 = com.revolut.feature.onboarding.api.exchange_global_access.ExchangeGlobalAccessOutput.FeatureAvailable.f78171a
            r3.L2(r6)
            kotlin.Unit r6 = kotlin.Unit.f186387a
            return r6
        L41:
            fn2.c r6 = r3.f78265p
            r5.u = r2
            java.lang.Object r6 = r6.l(r4, r5)
            if (r6 != r0) goto L4c
        L4b:
            return r0
        L4c:
            jla.h r6 = r3.f78266q
            java.lang.String r0 = "ACCOUNT.multi_currency"
            r1 = 0
            bla.c r6 = r6.d(r0, r1)
            r3.K2(r6)
            kotlin.Unit r6 = kotlin.Unit.f186387a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: t99.f.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
