package ar9;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8586a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f8587b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x f8588c;
    public final w d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f8589g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f8590h;
    public final String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f8591j;
    public final String k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final jo3.b f8592l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final long f8593m;

    public v(String id10, String groupId, x type, w state, String str, String str2, String payerId, String payeeId, String createdBy, long j2, String currencyCode, jo3.b bVar, long j3) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(payerId, "payerId");
        Intrinsics.checkNotNullParameter(payeeId, "payeeId");
        Intrinsics.checkNotNullParameter(createdBy, "createdBy");
        Intrinsics.checkNotNullParameter(currencyCode, "currencyCode");
        this.f8586a = id10;
        this.f8587b = groupId;
        this.f8588c = type;
        this.d = state;
        this.e = str;
        this.f = str2;
        this.f8589g = payerId;
        this.f8590h = payeeId;
        this.i = createdBy;
        this.f8591j = j2;
        this.k = currencyCode;
        this.f8592l = bVar;
        this.f8593m = j3;
    }

    public final long a() {
        return this.f8591j;
    }

    public final String b() {
        return this.i;
    }

    public final long c() {
        return this.f8593m;
    }

    public final String d() {
        return this.k;
    }

    public final jo3.b e() {
        return this.f8592l;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof v)) {
            return false;
        }
        v vVar = (v) obj2;
        return Intrinsics.f(this.f8586a, vVar.f8586a) && Intrinsics.f(this.f8587b, vVar.f8587b) && this.f8588c == vVar.f8588c && this.d == vVar.d && Intrinsics.f(this.e, vVar.e) && Intrinsics.f(this.f, vVar.f) && Intrinsics.f(this.f8589g, vVar.f8589g) && Intrinsics.f(this.f8590h, vVar.f8590h) && Intrinsics.f(this.i, vVar.i) && this.f8591j == vVar.f8591j && Intrinsics.f(this.k, vVar.k) && Intrinsics.f(this.f8592l, vVar.f8592l) && this.f8593m == vVar.f8593m;
    }

    public final String f() {
        return this.f8587b;
    }

    public final String g() {
        return this.f8586a;
    }

    public final String h() {
        return this.f8590h;
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + ((this.f8588c.hashCode() + p.a.c(this.f8586a.hashCode() * 31, 31, this.f8587b)) * 31)) * 31;
        String str = this.e;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f;
        int iC = p.a.c(a0.d.c(p.a.c(p.a.c(p.a.c((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.f8589g), 31, this.f8590h), 31, this.i), 31, this.f8591j), 31, this.k);
        jo3.b bVar = this.f8592l;
        return Long.hashCode(this.f8593m) + ((iC + (bVar != null ? bVar.hashCode() : 0)) * 31);
    }

    public final String i() {
        return this.f8589g;
    }

    public final String j() {
        return this.f;
    }

    public final w k() {
        return this.d;
    }

    public final String l() {
        return this.e;
    }

    public final x m() {
        return this.f8588c;
    }
}
