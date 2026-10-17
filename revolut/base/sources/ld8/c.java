package ld8;

import kd8.e;
import kd8.q;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f194051a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q f194052b;

    public c(e juniorConsentInteractor, q juniorConsentPromptInteractor) {
        Intrinsics.checkNotNullParameter(juniorConsentInteractor, "juniorConsentInteractor");
        Intrinsics.checkNotNullParameter(juniorConsentPromptInteractor, "juniorConsentPromptInteractor");
        this.f194051a = juniorConsentInteractor;
        this.f194052b = juniorConsentPromptInteractor;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0055, code lost:
    
        if (r5.f194052b.a(r6, r7, r0) == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r6, java.lang.String r7, v6d.a r8, gim.c r9) {
        /*
            r5 = this;
            boolean r0 = r9 instanceof ld8.a
            if (r0 == 0) goto L13
            r0 = r9
            ld8.a r0 = (ld8.a) r0
            int r1 = r0.f194048x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f194048x = r1
            goto L18
        L13:
            ld8.a r0 = new ld8.a
            r0.<init>(r5, r9)
        L18:
            java.lang.Object r9 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f194048x
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r9)
            goto L58
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            java.lang.String r6 = r0.u
            yhm.o.b(r9)
            goto L48
        L38:
            yhm.o.b(r9)
            r0.u = r6
            r0.f194048x = r4
            kd8.e r9 = r5.f194051a
            java.lang.Object r7 = r9.a(r6, r7, r8, r0)
            if (r7 != r1) goto L48
            goto L57
        L48:
            wc8.a r7 = wc8.a.CONSENT_GIVEN
            r8 = 0
            r0.u = r8
            r0.f194048x = r3
            kd8.q r8 = r5.f194052b
            java.lang.Object r6 = r8.a(r6, r7, r0)
            if (r6 != r1) goto L58
        L57:
            return r1
        L58:
            kotlin.Unit r6 = kotlin.Unit.f186387a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ld8.c.a(java.lang.String, java.lang.String, v6d.a, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0055, code lost:
    
        if (r5.f194052b.a(r6, r7, r0) == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.String r6, java.lang.String r7, v6d.a r8, gim.c r9) {
        /*
            r5 = this;
            boolean r0 = r9 instanceof ld8.b
            if (r0 == 0) goto L13
            r0 = r9
            ld8.b r0 = (ld8.b) r0
            int r1 = r0.f194050x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f194050x = r1
            goto L18
        L13:
            ld8.b r0 = new ld8.b
            r0.<init>(r5, r9)
        L18:
            java.lang.Object r9 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f194050x
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r9)
            goto L58
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            java.lang.String r6 = r0.u
            yhm.o.b(r9)
            goto L48
        L38:
            yhm.o.b(r9)
            r0.u = r6
            r0.f194050x = r4
            kd8.e r9 = r5.f194051a
            java.lang.Object r7 = r9.c(r6, r7, r8, r0)
            if (r7 != r1) goto L48
            goto L57
        L48:
            wc8.a r7 = wc8.a.CONSENT_NOT_GIVEN
            r8 = 0
            r0.u = r8
            r0.f194050x = r3
            kd8.q r8 = r5.f194052b
            java.lang.Object r6 = r8.a(r6, r7, r0)
            if (r6 != r1) goto L58
        L57:
            return r1
        L58:
            kotlin.Unit r6 = kotlin.Unit.f186387a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ld8.c.b(java.lang.String, java.lang.String, v6d.a, gim.c):java.lang.Object");
    }
}
