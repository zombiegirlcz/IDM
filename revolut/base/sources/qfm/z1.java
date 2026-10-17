package qfm;

/* JADX INFO: loaded from: classes13.dex */
public abstract class z1 extends yfm.f implements efm.j {
    public final jhm.a i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final dgm.f f245593j;
    public final y1 k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f245594l;

    public z1(jhm.a aVar, dgm.f fVar, y1 y1Var) {
        super(false);
        this.i = aVar;
        this.f245593j = fVar;
        this.k = y1Var;
    }

    @Override // yfm.f, dom.b
    public final void cancel() {
        super.cancel();
        this.k.cancel();
    }

    public final void h(Object obj2) {
        f(yfm.d.INSTANCE);
        long j2 = this.f245594l;
        if (j2 != 0) {
            this.f245594l = 0L;
            c(j2);
        }
        this.k.a(1L);
        this.f245593j.onNext(obj2);
    }

    public void onError(Throwable th10) {
        h(th10);
    }

    @Override // dom.a
    public final void onNext(Object obj2) {
        this.f245594l++;
        this.i.onNext(obj2);
    }
}
