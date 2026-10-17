package qfm;

import efm.c0;

/* JADX INFO: loaded from: classes4.dex */
public final class m1 extends k1 {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final dom.a f245475m;

    public m1(dom.a aVar, c0.a aVar2, int i) {
        super(aVar2, i);
        this.f245475m = aVar;
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
                    this.f245475m.e(this);
                    return;
                }
                if (iB == 2) {
                    this.f245449j = 2;
                    this.f = gVar;
                    this.f245475m.e(this);
                    bVar.a(this.f245445b);
                    return;
                }
            }
            this.f = new vfm.b(this.f245445b);
            this.f245475m.e(this);
            bVar.a(this.f245445b);
        }
    }

    @Override // qfm.k1
    public final void f() {
        dom.a aVar = this.f245475m;
        nfm.j jVar = this.f;
        long j2 = this.k;
        int iAddAndGet = 1;
        while (true) {
            long jAddAndGet = this.d.get();
            while (j2 != jAddAndGet) {
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
                    aVar.onNext(objPoll);
                    j2++;
                    if (j2 == this.f245446c) {
                        if (jAddAndGet != Long.MAX_VALUE) {
                            jAddAndGet = this.d.addAndGet(-j2);
                        }
                        this.e.a(j2);
                        j2 = 0;
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
            if (j2 == jAddAndGet && c(this.f245448h, jVar.isEmpty(), aVar)) {
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

    @Override // qfm.k1
    public final void h() {
        int iAddAndGet = 1;
        while (!this.f245447g) {
            boolean z = this.f245448h;
            this.f245475m.onNext(null);
            if (z) {
                this.f245447g = true;
                Throwable th10 = this.i;
                if (th10 != null) {
                    this.f245475m.onError(th10);
                } else {
                    this.f245475m.onComplete();
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
        dom.a aVar = this.f245475m;
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
                    }
                    aVar.onNext(objPoll);
                    j2++;
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
            long j2 = this.k + 1;
            if (j2 == this.f245446c) {
                this.k = 0L;
                this.e.a(j2);
                return objPoll;
            }
            this.k = j2;
        }
        return objPoll;
    }
}
