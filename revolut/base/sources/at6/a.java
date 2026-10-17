package at6;

import au6.x1;
import ft6.s;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c21.e f9000a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ee0.a f9001b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final an0.c f9002c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f9003g;

    public a(c cVar, ee0.a aVar, c21.e eVar, an0.c cVar2) {
        this.f9000a = eVar;
        this.f9001b = aVar;
        this.f9002c = cVar2;
        int i = 1;
        this.d = e4m.b.b(new aq1.e(this, 1, i));
        this.e = e4m.b.b(new aq1.e(this, 2, i));
        this.f = e4m.b.b(new aq1.e(this, 3, i));
        this.f9003g = e4m.b.b(new aq1.e(this, 0, i));
    }

    public final zjh.c a() {
        return new zjh.c((x1) this.f9003g.get());
    }

    public final s b() {
        return new s();
    }
}
