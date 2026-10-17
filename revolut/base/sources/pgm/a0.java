package pgm;

/* JADX INFO: loaded from: classes14.dex */
public final class a0 extends wgm.b implements bhm.a {
    public final igm.p e;

    public a0(dom.a aVar, igm.p pVar) {
        super(aVar);
        this.e = pVar;
    }

    @Override // bhm.c
    public final int b(int i) {
        return f(7);
    }

    @Override // bhm.a
    public final boolean d(Object obj2) {
        if (this.d) {
            return false;
        }
        try {
            boolean zTest = this.e.test(obj2);
            if (zTest) {
                this.f297348a.onNext(obj2);
            }
            return zTest;
        } catch (Throwable th10) {
            c(th10);
            return true;
        }
    }

    @Override // dom.a
    public final void onNext(Object obj2) {
        if (d(obj2)) {
            return;
        }
        this.f297349b.a(1L);
    }

    @Override // bhm.g
    public final Object poll() {
        Object objPoll;
        bhm.d dVar = this.f297350c;
        do {
            objPoll = dVar.poll();
            if (objPoll == null) {
                return null;
            }
        } while (!this.e.test(objPoll));
        return objPoll;
    }
}
