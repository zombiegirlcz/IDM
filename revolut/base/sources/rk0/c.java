package rk0;

import mk0.p;
import rg0.e;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nk0.a f254712a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final an0.c f254713b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ee0.a f254714c;
    public final e d;
    public final l70.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f254715g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f254716h;
    public final e4m.e i;

    public c(ee0.a aVar, an0.c cVar, l70.e eVar, e eVar2, nk0.a aVar2) {
        this.f254712a = aVar2;
        this.f254713b = cVar;
        this.f254714c = aVar;
        this.d = eVar2;
        this.e = eVar;
        int i = 12;
        this.f = e4m.b.b(new r5a.b(this, 1, i));
        this.f254715g = e4m.b.b(new r5a.b(this, 2, i));
        this.f254716h = e4m.b.b(new r5a.b(this, 3, i));
        this.i = e4m.b.b(new r5a.b(this, 0, i));
    }

    public final mk0.a a() {
        return (mk0.a) this.i.get();
    }

    public final p b() {
        return (p) this.i.get();
    }
}
