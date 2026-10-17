package uhk;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes11.dex */
public final class h extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_downgrade.a v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_downgrade.a aVar, Continuation continuation) {
        super(1, continuation);
        this.v = aVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new h(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((h) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0043, code lost:
    
        if (r1.Z2(r7, r3, r6) == r0) goto L15;
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
            r3 = 1
            com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_downgrade.a r4 = r6.v
            if (r1 == 0) goto L1e
            if (r1 == r3) goto L1a
            if (r1 != r2) goto L12
            yhm.o.b(r7)
            goto L46
        L12:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1a:
            yhm.o.b(r7)
            goto L30
        L1e:
            yhm.o.b(r7)
            ffk.t r7 = r4.f103163q
            efm.d0 r7 = r7.e()
            r6.u = r3
            java.lang.Object r7 = nim.a.b(r7, r6)
            if (r7 != r0) goto L30
            goto L45
        L30:
            hha.d r7 = (hha.d) r7
            bmk.b r1 = r4.f103164r
            kotlin.jvm.internal.Intrinsics.h(r7)
            uhk.e r3 = new uhk.e
            r5 = 4
            r3.<init>(r4, r5)
            r6.u = r2
            java.lang.Object r7 = r1.Z2(r7, r3, r6)
            if (r7 != r0) goto L46
        L45:
            return r0
        L46:
            kotlin.Unit r7 = kotlin.Unit.f186387a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: uhk.h.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
