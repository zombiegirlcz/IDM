package zm3;

import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class j extends l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f323359a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f323360b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f323361c;
    public final String d;
    public final k e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f323362g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f323363h;
    public final do3.b i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final h f323364j;
    public final LocalDate k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final long f323365l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f323366m;

    public j(String legalName, String firstName, String lastName, String str, k type, String code, String username, String country, do3.b appMode, h hVar, LocalDate localDate, long j2, int i) {
        Intrinsics.checkNotNullParameter(legalName, "legalName");
        Intrinsics.checkNotNullParameter(firstName, "firstName");
        Intrinsics.checkNotNullParameter(lastName, "lastName");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(username, "username");
        Intrinsics.checkNotNullParameter(country, "country");
        Intrinsics.checkNotNullParameter(appMode, "appMode");
        this.f323359a = legalName;
        this.f323360b = firstName;
        this.f323361c = lastName;
        this.d = str;
        this.e = type;
        this.f = code;
        this.f323362g = username;
        this.f323363h = country;
        this.i = appMode;
        this.f323364j = hVar;
        this.k = localDate;
        this.f323365l = j2;
        this.f323366m = i;
    }

    public static j e(j jVar, String str, String str2, String str3, do3.b bVar, long j2, int i, int i2) {
        String legalName = jVar.f323359a;
        String firstName = (i2 & 2) != 0 ? jVar.f323360b : str;
        String lastName = (i2 & 4) != 0 ? jVar.f323361c : str2;
        String str4 = jVar.d;
        k type = jVar.e;
        String code = jVar.f;
        String username = jVar.f323362g;
        String country = (i2 & 128) != 0 ? jVar.f323363h : str3;
        do3.b appMode = (i2 & 256) != 0 ? jVar.i : bVar;
        h hVar = jVar.f323364j;
        LocalDate localDate = jVar.k;
        long j3 = (i2 & 2048) != 0 ? jVar.f323365l : j2;
        int i3 = (i2 & 4096) != 0 ? jVar.f323366m : i;
        jVar.getClass();
        Intrinsics.checkNotNullParameter(legalName, "legalName");
        Intrinsics.checkNotNullParameter(firstName, "firstName");
        Intrinsics.checkNotNullParameter(lastName, "lastName");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(username, "username");
        Intrinsics.checkNotNullParameter(country, "country");
        Intrinsics.checkNotNullParameter(appMode, "appMode");
        return new j(legalName, firstName, lastName, str4, type, code, username, country, appMode, hVar, localDate, j3, i3);
    }

    @Override // zm3.l
    public final String N0() {
        return this.f323362g;
    }

    @Override // zm3.a
    public final long a() {
        return this.f323365l;
    }

    @Override // zm3.a
    public final int b() {
        return this.f323366m;
    }

    @Override // zm3.l
    public final LocalDate c() {
        return this.k;
    }

    @Override // zm3.l
    public final h d() {
        return this.f323364j;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f323359a, jVar.f323359a) && Intrinsics.f(this.f323360b, jVar.f323360b) && Intrinsics.f(this.f323361c, jVar.f323361c) && Intrinsics.f(this.d, jVar.d) && this.e == jVar.e && Intrinsics.f(this.f, jVar.f) && Intrinsics.f(this.f323362g, jVar.f323362g) && Intrinsics.f(this.f323363h, jVar.f323363h) && this.i == jVar.i && this.f323364j == jVar.f323364j && Intrinsics.f(this.k, jVar.k) && this.f323365l == jVar.f323365l && this.f323366m == jVar.f323366m;
    }

    public final k f() {
        return this.e;
    }

    @Override // zm3.l
    public final String getCode() {
        return this.f;
    }

    @Override // zm3.l
    public final String getCountry() {
        return this.f323363h;
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(this.f323359a.hashCode() * 31, 31, this.f323360b), 31, this.f323361c);
        String str = this.d;
        int iHashCode = (this.i.hashCode() + p.a.c(p.a.c(p.a.c((this.e.hashCode() + ((iC + (str == null ? 0 : str.hashCode())) * 31)) * 31, 31, this.f), 31, this.f323362g), 31, this.f323363h)) * 31;
        h hVar = this.f323364j;
        int iHashCode2 = (iHashCode + (hVar == null ? 0 : hVar.hashCode())) * 31;
        LocalDate localDate = this.k;
        return Integer.hashCode(this.f323366m) + a0.d.c((iHashCode2 + (localDate != null ? localDate.hashCode() : 0)) * 31, 31, this.f323365l);
    }

    public /* synthetic */ j(String str, String str2, String str3, String str4, k kVar, String str5, String str6, String str7, do3.b bVar, h hVar, LocalDate localDate) {
        this(str, str2, str3, str4, kVar, str5, str6, str7, bVar, hVar, localDate, 0L, 0);
    }
}
