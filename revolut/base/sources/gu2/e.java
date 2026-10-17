package gu2;

import kotlin.jvm.internal.Intrinsics;
import ku2.h;

/* JADX INFO: loaded from: classes21.dex */
public final class e extends yji.d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final hu2.a f146687c;
    public final h d;

    public e(hu2.a captchaAvailabilityProvider, h captchaResolver) {
        Intrinsics.checkNotNullParameter(captchaAvailabilityProvider, "captchaAvailabilityProvider");
        Intrinsics.checkNotNullParameter(captchaResolver, "captchaResolver");
        this.f146687c = captchaAvailabilityProvider;
        this.d = captchaResolver;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object Q(gim.c r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof gu2.c
            if (r0 == 0) goto L13
            r0 = r5
            gu2.c r0 = (gu2.c) r0
            int r1 = r0.f146685w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f146685w = r1
            goto L18
        L13:
            gu2.c r0 = new gu2.c
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f146685w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r5)
            goto L3d
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            yhm.o.b(r5)
            r0.f146685w = r3
            hu2.a r5 = r4.f146687c
            java.lang.Object r5 = r5.a(r0)
            if (r5 != r1) goto L3d
            return r1
        L3d:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L4a
            ku2.h r5 = r4.d
            r5.b()
        L4a:
            kotlin.Unit r5 = kotlin.Unit.f186387a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: gu2.e.Q(gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object R(gim.c r7) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r7 instanceof gu2.d
            if (r0 == 0) goto L13
            r0 = r7
            gu2.d r0 = (gu2.d) r0
            int r1 = r0.f146686w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f146686w = r1
            goto L18
        L13:
            gu2.d r0 = new gu2.d
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f146686w
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r7)
            return r7
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L32:
            yhm.o.b(r7)
            goto L44
        L36:
            yhm.o.b(r7)
            r0.f146686w = r4
            hu2.a r7 = r6.f146687c
            java.lang.Object r7 = r7.a(r0)
            if (r7 != r1) goto L44
            goto L63
        L44:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L65
            r0.f146686w = r3
            skm.p0 r7 = skm.p0.f264001a
            tkm.e r7 = zkm.o.f323119a
            tkm.e r7 = r7.e
            ku2.f r2 = new ku2.f
            r3 = 0
            r4 = 0
            ku2.h r5 = r6.d
            r2.<init>(r5, r3, r4)
            java.lang.Object r7 = skm.e0.J(r7, r2, r0)
            if (r7 != r1) goto L64
        L63:
            return r1
        L64:
            return r7
        L65:
            iu2.b r7 = new iu2.b
            java.lang.String r0 = ""
            r7.<init>(r0)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: gu2.e.R(gim.c):java.lang.Object");
    }
}
