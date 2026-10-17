package ahm;

import ce9.m;
import fgm.l;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.CompositeException;
import ygm.g;

/* JADX INFO: loaded from: classes14.dex */
public final class b implements l, Disposable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f5136a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Disposable f5137b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f5138c;

    public b(l lVar) {
        this.f5136a = lVar;
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final void dispose() {
        this.f5137b.dispose();
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final boolean isDisposed() {
        return this.f5137b.isDisposed();
    }

    @Override // fgm.l
    public final void onComplete() {
        if (this.f5138c) {
            return;
        }
        this.f5138c = true;
        Disposable disposable = this.f5137b;
        l lVar = this.f5136a;
        if (disposable != null) {
            try {
                lVar.onComplete();
                return;
            } catch (Throwable th10) {
                m.F(th10);
                jb3.l.v(th10);
                return;
            }
        }
        NullPointerException nullPointerException = new NullPointerException("Subscription not set!");
        try {
            lVar.onSubscribe(jgm.c.INSTANCE);
            try {
                lVar.onError(nullPointerException);
            } catch (Throwable th11) {
                m.F(th11);
                jb3.l.v(new CompositeException(nullPointerException, th11));
            }
        } catch (Throwable th12) {
            m.F(th12);
            jb3.l.v(new CompositeException(nullPointerException, th12));
        }
    }

    @Override // fgm.l
    public final void onError(Throwable th10) {
        if (this.f5138c) {
            jb3.l.v(th10);
            return;
        }
        this.f5138c = true;
        Disposable disposable = this.f5137b;
        l lVar = this.f5136a;
        if (disposable != null) {
            if (th10 == null) {
                th10 = g.b("onError called with a null Throwable.");
            }
            try {
                lVar.onError(th10);
                return;
            } catch (Throwable th11) {
                m.F(th11);
                jb3.l.v(new CompositeException(th10, th11));
                return;
            }
        }
        NullPointerException nullPointerException = new NullPointerException("Subscription not set!");
        try {
            lVar.onSubscribe(jgm.c.INSTANCE);
            try {
                lVar.onError(new CompositeException(th10, nullPointerException));
            } catch (Throwable th12) {
                m.F(th12);
                jb3.l.v(new CompositeException(th10, nullPointerException, th12));
            }
        } catch (Throwable th13) {
            m.F(th13);
            jb3.l.v(new CompositeException(th10, nullPointerException, th13));
        }
    }

    @Override // fgm.l
    public final void onNext(Object obj2) {
        if (this.f5138c) {
            return;
        }
        Disposable disposable = this.f5137b;
        l lVar = this.f5136a;
        if (disposable == null) {
            this.f5138c = true;
            NullPointerException nullPointerException = new NullPointerException("Subscription not set!");
            try {
                lVar.onSubscribe(jgm.c.INSTANCE);
                try {
                    lVar.onError(nullPointerException);
                    return;
                } catch (Throwable th10) {
                    m.F(th10);
                    jb3.l.v(new CompositeException(nullPointerException, th10));
                    return;
                }
            } catch (Throwable th11) {
                m.F(th11);
                jb3.l.v(new CompositeException(nullPointerException, th11));
                return;
            }
        }
        if (obj2 == null) {
            NullPointerException nullPointerExceptionB = g.b("onNext called with a null value.");
            try {
                this.f5137b.dispose();
                onError(nullPointerExceptionB);
                return;
            } catch (Throwable th12) {
                m.F(th12);
                onError(new CompositeException(nullPointerExceptionB, th12));
                return;
            }
        }
        try {
            lVar.onNext(obj2);
        } catch (Throwable th13) {
            m.F(th13);
            try {
                this.f5137b.dispose();
                onError(th13);
            } catch (Throwable th14) {
                m.F(th14);
                onError(new CompositeException(th13, th14));
            }
        }
    }

    @Override // fgm.l
    public final void onSubscribe(Disposable disposable) {
        if (jgm.b.f(this.f5137b, disposable)) {
            this.f5137b = disposable;
            try {
                this.f5136a.onSubscribe(this);
            } catch (Throwable th10) {
                m.F(th10);
                this.f5138c = true;
                try {
                    disposable.dispose();
                    jb3.l.v(th10);
                } catch (Throwable th11) {
                    m.F(th11);
                    jb3.l.v(new CompositeException(th10, th11));
                }
            }
        }
    }
}
