package tfm;

/* JADX INFO: loaded from: classes4.dex */
public final class r1 extends ofm.a {
    public final kfm.g f;

    public r1(efm.y yVar, kfm.g gVar) {
        super(yVar);
        this.f = gVar;
    }

    @Override // efm.y
    public final void onNext(Object obj2) {
        this.f224907a.onNext(obj2);
        if (this.e == 0) {
            try {
                this.f.accept(obj2);
            } catch (Throwable th10) {
                c(th10);
            }
        }
    }

    @Override // nfm.j
    public final Object poll() {
        Object objPoll = this.f224909c.poll();
        if (objPoll != null) {
            this.f.accept(objPoll);
        }
        return objPoll;
    }
}
