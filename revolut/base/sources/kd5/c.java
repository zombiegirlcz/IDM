package kd5;

import e4m.e;
import jm4.o3;

/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bpj.a f182807a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ei5.d f182808b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f182809c;
    public final e d;

    public c(ei5.d dVar, bpj.a aVar) {
        this.f182807a = aVar;
        this.f182808b = dVar;
        int i = 18;
        this.f182809c = e4m.b.b(new o3(this, 0, i));
        this.d = e4m.b.b(new o3(this, 1, i));
    }

    public final hd5.a a() {
        return (hd5.a) this.d.get();
    }

    public final ld5.b b() {
        return (ld5.b) this.f182809c.get();
    }
}
