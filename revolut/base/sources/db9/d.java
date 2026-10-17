package db9;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class d implements q89.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qb9.d f112688a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final pre.c f112689b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final fk3.a f112690c;

    public d(qb9.d onboardingRepository, pre.c termsInteractor, fk3.a configurationInteractor) {
        Intrinsics.checkNotNullParameter(onboardingRepository, "onboardingRepository");
        Intrinsics.checkNotNullParameter(termsInteractor, "termsInteractor");
        Intrinsics.checkNotNullParameter(configurationInteractor, "configurationInteractor");
        this.f112688a = onboardingRepository;
        this.f112689b = termsInteractor;
        this.f112690c = configurationInteractor;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0059, code lost:
    
        if (skm.e0.o(r7, r0) == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(gim.c r6, java.util.List r7, wi0.b r8) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof db9.c
            if (r0 == 0) goto L13
            r0 = r6
            db9.c r0 = (db9.c) r0
            int r1 = r0.f112687w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f112687w = r1
            goto L18
        L13:
            db9.c r0 = new db9.c
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f112687w
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r6)
            goto L5c
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            yhm.o.b(r6)
            goto L49
        L36:
            yhm.o.b(r6)
            pre.c r6 = r5.f112689b
            r2 = 4
            efm.d0 r6 = pre.c.h(r6, r8, r7, r2)
            r0.f112687w = r4
            java.lang.Object r6 = nim.a.b(r6, r0)
            if (r6 != r1) goto L49
            goto L5b
        L49:
            java.util.List r6 = (java.util.List) r6
            cuc.c r7 = new cuc.c
            r8 = 24
            r2 = 0
            r7.<init>(r6, r5, r2, r8)
            r0.f112687w = r3
            java.lang.Object r6 = skm.e0.o(r7, r0)
            if (r6 != r1) goto L5c
        L5b:
            return r1
        L5c:
            kotlin.Unit r6 = kotlin.Unit.f186387a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: db9.d.a(gim.c, java.util.List, wi0.b):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:87:0x0141, code lost:
    
        if (a(r3, r1, r5) == r4) goto L88;
     */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0147  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(wi0.b r19, t89.a r20, gim.c r21) {
        /*
            Method dump skipped, instruction units count: 330
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: db9.d.b(wi0.b, t89.a, gim.c):java.lang.Object");
    }

    public final boolean c() {
        return this.f112688a.f244139a.c("ONBOARDING_FLOW_PASSED_KEY", false);
    }

    @Override // od0.e
    public final void clear() {
        this.f112688a.f244139a.l("ONBOARDING_FLOW_PASSED_KEY", false);
    }
}
