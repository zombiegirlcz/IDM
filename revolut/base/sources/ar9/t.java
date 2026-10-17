package ar9;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8581a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f8582b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final s f8583c;
    public final s d;
    public final u e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f8584g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f8585h;
    public final Boolean i;

    public t(String memberId, String groupId, s sVar, s sVar2, u type, String str, String str2, String str3, Boolean bool) {
        Intrinsics.checkNotNullParameter(memberId, "memberId");
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        Intrinsics.checkNotNullParameter(type, "type");
        this.f8581a = memberId;
        this.f8582b = groupId;
        this.f8583c = sVar;
        this.d = sVar2;
        this.e = type;
        this.f = str;
        this.f8584g = str2;
        this.f8585h = str3;
        this.i = bool;
    }

    public final s a() {
        return this.d;
    }

    public final String b() {
        return this.f8585h;
    }

    public final String c() {
        return this.f;
    }

    public final String d() {
        return this.f8582b;
    }

    public final s e() {
        return this.f8583c;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof t)) {
            return false;
        }
        t tVar = (t) obj2;
        return Intrinsics.f(this.f8581a, tVar.f8581a) && Intrinsics.f(this.f8582b, tVar.f8582b) && Intrinsics.f(this.f8583c, tVar.f8583c) && Intrinsics.f(this.d, tVar.d) && this.e == tVar.e && Intrinsics.f(this.f, tVar.f) && Intrinsics.f(this.f8584g, tVar.f8584g) && Intrinsics.f(this.f8585h, tVar.f8585h) && Intrinsics.f(this.i, tVar.i);
    }

    public final String f() {
        return this.f8584g;
    }

    public final String g() {
        return this.f8581a;
    }

    public final u h() {
        return this.e;
    }

    public final int hashCode() {
        int iC = p.a.c(this.f8581a.hashCode() * 31, 31, this.f8582b);
        s sVar = this.f8583c;
        int iHashCode = (iC + (sVar == null ? 0 : sVar.hashCode())) * 31;
        s sVar2 = this.d;
        int iHashCode2 = (this.e.hashCode() + ((iHashCode + (sVar2 == null ? 0 : sVar2.hashCode())) * 31)) * 31;
        String str = this.f;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f8584g;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f8585h;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.i;
        return iHashCode5 + (bool != null ? bool.hashCode() : 0);
    }

    public final Boolean i() {
        return this.i;
    }
}
