package rnd;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gte.a f255596a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hj8.a f255597b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final wsg.b f255598c;
    public final wa7.m d;

    public c0(gte.a featureToggleInteractor, hj8.a juniorProfileInteractor, wsg.b walletInteractor, wa7.m hiddenAccountsInteractor) {
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(juniorProfileInteractor, "juniorProfileInteractor");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(hiddenAccountsInteractor, "hiddenAccountsInteractor");
        this.f255596a = featureToggleInteractor;
        this.f255597b = juniorProfileInteractor;
        this.f255598c = walletInteractor;
        this.d = hiddenAccountsInteractor;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(com.revolut.feature.tab.accounts.models.ProductAccountId r7, gim.c r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof rnd.z
            if (r0 == 0) goto L13
            r0 = r8
            rnd.z r0 = (rnd.z) r0
            int r1 = r0.f255655w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f255655w = r1
            goto L18
        L13:
            rnd.z r0 = new rnd.z
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f255655w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r8)
            goto L6e
        L27:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L2f:
            yhm.o.b(r8)
            com.revolut.feature.junior.accounts.models.JuniorProductAccountIdPayload r7 = z88.a.a(r7)
            java.lang.String r8 = r7.f76717a
            w4l.h r2 = w4l.h.f294642c
            hj8.a r4 = r6.f255597b
            nj8.n r4 = (nj8.n) r4
            wkm.l r2 = r4.l(r2)
            qz9.o r4 = new qz9.o
            r5 = 22
            r4.<init>(r7, r5, r6, r8)
            akg.n r7 = nim.a.v(r2, r4)
            rhj.m r8 = new rhj.m
            r2 = 29
            r8.<init>(r2)
            r2 = 0
            jhi.b r7 = mo3.a.g(r7, r2, r8, r3)
            rnd.a0 r8 = new rnd.a0
            r4 = 3
            r8.<init>(r4, r2)
            zhm.h0 r2 = zhm.h0.f322473a
            vkm.y r7 = rd0.e.e(r7, r2, r8)
            r0.f255655w = r3
            java.lang.Object r8 = vkm.q.z(r7, r0)
            if (r8 != r1) goto L6e
            return r1
        L6e:
            com.revolut.retail.feature.api.AnalyticsAccount r8 = (com.revolut.retail.feature.api.AnalyticsAccount) r8
            if (r8 != 0) goto L75
            com.revolut.retail.feature.api.AnalyticsAccount$Personal$All r7 = com.revolut.retail.feature.api.AnalyticsAccount.Personal.All.f99192a
            return r7
        L75:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: rnd.c0.a(com.revolut.feature.tab.accounts.models.ProductAccountId, gim.c):java.lang.Object");
    }
}
