package tfm;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes4.dex */
public final class g7 extends AtomicInteger implements efm.y, ifm.c, Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final efm.y f270493a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f270494b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f270495c;
    public long d;
    public ifm.c e;
    public ihm.m f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public volatile boolean f270496g;

    public g7(efm.y yVar, long j2, int i) {
        this.f270493a = yVar;
        this.f270494b = j2;
        this.f270495c = i;
    }

    @Override // ifm.c
    public final void dispose() {
        this.f270496g = true;
    }

    @Override // ifm.c
    public final boolean isDisposed() {
        return this.f270496g;
    }

    @Override // efm.y
    public final void onComplete() {
        ihm.m mVar = this.f;
        if (mVar != null) {
            this.f = null;
            mVar.onComplete();
        }
        this.f270493a.onComplete();
    }

    @Override // efm.y
    public final void onError(Throwable th10) {
        ihm.m mVar = this.f;
        if (mVar != null) {
            this.f = null;
            mVar.onError(th10);
        }
        this.f270493a.onError(th10);
    }

    @Override // efm.y
    public final void onNext(Object obj2) {
        ihm.m mVar = this.f;
        if (mVar == null && !this.f270496g) {
            ihm.m mVar2 = new ihm.m(this.f270495c, this);
            this.f = mVar2;
            this.f270493a.onNext(mVar2);
            mVar = mVar2;
        }
        if (mVar != null) {
            mVar.onNext(obj2);
            long j2 = this.d + 1;
            this.d = j2;
            if (j2 >= this.f270494b) {
                this.d = 0L;
                this.f = null;
                mVar.onComplete();
                if (this.f270496g) {
                    this.e.dispose();
                }
            }
        }
    }

    @Override // efm.y
    public final void onSubscribe(ifm.c cVar) {
        if (lfm.d.f(this.e, cVar)) {
            this.e = cVar;
            this.f270493a.onSubscribe(this);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f270496g) {
            this.e.dispose();
        }
    }
}
