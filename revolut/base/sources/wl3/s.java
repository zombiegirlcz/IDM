package wl3;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sl3.b f298401a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final sl3.p f298402b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n f298403c;
    public final l d;
    public final uvl.c e;

    public s(sl3.b contactsPermissionRepository, sl3.p contactsUpdateRepository, n deviceContactsBatchProvider, l80.e dateProvider, l deletedContactsCleaner, uvl.c deviceContactsBatchSynchronizer) {
        Intrinsics.checkNotNullParameter(contactsPermissionRepository, "contactsPermissionRepository");
        Intrinsics.checkNotNullParameter(contactsUpdateRepository, "contactsUpdateRepository");
        Intrinsics.checkNotNullParameter(deviceContactsBatchProvider, "deviceContactsBatchProvider");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        Intrinsics.checkNotNullParameter(deletedContactsCleaner, "deletedContactsCleaner");
        Intrinsics.checkNotNullParameter(deviceContactsBatchSynchronizer, "deviceContactsBatchSynchronizer");
        this.f298401a = contactsPermissionRepository;
        this.f298402b = contactsUpdateRepository;
        this.f298403c = deviceContactsBatchProvider;
        this.d = deletedContactsCleaner;
        this.e = deviceContactsBatchSynchronizer;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(wl3.s r20, ihm.k r21, gim.c r22) {
        /*
            Method dump skipped, instruction units count: 468
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: wl3.s.a(wl3.s, ihm.k, gim.c):java.lang.Object");
    }

    public final Object b(ihm.k kVar, afe.a aVar) {
        Object objC = c(new w64.d(this, kVar, null, 10), aVar);
        return objC == fim.a.COROUTINE_SUSPENDED ? objC : Unit.f186387a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0055, code lost:
    
        if (r8 == r1) goto L30;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r8v0, types: [w64.d] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v11, types: [kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v2, types: [kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x0085 -> B:21:0x0040). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(w64.d r8, gim.c r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof wl3.r
            if (r0 == 0) goto L13
            r0 = r9
            wl3.r r0 = (wl3.r) r0
            int r1 = r0.f298400x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f298400x = r1
            goto L18
        L13:
            wl3.r r0 = new wl3.r
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f298400x
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3d
            if (r2 == r4) goto L33
            if (r2 != r3) goto L2b
            kotlin.jvm.functions.Function1 r8 = r0.u
            kotlin.jvm.functions.Function1 r8 = (kotlin.jvm.functions.Function1) r8
            goto L3d
        L2b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L33:
            kotlin.jvm.functions.Function1 r8 = r0.u
            kotlin.jvm.functions.Function1 r8 = (kotlin.jvm.functions.Function1) r8
            yhm.o.b(r9)     // Catch: java.lang.Throwable -> L3b
            goto L89
        L3b:
            r9 = move-exception
            goto L58
        L3d:
            yhm.o.b(r9)
        L40:
            kotlin.coroutines.CoroutineContext r9 = r0.getContext()
            boolean r9 = skm.e0.x(r9)
            if (r9 == 0) goto L89
            r9 = r8
            kotlin.jvm.functions.Function1 r9 = (kotlin.jvm.functions.Function1) r9     // Catch: java.lang.Throwable -> L3b
            r0.u = r9     // Catch: java.lang.Throwable -> L3b
            r0.f298400x = r4     // Catch: java.lang.Throwable -> L3b
            java.lang.Object r8 = r8.invoke(r0)     // Catch: java.lang.Throwable -> L3b
            if (r8 != r1) goto L89
            goto L87
        L58:
            boolean r2 = r9 instanceof java.util.concurrent.CancellationException
            if (r2 != 0) goto L88
            com.revolut.feature.contacts.impl.data.repository.error.ContactSyncingException r2 = new com.revolut.feature.contacts.impl.data.repository.error.ContactSyncingException
            java.lang.String r5 = "cause"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r5)
            r2.<init>(r9)
            zhm.h0 r9 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r5 = rd0.d.f253311a
            rd0.c r5 = rd0.c.ERROR
            r6 = 0
            rd0.d.a(r5, r6, r6, r2, r9)
            kotlin.time.b$a r9 = kotlin.time.b.INSTANCE
            r9 = 30
            pkm.e r2 = pkm.e.SECONDS
            long r5 = kotlin.time.c.g(r9, r2)
            r9 = r8
            kotlin.jvm.functions.Function1 r9 = (kotlin.jvm.functions.Function1) r9
            r0.u = r9
            r0.f298400x = r3
            java.lang.Object r9 = skm.k0.c(r5, r0)
            if (r9 != r1) goto L40
        L87:
            return r1
        L88:
            throw r9
        L89:
            kotlin.Unit r8 = kotlin.Unit.f186387a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: wl3.s.c(w64.d, gim.c):java.lang.Object");
    }
}
