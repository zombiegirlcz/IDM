package qo5;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f248026a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f248027b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f248028c;
    public final String d;
    public final String e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f248029g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f248030h;
    public final List i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f248031j;
    public final j k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f248032l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ep5.c f248033m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final long f248034n;
    public final c o;

    public d(String id10, String str, String currency, String address, String str2, boolean z, String status, String str3, List flags, boolean z3, j jVar, boolean z4, ep5.c cVar, long j2, c cVar2) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(address, "address");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(flags, "flags");
        this.f248026a = id10;
        this.f248027b = str;
        this.f248028c = currency;
        this.d = address;
        this.e = str2;
        this.f = z;
        this.f248029g = status;
        this.f248030h = str3;
        this.i = flags;
        this.f248031j = z3;
        this.k = jVar;
        this.f248032l = z4;
        this.f248033m = cVar;
        this.f248034n = j2;
        this.o = cVar2;
    }

    public final String a() {
        return this.d;
    }

    public final String b() {
        return this.f248030h;
    }

    public final c c() {
        return this.o;
    }

    public final long d() {
        return this.f248034n;
    }

    public final String e() {
        return this.f248028c;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f248026a, dVar.f248026a) && Intrinsics.f(this.f248027b, dVar.f248027b) && Intrinsics.f(this.f248028c, dVar.f248028c) && Intrinsics.f(this.d, dVar.d) && Intrinsics.f(this.e, dVar.e) && this.f == dVar.f && Intrinsics.f(this.f248029g, dVar.f248029g) && Intrinsics.f(this.f248030h, dVar.f248030h) && Intrinsics.f(this.i, dVar.i) && this.f248031j == dVar.f248031j && Intrinsics.f(this.k, dVar.k) && this.f248032l == dVar.f248032l && Intrinsics.f(this.f248033m, dVar.f248033m) && this.f248034n == dVar.f248034n && Intrinsics.f(this.o, dVar.o);
    }

    public final String f() {
        return this.f248027b;
    }

    public final String g() {
        return this.e;
    }

    public final List h() {
        return this.i;
    }

    public final int hashCode() {
        int iHashCode = this.f248026a.hashCode() * 31;
        String str = this.f248027b;
        int iC = p.a.c(p.a.c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f248028c), 31, this.d);
        String str2 = this.e;
        int iC2 = p.a.c(j6.a.c((iC + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.f), 31, this.f248029g);
        String str3 = this.f248030h;
        int iC3 = j6.a.c(p.a.d((iC2 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.i), 31, this.f248031j);
        j jVar = this.k;
        int iC4 = j6.a.c((iC3 + (jVar == null ? 0 : jVar.hashCode())) * 31, 31, this.f248032l);
        ep5.c cVar = this.f248033m;
        int iC5 = a0.d.c((iC4 + (cVar == null ? 0 : cVar.hashCode())) * 31, 31, this.f248034n);
        c cVar2 = this.o;
        return iC5 + (cVar2 != null ? cVar2.hashCode() : 0);
    }

    public final boolean i() {
        return this.f;
    }

    public final String j() {
        return this.f248026a;
    }

    public final ep5.c k() {
        return this.f248033m;
    }

    public final j l() {
        return this.k;
    }

    public final String m() {
        return this.f248029g;
    }

    public final boolean n() {
        return this.f248031j;
    }

    public final boolean o() {
        return this.f248032l;
    }
}
