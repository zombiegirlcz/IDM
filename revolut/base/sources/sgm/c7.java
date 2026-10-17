package sgm;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes14.dex */
public final class c7 extends x6 implements Runnable {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final Object f262750p = new Object();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final Object f262751q = new Object();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final long f262752m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final fgm.o f262753n;
    public final LinkedList o;

    public c7(fgm.l lVar, long j2, long j3, TimeUnit timeUnit, fgm.o oVar, int i) {
        super(lVar, j2, timeUnit, i);
        this.f262752m = j3;
        this.f262753n = oVar;
        this.o = new LinkedList();
    }

    @Override // sgm.x6
    public final void a() {
        this.f262753n.dispose();
    }

    @Override // sgm.x6
    public final void b() {
        if (this.f263285j.get()) {
            return;
        }
        this.f = 1L;
        this.f263286l.getAndIncrement();
        fhm.f fVarC = fhm.f.c(this.e, this);
        LinkedList linkedList = this.o;
        linkedList.add(fVarC);
        mgm.b bVar = new mgm.b(fVarC);
        this.f263280a.onNext(bVar);
        this.f262753n.a(new b7(this, false), this.f263282c, this.d);
        b7 b7Var = new b7(this, true);
        long j2 = this.f262752m;
        this.f262753n.c(b7Var, j2, j2, this.d);
        if (bVar.c()) {
            fVarC.onComplete();
            linkedList.remove(fVarC);
        }
    }

    @Override // sgm.x6
    public final void c() {
        if (getAndIncrement() != 0) {
            return;
        }
        su9.c cVar = this.f263281b;
        fgm.l lVar = this.f263280a;
        LinkedList linkedList = this.o;
        int iAddAndGet = 1;
        while (true) {
            if (this.k) {
                cVar.clear();
                linkedList.clear();
            } else {
                boolean z = this.f263283g;
                Object objPoll = cVar.poll();
                boolean z3 = objPoll == null;
                if (z && z3) {
                    Throwable th10 = this.f263284h;
                    if (th10 != null) {
                        Iterator it8 = linkedList.iterator();
                        while (it8.hasNext()) {
                            ((fhm.f) it8.next()).onError(th10);
                        }
                        lVar.onError(th10);
                    } else {
                        Iterator it9 = linkedList.iterator();
                        while (it9.hasNext()) {
                            ((fhm.f) it9.next()).onComplete();
                        }
                        lVar.onComplete();
                    }
                    a();
                    this.k = true;
                } else if (!z3) {
                    if (objPoll == f262750p) {
                        if (!this.f263285j.get()) {
                            this.f++;
                            this.f263286l.getAndIncrement();
                            fhm.f fVarC = fhm.f.c(this.e, this);
                            linkedList.add(fVarC);
                            mgm.b bVar = new mgm.b(fVarC);
                            lVar.onNext(bVar);
                            this.f262753n.a(new b7(this, false), this.f263282c, this.d);
                            if (bVar.c()) {
                                fVarC.onComplete();
                            }
                        }
                    } else if (objPoll != f262751q) {
                        Iterator it10 = linkedList.iterator();
                        while (it10.hasNext()) {
                            ((fhm.f) it10.next()).onNext(objPoll);
                        }
                    } else if (!linkedList.isEmpty()) {
                        ((fhm.f) linkedList.remove(0)).onComplete();
                    }
                }
            }
            iAddAndGet = addAndGet(-iAddAndGet);
            if (iAddAndGet == 0) {
                return;
            }
        }
    }
}
