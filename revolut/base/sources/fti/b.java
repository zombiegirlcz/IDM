package fti;

import ahe.m0;
import dwi.x;
import fjd.g0;
import h4g.g;
import i9g.v;
import jec.p;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kvg.j;
import mti.h;
import qij.s;
import qtb.o;
import rd0.e;
import ryj.w;
import sx2.r;
import vkm.v1;
import wtj.f;
import zhm.h0;

/* JADX INFO: loaded from: classes10.dex */
public final class b implements mf1.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f138026a = 4;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f138027b;

    public b(hyf.a travelExperiencesFeatureInteractor) {
        Intrinsics.checkNotNullParameter(travelExperiencesFeatureInteractor, "travelExperiencesFeatureInteractor");
        this.f138027b = travelExperiencesFeatureInteractor;
    }

    @Override // mf1.a
    public final Flow a() {
        switch (this.f138026a) {
            case 0:
                return new v1(new g0(this, (Continuation) null, 17));
            case 1:
                return new v1(new p(this, null, 2));
            case 2:
                return new m0(e.e(mo3.a.g(nim.a.v(kw7.e.a(((kw7.c) this.f138027b).f190299a), new j(10)), null, null, 3), h0.f322473a, new o(3, 13, (Continuation) null)), 19);
            case 3:
                return new w(e.b(((v) ((p8g.c) this.f138027b)).d()), 15);
            case 4:
                return new v1(new r(this, null, 25));
            case 5:
                return new s(((rfb.b) this.f138027b).b(rfb.c.f253750a), 28);
            case 6:
                return new v1(new tqh.j(this, null, 20));
            case 7:
                return new v1(new uvf.b(this, null, 0));
            case 8:
                return new v2e.h0(e.b(((g) this.f138027b).c()), 10);
            case 9:
                return new v1(new f(this, null, 2));
            case 10:
                return new v1(new xnl.f(this, null, 14));
            default:
                return new v1(new yg6.v(this, null, 8));
        }
    }

    @Override // mf1.a
    public final String b() {
        switch (this.f138026a) {
            case 0:
                return null;
            case 1:
                return null;
            case 2:
                return null;
            case 3:
                return null;
            case 4:
                return "ESIM";
            case 5:
                return null;
            case 6:
                return null;
            case 7:
                return null;
            case 8:
                return "SHOPS";
            case 9:
                return null;
            case 10:
                return "GIFT_CARDS";
            default:
                return null;
        }
    }

    public b(h asftProductAvailabilityInteractor) {
        Intrinsics.checkNotNullParameter(asftProductAvailabilityInteractor, "asftProductAvailabilityInteractor");
        this.f138027b = asftProductAvailabilityInteractor;
    }

    public b(svb.a revPointsGiftcardsFeatureInteractor) {
        Intrinsics.checkNotNullParameter(revPointsGiftcardsFeatureInteractor, "revPointsGiftcardsFeatureInteractor");
        this.f138027b = revPointsGiftcardsFeatureInteractor;
    }

    public b(vfg.g travelMilesFeatureAvailabilityInteractor) {
        Intrinsics.checkNotNullParameter(travelMilesFeatureAvailabilityInteractor, "travelMilesFeatureAvailabilityInteractor");
        this.f138027b = travelMilesFeatureAvailabilityInteractor;
    }

    public b(x airportLoungesAvailabilityInteractor) {
        Intrinsics.checkNotNullParameter(airportLoungesAvailabilityInteractor, "airportLoungesAvailabilityInteractor");
        this.f138027b = airportLoungesAvailabilityInteractor;
    }

    public b(g shopsFeatureAvailabilityInteractor) {
        Intrinsics.checkNotNullParameter(shopsFeatureAvailabilityInteractor, "shopsFeatureAvailabilityInteractor");
        this.f138027b = shopsFeatureAvailabilityInteractor;
    }

    public b(on2.b featureChecker) {
        Intrinsics.checkNotNullParameter(featureChecker, "featureChecker");
        this.f138027b = featureChecker;
    }

    public b(p8g.c travelHotelsFeatureInteractor) {
        Intrinsics.checkNotNullParameter(travelHotelsFeatureInteractor, "travelHotelsFeatureInteractor");
        this.f138027b = travelHotelsFeatureInteractor;
    }

    public b(quf.b featureChecker) {
        Intrinsics.checkNotNullParameter(featureChecker, "featureChecker");
        this.f138027b = featureChecker;
    }

    public b(rfb.b salaryAccountFeatureChecker) {
        Intrinsics.checkNotNullParameter(salaryAccountFeatureChecker, "salaryAccountFeatureChecker");
        this.f138027b = salaryAccountFeatureChecker;
    }

    public b(cej.a esimFeatureAvailabilityInteractor) {
        Intrinsics.checkNotNullParameter(esimFeatureAvailabilityInteractor, "esimFeatureAvailabilityInteractor");
        this.f138027b = esimFeatureAvailabilityInteractor;
    }

    public b(kw7.c insuranceAvailabilityInteractor) {
        Intrinsics.checkNotNullParameter(insuranceAvailabilityInteractor, "insuranceAvailabilityInteractor");
        this.f138027b = insuranceAvailabilityInteractor;
    }
}
