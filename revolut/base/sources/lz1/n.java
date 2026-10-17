package lz1;

import ljl.y;

/* JADX INFO: loaded from: classes20.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ry1.e f200896a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final opa.c f200897b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final cri.a f200898c;
    public final e4m.e d;
    public final e4m.e e;

    public n(ry1.e eVar, cri.a aVar, opa.c cVar) {
        this.f200896a = eVar;
        this.f200897b = cVar;
        this.f200898c = aVar;
        int i = 19;
        this.d = e4m.b.b(new y(this, 0, i));
        this.e = e4m.b.b(new y(this, 1, i));
    }

    public final tz1.b a() {
        return (tz1.b) this.d.get();
    }
}
