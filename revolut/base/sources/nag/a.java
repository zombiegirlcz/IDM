package nag;

import com.revolut.feature_travel_hotels_models.amenity.HotelsAmenity;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final oei.b f213900a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HotelsAmenity f213901b;

    public a(oei.b category, HotelsAmenity amenity) {
        Intrinsics.checkNotNullParameter(category, "category");
        Intrinsics.checkNotNullParameter(amenity, "amenity");
        this.f213900a = category;
        this.f213901b = amenity;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.f213900a == aVar.f213900a && Intrinsics.f(this.f213901b, aVar.f213901b);
    }

    public final int hashCode() {
        return this.f213901b.hashCode() + (this.f213900a.hashCode() * 31);
    }
}
