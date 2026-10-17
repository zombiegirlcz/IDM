package nqj;

import hlm.d;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import qqj.h;
import rd0.e;
import skm.a2;
import skm.e0;
import vkm.j2;
import vkm.q;
import vkm.y;
import zhm.h0;

/* JADX INFO: loaded from: classes11.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f218477a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CoroutineScope f218478b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f218479c;
    public final j2 d;
    public final hlm.c e;
    public a2 f;

    public c(h balanceHistoryRepository, CoroutineScope coroutineScope) {
        Intrinsics.checkNotNullParameter(balanceHistoryRepository, "balanceHistoryRepository");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        this.f218477a = balanceHistoryRepository;
        this.f218478b = coroutineScope;
        this.d = q.c(nzi.c.f221069a);
        this.e = d.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(nqj.c r5, boolean r6, gim.c r7) {
        /*
            boolean r0 = r7 instanceof nqj.b
            if (r0 == 0) goto L13
            r0 = r7
            nqj.b r0 = (nqj.b) r0
            int r1 = r0.f218476y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f218476y = r1
            goto L18
        L13:
            nqj.b r0 = new nqj.b
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f218474w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f218476y
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            boolean r6 = r0.u
            hlm.c r0 = r0.v
            yhm.o.b(r7)
            goto L47
        L2c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L34:
            yhm.o.b(r7)
            hlm.c r7 = r5.e
            r0.v = r7
            r0.u = r6
            r0.f218476y = r3
            java.lang.Object r0 = r7.lock(r4, r0)
            if (r0 != r1) goto L46
            return r1
        L46:
            r0 = r7
        L47:
            if (r6 != 0) goto L64
            boolean r6 = r5.f218479c     // Catch: java.lang.Throwable -> L62
            if (r6 == 0) goto L64
            vkm.j2 r6 = r5.d     // Catch: java.lang.Throwable -> L62
            java.lang.Object r6 = r6.getValue()     // Catch: java.lang.Throwable -> L62
            nzi.a r7 = nzi.a.f221067a     // Catch: java.lang.Throwable -> L62
            boolean r6 = kotlin.jvm.internal.Intrinsics.f(r6, r7)     // Catch: java.lang.Throwable -> L62
            if (r6 == 0) goto L5c
            goto L64
        L5c:
            kotlin.Unit r5 = kotlin.Unit.f186387a     // Catch: java.lang.Throwable -> L62
            r0.unlock(r4)
            return r5
        L62:
            r5 = move-exception
            goto L83
        L64:
            r5.f218479c = r3     // Catch: java.lang.Throwable -> L62
            skm.a2 r6 = r5.f     // Catch: java.lang.Throwable -> L62
            if (r6 == 0) goto L6d
            r6.f(r4)     // Catch: java.lang.Throwable -> L62
        L6d:
            kotlinx.coroutines.CoroutineScope r6 = r5.f218478b     // Catch: java.lang.Throwable -> L62
            nqj.a r7 = new nqj.a     // Catch: java.lang.Throwable -> L62
            r7.<init>(r5, r4, r3)     // Catch: java.lang.Throwable -> L62
            r1 = 3
            skm.a2 r6 = skm.e0.C(r6, r4, r4, r7, r1)     // Catch: java.lang.Throwable -> L62
            r5.f = r6     // Catch: java.lang.Throwable -> L62
            kotlin.Unit r5 = kotlin.Unit.f186387a     // Catch: java.lang.Throwable -> L62
            r0.unlock(r4)
            kotlin.Unit r5 = kotlin.Unit.f186387a
            return r5
        L83:
            r0.unlock(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: nqj.c.a(nqj.c, boolean, gim.c):java.lang.Object");
    }

    public final y b(Flow flow) {
        int i = 3;
        Continuation continuation = null;
        return e.e(new y(new a(this, continuation, 0), new t38.e(flow, 24, this.d, new l05.b(i, 24, continuation))), h0.f322473a, new im2.b(i, 23, continuation));
    }

    public final void c(boolean z) {
        e0.C(this.f218478b, null, null, new mt8.b(this, z, null, 3), 3);
    }
}
