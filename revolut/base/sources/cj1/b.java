package cj1;

import com.revolut.feature.location.api.domain.models.location.LocationDomain;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f24577a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocationDomain f24578b;

    public b(String country, LocationDomain locationDomain) {
        Intrinsics.checkNotNullParameter(country, "country");
        Intrinsics.checkNotNullParameter(locationDomain, "locationDomain");
        this.f24577a = country;
        this.f24578b = locationDomain;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f24577a, bVar.f24577a) && Intrinsics.f(this.f24578b, bVar.f24578b);
    }

    public final int hashCode() {
        return this.f24578b.hashCode() + (this.f24577a.hashCode() * 31);
    }
}
