package xob;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final class v extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ com.revolut.feature.retail.savings.impl.ui.details.a v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(com.revolut.feature.retail.savings.impl.ui.details.a aVar, Continuation continuation) {
        super(1, continuation);
        this.v = aVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new v(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((v) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x005d, code lost:
    
        if (r7 == r0) goto L15;
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r6.u
            r2 = 2
            com.revolut.feature.retail.savings.impl.ui.details.a r3 = r6.v
            r4 = 1
            if (r1 == 0) goto L1e
            if (r1 == r4) goto L1a
            if (r1 != r2) goto L12
            yhm.o.b(r7)
            goto L60
        L12:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1a:
            yhm.o.b(r7)
            goto L3d
        L1e:
            yhm.o.b(r7)
            ang.f r7 = r3.v
            r1 = 0
            efm.r r7 = r7.k(r1)
            xlb.l r1 = new xlb.l
            r5 = 15
            r1.<init>(r5)
            r5 = 0
            efm.r r7 = m70.a.g(r7, r5, r1, r4)
            r6.u = r4
            java.lang.Object r7 = nim.a.c(r7, r6)
            if (r7 != r0) goto L3d
            goto L5f
        L3d:
            java.lang.String r1 = "awaitFirst(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r1)
            do3.n r7 = (do3.n) r7
            wi0.b r7 = do3.q.y(r7)
            mre.c r1 = r3.u
            com.revolut.feature.terms.api.model.TermsScope$a r4 = com.revolut.feature.terms.api.model.TermsScope.INSTANCE
            r4.getClass()
            com.revolut.feature.terms.api.model.TermsScope r4 = com.revolut.feature.terms.api.model.TermsScope.f90368h0
            rre.d r1 = (rre.d) r1
            ufm.i r7 = r1.c(r4, r7)
            r6.u = r2
            java.lang.Object r7 = nim.a.b(r7, r6)
            if (r7 != r0) goto L60
        L5f:
            return r0
        L60:
            com.revolut.retail.core.navigation.NaviCommand r7 = (com.revolut.retail.core.navigation.NaviCommand) r7
            com.revolut.kompot.bridge.navigation.BridgeDestination r0 = new com.revolut.kompot.bridge.navigation.BridgeDestination
            kotlin.jvm.internal.Intrinsics.h(r7)
            r0.<init>(r7)
            aii.n r7 = r3.C1(r0)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: xob.v.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
