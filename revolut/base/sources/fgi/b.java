package fgi;

import com.revolut.feature_travel_hotels_models.property.Address;
import com.revolut.feature_travel_hotels_models.property.HotelsInventoryProviderLogos;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f135075a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f135076b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HotelsInventoryProviderLogos f135077c;
    public final Address d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f135078g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final c f135079h;

    public b(a id10, String name, HotelsInventoryProviderLogos hotelsInventoryProviderLogos, Address address, String str, String str2, String str3, c cVar) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(address, "address");
        this.f135075a = id10;
        this.f135076b = name;
        this.f135077c = hotelsInventoryProviderLogos;
        this.d = address;
        this.e = str;
        this.f = str2;
        this.f135078g = str3;
        this.f135079h = cVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return this.f135075a == bVar.f135075a && Intrinsics.f(this.f135076b, bVar.f135076b) && Intrinsics.f(this.f135077c, bVar.f135077c) && Intrinsics.f(this.d, bVar.d) && Intrinsics.f(this.e, bVar.e) && Intrinsics.f(this.f, bVar.f) && Intrinsics.f(this.f135078g, bVar.f135078g) && Intrinsics.f(this.f135079h, bVar.f135079h);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f135075a.hashCode() * 31, 31, this.f135076b);
        HotelsInventoryProviderLogos hotelsInventoryProviderLogos = this.f135077c;
        int iHashCode = (this.d.hashCode() + ((iC + (hotelsInventoryProviderLogos == null ? 0 : hotelsInventoryProviderLogos.hashCode())) * 31)) * 31;
        String str = this.e;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f135078g;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        c cVar = this.f135079h;
        return iHashCode4 + (cVar != null ? cVar.hashCode() : 0);
    }
}
