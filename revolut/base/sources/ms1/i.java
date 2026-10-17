package ms1;

/* JADX INFO: loaded from: classes20.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nj0.a f208530a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f208531b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f208532c;

    public i(nj0.a aVar) {
        this.f208530a = aVar;
        int i = 6;
        this.f208531b = e4m.b.b(new mil.a(this, 1, i));
        this.f208532c = e4m.b.b(new mil.a(this, 0, i));
    }

    public final hs1.c a() {
        return (hs1.c) this.f208532c.get();
    }
}
