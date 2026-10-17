package ce;

/* JADX INFO: loaded from: classes.dex */
public final class r implements cf.b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a5.a f23319c = new a5.a(4);
    public static final h d = new h(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public cf.a f23320a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile cf.b f23321b;

    public r(a5.a aVar, cf.b bVar) {
        this.f23320a = aVar;
        this.f23321b = bVar;
    }

    public final void a(cf.a aVar) {
        cf.b bVar;
        cf.b bVar2;
        cf.b bVar3 = this.f23321b;
        h hVar = d;
        if (bVar3 != hVar) {
            aVar.b(bVar3);
            return;
        }
        synchronized (this) {
            bVar = this.f23321b;
            if (bVar != hVar) {
                bVar2 = bVar;
            } else {
                this.f23320a = new ae.a(this.f23320a, aVar, 3);
                bVar2 = null;
            }
        }
        if (bVar2 != null) {
            aVar.b(bVar);
        }
    }

    @Override // cf.b
    public final Object get() {
        return this.f23321b.get();
    }
}
