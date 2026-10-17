package mgm;

import ce9.m;
import java.util.Iterator;
import java.util.Objects;
import java.util.stream.Stream;

/* JADX INFO: loaded from: classes14.dex */
public final class k implements bhm.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fgm.l f205329a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Iterator f205330b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Stream f205331c;
    public volatile boolean d;
    public boolean e;
    public boolean f;

    public k(fgm.l lVar, Iterator it8, Stream stream) {
        this.f205329a = lVar;
        this.f205330b = it8;
        this.f205331c = stream;
    }

    public final void a() {
        if (this.f) {
            return;
        }
        Iterator it8 = this.f205330b;
        fgm.l lVar = this.f205329a;
        while (!this.d) {
            try {
                Object next = it8.next();
                Objects.requireNonNull(next, "The Stream's Iterator.next returned a null value");
                if (!this.d) {
                    lVar.onNext(next);
                    if (!this.d) {
                        try {
                            if (!it8.hasNext()) {
                                lVar.onComplete();
                                this.d = true;
                            }
                        } catch (Throwable th10) {
                            m.F(th10);
                            lVar.onError(th10);
                            this.d = true;
                        }
                    }
                }
            } catch (Throwable th11) {
                m.F(th11);
                lVar.onError(th11);
                this.d = true;
            }
        }
        clear();
    }

    @Override // bhm.c
    public final int b(int i) {
        this.f = true;
        return 1;
    }

    @Override // bhm.g
    public final void clear() {
        this.f205330b = null;
        Stream stream = this.f205331c;
        this.f205331c = null;
        if (stream != null) {
            try {
                m72.b.B(stream);
            } catch (Throwable th10) {
                m.F(th10);
                jb3.l.v(th10);
            }
        }
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final void dispose() {
        this.d = true;
        a();
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final boolean isDisposed() {
        return this.d;
    }

    @Override // bhm.g
    public final boolean isEmpty() {
        Iterator it8 = this.f205330b;
        if (it8 == null) {
            return true;
        }
        if (!this.e || it8.hasNext()) {
            return false;
        }
        clear();
        return true;
    }

    @Override // bhm.g
    public final boolean offer(Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // bhm.g
    public final Object poll() {
        Iterator it8 = this.f205330b;
        if (it8 == null) {
            return null;
        }
        if (!this.e) {
            this.e = true;
        } else if (!it8.hasNext()) {
            clear();
            return null;
        }
        Object next = this.f205330b.next();
        Objects.requireNonNull(next, "The Stream's Iterator.next() returned a null value");
        return next;
    }
}
