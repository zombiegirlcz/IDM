package vvc;

import com.revolut.feature.location.api.domain.models.location.LocationDomain;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class e implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ah0.a f292506a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocationDomain f292507b;

    public e(ah0.a latLong) {
        Intrinsics.checkNotNullParameter(latLong, "latLong");
        this.f292506a = latLong;
        this.f292507b = new LocationDomain(latLong.f4847a, latLong.f4848b);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f292506a, ((e) obj2).f292506a);
    }

    @Override // vvc.f
    public final LocationDomain getLocation() {
        return this.f292507b;
    }

    public final int hashCode() {
        return this.f292506a.hashCode();
    }
}
