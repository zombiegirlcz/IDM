package ivf;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ouf.a f168844a;

    public e(ouf.a transportInteractor) {
        Intrinsics.checkNotNullParameter(transportInteractor, "transportInteractor");
        this.f168844a = transportInteractor;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x006b, code lost:
    
        if (((ivf.r) r7).f(false, r0) == r1) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r9, com.revolut.feature.transport.models.transit.PurchasedTransitTicket.ToBeActivated r10, gim.c r11) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r11 instanceof ivf.a
            if (r0 == 0) goto L13
            r0 = r11
            ivf.a r0 = (ivf.a) r0
            int r1 = r0.f168841x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f168841x = r1
            goto L18
        L13:
            ivf.a r0 = new ivf.a
            r0.<init>(r8, r11)
        L18:
            java.lang.Object r11 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f168841x
            r3 = 0
            r4 = 3
            r5 = 2
            r6 = 1
            ouf.a r7 = r8.f168844a
            if (r2 == 0) goto L44
            if (r2 == r6) goto L3e
            if (r2 == r5) goto L3a
            if (r2 == r4) goto L34
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L34:
            java.lang.Throwable r9 = r0.u
            yhm.o.b(r11)
            goto L7e
        L3a:
            yhm.o.b(r11)
            goto L6e
        L3e:
            yhm.o.b(r11)     // Catch: java.lang.Throwable -> L42
            goto L63
        L42:
            r9 = move-exception
            goto L71
        L44:
            yhm.o.b(r11)
            r0.f168841x = r6     // Catch: java.lang.Throwable -> L42
            r11 = r7
            ivf.r r11 = (ivf.r) r11     // Catch: java.lang.Throwable -> L42
            bxf.c r2 = new bxf.c     // Catch: java.lang.Throwable -> L42
            java.lang.String r10 = r10.f92682a     // Catch: java.lang.Throwable -> L42
            zhm.f0 r6 = zhm.f0.f322471a     // Catch: java.lang.Throwable -> L42
            r2.<init>(r10, r6)     // Catch: java.lang.Throwable -> L42
            suf.h r10 = r11.f168858a     // Catch: java.lang.Throwable -> L42
            java.lang.Object r9 = r10.b(r2, r9, r0)     // Catch: java.lang.Throwable -> L42
            if (r9 != r1) goto L5e
            goto L60
        L5e:
            kotlin.Unit r9 = kotlin.Unit.f186387a     // Catch: java.lang.Throwable -> L42
        L60:
            if (r9 != r1) goto L63
            goto L7d
        L63:
            r0.f168841x = r5
            ivf.r r7 = (ivf.r) r7
            java.lang.Object r9 = r7.f(r3, r0)
            if (r9 != r1) goto L6e
            goto L7d
        L6e:
            kotlin.Unit r9 = kotlin.Unit.f186387a
            return r9
        L71:
            r0.u = r9
            r0.f168841x = r4
            ivf.r r7 = (ivf.r) r7
            java.lang.Object r10 = r7.f(r3, r0)
            if (r10 != r1) goto L7e
        L7d:
            return r1
        L7e:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: ivf.e.a(java.lang.String, com.revolut.feature.transport.models.transit.PurchasedTransitTicket$ToBeActivated, gim.c):java.lang.Object");
    }
}
