package sgm;

import io.reactivex.rxjava3.disposables.Disposable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes14.dex */
public final class c6 extends AtomicReference implements fgm.l, Disposable, Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ahm.c f262746a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f262747b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TimeUnit f262748c;
    public final fgm.o d;
    public final igm.g e;
    public Disposable f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public volatile boolean f262749g;

    public c6(ahm.c cVar, long j2, TimeUnit timeUnit, fgm.o oVar, igm.g gVar) {
        this.f262746a = cVar;
        this.f262747b = j2;
        this.f262748c = timeUnit;
        this.d = oVar;
        this.e = gVar;
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final void dispose() {
        this.f.dispose();
        this.d.dispose();
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final boolean isDisposed() {
        return this.d.isDisposed();
    }

    @Override // fgm.l
    public final void onComplete() {
        this.f262746a.onComplete();
        this.d.dispose();
    }

    @Override // fgm.l
    public final void onError(Throwable th10) {
        this.f262746a.onError(th10);
        this.d.dispose();
    }

    @Override // fgm.l
    public final void onNext(Object obj2) {
        if (!this.f262749g) {
            this.f262749g = true;
            this.f262746a.onNext(obj2);
            Disposable disposable = (Disposable) get();
            if (disposable != null) {
                disposable.dispose();
            }
            jgm.b.c(this, this.d.a(this, this.f262747b, this.f262748c));
            return;
        }
        igm.g gVar = this.e;
        if (gVar != null) {
            try {
                gVar.accept(obj2);
            } catch (Throwable th10) {
                ce9.m.F(th10);
                this.f.dispose();
                this.f262746a.onError(th10);
                this.d.dispose();
            }
        }
    }

    @Override // fgm.l
    public final void onSubscribe(Disposable disposable) {
        if (jgm.b.f(this.f, disposable)) {
            this.f = disposable;
            this.f262746a.onSubscribe(this);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f262749g = false;
    }
}
