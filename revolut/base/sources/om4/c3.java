package om4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class c3 implements al4.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final eb5.a f226545a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xq3.t f226546b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k0 f226547c;

    public c3(eb5.a creditTilesInteractor, xq3.t creditLimitIncreaseApplicationInteractor, k0 creditCardFeatureInteractor) {
        Intrinsics.checkNotNullParameter(creditTilesInteractor, "creditTilesInteractor");
        Intrinsics.checkNotNullParameter(creditLimitIncreaseApplicationInteractor, "creditLimitIncreaseApplicationInteractor");
        Intrinsics.checkNotNullParameter(creditCardFeatureInteractor, "creditCardFeatureInteractor");
        this.f226545a = creditTilesInteractor;
        this.f226546b = creditLimitIncreaseApplicationInteractor;
        this.f226547c = creditCardFeatureInteractor;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0063, code lost:
    
        if (r5.f226546b.c(r6, r7, r0) == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.String r6, xp3.d r7, gim.c r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof om4.b3
            if (r0 == 0) goto L13
            r0 = r8
            om4.b3 r0 = (om4.b3) r0
            int r1 = r0.f226532y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f226532y = r1
            goto L18
        L13:
            om4.b3 r0 = new om4.b3
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.f226530w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f226532y
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r8)
            goto L66
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            xp3.d r7 = r0.v
            java.lang.String r6 = r0.u
            yhm.o.b(r8)
            goto L4e
        L3a:
            yhm.o.b(r8)
            yw4.f r8 = yw4.f.CREDIT_LIMIT_INCREASE_PREFERENCES
            r0.u = r6
            r0.v = r7
            r0.f226532y = r4
            om4.k0 r2 = r5.f226547c
            java.lang.Object r8 = r2.b(r6, r8, r0)
            if (r8 != r1) goto L4e
            goto L65
        L4e:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L69
            r8 = 0
            r0.u = r8
            r0.v = r8
            r0.f226532y = r3
            xq3.t r8 = r5.f226546b
            java.lang.Object r6 = r8.c(r6, r7, r0)
            if (r6 != r1) goto L66
        L65:
            return r1
        L66:
            kotlin.Unit r6 = kotlin.Unit.f186387a
            return r6
        L69:
            kotlin.Unit r6 = kotlin.Unit.f186387a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: om4.c3.b(java.lang.String, xp3.d, gim.c):java.lang.Object");
    }
}
