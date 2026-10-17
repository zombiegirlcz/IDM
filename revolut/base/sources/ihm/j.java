package ihm;

import e8.q;
import efm.y;

/* JADX INFO: loaded from: classes13.dex */
public final class j extends k implements zfm.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final k f161461g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f161462h;
    public q i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public volatile boolean f161463j;

    public j(k kVar) {
        this.f161461g = kVar;
    }

    public final void e() {
        q qVar;
        while (true) {
            synchronized (this) {
                try {
                    qVar = this.i;
                    if (qVar == null) {
                        this.f161462h = false;
                        return;
                    }
                    this.i = null;
                } catch (Throwable th10) {
                    throw th10;
                }
            }
            qVar.d(this);
        }
    }

    @Override // efm.y
    public final void onComplete() {
        if (this.f161463j) {
            return;
        }
        synchronized (this) {
            try {
                if (this.f161463j) {
                    return;
                }
                this.f161463j = true;
                if (!this.f161462h) {
                    this.f161462h = true;
                    this.f161461g.onComplete();
                    return;
                }
                q qVar = this.i;
                if (qVar == null) {
                    qVar = new q(4, (byte) 0);
                    this.i = qVar;
                }
                qVar.c(zfm.m.COMPLETE);
            } catch (Throwable th10) {
                throw th10;
            }
        }
    }

    @Override // efm.y
    public final void onError(Throwable th10) {
        if (this.f161463j) {
            mo3.a.m(th10);
            return;
        }
        synchronized (this) {
            try {
                boolean z = true;
                if (!this.f161463j) {
                    this.f161463j = true;
                    if (this.f161462h) {
                        q qVar = this.i;
                        if (qVar == null) {
                            qVar = new q(4, (byte) 0);
                            this.i = qVar;
                        }
                        ((Object[]) qVar.f123510c)[0] = new zfm.k(th10);
                        return;
                    }
                    this.f161462h = true;
                    z = false;
                }
                if (z) {
                    mo3.a.m(th10);
                } else {
                    this.f161461g.onError(th10);
                }
            } catch (Throwable th11) {
                throw th11;
            }
        }
    }

    @Override // efm.y
    public final void onNext(Object obj2) {
        if (this.f161463j) {
            return;
        }
        synchronized (this) {
            try {
                if (this.f161463j) {
                    return;
                }
                if (!this.f161462h) {
                    this.f161462h = true;
                    this.f161461g.onNext(obj2);
                    e();
                } else {
                    q qVar = this.i;
                    if (qVar == null) {
                        qVar = new q(4, (byte) 0);
                        this.i = qVar;
                    }
                    qVar.c(obj2);
                }
            } catch (Throwable th10) {
                throw th10;
            }
        }
    }

    @Override // efm.y
    public final void onSubscribe(ifm.c cVar) {
        boolean z = true;
        if (!this.f161463j) {
            synchronized (this) {
                try {
                    if (!this.f161463j) {
                        if (this.f161462h) {
                            q qVar = this.i;
                            if (qVar == null) {
                                qVar = new q(4, (byte) 0);
                                this.i = qVar;
                            }
                            qVar.c(new zfm.j(cVar));
                            return;
                        }
                        this.f161462h = true;
                        z = false;
                    }
                } finally {
                }
            }
        }
        if (z) {
            cVar.dispose();
        } else {
            this.f161461g.onSubscribe(cVar);
            e();
        }
    }

    @Override // efm.r
    public final void subscribeActual(y yVar) {
        this.f161461g.subscribe(yVar);
    }

    @Override // kfm.p
    public final boolean test(Object obj2) {
        return zfm.m.b(this.f161461g, obj2);
    }
}
