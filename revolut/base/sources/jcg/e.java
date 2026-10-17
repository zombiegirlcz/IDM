package jcg;

import com.revolut.feature_travel_hotels_models.location.HotelsLocation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class e extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HotelsLocation f172797a;

    public e(HotelsLocation hotelsLocation) {
        Intrinsics.checkNotNullParameter(hotelsLocation, "hotelsLocation");
        this.f172797a = hotelsLocation;
    }

    @Override // jcg.f
    public final String a() {
        return this.f172797a.e;
    }

    @Override // jcg.f
    public final String b() {
        return this.f172797a.f97955c;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f172797a, ((e) obj2).f172797a);
    }

    public final int hashCode() {
        return this.f172797a.hashCode();
    }
}
