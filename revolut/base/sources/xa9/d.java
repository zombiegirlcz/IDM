package xa9;

import java.util.concurrent.atomic.AtomicLong;
import vkm.j2;
import vkm.q;

/* JADX INFO: loaded from: classes5.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j2 f303790a = q.c(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicLong f303791b = new AtomicLong();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final hlm.c f303792c = hlm.d.a();

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(xa9.d r6, long r7, gim.c r9) {
        /*
            vkm.j2 r0 = r6.f303790a
            boolean r1 = r9 instanceof xa9.b
            if (r1 == 0) goto L15
            r1 = r9
            xa9.b r1 = (xa9.b) r1
            int r2 = r1.f303786y
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.f303786y = r2
            goto L1a
        L15:
            xa9.b r1 = new xa9.b
            r1.<init>(r6, r9)
        L1a:
            java.lang.Object r9 = r1.f303784w
            fim.a r2 = fim.a.COROUTINE_SUSPENDED
            int r3 = r1.f303786y
            r4 = 1
            r5 = 0
            if (r3 == 0) goto L36
            if (r3 != r4) goto L2e
            long r7 = r1.u
            hlm.c r6 = r1.v
            yhm.o.b(r9)
            goto L48
        L2e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L36:
            yhm.o.b(r9)
            hlm.c r6 = r6.f303792c
            r1.v = r6
            r1.u = r7
            r1.f303786y = r4
            java.lang.Object r9 = r6.lock(r5, r1)
            if (r9 != r2) goto L48
            return r2
        L48:
            java.lang.Object r9 = r0.getValue()     // Catch: java.lang.Throwable -> L56
            xa9.a r9 = (xa9.a) r9     // Catch: java.lang.Throwable -> L56
            if (r9 != 0) goto L58
            java.lang.Boolean r7 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> L56
            r6.unlock(r5)
            return r7
        L56:
            r7 = move-exception
            goto L6d
        L58:
            long r1 = r9.f303782a     // Catch: java.lang.Throwable -> L56
            int r7 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r7 == 0) goto L64
            java.lang.Boolean r7 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> L56
            r6.unlock(r5)
            return r7
        L64:
            r0.setValue(r5)     // Catch: java.lang.Throwable -> L56
            java.lang.Boolean r7 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L56
            r6.unlock(r5)
            return r7
        L6d:
            r6.unlock(r5)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: xa9.d.a(xa9.d, long, gim.c):java.lang.Object");
    }
}
