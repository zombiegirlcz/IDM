package ieg;

import com.revolut.feature_travel_hotels_models.amenity.HotelsAmenity;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HotelsAmenity f160707a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f160708b;

    public a(HotelsAmenity amenity, boolean z) {
        Intrinsics.checkNotNullParameter(amenity, "amenity");
        this.f160707a = amenity;
        this.f160708b = z;
    }

    public static a a(a aVar, boolean z) {
        HotelsAmenity amenity = aVar.f160707a;
        aVar.getClass();
        Intrinsics.checkNotNullParameter(amenity, "amenity");
        return new a(amenity, z);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f160707a, aVar.f160707a) && this.f160708b == aVar.f160708b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f160708b) + (this.f160707a.hashCode() * 31);
    }
}
