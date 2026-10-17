package li5;

import com.revolut.feature.crypto.onboarding.impl.service.CryptoOnboardingService;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CryptoOnboardingService f195417a;

    public d(CryptoOnboardingService service) {
        Intrinsics.checkNotNullParameter(service, "service");
        this.f195417a = service;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(yh5.c r6, gim.c r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof li5.a
            if (r0 == 0) goto L13
            r0 = r7
            li5.a r0 = (li5.a) r0
            int r1 = r0.f195414w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f195414w = r1
            goto L18
        L13:
            li5.a r0 = new li5.a
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f195414w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r7)
            goto L47
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2f:
            yhm.o.b(r7)
            l34.a r7 = new l34.a
            r2 = 23
            r4 = 0
            r7.<init>(r5, r6, r4, r2)
            skm.p0 r6 = skm.p0.f264001a
            elm.f r6 = elm.f.f127540b
            r0.f195414w = r3
            java.lang.Object r7 = skm.e0.J(r6, r7, r0)
            if (r7 != r1) goto L47
            return r1
        L47:
            yhm.m r7 = (yhm.m) r7
            java.lang.Object r6 = r7.f314193a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: li5.d.a(yh5.c, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(ec5.i r5, gim.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof li5.b
            if (r0 == 0) goto L13
            r0 = r6
            li5.b r0 = (li5.b) r0
            int r1 = r0.f195415w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f195415w = r1
            goto L18
        L13:
            li5.b r0 = new li5.b
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f195415w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)
            goto L45
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            yhm.o.b(r6)
            li5.c r6 = new li5.c
            r2 = 0
            r6.<init>(r4, r5, r2)
            skm.p0 r5 = skm.p0.f264001a
            elm.f r5 = elm.f.f127540b
            r0.f195415w = r3
            java.lang.Object r6 = skm.e0.J(r5, r6, r0)
            if (r6 != r1) goto L45
            return r1
        L45:
            yhm.m r6 = (yhm.m) r6
            java.lang.Object r5 = r6.f314193a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: li5.d.b(ec5.i, gim.c):java.lang.Object");
    }
}
