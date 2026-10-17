package awa;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import zhm.y0;

/* JADX INFO: loaded from: classes5.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yva.a f10754a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f10755b;

    public b(yva.a referralCodeInteractor) {
        Intrinsics.checkNotNullParameter(referralCodeInteractor, "referralCodeInteractor");
        this.f10754a = referralCodeInteractor;
        this.f10755b = y0.b("referral-code/{code}");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(zli.b r5, gim.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof awa.a
            if (r0 == 0) goto L13
            r0 = r6
            awa.a r0 = (awa.a) r0
            int r1 = r0.f10753w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f10753w = r1
            goto L18
        L13:
            awa.a r0 = new awa.a
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f10753w
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            yhm.o.b(r6)     // Catch: java.util.concurrent.CancellationException -> L27 java.lang.Exception -> L5c
            goto L59
        L27:
            r5 = move-exception
            goto L5f
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            yhm.o.b(r6)
            java.util.List r5 = r5.f323280c
            int r6 = r5.size()
            if (r3 >= r6) goto L41
            java.lang.Object r5 = r5.get(r3)
            goto L43
        L41:
            java.lang.String r5 = ""
        L43:
            java.lang.String r5 = (java.lang.String) r5
            boolean r6 = kotlin.text.d0.W(r5)
            if (r6 == 0) goto L4c
            goto L5c
        L4c:
            yva.a r6 = r4.f10754a     // Catch: java.util.concurrent.CancellationException -> L27 java.lang.Exception -> L5c
            r0.f10753w = r3     // Catch: java.util.concurrent.CancellationException -> L27 java.lang.Exception -> L5c
            cwa.j r6 = (cwa.j) r6     // Catch: java.util.concurrent.CancellationException -> L27 java.lang.Exception -> L5c
            java.lang.Object r5 = r6.e(r5, r0)     // Catch: java.util.concurrent.CancellationException -> L27 java.lang.Exception -> L5c
            if (r5 != r1) goto L59
            return r1
        L59:
            wli.r r5 = wli.r.f298517a     // Catch: java.util.concurrent.CancellationException -> L27 java.lang.Exception -> L5c
            return r5
        L5c:
            wli.s r5 = wli.s.f298518a
            return r5
        L5f:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: awa.b.a(zli.b, gim.c):java.lang.Object");
    }
}
