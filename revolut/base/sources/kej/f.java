package kej;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class f implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f183096a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f183097b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final oej.a f183098c;

    public f(h apnRepository, i preferredApnRepository, oej.a esimCoreInteractor) {
        Intrinsics.checkNotNullParameter(apnRepository, "apnRepository");
        Intrinsics.checkNotNullParameter(preferredApnRepository, "preferredApnRepository");
        Intrinsics.checkNotNullParameter(esimCoreInteractor, "esimCoreInteractor");
        this.f183096a = apnRepository;
        this.f183097b = preferredApnRepository;
        this.f183098c = esimCoreInteractor;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(kej.a r6, pej.c r7, gim.c r8) {
        /*
            r5 = this;
            kej.h r0 = r5.f183096a
            boolean r1 = r8 instanceof kej.e
            if (r1 == 0) goto L15
            r1 = r8
            kej.e r1 = (kej.e) r1
            int r2 = r1.f183095y
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.f183095y = r2
            goto L1a
        L15:
            kej.e r1 = new kej.e
            r1.<init>(r5, r8)
        L1a:
            java.lang.Object r8 = r1.f183093w
            fim.a r2 = fim.a.COROUTINE_SUSPENDED
            int r3 = r1.f183095y
            r4 = 1
            if (r3 == 0) goto L35
            if (r3 != r4) goto L2d
            pej.c r7 = r1.v
            kej.a r6 = r1.u
            yhm.o.b(r8)
            goto L49
        L2d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L35:
            yhm.o.b(r8)
            r1.u = r6
            r1.v = r7
            r1.f183095y = r4
            oej.a r8 = r5.f183098c
            oej.b r8 = (oej.b) r8
            java.lang.Boolean r8 = r8.c(r7)
            if (r8 != r2) goto L49
            return r2
        L49:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 != 0) goto L5e
            kej.b r6 = new kej.b
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "eSIM is not active"
            r7.<init>(r8)
            r6.<init>(r7)
            return r6
        L5e:
            r0.a(r6)     // Catch: java.lang.Throwable -> L6d
            java.lang.String r6 = r0.b(r6, r7)     // Catch: java.lang.Throwable -> L6d
            kej.i r8 = r5.f183097b     // Catch: java.lang.Throwable -> L6d
            r8.a(r6, r7)     // Catch: java.lang.Throwable -> L6d
            kej.c$a r6 = kej.c.a.f183092a     // Catch: java.lang.Throwable -> L6d
            return r6
        L6d:
            r6 = move-exception
            kej.b r7 = new kej.b
            java.lang.UnsupportedOperationException r8 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "eSIM APN cannot be configured"
            r8.<init>(r0, r6)
            r7.<init>(r8)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kej.f.a(kej.a, pej.c, gim.c):java.lang.Object");
    }
}
