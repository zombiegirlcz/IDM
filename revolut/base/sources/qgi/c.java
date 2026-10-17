package qgi;

import iri.j;
import wli.x;

/* JADX INFO: loaded from: classes10.dex */
public final class c implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l70.e f245858a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final bk0.e f245859b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x f245860c;
    public final c d = this;
    public final e4m.e e = e4m.b.b(new a9i.b(this, 0, 10));
    public final e4m.e f = e4m.b.b(new a9i.b(this, 1, 10));

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f245861g = e4m.b.b(new a9i.b(this, 2, 10));

    public c(hri.b bVar, l70.e eVar, x xVar, bk0.e eVar2) {
        this.f245858a = eVar;
        this.f245859b = eVar2;
        this.f245860c = xVar;
    }

    @Override // hri.a
    public final j e() {
        return (j) this.f.get();
    }

    @Override // hri.a
    public final ifm.b f() {
        return (ifm.b) this.e.get();
    }

    @Override // qgi.e
    public final fc4.a g() {
        return new fc4.a(this.d, 3);
    }
}
