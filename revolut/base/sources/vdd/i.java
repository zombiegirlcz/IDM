package vdd;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f287894a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f287895b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f287896c;
    public final e d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f287897g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f287898h;
    public final String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final d f287899j;
    public final a k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final List f287900l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Long f287901m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Long f287902n;
    public final List o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final String f287903p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final long f287904q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Long f287905r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final String f287906s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final String f287907t;

    public i(String id10, String str, String state, e eVar, String type, String ownerId, long j2, String str2, String underlyingId, d dVar, a aVar, List list, Long l2, Long l3, List list2, String accountType, long j3, Long l4, String str3, String str4) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(ownerId, "ownerId");
        Intrinsics.checkNotNullParameter(underlyingId, "underlyingId");
        Intrinsics.checkNotNullParameter(accountType, "accountType");
        this.f287894a = id10;
        this.f287895b = str;
        this.f287896c = state;
        this.d = eVar;
        this.e = type;
        this.f = ownerId;
        this.f287897g = j2;
        this.f287898h = str2;
        this.i = underlyingId;
        this.f287899j = dVar;
        this.k = aVar;
        this.f287900l = list;
        this.f287901m = l2;
        this.f287902n = l3;
        this.o = list2;
        this.f287903p = accountType;
        this.f287904q = j3;
        this.f287905r = l4;
        this.f287906s = str3;
        this.f287907t = str4;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f287894a, iVar.f287894a) && Intrinsics.f(this.f287895b, iVar.f287895b) && Intrinsics.f(this.f287896c, iVar.f287896c) && Intrinsics.f(this.d, iVar.d) && Intrinsics.f(this.e, iVar.e) && Intrinsics.f(this.f, iVar.f) && this.f287897g == iVar.f287897g && Intrinsics.f(this.f287898h, iVar.f287898h) && Intrinsics.f(this.i, iVar.i) && Intrinsics.f(this.f287899j, iVar.f287899j) && Intrinsics.f(this.k, iVar.k) && Intrinsics.f(this.f287900l, iVar.f287900l) && Intrinsics.f(this.f287901m, iVar.f287901m) && Intrinsics.f(this.f287902n, iVar.f287902n) && Intrinsics.f(this.o, iVar.o) && Intrinsics.f(this.f287903p, iVar.f287903p) && this.f287904q == iVar.f287904q && Intrinsics.f(this.f287905r, iVar.f287905r) && Intrinsics.f(this.f287906s, iVar.f287906s) && Intrinsics.f(this.f287907t, iVar.f287907t);
    }

    public final int hashCode() {
        int iHashCode = this.f287894a.hashCode() * 31;
        String str = this.f287895b;
        int iC = p.a.c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f287896c);
        e eVar = this.d;
        int iC2 = a0.d.c(p.a.c(p.a.c((iC + (eVar == null ? 0 : eVar.hashCode())) * 31, 31, this.e), 31, this.f), 31, this.f287897g);
        String str2 = this.f287898h;
        int iC3 = p.a.c((iC2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.i);
        d dVar = this.f287899j;
        int iHashCode2 = (iC3 + (dVar == null ? 0 : dVar.hashCode())) * 31;
        a aVar = this.k;
        int iHashCode3 = (iHashCode2 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        List list = this.f287900l;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        Long l2 = this.f287901m;
        int iHashCode5 = (iHashCode4 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.f287902n;
        int iHashCode6 = (iHashCode5 + (l3 == null ? 0 : l3.hashCode())) * 31;
        List list2 = this.o;
        int iC4 = a0.d.c(p.a.c((iHashCode6 + (list2 == null ? 0 : list2.hashCode())) * 31, 31, this.f287903p), 31, this.f287904q);
        Long l4 = this.f287905r;
        int iHashCode7 = (iC4 + (l4 == null ? 0 : l4.hashCode())) * 31;
        String str3 = this.f287906s;
        int iHashCode8 = (iHashCode7 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f287907t;
        return iHashCode8 + (str4 != null ? str4.hashCode() : 0);
    }
}
