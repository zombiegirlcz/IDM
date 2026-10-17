package n91;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f213528a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f213529b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f213530c;
    public final String d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f213531g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f213532h;
    public final String i;

    public b(long j2, String id10, String name, String currency, String date, String str, String type, String state, String str2) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(date, "date");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(state, "state");
        this.f213528a = id10;
        this.f213529b = name;
        this.f213530c = j2;
        this.d = currency;
        this.e = date;
        this.f = str;
        this.f213531g = type;
        this.f213532h = state;
        this.i = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f213528a, bVar.f213528a) && Intrinsics.f(this.f213529b, bVar.f213529b) && this.f213530c == bVar.f213530c && Intrinsics.f(this.d, bVar.d) && Intrinsics.f(this.e, bVar.e) && Intrinsics.f(this.f, bVar.f) && Intrinsics.f(this.f213531g, bVar.f213531g) && Intrinsics.f(this.f213532h, bVar.f213532h) && Intrinsics.f(this.i, bVar.i);
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(a0.d.c(p.a.c(this.f213528a.hashCode() * 31, 31, this.f213529b), 31, this.f213530c), 31, this.d), 31, this.e);
        String str = this.f;
        int iC2 = p.a.c(p.a.c((iC + (str == null ? 0 : str.hashCode())) * 31, 31, this.f213531g), 31, this.f213532h);
        String str2 = this.i;
        return iC2 + (str2 != null ? str2.hashCode() : 0);
    }
}
