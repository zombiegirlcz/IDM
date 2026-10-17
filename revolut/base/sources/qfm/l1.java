package qfm;

import efm.c0;

/* JADX INFO: loaded from: classes4.dex */
public final class l1 extends k1 {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final nfm.a f245466m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f245467n;

    public l1(nfm.a aVar, c0.a aVar2, int i) {
        super(aVar2, i);
        this.f245466m = aVar;
    }

    @Override // dom.a
    public final void e(dom.b bVar) {
        if (yfm.g.h(this.e, bVar)) {
            this.e = bVar;
            if (bVar instanceof nfm.g) {
                nfm.g gVar = (nfm.g) bVar;
                int iB = gVar.b(7);
                if (iB == 1) {
                    this.f245449j = 1;
                    this.f = gVar;
                    this.f245448h = true;
                    this.f245466m.e(this);
                    return;
                }
                if (iB == 2) {
                    this.f245449j = 2;
                    this.f = gVar;
                    this.f245466m.e(this);
                    bVar.a(this.f245445b);
                    return;
                }
            }
            this.f = new vfm.b(this.f245445b);
            this.f245466m.e(this);
            bVar.a(this.f245445b);
        }
    }

    @Override // qfm.k1
    public final void f() {
        nfm.a aVar = this.f245466m;
        nfm.j jVar = this.f;
        long j2 = this.k;
        long j3 = this.f245467n;
        int iAddAndGet = 1;
        while (true) {
            long j5 = this.d.get();
            while (j2 != j5) {
                boolean z = this.f245448h;
                try {
                    Object objPoll = jVar.poll();
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
                    if (j3 == this.f245446c) {
                        this.e.a(j3);
                        j3 = 0;
                    }
                } catch (Throwable th10) {
                    m70.a.u(th10);
                    this.f245447g = true;
                    this.e.cancel();
                    jVar.clear();
                    aVar.onError(th10);
                    this.f245444a.dispose();
                    return;
                }
            }
            if (j2 == j5 && c(this.f245448h, jVar.isEmpty(), aVar)) {
                return;
            }
            int i = get();
            if (iAddAndGet == i) {
                this.k = j2;
                this.f245467n = j3;
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            } else {
                iAddAndGet = i;
            }
        }
    }

    @Override // qfm.k1
    public final void h() {
        int iAddAndGet = 1;
        while (!this.f245447g) {
            boolean z = this.f245448h;
            this.f245466m.onNext(null);
            if (z) {
                this.f245447g = true;
                Throwable th10 = this.i;
                if (th10 != null) {
                    this.f245466m.onError(th10);
                } else {
                    this.f245466m.onComplete();
                }
                this.f245444a.dispose();
                return;
            }
            iAddAndGet = addAndGet(-iAddAndGet);
            if (iAddAndGet == 0) {
                return;
            }
        }
    }

    @Override // qfm.k1
    public final void i() {
        nfm.a aVar = this.f245466m;
        nfm.j jVar = this.f;
        long j2 = this.k;
        int iAddAndGet = 1;
        while (true) {
            long j3 = this.d.get();
            while (j2 != j3) {
                try {
                    Object objPoll = jVar.poll();
                    if (this.f245447g) {
                        return;
                    }
                    if (objPoll == null) {
                        this.f245447g = true;
                        aVar.onComplete();
                        this.f245444a.dispose();
                        return;
                    } else if (aVar.d(objPoll)) {
                        j2++;
                    }
                } catch (Throwable th10) {
                    m70.a.u(th10);
                    this.f245447g = true;
                    this.e.cancel();
                    aVar.onError(th10);
                    this.f245444a.dispose();
                    return;
                }
            }
            if (this.f245447g) {
                return;
            }
            if (jVar.isEmpty()) {
                this.f245447g = true;
                aVar.onComplete();
                this.f245444a.dispose();
                return;
            } else {
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
    }

    @Override // nfm.j
    public final Object poll() {
        Object objPoll = this.f.poll();
        if (objPoll != null && this.f245449j != 1) {
            long j2 = this.f245467n + 1;
            if (j2 == this.f245446c) {
                this.f245467n = 0L;
                this.e.a(j2);
                return objPoll;
            }
            this.f245467n = j2;
        }
        return objPoll;
    }
}
