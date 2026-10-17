package npf;

import cpf.c;
import e4m.b;
import e4m.e;
import yof.k;
import zof.f;

/* JADX INFO: loaded from: classes9.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ite.a f218200a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ak5.a f218201b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f218202c;
    public final e d;
    public final e e;
    public final e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e f218203g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e f218204h;
    public final e i;

    public a(ak5.a aVar, ite.a aVar2) {
        this.f218200a = aVar2;
        this.f218201b = aVar;
        int i = 10;
        this.f218202c = b.b(new nk7.e(this, 0, i));
        this.d = b.b(new nk7.e(this, 1, i));
        this.e = b.b(new nk7.e(this, 2, i));
        this.f = b.b(new nk7.e(this, 3, i));
        this.f218203g = b.b(new nk7.e(this, 4, i));
        this.f218204h = b.b(new nk7.e(this, 5, i));
        this.i = b.b(new nk7.e(this, 6, i));
    }

    public final yof.a a() {
        return (yof.a) this.e.get();
    }

    public final ppf.a b() {
        return (ppf.a) this.f218202c.get();
    }

    public final aqf.b c() {
        return (aqf.b) this.i.get();
    }

    public final f d() {
        return (f) this.f.get();
    }

    public final cpf.b e() {
        return (cpf.b) this.f218204h.get();
    }

    public final c f() {
        return (c) this.f218203g.get();
    }

    public final k g() {
        return (k) this.d.get();
    }
}
