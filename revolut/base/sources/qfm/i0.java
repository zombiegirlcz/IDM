package qfm;

/* JADX INFO: loaded from: classes13.dex */
public final class i0 extends xfm.b implements nfm.a {
    public final kfm.p f;

    public i0(dom.a aVar, kfm.p pVar) {
        super(aVar);
        this.f = pVar;
    }

    @Override // nfm.a
    public final boolean d(Object obj2) {
        if (this.d) {
            return false;
        }
        int i = this.e;
        dom.a aVar = this.f305442a;
        if (i != 0) {
            aVar.onNext(null);
            return true;
        }
        try {
            boolean zTest = this.f.test(obj2);
            if (zTest) {
                aVar.onNext(obj2);
            }
            return zTest;
        } catch (Throwable th10) {
            m70.a.u(th10);
            this.f305443b.cancel();
            onError(th10);
            return true;
        }
    }

    @Override // dom.a
    public final void onNext(Object obj2) {
        if (d(obj2)) {
            return;
        }
        this.f305443b.a(1L);
    }

    @Override // nfm.j
    public final Object poll() {
        nfm.g gVar = this.f305444c;
        while (true) {
            Object objPoll = gVar.poll();
            if (objPoll == null) {
                return null;
            }
            if (this.f.test(objPoll)) {
                return objPoll;
            }
            if (this.e == 2) {
                gVar.a(1L);
            }
        }
    }
}
