package t0f;

import kotlin.jvm.internal.Intrinsics;
import mt8.d;

/* JADX INFO: loaded from: classes8.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f267019a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xoj.a f267020b;

    public b(d kycInteractor, xoj.a featuresInteractor) {
        Intrinsics.checkNotNullParameter(kycInteractor, "kycInteractor");
        Intrinsics.checkNotNullParameter(featuresInteractor, "featuresInteractor");
        this.f267019a = kycInteractor;
        this.f267020b = featuresInteractor;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x006b, code lost:
    
        if (r8 == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(yt8.i r7, gim.c r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof t0f.a
            if (r0 == 0) goto L13
            r0 = r8
            t0f.a r0 = (t0f.a) r0
            int r1 = r0.f267018x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f267018x = r1
            goto L18
        L13:
            t0f.a r0 = new t0f.a
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f267018x
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r8)
            goto L6e
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L32:
            yt8.i r7 = r0.u
            yhm.o.b(r8)
            goto L52
        L38:
            yhm.o.b(r8)
            yoj.c r8 = yoj.c.PREKYC_TOPUP
            yoj.d r2 = yoj.d.DISABLED
            xoj.a r5 = r6.f267020b
            cpj.b r5 = (cpj.b) r5
            ufm.i r8 = r5.f(r8, r2)
            r0.u = r7
            r0.f267018x = r4
            java.lang.Object r8 = nim.a.b(r8, r0)
            if (r8 != r1) goto L52
            goto L6d
        L52:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L7c
            if (r7 != 0) goto L72
            mt8.d r7 = r6.f267019a
            ufm.b r7 = r7.getKyc()
            r8 = 0
            r0.u = r8
            r0.f267018x = r3
            java.lang.Object r8 = nim.a.b(r7, r0)
            if (r8 != r1) goto L6e
        L6d:
            return r1
        L6e:
            yt8.c r8 = (yt8.c) r8
            yt8.i r7 = r8.f316662a
        L72:
            boolean r7 = ngm.n.p(r7)
            r7 = r7 ^ r4
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            return r7
        L7c:
            java.lang.Boolean r7 = java.lang.Boolean.FALSE
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: t0f.b.a(yt8.i, gim.c):java.lang.Object");
    }
}
