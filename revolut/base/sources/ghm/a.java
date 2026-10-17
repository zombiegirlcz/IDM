package ghm;

import dom.b;
import fgm.d;
import io.grpc.okhttp.internal.n;
import xgm.f;
import ygm.g;
import ygm.j;
import ygm.l;

/* JADX INFO: loaded from: classes14.dex */
public final class a implements d, b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dom.a f144016a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public b f144017b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f144018c;
    public n d;
    public volatile boolean e;

    public a(dom.a aVar) {
        this.f144016a = aVar;
    }

    @Override // dom.b
    public final void a(long j2) {
        this.f144017b.a(j2);
    }

    @Override // dom.b
    public final void cancel() {
        this.f144017b.cancel();
    }

    @Override // dom.a
    public final void e(b bVar) {
        if (f.h(this.f144017b, bVar)) {
            this.f144017b = bVar;
            this.f144016a.e(this);
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
                if (!this.f144018c) {
                    this.e = true;
                    this.f144018c = true;
                    this.f144016a.onComplete();
                } else {
                    n nVar = this.d;
                    if (nVar == null) {
                        nVar = new n(4);
                        this.d = nVar;
                    }
                    nVar.b(l.COMPLETE);
                }
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
                    if (this.f144018c) {
                        this.e = true;
                        n nVar = this.d;
                        if (nVar == null) {
                            nVar = new n(4);
                            this.d = nVar;
                        }
                        ((Object[]) nVar.d)[0] = new j(th10);
                        return;
                    }
                    this.e = true;
                    this.f144018c = true;
                    z = false;
                }
                if (z) {
                    jb3.l.v(th10);
                } else {
                    this.f144016a.onError(th10);
                }
            } catch (Throwable th11) {
                throw th11;
            }
        }
    }

    @Override // dom.a
    public final void onNext(Object obj2) {
        n nVar;
        if (this.e) {
            return;
        }
        if (obj2 == null) {
            this.f144017b.cancel();
            onError(g.b("onNext called with a null value."));
            return;
        }
        synchronized (this) {
            try {
                if (this.e) {
                    return;
                }
                if (this.f144018c) {
                    n nVar2 = this.d;
                    if (nVar2 == null) {
                        nVar2 = new n(4);
                        this.d = nVar2;
                    }
                    nVar2.b(obj2);
                    return;
                }
                this.f144018c = true;
                this.f144016a.onNext(obj2);
                do {
                    synchronized (this) {
                        try {
                            nVar = this.d;
                            if (nVar == null) {
                                this.f144018c = false;
                                return;
                            }
                            this.d = null;
                        } finally {
                        }
                    }
                } while (!nVar.a(this.f144016a));
            } finally {
            }
        }
    }
}
