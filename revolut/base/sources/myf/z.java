package myf;

import com.revolut.feature_travel_hotels_models.location.Coordinates;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f210495a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Coordinates f210496b;

    public z(Integer num, Coordinates coordinates) {
        this.f210495a = num;
        this.f210496b = coordinates;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof z)) {
            return false;
        }
        z zVar = (z) obj2;
        return Intrinsics.f(this.f210495a, zVar.f210495a) && Intrinsics.f(this.f210496b, zVar.f210496b);
    }

    public final int hashCode() {
        Integer num = this.f210495a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Coordinates coordinates = this.f210496b;
        return iHashCode + (coordinates != null ? coordinates.hashCode() : 0);
    }
}
