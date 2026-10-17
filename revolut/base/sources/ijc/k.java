package ijc;

import cli.y;
import com.revolut.feature.rewards.impl.ui.rent_and_bills.screen.rev_points_earned.RentAndBillsRevPointsEarnedScreenContract$InputData;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import nyb.m0;

/* JADX INFO: loaded from: classes6.dex */
public final class k extends oki.h implements h {
    public final RentAndBillsRevPointsEarnedScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final m0 f161764p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final bgc.d f161765q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final h60.d f161766r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final y f161767s;

    public k(RentAndBillsRevPointsEarnedScreenContract$InputData inputData, m0 revPointsTransactionsInteractor, bgc.d rentAndBillsInteractor, h60.d lottieAnimationControllerExtension, kjc.a stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(revPointsTransactionsInteractor, "revPointsTransactionsInteractor");
        Intrinsics.checkNotNullParameter(rentAndBillsInteractor, "rentAndBillsInteractor");
        Intrinsics.checkNotNullParameter(lottieAnimationControllerExtension, "lottieAnimationControllerExtension");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = inputData;
        this.f161764p = revPointsTransactionsInteractor;
        this.f161765q = rentAndBillsInteractor;
        this.f161766r = lottieAnimationControllerExtension;
        this.f161767s = mra.d.b(this, new c(true, null, null), stateMapper, null, false, 12);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I2(ijc.k r7, gim.c r8) {
        /*
            boolean r0 = r8 instanceof ijc.j
            if (r0 == 0) goto L13
            r0 = r8
            ijc.j r0 = (ijc.j) r0
            int r1 = r0.f161763w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f161763w = r1
            goto L18
        L13:
            ijc.j r0 = new ijc.j
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f161763w
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L30
            if (r2 != r3) goto L28
            yhm.o.b(r8)
            goto L70
        L28:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L30:
            yhm.o.b(r8)
            bgc.d r7 = r7.f161765q
            vgc.e r7 = (vgc.e) r7
            r7.getClass()
            java.lang.String r8 = "loadingStrategy"
            w4l.h r2 = w4l.h.f294642c
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r8)
            ffk.t r8 = r7.f288821b
            efm.r r8 = r8.v(r2)
            vkm.d r8 = rd0.e.b(r8)
            kotlinx.coroutines.flow.Flow r8 = vkm.q.q(r8)
            v73.c r5 = new v73.c
            r6 = 23
            r5.<init>(r7, r2, r6)
            kotlinx.coroutines.flow.Flow r7 = boh.f.e(r8, r5)
            zhm.h0 r8 = zhm.h0.f322473a
            vkm.y r7 = rd0.e.d(r7, r8)
            ie6.q r8 = new ie6.q
            r2 = 2
            r5 = 2
            r8.<init>(r2, r5, r4)
            r0.f161763w = r3
            java.lang.Object r8 = vkm.q.A(r7, r8, r0)
            if (r8 != r1) goto L70
            return r1
        L70:
            com.revolut.data.model.Data r8 = (com.revolut.data.model.Data) r8
            if (r8 == 0) goto L85
            java.lang.Object r7 = r8.getContent()
            com.revolut.feature.rewards.api.model.rent_and_bills.RentAndBillsConfigurations r7 = (com.revolut.feature.rewards.api.model.rent_and_bills.RentAndBillsConfigurations) r7
            if (r7 == 0) goto L85
            com.revolut.feature.rewards.api.model.rent_and_bills.RentAndBillsConfigurations$Configuration r8 = r7.f84777a
            if (r8 != 0) goto L84
            com.revolut.feature.rewards.api.model.rent_and_bills.RentAndBillsConfigurations$Configuration r8 = r7.f84778b
            if (r8 == 0) goto L85
        L84:
            return r7
        L85:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: ijc.k.I2(ijc.k, gim.c):java.lang.Object");
    }

    @Override // yji.l
    public final void I1() {
        l2(new i4g.d(this, (Continuation) null, 5), new yi5.b(26));
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f161767s;
    }
}
