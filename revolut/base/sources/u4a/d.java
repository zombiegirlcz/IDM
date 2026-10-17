package u4a;

import ang.f;
import gr6.s;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final uo9.a f277284a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s f277285b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f277286c;

    public d(uo9.a paymentRulesInteractor, s paymentLinkCrossSellInteractor, f userInteractor) {
        Intrinsics.checkNotNullParameter(paymentRulesInteractor, "paymentRulesInteractor");
        Intrinsics.checkNotNullParameter(paymentLinkCrossSellInteractor, "paymentLinkCrossSellInteractor");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        this.f277284a = paymentRulesInteractor;
        this.f277285b = paymentLinkCrossSellInteractor;
        this.f277286c = userInteractor;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(gim.c r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof u4a.c
            if (r0 == 0) goto L13
            r0 = r8
            u4a.c r0 = (u4a.c) r0
            int r1 = r0.f277283x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f277283x = r1
            goto L18
        L13:
            u4a.c r0 = new u4a.c
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f277283x
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3f
            if (r2 == r5) goto L3b
            if (r2 == r4) goto L37
            if (r2 != r3) goto L2f
            com.revolut.feature.freelancer.common.models.ProPaymentLinkEligibility r0 = r0.u
            yhm.o.b(r8)
            goto L7f
        L2f:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L37:
            yhm.o.b(r8)
            goto L68
        L3b:
            yhm.o.b(r8)
            goto L53
        L3f:
            yhm.o.b(r8)
            uo9.a r8 = r7.f277284a
            wt9.a r8 = (wt9.a) r8
            efm.r r8 = r8.a()
            r0.f277283x = r5
            java.lang.Object r8 = nim.a.c(r8, r0)
            if (r8 != r1) goto L53
            goto L7b
        L53:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L97
            r0.f277283x = r4
            gr6.s r8 = r7.f277285b
            et6.b4 r8 = (et6.b4) r8
            java.lang.Object r8 = r8.a(r0)
            if (r8 != r1) goto L68
            goto L7b
        L68:
            com.revolut.feature.freelancer.common.models.ProPaymentLinkEligibility r8 = (com.revolut.feature.freelancer.common.models.ProPaymentLinkEligibility) r8
            ang.f r2 = r7.f277286c
            r4 = 0
            efm.d0 r2 = r2.f(r4)
            r0.u = r8
            r0.f277283x = r3
            java.lang.Object r0 = nim.a.b(r2, r0)
            if (r0 != r1) goto L7c
        L7b:
            return r1
        L7c:
            r6 = r0
            r0 = r8
            r8 = r6
        L7f:
            java.lang.String r1 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r8, r1)
            do3.n r8 = (do3.n) r8
            wi0.a r1 = wi0.b.Companion
            r1.getClass()
            wi0.b r1 = wi0.b.f297770q3
            boolean r8 = te0.w.S(r8, r1)
            u4a.a r1 = new u4a.a
            r1.<init>(r0, r8)
            return r1
        L97:
            u4a.b$a r8 = u4a.b.a.f277281a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: u4a.d.a(gim.c):java.lang.Object");
    }
}
