package zdl;

import ael.a0;
import ael.b0;
import ael.c0;
import ael.e0;
import ael.n;
import cfl.p;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import sdl.b1;

/* JADX INFO: loaded from: classes12.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ee0.a f321576a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final an0.c f321577b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final nj0.a f321578c;
    public final ifl.a d;
    public final c4f.k e;
    public final c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f321579g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f321580h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f321581j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f321582l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f321583m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e4m.e f321584n;
    public final e4m.e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e4m.e f321585p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e4m.e f321586q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e4m.e f321587r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final e4m.e f321588s;

    public f(ee0.a aVar, nj0.a aVar2, an0.c cVar, ifl.a aVar3, c4f.k kVar, c cVar2) {
        this.f321576a = aVar;
        this.f321577b = cVar;
        this.f321578c = aVar2;
        this.d = aVar3;
        this.e = kVar;
        this.f = cVar2;
        int i = 22;
        this.f321579g = e4m.b.b(new yxj.c(this, 3, i));
        this.f321580h = e4m.b.b(new yxj.c(this, 6, i));
        this.i = e4m.b.b(new yxj.c(this, 5, i));
        this.f321581j = e4m.b.b(new yxj.c(this, 4, i));
        this.k = e4m.b.b(new yxj.c(this, 8, i));
        this.f321582l = e4m.b.b(new yxj.c(this, 7, i));
        this.f321583m = e4m.b.b(new yxj.c(this, 2, i));
        this.f321584n = e4m.b.b(new yxj.c(this, 9, i));
        this.o = e4m.b.b(new yxj.c(this, 1, i));
        this.f321585p = e4m.b.b(new yxj.c(this, 10, i));
        this.f321586q = e4m.b.b(new yxj.c(this, 0, i));
        this.f321587r = e4m.b.b(new yxj.c(this, 11, i));
        this.f321588s = e4m.b.b(new yxj.c(this, 12, i));
    }

    public final Map a() {
        LinkedHashMap linkedHashMapU = ue0.e.u(10);
        linkedHashMapU.put(p.BONDS, new ael.a());
        linkedHashMapU.put(p.CFD, new ael.c());
        linkedHashMapU.put(p.ETF, new ael.d());
        linkedHashMapU.put(p.OPTIONS, new n());
        linkedHashMapU.put(p.STOCK_LENDING, new c0());
        linkedHashMapU.put(p.MARGIN_TRADING, new ael.l());
        linkedHashMapU.put(p.PRIVATE_MARKETS, new b0());
        linkedHashMapU.put(p.PRIVATE_BANK, new a0());
        linkedHashMapU.put(p.STRUCTURED_NOTES, new e0());
        linkedHashMapU.put(p.MUTUAL_FUNDS, new ael.m());
        return linkedHashMapU.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(linkedHashMapU);
    }

    public final ybl.i b() {
        return (ybl.i) this.f321587r.get();
    }

    public final ybl.j c() {
        return (ybl.j) this.f321588s.get();
    }

    public final ybl.k d() {
        return (ybl.k) this.f321586q.get();
    }

    public final b1 e() {
        return new b1();
    }
}
