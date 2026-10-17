package pgm;

/* JADX INFO: loaded from: classes14.dex */
public final class u0 extends t0 {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final bhm.a f236153m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f236154n;

    public u0(bhm.a aVar, fgm.o oVar, int i) {
        super(oVar, i);
        this.f236153m = aVar;
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
                    this.f236153m.e(this);
                    return;
                }
                if (iB == 2) {
                    this.f236149j = 2;
                    this.f = dVar;
                    this.f236153m.e(this);
                    bVar.a(this.f236145b);
                    return;
                }
            }
            this.f = new bhm.h(this.f236145b);
            this.f236153m.e(this);
            bVar.a(this.f236145b);
        }
    }

    @Override // pgm.t0
    public final void f() {
        bhm.a aVar = this.f236153m;
        bhm.g gVar = this.f;
        long j2 = this.k;
        long j3 = this.f236154n;
        int iAddAndGet = 1;
        do {
            long j5 = this.d.get();
            while (j2 != j5) {
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
                    if (aVar.d(objPoll)) {
                        j2++;
                    }
                    j3++;
                    if (j3 == this.f236146c) {
                        this.e.a(j3);
                        j3 = 0;
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
            if (j2 == j5 && c(this.f236148h, gVar.isEmpty(), aVar)) {
                return;
            }
            this.k = j2;
            this.f236154n = j3;
            iAddAndGet = addAndGet(-iAddAndGet);
        } while (iAddAndGet != 0);
    }

    @Override // pgm.t0
    public final void h() {
        int iAddAndGet = 1;
        while (!this.f236147g) {
            boolean z = this.f236148h;
            this.f236153m.onNext(null);
            if (z) {
                this.f236147g = true;
                Throwable th10 = this.i;
                if (th10 != null) {
                    this.f236153m.onError(th10);
                } else {
                    this.f236153m.onComplete();
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
        bhm.a aVar = this.f236153m;
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
                    } else if (aVar.d(objPoll)) {
                        j2++;
                    }
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
            long j2 = this.f236154n + 1;
            if (j2 == this.f236146c) {
                this.f236154n = 0L;
                this.e.a(j2);
                return objPoll;
            }
            this.f236154n = j2;
        }
        return objPoll;
    }
}
