package ugc;

import cgc.o;
import efm.d0;
import efm.r;
import ffk.t;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pfm.z;
import te0.w;
import ueg.p0;

/* JADX INFO: loaded from: classes6.dex */
public final class g implements bgc.e {

    @NotNull
    public static final d Companion = new d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gte.a f280007a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final phc.a f280008b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final toa.a f280009c;
    public final t d;
    public final w39.b e;
    public final ang.f f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final n f280010g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ihm.b f280011h;

    public g(gte.a featureToggleInteractor, phc.a rewardsRepository, toa.a notificationSettingsInteractor, t pricingPlanInteractor, w39.b locationInteractor, ang.f userInteractor, n subscriptionCancellationPollingHelper) {
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(rewardsRepository, "rewardsRepository");
        Intrinsics.checkNotNullParameter(notificationSettingsInteractor, "notificationSettingsInteractor");
        Intrinsics.checkNotNullParameter(pricingPlanInteractor, "pricingPlanInteractor");
        Intrinsics.checkNotNullParameter(locationInteractor, "locationInteractor");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(subscriptionCancellationPollingHelper, "subscriptionCancellationPollingHelper");
        this.f280007a = featureToggleInteractor;
        this.f280008b = rewardsRepository;
        this.f280009c = notificationSettingsInteractor;
        this.d = pricingPlanInteractor;
        this.e = locationInteractor;
        this.f = userInteractor;
        this.f280010g = subscriptionCancellationPollingHelper;
        ihm.b bVarE = ihm.b.e(Unit.f186387a);
        Intrinsics.checkNotNullExpressionValue(bVarE, "createDefault(...)");
        this.f280011h = bVarE;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(java.lang.String r8, gim.c r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof ugc.f
            if (r0 == 0) goto L14
            r0 = r9
            ugc.f r0 = (ugc.f) r0
            int r1 = r0.f280006x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f280006x = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            ugc.f r0 = new ugc.f
            r0.<init>(r7, r9)
            goto L12
        L1a:
            java.lang.Object r9 = r6.v
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r6.f280006x
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L3a
            if (r1 == r3) goto L34
            if (r1 != r2) goto L2c
            yhm.o.b(r9)
            return r9
        L2c:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L34:
            java.lang.String r8 = r6.u
            yhm.o.b(r9)
            goto L5b
        L3a:
            yhm.o.b(r9)
            phc.a r9 = r7.f280008b
            phc.j r9 = (phc.j) r9
            java.lang.String r1 = "perkId"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r1)
            com.revolut.feature.rewards.impl.data.network.services.RewardsService r9 = r9.f236272a
            efm.b r9 = r9.cancelSubscription(r8)
            pfm.r r9 = te0.w.g0(r9)
            r6.u = r8
            r6.f280006x = r3
            java.lang.Object r9 = nim.a.a(r9, r6)
            if (r9 != r0) goto L5b
            goto L6c
        L5b:
            r9 = 0
            r6.u = r9
            r6.f280006x = r2
            r3 = 1000(0x3e8, double:4.94E-321)
            r5 = 5
            ugc.n r1 = r7.f280010g
            r2 = r8
            java.lang.Object r8 = r1.a(r2, r3, r5, r6)
            if (r8 != r0) goto L6d
        L6c:
            return r0
        L6d:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: ugc.g.d(java.lang.String, gim.c):java.lang.Object");
    }

    public final z e() {
        rfm.m mVar = new rfm.m(((z39.b) this.e).f319221b.c(), new ubj.c(18, new p0(11)), 1);
        od0.i.Companion.getClass();
        od0.i iVar = od0.i.f224256b;
        z zVarO = mVar.p(iVar).o(iVar);
        Intrinsics.checkNotNullExpressionValue(zVarO, "onErrorReturnItem(...)");
        return zVarO;
    }

    public final ufm.n f(String perkId) {
        Intrinsics.checkNotNullParameter(perkId, "perkId");
        phc.j jVar = (phc.j) this.f280008b;
        Intrinsics.checkNotNullParameter(perkId, "perkId");
        d0<khc.b> subscriptionUrl = jVar.f236272a.getSubscriptionUrl(perkId);
        phc.b bVar = new phc.b(3, new phc.e(1));
        subscriptionUrl.getClass();
        ufm.i iVar = new ufm.i(subscriptionUrl, bVar, 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        return w.i0(iVar);
    }

    public final vkm.d g(o subscriberAccountType, w4l.k loadingStrategy) {
        Intrinsics.checkNotNullParameter(subscriberAccountType, "subscriberAccountType");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        phc.j jVar = (phc.j) this.f280008b;
        Intrinsics.checkNotNullParameter(subscriberAccountType, "subscriberAccountType");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return jVar.f236280n.b(subscriberAccountType, loadingStrategy);
    }

    public final r h(String rewardId, boolean z, boolean z3) {
        Intrinsics.checkNotNullParameter(rewardId, "rewardId");
        ohc.a args = new ohc.a(rewardId, z);
        phc.j jVar = (phc.j) this.f280008b;
        Intrinsics.checkNotNullParameter(args, "args");
        return jVar.i.f(args, z3);
    }

    public final r i(String str, boolean z) {
        r rVarW;
        r rVarQ = this.d.q();
        if (str == null || (rVarW = zi0.c.j(new e(str, null))) == null) {
            rVarW = nim.a.w(this.f.k(false), new p0(10));
        }
        r rVarDoOnNext = pd.b.r(mif.a.d(rVarQ, rVarW), new t9f.n(this, z, 6)).doOnNext(new ubj.c(20, new te8.a(str, 28)));
        Intrinsics.checkNotNullExpressionValue(rVarDoOnNext, "doOnNext(...)");
        return rVarDoOnNext;
    }

    public final ufm.n j(String rewardId) {
        Intrinsics.checkNotNullParameter(rewardId, "rewardId");
        phc.j jVar = (phc.j) this.f280008b;
        Intrinsics.checkNotNullParameter(rewardId, "rewardId");
        d0<ehc.l> d0VarRedeem = jVar.f236272a.redeem(rewardId);
        phc.b bVar = new phc.b(4, new phc.e(2));
        d0VarRedeem.getClass();
        ufm.i iVar = new ufm.i(d0VarRedeem, bVar, 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        return w.i0(iVar);
    }

    public final Object k(gim.c cVar, String str, boolean z) {
        ohc.a args = new ohc.a(str, z);
        phc.j jVar = (phc.j) this.f280008b;
        Intrinsics.checkNotNullParameter(args, "args");
        Object objA = nim.a.a(jVar.i.g(args, true), cVar);
        return objA == fim.a.COROUTINE_SUSPENDED ? objA : Unit.f186387a;
    }
}
