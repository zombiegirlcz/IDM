package sgm;

import io.reactivex.rxjava3.disposables.Disposable;

/* JADX INFO: loaded from: classes14.dex */
public final class u1 extends ngm.b implements fgm.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fgm.l f263194a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final igm.a f263195b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Disposable f263196c;
    public bhm.b d;
    public boolean e;

    public u1(fgm.l lVar, igm.a aVar) {
        this.f263194a = lVar;
        this.f263195b = aVar;
    }

    public final void a() {
        if (compareAndSet(0, 1)) {
            try {
                this.f263195b.run();
            } catch (Throwable th10) {
                ce9.m.F(th10);
                jb3.l.v(th10);
            }
        }
    }

    @Override // bhm.c
    public final int b(int i) {
        bhm.b bVar = this.d;
        if (bVar == null || (i & 4) != 0) {
            return 0;
        }
        int iB = bVar.b(i);
        if (iB != 0) {
            this.e = iB == 1;
        }
        return iB;
    }

    @Override // bhm.g
    public final void clear() {
        this.d.clear();
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final void dispose() {
        this.f263196c.dispose();
        a();
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final boolean isDisposed() {
        return this.f263196c.isDisposed();
    }

    @Override // bhm.g
    public final boolean isEmpty() {
        return this.d.isEmpty();
    }

    @Override // fgm.l
    public final void onComplete() {
        this.f263194a.onComplete();
        a();
    }

    @Override // fgm.l
    public final void onError(Throwable th10) {
        this.f263194a.onError(th10);
        a();
    }

    @Override // fgm.l
    public final void onNext(Object obj2) {
        this.f263194a.onNext(obj2);
    }

    @Override // fgm.l
    public final void onSubscribe(Disposable disposable) {
        if (jgm.b.f(this.f263196c, disposable)) {
            this.f263196c = disposable;
            if (disposable instanceof bhm.b) {
                this.d = (bhm.b) disposable;
            }
            this.f263194a.onSubscribe(this);
        }
    }

    @Override // bhm.g
    public final Object poll() {
        Object objPoll = this.d.poll();
        if (objPoll == null && this.e) {
            a();
        }
        return objPoll;
    }
}
