package kl9;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class c {

    @NotNull
    private static final a Companion = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final hlm.c f185409b = hlm.d.a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zk0.b f185410a;

    public c(zk0.b fileSystemRepository) {
        Intrinsics.checkNotNullParameter(fileSystemRepository, "fileSystemRepository");
        this.f185410a = fileSystemRepository;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x007c, code lost:
    
        if (r14 == r1) goto L26;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r12v1, types: [hlm.a] */
    /* JADX WARN: Type inference failed for: r12v10 */
    /* JADX WARN: Type inference failed for: r12v4, types: [hlm.a] */
    /* JADX WARN: Type inference failed for: r12v9 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.io.File r12, java.lang.String r13, gim.c r14) {
        /*
            r11 = this;
            boolean r0 = r14 instanceof kl9.b
            if (r0 == 0) goto L13
            r0 = r14
            kl9.b r0 = (kl9.b) r0
            int r1 = r0.A
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.A = r1
            goto L18
        L13:
            kl9.b r0 = new kl9.b
            r0.<init>(r11, r14)
        L18:
            java.lang.Object r14 = r0.f185408y
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.A
            r3 = 2
            r4 = 1
            r10 = 0
            if (r2 == 0) goto L48
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            hlm.a r12 = r0.f185406w
            yhm.o.b(r14)     // Catch: java.lang.Throwable -> L2d
            goto L7f
        L2d:
            r0 = move-exception
            r13 = r0
            goto L85
        L30:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L38:
            int r12 = r0.f185407x
            hlm.a r13 = r0.f185406w
            java.lang.String r2 = r0.v
            java.io.File r4 = r0.u
            yhm.o.b(r14)
            r9 = r2
            r8 = r4
            r2 = r12
            r12 = r13
            goto L62
        L48:
            yhm.o.b(r14)
            r0.u = r12
            r0.v = r13
            hlm.c r14 = kl9.c.f185409b
            r0.f185406w = r14
            r2 = 0
            r0.f185407x = r2
            r0.A = r4
            java.lang.Object r4 = r14.lock(r10, r0)
            if (r4 != r1) goto L5f
            goto L7e
        L5f:
            r8 = r12
            r9 = r13
            r12 = r14
        L62:
            skm.p0 r13 = skm.p0.f264001a     // Catch: java.lang.Throwable -> L2d
            elm.f r13 = elm.f.f127540b     // Catch: java.lang.Throwable -> L2d
            im9.h r5 = new im9.h     // Catch: java.lang.Throwable -> L2d
            r6 = 16
            r7 = r11
            r5.<init>(r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L2d
            r0.u = r10     // Catch: java.lang.Throwable -> L2d
            r0.v = r10     // Catch: java.lang.Throwable -> L2d
            r0.f185406w = r12     // Catch: java.lang.Throwable -> L2d
            r0.f185407x = r2     // Catch: java.lang.Throwable -> L2d
            r0.A = r3     // Catch: java.lang.Throwable -> L2d
            java.lang.Object r14 = skm.e0.J(r13, r5, r0)     // Catch: java.lang.Throwable -> L2d
            if (r14 != r1) goto L7f
        L7e:
            return r1
        L7f:
            java.io.File r14 = (java.io.File) r14     // Catch: java.lang.Throwable -> L2d
            r12.unlock(r10)
            return r14
        L85:
            r12.unlock(r10)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: kl9.c.a(java.io.File, java.lang.String, gim.c):java.lang.Object");
    }
}
