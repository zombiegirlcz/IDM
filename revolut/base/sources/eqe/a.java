package eqe;

import bqe.b;
import dw3.f6;
import e4m.e;
import fn2.c;
import iqe.f;
import oda.d;
import oda.o;
import r10.v;
import vc.s;

/* JADX INFO: loaded from: classes8.dex */
public final class a implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final usg.a f128447a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wqe.b f128448b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c89.b f128449c;
    public final ta7.a d;
    public final d e;
    public final npk.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final fqk.a f128450g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final o f128451h;
    public final ite.a i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e f128452j;
    public final e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e f128453l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e f128454m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e f128455n;

    public a(usg.a aVar, wqe.b bVar, c89.b bVar2, ite.a aVar2, d dVar, o oVar, npk.a aVar3, fqk.a aVar4, ta7.a aVar5) {
        this.f128447a = aVar;
        this.f128448b = bVar;
        this.f128449c = bVar2;
        this.d = aVar5;
        this.e = dVar;
        this.f = aVar3;
        this.f128450g = aVar4;
        this.f128451h = oVar;
        this.i = aVar2;
        int i = 29;
        this.f128452j = e4m.b.b(new f6(this, 0, i));
        this.k = e4m.b.b(new f6(this, 1, i));
        this.f128453l = e4m.b.b(new f6(this, 2, i));
        this.f128454m = e4m.b.b(new f6(this, 3, i));
        this.f128455n = e4m.b.b(new f6(this, 4, i));
    }

    public final pfe.d a() {
        return (pfe.d) this.k.get();
    }

    public final hqe.o b() {
        usg.a aVar = this.f128447a;
        wsg.b bVarA = aVar.a();
        xqe.b bVarA2 = this.f128448b.a();
        s.j(bVarA2);
        fqe.b bVar = new fqe.b();
        y79.a aVarB = this.f128449c.b();
        s.j(aVarB);
        ta7.a aVar2 = this.d;
        return new hqe.o(bVarA, bVarA2, bVar, new f(aVarB, new c(aVar2.c())), this.e.a(), new iqe.e(), new v(this.f.a(), aVar.b(), aVar2.i()), aVar2.i());
    }
}
