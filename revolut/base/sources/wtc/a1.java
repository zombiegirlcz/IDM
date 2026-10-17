package wtc;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class a1 implements ptc.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cuc.u f299851a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final otc.b f299852b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xoj.a f299853c;
    public final jla.h d;
    public final w39.b e;
    public final g0 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final gte.a f299854g;

    public a1(cuc.u securityHubRepository, otc.b securityHubType, xoj.a featuresInteractor, jla.h productCatalogueInteractor, w39.b locationInteractor, g0 streetModeInteractor, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(securityHubRepository, "securityHubRepository");
        Intrinsics.checkNotNullParameter(securityHubType, "securityHubType");
        Intrinsics.checkNotNullParameter(featuresInteractor, "featuresInteractor");
        Intrinsics.checkNotNullParameter(productCatalogueInteractor, "productCatalogueInteractor");
        Intrinsics.checkNotNullParameter(locationInteractor, "locationInteractor");
        Intrinsics.checkNotNullParameter(streetModeInteractor, "streetModeInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f299851a = securityHubRepository;
        this.f299852b = securityHubType;
        this.f299853c = featuresInteractor;
        this.d = productCatalogueInteractor;
        this.e = locationInteractor;
        this.f = streetModeInteractor;
        this.f299854g = featureToggleInteractor;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00a2 A[PHI: r2 r10
      0x00a2: PHI (r2v9 wtc.a1) = (r2v6 wtc.a1), (r2v12 wtc.a1) binds: [B:34:0x009f, B:18:0x0039] A[DONT_GENERATE, DONT_INLINE]
      0x00a2: PHI (r10v15 java.lang.Object) = (r10v12 java.lang.Object), (r10v1 java.lang.Object) binds: [B:34:0x009f, B:18:0x0039] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00af A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(gim.c r10) throws java.lang.Throwable {
        /*
            r9 = this;
            boolean r0 = r10 instanceof wtc.v0
            if (r0 == 0) goto L13
            r0 = r10
            wtc.v0 r0 = (wtc.v0) r0
            int r1 = r0.f299914y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f299914y = r1
            goto L18
        L13:
            wtc.v0 r0 = new wtc.v0
            r0.<init>(r9, r10)
        L18:
            java.lang.Object r10 = r0.f299912w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f299914y
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            r7 = 0
            if (r2 == 0) goto L50
            if (r2 == r6) goto L48
            if (r2 == r5) goto L40
            if (r2 == r4) goto L39
            if (r2 != r3) goto L31
            yhm.o.b(r10)
            return r10
        L31:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L39:
            wtc.a1 r2 = r0.u
            yhm.o.b(r10)
            goto La2
        L40:
            cuc.u r2 = r0.v
            wtc.a1 r5 = r0.u
            yhm.o.b(r10)
            goto L7e
        L48:
            cuc.u r2 = r0.v
            wtc.a1 r6 = r0.u
            yhm.o.b(r10)
            goto L68
        L50:
            yhm.o.b(r10)
            r0.u = r9
            cuc.u r10 = r9.f299851a
            r0.v = r10
            r0.f299914y = r6
            wtc.g0 r2 = r9.f
            java.lang.Object r2 = r2.c(r0)
            if (r2 != r1) goto L64
            goto Lae
        L64:
            r6 = r2
            r2 = r10
            r10 = r6
            r6 = r9
        L68:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto L84
            r0.u = r6
            r0.v = r2
            r0.f299914y = r5
            java.lang.Object r10 = r9.b(r0)
            if (r10 != r1) goto L7d
            goto Lae
        L7d:
            r5 = r6
        L7e:
            java.lang.String r10 = (java.lang.String) r10
            r8 = r5
            r5 = r2
            r2 = r8
            goto L87
        L84:
            r5 = r2
            r2 = r6
            r10 = r7
        L87:
            r0.u = r2
            r0.v = r7
            r0.f299914y = r4
            cuc.z r5 = (cuc.z) r5
            r5.getClass()
            cuc.c r6 = new cuc.c
            r6.<init>(r5, r10, r7, r4)
            skm.p0 r10 = skm.p0.f264001a
            elm.f r10 = elm.f.f127540b
            java.lang.Object r10 = skm.e0.J(r10, r6, r0)
            if (r10 != r1) goto La2
            goto Lae
        La2:
            com.revolut.feature.security_hub.api.models.WealthProtectionFeaturesState r10 = (com.revolut.feature.security_hub.api.models.WealthProtectionFeaturesState) r10
            r0.u = r7
            r0.f299914y = r3
            java.lang.Object r10 = r2.d(r10, r0)
            if (r10 != r1) goto Laf
        Lae:
            return r1
        Laf:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: wtc.a1.a(gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0065, code lost:
    
        if (r7 == r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(gim.c r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof wtc.w0
            if (r0 == 0) goto L13
            r0 = r7
            wtc.w0 r0 = (wtc.w0) r0
            int r1 = r0.f299917w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f299917w = r1
            goto L18
        L13:
            wtc.w0 r0 = new wtc.w0
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f299917w
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r7)
            goto L68
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
            r0.f299917w = r4
            wtc.g0 r7 = r6.f
            java.lang.Object r7 = r7.b(r0)
            if (r7 != r1) goto L44
            goto L67
        L44:
            com.revolut.feature.location.api.domain.models.location.LocationDomain r7 = (com.revolut.feature.location.api.domain.models.location.LocationDomain) r7
            if (r7 == 0) goto L50
            java.lang.String r7 = oi0.d.S(r7)
            if (r7 != 0) goto L4f
            goto L50
        L4f:
            return r7
        L50:
            java.lang.Long r7 = new java.lang.Long
            r4 = 10000(0x2710, double:4.9407E-320)
            r7.<init>(r4)
            w39.b r2 = r6.e
            z39.b r2 = (z39.b) r2
            ufm.i r7 = r2.c(r7)
            r0.f299917w = r3
            java.lang.Object r7 = nim.a.b(r7, r0)
            if (r7 != r1) goto L68
        L67:
            return r1
        L68:
            od0.i r7 = (od0.i) r7
            java.lang.Object r7 = r7.g()
            com.revolut.feature.location.api.domain.models.location.LocationDomain r7 = (com.revolut.feature.location.api.domain.models.location.LocationDomain) r7
            if (r7 == 0) goto L77
            java.lang.String r7 = oi0.d.S(r7)
            return r7
        L77:
            r7 = 0
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: wtc.a1.b(gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(yoj.c r5, boolean r6, gim.c r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof wtc.x0
            if (r0 == 0) goto L13
            r0 = r7
            wtc.x0 r0 = (wtc.x0) r0
            int r1 = r0.f299919w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f299919w = r1
            goto L18
        L13:
            wtc.x0 r0 = new wtc.x0
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f299919w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r7)
            goto L63
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            yhm.o.b(r7)
            if (r6 == 0) goto L3c
            otc.b r6 = r4.f299852b
            otc.b r7 = otc.b.REVOLUT_X
            if (r6 != r7) goto L3c
            r5 = 0
            goto L6c
        L3c:
            xoj.a r6 = r4.f299853c
            efm.d0 r5 = xoj.a.c(r6, r5)
            wsg.a r6 = new wsg.a
            r7 = 19
            r6.<init>(r7)
            wsg.k r7 = new wsg.k
            r2 = 6
            r7.<init>(r6, r2)
            ufm.i r6 = new ufm.i
            r2 = 1
            r6.<init>(r5, r7, r2)
            java.lang.String r5 = "map(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r5)
            r0.f299919w = r3
            java.lang.Object r7 = nim.a.b(r6, r0)
            if (r7 != r1) goto L63
            return r1
        L63:
            kotlin.jvm.internal.Intrinsics.h(r7)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r5 = r7.booleanValue()
        L6c:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: wtc.a1.c(yoj.c, boolean, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x00e3, code lost:
    
        if (r1 == r3) goto L58;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(com.revolut.feature.security_hub.api.models.WealthProtectionFeaturesState r17, gim.c r18) {
        /*
            Method dump skipped, instruction units count: 378
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: wtc.a1.d(com.revolut.feature.security_hub.api.models.WealthProtectionFeaturesState, gim.c):java.lang.Object");
    }
}
