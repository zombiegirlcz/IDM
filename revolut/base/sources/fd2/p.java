package fd2;

/* JADX INFO: loaded from: classes20.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ecm.q f133894a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a31.a f133895b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a31.a f133896c;
    public final a31.a d;
    public final a31.a e;
    public final a31.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f133897g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final n f133898h;
    public final e4m.e i;

    public p(a31.a aVar, a31.a aVar2, a31.a aVar3, a31.a aVar4, a31.a aVar5, ecm.q qVar) {
        this.f133894a = qVar;
        this.f133895b = aVar;
        this.f133896c = aVar2;
        this.d = aVar3;
        this.e = aVar4;
        this.f = aVar5;
        int i = 1;
        this.f133897g = e4m.b.b(new n(this, 0, i));
        this.f133898h = new n(this, 2, i);
        this.i = e4m.b.b(new n(this, 1, i));
    }

    public final b60.a a() {
        return (b60.a) this.f133897g.get();
    }

    public final b60.a b() {
        return (b60.a) this.i.get();
    }
}
