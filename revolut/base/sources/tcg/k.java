package tcg;

import com.revolut.feature_travel_hotels_models.property.HotelsProperty;
import com.revolut.feature_travel_hotels_models.property.search.PropertyType;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class k extends m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PropertyType f269793a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HotelsProperty f269794b;

    public k(PropertyType propertyType, HotelsProperty property) {
        Intrinsics.checkNotNullParameter(propertyType, "propertyType");
        Intrinsics.checkNotNullParameter(property, "property");
        this.f269793a = propertyType;
        this.f269794b = property;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f269793a, kVar.f269793a) && Intrinsics.f(this.f269794b, kVar.f269794b);
    }

    public final int hashCode() {
        return this.f269794b.hashCode() + (this.f269793a.hashCode() * 31);
    }
}
