package dwi;

import com.revolut.feature.location.api.domain.models.location.LocationDomain;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class r0 {

    @NotNull
    public static final p0 Companion = new p0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hwi.n0 f120455a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y80.a f120456b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w39.b f120457c;
    public final d49.a d;
    public volatile LocationDomain e;

    public r0(hwi.n0 airportsRepository, y80.a permissionProvider, w39.b locationInteractor, d49.a locationDistanceMeter) {
        Intrinsics.checkNotNullParameter(airportsRepository, "airportsRepository");
        Intrinsics.checkNotNullParameter(permissionProvider, "permissionProvider");
        Intrinsics.checkNotNullParameter(locationInteractor, "locationInteractor");
        Intrinsics.checkNotNullParameter(locationDistanceMeter, "locationDistanceMeter");
        this.f120455a = airportsRepository;
        this.f120456b = permissionProvider;
        this.f120457c = locationInteractor;
        this.d = locationDistanceMeter;
    }

    public final float a(svi.a aVar, LocationDomain locationDomain) {
        return this.d.a(aVar.f265871g, aVar.f265872h, locationDomain.f78066a, locationDomain.f78067b);
    }
}
