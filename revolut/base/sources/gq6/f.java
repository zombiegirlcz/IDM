package gq6;

import kotlin.jvm.internal.Intrinsics;
import yud.g;

/* JADX INFO: loaded from: classes3.dex */
public final class f extends aq6.a {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final gte.a f145589l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final avd.b f145590m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final g f145591n;
    public final iq6.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final wsg.b f145592p;

    public f(gte.a featureToggleInteractor, avd.b flexibleStakingConsentInteractor, g stakingInteractor, iq6.a autoStakingResultPopupProvider, wsg.b walletsInteractor) {
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(flexibleStakingConsentInteractor, "flexibleStakingConsentInteractor");
        Intrinsics.checkNotNullParameter(stakingInteractor, "stakingInteractor");
        Intrinsics.checkNotNullParameter(autoStakingResultPopupProvider, "autoStakingResultPopupProvider");
        Intrinsics.checkNotNullParameter(walletsInteractor, "walletsInteractor");
        this.f145589l = featureToggleInteractor;
        this.f145590m = flexibleStakingConsentInteractor;
        this.f145591n = stakingInteractor;
        this.o = autoStakingResultPopupProvider;
        this.f145592p = walletsInteractor;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object Z2(gq6.f r4, gim.c r5) {
        /*
            boolean r0 = r5 instanceof gq6.e
            if (r0 == 0) goto L13
            r0 = r5
            gq6.e r0 = (gq6.e) r0
            int r1 = r0.f145588w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f145588w = r1
            goto L18
        L13:
            gq6.e r0 = new gq6.e
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f145588w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r5)
            goto L48
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            yhm.o.b(r5)
            avd.b r4 = r4.f145590m
            akg.n r4 = r4.a()
            a07.p r5 = new a07.p
            r2 = 19
            r5.<init>(r4, r2)
            r0.f145588w = r3
            java.lang.Object r5 = vkm.q.x(r5, r0)
            if (r5 != r1) goto L48
            return r1
        L48:
            com.revolut.data.model.Data r5 = (com.revolut.data.model.Data) r5
            java.lang.Throwable r4 = r5.getError()
            if (r4 != 0) goto L57
            java.lang.Object r4 = r5.getContent()
            if (r4 != 0) goto L57
            goto L58
        L57:
            r3 = 0
        L58:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r3)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: gq6.f.Z2(gq6.f, gim.c):java.lang.Object");
    }

    @Override // yji.n
    public final void H2() {
        V2(new c(this, null), new yi5.b(29));
    }
}
