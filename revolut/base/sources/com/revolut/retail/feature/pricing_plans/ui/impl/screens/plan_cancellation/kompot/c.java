package com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_cancellation.kompot;

import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes11.dex */
public final class c extends i implements Function1 {
    public int u;
    public final /* synthetic */ e v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ dlk.e f103493w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(e eVar, dlk.e eVar2, Continuation continuation) {
        super(1, continuation);
        this.v = eVar;
        this.f103493w = eVar2;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new c(this.v, this.f103493w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((c) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0046, code lost:
    
        if (r1.Z2(r8, r3, r7) == r0) goto L15;
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r7.u
            r2 = 2
            r3 = 1
            com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_cancellation.kompot.e r4 = r7.v
            if (r1 == 0) goto L1e
            if (r1 == r3) goto L1a
            if (r1 != r2) goto L12
            yhm.o.b(r8)
            goto L49
        L12:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1a:
            yhm.o.b(r8)
            goto L30
        L1e:
            yhm.o.b(r8)
            ffk.t r8 = r4.f103500q
            efm.d0 r8 = r8.e()
            r7.u = r3
            java.lang.Object r8 = nim.a.b(r8, r7)
            if (r8 != r0) goto L30
            goto L48
        L30:
            hha.d r8 = (hha.d) r8
            bmk.b r1 = r4.f103504w
            kotlin.jvm.internal.Intrinsics.h(r8)
            dcl.m0 r3 = new dcl.m0
            r5 = 26
            dlk.e r6 = r7.f103493w
            r3.<init>(r4, r6, r5)
            r7.u = r2
            java.lang.Object r8 = r1.Z2(r8, r3, r7)
            if (r8 != r0) goto L49
        L48:
            return r0
        L49:
            kotlin.Unit r8 = kotlin.Unit.f186387a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_cancellation.kompot.c.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
