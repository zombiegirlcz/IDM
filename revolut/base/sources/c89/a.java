package c89;

/* JADX INFO: loaded from: classes13.dex */
public final class a implements w79.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f22141a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fqk.a f22142b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final uy5.e f22143c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    public a(fqk.a aVar, uy5.e eVar, b bVar) {
        this.f22141a = bVar;
        this.f22142b = aVar;
        this.f22143c = eVar;
        int i = 3;
        this.d = e4m.b.b(new c63.b(this, 0, i));
        this.e = e4m.b.b(new c63.b(this, 1, i));
        this.f = e4m.b.b(new c63.b(this, 2, i));
    }

    public final pfe.d a() {
        return (pfe.d) this.e.get();
    }
}
