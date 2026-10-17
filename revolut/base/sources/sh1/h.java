package sh1;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f263346a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f263347b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g f263348c;
    public final g d;
    public final g e;
    public final g f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final g f263349g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final g f263350h;
    public final g i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final g f263351j;
    public final g k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final g f263352l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final g f263353m;

    public h(g country, g postcode, g city, g region, g neighbourhood, g streetType, g streetName, g houseNumber, g houseName, g flatNumber, g streetLine1, g streetLine2, g landmark) {
        Intrinsics.checkNotNullParameter(country, "country");
        Intrinsics.checkNotNullParameter(postcode, "postcode");
        Intrinsics.checkNotNullParameter(city, "city");
        Intrinsics.checkNotNullParameter(region, "region");
        Intrinsics.checkNotNullParameter(neighbourhood, "neighbourhood");
        Intrinsics.checkNotNullParameter(streetType, "streetType");
        Intrinsics.checkNotNullParameter(streetName, "streetName");
        Intrinsics.checkNotNullParameter(houseNumber, "houseNumber");
        Intrinsics.checkNotNullParameter(houseName, "houseName");
        Intrinsics.checkNotNullParameter(flatNumber, "flatNumber");
        Intrinsics.checkNotNullParameter(streetLine1, "streetLine1");
        Intrinsics.checkNotNullParameter(streetLine2, "streetLine2");
        Intrinsics.checkNotNullParameter(landmark, "landmark");
        this.f263346a = country;
        this.f263347b = postcode;
        this.f263348c = city;
        this.d = region;
        this.e = neighbourhood;
        this.f = streetType;
        this.f263349g = streetName;
        this.f263350h = houseNumber;
        this.i = houseName;
        this.f263351j = flatNumber;
        this.k = streetLine1;
        this.f263352l = streetLine2;
        this.f263353m = landmark;
    }

    public static h a(h hVar, g gVar, g city, g region, g neighbourhood, g streetType, g streetName, g houseNumber, g houseName, g flatNumber, g streetLine1, g streetLine2, g gVar2, int i) {
        g postcode = gVar;
        g country = hVar.f263346a;
        if ((i & 2) != 0) {
            postcode = hVar.f263347b;
        }
        if ((i & 4) != 0) {
            city = hVar.f263348c;
        }
        if ((i & 8) != 0) {
            region = hVar.d;
        }
        if ((i & 16) != 0) {
            neighbourhood = hVar.e;
        }
        if ((i & 32) != 0) {
            streetType = hVar.f;
        }
        if ((i & 64) != 0) {
            streetName = hVar.f263349g;
        }
        if ((i & 128) != 0) {
            houseNumber = hVar.f263350h;
        }
        if ((i & 256) != 0) {
            houseName = hVar.i;
        }
        if ((i & 512) != 0) {
            flatNumber = hVar.f263351j;
        }
        if ((i & 1024) != 0) {
            streetLine1 = hVar.k;
        }
        if ((i & 2048) != 0) {
            streetLine2 = hVar.f263352l;
        }
        if ((i & 4096) != 0) {
            gVar2 = hVar.f263353m;
        }
        g landmark = gVar2;
        hVar.getClass();
        Intrinsics.checkNotNullParameter(country, "country");
        Intrinsics.checkNotNullParameter(postcode, "postcode");
        Intrinsics.checkNotNullParameter(city, "city");
        Intrinsics.checkNotNullParameter(region, "region");
        Intrinsics.checkNotNullParameter(neighbourhood, "neighbourhood");
        Intrinsics.checkNotNullParameter(streetType, "streetType");
        Intrinsics.checkNotNullParameter(streetName, "streetName");
        Intrinsics.checkNotNullParameter(houseNumber, "houseNumber");
        Intrinsics.checkNotNullParameter(houseName, "houseName");
        Intrinsics.checkNotNullParameter(flatNumber, "flatNumber");
        Intrinsics.checkNotNullParameter(streetLine1, "streetLine1");
        Intrinsics.checkNotNullParameter(streetLine2, "streetLine2");
        Intrinsics.checkNotNullParameter(landmark, "landmark");
        g gVar3 = streetLine2;
        g gVar4 = streetLine1;
        g gVar5 = flatNumber;
        g gVar6 = houseName;
        g gVar7 = houseNumber;
        g gVar8 = streetName;
        g gVar9 = streetType;
        g gVar10 = neighbourhood;
        g gVar11 = region;
        return new h(country, postcode, city, gVar11, gVar10, gVar9, gVar8, gVar7, gVar6, gVar5, gVar4, gVar3, landmark);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f263346a, hVar.f263346a) && Intrinsics.f(this.f263347b, hVar.f263347b) && Intrinsics.f(this.f263348c, hVar.f263348c) && Intrinsics.f(this.d, hVar.d) && Intrinsics.f(this.e, hVar.e) && Intrinsics.f(this.f, hVar.f) && Intrinsics.f(this.f263349g, hVar.f263349g) && Intrinsics.f(this.f263350h, hVar.f263350h) && Intrinsics.f(this.i, hVar.i) && Intrinsics.f(this.f263351j, hVar.f263351j) && Intrinsics.f(this.k, hVar.k) && Intrinsics.f(this.f263352l, hVar.f263352l) && Intrinsics.f(this.f263353m, hVar.f263353m);
    }

    public final int hashCode() {
        return this.f263353m.hashCode() + ((this.f263352l.hashCode() + ((this.k.hashCode() + ((this.f263351j.hashCode() + ((this.i.hashCode() + ((this.f263350h.hashCode() + ((this.f263349g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.f263348c.hashCode() + ((this.f263347b.hashCode() + (this.f263346a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ h(g gVar, g gVar2, g gVar3, g gVar4, g gVar5, g gVar6, g gVar7, g gVar8, g gVar9, g gVar10, g gVar11, g gVar12, g gVar13, int i) {
        int i2 = 6;
        a aVar = null;
        String str = "";
        this(gVar, gVar2, gVar3, gVar4, gVar5, (i & 32) != 0 ? new g(str, aVar, i2) : gVar6, gVar7, gVar8, (i & 256) != 0 ? new g(str, aVar, i2) : gVar9, gVar10, gVar11, gVar12, (i & 4096) != 0 ? new g(str, aVar, i2) : gVar13);
    }
}
