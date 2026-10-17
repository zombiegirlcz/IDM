package ar9;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8549a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f8550b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f8551c;
    public final String d;
    public final n e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f8552g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f8553h;
    public final jo3.b i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f8554j;
    public final String k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f8555l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f8556m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final List f8557n;
    public final String o;

    public j(String id10, String groupId, String ownerId, String createdBy, n type, String title, long j2, String currencyCode, jo3.b bVar, long j3, String str, String str2, String str3, List list, String str4) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        Intrinsics.checkNotNullParameter(ownerId, "ownerId");
        Intrinsics.checkNotNullParameter(createdBy, "createdBy");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(currencyCode, "currencyCode");
        this.f8549a = id10;
        this.f8550b = groupId;
        this.f8551c = ownerId;
        this.d = createdBy;
        this.e = type;
        this.f = title;
        this.f8552g = j2;
        this.f8553h = currencyCode;
        this.i = bVar;
        this.f8554j = j3;
        this.k = str;
        this.f8555l = str2;
        this.f8556m = str3;
        this.f8557n = list;
        this.o = str4;
    }

    public final long a() {
        return this.f8552g;
    }

    public final String b() {
        return this.d;
    }

    public final long c() {
        return this.f8554j;
    }

    public final String d() {
        return this.f8553h;
    }

    public final jo3.b e() {
        return this.i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f8549a, jVar.f8549a) && Intrinsics.f(this.f8550b, jVar.f8550b) && Intrinsics.f(this.f8551c, jVar.f8551c) && Intrinsics.f(this.d, jVar.d) && this.e == jVar.e && Intrinsics.f(this.f, jVar.f) && this.f8552g == jVar.f8552g && Intrinsics.f(this.f8553h, jVar.f8553h) && Intrinsics.f(this.i, jVar.i) && this.f8554j == jVar.f8554j && Intrinsics.f(this.k, jVar.k) && Intrinsics.f(this.f8555l, jVar.f8555l) && Intrinsics.f(this.f8556m, jVar.f8556m) && Intrinsics.f(this.f8557n, jVar.f8557n) && Intrinsics.f(this.o, jVar.o);
    }

    public final String f() {
        return this.f8550b;
    }

    public final String g() {
        return this.f8549a;
    }

    public final List h() {
        return this.f8557n;
    }

    public final int hashCode() {
        int iC = p.a.c(a0.d.c(p.a.c((this.e.hashCode() + p.a.c(p.a.c(p.a.c(this.f8549a.hashCode() * 31, 31, this.f8550b), 31, this.f8551c), 31, this.d)) * 31, 31, this.f), 31, this.f8552g), 31, this.f8553h);
        jo3.b bVar = this.i;
        int iC2 = a0.d.c((iC + (bVar == null ? 0 : bVar.hashCode())) * 31, 31, this.f8554j);
        String str = this.k;
        int iHashCode = (iC2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f8555l;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f8556m;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List list = this.f8557n;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        String str4 = this.o;
        return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String i() {
        return this.f8551c;
    }

    public final String j() {
        return this.o;
    }

    public final String k() {
        return this.f;
    }

    public final String l() {
        return this.f8555l;
    }

    public final String m() {
        return this.k;
    }

    public final String n() {
        return this.f8556m;
    }

    public final n o() {
        return this.e;
    }
}
