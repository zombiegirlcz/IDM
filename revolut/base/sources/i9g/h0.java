package i9g;

import com.revolut.feature_travel_hotels_models.property.HotelsProperty;
import com.revolut.feature_travel_hotels_models.property.search.LocationData;
import fag.q0;
import fag.t0;
import fag.x0;
import fag.y0;
import java.time.LocalDate;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t0 f159799a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y0 f159800b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final wsg.n f159801c;

    public h0(t0 travelHotelsRepository, y0 travelHotelsSearchParametersRepository, wsg.n walletInteractor) {
        Intrinsics.checkNotNullParameter(travelHotelsRepository, "travelHotelsRepository");
        Intrinsics.checkNotNullParameter(travelHotelsSearchParametersRepository, "travelHotelsSearchParametersRepository");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        this.f159799a = travelHotelsRepository;
        this.f159800b = travelHotelsSearchParametersRepository;
        this.f159801c = walletInteractor;
    }

    public final pfm.h a(dgi.j params) {
        Intrinsics.checkNotNullParameter(params, "params");
        t0 t0Var = this.f159799a;
        t0Var.getClass();
        Intrinsics.checkNotNullParameter(params, "params");
        pfm.h hVar = new pfm.h(new q0(t0Var, params, 0), 2);
        Intrinsics.checkNotNullExpressionValue(hVar, "fromAction(...)");
        return hVar;
    }

    public final LocalDate b() {
        return this.f159799a.a().f114672b;
    }

    public final LocalDate c() {
        return this.f159799a.a().f114673c;
    }

    public final dgi.c d() {
        return this.f159799a.a();
    }

    public final efm.r e() {
        efm.r map = h().map(new i52.j(28, new i6j.p(29)));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return map;
    }

    public final efm.r f() {
        efm.r map = h().map(new i52.j(29, new e0(0)));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return map;
    }

    public final efm.r g() {
        efm.r map = h().map(new f0(4, new e0(3)));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return map;
    }

    public final efm.r h() {
        efm.r rVarFlatMap = m70.a.g(osg.b.d(this.f159801c), null, new i83.m(6), 1).flatMap(new f0(5, new g0(this, 0)));
        Intrinsics.checkNotNullExpressionValue(rVarFlatMap, "flatMap(...)");
        return ue0.e.y(rVarFlatMap, zhm.h0.f322473a, new g0(this, 1));
    }

    public final efm.r i(ffi.a aVar) {
        y0 y0Var = this.f159800b;
        y0Var.getClass();
        w4l.h loadingStrategy = w4l.h.f294642c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return y0Var.d.e(new x0(aVar), loadingStrategy);
    }

    public final pfm.h j(zfi.a appliedFilters) {
        Intrinsics.checkNotNullParameter(appliedFilters, "appliedFilters");
        t0 t0Var = this.f159799a;
        t0Var.getClass();
        Intrinsics.checkNotNullParameter(appliedFilters, "appliedFilters");
        pfm.h hVar = new pfm.h(new f0d.m(t0Var, appliedFilters, 5), 2);
        Intrinsics.checkNotNullExpressionValue(hVar, "fromAction(...)");
        return hVar;
    }

    public final pfm.h k(List roomOccupancy) {
        Intrinsics.checkNotNullParameter(roomOccupancy, "roomOccupancy");
        t0 t0Var = this.f159799a;
        t0Var.getClass();
        Intrinsics.checkNotNullParameter(roomOccupancy, "roomOccupancy");
        pfm.h hVar = new pfm.h(new f0d.m(t0Var, roomOccupancy, 6), 2);
        Intrinsics.checkNotNullExpressionValue(hVar, "fromAction(...)");
        return hVar;
    }

    public final pfm.h l(LocalDate startDate, LocalDate endDate) {
        Intrinsics.checkNotNullParameter(startDate, "startDate");
        Intrinsics.checkNotNullParameter(endDate, "endDate");
        t0 t0Var = this.f159799a;
        t0Var.getClass();
        Intrinsics.checkNotNullParameter(startDate, "startDate");
        Intrinsics.checkNotNullParameter(endDate, "endDate");
        pfm.h hVar = new pfm.h(new a09.a0(t0Var, 13, startDate, endDate), 2);
        Intrinsics.checkNotNullExpressionValue(hVar, "fromAction(...)");
        return hVar;
    }

    public final pfm.h m(LocationData location) {
        Intrinsics.checkNotNullParameter(location, "location");
        t0 t0Var = this.f159799a;
        t0Var.getClass();
        Intrinsics.checkNotNullParameter(location, "location");
        pfm.h hVar = new pfm.h(new f0d.m(t0Var, location, 9), 2);
        Intrinsics.checkNotNullExpressionValue(hVar, "fromAction(...)");
        return hVar;
    }

    public final pfm.h n(HotelsProperty hotelsProperty) {
        Intrinsics.checkNotNullParameter(hotelsProperty, "hotelsProperty");
        t0 t0Var = this.f159799a;
        t0Var.getClass();
        Intrinsics.checkNotNullParameter(hotelsProperty, "hotelsProperty");
        pfm.h hVar = new pfm.h(new f0d.m(t0Var, hotelsProperty, 8), 2);
        Intrinsics.checkNotNullExpressionValue(hVar, "fromAction(...)");
        return hVar;
    }
}
