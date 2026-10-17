package jhm;

import dom.b;
import e8.q;
import efm.j;
import yfm.g;
import zfm.k;
import zfm.m;

/* JADX INFO: loaded from: classes13.dex */
public final class a implements j, b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dom.a f174315a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public b f174316b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f174317c;
    public q d;
    public volatile boolean e;

    public a(dom.a aVar) {
        this.f174315a = aVar;
    }

    @Override // dom.b
    public final void a(long j2) {
        this.f174316b.a(j2);
    }

    @Override // dom.b
    public final void cancel() {
        this.f174316b.cancel();
    }

    @Override // dom.a
    public final void e(b bVar) {
        if (g.h(this.f174316b, bVar)) {
            this.f174316b = bVar;
            this.f174315a.e(this);
        }
    }

    @Override // dom.a
    public final void onComplete() {
        if (this.e) {
            return;
        }
        synchronized (this) {
            try {
                if (this.e) {
                    return;
                }
                if (!this.f174317c) {
                    this.e = true;
                    this.f174317c = true;
                    this.f174315a.onComplete();
                } else {
                    q qVar = this.d;
                    if (qVar == null) {
                        qVar = new q(4, (byte) 0);
                        this.d = qVar;
                    }
                    qVar.c(m.COMPLETE);
                }
            } catch (Throwable th10) {
                throw th10;
            }
        }
    }

    @Override // dom.a
    public final void onError(Throwable th10) {
        if (this.e) {
            mo3.a.m(th10);
            return;
        }
        synchronized (this) {
            try {
                boolean z = true;
                if (!this.e) {
                    if (this.f174317c) {
                        this.e = true;
                        q qVar = this.d;
                        if (qVar == null) {
                            qVar = new q(4, (byte) 0);
                            this.d = qVar;
                        }
                        ((Object[]) qVar.f123510c)[0] = new k(th10);
                        return;
                    }
                    this.e = true;
                    this.f174317c = true;
                    z = false;
                }
                if (z) {
                    mo3.a.m(th10);
                } else {
                    this.f174315a.onError(th10);
                }
            } catch (Throwable th11) {
                throw th11;
            }
        }
    }

    @Override // dom.a
    public final void onNext(Object obj2) {
        q qVar;
        if (this.e) {
            return;
        }
        if (obj2 == null) {
            this.f174316b.cancel();
            onError(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
            return;
        }
        synchronized (this) {
            try {
                if (this.e) {
                    return;
                }
                if (this.f174317c) {
                    q qVar2 = this.d;
                    if (qVar2 == null) {
                        qVar2 = new q(4, (byte) 0);
                        this.d = qVar2;
                    }
                    qVar2.c(obj2);
                    return;
                }
                this.f174317c = true;
                this.f174315a.onNext(obj2);
                do {
                    synchronized (this) {
                        try {
                            qVar = this.d;
                            if (qVar == null) {
                                this.f174317c = false;
                                return;
                            }
                            this.d = null;
                        } finally {
                        }
                    }
                } while (!qVar.a(this.f174315a));
            } finally {
            }
        }
    }
}
