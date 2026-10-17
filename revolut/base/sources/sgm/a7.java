package sgm;

import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes14.dex */
public final class a7 extends x6 implements Runnable {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final Object f262705q = new Object();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Scheduler f262706m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public fhm.f f262707n;
    public final ggm.b o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final j1 f262708p;

    public a7(fgm.l lVar, long j2, TimeUnit timeUnit, Scheduler scheduler, int i) {
        super(lVar, j2, timeUnit, i);
        this.f262706m = scheduler;
        this.o = new ggm.b();
        this.f262708p = new j1(this, 2);
    }

    @Override // sgm.x6
    public final void a() {
        ggm.b bVar = this.o;
        bVar.getClass();
        jgm.b.a(bVar);
    }

    @Override // sgm.x6
    public final void b() {
        if (this.f263285j.get()) {
            return;
        }
        this.f263286l.getAndIncrement();
        fhm.f fVarC = fhm.f.c(this.e, this.f262708p);
        this.f262707n = fVarC;
        this.f = 1L;
        mgm.b bVar = new mgm.b(fVarC);
        this.f263280a.onNext(bVar);
        long j2 = this.f263282c;
        Disposable disposableE = this.f262706m.e(this, j2, j2, this.d);
        ggm.b bVar2 = this.o;
        bVar2.getClass();
        jgm.b.c(bVar2, disposableE);
        if (bVar.c()) {
            this.f262707n.onComplete();
        }
    }

    @Override // sgm.x6
    public final void c() {
        if (getAndIncrement() != 0) {
            return;
        }
        su9.c cVar = this.f263281b;
        fgm.l lVar = this.f263280a;
        fhm.f fVarC = this.f262707n;
        int iAddAndGet = 1;
        while (true) {
            if (this.k) {
                cVar.clear();
                this.f262707n = null;
                fVarC = null;
            } else {
                boolean z = this.f263283g;
                Object objPoll = cVar.poll();
                boolean z3 = objPoll == null;
                if (z && z3) {
                    Throwable th10 = this.f263284h;
                    if (th10 != null) {
                        if (fVarC != null) {
                            fVarC.onError(th10);
                        }
                        lVar.onError(th10);
                    } else {
                        if (fVarC != null) {
                            fVarC.onComplete();
                        }
                        lVar.onComplete();
                    }
                    a();
                    this.k = true;
                } else if (!z3) {
                    if (objPoll == f262705q) {
                        if (fVarC != null) {
                            fVarC.onComplete();
                            this.f262707n = null;
                            fVarC = null;
                        }
                        if (this.f263285j.get()) {
                            ggm.b bVar = this.o;
                            bVar.getClass();
                            jgm.b.a(bVar);
                        } else {
                            this.f++;
                            this.f263286l.getAndIncrement();
                            fVarC = fhm.f.c(this.e, this.f262708p);
                            this.f262707n = fVarC;
                            mgm.b bVar2 = new mgm.b(fVarC);
                            lVar.onNext(bVar2);
                            if (bVar2.c()) {
                                fVarC.onComplete();
                            }
                        }
                    } else if (fVarC != null) {
                        fVarC.onNext(objPoll);
                    }
                }
            }
            iAddAndGet = addAndGet(-iAddAndGet);
            if (iAddAndGet == 0) {
                return;
            }
        }
    }

    @Override // sgm.x6, java.lang.Runnable
    public final void run() {
        this.f263281b.offer(f262705q);
        c();
    }
}
