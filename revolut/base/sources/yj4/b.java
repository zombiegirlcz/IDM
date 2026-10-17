package yj4;

import e4m.e;
import je6.g;

/* JADX INFO: loaded from: classes13.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final usg.a f314410a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f314411b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f314412c = this;
    public final e d;
    public final e e;
    public final e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e f314413g;

    public b(usg.a aVar, g gVar) {
        this.f314410a = aVar;
        this.f314411b = gVar;
        int i = 20;
        this.d = e4m.b.b(new xs6.a(this, 0, i));
        this.e = e4m.b.b(new xs6.a(this, 1, i));
        this.f = e4m.b.b(new xs6.a(this, 2, i));
        this.f314413g = e4m.b.b(new xs6.a(this, 3, i));
    }

    public final vj4.b a() {
        return (vj4.b) this.e.get();
    }
}
