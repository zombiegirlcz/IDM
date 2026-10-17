package sgm;

import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes14.dex */
public final class o0 extends AtomicInteger implements fgm.l, Disposable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ahm.c f263034a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final igm.o f263035b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m0 f263036c;
    public final int d;
    public bhm.g e;
    public Disposable f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public volatile boolean f263037g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public volatile boolean f263038h;
    public volatile boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f263039j;

    public o0(ahm.c cVar, igm.o oVar, int i) {
        this.f263034a = cVar;
        this.f263035b = oVar;
        this.d = i;
        this.f263036c = new m0(cVar, this, 1);
    }

    public final void a() {
        if (getAndIncrement() != 0) {
            return;
        }
        while (!this.f263038h) {
            if (!this.f263037g) {
                boolean z = this.i;
                try {
                    Object objPoll = this.e.poll();
                    boolean z3 = objPoll == null;
                    if (z && z3) {
                        this.f263038h = true;
                        this.f263034a.onComplete();
                        return;
                    }
                    if (!z3) {
                        try {
                            Object objApply = this.f263035b.apply(objPoll);
                            Objects.requireNonNull(objApply, "The mapper returned a null ObservableSource");
                            ObservableSource observableSource = (ObservableSource) objApply;
                            this.f263037g = true;
                            observableSource.subscribe(this.f263036c);
                        } catch (Throwable th10) {
                            ce9.m.F(th10);
                            dispose();
                            this.e.clear();
                            this.f263034a.onError(th10);
                            return;
                        }
                    }
                } catch (Throwable th11) {
                    ce9.m.F(th11);
                    dispose();
                    this.e.clear();
                    this.f263034a.onError(th11);
                    return;
                }
            }
            if (decrementAndGet() == 0) {
                return;
            }
        }
        this.e.clear();
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final void dispose() {
        this.f263038h = true;
        m0 m0Var = this.f263036c;
        m0Var.getClass();
        jgm.b.a(m0Var);
        this.f.dispose();
        if (getAndIncrement() == 0) {
            this.e.clear();
        }
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final boolean isDisposed() {
        return this.f263038h;
    }

    @Override // fgm.l
    public final void onComplete() {
        if (this.i) {
            return;
        }
        this.i = true;
        a();
    }

    @Override // fgm.l
    public final void onError(Throwable th10) {
        if (this.i) {
            jb3.l.v(th10);
            return;
        }
        this.i = true;
        dispose();
        this.f263034a.onError(th10);
    }

    @Override // fgm.l
    public final void onNext(Object obj2) {
        if (this.i) {
            return;
        }
        if (this.f263039j == 0) {
            this.e.offer(obj2);
        }
        a();
    }

    @Override // fgm.l
    public final void onSubscribe(Disposable disposable) {
        if (jgm.b.f(this.f, disposable)) {
            this.f = disposable;
            if (disposable instanceof bhm.b) {
                bhm.b bVar = (bhm.b) disposable;
                int iB = bVar.b(3);
                if (iB == 1) {
                    this.f263039j = iB;
                    this.e = bVar;
                    this.i = true;
                    this.f263034a.onSubscribe(this);
                    a();
                    return;
                }
                if (iB == 2) {
                    this.f263039j = iB;
                    this.e = bVar;
                    this.f263034a.onSubscribe(this);
                    return;
                }
            }
            this.e = new bhm.i(this.d);
            this.f263034a.onSubscribe(this);
        }
    }
}
