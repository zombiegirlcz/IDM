package sgm;

import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes14.dex */
public final class s0 extends AtomicInteger implements fgm.l, Disposable, Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fgm.l f263134a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final igm.o f263135b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f263136c;
    public final ygm.c d = new ygm.c();
    public final m0 e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final fgm.o f263137g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public bhm.g f263138h;
    public Disposable i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public volatile boolean f263139j;
    public volatile boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public volatile boolean f263140l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f263141m;

    public s0(fgm.l lVar, igm.o oVar, int i, boolean z, fgm.o oVar2) {
        this.f263134a = lVar;
        this.f263135b = oVar;
        this.f263136c = i;
        this.f = z;
        this.e = new m0(lVar, this, 2);
        this.f263137g = oVar2;
    }

    public final void a() {
        if (getAndIncrement() != 0) {
            return;
        }
        this.f263137g.b(this);
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final void dispose() {
        this.f263140l = true;
        this.i.dispose();
        m0 m0Var = this.e;
        m0Var.getClass();
        jgm.b.a(m0Var);
        this.f263137g.dispose();
        this.d.b();
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final boolean isDisposed() {
        return this.f263140l;
    }

    @Override // fgm.l
    public final void onComplete() {
        this.k = true;
        a();
    }

    @Override // fgm.l
    public final void onError(Throwable th10) {
        if (this.d.a(th10)) {
            this.k = true;
            a();
        }
    }

    @Override // fgm.l
    public final void onNext(Object obj2) {
        if (this.f263141m == 0) {
            this.f263138h.offer(obj2);
        }
        a();
    }

    @Override // fgm.l
    public final void onSubscribe(Disposable disposable) {
        if (jgm.b.f(this.i, disposable)) {
            this.i = disposable;
            if (disposable instanceof bhm.b) {
                bhm.b bVar = (bhm.b) disposable;
                int iB = bVar.b(3);
                if (iB == 1) {
                    this.f263141m = iB;
                    this.f263138h = bVar;
                    this.k = true;
                    this.f263134a.onSubscribe(this);
                    a();
                    return;
                }
                if (iB == 2) {
                    this.f263141m = iB;
                    this.f263138h = bVar;
                    this.f263134a.onSubscribe(this);
                    return;
                }
            }
            this.f263138h = new bhm.i(this.f263136c);
            this.f263134a.onSubscribe(this);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        fgm.l lVar = this.f263134a;
        bhm.g gVar = this.f263138h;
        ygm.c cVar = this.d;
        while (true) {
            if (!this.f263139j) {
                if (this.f263140l) {
                    gVar.clear();
                    return;
                }
                if (!this.f && ((Throwable) cVar.get()) != null) {
                    gVar.clear();
                    this.f263140l = true;
                    cVar.e(lVar);
                    this.f263137g.dispose();
                    return;
                }
                boolean z = this.k;
                try {
                    Object objPoll = gVar.poll();
                    boolean z3 = objPoll == null;
                    if (z && z3) {
                        this.f263140l = true;
                        cVar.e(lVar);
                        this.f263137g.dispose();
                        return;
                    }
                    if (!z3) {
                        try {
                            Object objApply = this.f263135b.apply(objPoll);
                            Objects.requireNonNull(objApply, "The mapper returned a null ObservableSource");
                            ObservableSource observableSource = (ObservableSource) objApply;
                            if (observableSource instanceof igm.q) {
                                try {
                                    Object obj2 = ((igm.q) observableSource).get();
                                    if (obj2 != null && !this.f263140l) {
                                        lVar.onNext(obj2);
                                    }
                                } catch (Throwable th10) {
                                    ce9.m.F(th10);
                                    cVar.a(th10);
                                }
                            } else {
                                this.f263139j = true;
                                observableSource.subscribe(this.e);
                            }
                        } catch (Throwable th11) {
                            ce9.m.F(th11);
                            this.f263140l = true;
                            this.i.dispose();
                            gVar.clear();
                            cVar.a(th11);
                            cVar.e(lVar);
                            this.f263137g.dispose();
                            return;
                        }
                    }
                } catch (Throwable th12) {
                    ce9.m.F(th12);
                    this.f263140l = true;
                    this.i.dispose();
                    cVar.a(th12);
                    cVar.e(lVar);
                    this.f263137g.dispose();
                    return;
                }
            }
            if (decrementAndGet() == 0) {
                return;
            }
        }
    }
}
