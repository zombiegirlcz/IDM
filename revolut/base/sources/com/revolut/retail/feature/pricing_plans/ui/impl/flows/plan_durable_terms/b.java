package com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_durable_terms;

import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes11.dex */
public final class b extends i implements Function1 {
    public int u;
    public final /* synthetic */ c v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, Continuation continuation) {
        super(1, continuation);
        this.v = cVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new b(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((b) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x007a, code lost:
    
        if (nim.a.b(r9, r8) == r0) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0085  */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) throws java.lang.Throwable {
        /*
            r8 = this;
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r8.u
            r2 = 3
            r3 = 2
            r4 = 1
            com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_durable_terms.c r5 = r8.v
            if (r1 == 0) goto L25
            if (r1 == r4) goto L21
            if (r1 == r3) goto L1d
            if (r1 != r2) goto L15
            yhm.o.b(r9)
            goto L7d
        L15:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L1d:
            yhm.o.b(r9)
            goto L5e
        L21:
            yhm.o.b(r9)
            goto L53
        L25:
            yhm.o.b(r9)
            ffk.t r9 = r5.o
            com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_durable_terms.PlanDurableTermsFlowContract$InputData r1 = r5.f103172p
            java.lang.String r1 = r1.f103166a
            r8.u = r4
            dha.c r9 = r9.f134850a
            pfk.p0 r9 = (pfk.p0) r9
            r9.getClass()
            pfk.l0 r4 = new pfk.l0
            r6 = 0
            r7 = 0
            r4.<init>(r9, r1, r6, r7)
            skm.p0 r9 = skm.p0.f264001a
            elm.f r9 = elm.f.f127540b
            java.lang.Object r9 = skm.e0.J(r9, r4, r8)
            if (r9 != r0) goto L49
            goto L4b
        L49:
            kotlin.Unit r9 = kotlin.Unit.f186387a
        L4b:
            if (r9 != r0) goto L4e
            goto L50
        L4e:
            kotlin.Unit r9 = kotlin.Unit.f186387a
        L50:
            if (r9 != r0) goto L53
            goto L7c
        L53:
            ehk.j r9 = r5.f103173q
            r8.u = r3
            java.lang.Object r9 = r9.a(r8)
            if (r9 != r0) goto L5e
            goto L7c
        L5e:
            ehk.k r9 = (ehk.k) r9
            ehk.k$b r1 = ehk.k.b.f126219a
            boolean r1 = kotlin.jvm.internal.Intrinsics.f(r9, r1)
            if (r1 == 0) goto L85
            com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_durable_terms.PlanDurableTermsFlowContract$InputData r9 = r5.f103172p
            boolean r9 = r9.f103167b
            if (r9 == 0) goto L7d
            ffk.t r9 = r5.o
            rfm.f0 r9 = r9.y()
            r8.u = r2
            java.lang.Object r9 = nim.a.b(r9, r8)
            if (r9 != r0) goto L7d
        L7c:
            return r0
        L7d:
            com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_durable_terms.a$c r9 = com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_durable_terms.a.c.f103171a
            r5.C2(r9)
            kotlin.Unit r9 = kotlin.Unit.f186387a
            return r9
        L85:
            ehk.k$a r0 = ehk.k.a.f126218a
            boolean r0 = kotlin.jvm.internal.Intrinsics.f(r9, r0)
            if (r0 != 0) goto L98
            boolean r9 = r9 instanceof ehk.l
            if (r9 == 0) goto L92
            goto L98
        L92:
            kotlin.NoWhenBranchMatchedException r9 = new kotlin.NoWhenBranchMatchedException
            r9.<init>()
            throw r9
        L98:
            r5.I2()
            java.lang.Boolean r9 = java.lang.Boolean.TRUE
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_durable_terms.b.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
