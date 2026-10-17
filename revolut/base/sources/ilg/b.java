package ilg;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f162234a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f162235b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f162236c;
    public final a d;
    public final a e;
    public final a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final a f162237g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final a f162238h;

    public b() {
        this(0);
    }

    public static b a(b bVar, a aVar, a aVar2, a aVar3, a aVar4, a aVar5, a aVar6, a aVar7, a aVar8, int i) {
        if ((i & 1) != 0) {
            aVar = bVar.f162234a;
        }
        a firstName = aVar;
        if ((i & 2) != 0) {
            aVar2 = bVar.f162235b;
        }
        a companyName = aVar2;
        if ((i & 4) != 0) {
            aVar3 = bVar.f162236c;
        }
        a lastName = aVar3;
        if ((i & 8) != 0) {
            aVar4 = bVar.d;
        }
        a address = aVar4;
        if ((i & 16) != 0) {
            aVar5 = bVar.e;
        }
        a apartmentSuite = aVar5;
        if ((i & 32) != 0) {
            aVar6 = bVar.f;
        }
        a city = aVar6;
        a state = (i & 64) != 0 ? bVar.f162237g : aVar7;
        a zipCode = (i & 128) != 0 ? bVar.f162238h : aVar8;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(firstName, "firstName");
        Intrinsics.checkNotNullParameter(companyName, "companyName");
        Intrinsics.checkNotNullParameter(lastName, "lastName");
        Intrinsics.checkNotNullParameter(address, "address");
        Intrinsics.checkNotNullParameter(apartmentSuite, "apartmentSuite");
        Intrinsics.checkNotNullParameter(city, "city");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(zipCode, "zipCode");
        return new b(firstName, companyName, lastName, address, apartmentSuite, city, state, zipCode);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f162234a, bVar.f162234a) && Intrinsics.f(this.f162235b, bVar.f162235b) && Intrinsics.f(this.f162236c, bVar.f162236c) && Intrinsics.f(this.d, bVar.d) && Intrinsics.f(this.e, bVar.e) && Intrinsics.f(this.f, bVar.f) && Intrinsics.f(this.f162237g, bVar.f162237g) && Intrinsics.f(this.f162238h, bVar.f162238h);
    }

    public final int hashCode() {
        return this.f162238h.f162233a.hashCode() + p.a.c(p.a.c(p.a.c(p.a.c(p.a.c(p.a.c(this.f162234a.f162233a.hashCode() * 31, 31, this.f162235b.f162233a), 31, this.f162236c.f162233a), 31, this.d.f162233a), 31, this.e.f162233a), 31, this.f.f162233a), 31, this.f162237g.f162233a);
    }

    public b(a firstName, a companyName, a lastName, a address, a apartmentSuite, a city, a state, a zipCode) {
        Intrinsics.checkNotNullParameter(firstName, "firstName");
        Intrinsics.checkNotNullParameter(companyName, "companyName");
        Intrinsics.checkNotNullParameter(lastName, "lastName");
        Intrinsics.checkNotNullParameter(address, "address");
        Intrinsics.checkNotNullParameter(apartmentSuite, "apartmentSuite");
        Intrinsics.checkNotNullParameter(city, "city");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(zipCode, "zipCode");
        this.f162234a = firstName;
        this.f162235b = companyName;
        this.f162236c = lastName;
        this.d = address;
        this.e = apartmentSuite;
        this.f = city;
        this.f162237g = state;
        this.f162238h = zipCode;
    }

    public /* synthetic */ b(int i) {
        this(new a(0), new a(0), new a(0), new a(0), new a(0), new a(0), new a(0), new a(0));
    }
}
