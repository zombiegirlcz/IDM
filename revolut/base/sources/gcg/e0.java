package gcg;

import avk.i0;
import com.revolut.core.model.account.AccountId;
import com.revolut.feature.travel.hotels.api.TravelHotelsApi$Toggles;
import com.revolut.feature_travel_hotels_models.property.search.HotelsPropertyRoomOccupancy;
import com.revolut.feature_travel_hotels_models.property.search.SimplifiedLocationType;
import i9g.h0;
import java.time.LocalDate;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.f0;

/* JADX INFO: loaded from: classes9.dex */
public final class e0 extends oki.h implements r {

    @NotNull
    public static final u Companion = new u();
    public final p8g.c A;
    public final nyb.j B;
    public final i4b.f C;
    public final f01.c D;
    public final cli.y E;
    public final ayf.p o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final h0 f142440p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final i9g.b0 f142441q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final wsg.n f142442r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final icg.a f142443s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final kxf.a f142444t;
    public final i9g.o u;
    public final jcg.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final p8g.b f142445w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final dyb.a f142446x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final fag.v f142447y;
    public final fag.y z;

    public e0(i0 stateMapper, ayf.p tripInteractor, h0 hotelsPropertySearchParamsInteractor, i9g.b0 travelHotelsPropertyInteractor, wsg.n walletInteractor, icg.a upcomingBookingsControllerModelExtension, kxf.a revPointsBannerControllerModelExtension, i9g.o travelCampaignsInteractor, jcg.a recentlyViewedControllerModelExtension, p8g.b dropOffSearchInteractor, dyb.a revPointsKycCheckExtension, fag.v boostedPropertiesRepository, fag.y discoverBannerRepository, p8g.c hotelsFeatureInteractor, nyb.j revPointsEarningRatesInteractor, i4b.f legalEntityContextProvider, f01.c uiKitResources) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(tripInteractor, "tripInteractor");
        Intrinsics.checkNotNullParameter(hotelsPropertySearchParamsInteractor, "hotelsPropertySearchParamsInteractor");
        Intrinsics.checkNotNullParameter(travelHotelsPropertyInteractor, "travelHotelsPropertyInteractor");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(upcomingBookingsControllerModelExtension, "upcomingBookingsControllerModelExtension");
        Intrinsics.checkNotNullParameter(revPointsBannerControllerModelExtension, "revPointsBannerControllerModelExtension");
        Intrinsics.checkNotNullParameter(travelCampaignsInteractor, "travelCampaignsInteractor");
        Intrinsics.checkNotNullParameter(recentlyViewedControllerModelExtension, "recentlyViewedControllerModelExtension");
        Intrinsics.checkNotNullParameter(dropOffSearchInteractor, "dropOffSearchInteractor");
        Intrinsics.checkNotNullParameter(revPointsKycCheckExtension, "revPointsKycCheckExtension");
        Intrinsics.checkNotNullParameter(boostedPropertiesRepository, "boostedPropertiesRepository");
        Intrinsics.checkNotNullParameter(discoverBannerRepository, "discoverBannerRepository");
        Intrinsics.checkNotNullParameter(hotelsFeatureInteractor, "hotelsFeatureInteractor");
        Intrinsics.checkNotNullParameter(revPointsEarningRatesInteractor, "revPointsEarningRatesInteractor");
        Intrinsics.checkNotNullParameter(legalEntityContextProvider, "legalEntityContextProvider");
        Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
        this.o = tripInteractor;
        this.f142440p = hotelsPropertySearchParamsInteractor;
        this.f142441q = travelHotelsPropertyInteractor;
        this.f142442r = walletInteractor;
        this.f142443s = upcomingBookingsControllerModelExtension;
        this.f142444t = revPointsBannerControllerModelExtension;
        this.u = travelCampaignsInteractor;
        this.v = recentlyViewedControllerModelExtension;
        this.f142445w = dropOffSearchInteractor;
        this.f142446x = revPointsKycCheckExtension;
        this.f142447y = boostedPropertiesRepository;
        this.z = discoverBannerRepository;
        this.A = hotelsFeatureInteractor;
        this.B = revPointsEarningRatesInteractor;
        this.C = legalEntityContextProvider;
        this.D = uiKitResources;
        this.E = mra.d.b(this, new j(((jte.d) ((i9g.v) hotelsFeatureInteractor).f159842a).c(TravelHotelsApi$Toggles.StaysDealsRevamp.f93613c), 3071), stateMapper, null, false, 12);
    }

    public static final Object I2(e0 e0Var, jxf.a aVar, gim.i iVar) {
        efm.f fVarK;
        h0 h0Var = e0Var.f142440p;
        LocalDate localDate = aVar.f179192b;
        LocalDate localDatePlusDays = aVar.f179193c;
        if (localDatePlusDays == null) {
            localDatePlusDays = localDate.plusDays(1L);
        }
        u uVar = Companion;
        jxf.d dVar = aVar.f179191a;
        uVar.getClass();
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        pfm.h hVarM = h0Var.m(new SimplifiedLocationType(dVar.f179197a, dVar.f179199c, dVar.f179198b));
        Intrinsics.h(localDatePlusDays);
        pfm.a aVarE = hVarM.e(h0Var.l(localDate, localDatePlusDays));
        Integer num = aVar.d;
        if (num != null) {
            fVarK = h0Var.k(zhm.u.c(new HotelsPropertyRoomOccupancy(num.intValue(), f0.f322471a)));
        } else {
            pfm.m mVar = pfm.m.f235744a;
            Intrinsics.checkNotNullExpressionValue(mVar, "complete(...)");
            fVarK = mVar;
        }
        pfm.a aVarE2 = aVarE.e(fVarK);
        Intrinsics.checkNotNullExpressionValue(aVarE2, "andThen(...)");
        Object objA = nim.a.a(aVarE2, iVar);
        return objA == fim.a.COROUTINE_SUSPENDED ? objA : Unit.f186387a;
    }

    @Override // yji.l
    public final void I1() {
        sfm.b bVar = new sfm.b(this.f142442r.x(AccountId.Personal.f51414a), new g9j.v(new g4k.e(this, 25), 10), 2);
        Intrinsics.checkNotNullExpressionValue(bVar, "flatMapObservable(...)");
        vkm.d dVarB = rd0.e.b(bVar);
        Continuation continuation = null;
        yji.l.a1(this, dVarB, null, null, new v(this, continuation, 3), 3);
        icg.d dVar = (icg.d) this.f142443s;
        ayf.h hVarE = dVar.f160267l.e(zhm.u.c(new icg.b(dVar, 0)), zhm.u.c(hxf.e.STAY));
        zhm.h0 h0Var = zhm.h0.f322473a;
        yji.l.a1(this, rd0.e.n(hVarE, h0Var), null, null, new v(this, continuation, 4), 3);
        i9g.o oVar = this.u;
        w4l.f fVar = oVar.f159824a.z;
        Unit unit = Unit.f186387a;
        yji.l.a1(this, rd0.e.b(ue0.e.p(nim.a.w(fVar.f(unit, false), new i9e.a(oVar, 2)), h0Var)), null, null, new v(this, continuation, 5), 3);
        i9g.v vVar = (i9g.v) this.A;
        boolean zC = vVar.c();
        jcg.a aVar = this.v;
        if (zC) {
            i9g.t tVar = (i9g.t) this.f142445w;
            yji.l.a1(this, rd0.e.n(rd0.e.b(nim.a.w(tVar.f159839b.f133389x.f(10, false), new i9e.a(tVar, 4))), h0Var), null, null, new v(this, continuation, 6), 3);
        } else {
            yji.l.a1(this, rd0.e.n(rd0.e.b(nim.a.w(((i9g.t) ((jcg.c) aVar).f172793l).f159839b.f133389x.f(10, true), new j7b.l(25))), h0Var), null, null, new v(this, continuation, 7), 3);
        }
        i9g.a0 a0Var = (i9g.a0) ((jcg.c) aVar).f172794m;
        yji.l.a1(this, rd0.e.n(rd0.e.b(nim.a.w(a0Var.f159777a.B.f(Boolean.valueOf(((jte.d) ((i9g.v) a0Var.e).f159842a).c(TravelHotelsApi$Toggles.StaysTopDestinationsV2.f93620c)), false), new j7b.l(26))), h0Var), null, null, new v(this, continuation, 8), 3);
        h0 h0Var2 = this.f142440p;
        efm.r rVarE = h0Var2.e();
        efm.r rVarF = h0Var2.f();
        efm.r rVarG = h0Var2.g();
        efm.r map = h0Var2.h().map(new i9g.f0(2, new i6j.p(28)));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        efm.r rVarCombineLatest = efm.r.combineLatest(rVarE, rVarF, rVarG, map, new g9j.v(new dr0.w(1), 11));
        Intrinsics.checkNotNullExpressionValue(rVarCombineLatest, "combineLatest(...)");
        yji.l.a1(this, rd0.e.b(rVarCombineLatest), null, null, new v(this, continuation, 9), 3);
        if (vVar.b()) {
            fag.v vVar2 = this.f142447y;
            vVar2.getClass();
            w4l.h loadingStrategy = w4l.h.f294642c;
            Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
            yji.l.a1(this, rd0.e.b(ue0.e.p(vVar2.d.e(unit, loadingStrategy), h0Var)), null, null, new v(this, continuation, 1), 3);
            yji.l.a1(this, rd0.e.b(ue0.e.p(uj3.b.s(this.B), h0Var)), null, null, new v(this, continuation, 2), 3);
            yji.l.a1(this, rd0.e.e(new dfj.f(this.z.f133400a.C0("IS_DISCOVER_BANNER_CLOSED_KEY", Boolean.TYPE), 21), h0Var, new eob.e(3, 19, continuation)), null, null, new a2g.q(this, continuation, 25), 3);
        }
        yji.l.a1(this, this.C.j(new md6.q(md6.p.STAYS, false)), null, null, new v(this, continuation, 0), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.E;
    }
}
