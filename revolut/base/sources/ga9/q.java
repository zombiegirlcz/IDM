package ga9;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final class q extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ com.revolut.feature.onboarding.impl.onboarding.v v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(com.revolut.feature.onboarding.impl.onboarding.v vVar, Continuation continuation) {
        super(1, continuation);
        this.v = vVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new q(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((q) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0036, code lost:
    
        if (com.revolut.feature.onboarding.impl.onboarding.v.Y2(r2, null, r5, 3) == r0) goto L15;
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
            com.revolut.feature.onboarding.impl.onboarding.v r2 = r5.v
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L1e
            if (r1 == r4) goto L1a
            if (r1 != r3) goto L12
            yhm.o.b(r6)
            goto L39
        L12:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L1a:
            yhm.o.b(r6)
            goto L2e
        L1e:
            yhm.o.b(r6)
            fwj.p r6 = r2.A
            r5.u = r4
            o0j.c$f r1 = o0j.c.f.f221221a
            java.lang.Object r6 = r6.h(r1, r5)
            if (r6 != r0) goto L2e
            goto L38
        L2e:
            r5.u = r3
            r6 = 0
            r1 = 3
            java.lang.Object r6 = com.revolut.feature.onboarding.impl.onboarding.v.Y2(r2, r6, r5, r1)
            if (r6 != r0) goto L39
        L38:
            return r0
        L39:
            kotlin.Unit r6 = kotlin.Unit.f186387a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ga9.q.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
