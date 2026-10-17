package krl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class k {

    @NotNull
    public static final j Companion = new j();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f188985a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f188986b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f188987c;
    public final long d;
    public final long e;
    public final Long f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f188988g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f188989h;
    public final String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f188990j;
    public final String k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f188991l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f188992m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final p f188993n;
    public final q o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final b f188994p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e f188995q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final d f188996r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final g f188997s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final h f188998t;
    public final a u;
    public final String v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Boolean f188999w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final String f189000x;

    public k(String id10, String accountType, String compoundId, long j2, long j3, Long l2, String side, String state, String orderType, String currencyPairFirst, String currencyPairSecond, String str, String instrumentType, p pVar, q qVar, b bVar, e eVar, d dVar, g gVar, h hVar, a aVar, String accountHolderType, Boolean bool, String str2) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(accountType, "accountType");
        Intrinsics.checkNotNullParameter(compoundId, "compoundId");
        Intrinsics.checkNotNullParameter(side, "side");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(orderType, "orderType");
        Intrinsics.checkNotNullParameter(currencyPairFirst, "currencyPairFirst");
        Intrinsics.checkNotNullParameter(currencyPairSecond, "currencyPairSecond");
        Intrinsics.checkNotNullParameter(instrumentType, "instrumentType");
        Intrinsics.checkNotNullParameter(accountHolderType, "accountHolderType");
        this.f188985a = id10;
        this.f188986b = accountType;
        this.f188987c = compoundId;
        this.d = j2;
        this.e = j3;
        this.f = l2;
        this.f188988g = side;
        this.f188989h = state;
        this.i = orderType;
        this.f188990j = currencyPairFirst;
        this.k = currencyPairSecond;
        this.f188991l = str;
        this.f188992m = instrumentType;
        this.f188993n = pVar;
        this.o = qVar;
        this.f188994p = bVar;
        this.f188995q = eVar;
        this.f188996r = dVar;
        this.f188997s = gVar;
        this.f188998t = hVar;
        this.u = aVar;
        this.v = accountHolderType;
        this.f188999w = bool;
        this.f189000x = str2;
    }

    public static k a(k kVar, String str, p pVar, q qVar, b bVar, e eVar, d dVar, g gVar, h hVar, int i) {
        String id10 = kVar.f188985a;
        String accountType = kVar.f188986b;
        String compoundId = kVar.f188987c;
        long j2 = kVar.d;
        long j3 = kVar.e;
        Long l2 = kVar.f;
        String side = kVar.f188988g;
        String state = kVar.f188989h;
        String orderType = kVar.i;
        String currencyPairFirst = kVar.f188990j;
        String currencyPairSecond = kVar.k;
        String str2 = (i & 2048) != 0 ? kVar.f188991l : str;
        String instrumentType = kVar.f188992m;
        p pVar2 = (i & 8192) != 0 ? kVar.f188993n : pVar;
        String str3 = str2;
        q qVar2 = (i & 16384) != 0 ? kVar.o : qVar;
        b bVar2 = (i & 32768) != 0 ? kVar.f188994p : bVar;
        e eVar2 = (i & 65536) != 0 ? kVar.f188995q : eVar;
        d dVar2 = (i & 131072) != 0 ? kVar.f188996r : dVar;
        g gVar2 = (i & 262144) != 0 ? kVar.f188997s : gVar;
        h hVar2 = (i & 524288) != 0 ? kVar.f188998t : hVar;
        a aVar = kVar.u;
        String accountHolderType = kVar.v;
        q qVar3 = qVar2;
        Boolean bool = kVar.f188999w;
        String str4 = kVar.f189000x;
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(accountType, "accountType");
        Intrinsics.checkNotNullParameter(compoundId, "compoundId");
        Intrinsics.checkNotNullParameter(side, "side");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(orderType, "orderType");
        Intrinsics.checkNotNullParameter(currencyPairFirst, "currencyPairFirst");
        Intrinsics.checkNotNullParameter(currencyPairSecond, "currencyPairSecond");
        Intrinsics.checkNotNullParameter(instrumentType, "instrumentType");
        Intrinsics.checkNotNullParameter(accountHolderType, "accountHolderType");
        return new k(id10, accountType, compoundId, j2, j3, l2, side, state, orderType, currencyPairFirst, currencyPairSecond, str3, instrumentType, pVar2, qVar3, bVar2, eVar2, dVar2, gVar2, hVar2, aVar, accountHolderType, bool, str4);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f188985a, kVar.f188985a) && Intrinsics.f(this.f188986b, kVar.f188986b) && Intrinsics.f(this.f188987c, kVar.f188987c) && this.d == kVar.d && this.e == kVar.e && Intrinsics.f(this.f, kVar.f) && Intrinsics.f(this.f188988g, kVar.f188988g) && Intrinsics.f(this.f188989h, kVar.f188989h) && Intrinsics.f(this.i, kVar.i) && Intrinsics.f(this.f188990j, kVar.f188990j) && Intrinsics.f(this.k, kVar.k) && Intrinsics.f(this.f188991l, kVar.f188991l) && Intrinsics.f(this.f188992m, kVar.f188992m) && Intrinsics.f(this.f188993n, kVar.f188993n) && Intrinsics.f(this.o, kVar.o) && Intrinsics.f(this.f188994p, kVar.f188994p) && Intrinsics.f(this.f188995q, kVar.f188995q) && Intrinsics.f(this.f188996r, kVar.f188996r) && Intrinsics.f(this.f188997s, kVar.f188997s) && Intrinsics.f(this.f188998t, kVar.f188998t) && Intrinsics.f(this.u, kVar.u) && Intrinsics.f(this.v, kVar.v) && Intrinsics.f(this.f188999w, kVar.f188999w) && Intrinsics.f(this.f189000x, kVar.f189000x);
    }

    public final int hashCode() {
        int iC = a0.d.c(a0.d.c(p.a.c(p.a.c(this.f188985a.hashCode() * 31, 31, this.f188986b), 31, this.f188987c), 31, this.d), 31, this.e);
        Long l2 = this.f;
        int iC2 = p.a.c(p.a.c(p.a.c(p.a.c(p.a.c((iC + (l2 == null ? 0 : l2.hashCode())) * 31, 31, this.f188988g), 31, this.f188989h), 31, this.i), 31, this.f188990j), 31, this.k);
        String str = this.f188991l;
        int iC3 = p.a.c((iC2 + (str == null ? 0 : str.hashCode())) * 31, 31, this.f188992m);
        p pVar = this.f188993n;
        int iHashCode = (iC3 + (pVar == null ? 0 : pVar.hashCode())) * 31;
        q qVar = this.o;
        int iHashCode2 = (iHashCode + (qVar == null ? 0 : qVar.hashCode())) * 31;
        b bVar = this.f188994p;
        int iHashCode3 = (iHashCode2 + (bVar == null ? 0 : bVar.hashCode())) * 31;
        e eVar = this.f188995q;
        int iHashCode4 = (iHashCode3 + (eVar == null ? 0 : eVar.hashCode())) * 31;
        d dVar = this.f188996r;
        int iHashCode5 = (iHashCode4 + (dVar == null ? 0 : dVar.hashCode())) * 31;
        g gVar = this.f188997s;
        int iHashCode6 = (iHashCode5 + (gVar == null ? 0 : gVar.hashCode())) * 31;
        h hVar = this.f188998t;
        int iHashCode7 = (iHashCode6 + (hVar == null ? 0 : hVar.hashCode())) * 31;
        a aVar = this.u;
        int iC4 = p.a.c((iHashCode7 + (aVar == null ? 0 : aVar.hashCode())) * 31, 31, this.v);
        Boolean bool = this.f188999w;
        int iHashCode8 = (iC4 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str2 = this.f189000x;
        return iHashCode8 + (str2 != null ? str2.hashCode() : 0);
    }
}
