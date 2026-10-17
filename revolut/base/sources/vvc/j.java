package vvc;

import com.revolut.feature.location.api.domain.models.location.LocationDomain;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class j implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocationDomain f292513a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f292514b;

    public j(LocationDomain location, int i) {
        Intrinsics.checkNotNullParameter(location, "location");
        this.f292513a = location;
        this.f292514b = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f292513a, jVar.f292513a) && this.f292514b == jVar.f292514b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f292514b) + (this.f292513a.hashCode() * 31);
    }
}
