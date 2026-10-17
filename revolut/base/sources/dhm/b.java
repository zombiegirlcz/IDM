package dhm;

import io.grpc.okhttp.internal.n;
import ygm.j;
import ygm.k;
import ygm.l;

/* JADX INFO: loaded from: classes14.dex */
public final class b extends a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f114851b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f114852c;
    public n d;
    public volatile boolean e;

    public b(d dVar) {
        this.f114851b = dVar;
    }

    @Override // dom.a
    public final void e(dom.b bVar) {
        boolean z = true;
        if (!this.e) {
            synchronized (this) {
                try {
                    if (!this.e) {
                        if (this.f114852c) {
                            n nVar = this.d;
                            if (nVar == null) {
                                nVar = new n(4);
                                this.d = nVar;
                            }
                            nVar.b(new k(bVar));
                            return;
                        }
                        this.f114852c = true;
                        z = false;
                    }
                } finally {
                }
            }
        }
        if (z) {
            bVar.cancel();
        } else {
            this.f114851b.e(bVar);
            n();
        }
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    public final void k(dom.a aVar) {
        this.f114851b.a(aVar);
    }

    public final void n() {
        n nVar;
        while (true) {
            synchronized (this) {
                try {
                    nVar = this.d;
                    if (nVar == null) {
                        this.f114852c = false;
                        return;
                    }
                    this.d = null;
                } catch (Throwable th10) {
                    throw th10;
                }
            }
            nVar.a(this.f114851b);
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
                this.e = true;
                if (!this.f114852c) {
                    this.f114852c = true;
                    this.f114851b.onComplete();
                    return;
                }
                n nVar = this.d;
                if (nVar == null) {
                    nVar = new n(4);
                    this.d = nVar;
                }
                nVar.b(l.COMPLETE);
            } catch (Throwable th10) {
                throw th10;
            }
        }
    }

    @Override // dom.a
    public final void onError(Throwable th10) {
        if (this.e) {
            jb3.l.v(th10);
            return;
        }
        synchronized (this) {
            try {
                boolean z = true;
                if (!this.e) {
                    this.e = true;
                    if (this.f114852c) {
                        n nVar = this.d;
                        if (nVar == null) {
                            nVar = new n(4);
                            this.d = nVar;
                        }
                        ((Object[]) nVar.d)[0] = new j(th10);
                        return;
                    }
                    this.f114852c = true;
                    z = false;
                }
                if (z) {
                    jb3.l.v(th10);
                } else {
                    this.f114851b.onError(th10);
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
                if (!this.f114852c) {
                    this.f114852c = true;
                    this.f114851b.onNext(obj2);
                    n();
                } else {
                    n nVar = this.d;
                    if (nVar == null) {
                        nVar = new n(4);
                        this.d = nVar;
                    }
                    nVar.b(obj2);
                }
            } catch (Throwable th10) {
                throw th10;
            }
        }
    }
}
