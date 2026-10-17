package dgm;

import e8.q;
import zfm.k;
import zfm.l;
import zfm.m;

/* JADX INFO: loaded from: classes13.dex */
public final class f extends c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f114727b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f114728c;
    public q d;
    public volatile boolean e;

    public f(c cVar) {
        this.f114727b = cVar;
    }

    @Override // dom.a
    public final void e(dom.b bVar) {
        boolean z = true;
        if (!this.e) {
            synchronized (this) {
                try {
                    if (!this.e) {
                        if (this.f114728c) {
                            q qVar = this.d;
                            if (qVar == null) {
                                qVar = new q(4, (byte) 0);
                                this.d = qVar;
                            }
                            qVar.c(new l(bVar));
                            return;
                        }
                        this.f114728c = true;
                        z = false;
                    }
                } finally {
                }
            }
        }
        if (z) {
            bVar.cancel();
        } else {
            this.f114727b.e(bVar);
            t();
        }
    }

    @Override // efm.i
    public final void o(dom.a aVar) {
        this.f114727b.a(aVar);
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
                this.e = true;
                if (!this.f114728c) {
                    this.f114728c = true;
                    this.f114727b.onComplete();
                    return;
                }
                q qVar = this.d;
                if (qVar == null) {
                    qVar = new q(4, (byte) 0);
                    this.d = qVar;
                }
                qVar.c(m.COMPLETE);
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
                    this.e = true;
                    if (this.f114728c) {
                        q qVar = this.d;
                        if (qVar == null) {
                            qVar = new q(4, (byte) 0);
                            this.d = qVar;
                        }
                        ((Object[]) qVar.f123510c)[0] = new k(th10);
                        return;
                    }
                    this.f114728c = true;
                    z = false;
                }
                if (z) {
                    mo3.a.m(th10);
                } else {
                    this.f114727b.onError(th10);
                }
            } catch (Throwable th11) {
                throw th11;
            }
        }
    }

    @Override // dom.a
    public final void onNext(Object obj2) {
        if (this.e) {
            return;
        }
        synchronized (this) {
            try {
                if (this.e) {
                    return;
                }
                if (!this.f114728c) {
                    this.f114728c = true;
                    this.f114727b.onNext(obj2);
                    t();
                } else {
                    q qVar = this.d;
                    if (qVar == null) {
                        qVar = new q(4, (byte) 0);
                        this.d = qVar;
                    }
                    qVar.c(obj2);
                }
            } catch (Throwable th10) {
                throw th10;
            }
        }
    }

    public final void t() {
        q qVar;
        while (true) {
            synchronized (this) {
                try {
                    qVar = this.d;
                    if (qVar == null) {
                        this.f114728c = false;
                        return;
                    }
                    this.d = null;
                } catch (Throwable th10) {
                    throw th10;
                }
            }
            qVar.a(this.f114727b);
        }
    }
}
