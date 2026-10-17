package sgm;

import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes14.dex */
public final class z6 extends x6 implements Runnable {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Scheduler f263332m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f263333n;
    public final long o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final fgm.o f263334p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f263335q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public fhm.f f263336r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final ggm.b f263337s;

    public z6(int i, long j2, long j3, fgm.l lVar, Scheduler scheduler, TimeUnit timeUnit, boolean z) {
        super(lVar, j2, timeUnit, i);
        this.f263332m = scheduler;
        this.o = j3;
        this.f263333n = z;
        if (z) {
            this.f263334p = scheduler.b();
        } else {
            this.f263334p = null;
        }
        this.f263337s = new ggm.b();
    }

    @Override // sgm.x6
    public final void a() {
        ggm.b bVar = this.f263337s;
        bVar.getClass();
        jgm.b.a(bVar);
        fgm.o oVar = this.f263334p;
        if (oVar != null) {
            oVar.dispose();
        }
    }

    @Override // sgm.x6
    public final void b() {
        if (this.f263285j.get()) {
            return;
        }
        this.f = 1L;
        this.f263286l.getAndIncrement();
        fhm.f fVarC = fhm.f.c(this.e, this);
        this.f263336r = fVarC;
        mgm.b bVar = new mgm.b(fVarC);
        this.f263280a.onNext(bVar);
        y6 y6Var = new y6(this, 1L);
        boolean z = this.f263333n;
        ggm.b bVar2 = this.f263337s;
        if (z) {
            long j2 = this.f263282c;
            Disposable disposableC = this.f263334p.c(y6Var, j2, j2, this.d);
            bVar2.getClass();
            jgm.b.c(bVar2, disposableC);
        } else {
            long j3 = this.f263282c;
            Disposable disposableE = this.f263332m.e(y6Var, j3, j3, this.d);
            bVar2.getClass();
            jgm.b.c(bVar2, disposableE);
        }
        if (bVar.c()) {
            this.f263336r.onComplete();
        }
    }

    @Override // sgm.x6
    public final void c() {
        if (getAndIncrement() != 0) {
            return;
        }
        su9.c cVar = this.f263281b;
        fgm.l lVar = this.f263280a;
        fhm.f fVarE = this.f263336r;
        int iAddAndGet = 1;
        while (true) {
            if (this.k) {
                cVar.clear();
                fVarE = null;
                this.f263336r = null;
            } else {
                boolean z = this.f263283g;
                Object objPoll = cVar.poll();
                boolean z3 = objPoll == null;
                if (z && z3) {
                    Throwable th10 = this.f263284h;
                    if (th10 != null) {
                        if (fVarE != null) {
                            fVarE.onError(th10);
                        }
                        lVar.onError(th10);
                    } else {
                        if (fVarE != null) {
                            fVarE.onComplete();
                        }
                        lVar.onComplete();
                    }
                    a();
                    this.k = true;
                } else if (!z3) {
                    if (objPoll instanceof y6) {
                        if (((y6) objPoll).f263306b == this.f || !this.f263333n) {
                            this.f263335q = 0L;
                            fVarE = e(fVarE);
                        }
                    } else if (fVarE != null) {
                        fVarE.onNext(objPoll);
                        long j2 = this.f263335q + 1;
                        if (j2 == this.o) {
                            this.f263335q = 0L;
                            fVarE = e(fVarE);
                        } else {
                            this.f263335q = j2;
                        }
                    }
                }
            }
            iAddAndGet = addAndGet(-iAddAndGet);
            if (iAddAndGet == 0) {
                return;
            }
        }
    }

    public final fhm.f e(fhm.f fVar) {
        if (fVar != null) {
            fVar.onComplete();
            fVar = null;
        }
        if (this.f263285j.get()) {
            a();
            return fVar;
        }
        long j2 = this.f + 1;
        this.f = j2;
        this.f263286l.getAndIncrement();
        fhm.f fVarC = fhm.f.c(this.e, this);
        this.f263336r = fVarC;
        mgm.b bVar = new mgm.b(fVarC);
        this.f263280a.onNext(bVar);
        if (this.f263333n) {
            y6 y6Var = new y6(this, j2);
            long j3 = this.f263282c;
            Disposable disposableC = this.f263334p.c(y6Var, j3, j3, this.d);
            ggm.b bVar2 = this.f263337s;
            bVar2.getClass();
            jgm.b.d(bVar2, disposableC);
        }
        if (bVar.c()) {
            fVarC.onComplete();
        }
        return fVarC;
    }
}
