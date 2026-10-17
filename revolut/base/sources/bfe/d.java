package bfe;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class d implements yee.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14974a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final afe.d f14975b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f14976c;
    public final Object d;

    public d(afe.d appInfoFactory, n80.e packageManager, y80.a permissionProvider, fn0.a securityGuardianInteractor) {
        Intrinsics.checkNotNullParameter(appInfoFactory, "appInfoFactory");
        Intrinsics.checkNotNullParameter(packageManager, "packageManager");
        Intrinsics.checkNotNullParameter(permissionProvider, "permissionProvider");
        Intrinsics.checkNotNullParameter(securityGuardianInteractor, "securityGuardianInteractor");
        this.f14975b = appInfoFactory;
        this.f14976c = packageManager;
        this.d = permissionProvider;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007a A[Catch: RuntimeException -> 0x003a, DeadObjectException -> 0x00e0, TRY_ENTER, TryCatch #2 {DeadObjectException -> 0x00e0, RuntimeException -> 0x003a, blocks: (B:14:0x0036, B:31:0x009f, B:24:0x0072, B:27:0x007a, B:34:0x00ab, B:35:0x00b8, B:37:0x00be, B:33:0x00a7, B:23:0x0059), top: B:98:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a7 A[Catch: RuntimeException -> 0x003a, DeadObjectException -> 0x00e0, TryCatch #2 {DeadObjectException -> 0x00e0, RuntimeException -> 0x003a, blocks: (B:14:0x0036, B:31:0x009f, B:24:0x0072, B:27:0x007a, B:34:0x00ab, B:35:0x00b8, B:37:0x00be, B:33:0x00a7, B:23:0x0059), top: B:98:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ab A[Catch: RuntimeException -> 0x003a, DeadObjectException -> 0x00e0, TryCatch #2 {DeadObjectException -> 0x00e0, RuntimeException -> 0x003a, blocks: (B:14:0x0036, B:31:0x009f, B:24:0x0072, B:27:0x007a, B:34:0x00ab, B:35:0x00b8, B:37:0x00be, B:33:0x00a7, B:23:0x0059), top: B:98:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0018  */
    /* JADX WARN: Type inference failed for: r0v4, types: [fim.a] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.util.HashSet] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x009c -> B:31:0x009f). Please report as a decompilation issue!!! */
    @Override // yee.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(kotlin.coroutines.Continuation r12) {
        /*
            Method dump skipped, instruction units count: 512
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bfe.d.a(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object b(java.lang.String r5, gim.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof gfe.b
            if (r0 == 0) goto L13
            r0 = r6
            gfe.b r0 = (gfe.b) r0
            int r1 = r0.f143397x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f143397x = r1
            goto L18
        L13:
            gfe.b r0 = new gfe.b
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f143397x
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            java.lang.String r5 = r0.u
            yhm.o.b(r6)
            goto L3d
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            yhm.o.b(r6)
            r0.u = r5
            r0.f143397x = r3
            zhm.h0 r6 = zhm.h0.f322473a
            if (r6 != r1) goto L3d
            return r1
        L3d:
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            boolean r0 = r6 instanceof java.util.Collection
            r1 = 0
            if (r0 == 0) goto L4f
            r0 = r6
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L4f
        L4d:
            r3 = r1
            goto L69
        L4f:
            java.util.Iterator r6 = r6.iterator()
        L53:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L4d
            java.lang.Object r0 = r6.next()
            gn0.c r0 = (gn0.c) r0
            java.lang.String r0 = r0.f144895a
            if (r0 == 0) goto L53
            boolean r0 = kotlin.text.a0.H(r5, r0, r1)
            if (r0 != r3) goto L53
        L69:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r3)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: bfe.d.b(java.lang.String, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00b8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x00d6 -> B:32:0x00db). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object c(int r19, long r20, an0.e r22, bfe.b r23, gim.c r24) {
        /*
            Method dump skipped, instruction units count: 245
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bfe.d.c(int, long, an0.e, bfe.b, gim.c):java.lang.Object");
    }

    public d(b70.e accessibilityDataProvider, afe.d appInfoFactory, fn0.a securityGuardianInteractor, pn0.c signatureProvider) {
        Intrinsics.checkNotNullParameter(accessibilityDataProvider, "accessibilityDataProvider");
        Intrinsics.checkNotNullParameter(appInfoFactory, "appInfoFactory");
        Intrinsics.checkNotNullParameter(securityGuardianInteractor, "securityGuardianInteractor");
        Intrinsics.checkNotNullParameter(signatureProvider, "signatureProvider");
        this.f14976c = accessibilityDataProvider;
        this.f14975b = appInfoFactory;
        this.d = signatureProvider;
    }
}
