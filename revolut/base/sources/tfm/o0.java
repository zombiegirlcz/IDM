package tfm;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes4.dex */
public final class o0 extends AtomicInteger implements efm.y, ifm.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bgm.d f270689a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kfm.o f270690b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n0 f270691c;
    public final int d;
    public nfm.j e;
    public ifm.c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public volatile boolean f270692g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public volatile boolean f270693h;
    public volatile boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f270694j;

    public o0(bgm.d dVar, kfm.o oVar, int i) {
        this.f270689a = dVar;
        this.f270690b = oVar;
        this.d = i;
        this.f270691c = new n0(dVar, this);
    }

    public final void a() {
        if (getAndIncrement() != 0) {
            return;
        }
        while (!this.f270693h) {
            if (!this.f270692g) {
                boolean z = this.i;
                try {
                    Object objPoll = this.e.poll();
                    boolean z3 = objPoll == null;
                    if (z && z3) {
                        this.f270693h = true;
                        this.f270689a.onComplete();
                        return;
                    }
                    if (!z3) {
                        try {
                            Object objApply = this.f270690b.apply(objPoll);
                            mfm.f.b(objApply, "The mapper returned a null ObservableSource");
                            efm.w wVar = (efm.w) objApply;
                            this.f270692g = true;
                            wVar.subscribe(this.f270691c);
                        } catch (Throwable th10) {
                            m70.a.u(th10);
                            dispose();
                            this.e.clear();
                            this.f270689a.onError(th10);
                            return;
                        }
                    }
                } catch (Throwable th11) {
                    m70.a.u(th11);
                    dispose();
                    this.e.clear();
                    this.f270689a.onError(th11);
                    return;
                }
            }
            if (decrementAndGet() == 0) {
                return;
            }
        }
        this.e.clear();
    }

    @Override // ifm.c
    public final void dispose() {
        this.f270693h = true;
        n0 n0Var = this.f270691c;
        n0Var.getClass();
        lfm.d.a(n0Var);
        this.f.dispose();
        if (getAndIncrement() == 0) {
            this.e.clear();
        }
    }

    @Override // ifm.c
    public final boolean isDisposed() {
        return this.f270693h;
    }

    @Override // efm.y
    public final void onComplete() {
        if (this.i) {
            return;
        }
        this.i = true;
        a();
    }

    @Override // efm.y
    public final void onError(Throwable th10) {
        if (this.i) {
            mo3.a.m(th10);
            return;
        }
        this.i = true;
        dispose();
        this.f270689a.onError(th10);
    }

    @Override // efm.y
    public final void onNext(Object obj2) {
        if (this.i) {
            return;
        }
        if (this.f270694j == 0) {
            this.e.offer(obj2);
        }
        a();
    }

    @Override // efm.y
    public final void onSubscribe(ifm.c cVar) {
        if (lfm.d.f(this.f, cVar)) {
            this.f = cVar;
            if (cVar instanceof nfm.e) {
                nfm.e eVar = (nfm.e) cVar;
                int iB = eVar.b(3);
                if (iB == 1) {
                    this.f270694j = iB;
                    this.e = eVar;
                    this.i = true;
                    this.f270689a.onSubscribe(this);
                    a();
                    return;
                }
                if (iB == 2) {
                    this.f270694j = iB;
                    this.e = eVar;
                    this.f270689a.onSubscribe(this);
                    return;
                }
            }
            this.e = new vfm.c(this.d);
            this.f270689a.onSubscribe(this);
        }
    }
}
