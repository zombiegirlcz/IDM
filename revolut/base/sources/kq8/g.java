package kq8;

import hha.w0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f188345a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f188346b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f188347c;
    public final String d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final do3.c f188348g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final w0 f188349h;

    public g(do3.c type, w0 w0Var, String counterpartyId, String firstName, String lastName, String code, String username, boolean z) {
        Intrinsics.checkNotNullParameter(counterpartyId, "counterpartyId");
        Intrinsics.checkNotNullParameter(firstName, "firstName");
        Intrinsics.checkNotNullParameter(lastName, "lastName");
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(username, "username");
        Intrinsics.checkNotNullParameter(type, "type");
        this.f188345a = counterpartyId;
        this.f188346b = z;
        this.f188347c = firstName;
        this.d = lastName;
        this.e = code;
        this.f = username;
        this.f188348g = type;
        this.f188349h = w0Var;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f188345a, gVar.f188345a) && this.f188346b == gVar.f188346b && Intrinsics.f(this.f188347c, gVar.f188347c) && Intrinsics.f(this.d, gVar.d) && Intrinsics.f(this.e, gVar.e) && Intrinsics.f(this.f, gVar.f) && this.f188348g == gVar.f188348g && this.f188349h == gVar.f188349h;
    }

    public final int hashCode() {
        int iHashCode = (this.f188348g.hashCode() + p.a.c(p.a.c(p.a.c(p.a.c(j6.a.c(this.f188345a.hashCode() * 31, 31, this.f188346b), 31, this.f188347c), 31, this.d), 31, this.e), 31, this.f)) * 31;
        w0 w0Var = this.f188349h;
        return iHashCode + (w0Var == null ? 0 : w0Var.hashCode());
    }
}
