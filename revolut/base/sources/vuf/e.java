package vuf;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class e {
    public final String A;
    public final Boolean B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f292351a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f292352b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f292353c;
    public final f d;
    public final String e;
    public final n f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final m f292354g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List f292355h;
    public final List i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f292356j;
    public final String k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f292357l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final s f292358m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final jo3.b f292359n;
    public final String o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final List f292360p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final List f292361q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final String f292362r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Boolean f292363s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final t f292364t;
    public final g u;
    public final List v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final l f292365w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Long f292366x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final Long f292367y;
    public final Long z;

    public e(String id10, String ticketOfferId, String str, f state, String title, n ticketType, m description, List zones, List tags, long j2, String locationName, String countryCode, s provider, jo3.b bVar, String str2, List generalInputs, List passengerInputs, String str3, Boolean bool, t tVar, g gVar, List activationParams, l lVar, Long l2, Long l3, Long l4, String str4, Boolean bool2) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(ticketOfferId, "ticketOfferId");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(ticketType, "ticketType");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(zones, "zones");
        Intrinsics.checkNotNullParameter(tags, "tags");
        Intrinsics.checkNotNullParameter(locationName, "locationName");
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        Intrinsics.checkNotNullParameter(provider, "provider");
        Intrinsics.checkNotNullParameter(generalInputs, "generalInputs");
        Intrinsics.checkNotNullParameter(passengerInputs, "passengerInputs");
        Intrinsics.checkNotNullParameter(activationParams, "activationParams");
        this.f292351a = id10;
        this.f292352b = ticketOfferId;
        this.f292353c = str;
        this.d = state;
        this.e = title;
        this.f = ticketType;
        this.f292354g = description;
        this.f292355h = zones;
        this.i = tags;
        this.f292356j = j2;
        this.k = locationName;
        this.f292357l = countryCode;
        this.f292358m = provider;
        this.f292359n = bVar;
        this.o = str2;
        this.f292360p = generalInputs;
        this.f292361q = passengerInputs;
        this.f292362r = str3;
        this.f292363s = bool;
        this.f292364t = tVar;
        this.u = gVar;
        this.v = activationParams;
        this.f292365w = lVar;
        this.f292366x = l2;
        this.f292367y = l3;
        this.z = l4;
        this.A = str4;
        this.B = bool2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f292351a, eVar.f292351a) && Intrinsics.f(this.f292352b, eVar.f292352b) && Intrinsics.f(this.f292353c, eVar.f292353c) && this.d == eVar.d && Intrinsics.f(this.e, eVar.e) && Intrinsics.f(this.f, eVar.f) && Intrinsics.f(this.f292354g, eVar.f292354g) && Intrinsics.f(this.f292355h, eVar.f292355h) && Intrinsics.f(this.i, eVar.i) && this.f292356j == eVar.f292356j && Intrinsics.f(this.k, eVar.k) && Intrinsics.f(this.f292357l, eVar.f292357l) && Intrinsics.f(this.f292358m, eVar.f292358m) && Intrinsics.f(this.f292359n, eVar.f292359n) && Intrinsics.f(this.o, eVar.o) && Intrinsics.f(this.f292360p, eVar.f292360p) && Intrinsics.f(this.f292361q, eVar.f292361q) && Intrinsics.f(this.f292362r, eVar.f292362r) && Intrinsics.f(this.f292363s, eVar.f292363s) && Intrinsics.f(this.f292364t, eVar.f292364t) && Intrinsics.f(this.u, eVar.u) && Intrinsics.f(this.v, eVar.v) && Intrinsics.f(this.f292365w, eVar.f292365w) && Intrinsics.f(this.f292366x, eVar.f292366x) && Intrinsics.f(this.f292367y, eVar.f292367y) && Intrinsics.f(this.z, eVar.z) && Intrinsics.f(this.A, eVar.A) && Intrinsics.f(this.B, eVar.B);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f292351a.hashCode() * 31, 31, this.f292352b);
        String str = this.f292353c;
        int iHashCode = (this.f292358m.hashCode() + p.a.c(p.a.c(a0.d.c(p.a.d(p.a.d((this.f292354g.hashCode() + ((this.f.hashCode() + p.a.c((this.d.hashCode() + ((iC + (str == null ? 0 : str.hashCode())) * 31)) * 31, 31, this.e)) * 31)) * 31, 31, this.f292355h), 31, this.i), 31, this.f292356j), 31, this.k), 31, this.f292357l)) * 31;
        jo3.b bVar = this.f292359n;
        int iHashCode2 = (iHashCode + (bVar == null ? 0 : bVar.hashCode())) * 31;
        String str2 = this.o;
        int iD = p.a.d(p.a.d((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.f292360p), 31, this.f292361q);
        String str3 = this.f292362r;
        int iHashCode3 = (iD + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.f292363s;
        int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        t tVar = this.f292364t;
        int iHashCode5 = (iHashCode4 + (tVar == null ? 0 : tVar.hashCode())) * 31;
        g gVar = this.u;
        int iD2 = p.a.d((iHashCode5 + (gVar == null ? 0 : gVar.hashCode())) * 31, 31, this.v);
        l lVar = this.f292365w;
        int iHashCode6 = (iD2 + (lVar == null ? 0 : lVar.hashCode())) * 31;
        Long l2 = this.f292366x;
        int iHashCode7 = (iHashCode6 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.f292367y;
        int iHashCode8 = (iHashCode7 + (l3 == null ? 0 : l3.hashCode())) * 31;
        Long l4 = this.z;
        int iHashCode9 = (iHashCode8 + (l4 == null ? 0 : l4.hashCode())) * 31;
        String str4 = this.A;
        int iHashCode10 = (iHashCode9 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Boolean bool2 = this.B;
        return iHashCode10 + (bool2 != null ? bool2.hashCode() : 0);
    }
}
