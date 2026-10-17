package qfm;

/* JADX INFO: loaded from: classes13.dex */
public final class h extends yfm.f implements efm.j {
    public final e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f245418j;

    public h(e eVar) {
        super(false);
        this.i = eVar;
    }

    @Override // dom.a
    public final void onComplete() {
        long j2 = this.f245418j;
        if (j2 != 0) {
            this.f245418j = 0L;
            c(j2);
        }
        e eVar = this.i;
        eVar.k = false;
        eVar.f();
    }

    @Override // dom.a
    public final void onError(Throwable th10) {
        long j2 = this.f245418j;
        if (j2 != 0) {
            this.f245418j = 0L;
            c(j2);
        }
        this.i.b(th10);
    }

    @Override // dom.a
    public final void onNext(Object obj2) {
        this.f245418j++;
        this.i.c(obj2);
    }
}
