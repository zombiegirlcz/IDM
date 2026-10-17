package iy3;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class b implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f169617a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f169618b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f169619c;
    public final a d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final co3.a f169620g;

    public b(String name, String address, String phoneNumber, a website, String email, String city, co3.a location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(address, "address");
        Intrinsics.checkNotNullParameter(phoneNumber, "phoneNumber");
        Intrinsics.checkNotNullParameter(website, "website");
        Intrinsics.checkNotNullParameter(email, "email");
        Intrinsics.checkNotNullParameter(city, "city");
        Intrinsics.checkNotNullParameter(location, "location");
        this.f169617a = name;
        this.f169618b = address;
        this.f169619c = phoneNumber;
        this.d = website;
        this.e = email;
        this.f = city;
        this.f169620g = location;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f169617a, bVar.f169617a) && Intrinsics.f(this.f169618b, bVar.f169618b) && Intrinsics.f(this.f169619c, bVar.f169619c) && Intrinsics.f(this.d, bVar.d) && Intrinsics.f(this.e, bVar.e) && Intrinsics.f(this.f, bVar.f) && Intrinsics.f(this.f169620g, bVar.f169620g);
    }

    public final int hashCode() {
        return this.f169620g.hashCode() + p.a.c(p.a.c((this.d.hashCode() + p.a.c(p.a.c(this.f169617a.hashCode() * 31, 31, this.f169618b), 31, this.f169619c)) * 31, 31, this.e), 31, this.f);
    }
}
