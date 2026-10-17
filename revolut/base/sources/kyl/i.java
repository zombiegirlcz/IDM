package kyl;

import java.io.File;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class i {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final File f191024a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final myl.a f191025b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final hlm.c f191026c;

    public i(File cacheDirectory) {
        myl.a expirationPolicy = new myl.a();
        Intrinsics.checkNotNullParameter(cacheDirectory, "cacheDirectory");
        Intrinsics.checkNotNullParameter(expirationPolicy, "expirationPolicy");
        this.f191024a = cacheDirectory;
        this.f191025b = expirationPolicy;
        this.f191026c = hlm.d.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(kyl.i r8, java.lang.String r9, gim.c r10) throws java.lang.Throwable {
        /*
            boolean r0 = r10 instanceof kyl.h
            if (r0 == 0) goto L13
            r0 = r10
            kyl.h r0 = (kyl.h) r0
            int r1 = r0.z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.z = r1
            goto L18
        L13:
            kyl.h r0 = new kyl.h
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.f191022x
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.z
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L44
            if (r2 == r4) goto L37
            if (r2 != r3) goto L2f
            hlm.a r8 = r0.v
            yhm.o.b(r10)     // Catch: java.lang.Throwable -> L2d
            goto L76
        L2d:
            r9 = move-exception
            goto L85
        L2f:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L37:
            int r9 = r0.f191021w
            hlm.a r2 = r0.v
            java.lang.String r4 = r0.u
            yhm.o.b(r10)
            r10 = r2
            r2 = r9
            r9 = r4
            goto L59
        L44:
            yhm.o.b(r10)
            hlm.c r10 = r8.f191026c
            r0.u = r9
            r0.v = r10
            r2 = 0
            r0.f191021w = r2
            r0.z = r4
            java.lang.Object r4 = r10.lock(r5, r0)
            if (r4 != r1) goto L59
            goto L72
        L59:
            krc.h r4 = new krc.h     // Catch: java.lang.Throwable -> L7f
            r6 = 21
            r4.<init>(r8, r9, r5, r6)     // Catch: java.lang.Throwable -> L7f
            skm.p0 r8 = skm.p0.f264001a     // Catch: java.lang.Throwable -> L82
            elm.f r8 = elm.f.f127540b     // Catch: java.lang.Throwable -> L82
            r0.u = r5     // Catch: java.lang.Throwable -> L7f
            r0.v = r10     // Catch: java.lang.Throwable -> L7f
            r0.f191021w = r2     // Catch: java.lang.Throwable -> L7f
            r0.z = r3     // Catch: java.lang.Throwable -> L7f
            java.lang.Object r8 = skm.e0.J(r8, r4, r0)     // Catch: java.lang.Throwable -> L7f
            if (r8 != r1) goto L73
        L72:
            return r1
        L73:
            r7 = r10
            r10 = r8
            r8 = r7
        L76:
            java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch: java.lang.Throwable -> L2d
            r10.getClass()     // Catch: java.lang.Throwable -> L2d
            r8.unlock(r5)
            return r10
        L7f:
            r9 = move-exception
        L80:
            r8 = r10
            goto L85
        L82:
            r8 = move-exception
            r9 = r8
            goto L80
        L85:
            r8.unlock(r5)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: kyl.i.a(kyl.i, java.lang.String, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(gim.c r9) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r9 instanceof kyl.d
            if (r0 == 0) goto L13
            r0 = r9
            kyl.d r0 = (kyl.d) r0
            int r1 = r0.f191014y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f191014y = r1
            goto L18
        L13:
            kyl.d r0 = new kyl.d
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.f191012w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f191014y
            r3 = 2
            r4 = 1
            r5 = 0
            r6 = 0
            if (r2 == 0) goto L41
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            hlm.a r0 = r0.u
            yhm.o.b(r9)     // Catch: java.lang.Throwable -> L2e
            goto L6d
        L2e:
            r9 = move-exception
            goto L7a
        L30:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L38:
            int r2 = r0.v
            hlm.a r4 = r0.u
            yhm.o.b(r9)
            r9 = r4
            goto L54
        L41:
            yhm.o.b(r9)
            hlm.c r9 = r8.f191026c
            r0.u = r9
            r0.v = r5
            r0.f191014y = r4
            java.lang.Object r2 = r9.lock(r6, r0)
            if (r2 != r1) goto L53
            goto L69
        L53:
            r2 = r5
        L54:
            kyl.e r4 = new kyl.e     // Catch: java.lang.Throwable -> L76
            r4.<init>(r8, r6, r5)     // Catch: java.lang.Throwable -> L76
            skm.p0 r5 = skm.p0.f264001a     // Catch: java.lang.Throwable -> L76
            elm.f r5 = elm.f.f127540b     // Catch: java.lang.Throwable -> L76
            r0.u = r9     // Catch: java.lang.Throwable -> L76
            r0.v = r2     // Catch: java.lang.Throwable -> L76
            r0.f191014y = r3     // Catch: java.lang.Throwable -> L76
            java.lang.Object r0 = skm.e0.J(r5, r4, r0)     // Catch: java.lang.Throwable -> L76
            if (r0 != r1) goto L6a
        L69:
            return r1
        L6a:
            r7 = r0
            r0 = r9
            r9 = r7
        L6d:
            java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch: java.lang.Throwable -> L2e
            r9.getClass()     // Catch: java.lang.Throwable -> L2e
            r0.unlock(r6)
            return r9
        L76:
            r0 = move-exception
            r7 = r0
            r0 = r9
            r9 = r7
        L7a:
            r0.unlock(r6)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: kyl.i.b(gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(gim.c r9) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r9 instanceof kyl.f
            if (r0 == 0) goto L13
            r0 = r9
            kyl.f r0 = (kyl.f) r0
            int r1 = r0.f191017y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f191017y = r1
            goto L18
        L13:
            kyl.f r0 = new kyl.f
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.f191015w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f191017y
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L40
            if (r2 == r4) goto L37
            if (r2 != r3) goto L2f
            hlm.a r0 = r0.u
            yhm.o.b(r9)     // Catch: java.lang.Throwable -> L2d
            goto L6c
        L2d:
            r9 = move-exception
            goto L78
        L2f:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L37:
            int r2 = r0.v
            hlm.a r6 = r0.u
            yhm.o.b(r9)
            r9 = r6
            goto L53
        L40:
            yhm.o.b(r9)
            hlm.c r9 = r8.f191026c
            r0.u = r9
            r2 = 0
            r0.v = r2
            r0.f191017y = r4
            java.lang.Object r6 = r9.lock(r5, r0)
            if (r6 != r1) goto L53
            goto L68
        L53:
            kyl.e r6 = new kyl.e     // Catch: java.lang.Throwable -> L74
            r6.<init>(r8, r5, r4)     // Catch: java.lang.Throwable -> L74
            skm.p0 r4 = skm.p0.f264001a     // Catch: java.lang.Throwable -> L74
            elm.f r4 = elm.f.f127540b     // Catch: java.lang.Throwable -> L74
            r0.u = r9     // Catch: java.lang.Throwable -> L74
            r0.v = r2     // Catch: java.lang.Throwable -> L74
            r0.f191017y = r3     // Catch: java.lang.Throwable -> L74
            java.lang.Object r0 = skm.e0.J(r4, r6, r0)     // Catch: java.lang.Throwable -> L74
            if (r0 != r1) goto L69
        L68:
            return r1
        L69:
            r7 = r0
            r0 = r9
            r9 = r7
        L6c:
            kotlin.Unit r9 = (kotlin.Unit) r9     // Catch: java.lang.Throwable -> L2d
            r0.unlock(r5)
            kotlin.Unit r9 = kotlin.Unit.f186387a
            return r9
        L74:
            r0 = move-exception
            r7 = r0
            r0 = r9
            r9 = r7
        L78:
            r0.unlock(r5)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: kyl.i.c(gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x007c, code lost:
    
        if (skm.e0.J(r13, r5, r0) == r1) goto L26;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r12v1, types: [hlm.a] */
    /* JADX WARN: Type inference failed for: r12v10 */
    /* JADX WARN: Type inference failed for: r12v4, types: [hlm.a] */
    /* JADX WARN: Type inference failed for: r12v9 */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(java.lang.String r12, android.graphics.Bitmap r13, gim.c r14) {
        /*
            r11 = this;
            boolean r0 = r14 instanceof kyl.g
            if (r0 == 0) goto L13
            r0 = r14
            kyl.g r0 = (kyl.g) r0
            int r1 = r0.A
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.A = r1
            goto L18
        L13:
            kyl.g r0 = new kyl.g
            r0.<init>(r11, r14)
        L18:
            java.lang.Object r14 = r0.f191020y
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.A
            r3 = 2
            r4 = 1
            r10 = 0
            if (r2 == 0) goto L48
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            hlm.a r12 = r0.f191018w
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
            int r12 = r0.f191019x
            hlm.a r13 = r0.f191018w
            android.graphics.Bitmap r2 = r0.v
            java.lang.String r4 = r0.u
            yhm.o.b(r14)
            r8 = r2
            r9 = r4
            r2 = r12
            r12 = r13
            goto L62
        L48:
            yhm.o.b(r14)
            r0.u = r12
            r0.v = r13
            hlm.c r14 = r11.f191026c
            r0.f191018w = r14
            r2 = 0
            r0.f191019x = r2
            r0.A = r4
            java.lang.Object r4 = r14.lock(r10, r0)
            if (r4 != r1) goto L5f
            goto L7e
        L5f:
            r9 = r12
            r8 = r13
            r12 = r14
        L62:
            im9.h r5 = new im9.h     // Catch: java.lang.Throwable -> L2d
            r6 = 24
            r7 = r11
            r5.<init>(r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L2d
            skm.p0 r13 = skm.p0.f264001a     // Catch: java.lang.Throwable -> L2d
            elm.f r13 = elm.f.f127540b     // Catch: java.lang.Throwable -> L2d
            r0.u = r10     // Catch: java.lang.Throwable -> L2d
            r0.v = r10     // Catch: java.lang.Throwable -> L2d
            r0.f191018w = r12     // Catch: java.lang.Throwable -> L2d
            r0.f191019x = r2     // Catch: java.lang.Throwable -> L2d
            r0.A = r3     // Catch: java.lang.Throwable -> L2d
            java.lang.Object r13 = skm.e0.J(r13, r5, r0)     // Catch: java.lang.Throwable -> L2d
            if (r13 != r1) goto L7f
        L7e:
            return r1
        L7f:
            kotlin.Unit r13 = kotlin.Unit.f186387a     // Catch: java.lang.Throwable -> L2d
            r12.unlock(r10)
            return r13
        L85:
            r12.unlock(r10)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: kyl.i.d(java.lang.String, android.graphics.Bitmap, gim.c):java.lang.Object");
    }
}
