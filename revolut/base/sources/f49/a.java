package f49;

import android.content.Context;
import g49.f;
import l70.e;
import vc.s;
import z39.h;

/* JADX INFO: loaded from: classes13.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nj0.a f132025a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f132026b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final th0.a f132027c;
    public final ee0.a d;
    public final an0.c e;
    public final Context f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final b f132028g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f132029h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f132030j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f132031l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f132032m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e4m.e f132033n;

    public a(f fVar, ee0.a aVar, an0.c cVar, e eVar, nj0.a aVar2, th0.a aVar3, b bVar, Context context) {
        this.f132025a = aVar2;
        this.f132026b = eVar;
        this.f132027c = aVar3;
        this.d = aVar;
        this.e = cVar;
        this.f = context;
        this.f132028g = bVar;
        int i = 15;
        this.f132029h = e4m.b.b(new ede.a(this, 2, i));
        this.i = e4m.b.b(new ede.a(this, 3, i));
        this.f132030j = e4m.b.b(new ede.a(this, 5, i));
        this.k = e4m.b.b(new ede.a(this, 4, i));
        this.f132031l = e4m.b.b(new ede.a(this, 6, i));
        this.f132032m = e4m.b.b(new ede.a(this, 1, i));
        this.f132033n = e4m.b.b(new ede.a(this, 0, i));
    }

    public final w39.b a() {
        return (w39.b) this.f132033n.get();
    }

    public final c49.d b() {
        e eVar = this.f132026b;
        y80.a aVarR = eVar.r();
        s.j(aVarR);
        zh0.e eVar2 = (zh0.e) this.f132027c.f.get();
        s.j(eVar2);
        ne0.d dVar = new ne0.d();
        ue0.c cVar = (ue0.c) this.i.get();
        b49.c cVar2 = (b49.c) this.k.get();
        h hVarA = this.f132028g.a();
        l80.e eVarH = eVar.h();
        s.j(eVarH);
        Context context = this.f;
        return new c49.d(aVarR, eVar2, dVar, cVar, cVar2, hVarA, eVarH, fp8.c.u(context), new i4b.f(context));
    }
}
