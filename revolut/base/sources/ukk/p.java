package ukk;

import cli.y;
import com.revolut.data.model.Data;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.partner_offers.kompot.offers.PlanPartnersOffersScreenContract$InputData;
import ffk.t;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import uj6.v;
import wli.x;

/* JADX INFO: loaded from: classes11.dex */
public final class p extends oki.h implements i {
    public final PlanPartnersOffersScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final bgc.e f280786p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final t f280787q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final a61.a f280788r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final skk.a f280789s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final x f280790t;
    public final ajk.b u;
    public final vii.b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final y f280791w;

    public p(cli.n stateMapper, PlanPartnersOffersScreenContract$InputData inputData, bgc.e rewardsInteractor, t pricingPlanInteractor, a61.a partnerSubscriptionsInteractor, skk.a partnerOfferNavigationCommandProvider, x deeplinkHandler, ajk.b outOfAppNavigationProvider) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(rewardsInteractor, "rewardsInteractor");
        Intrinsics.checkNotNullParameter(pricingPlanInteractor, "pricingPlanInteractor");
        Intrinsics.checkNotNullParameter(partnerSubscriptionsInteractor, "partnerSubscriptionsInteractor");
        Intrinsics.checkNotNullParameter(partnerOfferNavigationCommandProvider, "partnerOfferNavigationCommandProvider");
        Intrinsics.checkNotNullParameter(deeplinkHandler, "deeplinkHandler");
        Intrinsics.checkNotNullParameter(outOfAppNavigationProvider, "outOfAppNavigationProvider");
        this.o = inputData;
        this.f280786p = rewardsInteractor;
        this.f280787q = pricingPlanInteractor;
        this.f280788r = partnerSubscriptionsInteractor;
        this.f280789s = partnerOfferNavigationCommandProvider;
        this.f280790t = deeplinkHandler;
        this.u = outOfAppNavigationProvider;
        this.v = new vii.b();
        this.f280791w = mra.d.b(this, new h(new Data(null, null, true, 3, null), new Data(null, null, true, 3, null)), stateMapper, null, false, 12);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I2(ukk.p r4, gim.c r5) {
        /*
            boolean r0 = r5 instanceof ukk.l
            if (r0 == 0) goto L13
            r0 = r5
            ukk.l r0 = (ukk.l) r0
            int r1 = r0.f280781w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f280781w = r1
            goto L18
        L13:
            ukk.l r0 = new ukk.l
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f280781w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r5)
            goto L4c
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            yhm.o.b(r5)
            a61.a r4 = r4.f280788r
            kotlinx.coroutines.flow.Flow r4 = a61.a.S(r4)
            uj8.j r5 = new uj8.j
            r2 = 7
            r5.<init>(r2)
            r2 = 0
            jhi.b r4 = mo3.a.g(r4, r2, r5, r3)
            r0.f280781w = r3
            java.lang.Object r5 = vkm.q.x(r4, r0)
            if (r5 != r1) goto L4c
            return r1
        L4c:
            hha.e0 r5 = (hha.e0) r5
            java.lang.String r4 = r5.f152299a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: ukk.p.I2(ukk.p, gim.c):java.lang.Object");
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        m mVar = new m(1, continuation, this);
        vii.b bVar = this.v;
        yji.l.a1(this, nim.a.v(vkm.q.Q(bVar, mVar), new v(10)), null, null, new n(1, continuation, this), 3);
        int i = 0;
        yji.l.a1(this, vkm.q.Q(bVar, new m(i, continuation, this)), null, null, new n(i, continuation, this), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f280791w;
    }
}
