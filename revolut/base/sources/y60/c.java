package y60;

import e4m.e;
import kp.d;
import kp.f;
import xf6.a1;

/* JADX INFO: loaded from: classes19.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ee0.a f311109a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final an0.c f311110b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f311111c;
    public final e d;

    public c(kp.b bVar, ee0.a aVar, an0.c cVar) {
        this.f311109a = aVar;
        this.f311110b = cVar;
        int i = 16;
        this.f311111c = e4m.b.b(new a1(this, 1, i));
        this.d = e4m.b.b(new a1(this, 0, i));
    }

    public final x60.a a() {
        return (x60.a) this.d.get();
    }

    public final w60.b b() {
        f.Companion.getClass();
        d dVar = d.f187954a;
        return new w60.b((x60.a) this.d.get());
    }

    public final nz5.a c() {
        f.Companion.getClass();
        d dVar = d.f187954a;
        return new nz5.a(new w60.b((x60.a) this.d.get()));
    }
}
