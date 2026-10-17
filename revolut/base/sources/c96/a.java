package c96;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f22299a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f22300b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f22301c;
    public final String d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f22302g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f22303h;
    public final String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f22304j;
    public final String k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f22305l;

    public a(String firstName, String lastName, String address, String zip, String routingNumber, String accountNumber, String addressLine1, String addressLine2, String city, String region, String postalCode, String country) {
        Intrinsics.checkNotNullParameter(firstName, "firstName");
        Intrinsics.checkNotNullParameter(lastName, "lastName");
        Intrinsics.checkNotNullParameter(address, "address");
        Intrinsics.checkNotNullParameter(zip, "zip");
        Intrinsics.checkNotNullParameter(routingNumber, "routingNumber");
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Intrinsics.checkNotNullParameter("Metropolitan Commercial Bank", "bankName");
        Intrinsics.checkNotNullParameter("99 Park Ave, New York, NY 10016", "bankAddress");
        Intrinsics.checkNotNullParameter("123", "checkDigits");
        Intrinsics.checkNotNullParameter(addressLine1, "addressLine1");
        Intrinsics.checkNotNullParameter(addressLine2, "addressLine2");
        Intrinsics.checkNotNullParameter(city, "city");
        Intrinsics.checkNotNullParameter(region, "region");
        Intrinsics.checkNotNullParameter(postalCode, "postalCode");
        Intrinsics.checkNotNullParameter(country, "country");
        this.f22299a = firstName;
        this.f22300b = lastName;
        this.f22301c = address;
        this.d = zip;
        this.e = routingNumber;
        this.f = accountNumber;
        this.f22302g = addressLine1;
        this.f22303h = addressLine2;
        this.i = city;
        this.f22304j = region;
        this.k = postalCode;
        this.f22305l = country;
    }

    public final String a() {
        return com.google.android.gms.internal.mlkit_vision_face.a.o(this.f22299a, " ", this.f22300b);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.f22299a.equals(aVar.f22299a) && this.f22300b.equals(aVar.f22300b) && this.f22301c.equals(aVar.f22301c) && this.d.equals(aVar.d) && this.e.equals(aVar.e) && this.f.equals(aVar.f) && this.f22302g.equals(aVar.f22302g) && this.f22303h.equals(aVar.f22303h) && this.i.equals(aVar.i) && this.f22304j.equals(aVar.f22304j) && this.k.equals(aVar.k) && this.f22305l.equals(aVar.f22305l);
    }

    public final int hashCode() {
        return this.f22305l.hashCode() + p.a.c(p.a.c(p.a.c(p.a.c(p.a.c((((((((this.f.hashCode() + p.a.c(p.a.c(p.a.c(p.a.c(this.f22299a.hashCode() * 31, 31, this.f22300b), 31, this.f22301c), 31, this.d), 31, this.e)) * 31) + 771698814) * 31) + 179294354) * 31) + 48690) * 31, 31, this.f22302g), 31, this.f22303h), 31, this.i), 31, this.f22304j), 31, this.k);
    }
}
