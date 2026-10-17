package tx3;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f275326a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xx4.d f275327b;

    public d(b overdraftOfferInteractor, xx4.d typedMemoryCache) {
        Intrinsics.checkNotNullParameter(overdraftOfferInteractor, "overdraftOfferInteractor");
        Intrinsics.checkNotNullParameter(typedMemoryCache, "typedMemoryCache");
        this.f275326a = overdraftOfferInteractor;
        this.f275327b = typedMemoryCache;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r6, gim.c r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof tx3.c
            if (r0 == 0) goto L13
            r0 = r7
            tx3.c r0 = (tx3.c) r0
            int r1 = r0.f275325y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f275325y = r1
            goto L18
        L13:
            tx3.c r0 = new tx3.c
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f275323w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f275325y
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 != r4) goto L2e
            tx3.d r6 = r0.v
            java.lang.String r0 = r0.u
            yhm.o.b(r7)     // Catch: java.lang.Throwable -> L2c
            goto L5c
        L2c:
            r6 = move-exception
            goto L6d
        L2e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L36:
            yhm.o.b(r7)
            yhm.m$a r7 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L2c
            tx3.b r7 = r5.f275326a     // Catch: java.lang.Throwable -> L2c
            r0.u = r6     // Catch: java.lang.Throwable -> L2c
            r0.v = r5     // Catch: java.lang.Throwable -> L2c
            r0.f275325y = r4     // Catch: java.lang.Throwable -> L2c
            x34.b r7 = r7.f275322a     // Catch: java.lang.Throwable -> L2c
            r7.getClass()     // Catch: java.lang.Throwable -> L2c
            wtj.f r2 = new wtj.f     // Catch: java.lang.Throwable -> L2c
            r4 = 17
            r2.<init>(r7, r6, r3, r4)     // Catch: java.lang.Throwable -> L2c
            skm.p0 r7 = skm.p0.f264001a     // Catch: java.lang.Throwable -> L2c
            elm.f r7 = elm.f.f127540b     // Catch: java.lang.Throwable -> L2c
            java.lang.Object r7 = skm.e0.J(r7, r2, r0)     // Catch: java.lang.Throwable -> L2c
            if (r7 != r1) goto L5a
            return r1
        L5a:
            r0 = r6
            r6 = r5
        L5c:
            dv3.a r7 = (dv3.a) r7     // Catch: java.lang.Throwable -> L2c
            xx4.d r6 = r6.f275327b     // Catch: java.lang.Throwable -> L2c
            tx3.a r1 = new tx3.a     // Catch: java.lang.Throwable -> L2c
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L2c
            r6.b(r1, r7)     // Catch: java.lang.Throwable -> L2c
            kotlin.Unit r6 = kotlin.Unit.f186387a     // Catch: java.lang.Throwable -> L2c
            yhm.m$a r7 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L2c
            goto L73
        L6d:
            yhm.m$a r7 = yhm.m.INSTANCE
            yhm.n r6 = yhm.o.a(r6)
        L73:
            java.lang.Throwable r6 = yhm.m.a(r6)
            if (r6 != 0) goto L7a
            goto L83
        L7a:
            zhm.h0 r7 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r0 = rd0.d.f253311a
            rd0.c r0 = rd0.c.ERROR
            rd0.d.a(r0, r3, r3, r6, r7)
        L83:
            kotlin.Unit r6 = kotlin.Unit.f186387a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: tx3.d.a(java.lang.String, gim.c):java.lang.Object");
    }
}
