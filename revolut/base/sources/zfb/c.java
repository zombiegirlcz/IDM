package zfb;

import ang.f;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class c implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f321916a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l61.a f321917b;

    public c(f userInteractor, l61.a userCompanyInteractor) {
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(userCompanyInteractor, "userCompanyInteractor");
        this.f321916a = userInteractor;
        this.f321917b = userCompanyInteractor;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Enum a(gim.c r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof zfb.b
            if (r0 == 0) goto L13
            r0 = r7
            zfb.b r0 = (zfb.b) r0
            int r1 = r0.f321915x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f321915x = r1
            goto L18
        L13:
            zfb.b r0 = new zfb.b
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f321915x
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            do3.n r0 = r0.u
            yhm.o.b(r7)
            goto L63
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L34:
            yhm.o.b(r7)
            goto L4b
        L38:
            yhm.o.b(r7)
            ang.f r7 = r6.f321916a
            r2 = 0
            efm.d0 r7 = r7.f(r2)
            r0.f321915x = r4
            java.lang.Object r7 = nim.a.b(r7, r0)
            if (r7 != r1) goto L4b
            goto L5f
        L4b:
            do3.n r7 = (do3.n) r7
            l61.a r2 = r6.f321917b
            ang.b r2 = (ang.b) r2
            efm.d0 r2 = r2.a()
            r0.u = r7
            r0.f321915x = r3
            java.lang.Object r0 = nim.a.b(r2, r0)
            if (r0 != r1) goto L60
        L5f:
            return r1
        L60:
            r5 = r0
            r0 = r7
            r7 = r5
        L63:
            l71.d r7 = (l71.d) r7
            kotlin.jvm.internal.Intrinsics.h(r0)
            kotlin.jvm.internal.Intrinsics.h(r7)
            boolean r1 = te0.w.Y(r0)
            if (r1 == 0) goto L74
            agb.a r7 = agb.a.SALARIED
            return r7
        L74:
            boolean r7 = l71.f.c(r7)
            if (r7 == 0) goto L7d
            agb.a r7 = agb.a.NON_SALARIED
            return r7
        L7d:
            boolean r7 = te0.w.Z(r0)
            if (r7 == 0) goto L86
            agb.a r7 = agb.a.NON_SALARIED_UK
            return r7
        L86:
            agb.a r7 = agb.a.NON_SALARIED
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: zfb.c.a(gim.c):java.lang.Enum");
    }
}
