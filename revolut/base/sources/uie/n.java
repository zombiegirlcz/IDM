package uie;

/* JADX INFO: loaded from: classes8.dex */
public final class n implements qie.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rk0.c f280409a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f280410b;

    public n(rk0.c cVar) {
        this.f280409a = cVar;
        int i = 21;
        this.f280410b = e4m.b.b(new tn3.a(this, 0, i));
        e4m.b.b(new tn3.a(this, 1, i));
    }

    @Override // qie.b
    public final vie.i b() {
        return (vie.i) this.f280410b.get();
    }
}
