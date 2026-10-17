package tfm;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes13.dex */
public final class w1 implements efm.y, ifm.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final efm.y f270910a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f270911b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f270912c;
    public final boolean d;
    public ifm.c e;
    public long f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f270913g;

    public w1(efm.y yVar, long j2, Object obj2, boolean z) {
        this.f270910a = yVar;
        this.f270911b = j2;
        this.f270912c = obj2;
        this.d = z;
    }

    @Override // ifm.c
    public final void dispose() {
        this.e.dispose();
    }

    @Override // ifm.c
    public final boolean isDisposed() {
        return this.e.isDisposed();
    }

    @Override // efm.y
    public final void onComplete() {
        if (this.f270913g) {
            return;
        }
        this.f270913g = true;
        efm.y yVar = this.f270910a;
        Object obj2 = this.f270912c;
        if (obj2 == null && this.d) {
            yVar.onError(new NoSuchElementException());
            return;
        }
        if (obj2 != null) {
            yVar.onNext(obj2);
        }
        yVar.onComplete();
    }

    @Override // efm.y
    public final void onError(Throwable th10) {
        if (this.f270913g) {
            mo3.a.m(th10);
        } else {
            this.f270913g = true;
            this.f270910a.onError(th10);
        }
    }

    @Override // efm.y
    public final void onNext(Object obj2) {
        if (this.f270913g) {
            return;
        }
        long j2 = this.f;
        if (j2 != this.f270911b) {
            this.f = j2 + 1;
            return;
        }
        this.f270913g = true;
        this.e.dispose();
        efm.y yVar = this.f270910a;
        yVar.onNext(obj2);
        yVar.onComplete();
    }

    @Override // efm.y
    public final void onSubscribe(ifm.c cVar) {
        if (lfm.d.f(this.e, cVar)) {
            this.e = cVar;
            this.f270910a.onSubscribe(this);
        }
    }
}
