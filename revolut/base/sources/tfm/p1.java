package tfm;

/* JADX INFO: loaded from: classes13.dex */
public final class p1 extends ofm.a {
    public final kfm.o f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final kfm.d f270712g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Object f270713h;
    public boolean i;

    public p1(efm.y yVar, kfm.o oVar, kfm.d dVar) {
        super(yVar);
        this.f = oVar;
        this.f270712g = dVar;
    }

    @Override // efm.y
    public final void onNext(Object obj2) {
        if (this.d) {
            return;
        }
        int i = this.e;
        efm.y yVar = this.f224907a;
        if (i != 0) {
            yVar.onNext(obj2);
            return;
        }
        try {
            Object objApply = this.f.apply(obj2);
            if (this.i) {
                boolean zTest = this.f270712g.test(this.f270713h, objApply);
                this.f270713h = objApply;
                if (zTest) {
                    return;
                }
            } else {
                this.i = true;
                this.f270713h = objApply;
            }
            yVar.onNext(obj2);
        } catch (Throwable th10) {
            c(th10);
        }
    }

    @Override // nfm.j
    public final Object poll() {
        while (true) {
            Object objPoll = this.f224909c.poll();
            if (objPoll == null) {
                return null;
            }
            Object objApply = this.f.apply(objPoll);
            if (!this.i) {
                this.i = true;
                this.f270713h = objApply;
                return objPoll;
            }
            if (!this.f270712g.test(this.f270713h, objApply)) {
                this.f270713h = objApply;
                return objPoll;
            }
            this.f270713h = objApply;
        }
    }
}
