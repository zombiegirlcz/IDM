package c1g;

import ble.c1;
import com.revolut.data.model.Data;
import jsl.t0;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import vkm.v1;
import zhm.h0;

/* JADX INFO: loaded from: classes9.dex */
public final class v implements a39.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20512a = 15;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f20513b;

    public v(a31.a donationsAvailabilityInteractor) {
        Intrinsics.checkNotNullParameter(donationsAvailabilityInteractor, "donationsAvailabilityInteractor");
        this.f20513b = donationsAvailabilityInteractor;
    }

    @Override // a39.a
    public final Flow a() {
        switch (this.f20512a) {
            case 0:
                return rd0.e.b(ue0.e.E(nim.a.w(nim.a.w(((cpj.b) ((m) ((hyf.a) this.f20513b)).f20497a).k(yoj.c.TRAVEL_EXPERIENCES, yoj.d.DISABLED), new c09.a(5)), new c09.a(9)), new Data(b39.b.f12015a, null, false, 6, null)));
            case 1:
                return zi0.c.i(((c6b.p) ((q5b.c) this.f20513b)).a() ? new b39.a(b39.d.COBRANDS) : b39.b.f12015a);
            case 2:
                return rd0.e.b(pd.b.r(ue0.e.E(rd0.e.c(new ae8.c(bla.b.b(((dwi.x) this.f20513b).f120468a, "LOUNGE_PASS"), 4), kotlin.coroutines.g.f186406a), new Data(Boolean.FALSE, null, false, 6, null)), new dug.a(this, 9)));
            case 3:
                efb.a aVar = (efb.a) this.f20513b;
                aVar.getClass();
                return nim.a.v(new v1(new e8e.w(aVar, (Continuation) null, 11)), new ebi.i(28));
            case 4:
                efb.b bVar = (efb.b) this.f20513b;
                bVar.getClass();
                return nim.a.v(new v1(new e8e.w(bVar, (Continuation) null, 12)), new ebi.i(29));
            case 5:
                efb.c cVar = (efb.c) this.f20513b;
                cVar.getClass();
                return nim.a.v(new v1(new e8e.w(cVar, (Continuation) null, 13)), new efb.i(0));
            case 6:
                efb.j jVar = (efb.j) this.f20513b;
                jVar.getClass();
                return nim.a.v(new v1(new e8e.w(jVar, (Continuation) null, 14)), new efb.i(1));
            case 7:
                return new go.g(new Data(((h4g.g) this.f20513b).a() ? new b39.a(b39.d.FLIGHTS) : b39.b.f12015a, null, false, 6, null), 2);
            case 8:
                return rd0.e.b(nim.a.w(nim.a.w(((cpj.b) ((i9g.v) ((p8g.c) this.f20513b)).f159843b).k(yoj.c.STAYS, yoj.d.DISABLED), new i6j.p(25)), new i6j.p(26)));
            case 9:
                return nim.a.v(zi0.c.i(Boolean.valueOf(((quf.b) this.f20513b).a())), new iui.a(19));
            case 10:
                jwb.c cVar2 = (jwb.c) ((svb.a) this.f20513b);
                cVar2.getClass();
                Continuation continuation = null;
                return rd0.e.e(nim.a.v(new v1(new t0(cVar2, continuation, 7)), new jt2.d(20)), h0.f322473a, new i23.c(3, 8, continuation));
            case 11:
                return nim.a.v(nim.a.v(kw7.e.a(((kw7.c) this.f20513b).f190299a), new kvg.j(10)), new kvg.j(14));
            case 12:
                return new c1(new v1(new kq5.d(this, null, 27)), 20);
            case 13:
                return zi0.c.i(((mti.h) this.f20513b).a() ? new b39.a(b39.d.AIRPORT_SECURITY_FAST_TRACK) : b39.b.f12015a);
            case 14:
                return zi0.c.i(((pak.h) this.f20513b).g() ? new b39.a(b39.d.REVOLUT_PAY_REV_POINTS) : b39.b.f12015a);
            case 15:
                return nim.a.v(new ae8.c(bla.b.b((jla.h) ((a31.a) this.f20513b).f955b, y96.c.f311753c.a()), 27), new sa6.y(0));
            default:
                return new v1(new v06.i(this, null, 27));
        }
    }

    public v(efb.a airportTransfersAvailabilityInteractor) {
        Intrinsics.checkNotNullParameter(airportTransfersAvailabilityInteractor, "airportTransfersAvailabilityInteractor");
        this.f20513b = airportTransfersAvailabilityInteractor;
    }

    public v(efb.b luggageStorageAvailabilityInteractor) {
        Intrinsics.checkNotNullParameter(luggageStorageAvailabilityInteractor, "luggageStorageAvailabilityInteractor");
        this.f20513b = luggageStorageAvailabilityInteractor;
    }

    public v(efb.c reverywhereAvailabilityInteractor) {
        Intrinsics.checkNotNullParameter(reverywhereAvailabilityInteractor, "reverywhereAvailabilityInteractor");
        this.f20513b = reverywhereAvailabilityInteractor;
    }

    public v(efb.j stationsAvailabilityInteractor) {
        Intrinsics.checkNotNullParameter(stationsAvailabilityInteractor, "stationsAvailabilityInteractor");
        this.f20513b = stationsAvailabilityInteractor;
    }

    public v(h4g.g availabilityInteractor) {
        Intrinsics.checkNotNullParameter(availabilityInteractor, "availabilityInteractor");
        this.f20513b = availabilityInteractor;
    }

    public v(kw7.c insuranceAvailabilityInteractor) {
        Intrinsics.checkNotNullParameter(insuranceAvailabilityInteractor, "insuranceAvailabilityInteractor");
        this.f20513b = insuranceAvailabilityInteractor;
    }

    public v(mti.h asftProductAvailabilityInteractor) {
        Intrinsics.checkNotNullParameter(asftProductAvailabilityInteractor, "asftProductAvailabilityInteractor");
        this.f20513b = asftProductAvailabilityInteractor;
    }

    public v(pak.h revolutPayRevPointsAvailabilityInteractor) {
        Intrinsics.checkNotNullParameter(revolutPayRevPointsAvailabilityInteractor, "revolutPayRevPointsAvailabilityInteractor");
        this.f20513b = revolutPayRevPointsAvailabilityInteractor;
    }

    public v(q5b.c cobrandsProductAvailabilityInteractor) {
        Intrinsics.checkNotNullParameter(cobrandsProductAvailabilityInteractor, "cobrandsProductAvailabilityInteractor");
        this.f20513b = cobrandsProductAvailabilityInteractor;
    }

    public v(quf.b transportFeatureChecker) {
        Intrinsics.checkNotNullParameter(transportFeatureChecker, "transportFeatureChecker");
        this.f20513b = transportFeatureChecker;
    }

    public v(vfg.g milesFeatureInteractor) {
        Intrinsics.checkNotNullParameter(milesFeatureInteractor, "milesFeatureInteractor");
        this.f20513b = milesFeatureInteractor;
    }

    public v(p8g.c travelHotelsFeatureInteractor) {
        Intrinsics.checkNotNullParameter(travelHotelsFeatureInteractor, "travelHotelsFeatureInteractor");
        this.f20513b = travelHotelsFeatureInteractor;
    }

    public v(svb.a revPointsGiftcardsFeatureInteractor) {
        Intrinsics.checkNotNullParameter(revPointsGiftcardsFeatureInteractor, "revPointsGiftcardsFeatureInteractor");
        this.f20513b = revPointsGiftcardsFeatureInteractor;
    }

    public v(h30.q storeAvailabilityInteractor) {
        Intrinsics.checkNotNullParameter(storeAvailabilityInteractor, "storeAvailabilityInteractor");
        this.f20513b = storeAvailabilityInteractor;
    }

    public v(hyf.a experiencesFeatureInteractor) {
        Intrinsics.checkNotNullParameter(experiencesFeatureInteractor, "experiencesFeatureInteractor");
        this.f20513b = experiencesFeatureInteractor;
    }

    public v(dwi.x airportLoungesAvailabilityInteractor) {
        Intrinsics.checkNotNullParameter(airportLoungesAvailabilityInteractor, "airportLoungesAvailabilityInteractor");
        this.f20513b = airportLoungesAvailabilityInteractor;
    }
}
