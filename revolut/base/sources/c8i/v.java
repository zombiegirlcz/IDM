package c8i;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ang.f f22227a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s99.i f22228b;

    public v(ang.f userInteractor, s99.i exchangeGlobalAccessInteractor) {
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(exchangeGlobalAccessInteractor, "exchangeGlobalAccessInteractor");
        this.f22227a = userInteractor;
        this.f22228b = exchangeGlobalAccessInteractor;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(gim.c r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof c8i.t
            if (r0 == 0) goto L13
            r0 = r5
            c8i.t r0 = (c8i.t) r0
            int r1 = r0.f22225w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f22225w = r1
            goto L18
        L13:
            c8i.t r0 = new c8i.t
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f22225w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r5)
            goto L42
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            yhm.o.b(r5)
            ang.f r5 = r4.f22227a
            r2 = 0
            efm.d0 r5 = r5.f(r2)
            r0.f22225w = r3
            java.lang.Object r5 = nim.a.b(r5, r0)
            if (r5 != r1) goto L42
            return r1
        L42:
            do3.n r5 = (do3.n) r5
            boolean r5 = te0.w.V(r5)
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: c8i.v.a(gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(xi0.b r6, xi0.b r7, gim.c r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof c8i.u
            if (r0 == 0) goto L13
            r0 = r8
            c8i.u r0 = (c8i.u) r0
            int r1 = r0.f22226w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f22226w = r1
            goto L18
        L13:
            c8i.u r0 = new c8i.u
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f22226w
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r8)
            return r8
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            yhm.o.b(r8)
            goto L49
        L36:
            yhm.o.b(r8)
            boolean r6 = kotlin.jvm.internal.Intrinsics.f(r6, r7)
            if (r6 == 0) goto L40
            goto L51
        L40:
            r0.f22226w = r4
            java.lang.Object r8 = r5.a(r0)
            if (r8 != r1) goto L49
            goto L5e
        L49:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r6 = r8.booleanValue()
            if (r6 != 0) goto L54
        L51:
            com.revolut.feature.onboarding.api.exchange_global_access.ExchangeGlobalAccessInteractor$Output$ShouldNotLaunch r6 = com.revolut.feature.onboarding.api.exchange_global_access.ExchangeGlobalAccessInteractor$Output.ShouldNotLaunch.f78170a
            return r6
        L54:
            r0.f22226w = r3
            s99.i r6 = r5.f22228b
            java.lang.Object r6 = r6.a(r0)
            if (r6 != r1) goto L5f
        L5e:
            return r1
        L5f:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: c8i.v.b(xi0.b, xi0.b, gim.c):java.lang.Object");
    }
}
