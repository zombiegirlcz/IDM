package ck3;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes21.dex */
public final class l extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ n v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(n nVar, Continuation continuation) {
        super(1, continuation);
        this.v = nVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new l(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((l) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0045, code lost:
    
        if (nim.a.a(r6, r5) == r0) goto L15;
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
            ck3.n r2 = r5.v
            r3 = 1
            r4 = 2
            if (r1 == 0) goto L1e
            if (r1 == r3) goto L1a
            if (r1 != r4) goto L12
            yhm.o.b(r6)
            goto L48
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
            pre.c r6 = r2.f24769r
            com.revolut.feature.terms.api.model.TermsScope$a r1 = com.revolut.feature.terms.api.model.TermsScope.INSTANCE
            r1.getClass()
            com.revolut.feature.terms.api.model.TermsScope r1 = com.revolut.feature.terms.api.model.TermsScope.f90371l
            pfm.a r6 = pre.c.a(r6, r1)
            r5.u = r3
            java.lang.Object r6 = nim.a.a(r6, r5)
            if (r6 != r0) goto L37
            goto L47
        L37:
            fk3.a r6 = r2.f24768q
            ik3.c r6 = (ik3.c) r6
            pfm.h r6 = r6.j()
            r5.u = r4
            java.lang.Object r6 = nim.a.a(r6, r5)
            if (r6 != r0) goto L48
        L47:
            return r0
        L48:
            kotlin.Unit r6 = kotlin.Unit.f186387a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ck3.l.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
