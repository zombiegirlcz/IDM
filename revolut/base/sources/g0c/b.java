package g0c;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import m1c.h1;
import om4.b4;
import vkm.v1;

/* JADX INFO: loaded from: classes6.dex */
public final class b implements c0c.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f139414a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f139415b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f139416c;

    public b(kcc.a promotedMerchantsAvailabilityInteractor, d9c.d revolutPayInfoMapper) {
        Intrinsics.checkNotNullParameter(promotedMerchantsAvailabilityInteractor, "promotedMerchantsAvailabilityInteractor");
        Intrinsics.checkNotNullParameter(revolutPayInfoMapper, "revolutPayInfoMapper");
        this.f139416c = promotedMerchantsAvailabilityInteractor;
        this.f139415b = revolutPayInfoMapper;
    }

    @Override // c0c.b
    public final Flow a(h1 h1Var) {
        switch (this.f139414a) {
            case 0:
                return new ahd.y(mo3.a.g(((b4) this.f139416c).a(), null, new fv0.c(26), 1), this, h1Var, 29);
            case 1:
                return new e(mo3.a.g(new ae8.c(bla.b.b((jla.h) ((a31.a) this.f139416c).f955b, y96.c.f311753c.a()), 27), null, new fv0.c(28), 1), this, h1Var, 1);
            case 2:
                return new e(rd0.e.b(((c1g.m) ((hyf.a) this.f139416c)).b()), this, h1Var, 3);
            case 3:
                return new e(new go.g(Boolean.valueOf(((mti.h) this.f139416c).f208854a.d("AIRPORT_FAST_TRACK.redeem_revpoints", null) == bla.c.ENABLED), 2), this, h1Var, 4);
            case 4:
                return new e(new go.g(Boolean.valueOf(((jwb.c) ((svb.a) this.f139416c)).a()), 2), this, h1Var, 5);
            case 5:
                return new e(new go.g(Boolean.valueOf(((r10.r) this.f139416c).t()), 2), this, h1Var, 6);
            case 6:
                return new e(new go.g(Boolean.valueOf(((dwi.x) this.f139416c).f120468a.d("LOUNGE_PASS.redeem_revpoints", null) == bla.c.ENABLED), 2), this, h1Var, 7);
            case 7:
                return new e(new v1(new etj.l(this, null, 27)), this, h1Var, 8);
            case 8:
                return new e(mo3.a.g(((kcc.a) this.f139416c).b(), null, new h(1), 1), this, h1Var, 9);
            case 9:
                return new e(new go.g(Boolean.valueOf(((k18.c) this.f139416c).v()), 2), this, h1Var, 12);
            default:
                return new e(new v1(new etj.l(this, null, 28)), this, h1Var, 13);
        }
    }

    public b(a31.a donationsAvailabilityInteractor, h0c.a productItemFactory) {
        Intrinsics.checkNotNullParameter(donationsAvailabilityInteractor, "donationsAvailabilityInteractor");
        Intrinsics.checkNotNullParameter(productItemFactory, "productItemFactory");
        this.f139416c = donationsAvailabilityInteractor;
        this.f139415b = productItemFactory;
    }

    public b(dwi.x loungesProductAvailabilityInteractor, h0c.a productItemFactory) {
        Intrinsics.checkNotNullParameter(loungesProductAvailabilityInteractor, "loungesProductAvailabilityInteractor");
        Intrinsics.checkNotNullParameter(productItemFactory, "productItemFactory");
        this.f139416c = loungesProductAvailabilityInteractor;
        this.f139415b = productItemFactory;
    }

    public b(hyf.a travelExperiencesFeatureInteractor, h0c.a productItemFactory) {
        Intrinsics.checkNotNullParameter(travelExperiencesFeatureInteractor, "travelExperiencesFeatureInteractor");
        Intrinsics.checkNotNullParameter(productItemFactory, "productItemFactory");
        this.f139416c = travelExperiencesFeatureInteractor;
        this.f139415b = productItemFactory;
    }

    public b(k18.c featureInteractor, h0c.a productItemFactory) {
        Intrinsics.checkNotNullParameter(featureInteractor, "featureInteractor");
        Intrinsics.checkNotNullParameter(productItemFactory, "productItemFactory");
        this.f139416c = featureInteractor;
        this.f139415b = productItemFactory;
    }

    public b(mti.h asftProductAvailabilityInteractor, h0c.a productItemFactory) {
        Intrinsics.checkNotNullParameter(asftProductAvailabilityInteractor, "asftProductAvailabilityInteractor");
        Intrinsics.checkNotNullParameter(productItemFactory, "productItemFactory");
        this.f139416c = asftProductAvailabilityInteractor;
        this.f139415b = productItemFactory;
    }

    public b(quf.b transportFeatureChecker, h0c.a productItemFactory) {
        Intrinsics.checkNotNullParameter(transportFeatureChecker, "transportFeatureChecker");
        Intrinsics.checkNotNullParameter(productItemFactory, "productItemFactory");
        this.f139416c = transportFeatureChecker;
        this.f139415b = productItemFactory;
    }

    public b(r10.r featureAvailabilityInteractor, h0c.a productItemFactory) {
        Intrinsics.checkNotNullParameter(featureAvailabilityInteractor, "featureAvailabilityInteractor");
        Intrinsics.checkNotNullParameter(productItemFactory, "productItemFactory");
        this.f139416c = featureAvailabilityInteractor;
        this.f139415b = productItemFactory;
    }

    public b(svb.a revPointsGiftcardsFeatureInteractor, h0c.a productItemFactory) {
        Intrinsics.checkNotNullParameter(revPointsGiftcardsFeatureInteractor, "revPointsGiftcardsFeatureInteractor");
        Intrinsics.checkNotNullParameter(productItemFactory, "productItemFactory");
        this.f139416c = revPointsGiftcardsFeatureInteractor;
        this.f139415b = productItemFactory;
    }

    public b(vfg.g milesAvailabilityInteractor, h0c.a productItemFactory) {
        Intrinsics.checkNotNullParameter(milesAvailabilityInteractor, "milesAvailabilityInteractor");
        Intrinsics.checkNotNullParameter(productItemFactory, "productItemFactory");
        this.f139416c = milesAvailabilityInteractor;
        this.f139415b = productItemFactory;
    }

    public b(b4 creditCardRevPointsRedeemAvailabilityInteractor, h0c.a productItemFactory) {
        Intrinsics.checkNotNullParameter(creditCardRevPointsRedeemAvailabilityInteractor, "creditCardRevPointsRedeemAvailabilityInteractor");
        Intrinsics.checkNotNullParameter(productItemFactory, "productItemFactory");
        this.f139416c = creditCardRevPointsRedeemAvailabilityInteractor;
        this.f139415b = productItemFactory;
    }
}
