package ngm;

import io.reactivex.rxjava3.disposables.Disposable;

/* JADX INFO: loaded from: classes14.dex */
public abstract class a implements fgm.l, bhm.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fgm.l f215230a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Disposable f215231b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public bhm.b f215232c;
    public boolean d;
    public int e;

    public a(fgm.l lVar) {
        this.f215230a = lVar;
    }

    public final void a(Throwable th10) {
        ce9.m.F(th10);
        this.f215231b.dispose();
        onError(th10);
    }

    @Override // bhm.c
    public int b(int i) {
        bhm.b bVar = this.f215232c;
        if (bVar == null || (i & 4) != 0) {
            return 0;
        }
        int iB = bVar.b(i);
        if (iB == 0) {
            return iB;
        }
        this.e = iB;
        return iB;
    }

    @Override // bhm.g
    public void clear() {
        this.f215232c.clear();
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final void dispose() {
        this.f215231b.dispose();
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final boolean isDisposed() {
        return this.f215231b.isDisposed();
    }

    @Override // bhm.g
    public final boolean isEmpty() {
        return this.f215232c.isEmpty();
    }

    @Override // bhm.g
    public final boolean offer(Object obj2) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // fgm.l
    public void onComplete() {
        if (this.d) {
            return;
        }
        this.d = true;
        this.f215230a.onComplete();
    }

    @Override // fgm.l
    public void onError(Throwable th10) {
        if (this.d) {
            jb3.l.v(th10);
        } else {
            this.d = true;
            this.f215230a.onError(th10);
        }
    }

    @Override // fgm.l
    public final void onSubscribe(Disposable disposable) {
        if (jgm.b.f(this.f215231b, disposable)) {
            this.f215231b = disposable;
            if (disposable instanceof bhm.b) {
                this.f215232c = (bhm.b) disposable;
            }
            this.f215230a.onSubscribe(this);
        }
    }
}
