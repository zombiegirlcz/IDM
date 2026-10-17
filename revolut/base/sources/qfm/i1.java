package qfm;

/* JADX INFO: loaded from: classes4.dex */
public final class i1 extends xfm.b {
    public final kfm.o f;

    public i1(dom.a aVar, kfm.o oVar) {
        super(aVar);
        this.f = oVar;
    }

    @Override // dom.a
    public final void onNext(Object obj2) {
        if (this.d) {
            return;
        }
        int i = this.e;
        dom.a aVar = this.f305442a;
        if (i != 0) {
            aVar.onNext(null);
            return;
        }
        try {
            Object objApply = this.f.apply(obj2);
            mfm.f.b(objApply, "The mapper function returned a null value.");
            aVar.onNext(objApply);
        } catch (Throwable th10) {
            m70.a.u(th10);
            this.f305443b.cancel();
            onError(th10);
        }
    }

    @Override // nfm.j
    public final Object poll() {
        Object objPoll = this.f305444c.poll();
        if (objPoll == null) {
            return null;
        }
        Object objApply = this.f.apply(objPoll);
        mfm.f.b(objApply, "The mapper function returned a null value.");
        return objApply;
    }
}
