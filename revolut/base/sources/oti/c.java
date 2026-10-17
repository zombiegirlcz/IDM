package oti;

import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.eac.CertificateBody;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@mlm.g
public final class c {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Lazy[] f229616h = {null, null, null, null, null, null, yhm.j.c(yhm.k.PUBLICATION, new oqj.d(10))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f229617a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f229618b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f229619c;
    public final String d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f229620g;

    public /* synthetic */ c(int i, String str, String str2, String str3, String str4, String str5, String str6, List list) {
        if (127 != (i & CertificateBody.profileType)) {
            qlm.j1.f(a.f229594a.getDescriptor(), i, CertificateBody.profileType);
            throw null;
        }
        this.f229617a = str;
        this.f229618b = str2;
        this.f229619c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.f229620g = list;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f229617a, cVar.f229617a) && Intrinsics.f(this.f229618b, cVar.f229618b) && Intrinsics.f(this.f229619c, cVar.f229619c) && Intrinsics.f(this.d, cVar.d) && Intrinsics.f(this.e, cVar.e) && Intrinsics.f(this.f, cVar.f) && Intrinsics.f(this.f229620g, cVar.f229620g);
    }

    public final int hashCode() {
        return this.f229620g.hashCode() + p.a.c(p.a.c(p.a.c(p.a.c(p.a.c(this.f229617a.hashCode() * 31, 31, this.f229618b), 31, this.f229619c), 31, this.d), 31, this.e), 31, this.f);
    }

    public c(String airportIataCode, String cipName, String airportDescription, String cityName, String countryCode, String airportTimeZone, ArrayList terminals) {
        Intrinsics.checkNotNullParameter(airportIataCode, "airportIataCode");
        Intrinsics.checkNotNullParameter(cipName, "cipName");
        Intrinsics.checkNotNullParameter(airportDescription, "airportDescription");
        Intrinsics.checkNotNullParameter(cityName, "cityName");
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        Intrinsics.checkNotNullParameter(airportTimeZone, "airportTimeZone");
        Intrinsics.checkNotNullParameter(terminals, "terminals");
        this.f229617a = airportIataCode;
        this.f229618b = cipName;
        this.f229619c = airportDescription;
        this.d = cityName;
        this.e = countryCode;
        this.f = airportTimeZone;
        this.f229620g = terminals;
    }
}
