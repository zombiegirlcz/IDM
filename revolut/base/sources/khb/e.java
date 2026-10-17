package khb;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ang.f f184090a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wsg.b f184091b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final kbb.c f184092c;

    public e(ang.f userInteractor, wsg.b newWalletsInteractor, kbb.c accountDetailsInteractor) {
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(newWalletsInteractor, "newWalletsInteractor");
        Intrinsics.checkNotNullParameter(accountDetailsInteractor, "accountDetailsInteractor");
        this.f184090a = userInteractor;
        this.f184091b = newWalletsInteractor;
        this.f184092c = accountDetailsInteractor;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(fo3.c r13, gim.c r14) {
        /*
            r12 = this;
            boolean r0 = r14 instanceof khb.b
            if (r0 == 0) goto L13
            r0 = r14
            khb.b r0 = (khb.b) r0
            int r1 = r0.f184086x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f184086x = r1
            goto L18
        L13:
            khb.b r0 = new khb.b
            r0.<init>(r12, r14)
        L18:
            java.lang.Object r14 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f184086x
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            fo3.c r13 = r0.u
            yhm.o.b(r14)
            goto L64
        L2a:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L32:
            yhm.o.b(r14)
            java.lang.String r7 = r13.f136801a
            xi0.b r8 = r13.d
            io3.l r9 = io3.l.CURRENT
            io3.i r10 = io3.i.INTERNAL
            r11 = 0
            kbb.c r5 = r12.f184092c
            w4l.h r6 = w4l.h.f294642c
            efm.r r14 = r5.G(r6, r7, r8, r9, r10, r11)
            vkm.d r14 = rd0.e.b(r14)
            zfd.e r14 = zi0.c.w(r14)
            kd8.f r2 = new kd8.f
            r5 = 18
            r2.<init>(r5)
            jhi.b r14 = mo3.a.g(r14, r4, r2, r3)
            r0.u = r13
            r0.f184086x = r3
            java.lang.Object r14 = vkm.q.z(r14, r0)
            if (r14 != r1) goto L64
            return r1
        L64:
            dda.a r14 = (dda.a) r14
            if (r14 == 0) goto La3
            java.util.ArrayList r14 = r14.f113159a
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r14 = r14.iterator()
        L73:
            boolean r1 = r14.hasNext()
            if (r1 == 0) goto L85
            java.lang.Object r1 = r14.next()
            boolean r2 = r1 instanceof dda.d
            if (r2 == 0) goto L73
            r0.add(r1)
            goto L73
        L85:
            java.util.Iterator r14 = r0.iterator()
        L89:
            boolean r0 = r14.hasNext()
            if (r0 == 0) goto La1
            java.lang.Object r0 = r14.next()
            r1 = r0
            dda.d r1 = (dda.d) r1
            xi0.b r1 = r1.f113168b
            xi0.b r2 = r13.d
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L89
            r4 = r0
        La1:
            dda.d r4 = (dda.d) r4
        La3:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: khb.e.a(fo3.c, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(gim.c r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof khb.c
            if (r0 == 0) goto L13
            r0 = r7
            khb.c r0 = (khb.c) r0
            int r1 = r0.f184087w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f184087w = r1
            goto L18
        L13:
            khb.c r0 = new khb.c
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f184087w
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L30
            if (r2 != r4) goto L28
            yhm.o.b(r7)
            goto L53
        L28:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L30:
            yhm.o.b(r7)
            wsg.b r7 = r6.f184091b
            w4l.h r2 = w4l.h.f294642c
            kotlinx.coroutines.flow.Flow r7 = r7.e(r2)
            zfd.e r7 = zi0.c.w(r7)
            kd8.f r2 = new kd8.f
            r5 = 17
            r2.<init>(r5)
            jhi.b r7 = mo3.a.g(r7, r3, r2, r4)
            r0.f184087w = r4
            java.lang.Object r7 = vkm.q.z(r7, r0)
            if (r7 != r1) goto L53
            return r1
        L53:
            kotlin.Pair r7 = (kotlin.Pair) r7
            if (r7 == 0) goto L5c
            java.lang.Object r7 = r7.f186385a
            fo3.c r7 = (fo3.c) r7
            return r7
        L5c:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: khb.e.b(gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0070 A[Catch: Exception -> 0x002f, CancellationException -> 0x0032, TryCatch #2 {CancellationException -> 0x0032, Exception -> 0x002f, blocks: (B:14:0x002b, B:44:0x0093, B:22:0x003d, B:36:0x006c, B:38:0x0070, B:40:0x007e, B:23:0x0041, B:29:0x0051, B:31:0x0055, B:33:0x0063, B:26:0x0048), top: B:49:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x007e A[Catch: Exception -> 0x002f, CancellationException -> 0x0032, TryCatch #2 {CancellationException -> 0x0032, Exception -> 0x002f, blocks: (B:14:0x002b, B:44:0x0093, B:22:0x003d, B:36:0x006c, B:38:0x0070, B:40:0x007e, B:23:0x0041, B:29:0x0051, B:31:0x0055, B:33:0x0063, B:26:0x0048), top: B:49:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(gim.c r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof khb.d
            if (r0 == 0) goto L13
            r0 = r8
            khb.d r0 = (khb.d) r0
            int r1 = r0.f184089x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f184089x = r1
            goto L18
        L13:
            khb.d r0 = new khb.d
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f184089x
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L45
            if (r2 == r5) goto L41
            if (r2 == r4) goto L3d
            if (r2 != r3) goto L35
            dda.d r0 = r0.u
            yhm.o.b(r8)     // Catch: java.lang.Exception -> L2f java.util.concurrent.CancellationException -> L32
            goto L93
        L2f:
            r8 = move-exception
            goto La6
        L32:
            r8 = move-exception
            goto Lad
        L35:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L3d:
            yhm.o.b(r8)     // Catch: java.lang.Exception -> L2f java.util.concurrent.CancellationException -> L32
            goto L6c
        L41:
            yhm.o.b(r8)     // Catch: java.lang.Exception -> L2f java.util.concurrent.CancellationException -> L32
            goto L51
        L45:
            yhm.o.b(r8)
            r0.f184089x = r5     // Catch: java.lang.Exception -> L2f java.util.concurrent.CancellationException -> L32
            java.lang.Object r8 = r7.b(r0)     // Catch: java.lang.Exception -> L2f java.util.concurrent.CancellationException -> L32
            if (r8 != r1) goto L51
            goto L8f
        L51:
            fo3.c r8 = (fo3.c) r8     // Catch: java.lang.Exception -> L2f java.util.concurrent.CancellationException -> L32
            if (r8 != 0) goto L63
            yhm.m$a r8 = yhm.m.INSTANCE     // Catch: java.lang.Exception -> L2f java.util.concurrent.CancellationException -> L32
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException     // Catch: java.lang.Exception -> L2f java.util.concurrent.CancellationException -> L32
            java.lang.String r0 = "Personal current wallet not found"
            r8.<init>(r0)     // Catch: java.lang.Exception -> L2f java.util.concurrent.CancellationException -> L32
            yhm.n r8 = yhm.o.a(r8)     // Catch: java.lang.Exception -> L2f java.util.concurrent.CancellationException -> L32
            return r8
        L63:
            r0.f184089x = r4     // Catch: java.lang.Exception -> L2f java.util.concurrent.CancellationException -> L32
            java.lang.Object r8 = r7.a(r8, r0)     // Catch: java.lang.Exception -> L2f java.util.concurrent.CancellationException -> L32
            if (r8 != r1) goto L6c
            goto L8f
        L6c:
            dda.d r8 = (dda.d) r8     // Catch: java.lang.Exception -> L2f java.util.concurrent.CancellationException -> L32
            if (r8 != 0) goto L7e
            yhm.m$a r8 = yhm.m.INSTANCE     // Catch: java.lang.Exception -> L2f java.util.concurrent.CancellationException -> L32
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException     // Catch: java.lang.Exception -> L2f java.util.concurrent.CancellationException -> L32
            java.lang.String r0 = "Account details not found"
            r8.<init>(r0)     // Catch: java.lang.Exception -> L2f java.util.concurrent.CancellationException -> L32
            yhm.n r8 = yhm.o.a(r8)     // Catch: java.lang.Exception -> L2f java.util.concurrent.CancellationException -> L32
            return r8
        L7e:
            ang.f r2 = r7.f184090a     // Catch: java.lang.Exception -> L2f java.util.concurrent.CancellationException -> L32
            r4 = 0
            efm.d0 r2 = r2.f(r4)     // Catch: java.lang.Exception -> L2f java.util.concurrent.CancellationException -> L32
            r0.u = r8     // Catch: java.lang.Exception -> L2f java.util.concurrent.CancellationException -> L32
            r0.f184089x = r3     // Catch: java.lang.Exception -> L2f java.util.concurrent.CancellationException -> L32
            java.lang.Object r0 = nim.a.b(r2, r0)     // Catch: java.lang.Exception -> L2f java.util.concurrent.CancellationException -> L32
            if (r0 != r1) goto L90
        L8f:
            return r1
        L90:
            r6 = r0
            r0 = r8
            r8 = r6
        L93:
            java.lang.String r1 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r8, r1)     // Catch: java.lang.Exception -> L2f java.util.concurrent.CancellationException -> L32
            do3.n r8 = (do3.n) r8     // Catch: java.lang.Exception -> L2f java.util.concurrent.CancellationException -> L32
            java.lang.String r8 = te0.w.I(r8)     // Catch: java.lang.Exception -> L2f java.util.concurrent.CancellationException -> L32
            yhm.m$a r1 = yhm.m.INSTANCE     // Catch: java.lang.Exception -> L2f java.util.concurrent.CancellationException -> L32
            lhb.c r1 = new lhb.c     // Catch: java.lang.Exception -> L2f java.util.concurrent.CancellationException -> L32
            r1.<init>(r0, r8)     // Catch: java.lang.Exception -> L2f java.util.concurrent.CancellationException -> L32
            return r1
        La6:
            yhm.m$a r0 = yhm.m.INSTANCE
            yhm.n r8 = yhm.o.a(r8)
            return r8
        Lad:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: khb.e.c(gim.c):java.lang.Object");
    }
}
