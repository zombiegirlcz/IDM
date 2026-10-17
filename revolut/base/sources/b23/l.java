package b23;

import kotlin.jvm.internal.Intrinsics;
import te8.c0;

/* JADX INFO: loaded from: classes21.dex */
public final class l implements f13.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c0 f11888a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final uq8.a f11889b;

    public l(c0 juniorVirtualCardOrderInteractor, uq8.a juniorTransferCommandFactory) {
        Intrinsics.checkNotNullParameter(juniorVirtualCardOrderInteractor, "juniorVirtualCardOrderInteractor");
        Intrinsics.checkNotNullParameter(juniorTransferCommandFactory, "juniorTransferCommandFactory");
        this.f11888a = juniorVirtualCardOrderInteractor;
        this.f11889b = juniorTransferCommandFactory;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r5, gim.c r6) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r6 instanceof b23.i
            if (r0 == 0) goto L13
            r0 = r6
            b23.i r0 = (b23.i) r0
            int r1 = r0.f11883w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f11883w = r1
            goto L18
        L13:
            b23.i r0 = new b23.i
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f11883w
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            yhm.o.b(r6)     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            goto L48
        L27:
            r5 = move-exception
            goto L4d
        L29:
            r5 = move-exception
            goto L62
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            yhm.o.b(r6)
            yhm.m$a r6 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            uq8.a r6 = r4.f11889b     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            r2 = 0
            rfm.j r5 = r6.a(r5, r2)     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            r0.f11883w = r3     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            java.lang.Object r6 = nim.a.i(r5, r0)     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            if (r6 != r1) goto L48
            return r1
        L48:
            com.revolut.retail.core.navigation.NaviCommand r6 = (com.revolut.retail.core.navigation.NaviCommand) r6     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            yhm.m$a r5 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            goto L53
        L4d:
            yhm.m$a r6 = yhm.m.INSTANCE
            yhm.n r6 = yhm.o.a(r5)
        L53:
            java.lang.Throwable r5 = yhm.m.a(r6)
            if (r5 == 0) goto L5c
            hx7.e.n(r5)
        L5c:
            boolean r5 = r6 instanceof yhm.n
            if (r5 == 0) goto L61
            r6 = 0
        L61:
            return r6
        L62:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: b23.l.a(java.lang.String, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.String r30, java.lang.String r31, java.lang.String r32, com.revolut.retail.core.navigation.NaviCommand r33, com.revolut.retail.core.navigation.NaviCommand r34, gim.c r35) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 311
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b23.l.b(java.lang.String, java.lang.String, java.lang.String, com.revolut.retail.core.navigation.NaviCommand, com.revolut.retail.core.navigation.NaviCommand, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.lang.String r8, gim.c r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof b23.k
            if (r0 == 0) goto L13
            r0 = r9
            b23.k r0 = (b23.k) r0
            int r1 = r0.f11887w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f11887w = r1
            goto L18
        L13:
            b23.k r0 = new b23.k
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f11887w
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L30
            if (r2 != r4) goto L28
            yhm.o.b(r9)
            goto L73
        L28:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L30:
            yhm.o.b(r9)
            java.lang.String r9 = "juniorId"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r9)
            te8.c0 r9 = r7.f11888a
            te8.z r2 = r9.f270057a
            r5 = 4
            efm.r r8 = te8.z.b(r2, r8, r3, r5)
            vkm.d r8 = rd0.e.b(r8)
            tcg.a0 r2 = new tcg.a0
            r5 = 23
            r2.<init>(r9, r5)
            akg.n r8 = nim.a.v(r8, r2)
            axd.e r9 = new axd.e
            r2 = 17
            r9.<init>(r2)
            r2 = 0
            jhi.b r8 = mo3.a.g(r8, r2, r9, r4)
            a35.k r9 = new a35.k
            r5 = 3
            r6 = 17
            r9.<init>(r5, r6, r2)
            zhm.h0 r2 = zhm.h0.f322473a
            vkm.y r8 = rd0.e.e(r8, r2, r9)
            r0.f11887w = r4
            java.lang.Object r9 = vkm.q.z(r8, r0)
            if (r9 != r1) goto L73
            return r1
        L73:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            if (r9 == 0) goto L7b
            boolean r3 = r9.booleanValue()
        L7b:
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r3)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: b23.l.c(java.lang.String, gim.c):java.lang.Object");
    }
}
