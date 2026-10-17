package k01;

import kotlin.jvm.internal.Intrinsics;
import skm.h0;

/* JADX INFO: loaded from: classes20.dex */
public final class h implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h0 f179901a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f179902b;

    public h(h0 deferred, Object obj2) {
        Intrinsics.checkNotNullParameter(deferred, "deferred");
        this.f179901a = deferred;
        this.f179902b = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // k01.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(gim.c r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof k01.g
            if (r0 == 0) goto L13
            r0 = r7
            k01.g r0 = (k01.g) r0
            int r1 = r0.f179900w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f179900w = r1
            goto L18
        L13:
            k01.g r0 = new k01.g
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f179900w
            r3 = 0
            skm.h0 r4 = r6.f179901a
            r5 = 1
            if (r2 == 0) goto L38
            if (r2 != r5) goto L30
            yhm.o.b(r7)     // Catch: java.lang.Throwable -> L2a java.lang.Exception -> L2c java.util.concurrent.CancellationException -> L2e kotlinx.coroutines.TimeoutCancellationException -> L51
            goto L44
        L2a:
            r7 = move-exception
            goto L56
        L2c:
            r7 = move-exception
            goto L48
        L2e:
            r7 = move-exception
            goto L55
        L30:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L38:
            yhm.o.b(r7)
            r0.f179900w = r5     // Catch: java.lang.Throwable -> L2a java.lang.Exception -> L2c java.util.concurrent.CancellationException -> L2e kotlinx.coroutines.TimeoutCancellationException -> L51
            java.lang.Object r7 = r4.y(r0)     // Catch: java.lang.Throwable -> L2a java.lang.Exception -> L2c java.util.concurrent.CancellationException -> L2e kotlinx.coroutines.TimeoutCancellationException -> L51
            if (r7 != r1) goto L44
            return r1
        L44:
            r4.f(r3)
            return r7
        L48:
            zhm.h0 r0 = zhm.h0.f322473a     // Catch: java.lang.Throwable -> L2a
            java.util.concurrent.CopyOnWriteArrayList r1 = rd0.d.f253311a     // Catch: java.lang.Throwable -> L2a
            rd0.c r1 = rd0.c.ERROR     // Catch: java.lang.Throwable -> L2a
            rd0.d.a(r1, r3, r3, r7, r0)     // Catch: java.lang.Throwable -> L2a
        L51:
            r4.f(r3)
            goto L5a
        L55:
            throw r7     // Catch: java.lang.Throwable -> L2a
        L56:
            r4.f(r3)
            throw r7
        L5a:
            java.lang.Object r7 = r6.f179902b
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: k01.h.a(gim.c):java.lang.Object");
    }
}
