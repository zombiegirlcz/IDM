package c89;

/* JADX INFO: loaded from: classes13.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e48.a f22144a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final usg.a f22145b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final npk.a f22146c;
    public final fqk.a d;
    public final nj0.a e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f22147g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f22148h;
    public final e4m.e i;

    public b(e48.a aVar, usg.a aVar2, npk.a aVar3, fqk.a aVar4, nj0.a aVar5) {
        this.f22144a = aVar;
        this.f22145b = aVar2;
        this.f22146c = aVar3;
        this.d = aVar4;
        this.e = aVar5;
        int i = 4;
        this.f = e4m.b.b(new c63.b(this, 0, i));
        this.f22147g = e4m.b.b(new c63.b(this, 1, i));
        this.f22148h = e4m.b.b(new c63.b(this, 3, i));
        this.i = e4m.b.b(new c63.b(this, 2, i));
    }

    public final x79.a a() {
        return (x79.a) this.f.get();
    }

    public final y79.a b() {
        return (y79.a) this.f22147g.get();
    }
}
