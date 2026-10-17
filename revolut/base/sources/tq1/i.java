package tq1;

import ecm.q;

/* JADX INFO: loaded from: classes20.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f273500a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a31.a f273501b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a31.a f273502c;
    public final a31.a d;
    public final e4m.e e;
    public final tn3.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f273503g;

    public i(a31.a aVar, a31.a aVar2, a31.a aVar3, q qVar) {
        this.f273500a = qVar;
        this.f273501b = aVar;
        this.f273502c = aVar2;
        this.d = aVar3;
        int i = 2;
        this.e = e4m.b.b(new tn3.a(this, 0, i));
        this.f = new tn3.a(this, 2, i);
        this.f273503g = e4m.b.b(new tn3.a(this, 1, i));
    }

    public final b60.a a() {
        return (b60.a) this.e.get();
    }

    public final b60.a b() {
        return (b60.a) this.f273503g.get();
    }
}
