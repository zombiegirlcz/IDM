package c49;

import a09.r;
import a31.l;
import android.location.Location;
import android.location.LocationManager;
import bwb.n;
import bzg.t;
import c42.j;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.tasks.Task;
import com.revolut.feature.location.api.domain.models.location.LocationDomain;
import defpackage.e1;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qfm.f0;
import rfm.m;
import rfm.o;
import rfm.w;
import ufm.i;
import z39.h;

/* JADX INFO: loaded from: classes4.dex */
public final class d {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y80.a f21122a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zh0.e f21123b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ue0.c f21124c;
    public final b49.c d;
    public final h e;
    public final LocationManager f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final i4b.f f21125g;

    public d(y80.a permissionProvider, zh0.e locationProvider, ne0.d memoryCache, ue0.c storage, b49.c geocoderService, h spoofedLocationInteractor, l80.e dateProvider, LocationManager locationManager, i4b.f locationProviderBroadcastReceiverHandler) {
        Intrinsics.checkNotNullParameter(permissionProvider, "permissionProvider");
        Intrinsics.checkNotNullParameter(locationProvider, "locationProvider");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(geocoderService, "geocoderService");
        Intrinsics.checkNotNullParameter(spoofedLocationInteractor, "spoofedLocationInteractor");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        Intrinsics.checkNotNullParameter(locationManager, "locationManager");
        Intrinsics.checkNotNullParameter(locationProviderBroadcastReceiverHandler, "locationProviderBroadcastReceiverHandler");
        this.f21122a = permissionProvider;
        this.f21123b = locationProvider;
        this.f21124c = storage;
        this.d = geocoderService;
        this.e = spoofedLocationInteractor;
        this.f = locationManager;
        this.f21125g = locationProviderBroadcastReceiverHandler;
        Continuation continuation = null;
        new x4l.c(new awd.b(this, continuation, 16), new t(memoryCache, this), new bwd.a(memoryCache, this), new c1i.f(this, continuation, 8), new n(this, continuation, 3));
    }

    public static String k(String str) {
        return j6.a.q("LOCATION_DOD_KEY_PREFIX", str);
    }

    public final w a(LocationDomain location) {
        Intrinsics.checkNotNullParameter(location, "location");
        m mVar = new m(new o(new r(this, location, 10)), new c2i.c(new j(2), 19), 1);
        Intrinsics.checkNotNullExpressionValue(mVar, "map(...)");
        return te0.w.h0(mVar);
    }

    public final ufm.n b() {
        i iVar = new i(this.f21122a.e("android.permission.ACCESS_FINE_LOCATION"), new c2i.c(new a(this, 0), 22), 0);
        Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
        return te0.w.i0(iVar);
    }

    public final m c() {
        Task<Location> lastLocation = ((FusedLocationProviderClient) this.f21123b.f322209c.getValue()).getLastLocation();
        Intrinsics.checkNotNullExpressionValue(lastLocation, "getLastLocation(...)");
        Intrinsics.checkNotNullParameter(lastLocation, "<this>");
        rfm.d dVar = new rfm.d(new mi0.b(lastLocation), 0);
        Intrinsics.checkNotNullExpressionValue(dVar, "create(...)");
        m mVar = new m(dVar, new c2i.c(new a(this, 1), 23), 0);
        Intrinsics.checkNotNullExpressionValue(mVar, "flatMap(...)");
        return mVar;
    }

    public final w d(String address) {
        Intrinsics.checkNotNullParameter(address, "address");
        m mVar = new m(new o(new r(this, address, 11)), new c2i.c(new j(3), 20), 1);
        Intrinsics.checkNotNullExpressionValue(mVar, "map(...)");
        return te0.w.h0(mVar);
    }

    public final ufm.n e() {
        efm.i iVarH = h(BitmapDescriptorFactory.HUE_RED, 5000L);
        iVarH.getClass();
        i iVar = new i(new f0(iVarH, null), new c2i.c(new j(5), 18), 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        return te0.w.i0(iVar);
    }

    public final ufm.c f() {
        ufm.c cVar = new ufm.c(new l(this, 8), 2);
        Intrinsics.checkNotNullExpressionValue(cVar, "fromCallable(...)");
        return cVar;
    }

    public final x39.b g() {
        LocationManager locationManager = this.f;
        Intrinsics.checkNotNullParameter(locationManager, "<this>");
        return (locationManager.isProviderEnabled("gps") || locationManager.isProviderEnabled("network")) ? x39.b.ENABLED : x39.b.DISABLED;
    }

    public final efm.i h(float f, long j2) {
        Long lValueOf = Long.valueOf(j2);
        if (j2 < 0) {
            lValueOf = null;
        }
        long jLongValue = lValueOf != null ? lValueOf.longValue() : 5000L;
        Float fValueOf = Float.valueOf(f);
        float fFloatValue = BitmapDescriptorFactory.HUE_RED;
        Float f4 = f >= BitmapDescriptorFactory.HUE_RED ? fValueOf : null;
        if (f4 != null) {
            fFloatValue = f4.floatValue();
        }
        zg0.b request = new zg0.b(jLongValue, 4029, 0L, fFloatValue);
        zh0.e eVar = this.f21123b;
        Intrinsics.checkNotNullParameter(request, "request");
        efm.r rVarCreate = efm.r.create(new e1(eVar, request, 15));
        Intrinsics.checkNotNullExpressionValue(rVarCreate, "create(...)");
        efm.i flowable = te0.w.w0(rVarCreate).filter(new c2i.c(new a(this, 2), 24)).map(new c2i.c(new j(4), 25)).toFlowable(efm.a.LATEST);
        Intrinsics.checkNotNullExpressionValue(flowable, "toFlowable(...)");
        return flowable;
    }

    public final efm.i i(float f, long j2) {
        return h(f, j2);
    }

    public final efm.r j() {
        efm.r rVarDistinctUntilChanged = efm.r.create(new c2i.c(this, 21)).startWith(g()).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(rVarDistinctUntilChanged, "distinctUntilChanged(...)");
        return rVarDistinctUntilChanged;
    }
}
