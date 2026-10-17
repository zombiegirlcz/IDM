package sq8;

import hha.w0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f265024a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f265025b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f265026c;
    public final String d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f265027g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final do3.c f265028h;
    public final w0 i;

    public d(String juniorId, String counterpartyId, String firstName, String lastName, String code, String username, boolean z, do3.c type, w0 w0Var) {
        Intrinsics.checkNotNullParameter(juniorId, "juniorId");
        Intrinsics.checkNotNullParameter(counterpartyId, "counterpartyId");
        Intrinsics.checkNotNullParameter(firstName, "firstName");
        Intrinsics.checkNotNullParameter(lastName, "lastName");
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(username, "username");
        Intrinsics.checkNotNullParameter(type, "type");
        this.f265024a = juniorId;
        this.f265025b = counterpartyId;
        this.f265026c = firstName;
        this.d = lastName;
        this.e = code;
        this.f = username;
        this.f265027g = z;
        this.f265028h = type;
        this.i = w0Var;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f265024a, dVar.f265024a) && Intrinsics.f(this.f265025b, dVar.f265025b) && Intrinsics.f(this.f265026c, dVar.f265026c) && Intrinsics.f(this.d, dVar.d) && Intrinsics.f(this.e, dVar.e) && Intrinsics.f(this.f, dVar.f) && this.f265027g == dVar.f265027g && this.f265028h == dVar.f265028h && this.i == dVar.i;
    }

    public final int hashCode() {
        int iHashCode = (this.f265028h.hashCode() + j6.a.c(p.a.c(p.a.c(p.a.c(p.a.c(p.a.c(this.f265024a.hashCode() * 31, 31, this.f265025b), 31, this.f265026c), 31, this.d), 31, this.e), 31, this.f), 31, this.f265027g)) * 31;
        w0 w0Var = this.i;
        return iHashCode + (w0Var == null ? 0 : w0Var.hashCode());
    }
}
