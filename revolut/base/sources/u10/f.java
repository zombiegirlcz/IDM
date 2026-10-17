package u10;

import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.Instant;
import v30.c0;
import v30.s0;
import v30.u0;

/* JADX INFO: loaded from: classes19.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UUID f276264a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f276265b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final UUID f276266c;
    public final String d;
    public final String e;
    public final s0 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Instant f276267g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Instant f276268h;
    public final Instant i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Instant f276269j;
    public final Boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f276270l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f276271m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f276272n;
    public final boolean o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f276273p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final u0 f276274q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final c0 f276275r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final p f276276s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final r f276277t;
    public final c u;
    public final k v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final UUID f276278w;

    public f(UUID id10, int i, UUID uuid, String str, String str2, s0 ticketState, Instant createdAt, Instant updatedAt, Instant instant, Instant instant2, Boolean bool, String agent, boolean z, boolean z3, boolean z4, boolean z6, u0 u0Var, c0 feedType, p pVar, r rVar, c cVar, k kVar, UUID uuid2) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(ticketState, "ticketState");
        Intrinsics.checkNotNullParameter(createdAt, "createdAt");
        Intrinsics.checkNotNullParameter(updatedAt, "updatedAt");
        Intrinsics.checkNotNullParameter(agent, "agent");
        Intrinsics.checkNotNullParameter(feedType, "feedType");
        this.f276264a = id10;
        this.f276265b = i;
        this.f276266c = uuid;
        this.d = str;
        this.e = str2;
        this.f = ticketState;
        this.f276267g = createdAt;
        this.f276268h = updatedAt;
        this.i = instant;
        this.f276269j = instant2;
        this.k = bool;
        this.f276270l = agent;
        this.f276271m = z;
        this.f276272n = z3;
        this.o = z4;
        this.f276273p = z6;
        this.f276274q = u0Var;
        this.f276275r = feedType;
        this.f276276s = pVar;
        this.f276277t = rVar;
        this.u = cVar;
        this.v = kVar;
        this.f276278w = uuid2;
    }

    public final String a() {
        return this.f276270l;
    }

    public final r b() {
        return this.f276277t;
    }

    public final Instant c() {
        return this.f276267g;
    }

    public final Instant d() {
        return this.i;
    }

    public final Instant e() {
        return this.f276269j;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f276264a, fVar.f276264a) && this.f276265b == fVar.f276265b && Intrinsics.f(this.f276266c, fVar.f276266c) && Intrinsics.f(this.d, fVar.d) && Intrinsics.f(this.e, fVar.e) && this.f == fVar.f && Intrinsics.f(this.f276267g, fVar.f276267g) && Intrinsics.f(this.f276268h, fVar.f276268h) && Intrinsics.f(this.i, fVar.i) && Intrinsics.f(this.f276269j, fVar.f276269j) && Intrinsics.f(this.k, fVar.k) && Intrinsics.f(this.f276270l, fVar.f276270l) && this.f276271m == fVar.f276271m && this.f276272n == fVar.f276272n && this.o == fVar.o && this.f276273p == fVar.f276273p && this.f276274q == fVar.f276274q && this.f276275r == fVar.f276275r && Intrinsics.f(this.f276276s, fVar.f276276s) && Intrinsics.f(this.f276277t, fVar.f276277t) && Intrinsics.f(this.u, fVar.u) && Intrinsics.f(this.v, fVar.v) && Intrinsics.f(this.f276278w, fVar.f276278w);
    }

    public final UUID f() {
        return this.f276278w;
    }

    public final c0 g() {
        return this.f276275r;
    }

    public final UUID h() {
        return this.f276266c;
    }

    public final int hashCode() {
        int iB = j6.a.b(this.f276265b, this.f276264a.hashCode() * 31, 31);
        UUID uuid = this.f276266c;
        int iHashCode = (iB + (uuid == null ? 0 : uuid.hashCode())) * 31;
        String str = this.d;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        int iG = t61.a.g(this.f276268h, t61.a.g(this.f276267g, (this.f.hashCode() + ((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31, 31), 31);
        Instant instant = this.i;
        int iHashCode3 = (iG + (instant == null ? 0 : instant.hashCode())) * 31;
        Instant instant2 = this.f276269j;
        int iHashCode4 = (iHashCode3 + (instant2 == null ? 0 : instant2.hashCode())) * 31;
        Boolean bool = this.k;
        int iC = j6.a.c(j6.a.c(j6.a.c(j6.a.c(p.a.c((iHashCode4 + (bool == null ? 0 : bool.hashCode())) * 31, 31, this.f276270l), 31, this.f276271m), 31, this.f276272n), 31, this.o), 31, this.f276273p);
        u0 u0Var = this.f276274q;
        int iHashCode5 = (this.f276275r.hashCode() + ((iC + (u0Var == null ? 0 : u0Var.hashCode())) * 31)) * 31;
        p pVar = this.f276276s;
        int iHashCode6 = (iHashCode5 + (pVar == null ? 0 : pVar.hashCode())) * 31;
        r rVar = this.f276277t;
        int iHashCode7 = (iHashCode6 + (rVar == null ? 0 : rVar.hashCode())) * 31;
        c cVar = this.u;
        int iHashCode8 = (iHashCode7 + (cVar == null ? 0 : cVar.hashCode())) * 31;
        k kVar = this.v;
        int iHashCode9 = (iHashCode8 + (kVar == null ? 0 : kVar.hashCode())) * 31;
        UUID uuid2 = this.f276278w;
        return iHashCode9 + (uuid2 != null ? uuid2.hashCode() : 0);
    }

    public final UUID i() {
        return this.f276264a;
    }

    public final c j() {
        return this.u;
    }

    public final k k() {
        return this.v;
    }

    public final String l() {
        return this.d;
    }

    public final p m() {
        return this.f276276s;
    }

    public final s0 n() {
        return this.f;
    }

    public final u0 o() {
        return this.f276274q;
    }

    public final String p() {
        return this.e;
    }

    public final int q() {
        return this.f276265b;
    }

    public final Instant r() {
        return this.f276268h;
    }

    public final boolean s() {
        return this.f276273p;
    }

    public final boolean t() {
        return this.o;
    }

    public final boolean u() {
        return this.f276272n;
    }

    public final Boolean v() {
        return this.k;
    }

    public final boolean w() {
        return this.f276271m;
    }
}
