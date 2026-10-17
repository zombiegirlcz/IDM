package com.revolut.feature.onboarding.impl.onboarding;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes5.dex */
public final class g extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ d67.u v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ v f78438w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(d67.u uVar, v vVar, Continuation continuation) {
        super(2, continuation);
        this.v = uVar;
        this.f78438w = vVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new g(this.v, this.f78438w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((g) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0041, code lost:
    
        if (com.revolut.feature.onboarding.impl.onboarding.v.Y2(r3, null, r6, 3) != r0) goto L31;
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
            r2 = 0
            com.revolut.feature.onboarding.impl.onboarding.v r3 = r6.f78438w
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L20
            if (r1 == r5) goto L1c
            if (r1 != r4) goto L14
            yhm.o.b(r7)
            goto L87
        L14:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1c:
            yhm.o.b(r7)
            goto L3a
        L20:
            yhm.o.b(r7)
            d67.s r7 = d67.s.f111464a
            d67.u r1 = r6.v
            boolean r7 = kotlin.jvm.internal.Intrinsics.f(r1, r7)
            if (r7 == 0) goto L44
            fwj.p r7 = r3.A
            r6.u = r5
            o0j.c$i r1 = o0j.c.i.f221224a
            java.lang.Object r7 = r7.h(r1, r6)
            if (r7 != r0) goto L3a
            goto L43
        L3a:
            r6.u = r4
            r7 = 3
            java.lang.Object r7 = com.revolut.feature.onboarding.impl.onboarding.v.Y2(r3, r2, r6, r7)
            if (r7 != r0) goto L87
        L43:
            return r0
        L44:
            d67.q r7 = d67.q.f111462a
            boolean r7 = kotlin.jvm.internal.Intrinsics.f(r1, r7)
            if (r7 == 0) goto L50
            r3.B2()
            goto L87
        L50:
            boolean r7 = r1 instanceof d67.p
            if (r7 != 0) goto L6b
            d67.r r7 = d67.r.f111463a
            boolean r7 = kotlin.jvm.internal.Intrinsics.f(r1, r7)
            if (r7 != 0) goto L6b
            d67.t r7 = d67.t.f111465a
            boolean r7 = kotlin.jvm.internal.Intrinsics.f(r1, r7)
            if (r7 == 0) goto L65
            goto L6b
        L65:
            kotlin.NoWhenBranchMatchedException r7 = new kotlin.NoWhenBranchMatchedException
            r7.<init>()
            throw r7
        L6b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r3 = "Unknown click action "
            r0.<init>(r3)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r7.<init>(r0)
            zhm.h0 r0 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r1 = rd0.d.f253311a
            rd0.c r1 = rd0.c.ERROR
            rd0.d.a(r1, r2, r2, r7, r0)
        L87:
            kotlin.Unit r7 = kotlin.Unit.f186387a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.onboarding.impl.onboarding.g.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
