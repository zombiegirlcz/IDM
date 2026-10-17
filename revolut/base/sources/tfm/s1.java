package tfm;

/* JADX INFO: loaded from: classes13.dex */
public final class s1 extends ofm.b implements efm.y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final efm.y f270800a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kfm.a f270801b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ifm.c f270802c;
    public nfm.e d;
    public boolean e;

    public s1(efm.y yVar, kfm.a aVar) {
        this.f270800a = yVar;
        this.f270801b = aVar;
    }

    public final void a() {
        if (compareAndSet(0, 1)) {
            try {
                this.f270801b.run();
            } catch (Throwable th10) {
                m70.a.u(th10);
                mo3.a.m(th10);
            }
        }
    }

    @Override // nfm.f
    public final int b(int i) {
        nfm.e eVar = this.d;
        if (eVar == null || (i & 4) != 0) {
            return 0;
        }
        int iB = eVar.b(i);
        if (iB != 0) {
            this.e = iB == 1;
        }
        return iB;
    }

    @Override // nfm.j
    public final void clear() {
        this.d.clear();
    }

    @Override // ifm.c
    public final void dispose() {
        this.f270802c.dispose();
        a();
    }

    @Override // ifm.c
    public final boolean isDisposed() {
        return this.f270802c.isDisposed();
    }

    @Override // nfm.j
    public final boolean isEmpty() {
        return this.d.isEmpty();
    }

    @Override // efm.y
    public final void onComplete() {
        this.f270800a.onComplete();
        a();
    }

    @Override // efm.y
    public final void onError(Throwable th10) {
        this.f270800a.onError(th10);
        a();
    }

    @Override // efm.y
    public final void onNext(Object obj2) {
        this.f270800a.onNext(obj2);
    }

    @Override // efm.y
    public final void onSubscribe(ifm.c cVar) {
        if (lfm.d.f(this.f270802c, cVar)) {
            this.f270802c = cVar;
            if (cVar instanceof nfm.e) {
                this.d = (nfm.e) cVar;
            }
            this.f270800a.onSubscribe(this);
        }
    }

    @Override // nfm.j
    public final Object poll() {
        Object objPoll = this.d.poll();
        if (objPoll == null && this.e) {
            a();
        }
        return objPoll;
    }
}
