package lzk;

import e4m.e;
import iri.j;

/* JADX INFO: loaded from: classes12.dex */
public final class a implements hri.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f201014a = this;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f201015b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f201016c;
    public final e d;

    public a(hri.b bVar) {
        int i = 6;
        this.f201015b = e4m.b.b(new a9i.b(this, 0, i));
        this.f201016c = e4m.b.b(new a9i.b(this, 1, i));
        this.d = e4m.b.b(new a9i.b(this, 2, i));
    }

    @Override // hri.a
    public final j e() {
        return (j) this.f201016c.get();
    }

    @Override // hri.a
    public final ifm.b f() {
        return (ifm.b) this.f201015b.get();
    }
}
