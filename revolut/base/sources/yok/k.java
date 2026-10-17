package yok;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class k implements sla.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final am2.a f315700a;

    public k(am2.a profileTypeInteractor) {
        Intrinsics.checkNotNullParameter(profileTypeInteractor, "profileTypeInteractor");
        this.f315700a = profileTypeInteractor;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(gim.c r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof yok.j
            if (r0 == 0) goto L13
            r0 = r7
            yok.j r0 = (yok.j) r0
            int r1 = r0.f315699w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f315699w = r1
            goto L18
        L13:
            yok.j r0 = new yok.j
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f315699w
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L30
            if (r2 != r4) goto L28
            yhm.o.b(r7)
            goto L57
        L28:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L30:
            yhm.o.b(r7)
            am2.a r7 = r6.f315700a
            efm.r r7 = r7.a()
            vkm.d r7 = rd0.e.b(r7)
            zhm.h0 r2 = zhm.h0.f322473a
            vkm.q0 r7 = rd0.e.n(r7, r2)
            yjh.b0 r2 = new yjh.b0
            r5 = 26
            r2.<init>(r5)
            jhi.b r7 = mo3.a.g(r7, r3, r2, r4)
            r0.f315699w = r4
            java.lang.Object r7 = vkm.q.z(r7, r0)
            if (r7 != r1) goto L57
            return r1
        L57:
            qla.a r7 = (qla.a) r7
            r0 = -1
            if (r7 != 0) goto L5e
            r7 = r0
            goto L66
        L5e:
            int[] r1 = yok.i.f315698a
            int r7 = r7.ordinal()
            r7 = r1[r7]
        L66:
            if (r7 == r0) goto L84
            if (r7 == r4) goto L77
            r0 = 2
            if (r7 == r0) goto L84
            r0 = 3
            if (r7 != r0) goto L71
            goto L84
        L71:
            kotlin.NoWhenBranchMatchedException r7 = new kotlin.NoWhenBranchMatchedException
            r7.<init>()
            throw r7
        L77:
            zhm.h0 r7 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r0 = rd0.d.f253311a
            rd0.c r0 = rd0.c.ERROR
            java.lang.String r1 = "Unexpected REVOLUT_X profile type. Fell back to common one"
            java.lang.String r2 = "TermsAndConditionsNavigationFactoryImpl"
            rd0.d.a(r0, r2, r1, r3, r7)
        L84:
            com.revolut.kompot.bridge.navigation.BridgeDestination r7 = new com.revolut.kompot.bridge.navigation.BridgeDestination
            com.revolut.retail.core.navigation.FeatureCommand r0 = new com.revolut.retail.core.navigation.FeatureCommand
            com.revolut.feature.profile.api.navigation.ProfileFeatureConfig$Terms r1 = com.revolut.feature.profile.api.navigation.ProfileFeatureConfig.Terms.f81349a
            r0.<init>(r1)
            r7.<init>(r0)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: yok.k.a(gim.c):java.lang.Object");
    }
}
