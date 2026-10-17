package v45;

import an0.c;
import android.content.Context;
import c55.l0;
import com.google.common.collect.ImmutableSet;
import com.revolut.feature.credit.loan.impl.database.LoanDatabase;
import e4m.e;
import l35.h;
import m35.q;
import o55.f0;
import w45.b;
import y45.i;
import y45.j;
import y45.k;
import y45.n;
import y45.o;

/* JADX INFO: loaded from: classes13.dex */
public final class a implements j35.a {
    public final e A;
    public final e B;
    public final e C;
    public final e D;
    public final e E;
    public final e F;
    public final e G;
    public final e H;
    public final e I;
    public final e J;
    public final e K;
    public final e L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f285964a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f285965b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c21.e f285966c;
    public final w45.a d;
    public final ee0.a e;
    public final c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Context f285967g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final nj0.a f285968h;
    public final uq3.b i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final qie.a f285969j;
    public final bpj.a k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final usg.b f285970l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ite.a f285971m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e f285972n;
    public final e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e f285973p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e f285974q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e f285975r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final e f285976s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final e f285977t;
    public final e u;
    public final e v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final e f285978w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final e f285979x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final e f285980y;
    public final e z;

    public a(w45.a aVar, b bVar, nj0.a aVar2, c21.e eVar, ee0.a aVar3, bpj.a aVar4, ite.a aVar5, c cVar, uq3.b bVar2, qie.a aVar6, usg.b bVar3, String str, Context context) {
        this.f285964a = str;
        this.f285965b = bVar;
        this.f285966c = eVar;
        this.d = aVar;
        this.e = aVar3;
        this.f = cVar;
        this.f285967g = context;
        this.f285968h = aVar2;
        this.i = bVar2;
        this.f285969j = aVar6;
        this.k = aVar4;
        this.f285970l = bVar3;
        this.f285971m = aVar5;
        int i = 14;
        this.f285972n = e4m.b.b(new uhc.a(this, 4, i));
        this.o = e4m.b.b(new uhc.a(this, 3, i));
        this.f285973p = e4m.b.b(new uhc.a(this, 2, i));
        this.f285974q = e4m.b.b(new uhc.a(this, 5, i));
        this.f285975r = e4m.b.b(new uhc.a(this, 7, i));
        this.f285976s = e4m.b.b(new uhc.a(this, 6, i));
        this.f285977t = e4m.b.b(new uhc.a(this, 1, i));
        this.u = e4m.b.b(new uhc.a(this, 0, i));
        this.v = e4m.b.b(new uhc.a(this, 10, i));
        this.f285978w = e4m.b.b(new uhc.a(this, 11, i));
        this.f285979x = e4m.b.b(new uhc.a(this, 12, i));
        this.f285980y = e4m.b.b(new uhc.a(this, 13, i));
        this.z = e4m.b.b(new uhc.a(this, 9, i));
        this.A = e4m.b.b(new uhc.a(this, 8, i));
        this.B = e4m.b.b(new uhc.a(this, 15, i));
        this.C = e4m.b.b(new uhc.a(this, 14, i));
        this.D = e4m.b.b(new uhc.a(this, 16, i));
        this.E = e4m.b.b(new uhc.a(this, 17, i));
        this.F = e4m.b.b(new uhc.a(this, 18, i));
        this.G = e4m.b.b(new uhc.a(this, 19, i));
        this.H = e4m.b.b(new uhc.a(this, 22, i));
        this.I = e4m.b.b(new uhc.a(this, 23, i));
        this.J = e4m.b.b(new uhc.a(this, 21, i));
        this.K = e4m.b.b(new uhc.a(this, 20, i));
        this.L = e4m.b.b(new uhc.a(this, 24, i));
    }

    @Override // j35.a
    public final k a() {
        return (k) this.A.get();
    }

    @Override // j35.a
    public final q b() {
        return new l0();
    }

    @Override // j35.a
    public final if0.b c() {
        return new if0.a(ImmutableSet.of((ahl.a) this.f285978w.get(), (ahl.a) this.f285974q.get(), new ahl.a(this.f285967g, (LoanDatabase) this.f285975r.get())));
    }

    @Override // j35.a
    public final f0 d() {
        return (f0) this.C.get();
    }

    @Override // j35.a
    public final n e() {
        return (n) this.E.get();
    }

    @Override // j35.a
    public final h f() {
        return (h) this.L.get();
    }

    @Override // j35.a
    public final y45.h g() {
        return (y45.h) this.D.get();
    }

    @Override // j35.a
    public final j h() {
        return (j) this.K.get();
    }

    @Override // j35.a
    public final i i() {
        return (i) this.u.get();
    }

    @Override // j35.a
    public final o j() {
        return (o) this.F.get();
    }

    @Override // j35.a
    public final l35.a k() {
        return (l35.a) this.G.get();
    }
}
