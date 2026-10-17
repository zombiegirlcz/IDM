package dhk;

import ffk.t;
import kotlin.jvm.internal.Intrinsics;
import r10.q;

/* JADX INFO: loaded from: classes11.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f114837a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q f114838b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final gte.a f114839c;

    public l(t pricingPlansInteractor, q userRegisteredIdentitiesInteractor, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(pricingPlansInteractor, "pricingPlansInteractor");
        Intrinsics.checkNotNullParameter(userRegisteredIdentitiesInteractor, "userRegisteredIdentitiesInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f114837a = pricingPlansInteractor;
        this.f114838b = userRegisteredIdentitiesInteractor;
        this.f114839c = featureToggleInteractor;
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x00ce, code lost:
    
        r0.put(r1, r4);
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(com.revolut.feature.pricingplans.models.SubscriptionPreviewId r9, gim.c r10) {
        /*
            Method dump skipped, instruction units count: 224
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dhk.l.a(com.revolut.feature.pricingplans.models.SubscriptionPreviewId, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(gim.c r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof dhk.j
            if (r0 == 0) goto L13
            r0 = r7
            dhk.j r0 = (dhk.j) r0
            int r1 = r0.f114835w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f114835w = r1
            goto L18
        L13:
            dhk.j r0 = new dhk.j
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f114835w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r7)
            goto L5d
        L27:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L2f:
            yhm.o.b(r7)
            do3.f r7 = do3.f.BANKING
            r2 = 0
            r4 = 6
            r10.q r5 = r6.f114838b
            akg.n r7 = r10.q.j0(r5, r7, r2, r4)
            zhm.h0 r2 = zhm.h0.f322473a
            vkm.q0 r7 = rd0.e.n(r7, r2)
            dee.a0 r2 = new dee.a0
            r4 = 10
            r2.<init>(r4)
            dee.a0 r4 = new dee.a0
            r5 = 11
            r4.<init>(r5)
            jhi.b r7 = mo3.a.e(r7, r2, r4)
            r0.f114835w = r3
            java.lang.Object r7 = vkm.q.z(r7, r0)
            if (r7 != r1) goto L5d
            return r1
        L5d:
            java.util.List r7 = (java.util.List) r7
            if (r7 != 0) goto L63
            zhm.f0 r7 = zhm.f0.f322471a
        L63:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: dhk.l.b(gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(com.revolut.feature.pricingplans.models.SubscriptionPreviewId r7, gim.c r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof dhk.k
            if (r0 == 0) goto L13
            r0 = r8
            dhk.k r0 = (dhk.k) r0
            int r1 = r0.f114836w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f114836w = r1
            goto L18
        L13:
            dhk.k r0 = new dhk.k
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f114836w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r8)
            goto L65
        L27:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L2f:
            yhm.o.b(r8)
            ffk.t r8 = r6.f114837a
            vkm.d r7 = ffk.t.w(r8, r7)
            dg3.d r8 = new dg3.d
            r2 = 5
            r8.<init>(r2)
            akg.n r7 = nim.a.v(r7, r8)
            dee.a0 r8 = new dee.a0
            r2 = 12
            r8.<init>(r2)
            r2 = 0
            jhi.b r7 = mo3.a.g(r7, r2, r8, r3)
            c9k.k r8 = new c9k.k
            r4 = 3
            r5 = 15
            r8.<init>(r4, r5, r2)
            zhm.h0 r2 = zhm.h0.f322473a
            vkm.y r7 = rd0.e.e(r7, r2, r8)
            r0.f114836w = r3
            java.lang.Object r8 = vkm.q.x(r7, r0)
            if (r8 != r1) goto L65
            return r1
        L65:
            java.util.List r8 = (java.util.List) r8
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: dhk.l.c(com.revolut.feature.pricingplans.models.SubscriptionPreviewId, gim.c):java.lang.Object");
    }
}
