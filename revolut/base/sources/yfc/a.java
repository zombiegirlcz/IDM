package yfc;

import vc.s;
import xe0.f;

/* JADX INFO: loaded from: classes13.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ee0.a f313206a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final an0.c f313207b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final vs6.a f313208c;
    public final c21.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f313209g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f313210h;
    public final e4m.e i;

    public a(ee0.a aVar, c21.e eVar, vs6.a aVar2, an0.c cVar) {
        this.f313206a = aVar;
        this.f313207b = cVar;
        this.f313208c = aVar2;
        this.d = eVar;
        int i = 15;
        this.e = e4m.b.b(new xs6.a(this, 0, i));
        this.f = e4m.b.b(new xs6.a(this, 3, i));
        this.f313209g = e4m.b.b(new xs6.a(this, 4, i));
        this.f313210h = e4m.b.b(new xs6.a(this, 2, i));
        this.i = e4m.b.b(new xs6.a(this, 1, i));
    }

    public final jf1.a a() {
        return (jf1.a) this.i.get();
    }

    public final xe0.e b() {
        ee0.a aVar = this.f313206a;
        je0.d dVarB = aVar.b();
        s.j(dVarB);
        yk0.a aVarB = this.f313207b.b();
        s.j(aVarB);
        f fVarF = aVar.f();
        s.j(fVarF);
        return yf6.b.p(dVarB, aVarB, fVarF);
    }
}
