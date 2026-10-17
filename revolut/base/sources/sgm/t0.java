package sgm;

import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes14.dex */
public final class t0 extends AtomicInteger implements fgm.l, Disposable, Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ahm.c f263167a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final igm.o f263168b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m0 f263169c;
    public final int d;
    public final fgm.o e;
    public bhm.g f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Disposable f263170g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public volatile boolean f263171h;
    public volatile boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public volatile boolean f263172j;
    public int k;

    public t0(ahm.c cVar, igm.o oVar, int i, fgm.o oVar2) {
        this.f263167a = cVar;
        this.f263168b = oVar;
        this.d = i;
        this.f263169c = new m0(cVar, this, 3);
        this.e = oVar2;
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final void dispose() {
        this.i = true;
        m0 m0Var = this.f263169c;
        m0Var.getClass();
        jgm.b.a(m0Var);
        this.f263170g.dispose();
        this.e.dispose();
        if (getAndIncrement() == 0) {
            this.f.clear();
        }
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final boolean isDisposed() {
        return this.i;
    }

    @Override // fgm.l
    public final void onComplete() {
        if (this.f263172j) {
            return;
        }
        this.f263172j = true;
        if (getAndIncrement() != 0) {
            return;
        }
        this.e.b(this);
    }

    @Override // fgm.l
    public final void onError(Throwable th10) {
        if (this.f263172j) {
            jb3.l.v(th10);
            return;
        }
        this.f263172j = true;
        dispose();
        this.f263167a.onError(th10);
    }

    @Override // fgm.l
    public final void onNext(Object obj2) {
        if (this.f263172j) {
            return;
        }
        if (this.k == 0) {
            this.f.offer(obj2);
        }
        if (getAndIncrement() != 0) {
            return;
        }
        this.e.b(this);
    }

    @Override // fgm.l
    public final void onSubscribe(Disposable disposable) {
        if (jgm.b.f(this.f263170g, disposable)) {
            this.f263170g = disposable;
            if (disposable instanceof bhm.b) {
                bhm.b bVar = (bhm.b) disposable;
                int iB = bVar.b(3);
                if (iB == 1) {
                    this.k = iB;
                    this.f = bVar;
                    this.f263172j = true;
                    this.f263167a.onSubscribe(this);
                    if (getAndIncrement() != 0) {
                        return;
                    }
                    this.e.b(this);
                    return;
                }
                if (iB == 2) {
                    this.k = iB;
                    this.f = bVar;
                    this.f263167a.onSubscribe(this);
                    return;
                }
            }
            this.f = new bhm.i(this.d);
            this.f263167a.onSubscribe(this);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        while (!this.i) {
            if (!this.f263171h) {
                boolean z = this.f263172j;
                try {
                    Object objPoll = this.f.poll();
                    boolean z3 = objPoll == null;
                    if (z && z3) {
                        this.i = true;
                        this.f263167a.onComplete();
                        this.e.dispose();
                        return;
                    } else if (!z3) {
                        try {
                            Object objApply = this.f263168b.apply(objPoll);
                            Objects.requireNonNull(objApply, "The mapper returned a null ObservableSource");
                            ObservableSource observableSource = (ObservableSource) objApply;
                            this.f263171h = true;
                            observableSource.subscribe(this.f263169c);
                        } catch (Throwable th10) {
                            ce9.m.F(th10);
                            dispose();
                            this.f.clear();
                            this.f263167a.onError(th10);
                            this.e.dispose();
                            return;
                        }
                    }
                } catch (Throwable th11) {
                    ce9.m.F(th11);
                    dispose();
                    this.f.clear();
                    this.f263167a.onError(th11);
                    this.e.dispose();
                    return;
                }
            }
            if (decrementAndGet() == 0) {
                return;
            }
        }
        this.f.clear();
    }
}
