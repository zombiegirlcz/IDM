package com.revolut.retail.feature.impl.userauth.flow;

import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes11.dex */
public final class e extends i implements Function1 {
    public Boolean u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ f f101674w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, Continuation continuation) {
        super(1, continuation);
        this.f101674w = fVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new e(this.f101674w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((e) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0099  */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r12.v
            r2 = 0
            r3 = 2
            r4 = 1
            com.revolut.retail.feature.impl.userauth.flow.f r5 = r12.f101674w
            if (r1 == 0) goto L21
            if (r1 == r4) goto L1d
            if (r1 != r3) goto L15
            java.lang.Boolean r0 = r12.u
            yhm.o.b(r13)
            goto L86
        L15:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L1d:
            yhm.o.b(r13)
            goto L50
        L21:
            yhm.o.b(r13)
            fwj.p r13 = r5.f101675p
            efm.r r1 = r13.e()
            efm.d0 r1 = r1.firstOrError()
            fwj.g r6 = new fwj.g
            r7 = 2
            r6.<init>(r13, r7)
            fwj.h r13 = new fwj.h
            r13.<init>(r6, r7)
            r1.getClass()
            ufm.i r6 = new ufm.i
            r7 = 0
            r6.<init>(r1, r13, r7)
            java.lang.String r13 = "flatMap(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r13)
            r12.v = r4
            java.lang.Object r13 = nim.a.b(r6, r12)
            if (r13 != r0) goto L50
            goto L83
        L50:
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            bng.b r1 = r5.B
            ang.f r1 = r1.f17168a
            efm.r r1 = r1.k(r2)
            r4 = 0
            r6 = 3
            efm.r r1 = m70.a.g(r1, r4, r4, r6)
            bng.a r4 = new bng.a
            r6 = 0
            r4.<init>(r6)
            blh.g0 r6 = new blh.g0
            r7 = 5
            r6.<init>(r4, r7)
            efm.r r1 = r1.map(r6)
            efm.d0 r1 = r1.firstOrError()
            java.lang.String r4 = "firstOrError(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r4)
            r12.u = r13
            r12.v = r3
            java.lang.Object r1 = nim.a.b(r1, r12)
            if (r1 != r0) goto L84
        L83:
            return r0
        L84:
            r0 = r13
            r13 = r1
        L86:
            zlg.i r13 = (zlg.i) r13
            boolean r1 = r13 instanceof zlg.h
            if (r1 == 0) goto L99
            zlg.h r13 = (zlg.h) r13
            com.revolut.feature.terminated_users.api.config.TerminatedUsersFeatureConfig$Dashboard r0 = new com.revolut.feature.terminated_users.api.config.TerminatedUsersFeatureConfig$Dashboard
            do3.v r13 = r13.f323256a
            r0.<init>(r13, r2)
            r5.C1(r0)
            goto Laf
        L99:
            yki.i r6 = r5.M
            com.revolut.retail.feature.impl.userauth.flow.UserOnboardingFlowContract$Step$PostActivation r7 = new com.revolut.retail.feature.impl.userauth.flow.UserOnboardingFlowContract$Step$PostActivation
            kotlin.jvm.internal.Intrinsics.h(r0)
            boolean r13 = r0.booleanValue()
            r7.<init>(r13)
            r10 = 0
            r11 = 12
            r8 = 0
            r9 = 0
            oki.h.t2(r5, r6, r7, r8, r9, r10, r11)
        Laf:
            kotlin.Unit r13 = kotlin.Unit.f186387a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.retail.feature.impl.userauth.flow.e.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
