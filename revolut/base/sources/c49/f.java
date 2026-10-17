package c49;

import bwc.i;
import com.revolut.feature.location.api.domain.models.location.LocationDomain;
import com.revolut.feature.location.impl.data.network.services.SecurityService;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import org.jetbrains.annotations.NotNull;
import pfm.r;
import rfm.l;
import te0.w;
import wim.z;

/* JADX INFO: loaded from: classes13.dex */
public final class f {

    @NotNull
    public static final e Companion = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SecurityService f21126a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y80.a f21127b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f21128c;
    public final d49.a d;
    public final ue0.c e;

    public f(SecurityService securityService, y80.a permissionProvider, d locationRepository, d49.a locationDistanceMeter, ue0.c storage) {
        Intrinsics.checkNotNullParameter(securityService, "securityService");
        Intrinsics.checkNotNullParameter(permissionProvider, "permissionProvider");
        Intrinsics.checkNotNullParameter(locationRepository, "locationRepository");
        Intrinsics.checkNotNullParameter(locationDistanceMeter, "locationDistanceMeter");
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f21126a = securityService;
        this.f21127b = permissionProvider;
        this.f21128c = locationRepository;
        this.d = locationDistanceMeter;
        this.e = storage;
    }

    public final void a(LocationDomain locationDomain) {
        ue0.c cVar = this.e;
        if (locationDomain == null) {
            cVar.I0("LAST_KNOWN_LOCATION_LAT");
            cVar.I0("LAST_KNOWN_LOCATION_LON");
            return;
        }
        double f78066a = locationDomain.getF78066a();
        double f78067b = locationDomain.getF78067b();
        Float fValueOf = Float.valueOf((float) f78066a);
        Class cls = Float.TYPE;
        cVar.G(fValueOf, "LAST_KNOWN_LOCATION_LAT", z.d(o0.b(cls)));
        cVar.G(Float.valueOf((float) f78067b), "LAST_KNOWN_LOCATION_LON", z.d(o0.b(cls)));
    }

    public final r b(String owner, LocationDomain location) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        Intrinsics.checkNotNullParameter(location, "location");
        a(location);
        l lVar = new l(this.f21128c.a(location), new c2i.c(new byc.a(this, owner, location), 27), 0);
        Intrinsics.checkNotNullExpressionValue(lVar, "flatMapSingle(...)");
        pfm.a aVar = new pfm.a(lVar, new c2i.c(new i(this), 26), 4);
        Intrinsics.checkNotNullExpressionValue(aVar, "flatMapCompletable(...)");
        return w.g0(aVar);
    }
}
