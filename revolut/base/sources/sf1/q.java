package sf1;

/* JADX INFO: loaded from: classes20.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ite.a f262304a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f262305b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f262306c;

    public q(ite.a aVar) {
        this.f262304a = aVar;
        int i = 3;
        this.f262305b = e4m.b.b(new sac.a(this, 0, i));
        this.f262306c = e4m.b.b(new sac.a(this, 1, i));
    }

    public final of1.a a() {
        return (of1.a) this.f262305b.get();
    }
}
