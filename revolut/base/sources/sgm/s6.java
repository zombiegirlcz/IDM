package sgm;

import io.reactivex.rxjava3.disposables.Disposable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes14.dex */
public final class s6 extends AtomicInteger implements fgm.l, Disposable, Runnable {
    public static final Object k = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fgm.l f263154a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f263155b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r6 f263156c = new r6(this);
    public final AtomicReference d = new AtomicReference();
    public final AtomicInteger e = new AtomicInteger(1);
    public final su9.c f = new su9.c();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ygm.c f263157g = new ygm.c();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final AtomicBoolean f263158h = new AtomicBoolean();
    public volatile boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public fhm.f f263159j;

    public s6(fgm.l lVar, int i) {
        this.f263154a = lVar;
        this.f263155b = i;
    }

    public final void a() {
        if (getAndIncrement() != 0) {
            return;
        }
        fgm.l lVar = this.f263154a;
        su9.c cVar = this.f;
        ygm.c cVar2 = this.f263157g;
        int iAddAndGet = 1;
        while (this.e.get() != 0) {
            fhm.f fVar = this.f263159j;
            boolean z = this.i;
            if (z && cVar2.get() != null) {
                cVar.clear();
                Throwable thD = ygm.g.d(cVar2);
                if (fVar != null) {
                    this.f263159j = null;
                    fVar.onError(thD);
                }
                lVar.onError(thD);
                return;
            }
            Object objPoll = cVar.poll();
            boolean z3 = objPoll == null;
            if (z && z3) {
                cVar2.getClass();
                Throwable thD2 = ygm.g.d(cVar2);
                if (thD2 == null) {
                    if (fVar != null) {
                        this.f263159j = null;
                        fVar.onComplete();
                    }
                    lVar.onComplete();
                    return;
                }
                if (fVar != null) {
                    this.f263159j = null;
                    fVar.onError(thD2);
                }
                lVar.onError(thD2);
                return;
            }
            if (z3) {
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            } else if (objPoll != k) {
                fVar.onNext(objPoll);
            } else {
                if (fVar != null) {
                    this.f263159j = null;
                    fVar.onComplete();
                }
                if (!this.f263158h.get()) {
                    fhm.f fVarC = fhm.f.c(this.f263155b, this);
                    this.f263159j = fVarC;
                    this.e.getAndIncrement();
                    mgm.b bVar = new mgm.b(fVarC);
                    lVar.onNext(bVar);
                    if (bVar.c()) {
                        fVarC.onComplete();
                    }
                }
            }
        }
        cVar.clear();
        this.f263159j = null;
    }

    public final void b() {
        this.f.offer(k);
        a();
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final void dispose() {
        if (this.f263158h.compareAndSet(false, true)) {
            this.f263156c.dispose();
            if (this.e.decrementAndGet() == 0) {
                jgm.b.a(this.d);
            }
        }
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final boolean isDisposed() {
        return this.f263158h.get();
    }

    @Override // fgm.l
    public final void onComplete() {
        this.f263156c.dispose();
        this.i = true;
        a();
    }

    @Override // fgm.l
    public final void onError(Throwable th10) {
        this.f263156c.dispose();
        if (this.f263157g.a(th10)) {
            this.i = true;
            a();
        }
    }

    @Override // fgm.l
    public final void onNext(Object obj2) {
        this.f.offer(obj2);
        a();
    }

    @Override // fgm.l
    public final void onSubscribe(Disposable disposable) {
        if (jgm.b.e(this.d, disposable)) {
            b();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.e.decrementAndGet() == 0) {
            jgm.b.a(this.d);
        }
    }
}
