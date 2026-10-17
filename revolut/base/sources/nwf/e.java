package nwf;

import com.revolut.data.model.Data;
import com.revolut.feature.location.api.domain.models.location.LocationDomain;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class e implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f219860a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocationDomain f219861b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f219862c;

    public e(String query, LocationDomain locationDomain, Data data) {
        Intrinsics.checkNotNullParameter(query, "query");
        Intrinsics.checkNotNullParameter(data, "data");
        this.f219860a = query;
        this.f219861b = locationDomain;
        this.f219862c = data;
    }

    public static e a(e eVar, String query, LocationDomain locationDomain, Data data, int i) {
        if ((i & 1) != 0) {
            query = eVar.f219860a;
        }
        if ((i & 2) != 0) {
            locationDomain = eVar.f219861b;
        }
        if ((i & 4) != 0) {
            data = eVar.f219862c;
        }
        eVar.getClass();
        Intrinsics.checkNotNullParameter(query, "query");
        Intrinsics.checkNotNullParameter(data, "data");
        return new e(query, locationDomain, data);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f219860a, eVar.f219860a) && Intrinsics.f(this.f219861b, eVar.f219861b) && Intrinsics.f(this.f219862c, eVar.f219862c);
    }

    public final int hashCode() {
        int iHashCode = this.f219860a.hashCode() * 31;
        LocationDomain locationDomain = this.f219861b;
        return this.f219862c.hashCode() + ((iHashCode + (locationDomain == null ? 0 : locationDomain.hashCode())) * 31);
    }
}
