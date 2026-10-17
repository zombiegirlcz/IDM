package s9l;

import e4m.b;
import l70.e;
import t9l.g;

/* JADX INFO: loaded from: classes12.dex */
public final class a implements fbl.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jhf.a f261198a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fjf.a f261199b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f261200c;
    public final e4m.e d = b.b(new r8h.a(this, 22));

    public a(jhf.a aVar, fjf.a aVar2, e eVar) {
        this.f261198a = aVar;
        this.f261199b = aVar2;
        this.f261200c = eVar;
    }

    @Override // fbl.a
    public final g a() {
        return (g) this.d.get();
    }
}
