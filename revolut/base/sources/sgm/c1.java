package sgm;

import io.reactivex.rxjava3.core.ObservableEmitter;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes14.dex */
public final class c1 extends AtomicReference implements ObservableEmitter, Disposable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fgm.l f262734a;

    public c1(fgm.l lVar) {
        this.f262734a = lVar;
    }

    @Override // io.reactivex.rxjava3.core.ObservableEmitter
    public final void a(igm.f fVar) {
        jgm.b.d(this, new ggm.b(fVar, 1));
    }

    public final void b(Throwable th10) {
        if (c(th10)) {
            return;
        }
        jb3.l.v(th10);
    }

    public final boolean c(Throwable th10) {
        if (isDisposed()) {
            return false;
        }
        try {
            this.f262734a.onError(th10);
            jgm.b.a(this);
            return true;
        } catch (Throwable th11) {
            jgm.b.a(this);
            throw th11;
        }
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final void dispose() {
        jgm.b.a(this);
    }

    @Override // io.reactivex.rxjava3.core.ObservableEmitter, io.reactivex.rxjava3.disposables.Disposable
    public final boolean isDisposed() {
        return jgm.b.b((Disposable) get());
    }

    @Override // fgm.c
    public final void onComplete() {
        if (isDisposed()) {
            return;
        }
        try {
            this.f262734a.onComplete();
        } finally {
            jgm.b.a(this);
        }
    }

    @Override // fgm.c
    public final void onNext(Object obj2) {
        if (obj2 == null) {
            b(ygm.g.b("onNext called with a null value."));
        } else {
            if (isDisposed()) {
                return;
            }
            this.f262734a.onNext(obj2);
        }
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public final String toString() {
        return j6.a.r(c1.class.getSimpleName(), "{", super.toString(), "}");
    }
}
