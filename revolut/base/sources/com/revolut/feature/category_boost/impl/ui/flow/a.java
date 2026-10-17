package com.revolut.feature.category_boost.impl.ui.flow;

import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes21.dex */
public final class a extends i implements Function1 {
    public int u;
    public final /* synthetic */ boolean v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ b f65760w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(boolean z, b bVar, Continuation continuation) {
        super(1, continuation);
        this.v = z;
        this.f65760w = bVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new a(this.v, this.f65760w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((a) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0048, code lost:
    
        if (r7 == r0) goto L20;
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
            com.revolut.feature.category_boost.impl.ui.flow.b r2 = r6.f65760w
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L1e
            if (r1 == r4) goto L1a
            if (r1 != r3) goto L12
            yhm.o.b(r7)
            goto L4b
        L12:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1a:
            yhm.o.b(r7)
            goto L40
        L1e:
            yhm.o.b(r7)
            boolean r7 = r6.v
            if (r7 == 0) goto L40
            ve3.b r7 = r2.o
            r6.u = r4
            mk0.a r7 = r7.f288109a
            tk0.b r1 = new tk0.b
            java.lang.String r5 = "CATEGORY_BOOST_INTRODUCTION_COMPLETED"
            r1.<init>(r5)
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
            java.lang.Object r7 = r7.e(r1, r5, r6)
            if (r7 != r0) goto L3b
            goto L3d
        L3b:
            kotlin.Unit r7 = kotlin.Unit.f186387a
        L3d:
            if (r7 != r0) goto L40
            goto L4a
        L40:
            ugc.a r7 = r2.f65761p
            r6.u = r3
            java.lang.Enum r7 = r7.h(r6)
            if (r7 != r0) goto L4b
        L4a:
            return r0
        L4b:
            we3.c r7 = (we3.c) r7
            int[] r0 = af3.e.f3857a
            int r7 = r7.ordinal()
            r7 = r0[r7]
            if (r7 == r4) goto L62
            if (r7 != r3) goto L5c
            com.revolut.feature.category_boost.impl.ui.flow.CategoryBoostFlowContract$Step$BoostSelection r7 = com.revolut.feature.category_boost.impl.ui.flow.CategoryBoostFlowContract$Step.BoostSelection.f65757a
            return r7
        L5c:
            kotlin.NoWhenBranchMatchedException r7 = new kotlin.NoWhenBranchMatchedException
            r7.<init>()
            throw r7
        L62:
            com.revolut.feature.category_boost.impl.ui.flow.CategoryBoostFlowContract$Step$BoostsOverview r7 = com.revolut.feature.category_boost.impl.ui.flow.CategoryBoostFlowContract$Step.BoostsOverview.f65758a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.category_boost.impl.ui.flow.a.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
