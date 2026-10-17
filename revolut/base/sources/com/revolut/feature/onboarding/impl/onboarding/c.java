package com.revolut.feature.onboarding.impl.onboarding;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes5.dex */
public final class c extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ ka9.d v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ v f78397w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(ka9.d dVar, v vVar, Continuation continuation) {
        super(2, continuation);
        this.v = dVar;
        this.f78397w = vVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new c(this.v, this.f78397w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0040, code lost:
    
        if (com.revolut.feature.onboarding.impl.onboarding.v.Y2(r2, null, r5, 3) != r0) goto L21;
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
            com.revolut.feature.onboarding.impl.onboarding.v r2 = r5.f78397w
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L1e
            if (r1 == r4) goto L1a
            if (r1 != r3) goto L12
            yhm.o.b(r6)
            goto L50
        L12:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L1a:
            yhm.o.b(r6)
            goto L38
        L1e:
            yhm.o.b(r6)
            ka9.d$a r6 = ka9.d.a.f182447a
            ka9.d r1 = r5.v
            boolean r6 = kotlin.jvm.internal.Intrinsics.f(r1, r6)
            if (r6 == 0) goto L43
            fwj.p r6 = r2.A
            r5.u = r4
            o0j.c$e r1 = o0j.c.e.f221220a
            java.lang.Object r6 = r6.h(r1, r5)
            if (r6 != r0) goto L38
            goto L42
        L38:
            r5.u = r3
            r6 = 0
            r1 = 3
            java.lang.Object r6 = com.revolut.feature.onboarding.impl.onboarding.v.Y2(r2, r6, r5, r1)
            if (r6 != r0) goto L50
        L42:
            return r0
        L43:
            ka9.d$b r6 = ka9.d.b.f182448a
            boolean r6 = kotlin.jvm.internal.Intrinsics.f(r1, r6)
            if (r6 == 0) goto L53
            q89.f r6 = q89.f.STORIES
            r2.T2(r6)
        L50:
            kotlin.Unit r6 = kotlin.Unit.f186387a
            return r6
        L53:
            kotlin.NoWhenBranchMatchedException r6 = new kotlin.NoWhenBranchMatchedException
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.onboarding.impl.onboarding.c.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
