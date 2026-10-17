package ld0;

import e4m.e;
import e4m.g;
import lal.j;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f193912a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final md0.a f193913b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final id0.c f193914c;
    public final e d;
    public final e e;
    public final e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e f193915g;

    public c(a aVar, id0.c cVar, md0.a aVar2) {
        this.f193912a = aVar;
        this.f193913b = aVar2;
        this.f193914c = cVar;
        int i = 1;
        this.d = g.a(new j(this, 2, i));
        this.e = g.a(new j(this, 3, i));
        this.f = g.a(new j(this, 1, i));
        this.f193915g = g.a(new j(this, 0, i));
    }

    public final md0.b a() {
        return (md0.b) this.f193915g.get();
    }
}
