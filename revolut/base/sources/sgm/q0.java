package sgm;

import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.ArrayDeque;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes14.dex */
public final class q0 extends AtomicInteger implements fgm.l, Disposable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fgm.l f263086a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final igm.o f263087b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f263088c;
    public final int d;
    public final ygm.f e;
    public final ygm.c f = new ygm.c();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayDeque f263089g = new ArrayDeque();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public bhm.g f263090h;
    public Disposable i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public volatile boolean f263091j;
    public int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public volatile boolean f263092l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ngm.m f263093m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f263094n;

    public q0(int i, int i2, fgm.l lVar, igm.o oVar, ygm.f fVar) {
        this.f263086a = lVar;
        this.f263087b = oVar;
        this.f263088c = i;
        this.d = i2;
        this.e = fVar;
    }

    public final void a() {
        ngm.m mVar = this.f263093m;
        if (mVar != null) {
            jgm.b.a(mVar);
        }
        while (true) {
            ngm.m mVar2 = (ngm.m) this.f263089g.poll();
            if (mVar2 == null) {
                return;
            } else {
                jgm.b.a(mVar2);
            }
        }
    }

    public final void b() {
        Object objPoll;
        boolean z;
        if (getAndIncrement() != 0) {
            return;
        }
        bhm.g gVar = this.f263090h;
        ArrayDeque arrayDeque = this.f263089g;
        fgm.l lVar = this.f263086a;
        ygm.f fVar = this.e;
        int iAddAndGet = 1;
        while (true) {
            int i = this.f263094n;
            while (i != this.f263088c) {
                if (this.f263092l) {
                    gVar.clear();
                    a();
                    return;
                }
                if (fVar == ygm.f.IMMEDIATE && ((Throwable) this.f.get()) != null) {
                    gVar.clear();
                    a();
                    this.f.e(this.f263086a);
                    return;
                }
                try {
                    Object objPoll2 = gVar.poll();
                    if (objPoll2 == null) {
                        break;
                    }
                    Object objApply = this.f263087b.apply(objPoll2);
                    Objects.requireNonNull(objApply, "The mapper returned a null ObservableSource");
                    ObservableSource observableSource = (ObservableSource) objApply;
                    ngm.m mVar = new ngm.m(this, this.d);
                    arrayDeque.offer(mVar);
                    observableSource.subscribe(mVar);
                    i++;
                } catch (Throwable th10) {
                    ce9.m.F(th10);
                    this.i.dispose();
                    gVar.clear();
                    a();
                    this.f.a(th10);
                    this.f.e(this.f263086a);
                    return;
                }
            }
            this.f263094n = i;
            if (this.f263092l) {
                gVar.clear();
                a();
                return;
            }
            if (fVar == ygm.f.IMMEDIATE && ((Throwable) this.f.get()) != null) {
                gVar.clear();
                a();
                this.f.e(this.f263086a);
                return;
            }
            ngm.m mVar2 = this.f263093m;
            if (mVar2 == null) {
                if (fVar == ygm.f.BOUNDARY && ((Throwable) this.f.get()) != null) {
                    gVar.clear();
                    a();
                    this.f.e(lVar);
                    return;
                }
                boolean z3 = this.f263091j;
                ngm.m mVar3 = (ngm.m) arrayDeque.poll();
                boolean z4 = mVar3 == null;
                if (z3 && z4) {
                    if (((Throwable) this.f.get()) == null) {
                        lVar.onComplete();
                        return;
                    }
                    gVar.clear();
                    a();
                    this.f.e(lVar);
                    return;
                }
                if (!z4) {
                    this.f263093m = mVar3;
                }
                mVar2 = mVar3;
            }
            if (mVar2 != null) {
                bhm.g gVar2 = mVar2.f215260c;
                while (!this.f263092l) {
                    boolean z6 = mVar2.d;
                    if (fVar == ygm.f.IMMEDIATE && ((Throwable) this.f.get()) != null) {
                        gVar.clear();
                        a();
                        this.f.e(lVar);
                        return;
                    }
                    try {
                        objPoll = gVar2.poll();
                        z = objPoll == null;
                    } catch (Throwable th11) {
                        ce9.m.F(th11);
                        this.f.a(th11);
                        this.f263093m = null;
                        this.f263094n--;
                    }
                    if (z6 && z) {
                        this.f263093m = null;
                        this.f263094n--;
                    } else if (!z) {
                        lVar.onNext(objPoll);
                    }
                }
                gVar.clear();
                a();
                return;
            }
            iAddAndGet = addAndGet(-iAddAndGet);
            if (iAddAndGet == 0) {
                return;
            }
        }
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final void dispose() {
        if (this.f263092l) {
            return;
        }
        this.f263092l = true;
        this.i.dispose();
        this.f.b();
        if (getAndIncrement() == 0) {
            do {
                this.f263090h.clear();
                a();
            } while (decrementAndGet() != 0);
        }
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final boolean isDisposed() {
        return this.f263092l;
    }

    @Override // fgm.l
    public final void onComplete() {
        this.f263091j = true;
        b();
    }

    @Override // fgm.l
    public final void onError(Throwable th10) {
        if (this.f.a(th10)) {
            this.f263091j = true;
            b();
        }
    }

    @Override // fgm.l
    public final void onNext(Object obj2) {
        if (this.k == 0) {
            this.f263090h.offer(obj2);
        }
        b();
    }

    @Override // fgm.l
    public final void onSubscribe(Disposable disposable) {
        if (jgm.b.f(this.i, disposable)) {
            this.i = disposable;
            if (disposable instanceof bhm.b) {
                bhm.b bVar = (bhm.b) disposable;
                int iB = bVar.b(3);
                if (iB == 1) {
                    this.k = iB;
                    this.f263090h = bVar;
                    this.f263091j = true;
                    this.f263086a.onSubscribe(this);
                    b();
                    return;
                }
                if (iB == 2) {
                    this.k = iB;
                    this.f263090h = bVar;
                    this.f263086a.onSubscribe(this);
                    return;
                }
            }
            this.f263090h = new bhm.i(this.d);
            this.f263086a.onSubscribe(this);
        }
    }
}
