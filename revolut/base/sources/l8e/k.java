package l8e;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes8.dex */
public final class k extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ l v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(l lVar, Continuation continuation) {
        super(2, continuation);
        this.v = lVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new k(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((k) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0053, code lost:
    
        if (r6 == r0) goto L17;
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
            r2 = 1
            l8e.l r3 = r5.v
            r4 = 2
            if (r1 == 0) goto L1e
            if (r1 == r2) goto L1a
            if (r1 != r4) goto L12
            yhm.o.b(r6)
            goto L56
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
            ang.f r6 = r3.f192972r
            r1 = 0
            efm.d0 r6 = r6.f(r1)
            r5.u = r2
            java.lang.Object r6 = nim.a.b(r6, r5)
            if (r6 != r0) goto L31
            goto L55
        L31:
            do3.n r6 = (do3.n) r6
            kotlin.jvm.internal.Intrinsics.h(r6)
            wi0.b r6 = do3.q.y(r6)
            boolean r6 = com.bumptech.glide.d.r(r6)
            if (r6 == 0) goto L61
            mre.c r6 = r3.f192973s
            com.revolut.feature.terms.api.model.TermsScope$a r1 = com.revolut.feature.terms.api.model.TermsScope.INSTANCE
            r1.getClass()
            com.revolut.feature.terms.api.model.TermsScope r1 = com.revolut.feature.terms.api.model.TermsScope.f90360a0
            ufm.i r6 = mre.c.a(r6, r1)
            r5.u = r4
            java.lang.Object r6 = nim.a.b(r6, r5)
            if (r6 != r0) goto L56
        L55:
            return r0
        L56:
            com.revolut.retail.core.navigation.NaviCommand r6 = (com.revolut.retail.core.navigation.NaviCommand) r6
            ec9.a r0 = new ec9.a
            r1 = 2
            r0.<init>(r6, r1)
            r3.x2(r0)
        L61:
            kotlin.Unit r6 = kotlin.Unit.f186387a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: l8e.k.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
