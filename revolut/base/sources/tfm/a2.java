package tfm;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes13.dex */
public final class a2 implements efm.y, ifm.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final efm.f0 f270333a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f270334b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f270335c;
    public ifm.c d;
    public long e;
    public boolean f;

    public a2(efm.f0 f0Var, long j2, Object obj2) {
        this.f270333a = f0Var;
        this.f270334b = j2;
        this.f270335c = obj2;
    }

    @Override // ifm.c
    public final void dispose() {
        this.d.dispose();
    }

    @Override // ifm.c
    public final boolean isDisposed() {
        return this.d.isDisposed();
    }

    @Override // efm.y
    public final void onComplete() {
        if (this.f) {
            return;
        }
        this.f = true;
        efm.f0 f0Var = this.f270333a;
        Object obj2 = this.f270335c;
        if (obj2 != null) {
            f0Var.onSuccess(obj2);
        } else {
            f0Var.onError(new NoSuchElementException());
        }
    }

    @Override // efm.y
    public final void onError(Throwable th10) {
        if (this.f) {
            mo3.a.m(th10);
        } else {
            this.f = true;
            this.f270333a.onError(th10);
        }
    }

    @Override // efm.y
    public final void onNext(Object obj2) {
        if (this.f) {
            return;
        }
        long j2 = this.e;
        if (j2 != this.f270334b) {
            this.e = j2 + 1;
            return;
        }
        this.f = true;
        this.d.dispose();
        this.f270333a.onSuccess(obj2);
    }

    @Override // efm.y
    public final void onSubscribe(ifm.c cVar) {
        if (lfm.d.f(this.d, cVar)) {
            this.d = cVar;
            this.f270333a.onSubscribe(this);
        }
    }
}
