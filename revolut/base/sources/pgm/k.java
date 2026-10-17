package pgm;

import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.MissingBackpressureException;
import java.io.Serializable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes14.dex */
public final class k extends AtomicReference implements Runnable, Disposable, fgm.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f236087a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f236088b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f236089c;
    public final Serializable d;
    public final Object e;

    public k(fgm.p pVar) {
        this.f236087a = 2;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        this.f236088b = pVar;
        this.f236089c = 5000L;
        this.d = timeUnit;
        this.e = new AtomicReference();
    }

    public void a() {
        if (((AtomicBoolean) this.d).compareAndSet(false, true)) {
            l lVar = (l) this.e;
            long j2 = this.f236089c;
            Object obj2 = this.f236088b;
            if (j2 == lVar.f236100g) {
                if (lVar.get() == 0) {
                    lVar.cancel();
                    lVar.f236097a.onError(new MissingBackpressureException("Could not emit value due to lack of requests"));
                } else {
                    lVar.f236097a.onNext(obj2);
                    xam.a.m(lVar, 1L);
                    jgm.b.a(this);
                }
            }
        }
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final void dispose() {
        switch (this.f236087a) {
            case 0:
                jgm.b.a(this);
                break;
            case 1:
                jgm.b.a(this);
                break;
            default:
                jgm.b.a(this);
                jgm.b.a((AtomicReference) this.e);
                break;
        }
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final boolean isDisposed() {
        switch (this.f236087a) {
            case 0:
                return get() == jgm.b.DISPOSED;
            case 1:
                return get() == jgm.b.DISPOSED;
            default:
                return jgm.b.b((Disposable) get());
        }
    }

    @Override // fgm.p
    public void onError(Throwable th10) {
        Disposable disposable = (Disposable) get();
        jgm.b bVar = jgm.b.DISPOSED;
        if (disposable == bVar || !compareAndSet(disposable, bVar)) {
            jb3.l.v(th10);
        } else {
            jgm.b.a((AtomicReference) this.e);
            ((fgm.p) this.f236088b).onError(th10);
        }
    }

    @Override // fgm.p
    public void onSubscribe(Disposable disposable) {
        jgm.b.e(this, disposable);
    }

    @Override // fgm.p
    public void onSuccess(Object obj2) {
        Disposable disposable = (Disposable) get();
        jgm.b bVar = jgm.b.DISPOSED;
        if (disposable == bVar || !compareAndSet(disposable, bVar)) {
            return;
        }
        jgm.b.a((AtomicReference) this.e);
        ((fgm.p) this.f236088b).onSuccess(obj2);
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f236087a) {
            case 0:
                a();
                break;
            case 1:
                if (((AtomicBoolean) this.d).compareAndSet(false, true)) {
                    sgm.g1 g1Var = (sgm.g1) this.e;
                    long j2 = this.f236089c;
                    Object obj2 = this.f236088b;
                    if (j2 == g1Var.f262849h) {
                        g1Var.f262845a.onNext(obj2);
                        jgm.b.a(this);
                    }
                }
                break;
            default:
                if (jgm.b.a(this)) {
                    ((fgm.p) this.f236088b).onError(new TimeoutException(ygm.g.e(this.f236089c, (TimeUnit) this.d)));
                }
                break;
        }
    }

    public k(Object obj2, long j2, sgm.g1 g1Var) {
        this.f236087a = 1;
        this.d = new AtomicBoolean();
        this.f236088b = obj2;
        this.f236089c = j2;
        this.e = g1Var;
    }

    public k(Object obj2, long j2, l lVar) {
        this.f236087a = 0;
        this.d = new AtomicBoolean();
        this.f236088b = obj2;
        this.f236089c = j2;
        this.e = lVar;
    }
}
