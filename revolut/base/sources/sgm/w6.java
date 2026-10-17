package sgm;

import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes14.dex */
public final class w6 extends AtomicInteger implements fgm.l, Disposable, Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fgm.l f263255a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ObservableSource f263256b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final igm.o f263257c;
    public final int d;
    public volatile boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public volatile boolean f263261l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public volatile boolean f263262m;
    public Disposable o;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final su9.c f263259h = new su9.c();
    public final CompositeDisposable e = new CompositeDisposable();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList f263258g = new ArrayList();
    public final AtomicLong i = new AtomicLong(1);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final AtomicBoolean f263260j = new AtomicBoolean();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ygm.c f263263n = new ygm.c();
    public final i4 f = new i4(this);

    public w6(fgm.l lVar, ObservableSource observableSource, igm.o oVar, int i) {
        this.f263255a = lVar;
        this.f263256b = observableSource;
        this.f263257c = oVar;
        this.d = i;
        new AtomicLong();
    }

    public final void a() {
        if (getAndIncrement() != 0) {
            return;
        }
        fgm.l lVar = this.f263255a;
        su9.c cVar = this.f263259h;
        ArrayList arrayList = this.f263258g;
        int iAddAndGet = 1;
        while (true) {
            if (this.k) {
                cVar.clear();
                arrayList.clear();
            } else {
                boolean z = this.f263261l;
                Object objPoll = cVar.poll();
                boolean z3 = objPoll == null;
                if (z && (z3 || this.f263263n.get() != null)) {
                    b(lVar);
                    this.k = true;
                } else if (z3) {
                    if (this.f263262m && arrayList.size() == 0) {
                        this.o.dispose();
                        i4 i4Var = this.f;
                        i4Var.getClass();
                        jgm.b.a(i4Var);
                        this.e.dispose();
                        b(lVar);
                        this.k = true;
                    }
                } else if (objPoll instanceof v6) {
                    if (!this.f263260j.get()) {
                        try {
                            Object objApply = this.f263257c.apply(((v6) objPoll).f263228a);
                            Objects.requireNonNull(objApply, "The closingIndicator returned a null ObservableSource");
                            ObservableSource observableSource = (ObservableSource) objApply;
                            this.i.getAndIncrement();
                            fhm.f fVarC = fhm.f.c(this.d, this);
                            u6 u6Var = new u6(this, fVarC);
                            lVar.onNext(u6Var);
                            AtomicBoolean atomicBoolean = u6Var.d;
                            if (atomicBoolean.get() || !atomicBoolean.compareAndSet(false, true)) {
                                arrayList.add(fVarC);
                                this.e.a(u6Var);
                                observableSource.subscribe(u6Var);
                            } else {
                                fVarC.onComplete();
                            }
                        } catch (Throwable th10) {
                            ce9.m.F(th10);
                            this.o.dispose();
                            i4 i4Var2 = this.f;
                            i4Var2.getClass();
                            jgm.b.a(i4Var2);
                            this.e.dispose();
                            ce9.m.F(th10);
                            this.f263263n.a(th10);
                            this.f263261l = true;
                        }
                    }
                } else if (objPoll instanceof u6) {
                    fhm.f fVar = ((u6) objPoll).f263207b;
                    arrayList.remove(fVar);
                    this.e.b((Disposable) objPoll);
                    fVar.onComplete();
                } else {
                    Iterator it8 = arrayList.iterator();
                    while (it8.hasNext()) {
                        ((fhm.f) it8.next()).onNext(objPoll);
                    }
                }
            }
            iAddAndGet = addAndGet(-iAddAndGet);
            if (iAddAndGet == 0) {
                return;
            }
        }
    }

    public final void b(fgm.l lVar) {
        ygm.c cVar = this.f263263n;
        cVar.getClass();
        Throwable thD = ygm.g.d(cVar);
        ArrayList arrayList = this.f263258g;
        if (thD == null) {
            Iterator it8 = arrayList.iterator();
            while (it8.hasNext()) {
                ((fhm.f) it8.next()).onComplete();
            }
            lVar.onComplete();
            return;
        }
        if (thD != ygm.g.f313672a) {
            Iterator it9 = arrayList.iterator();
            while (it9.hasNext()) {
                ((fhm.f) it9.next()).onError(thD);
            }
            lVar.onError(thD);
        }
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final void dispose() {
        if (this.f263260j.compareAndSet(false, true)) {
            if (this.i.decrementAndGet() != 0) {
                i4 i4Var = this.f;
                i4Var.getClass();
                jgm.b.a(i4Var);
                return;
            }
            this.o.dispose();
            i4 i4Var2 = this.f;
            i4Var2.getClass();
            jgm.b.a(i4Var2);
            this.e.dispose();
            this.f263263n.b();
            this.k = true;
            a();
        }
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final boolean isDisposed() {
        return this.f263260j.get();
    }

    @Override // fgm.l
    public final void onComplete() {
        i4 i4Var = this.f;
        i4Var.getClass();
        jgm.b.a(i4Var);
        this.e.dispose();
        this.f263261l = true;
        a();
    }

    @Override // fgm.l
    public final void onError(Throwable th10) {
        i4 i4Var = this.f;
        i4Var.getClass();
        jgm.b.a(i4Var);
        this.e.dispose();
        if (this.f263263n.a(th10)) {
            this.f263261l = true;
            a();
        }
    }

    @Override // fgm.l
    public final void onNext(Object obj2) {
        this.f263259h.offer(obj2);
        a();
    }

    @Override // fgm.l
    public final void onSubscribe(Disposable disposable) {
        if (jgm.b.f(this.o, disposable)) {
            this.o = disposable;
            this.f263255a.onSubscribe(this);
            this.f263256b.subscribe(this.f);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.i.decrementAndGet() == 0) {
            this.o.dispose();
            i4 i4Var = this.f;
            i4Var.getClass();
            jgm.b.a(i4Var);
            this.e.dispose();
            this.f263263n.b();
            this.k = true;
            a();
        }
    }
}
