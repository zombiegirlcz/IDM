package v61;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class p implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f286310a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f286311b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f286312c;
    public final String d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final wi0.b f286313g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final do3.b f286314h;
    public final do3.c i;

    public p(String id10, String firstName, String lastName, String str, String code, String username, wi0.b country, do3.b appMode, do3.c customerType) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(firstName, "firstName");
        Intrinsics.checkNotNullParameter(lastName, "lastName");
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(username, "username");
        Intrinsics.checkNotNullParameter(country, "country");
        Intrinsics.checkNotNullParameter(appMode, "appMode");
        Intrinsics.checkNotNullParameter(customerType, "customerType");
        this.f286310a = id10;
        this.f286311b = firstName;
        this.f286312c = lastName;
        this.d = str;
        this.e = code;
        this.f = username;
        this.f286313g = country;
        this.f286314h = appMode;
        this.i = customerType;
    }

    public final String N0() {
        return this.f;
    }

    public final do3.b a() {
        return this.f286314h;
    }

    public final wi0.b b() {
        return this.f286313g;
    }

    public final do3.c c() {
        return this.i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p)) {
            return false;
        }
        p pVar = (p) obj2;
        return Intrinsics.f(this.f286310a, pVar.f286310a) && Intrinsics.f(this.f286311b, pVar.f286311b) && Intrinsics.f(this.f286312c, pVar.f286312c) && Intrinsics.f(this.d, pVar.d) && Intrinsics.f(this.e, pVar.e) && Intrinsics.f(this.f, pVar.f) && Intrinsics.f(this.f286313g, pVar.f286313g) && this.f286314h == pVar.f286314h && this.i == pVar.i;
    }

    public final String getCode() {
        return this.e;
    }

    public final String getFirstName() {
        return this.f286311b;
    }

    public final String getLastName() {
        return this.f286312c;
    }

    public final String getLegalName() {
        return this.d;
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(this.f286310a.hashCode() * 31, 31, this.f286311b), 31, this.f286312c);
        String str = this.d;
        return this.i.hashCode() + ((this.f286314h.hashCode() + p.a.c(p.a.c(p.a.c((iC + (str == null ? 0 : str.hashCode())) * 31, 31, this.e), 31, this.f), 31, this.f286313g.f297794a)) * 31);
    }
}
