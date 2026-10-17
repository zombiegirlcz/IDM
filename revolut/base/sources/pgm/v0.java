package pgm;

/* JADX INFO: loaded from: classes14.dex */
public final class v0 extends t0 {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final dom.a f236161m;

    public v0(dom.a aVar, fgm.o oVar, int i) {
        super(oVar, i);
        this.f236161m = aVar;
    }

    @Override // dom.a
    public final void e(dom.b bVar) {
        if (xgm.f.h(this.e, bVar)) {
            this.e = bVar;
            if (bVar instanceof bhm.d) {
                bhm.d dVar = (bhm.d) bVar;
                int iB = dVar.b(7);
                if (iB == 1) {
                    this.f236149j = 1;
                    this.f = dVar;
                    this.f236148h = true;
                    this.f236161m.e(this);
                    return;
                }
                if (iB == 2) {
                    this.f236149j = 2;
                    this.f = dVar;
                    this.f236161m.e(this);
                    bVar.a(this.f236145b);
                    return;
                }
            }
            this.f = new bhm.h(this.f236145b);
            this.f236161m.e(this);
            bVar.a(this.f236145b);
        }
    }

    @Override // pgm.t0
    public final void f() {
        dom.a aVar = this.f236161m;
        bhm.g gVar = this.f;
        long j2 = this.k;
        int iAddAndGet = 1;
        while (true) {
            long jAddAndGet = this.d.get();
            while (j2 != jAddAndGet) {
                boolean z = this.f236148h;
                try {
                    Object objPoll = gVar.poll();
                    boolean z3 = objPoll == null;
                    if (c(z, z3, aVar)) {
                        return;
                    }
                    if (z3) {
                        break;
                    }
                    aVar.onNext(objPoll);
                    j2++;
                    if (j2 == this.f236146c) {
                        if (jAddAndGet != Long.MAX_VALUE) {
                            jAddAndGet = this.d.addAndGet(-j2);
                        }
                        this.e.a(j2);
                        j2 = 0;
                    }
                } catch (Throwable th10) {
                    ce9.m.F(th10);
                    this.f236147g = true;
                    this.e.cancel();
                    gVar.clear();
                    aVar.onError(th10);
                    this.f236144a.dispose();
                    return;
                }
            }
            if (j2 == jAddAndGet && c(this.f236148h, gVar.isEmpty(), aVar)) {
                return;
            }
            int i = get();
            if (iAddAndGet == i) {
                this.k = j2;
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            } else {
                iAddAndGet = i;
            }
        }
    }

    @Override // pgm.t0
    public final void h() {
        int iAddAndGet = 1;
        while (!this.f236147g) {
            boolean z = this.f236148h;
            this.f236161m.onNext(null);
            if (z) {
                this.f236147g = true;
                Throwable th10 = this.i;
                if (th10 != null) {
                    this.f236161m.onError(th10);
                } else {
                    this.f236161m.onComplete();
                }
                this.f236144a.dispose();
                return;
            }
            iAddAndGet = addAndGet(-iAddAndGet);
            if (iAddAndGet == 0) {
                return;
            }
        }
    }

    @Override // pgm.t0
    public final void i() {
        dom.a aVar = this.f236161m;
        bhm.g gVar = this.f;
        long j2 = this.k;
        int iAddAndGet = 1;
        do {
            long j3 = this.d.get();
            while (j2 != j3) {
                try {
                    Object objPoll = gVar.poll();
                    if (this.f236147g) {
                        return;
                    }
                    if (objPoll == null) {
                        this.f236147g = true;
                        aVar.onComplete();
                        this.f236144a.dispose();
                        return;
                    }
                    aVar.onNext(objPoll);
                    j2++;
                } catch (Throwable th10) {
                    ce9.m.F(th10);
                    this.f236147g = true;
                    this.e.cancel();
                    aVar.onError(th10);
                    this.f236144a.dispose();
                    return;
                }
            }
            if (this.f236147g) {
                return;
            }
            if (gVar.isEmpty()) {
                this.f236147g = true;
                aVar.onComplete();
                this.f236144a.dispose();
                return;
            }
            this.k = j2;
            iAddAndGet = addAndGet(-iAddAndGet);
        } while (iAddAndGet != 0);
    }

    @Override // bhm.g
    public final Object poll() {
        Object objPoll = this.f.poll();
        if (objPoll != null && this.f236149j != 1) {
            long j2 = this.k + 1;
            if (j2 == this.f236146c) {
                this.k = 0L;
                this.e.a(j2);
                return objPoll;
            }
            this.k = j2;
        }
        return objPoll;
    }
}
