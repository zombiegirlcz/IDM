package q8b;

import e4m.b;
import jk3.c;
import l70.e;
import p8a.c0;

/* JADX INFO: loaded from: classes13.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f243047a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f243048b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xmg.a f243049c;
    public final ite.a d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f243050g;

    public a(c cVar, e eVar, ite.a aVar, xmg.a aVar2) {
        this.f243047a = eVar;
        this.f243048b = cVar;
        this.f243049c = aVar2;
        this.d = aVar;
        int i = 16;
        this.e = b.b(new c0(this, 1, i));
        this.f = b.b(new c0(this, 0, i));
        this.f243050g = b.b(new c0(this, 2, i));
    }

    public final n8b.a a() {
        return (n8b.a) this.f.get();
    }

    public final n8b.b b() {
        return (n8b.b) this.f243050g.get();
    }
}
