package dgi;

import com.revolut.feature_travel_hotels_models.property.HotelsPropertyType;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class b implements ffi.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f114668a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f114669b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HotelsPropertyType f114670c;
    public final a d;

    public b(String id10, String name, HotelsPropertyType propertyType, a location) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(propertyType, "propertyType");
        Intrinsics.checkNotNullParameter(location, "location");
        this.f114668a = id10;
        this.f114669b = name;
        this.f114670c = propertyType;
        this.d = location;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f114668a, bVar.f114668a) && Intrinsics.f(this.f114669b, bVar.f114669b) && Intrinsics.f(this.f114670c, bVar.f114670c) && Intrinsics.f(this.d, bVar.d);
    }

    public final int hashCode() {
        return this.d.f114667a.hashCode() + ((this.f114670c.hashCode() + p.a.c(this.f114668a.hashCode() * 31, 31, this.f114669b)) * 31);
    }
}
