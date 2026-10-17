package yy9;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class h0 implements ry9.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final uw1.c f317895a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hp.g f317896b;

    public h0(uw1.c apmFeatureChecker, hp.g pixKeyValidator) {
        Intrinsics.checkNotNullParameter(apmFeatureChecker, "apmFeatureChecker");
        Intrinsics.checkNotNullParameter(pixKeyValidator, "pixKeyValidator");
        this.f317895a = apmFeatureChecker;
        this.f317896b = pixKeyValidator;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // ry9.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r5, gim.c r6) {
        /*
            Method dump skipped, instruction units count: 258
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yy9.h0.a(java.lang.String, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(kotlin.coroutines.Continuation r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof yy9.f0
            if (r0 == 0) goto L13
            r0 = r5
            yy9.f0 r0 = (yy9.f0) r0
            int r1 = r0.f317889w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f317889w = r1
            goto L1a
        L13:
            yy9.f0 r0 = new yy9.f0
            gim.c r5 = (gim.c) r5
            r0.<init>(r4, r5)
        L1a:
            java.lang.Object r5 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f317889w
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            yhm.o.b(r5)
            goto L47
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            yhm.o.b(r5)
            uw1.c r5 = r4.f317895a
            ty1.b r5 = (ty1.b) r5
            yoj.c r2 = yoj.c.PIX_BRL
            pfm.z r5 = r5.c(r2)
            r0.f317889w = r3
            java.lang.Object r5 = nim.a.b(r5, r0)
            if (r5 != r1) goto L47
            return r1
        L47:
            java.lang.String r0 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: yy9.h0.b(kotlin.coroutines.Continuation):java.lang.Object");
    }
}
