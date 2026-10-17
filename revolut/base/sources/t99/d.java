package t99;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final class d extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ com.revolut.feature.onboarding.impl.exchange_global_access.flow.a v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(com.revolut.feature.onboarding.impl.exchange_global_access.flow.a aVar, Continuation continuation) {
        super(1, continuation);
        this.v = aVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new d(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((d) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0047, code lost:
    
        if (com.revolut.feature.onboarding.impl.exchange_global_access.flow.a.I2(r3, r6, r5) == r0) goto L17;
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
            goto L4d
        L12:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L1a:
            yhm.o.b(r6)
            goto L37
        L1e:
            yhm.o.b(r6)
            pre.c r6 = r3.f78267r
            com.revolut.feature.terms.api.model.TermsScope$a r1 = com.revolut.feature.terms.api.model.TermsScope.INSTANCE
            r1.getClass()
            com.revolut.feature.terms.api.model.TermsScope r1 = com.revolut.feature.terms.api.model.TermsScope.M
            efm.d0 r6 = pre.c.g(r6, r1)
            r5.u = r4
            java.lang.Object r6 = nim.a.b(r6, r5)
            if (r6 != r0) goto L37
            goto L49
        L37:
            od0.i r6 = (od0.i) r6
            java.lang.Object r6 = r6.g()
            com.revolut.feature.terms.api.model.Terms r6 = (com.revolut.feature.terms.api.model.Terms) r6
            if (r6 == 0) goto L4a
            r5.u = r2
            java.lang.Object r6 = com.revolut.feature.onboarding.impl.exchange_global_access.flow.a.I2(r3, r6, r5)
            if (r6 != r0) goto L4d
        L49:
            return r0
        L4a:
            r3.J2()
        L4d:
            kotlin.Unit r6 = kotlin.Unit.f186387a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: t99.d.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
