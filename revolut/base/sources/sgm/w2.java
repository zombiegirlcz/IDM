package sgm;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes14.dex */
public final class w2 extends AtomicInteger implements Disposable, x2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f263236a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fgm.l f263237b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final bhm.i f263238c;
    public final CompositeDisposable d;
    public final LinkedHashMap e;
    public final LinkedHashMap f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AtomicReference f263239g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final igm.o f263240h;
    public final igm.o i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final igm.c f263241j;
    public final AtomicInteger k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f263242l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f263243m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public volatile boolean f263244n;

    public w2(fgm.l lVar, igm.o oVar, igm.o oVar2, igm.c cVar, int i) {
        this.f263236a = i;
        switch (i) {
            case 1:
                this.f263237b = lVar;
                this.d = new CompositeDisposable();
                this.f263238c = new bhm.i(Observable.bufferSize());
                this.e = new LinkedHashMap();
                this.f = new LinkedHashMap();
                this.f263239g = new AtomicReference();
                this.f263240h = oVar;
                this.i = oVar2;
                this.f263241j = cVar;
                this.k = new AtomicInteger(2);
                break;
            default:
                this.f263237b = lVar;
                this.d = new CompositeDisposable();
                this.f263238c = new bhm.i(Observable.bufferSize());
                this.e = new LinkedHashMap();
                this.f = new LinkedHashMap();
                this.f263239g = new AtomicReference();
                this.f263240h = oVar;
                this.i = oVar2;
                this.f263241j = cVar;
                this.k = new AtomicInteger(2);
                break;
        }
    }

    @Override // sgm.x2
    public final void a(Throwable th10) {
        switch (this.f263236a) {
            case 0:
                if (!ygm.g.a(this.f263239g, th10)) {
                    jb3.l.v(th10);
                } else {
                    f();
                }
                break;
            default:
                if (!ygm.g.a(this.f263239g, th10)) {
                    jb3.l.v(th10);
                } else {
                    f();
                }
                break;
        }
    }

    @Override // sgm.x2
    public final void b(Throwable th10) {
        switch (this.f263236a) {
            case 0:
                if (!ygm.g.a(this.f263239g, th10)) {
                    jb3.l.v(th10);
                } else {
                    this.k.decrementAndGet();
                    f();
                }
                break;
            default:
                if (!ygm.g.a(this.f263239g, th10)) {
                    jb3.l.v(th10);
                } else {
                    this.k.decrementAndGet();
                    f();
                }
                break;
        }
    }

    @Override // sgm.x2
    public final void c(Object obj2, boolean z) {
        switch (this.f263236a) {
            case 0:
                synchronized (this) {
                    try {
                        this.f263238c.a(z ? 1 : 2, obj2);
                    } finally {
                    }
                    break;
                }
                f();
                return;
            default:
                synchronized (this) {
                    try {
                        this.f263238c.a(z ? 1 : 2, obj2);
                    } finally {
                    }
                    break;
                }
                f();
                return;
        }
    }

    @Override // sgm.x2
    public final void d(z2 z2Var) {
        switch (this.f263236a) {
            case 0:
                this.d.b(z2Var);
                this.k.decrementAndGet();
                f();
                break;
            default:
                this.d.b(z2Var);
                this.k.decrementAndGet();
                f();
                break;
        }
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final void dispose() {
        switch (this.f263236a) {
            case 0:
                if (!this.f263244n) {
                    this.f263244n = true;
                    this.d.dispose();
                    if (getAndIncrement() == 0) {
                        this.f263238c.clear();
                    }
                    break;
                }
                break;
            default:
                if (!this.f263244n) {
                    this.f263244n = true;
                    this.d.dispose();
                    if (getAndIncrement() == 0) {
                        this.f263238c.clear();
                    }
                }
                break;
        }
    }

    @Override // sgm.x2
    public final void e(boolean z, y2 y2Var) {
        switch (this.f263236a) {
            case 0:
                synchronized (this) {
                    try {
                        this.f263238c.a(z ? 3 : 4, y2Var);
                    } finally {
                    }
                    break;
                }
                f();
                return;
            default:
                synchronized (this) {
                    try {
                        this.f263238c.a(z ? 3 : 4, y2Var);
                    } finally {
                    }
                    break;
                }
                f();
                return;
        }
    }

    public final void f() {
        switch (this.f263236a) {
            case 0:
                if (getAndIncrement() == 0) {
                    bhm.i iVar = this.f263238c;
                    fgm.l lVar = this.f263237b;
                    int iAddAndGet = 1;
                    while (!this.f263244n) {
                        if (((Throwable) this.f263239g.get()) != null) {
                            iVar.clear();
                            this.d.dispose();
                            h(lVar);
                            break;
                        } else {
                            boolean z = this.k.get() == 0;
                            Integer num = (Integer) iVar.poll();
                            boolean z3 = num == null;
                            if (z && z3) {
                                Iterator it8 = this.e.values().iterator();
                                while (it8.hasNext()) {
                                    ((fhm.f) it8.next()).onComplete();
                                }
                                this.e.clear();
                                this.f.clear();
                                this.d.dispose();
                                lVar.onComplete();
                                break;
                            } else if (z3) {
                                iAddAndGet = addAndGet(-iAddAndGet);
                                if (iAddAndGet == 0) {
                                    break;
                                }
                            } else {
                                Object objPoll = iVar.poll();
                                if (num == 1) {
                                    fhm.f fVar = new fhm.f(Observable.bufferSize(), null);
                                    int i = this.f263242l;
                                    this.f263242l = i + 1;
                                    this.e.put(Integer.valueOf(i), fVar);
                                    try {
                                        Object objApply = this.f263240h.apply(objPoll);
                                        Objects.requireNonNull(objApply, "The leftEnd returned a null ObservableSource");
                                        ObservableSource observableSource = (ObservableSource) objApply;
                                        y2 y2Var = new y2(this, true, i);
                                        this.d.a(y2Var);
                                        observableSource.subscribe(y2Var);
                                        if (((Throwable) this.f263239g.get()) != null) {
                                            iVar.clear();
                                            this.d.dispose();
                                            h(lVar);
                                            break;
                                        } else {
                                            try {
                                                Object objApply2 = this.f263241j.apply(objPoll, fVar);
                                                Objects.requireNonNull(objApply2, "The resultSelector returned a null value");
                                                lVar.onNext(objApply2);
                                                Iterator it9 = this.f.values().iterator();
                                                while (it9.hasNext()) {
                                                    fVar.onNext(it9.next());
                                                }
                                            } catch (Throwable th10) {
                                                i(th10, lVar, iVar);
                                                return;
                                            }
                                        }
                                    } catch (Throwable th11) {
                                        i(th11, lVar, iVar);
                                        return;
                                    }
                                } else if (num == 2) {
                                    int i2 = this.f263243m;
                                    this.f263243m = i2 + 1;
                                    this.f.put(Integer.valueOf(i2), objPoll);
                                    try {
                                        Object objApply3 = this.i.apply(objPoll);
                                        Objects.requireNonNull(objApply3, "The rightEnd returned a null ObservableSource");
                                        ObservableSource observableSource2 = (ObservableSource) objApply3;
                                        y2 y2Var2 = new y2(this, false, i2);
                                        this.d.a(y2Var2);
                                        observableSource2.subscribe(y2Var2);
                                        if (((Throwable) this.f263239g.get()) != null) {
                                            iVar.clear();
                                            this.d.dispose();
                                            h(lVar);
                                        } else {
                                            Iterator it10 = this.e.values().iterator();
                                            while (it10.hasNext()) {
                                                ((fhm.f) it10.next()).onNext(objPoll);
                                            }
                                        }
                                    } catch (Throwable th12) {
                                        i(th12, lVar, iVar);
                                        return;
                                    }
                                    break;
                                } else if (num == 3) {
                                    y2 y2Var3 = (y2) objPoll;
                                    fhm.f fVar2 = (fhm.f) this.e.remove(Integer.valueOf(y2Var3.f263296c));
                                    this.d.c(y2Var3);
                                    if (fVar2 != null) {
                                        fVar2.onComplete();
                                    }
                                } else {
                                    y2 y2Var4 = (y2) objPoll;
                                    this.f.remove(Integer.valueOf(y2Var4.f263296c));
                                    this.d.c(y2Var4);
                                }
                            }
                        }
                    }
                    iVar.clear();
                    break;
                }
                break;
            default:
                if (getAndIncrement() == 0) {
                    bhm.i iVar2 = this.f263238c;
                    fgm.l lVar2 = this.f263237b;
                    int iAddAndGet2 = 1;
                    while (!this.f263244n) {
                        if (((Throwable) this.f263239g.get()) != null) {
                            iVar2.clear();
                            this.d.dispose();
                            h(lVar2);
                            break;
                        } else {
                            boolean z4 = this.k.get() == 0;
                            Integer num2 = (Integer) iVar2.poll();
                            boolean z6 = num2 == null;
                            if (z4 && z6) {
                                this.e.clear();
                                this.f.clear();
                                this.d.dispose();
                                lVar2.onComplete();
                                break;
                            } else if (z6) {
                                iAddAndGet2 = addAndGet(-iAddAndGet2);
                                if (iAddAndGet2 == 0) {
                                    break;
                                }
                            } else {
                                Object objPoll2 = iVar2.poll();
                                if (num2 == 1) {
                                    int i3 = this.f263242l;
                                    this.f263242l = i3 + 1;
                                    this.e.put(Integer.valueOf(i3), objPoll2);
                                    try {
                                        Object objApply4 = this.f263240h.apply(objPoll2);
                                        Objects.requireNonNull(objApply4, "The leftEnd returned a null ObservableSource");
                                        ObservableSource observableSource3 = (ObservableSource) objApply4;
                                        y2 y2Var5 = new y2(this, true, i3);
                                        this.d.a(y2Var5);
                                        observableSource3.subscribe(y2Var5);
                                        if (((Throwable) this.f263239g.get()) != null) {
                                            iVar2.clear();
                                            this.d.dispose();
                                            h(lVar2);
                                            break;
                                        } else {
                                            Iterator it11 = this.f.values().iterator();
                                            while (it11.hasNext()) {
                                                try {
                                                    Object objApply5 = this.f263241j.apply(objPoll2, it11.next());
                                                    Objects.requireNonNull(objApply5, "The resultSelector returned a null value");
                                                    lVar2.onNext(objApply5);
                                                } catch (Throwable th13) {
                                                    i(th13, lVar2, iVar2);
                                                    return;
                                                }
                                            }
                                        }
                                    } catch (Throwable th14) {
                                        i(th14, lVar2, iVar2);
                                        return;
                                    }
                                } else if (num2 == 2) {
                                    int i5 = this.f263243m;
                                    this.f263243m = i5 + 1;
                                    this.f.put(Integer.valueOf(i5), objPoll2);
                                    try {
                                        Object objApply6 = this.i.apply(objPoll2);
                                        Objects.requireNonNull(objApply6, "The rightEnd returned a null ObservableSource");
                                        ObservableSource observableSource4 = (ObservableSource) objApply6;
                                        y2 y2Var6 = new y2(this, false, i5);
                                        this.d.a(y2Var6);
                                        observableSource4.subscribe(y2Var6);
                                        if (((Throwable) this.f263239g.get()) != null) {
                                            iVar2.clear();
                                            this.d.dispose();
                                            h(lVar2);
                                            break;
                                        } else {
                                            Iterator it12 = this.e.values().iterator();
                                            while (it12.hasNext()) {
                                                try {
                                                    Object objApply7 = this.f263241j.apply(it12.next(), objPoll2);
                                                    Objects.requireNonNull(objApply7, "The resultSelector returned a null value");
                                                    lVar2.onNext(objApply7);
                                                } catch (Throwable th15) {
                                                    i(th15, lVar2, iVar2);
                                                    return;
                                                }
                                            }
                                        }
                                    } catch (Throwable th16) {
                                        i(th16, lVar2, iVar2);
                                    }
                                } else if (num2 == 3) {
                                    y2 y2Var7 = (y2) objPoll2;
                                    this.e.remove(Integer.valueOf(y2Var7.f263296c));
                                    this.d.c(y2Var7);
                                } else {
                                    y2 y2Var8 = (y2) objPoll2;
                                    this.f.remove(Integer.valueOf(y2Var8.f263296c));
                                    this.d.c(y2Var8);
                                }
                            }
                        }
                    }
                    iVar2.clear();
                    break;
                }
                break;
        }
    }

    public final void h(fgm.l lVar) {
        switch (this.f263236a) {
            case 0:
                Throwable thD = ygm.g.d(this.f263239g);
                LinkedHashMap linkedHashMap = this.e;
                Iterator it8 = linkedHashMap.values().iterator();
                while (it8.hasNext()) {
                    ((fhm.f) it8.next()).onError(thD);
                }
                linkedHashMap.clear();
                this.f.clear();
                lVar.onError(thD);
                break;
            default:
                Throwable thD2 = ygm.g.d(this.f263239g);
                this.e.clear();
                this.f.clear();
                lVar.onError(thD2);
                break;
        }
    }

    public final void i(Throwable th10, fgm.l lVar, bhm.i iVar) {
        switch (this.f263236a) {
            case 0:
                ce9.m.F(th10);
                ygm.g.a(this.f263239g, th10);
                iVar.clear();
                this.d.dispose();
                h(lVar);
                break;
            default:
                ce9.m.F(th10);
                ygm.g.a(this.f263239g, th10);
                iVar.clear();
                this.d.dispose();
                h(lVar);
                break;
        }
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final boolean isDisposed() {
        switch (this.f263236a) {
        }
        return this.f263244n;
    }
}
