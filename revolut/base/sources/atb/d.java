package atb;

import ang.f;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f9023a;

    public d(f userInteractor) {
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        this.f9023a = userInteractor;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable a(gim.c r6) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r6 instanceof atb.c
            if (r0 == 0) goto L13
            r0 = r6
            atb.c r0 = (atb.c) r0
            int r1 = r0.f9022w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f9022w = r1
            goto L18
        L13:
            atb.c r0 = new atb.c
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f9022w
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            yhm.o.b(r6)     // Catch: java.lang.Throwable -> L28 java.util.concurrent.CancellationException -> L2a
            goto L4f
        L28:
            r6 = move-exception
            goto L5a
        L2a:
            r6 = move-exception
            goto L70
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L34:
            yhm.o.b(r6)
            yhm.m$a r6 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L28 java.util.concurrent.CancellationException -> L2a
            ang.f r6 = r5.f9023a     // Catch: java.lang.Throwable -> L28 java.util.concurrent.CancellationException -> L2a
            w4l.h r2 = w4l.h.f294642c     // Catch: java.lang.Throwable -> L28 java.util.concurrent.CancellationException -> L2a
            akg.n r6 = r6.j(r2)     // Catch: java.lang.Throwable -> L28 java.util.concurrent.CancellationException -> L2a
            r2 = 3
            jhi.b r6 = mo3.a.g(r6, r4, r4, r2)     // Catch: java.lang.Throwable -> L28 java.util.concurrent.CancellationException -> L2a
            r0.f9022w = r3     // Catch: java.lang.Throwable -> L28 java.util.concurrent.CancellationException -> L2a
            java.lang.Object r6 = vkm.q.z(r6, r0)     // Catch: java.lang.Throwable -> L28 java.util.concurrent.CancellationException -> L2a
            if (r6 != r1) goto L4f
            return r1
        L4f:
            do3.n r6 = (do3.n) r6     // Catch: java.lang.Throwable -> L28 java.util.concurrent.CancellationException -> L2a
            if (r6 == 0) goto L56
            com.revolut.feature.address.models.Address r6 = r6.k     // Catch: java.lang.Throwable -> L28 java.util.concurrent.CancellationException -> L2a
            goto L57
        L56:
            r6 = r4
        L57:
            yhm.m$a r0 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L28 java.util.concurrent.CancellationException -> L2a
            goto L60
        L5a:
            yhm.m$a r0 = yhm.m.INSTANCE
            yhm.n r6 = yhm.o.a(r6)
        L60:
            java.lang.Throwable r0 = yhm.m.a(r6)
            if (r0 == 0) goto L69
            hx7.e.n(r0)
        L69:
            boolean r0 = r6 instanceof yhm.n
            if (r0 == 0) goto L6e
            goto L6f
        L6e:
            r4 = r6
        L6f:
            return r4
        L70:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: atb.d.a(gim.c):java.io.Serializable");
    }
}
