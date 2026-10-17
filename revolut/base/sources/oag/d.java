package oag;

import com.revolut.feature_travel_hotels_models.location.HotelsLocation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HotelsLocation f223616a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f223617b;

    public d(HotelsLocation hotelsLocation, int i) {
        Intrinsics.checkNotNullParameter(hotelsLocation, "hotelsLocation");
        this.f223616a = hotelsLocation;
        this.f223617b = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f223616a, dVar.f223616a) && this.f223617b == dVar.f223617b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f223617b) + (this.f223616a.hashCode() * 31);
    }
}
