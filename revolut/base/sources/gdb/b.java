package gdb;

import kotlin.jvm.internal.Intrinsics;
import sh5.d;

/* JADX INFO: loaded from: classes6.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f143124a;

    public b(d cryptoFcaDisclaimerWidget) {
        Intrinsics.checkNotNullParameter(cryptoFcaDisclaimerWidget, "cryptoFcaDisclaimerWidget");
        this.f143124a = cryptoFcaDisclaimerWidget;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.util.List r6, gim.c r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof gdb.a
            if (r0 == 0) goto L13
            r0 = r7
            gdb.a r0 = (gdb.a) r0
            int r1 = r0.f143123w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f143123w = r1
            goto L18
        L13:
            gdb.a r0 = new gdb.a
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f143123w
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            yhm.o.b(r7)     // Catch: java.lang.Throwable -> L28 java.util.concurrent.CancellationException -> L2a
            goto L50
        L28:
            r6 = move-exception
            goto L57
        L2a:
            r6 = move-exception
            goto L64
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            yhm.o.b(r7)
            java.lang.String r7 = "CRYPTO"
            boolean r6 = r6.contains(r7)
            if (r6 == 0) goto L65
            yhm.m$a r6 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L28 java.util.concurrent.CancellationException -> L2a
            sh5.d r6 = r5.f143124a     // Catch: java.lang.Throwable -> L28 java.util.concurrent.CancellationException -> L2a
            efm.d0 r6 = sh5.d.a(r6)     // Catch: java.lang.Throwable -> L28 java.util.concurrent.CancellationException -> L2a
            r0.f143123w = r3     // Catch: java.lang.Throwable -> L28 java.util.concurrent.CancellationException -> L2a
            java.lang.Object r7 = nim.a.b(r6, r0)     // Catch: java.lang.Throwable -> L28 java.util.concurrent.CancellationException -> L2a
            if (r7 != r1) goto L50
            return r1
        L50:
            sh5.c r7 = (sh5.c) r7     // Catch: java.lang.Throwable -> L28 java.util.concurrent.CancellationException -> L2a
            com.revolut.core.ui_kit.models.Clause r6 = r7.f263435a     // Catch: java.lang.Throwable -> L28 java.util.concurrent.CancellationException -> L2a
            yhm.m$a r7 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L28 java.util.concurrent.CancellationException -> L2a
            goto L5d
        L57:
            yhm.m$a r7 = yhm.m.INSTANCE
            yhm.n r6 = yhm.o.a(r6)
        L5d:
            boolean r7 = r6 instanceof yhm.n
            if (r7 == 0) goto L62
            goto L63
        L62:
            r4 = r6
        L63:
            return r4
        L64:
            throw r6
        L65:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: gdb.b.a(java.util.List, gim.c):java.lang.Object");
    }
}
