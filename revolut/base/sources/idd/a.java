package idd;

import e4m.e;
import g2e.t;
import i72.j;

/* JADX INFO: loaded from: classes7.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nj0.a f160469a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ddd.a f160470b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final nf0.a f160471c;
    public final e d;
    public final e e;
    public final e f;

    public a(ee0.a aVar, nf0.a aVar2, nj0.a aVar3, ddd.a aVar4) {
        this.f160469a = aVar3;
        this.f160470b = aVar4;
        this.f160471c = aVar2;
        int i = 10;
        this.d = e4m.b.b(new j(this, 1, i));
        this.e = e4m.b.b(new j(this, 0, i));
        this.f = e4m.b.b(new j(this, 2, i));
    }

    public final t a() {
        return new t((edd.d) this.e.get());
    }
}
