package tfm;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public final class b1 implements efm.y, ifm.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bgm.d f270357a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kfm.o f270358b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ifm.c f270359c;
    public final AtomicReference d = new AtomicReference();
    public volatile long e;
    public boolean f;

    public b1(bgm.d dVar, kfm.o oVar) {
        this.f270357a = dVar;
        this.f270358b = oVar;
    }

    @Override // ifm.c
    public final void dispose() {
        this.f270359c.dispose();
        lfm.d.a(this.d);
    }

    @Override // ifm.c
    public final boolean isDisposed() {
        return this.f270359c.isDisposed();
    }

    @Override // efm.y
    public final void onComplete() {
        if (this.f) {
            return;
        }
        this.f = true;
        AtomicReference atomicReference = this.d;
        ifm.c cVar = (ifm.c) atomicReference.get();
        if (cVar != lfm.d.DISPOSED) {
            a1 a1Var = (a1) cVar;
            if (a1Var != null) {
                a1Var.a();
            }
            lfm.d.a(atomicReference);
            this.f270357a.onComplete();
        }
    }

    @Override // efm.y
    public final void onError(Throwable th10) {
        lfm.d.a(this.d);
        this.f270357a.onError(th10);
    }

    @Override // efm.y
    public final void onNext(Object obj2) {
        if (this.f) {
            return;
        }
        long j2 = this.e + 1;
        this.e = j2;
        ifm.c cVar = (ifm.c) this.d.get();
        if (cVar != null) {
            cVar.dispose();
        }
        try {
            Object objApply = this.f270358b.apply(obj2);
            mfm.f.b(objApply, "The ObservableSource supplied is null");
            efm.w wVar = (efm.w) objApply;
            a1 a1Var = new a1(this, j2, obj2);
            AtomicReference atomicReference = this.d;
            while (!atomicReference.compareAndSet(cVar, a1Var)) {
                if (atomicReference.get() != cVar) {
                    return;
                }
            }
            wVar.subscribe(a1Var);
        } catch (Throwable th10) {
            m70.a.u(th10);
            dispose();
            this.f270357a.onError(th10);
        }
    }

    @Override // efm.y
    public final void onSubscribe(ifm.c cVar) {
        if (lfm.d.f(this.f270359c, cVar)) {
            this.f270359c = cVar;
            this.f270357a.onSubscribe(this);
        }
    }
}
