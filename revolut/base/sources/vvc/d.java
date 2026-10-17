package vvc;

import com.revolut.core.mobile_services.impl.map.GmsLatLngBounds;
import com.revolut.feature.location.api.domain.models.location.LocationDomain;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class d implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final GmsLatLngBounds f292504a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocationDomain f292505b;

    public d(GmsLatLngBounds msLatLngBounds) {
        Intrinsics.checkNotNullParameter(msLatLngBounds, "msLatLngBounds");
        this.f292504a = msLatLngBounds;
        this.f292505b = new LocationDomain(msLatLngBounds.a().f4847a, msLatLngBounds.a().f4848b);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && this.f292504a.equals(((d) obj2).f292504a);
    }

    @Override // vvc.f
    public final LocationDomain getLocation() {
        return this.f292505b;
    }

    public final int hashCode() {
        return this.f292504a.hashCode();
    }
}
