package sgm;

import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes14.dex */
public final class n0 extends AtomicInteger implements fgm.l, Disposable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fgm.l f263010a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final igm.o f263011b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f263012c;
    public final ygm.c d = new ygm.c();
    public final m0 e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public bhm.g f263013g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Disposable f263014h;
    public volatile boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public volatile boolean f263015j;
    public volatile boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f263016l;

    public n0(int i, fgm.l lVar, igm.o oVar, boolean z) {
        this.f263010a = lVar;
        this.f263011b = oVar;
        this.f263012c = i;
        this.f = z;
        this.e = new m0(lVar, this, 0);
    }

    public final void a() {
        if (getAndIncrement() != 0) {
            return;
        }
        fgm.l lVar = this.f263010a;
        bhm.g gVar = this.f263013g;
        ygm.c cVar = this.d;
        while (true) {
            if (!this.i) {
                if (this.k) {
                    gVar.clear();
                    return;
                }
                if (!this.f && ((Throwable) cVar.get()) != null) {
                    gVar.clear();
                    this.k = true;
                    cVar.e(lVar);
                    return;
                }
                boolean z = this.f263015j;
                try {
                    Object objPoll = gVar.poll();
                    boolean z3 = objPoll == null;
                    if (z && z3) {
                        this.k = true;
                        cVar.e(lVar);
                        return;
                    }
                    if (!z3) {
                        try {
                            Object objApply = this.f263011b.apply(objPoll);
                            Objects.requireNonNull(objApply, "The mapper returned a null ObservableSource");
                            ObservableSource observableSource = (ObservableSource) objApply;
                            if (observableSource instanceof igm.q) {
                                try {
                                    Object obj2 = ((igm.q) observableSource).get();
                                    if (obj2 != null && !this.k) {
                                        lVar.onNext(obj2);
                                    }
                                } catch (Throwable th10) {
                                    ce9.m.F(th10);
                                    cVar.a(th10);
                                }
                            } else {
                                this.i = true;
                                observableSource.subscribe(this.e);
                            }
                        } catch (Throwable th11) {
                            ce9.m.F(th11);
                            this.k = true;
                            this.f263014h.dispose();
                            gVar.clear();
                            cVar.a(th11);
                            cVar.e(lVar);
                            return;
                        }
                    }
                } catch (Throwable th12) {
                    ce9.m.F(th12);
                    this.k = true;
                    this.f263014h.dispose();
                    cVar.a(th12);
                    cVar.e(lVar);
                    return;
                }
            }
            if (decrementAndGet() == 0) {
                return;
            }
        }
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final void dispose() {
        this.k = true;
        this.f263014h.dispose();
        m0 m0Var = this.e;
        m0Var.getClass();
        jgm.b.a(m0Var);
        this.d.b();
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final boolean isDisposed() {
        return this.k;
    }

    @Override // fgm.l
    public final void onComplete() {
        this.f263015j = true;
        a();
    }

    @Override // fgm.l
    public final void onError(Throwable th10) {
        if (this.d.a(th10)) {
            this.f263015j = true;
            a();
        }
    }

    @Override // fgm.l
    public final void onNext(Object obj2) {
        if (this.f263016l == 0) {
            this.f263013g.offer(obj2);
        }
        a();
    }

    @Override // fgm.l
    public final void onSubscribe(Disposable disposable) {
        if (jgm.b.f(this.f263014h, disposable)) {
            this.f263014h = disposable;
            if (disposable instanceof bhm.b) {
                bhm.b bVar = (bhm.b) disposable;
                int iB = bVar.b(3);
                if (iB == 1) {
                    this.f263016l = iB;
                    this.f263013g = bVar;
                    this.f263015j = true;
                    this.f263010a.onSubscribe(this);
                    a();
                    return;
                }
                if (iB == 2) {
                    this.f263016l = iB;
                    this.f263013g = bVar;
                    this.f263010a.onSubscribe(this);
                    return;
                }
            }
            this.f263013g = new bhm.i(this.f263012c);
            this.f263010a.onSubscribe(this);
        }
    }
}
