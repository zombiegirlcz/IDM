package opa;

import l70.e;

/* JADX INFO: loaded from: classes13.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u06.a f227543a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f227544b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f227545c;
    public final e4m.e d;
    public final e4m.e e;

    public b(e eVar, u06.a aVar) {
        this.f227543a = aVar;
        this.f227544b = eVar;
        int i = 8;
        this.f227545c = e4m.b.b(new of3.e(this, 0, i));
        this.d = e4m.b.b(new of3.e(this, 1, i));
        this.e = e4m.b.b(new of3.e(this, 2, i));
    }

    public final rpa.b a() {
        return (rpa.b) this.f227545c.get();
    }
}
