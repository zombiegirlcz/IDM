package ibh;

import e4m.e;
import hbh.j;

/* JADX INFO: loaded from: classes13.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yah.a f160176a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h9h.a f160177b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c4f.a f160178c;
    public final e d;
    public final e e;
    public final e f;

    public b(yah.a aVar, h9h.a aVar2, c4f.a aVar3) {
        this.f160176a = aVar;
        this.f160177b = aVar2;
        this.f160178c = aVar3;
        int i = 0;
        this.d = e4m.b.b(new a(this, 1, i));
        this.e = e4m.b.b(new a(this, 2, i));
        this.f = e4m.b.b(new a(this, 0, i));
    }

    public final j a() {
        return (j) this.f.get();
    }
}
