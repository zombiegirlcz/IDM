package sh1;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f263380a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f263381b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f263382c;
    public final List d;
    public final List e;
    public final List f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f263383g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List f263384h;
    public final List i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final List f263385j;
    public final List k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final List f263386l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final List f263387m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final List f263388n;
    public final ArrayList o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final List f263389p;

    public n(List postcodeLookup, List autoCompletion, List withoutZip, List countriesWithSelectableRegion, List countriesWithoutRegionAndCity, List countriesWithoutRegion, List countriesWithMandatoryRegion, List countriesWithoutStreetLine2, List countriesWithMandatoryNeighbourhood, List countriesWithOptionalNeighbourhood, List countriesWithOptionalPostcode, List countriesWithSelectableCity, List countriesWithDetailedAddress, List countriesWithDigitalPostcode, ArrayList allCountries, List countriesWithCitySearch) {
        Intrinsics.checkNotNullParameter(postcodeLookup, "postcodeLookup");
        Intrinsics.checkNotNullParameter(autoCompletion, "autoCompletion");
        Intrinsics.checkNotNullParameter(withoutZip, "withoutZip");
        Intrinsics.checkNotNullParameter(countriesWithSelectableRegion, "countriesWithSelectableRegion");
        Intrinsics.checkNotNullParameter(countriesWithoutRegionAndCity, "countriesWithoutRegionAndCity");
        Intrinsics.checkNotNullParameter(countriesWithoutRegion, "countriesWithoutRegion");
        Intrinsics.checkNotNullParameter(countriesWithMandatoryRegion, "countriesWithMandatoryRegion");
        Intrinsics.checkNotNullParameter(countriesWithoutStreetLine2, "countriesWithoutStreetLine2");
        Intrinsics.checkNotNullParameter(countriesWithMandatoryNeighbourhood, "countriesWithMandatoryNeighbourhood");
        Intrinsics.checkNotNullParameter(countriesWithOptionalNeighbourhood, "countriesWithOptionalNeighbourhood");
        Intrinsics.checkNotNullParameter(countriesWithOptionalPostcode, "countriesWithOptionalPostcode");
        Intrinsics.checkNotNullParameter(countriesWithSelectableCity, "countriesWithSelectableCity");
        Intrinsics.checkNotNullParameter(countriesWithDetailedAddress, "countriesWithDetailedAddress");
        Intrinsics.checkNotNullParameter(countriesWithDigitalPostcode, "countriesWithDigitalPostcode");
        Intrinsics.checkNotNullParameter(allCountries, "allCountries");
        Intrinsics.checkNotNullParameter(countriesWithCitySearch, "countriesWithCitySearch");
        this.f263380a = postcodeLookup;
        this.f263381b = autoCompletion;
        this.f263382c = withoutZip;
        this.d = countriesWithSelectableRegion;
        this.e = countriesWithoutRegionAndCity;
        this.f = countriesWithoutRegion;
        this.f263383g = countriesWithMandatoryRegion;
        this.f263384h = countriesWithoutStreetLine2;
        this.i = countriesWithMandatoryNeighbourhood;
        this.f263385j = countriesWithOptionalNeighbourhood;
        this.k = countriesWithOptionalPostcode;
        this.f263386l = countriesWithSelectableCity;
        this.f263387m = countriesWithDetailedAddress;
        this.f263388n = countriesWithDigitalPostcode;
        this.o = allCountries;
        this.f263389p = countriesWithCitySearch;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return Intrinsics.f(this.f263380a, nVar.f263380a) && Intrinsics.f(this.f263381b, nVar.f263381b) && Intrinsics.f(this.f263382c, nVar.f263382c) && Intrinsics.f(this.d, nVar.d) && Intrinsics.f(this.e, nVar.e) && Intrinsics.f(this.f, nVar.f) && Intrinsics.f(this.f263383g, nVar.f263383g) && Intrinsics.f(this.f263384h, nVar.f263384h) && Intrinsics.f(this.i, nVar.i) && Intrinsics.f(this.f263385j, nVar.f263385j) && Intrinsics.f(this.k, nVar.k) && Intrinsics.f(this.f263386l, nVar.f263386l) && Intrinsics.f(this.f263387m, nVar.f263387m) && Intrinsics.f(this.f263388n, nVar.f263388n) && this.o.equals(nVar.o) && Intrinsics.f(this.f263389p, nVar.f263389p);
    }

    public final int hashCode() {
        return this.f263389p.hashCode() + com.google.android.gms.internal.mlkit_vision_face.a.b(this.o, p.a.d(p.a.d(p.a.d(p.a.d(p.a.d(p.a.d(p.a.d(p.a.d(p.a.d(p.a.d(p.a.d(p.a.d(p.a.d(this.f263380a.hashCode() * 31, 31, this.f263381b), 31, this.f263382c), 31, this.d), 31, this.e), 31, this.f), 31, this.f263383g), 31, this.f263384h), 31, this.i), 31, this.f263385j), 31, this.k), 31, this.f263386l), 31, this.f263387m), 31, this.f263388n), 31);
    }
}
